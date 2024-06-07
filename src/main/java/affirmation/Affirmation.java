package affirmation;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode

public abstract class Affirmation {
    public String description;
    @Getter
    public Boolean valeur;

    public Affirmation(String description, Boolean valeur) {
        this.description = description;
        this.valeur = valeur;
    }

    @Override
    public String toString() {
        return description + ": " + (valeur == null ? "indeterminés" : valeur);
    }
}

