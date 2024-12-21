package LLD_Design_Pattern.Abstract_Factory.components.Menu;

public class IosMenu implements Menu {
    @Override
    public void changeMenu() {
        System.out.println("Changing IOS Menu");
    }
}
