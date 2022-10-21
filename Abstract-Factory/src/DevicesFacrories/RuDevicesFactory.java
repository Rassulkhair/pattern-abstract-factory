package DevicesFacrories;

import Devices.Keyboard;
import Devices.Mouse;
import Devices.RuDevices.RuKeyboard;
import Devices.RuDevices.RuMouse;
import Devices.RuDevices.RuTouchpad;
import Devices.TouchPad;

public class RuDevicesFactory implements DeviceFactory {
    @Override
    public Mouse getMouse() {
        return new RuMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new RuKeyboard();
    }

    @Override
    public TouchPad getTouchPad() {
        return new RuTouchpad();
    }
}
