package fullOOP.model.devices;

import fullOOP.model.devices.Gadget;

import java.security.PublicKey;

public class Notebook extends Gadget {
    private String mouse;
    private String keyboard;

    public Notebook(String model, String version, int year, int price) {
        super(model, version, year, price);
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }
}
