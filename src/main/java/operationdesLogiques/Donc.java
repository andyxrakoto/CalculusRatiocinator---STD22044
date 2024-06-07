package operationdesLogiques;

public class Donc extends Operation {

    public Donc(Boolean a, Boolean b) {
        super(a, b);
    }

    @Override
    public String evaluer() {
        if (a == null || b == null) return "vrai";
        return (!a || b) ? "vrai" : "faux";
    }
}

