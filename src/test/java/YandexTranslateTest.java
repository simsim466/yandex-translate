
import gateway.YandexTranslateGateway;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pojo.response.Translate;

import java.util.List;

public class YandexTranslateTest {
    @Test
    @DisplayName("Перевод от Яндекса")
    public void myFirstTranslate() {
        YandexTranslateGateway gateway = new YandexTranslateGateway();
        final List<Translate> translates = gateway.getTranslates(TestData.TEST_MANUSCRIPT);
        Assertions.assertEquals(TestData.CONTROL_PHRASE, translates.get(0).getText());
    }
}
