package LLD_Design_Pattern.Abstract_Factory.components;

public class Flutter {

    public void setTheme() {
        System.out.println("Setting Theme");
    }

    public void setRefreshRate() {
        System.out.println("Setting Refresh rate");
    }

    public UIFactory createUIFactory(SupportedPlatform platform) {

//        if (platform.equals("ANDROID")) {
//            return new AndroidFactory();
//        } else if (platform.equals("IOS")) {
//            return new IOSFactory();
//        } else if (platform.equals("MAC")) {
//            return new MacFactoru();
//        }
//        return null;

//        With help of use enum we can make only mandatory entry t enter
//        if (platform.equals(platform.ANDROID)) {
//            return new AndroidFactory();
//        } else if (platform.equals(platform.IOS)) {
//            return new IOSFactory();
//        } else if (platform.equals(platform.MAC)) {
//            return new MacFactoru();
//        }
//        return null;


        //OCP getting violated
//        To solve OCP here, we can move the code to create UIFactory to some other interface.
        return UIFactoryCreator.createFactory(platform);
    }
}