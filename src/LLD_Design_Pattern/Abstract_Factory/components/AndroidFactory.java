package LLD_Design_Pattern.Abstract_Factory.components;

import LLD_Design_Pattern.Abstract_Factory.components.Button.AndroidButton;
import LLD_Design_Pattern.Abstract_Factory.components.Button.Button;
import LLD_Design_Pattern.Abstract_Factory.components.Menu.AndroidMenu;
import LLD_Design_Pattern.Abstract_Factory.components.Menu.Menu;


public class AndroidFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}