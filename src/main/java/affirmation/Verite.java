package affirmation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Verite extends Affirmation {
    public Verite(String description) {
        super(description, true);
    }
}

