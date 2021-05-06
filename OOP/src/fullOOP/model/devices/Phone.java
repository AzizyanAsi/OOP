package fullOOP.model.devices;

import fullOOP.model.devices.Gadget;

public class Phone extends Gadget {
    private boolean isSmartphone;

    public Phone(String model, String version, int year, int price) {
        super(model, version, year, price);
    }


    public void full_name() {
        System.out.println(model + " " + version + " " + isSmartphone + " " + year);
    }


    @Override
    public void setYear(int arg) {
        if (arg > 2000)
            this.year = arg;
        else
            System.out.println("havn't version");
    }

    public boolean isSmartphone(boolean isSmartphone) {
        return isSmartphone;
    }

    public void setSmartphone(boolean smartphone) {
        isSmartphone = smartphone;
    }
}
