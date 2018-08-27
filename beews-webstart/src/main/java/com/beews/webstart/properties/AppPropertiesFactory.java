package com.beews.webstart.properties;

import org.apache.logging.log4j.Logger;

import java.io.FileReader;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;

public class AppPropertiesFactory {

	private static final Logger LOG = LogManager.getLogger(AppPropertiesFactory.class);

	private static AppProperties appProperties;

	public static AppProperties getInstance() {

		try {
			
			var reader = new MavenXpp3Reader();
			appProperties = appProperties == null ? new AppProperties(reader.read(new FileReader("pom.xml")))
					: appProperties;
			LOG.info("Propriedades da Aplicacao: " + appProperties);
		} catch (IOException | XmlPullParserException e) {
			LOG.error("Não foi possivel carregar o pom\n" + e.getMessage());
		}
		
		return appProperties;

	}

}
