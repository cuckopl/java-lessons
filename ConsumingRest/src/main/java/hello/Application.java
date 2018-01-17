package hello;

import hello.domain.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

public class Application {

    private static final Logger loger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        loger.info(quote.toString());
    }
}
