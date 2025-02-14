package ch.tocco.soaptest;

import ch.tocco.soaptest.soap.B2BService;
import ch.tocco.soaptest.soap.B2BService_Service;
import jakarta.xml.ws.BindingProvider;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest
class SoapTest {

    @Test
    void testPing() {
        try {
            URI uri = URI.create("https://ebill-ki.postfinance.ch/B2BService/B2BService.svc?singleWsdl");
            B2BService port = new B2BService_Service(uri.toURL(), B2BService_Service.SERVICE).getUserNamePassword();


            Map<String, Object> requestContext = ((BindingProvider) port).getRequestContext();
            requestContext.put("security.username", "username");
            requestContext.put("security.password", "password");

            String result = port.executePing("41101000001294361", "", null, null);

            assertEquals("41101000001294361", result);
        } catch (Exception e) {
            fail("An exception occured: %s".formatted(e.getMessage()), e);
        }
    }
}
