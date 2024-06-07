package operationdesLogiques;

public abstract class Operation {
    public Boolean a;
    public Boolean b;

    public Operation(Boolean a, Boolean b) {
        this.a = a;
        this.b = b;
    }

    public abstract String evaluer();
}
