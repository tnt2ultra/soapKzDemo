package ru.demo.esf;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RestTemplateSoapClientTest {
	static final Logger log = LoggerFactory.getLogger(RestTemplateSoapClientTest.class);

	@Test
	public void testCallSoapService() throws Exception {
		log.info("testCallSoapService started");
		Assert.assertNotNull(RestTemplateSoapClient.callRestTemplateSoapService(RestTemplateSoapClient.xml));
	}
}
