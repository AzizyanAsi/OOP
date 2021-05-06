package fullOOP.comparators;

import fullOOP.model.devices.Gadget;

import java.util.Comparator;

public class YearComparator implements Comparator<Gadget> {
    @Override
    public int compare(Gadget o1, Gadget o2) {
        return o1.getYear()-o2.getYear();
    }
}
