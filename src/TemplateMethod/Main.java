package TemplateMethod;

public class Main {
    public static void main(String[] args) {
        WebSite webSite = new MainPage();
        WebSite anotherPage = new AnotherPage();

        webSite.showPage();
        System.out.println("-------------------------");
        anotherPage.showPage();
    }
}
