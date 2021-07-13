package pojo.response;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Translate {
    private final String text;
    private final String detectedLanguageCode;
}
