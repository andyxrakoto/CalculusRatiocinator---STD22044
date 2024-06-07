package affirmation;

import lombok.Setter;

@Setter
public class Implication extends Affirmation {
    public Implication(String description) {
        super(description, null);
    }

}

