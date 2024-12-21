package LLD_Design_Pattern.Abstract_Factory.components;


import LLD_Design_Pattern.Abstract_Factory.components.Button.Button;
import LLD_Design_Pattern.Abstract_Factory.components.Menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.createUIFactory(SupportedPlatform.MAC);

        Button button = uiFactory.createButton();
        button.changeSize();

        Menu menu = uiFactory.createMenu();
        menu.changeMenu();
    }
}