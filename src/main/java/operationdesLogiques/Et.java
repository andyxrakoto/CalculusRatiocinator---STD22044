package operationdesLogiques;

public class Et extends Operation {

    public Et(Boolean a, Boolean b) {
        super(a, b);
    }

    @Override
    public String evaluer() {
        if (a == null || b == null) return "faux";
        return (a && b) ? "vrai" : "faux";
    }
}

