package gateway;

import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import pojo.request.Manuscript;
import pojo.response.Interpretation;
import pojo.response.Translate;
import java.util.List;

import static gateway.GatewayUtil.*;

@Slf4j
public class YandexTranslateGateway {
    @SneakyThrows
    public List<Translate> getTranslates(Manuscript manuscript) {
        HttpResponse<String> response = Unirest.post(URL)
                .header("Content-Type", "application/json")
                .header("Authorization", "Api-Key " + API_KEY)
                .body(new Gson().toJson(manuscript))
                .asString();

        return responseToTranslatesList(response);
    }

    private List<Translate> responseToTranslatesList(HttpResponse<String> response) {
        String strResponse = response.getBody();
        log.info("response: {}", strResponse);
        return new Gson()
                .fromJson(strResponse, Interpretation.class)
                .getTranslations();
    }
}
