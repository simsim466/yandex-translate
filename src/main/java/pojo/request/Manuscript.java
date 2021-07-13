package pojo.request;

import com.google.gson.annotations.SerializedName;
import lombok.*;
import pojo.request.glossary.Glossary;

import java.util.Set;

@AllArgsConstructor
@Getter
@Builder
public class Manuscript {
    private final String sourceLanguageCode;
    private final String targetLanguageCode;
    private final Set<String> texts;
    @SerializedName("glossaryConfig")
    private final Glossary glossary;
}