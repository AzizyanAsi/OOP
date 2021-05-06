package fullOOP.model.devices;

public abstract class Gadget implements Bluetooth {
    protected String model;
    protected String version;
    protected int year;
    protected int price;

    @Override
    public boolean hasBluetooth() {
        return true;
    }

    public Gadget(String model, String version, int year, int price) {
        this.model = model;
        this.version = version;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return new StringBuilder("{").append(model)
                .append(",")
                .append(version)
                .append(",")
                .append(year)
                .append(",")
                .append(price)
                .append("}").toString();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
