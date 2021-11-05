package Interpretator;

public class DataExpr implements Expession{
    private String data;

    public DataExpr(String data) {
        this.data = data;
    }

    @Override
    public boolean expresion(String context) {
        if (context.contains(data)){
        return true;
        }
        return false;
    }
}
