package com.extenal.helper;

import org.apache.log4j.Logger;

import com.external.api.ExternalApi;

public class ExternalAccess {

	private static Logger logger = Logger.getLogger(ExternalAccess.class);

	public static Object responseSender(int accessNumber) {

		logger.debug(">> Going to Response Sender AccessNumber[" + accessNumber + "]");

		switch (accessNumber) {
		case 1:
			return ExternalApi.getBiblioVoxDailyPack();
		case 2:
			return ExternalApi.getBiblioVoxDailyWeeklyPack();
		default:
			return new ResponseMessage("ACCESS CODE NOT FOUND", false);
		}

	}
}
