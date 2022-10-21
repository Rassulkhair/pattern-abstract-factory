package DevicesFacrories;

import Devices.EnDevices.EnKeyboard;
import Devices.EnDevices.EnMouse;
import Devices.EnDevices.EnTouchpad;
import Devices.Keyboard;
import Devices.Mouse;
import Devices.TouchPad;

public class EnDevicesFactory implements DeviceFactory {

    @Override
    public Mouse getMouse() {
        return new EnMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new EnKeyboard();
    }

    @Override
    public TouchPad getTouchPad() {
        return new EnTouchpad();
    }
}
