import pojo.request.Manuscript;
import pojo.request.glossary.Glossary;
import pojo.request.glossary.GlossaryData;
import pojo.request.glossary.GlossaryPair;
import pojo.response.Translate;

import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class TestData {
    private static final Locale RUS_LOCALE_LANG = new Locale("ru");
    private static final String TEST_PHRASE = "Hello World!";
    protected static final String CONTROL_PHRASE = "Всем Привет!";

    private static final GlossaryPair glossaryPair = GlossaryPair.builder()
            .sourceText("hello world!")
            .translatedText("всем привет!")
            .build();

    private static final GlossaryData glossaryData = new GlossaryData(Collections.singleton(glossaryPair));

    private static final Glossary glossary = new Glossary(glossaryData);

    protected static final Manuscript TEST_MANUSCRIPT = Manuscript.builder()
            .glossary(glossary)
            .sourceLanguageCode(Locale.ENGLISH.getLanguage())
            .targetLanguageCode(RUS_LOCALE_LANG.getLanguage())
            .texts(Collections.singleton(TEST_PHRASE))
            .build();
}
