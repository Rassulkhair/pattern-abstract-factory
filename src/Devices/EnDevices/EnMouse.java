package Devices.EnDevices;

import Devices.Mouse;

public class EnMouse implements Mouse {

    @Override
    public void click() {
        System.out.println("Mouse click");
    }

    @Override
    public void dbclick() {
        System.out.println("Double mouse click");
    }

    @Override
    public void scroll(int direction) {
        if (direction > 0) {
            System.out.println("Scroll up");
        } else if (direction < 0) {
            System.out.println("Scroll Down");
        } else {
            System.out.println("Don't scrolling");
        }
    }
}
