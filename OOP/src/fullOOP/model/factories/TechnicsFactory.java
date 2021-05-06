package fullOOP.model.factories;

import fullOOP.model.devices.*;

import java.util.ArrayList;

public class TechnicsFactory extends Factory {
    private ArrayList<Notebook> notebook;
    private ArrayList<SmartWatch> smartwatch;
    private ArrayList<Tablet> tablet;
    private ArrayList<Phone> phone;
    private ArrayList<Headphone> headphone;


    public TechnicsFactory(String factoryName, String factoryType, int startedYear) {
        super(factoryName, "Technics", startedYear);
    }

    public ArrayList<Notebook> getNotebook() {
        return notebook;
    }

    public void setNotebook(ArrayList<Notebook> notebook) {
        this.notebook = notebook;
    }

    public ArrayList<SmartWatch> getSmartwatch() {
        return smartwatch;
    }

    public void setSmartwatch(ArrayList<SmartWatch> smartwatch) {
        this.smartwatch = smartwatch;
    }

    public ArrayList<Tablet> getTablet() {
        return tablet;
    }

    public void setTablet(ArrayList<Tablet> tablet) {
        this.tablet = tablet;
    }

    public ArrayList<Headphone> getHeadphone() {
        return headphone;
    }

    public void setHeadphone(ArrayList<Headphone> headphone) {
        this.headphone = headphone;
    }

    public ArrayList getPhone() {
        return phone;
    }

    public void setPhone(ArrayList phone) {
        this.phone = phone;
    }


    ///////////

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void setLocation(String location) {
        this.location = "arm";
    }
}
