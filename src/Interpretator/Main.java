package Interpretator;

public class Main {
    public static void main(String[] args) {
        Expession context = PotentialCustomer();
        Expession context2 = BadCustomer();

        System.out.println("It is a potential customer: " + context.expresion("Our client but poor"));
        System.out.println("It is a potential customer: " + context2.expresion("Have money and rich"));

    }
    public static Expession PotentialCustomer(){
        Expession money = new DataExpr("Have money");
        Expession client = new DataExpr("Our client");
        return new OrExpr(money, client);
    }
    public static Expession BadCustomer(){
        Expession money = new DataExpr("Have money");
        Expession rich = new DataExpr("rich");
        return new AndExpr(money, rich);
    }
}
