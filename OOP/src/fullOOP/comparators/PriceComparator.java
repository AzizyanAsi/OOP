package fullOOP.comparators;

import fullOOP.model.devices.Gadget;

import java.util.Comparator;

public class PriceComparator implements Comparator<Gadget> {

    @Override
    public int compare(Gadget o1, Gadget o2) {
        return o1.getPrice()-o2.getPrice();
    }
}
