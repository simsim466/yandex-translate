package pojo.request.glossary;

import lombok.*;

@AllArgsConstructor
@Getter
@Builder
public class GlossaryPair {
    private final String sourceText;
    private final String translatedText;
}
