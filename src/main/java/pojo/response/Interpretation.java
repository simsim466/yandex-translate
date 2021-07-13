package pojo.response;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class Interpretation {
    private final List<Translate> translations;
}
