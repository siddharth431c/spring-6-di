package guru.springframework.spring6di.service.i18n;

import guru.springframework.spring6di.service.GreetingsService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nservice")
public class SpanishGreetingService implements GreetingsService {
    @Override
    public String sayGreeting() {
        return "Hello from spanish greeting!";
    }
}
