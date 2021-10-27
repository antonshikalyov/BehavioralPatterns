package Memento;

public class Main {
    public static void main(String[] args) {
        Project project = new Project();

        project.setVersion("1.0");
        System.out.println(project);
        project.setVersion("1.1 ideal");
        System.out.println(project);
        project.Save();
        project.setVersion("1.2");
        System.out.println(project);
        project.setVersion("1.3");
        System.out.println(project);
        project.setVersion("1.4");
        System.out.println(project);
        project.load();
        System.out.println(project);
    }
}
