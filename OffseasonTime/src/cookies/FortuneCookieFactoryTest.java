    package cookies;

    import org.junit.Before;
    import org.junit.jupiter.api.Assertions;
    import org.junit.jupiter.api.BeforeEach;
    import org.junit.jupiter.api.Test;

    import java.util.Collections;

    public class FortuneCookieFactoryTest {

        private FortuneCookieFactory factory;
        @BeforeEach
        public void create(){
            factory = new FortuneCookieFactory(
                    new FortuneConfig(true), Collections.singletonList("postive"),
                    Collections.singletonList("negative")
            );
        }

        @Test
        public void shouldIncrementCountByOneAfterOneCookieBaked(){
            int before = factory.getCookiesBaked();
            factory.bakeFortuneCookie();
            Assertions.assertEquals(before+1,factory.getCookiesBaked());
        }

        @Test
        public void shouldIncrementCountByTwoAfterTwoCookiesBaked(){
            int before = factory.getCookiesBaked();
            factory.bakeFortuneCookie();
            factory.bakeFortuneCookie();
            Assertions.assertEquals(before+2,factory.getCookiesBaked());
        }

        @Test
        public void shouldSetCounterToZeroAfterResetCookieCreatedCall(){
            int before = factory.getCookiesBaked();
            factory.bakeFortuneCookie();
            factory.resetCookiesCreated();
            Assertions.assertEquals(0,factory.getCookiesBaked());
        }
    }
