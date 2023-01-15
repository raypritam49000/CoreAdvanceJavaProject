package com.extenal.helper;

import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import com.extenal.model.ResponseData;

public class Assember {
	
	private static Logger logger = Logger.getLogger(Assember.class);

	public static ResponseData JsonToModelConverter(String res) {
		
	    logger.debug(">>>>> Going to JsonToModelConverter res["+res+"]");
		
		Object obj = JSONValue.parse(res);
		JSONObject jsonObject = (JSONObject) obj;
		JSONObject data = (JSONObject) jsonObject.get("data");
		Boolean success = (Boolean) jsonObject.get("success");
		String message = (String) jsonObject.get("message");
		
		ResponseData responseData = new ResponseData();
		responseData.setActive((Long) data.get("active"));
		responseData.setCode((String) data.get("code"));
		responseData.setDateEnd((String) data.get("dateend"));
		responseData.setDateStart((String) data.get("datestart"));
		responseData.setId((String) data.get("id"));
		responseData.setPassword((String) data.get("password"));
		responseData.setPlan((String) data.get("plan"));
		responseData.setMessage(message);
		responseData.setSuccess(success);
		
		return responseData;
	}

}
