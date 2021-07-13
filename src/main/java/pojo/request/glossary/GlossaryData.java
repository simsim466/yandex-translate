package pojo.request.glossary;

import lombok.*;

import java.util.Set;

@AllArgsConstructor
@Getter
public class GlossaryData {
    private final Set<GlossaryPair> glossaryPairs;
}
