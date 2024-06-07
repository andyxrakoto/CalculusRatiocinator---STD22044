package affirmation;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Verite extends Affirmation {
    public Verite(String description) {
        super(description, true);
    }
}

