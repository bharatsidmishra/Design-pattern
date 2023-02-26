package factory.design;

import factory.design.os.OS;
import factory.design.os.OperatingSystemFactory;

public class FactoryMain {
    public static void main(String args[]) {
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("open");
        OS objIos = osf.getInstance("closed");
        obj.spec();
        objIos.spec();
//        osf.getInstance("closed");
//        osf.getInstance("somee");
    }
}
