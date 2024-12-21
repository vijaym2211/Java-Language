package LLD_Design_Pattern.Abstract_Factory.components;

import LLD_Design_Pattern.Abstract_Factory.components.Button.Button;
import LLD_Design_Pattern.Abstract_Factory.components.Menu.Menu;


public interface UIFactory {
    //It should only contain the factory methods

    Button createButton();
    Menu createMenu();
}