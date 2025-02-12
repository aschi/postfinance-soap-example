package ch.tocco.soaptest;

import ch.tocco.soaptest.soap.B2BService;
import ch.tocco.soaptest.soap.B2BService_Service;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ResourceLoader;

import java.net.URI;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SoapTest {

	@Autowired
	private ResourceLoader resourceLoader;

	@Test
	void testPing() {
		try {
			assertTrue(resourceLoader.getResource("classpath:B2BService.xml").exists());
			assertTrue(resourceLoader.getResource("classpath:wsit-client.xml").exists());

			URI uri = URI.create("https://ebill-ki.postfinance.ch/B2BService/B2BService.svc?singleWsdl");
			B2BService port = new B2BService_Service(uri.toURL()).getUserNamePassword();

			String result = port.executePing("41101000001294361", null, null, null);

			assertEquals("41101000001294361", result);
		} catch (Exception e) {
			fail("An exception occured: %s".formatted(e.getMessage()), e);
		}
	}
}
