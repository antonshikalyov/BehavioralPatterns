package TemplateMethod;

public abstract class WebSite {
    public void showPage(){
        System.out.println("Header!");
        System.out.println("Footer!");
        showContent();
    }

    public abstract void showContent();
}
