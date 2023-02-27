package cookies;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static java.util.Collections.singletonList;

public class FortuneCookieControllerTest {

    private static FortuneCookieController goodFactoryController;
    private static FortuneCookieController badFactoryController;

    @BeforeAll
    static void beforeAll() {
        goodFactoryController = new FortuneCookieController(new FortuneCookieFactory(
                new FortuneConfig(true),
                singletonList("positive"),
                singletonList("negative")
        ));
        badFactoryController = new FortuneCookieController(new FortuneCookieFactory(
                new FortuneConfig(false),
                singletonList("positive"),
                singletonList("negative")
        ));
    }

    @Test
    public void shouldReturnPositiveFortune() {
        String waiting = "positive";
        String current = goodFactoryController.tellFortune().getFortuneText();
        Assertions.assertEquals(waiting, current);
    }

    @Test
    public void shouldReturnNegativeFortune() {
        String waiting = "negative";
        String current = badFactoryController.tellFortune().getFortuneText();
        Assertions.assertEquals(waiting, current);
    }
}
