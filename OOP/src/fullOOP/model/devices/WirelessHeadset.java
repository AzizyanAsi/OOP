package fullOOP.model.devices;

public class WirelessHeadset extends Headphone{
    private boolean chargingCase;

    public WirelessHeadset(String model, String version, int year, int price) {
        super(model, version, year, price);
    }

    public boolean isChargingCase() {
        return chargingCase;
    }

    public void setChargingCase(boolean chargingCase) {
        this.chargingCase = chargingCase;
    }
}
