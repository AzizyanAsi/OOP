package fullOOP.model.apple;

import fullOOP.model.factories.TechnicsFactory;

import java.util.ArrayList;

public class AppleFactory extends TechnicsFactory {
    private ArrayList<MacBook> macBook;
    private ArrayList<AirPods> airPod;
    private ArrayList<Ipad> ipad;
    protected ArrayList<IPhone> iphone;
    private ArrayList<Iwatch> iwatch;



    public AppleFactory(String factoryName, String factoryType, int startedYear) {
        super(factoryName, "Apple", startedYear);
        this.iphone= new ArrayList<IPhone>();
        this.ipad= new ArrayList<Ipad>();
        this.iwatch= new ArrayList<>();
        this.airPod= new ArrayList<>();
        this.macBook= new ArrayList<>();


    }

    public ArrayList<MacBook> getMacbook() {
        return macBook;
    }

    public void setMacbook(ArrayList<MacBook> macbook) {
        this.macBook = macbook;
    }

    public ArrayList<AirPods> getAirpod() {
        return airPod;
    }

    public void setAirpod(ArrayList<AirPods> airpod) {
        this.airPod = airpod;
    }

    public ArrayList<Ipad> getIpad() {
        return ipad;
    }

    public void setIpad(ArrayList<Ipad> ipad) {
        this.ipad = ipad;
    }

    public ArrayList<IPhone> getIphone() {
        return iphone;
    }

    public void setIphone(ArrayList<IPhone> iphone) {
        this.iphone = iphone;
    }

    public ArrayList<Iwatch> getIwatch() {
        return iwatch;
    }

    public void setIwatch(ArrayList<Iwatch> iwatch) {
        this.iwatch = iwatch;
    }
}
