package fullOOP.model.samsung;

import fullOOP.model.apple.IPhone;
import fullOOP.model.apple.Ipad;
import fullOOP.model.devices.*;
import fullOOP.model.factories.TechnicsFactory;

import java.util.ArrayList;

public class SamsungFactory extends TechnicsFactory {
    private ArrayList<GalaxyBook> galaxyBook;
    private ArrayList<GalaxyBuds> galaxyBud;
    private ArrayList<GalaxyTab> galaxyTab;
    private ArrayList<Galaxy> galaxy;
    private ArrayList<GalaxyWatch> galaxyWatch;

    public SamsungFactory(String factoryName, String factoryType, int startedYear) {
        super(factoryName, "Samsung", startedYear);
        this.galaxy = new ArrayList<Galaxy>();
        this.galaxyBook = new ArrayList<GalaxyBook>();
        this.galaxyBud = new ArrayList<>();
        this.galaxyTab = new ArrayList<>();
        this.galaxyWatch = new ArrayList<>();

    }

    public ArrayList<GalaxyBook> getGalaxyBook() {
        return galaxyBook;
    }

    public void setGalaxyBook(ArrayList<GalaxyBook> galaxyBook) {
        this.galaxyBook = galaxyBook;
    }

    public ArrayList<GalaxyBuds> getGalaxyBud() {
        return galaxyBud;
    }

    public void setGalaxyBud(ArrayList<GalaxyBuds> galaxyBud) {
        this.galaxyBud = galaxyBud;
    }

    public ArrayList<GalaxyTab> getGalaxyTab() {
        return galaxyTab;
    }

    public void setGalaxyTab(ArrayList<GalaxyTab> galaxyTab) {
        this.galaxyTab = galaxyTab;
    }

    public ArrayList<Galaxy> getGalaxy() {
        return galaxy;
    }

    public void setGalaxy(ArrayList<Galaxy> galaxy) {
        this.galaxy = galaxy;
    }

    public ArrayList<GalaxyWatch> getGalaxyWatch() {
        return galaxyWatch;
    }

    public void setGalaxyWatch(ArrayList<GalaxyWatch> galaxyWatch) {
        this.galaxyWatch = galaxyWatch;
    }
}
