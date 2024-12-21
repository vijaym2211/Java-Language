package LLD_Design_Pattern.Abstract_Factory.components;

import LLD_Design_Pattern.Abstract_Factory.components.Button.Button;
import LLD_Design_Pattern.Abstract_Factory.components.Button.IosButton;
import LLD_Design_Pattern.Abstract_Factory.components.Menu.IosMenu;
import LLD_Design_Pattern.Abstract_Factory.components.Menu.Menu;


public class IOSFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }
}