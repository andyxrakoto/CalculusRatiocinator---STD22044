package operationdesLogiques;

public class Ou extends Operation {

    public Ou(Boolean a, Boolean b) {
        super(a, b);
    }

    @Override
    public String evaluer() {
        if (a == null && b == null) return "faux";
        if (a == null) return b ? "vrai" : "faux";
        if (b == null) return a ? "vrai" : "faux";
        return (a || b) ? "vrai" : "faux";
    }
}

