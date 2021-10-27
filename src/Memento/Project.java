package Memento;


public class Project {
    private String version;
    Save save = new Save();

    public void setVersion(String version) {
        this.version = version;
    }

    public void Save(){
        save.setSave(version);
    }

   public String load(){
        version = save.getVersion();
        return version;
   }

    @Override
    public String toString() {
        return "Project{" +
                "version='" + version + '\'' +
                '}';
    }
}
