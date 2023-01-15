package com.extenal.hits;

import com.properties.reader.PropertiesValueReader;

public interface ExternalPackHits {
	public static final String DAILY_PACK_BIBLIO_BOX = PropertiesValueReader.getPropertiesValue("DAILY_PACK_BIBLIO_BOX");
	public static final String WEAKELY_PACK_BIBLIO_BOX = PropertiesValueReader.getPropertiesValue("WEAKELY_PACK_BIBLIO_BOX");
}
