package LLD_Design_Pattern.Abstract_Factory.components.Menu;

public class AndroidMenu implements Menu {
    @Override
    public void changeMenu() {
        System.out.println("Changing Android Menu");
    }
}