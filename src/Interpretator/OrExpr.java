package Interpretator;

public class OrExpr implements Expession{
    private Expession expession1;
    private Expession expession2;

    public OrExpr(Expession expession1, Expession expession2) {
        this.expession1 = expession1;
        this.expession2 = expession2;
    }

    @Override
    public boolean expresion(String context) {
        return expession1.expresion(context) || expession2.expresion(context);
    }
}
