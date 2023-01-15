package com.external.api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.log4j.Logger;

import com.extenal.helper.Assember;
import com.extenal.helper.ResponseMessage;
import com.extenal.hits.ExternalPackHits;
import com.extenal.model.ResponseData;

public class ExternalApi {

	private static Logger logger = Logger.getLogger(ExternalApi.class);

	// BIBLIOVOX
	public static Object getBiblioVoxDailyPack() {
		try (CloseableHttpClient httpClient = createAcceptSelfSignedCertificateClient()) {

			HttpGet getRequest = new HttpGet(ExternalPackHits.DAILY_PACK_BIBLIO_BOX);
			getRequest.addHeader("accept", "application/json");

			HttpResponse response = httpClient.execute(getRequest);

			if (response.getStatusLine().getStatusCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));

			String output = "";
			String res = "";
			while ((output = br.readLine()) != null) {
				res = res + output;
			}

			ResponseData responseData = Assember.JsonToModelConverter(res);

			logger.debug(">> Recieve to BiblioVoxDailyPack ResponseData[" + responseData + "]");

			return responseData;

		} catch (Exception e) {

			logger.error(">> Recieve BiblioVoxDailyPack Meessage[" + e.getMessage() + "] Success [" + false + "]");
			return new ResponseMessage(e.getMessage(), false);
		}
	}

	public static Object getBiblioVoxDailyWeeklyPack() {
		try (CloseableHttpClient httpClient = createAcceptSelfSignedCertificateClient()) {

			HttpGet getRequest = new HttpGet(ExternalPackHits.WEAKELY_PACK_BIBLIO_BOX);
			getRequest.addHeader("accept", "application/json");

			HttpResponse response = httpClient.execute(getRequest);

			if (response.getStatusLine().getStatusCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));

			String output = "";
			String res = "";
			while ((output = br.readLine()) != null) {
				res = res + output;
			}

			ResponseData responseData = Assember.JsonToModelConverter(res);

			logger.debug(">> Receive to BiblioVoxDailyPack ResponseData[" + responseData + "]");

			return responseData;

		} catch (Exception e) {

			logger.error(">> Recieve to BiblioVoxDailyPack Meessage[" + e.getMessage() + "] Success [" + false + "]");
			return new ResponseMessage(e.getMessage(), false);
		}
	}

	private static CloseableHttpClient createAcceptSelfSignedCertificateClient()
			throws KeyManagementException, NoSuchAlgorithmException, KeyStoreException {

		SSLContext sslContext = SSLContextBuilder.create().loadTrustMaterial(new TrustSelfSignedStrategy()).build();
		HostnameVerifier allowAllHosts = new NoopHostnameVerifier();
		SSLConnectionSocketFactory connectionFactory = new SSLConnectionSocketFactory(sslContext, allowAllHosts);
		return HttpClients.custom().setSSLSocketFactory(connectionFactory).build();
	}
	
}
