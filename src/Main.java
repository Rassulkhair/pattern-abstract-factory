import Devices.Keyboard;
import Devices.Mouse;
import Devices.TouchPad;
import DevicesFacrories.DeviceFactory;
import DevicesFacrories.EnDevicesFactory;
import DevicesFacrories.RuDevicesFactory;

public class Main {
    public static void main(String[] args) {
        DeviceFactory factory = getFactoryByCountryCode("EN");
        Mouse m = factory.getMouse();
        Keyboard k = factory.getKeyboard();
        TouchPad t = factory.getTouchPad();

        m.click();
        m.dbclick();
        System.out.println();

        k.print();
        k.println();
        System.out.println();

        t.track(10,35);
    }

    private static DeviceFactory getFactoryByCountryCode(String lang){
        return switch (lang) {
            case "RU" -> new RuDevicesFactory();
            case "EN" -> new EnDevicesFactory();
            default -> throw new RuntimeException("Unsupported Country Code: " + lang);
        };
    }
}





