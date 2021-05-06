package fullOOP.model.factories;

public abstract class Factory {
    private String factoryName;
    private String factoryType;
    private int workersCount;
    private int startedYear;
    protected String location;
    private String product;

    public Factory(String factoryName, String factoryType, int startedYear) {
        this.factoryName = factoryName;
        this.factoryType = factoryType;
        this.startedYear = startedYear;
    }


    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public int getWorkersCount() {
        return workersCount;
    }

    public void setWorkersCount(int workersCount) {
        this.workersCount = workersCount;
    }

    public int getStartedYear() {
        return startedYear;
    }

    public void setStartedYear(int startedYear) {
        this.startedYear = startedYear;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
