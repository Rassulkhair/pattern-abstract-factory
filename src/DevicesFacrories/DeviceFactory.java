package DevicesFacrories;

import Devices.Keyboard;
import Devices.Mouse;
import Devices.TouchPad;

public interface DeviceFactory {
   Mouse getMouse();
   Keyboard getKeyboard();
   TouchPad getTouchPad();
}
