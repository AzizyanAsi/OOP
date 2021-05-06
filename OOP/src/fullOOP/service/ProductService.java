package fullOOP.service;

import fullOOP.comparators.PriceComparator;
import fullOOP.comparators.YearComparator;
import fullOOP.model.apple.*;
import fullOOP.model.devices.*;
import fullOOP.model.samsung.*;

import java.util.ArrayList;
import java.util.Collections;

public class ProductService {

    public static ArrayList<Gadget> getAllGadgetsApple(AppleFactory appleFactory) {
        ArrayList<Gadget> gadgets = new ArrayList<>();
        gadgets.addAll(appleFactory.getIphone());
        gadgets.addAll(appleFactory.getIpad());
        gadgets.addAll(appleFactory.getAirpod());
        gadgets.addAll(appleFactory.getMacbook());
        gadgets.addAll(appleFactory.getIwatch());

        return gadgets;
    }


    public static ArrayList<Gadget> sortByYearApple(AppleFactory appleFactory) {
        ArrayList<Gadget> allProdApple = new ArrayList<>();
        allProdApple.addAll(getAllGadgetsApple(appleFactory));


        Collections.sort(allProdApple, new YearComparator().reversed());

        return allProdApple;
    }

    public static ArrayList<Gadget> sortByPriceApple(AppleFactory appleFactory) {
        ArrayList<Gadget> allProdApple = new ArrayList<>();
        allProdApple.addAll(getAllGadgetsApple(appleFactory));

        Collections.sort(allProdApple, new PriceComparator());

        return allProdApple;
    }

    public static ArrayList<Gadget> sortByPriceAppleReverse(AppleFactory appleFactory) {
        ArrayList<Gadget> allProdApple = new ArrayList<>();
        allProdApple.addAll(getAllGadgetsApple(appleFactory));

        Collections.sort(allProdApple, new PriceComparator().reversed());

        return allProdApple;
    }

    public static ArrayList<Gadget> newAppleProducts(AppleFactory appleFactory) {
        ArrayList<Gadget> gadgets = new ArrayList<>();

        for (Gadget x : getAllGadgetsApple(appleFactory)) {
            if (x.getYear() > 2020)
                gadgets.add(x);
        }
        return gadgets;
    }


    public static ArrayList<IPhone> sortByYearIphone(AppleFactory appleFactory) {
        ArrayList<IPhone> allIphone = new ArrayList<>();
        allIphone.addAll(appleFactory.getIphone());

        Collections.sort(allIphone, new YearComparator().reversed());
        return allIphone;
    }

    public static ArrayList<IPhone> sortByPriceIphone(AppleFactory appleFactory) {
        ArrayList<IPhone> allIphone = new ArrayList<>();
        allIphone.addAll(appleFactory.getIphone());

        Collections.sort(allIphone, new PriceComparator());
        return allIphone;
    }

    public static ArrayList<IPhone> sortByPriceReverseIphone(AppleFactory appleFactory) {
        ArrayList<IPhone> allIphone = new ArrayList<>();
        allIphone.addAll(appleFactory.getIphone());

        Collections.sort(allIphone, new PriceComparator().reversed());
        return allIphone;
    }

    public static ArrayList<Ipad> sortByYearIPad(AppleFactory appleFactory) {
        ArrayList<Ipad> allIpad = new ArrayList<>();
        allIpad.addAll(appleFactory.getIpad());

        Collections.sort(allIpad, new YearComparator().reversed());
        return allIpad;
    }

    public static ArrayList<Ipad> sortByPriceIPad(AppleFactory appleFactory) {
        ArrayList<Ipad> allIpad = new ArrayList<>();
        allIpad.addAll(appleFactory.getIpad());

        Collections.sort(allIpad, new PriceComparator());
        return allIpad;
    }

    public static ArrayList<Ipad> sortByPriceIPadReverse(AppleFactory appleFactory) {
        ArrayList<Ipad> allIpad = new ArrayList<>();
        allIpad.addAll(appleFactory.getIpad());

        Collections.sort(allIpad, new PriceComparator().reversed());
        return allIpad;
    }

    public static ArrayList<AirPods> sortByYearAirPods(AppleFactory appleFactory) {
        ArrayList<AirPods> airPods = new ArrayList<>();
        airPods.addAll(appleFactory.getAirpod());

        Collections.sort(airPods, new YearComparator().reversed());
        return airPods;
    }

    public static ArrayList<AirPods> sortByPriceAirPods(AppleFactory appleFactory) {
        ArrayList<AirPods> airPods = new ArrayList<>();
        airPods.addAll(appleFactory.getAirpod());

        Collections.sort(airPods, new PriceComparator());
        return airPods;
    }

    public static ArrayList<AirPods> sortByPriceAirPodsReverse(AppleFactory appleFactory) {
        ArrayList<AirPods> airPods = new ArrayList<>();
        airPods.addAll(appleFactory.getAirpod());

        Collections.sort(airPods, new PriceComparator().reversed());
        return airPods;
    }

    public static ArrayList<Iwatch> sortByYearIwatch(AppleFactory appleFactory) {
        ArrayList<Iwatch> iwatch = new ArrayList<>();
        iwatch.addAll(appleFactory.getIwatch());

        Collections.sort(iwatch, new YearComparator().reversed());
        return iwatch;
    }


    public static ArrayList<Iwatch> sortByPriceIwatch(AppleFactory appleFactory) {
        ArrayList<Iwatch> iwatch = new ArrayList<>();
        iwatch.addAll(appleFactory.getIwatch());

        Collections.sort(iwatch, new PriceComparator());
        return iwatch;
    }

    public static ArrayList<Iwatch> sortByPriceIwatchReverse(AppleFactory appleFactory) {
        ArrayList<Iwatch> iwatch = new ArrayList<>();
        iwatch.addAll(appleFactory.getIwatch());

        Collections.sort(iwatch, new PriceComparator().reversed());
        return iwatch;
    }

    public static ArrayList<MacBook> sortByYearMacBook(AppleFactory appleFactory) {
        ArrayList<MacBook> macBook = new ArrayList<>();
        macBook.addAll(appleFactory.getMacbook());

        Collections.sort(macBook, new YearComparator().reversed());
        return macBook;
    }

    public static ArrayList<MacBook> sortByPriceMacBook(AppleFactory appleFactory) {
        ArrayList<MacBook> macBook = new ArrayList<>();
        macBook.addAll(appleFactory.getMacbook());

        Collections.sort(macBook, new PriceComparator());
        return macBook;
    }

    public static ArrayList<MacBook> sortByPriceMacBookReverse(AppleFactory appleFactory) {
        ArrayList<MacBook> macBook = new ArrayList<>();
        macBook.addAll(appleFactory.getMacbook());

        Collections.sort(macBook, new PriceComparator().reversed());
        return macBook;
    }


    ////////////////////////samsung//////////////////////////////////////
    public static ArrayList<Gadget> getAllGadgetsSamsung(SamsungFactory samsungFactory) {
        ArrayList<Gadget> gadgets = new ArrayList<>();
        gadgets.addAll(samsungFactory.getGalaxy());
        gadgets.addAll(samsungFactory.getGalaxyTab());
        gadgets.addAll(samsungFactory.getGalaxyBud());
        gadgets.addAll(samsungFactory.getGalaxyBook());
        gadgets.addAll(samsungFactory.getGalaxyWatch());

        return gadgets;
    }

    public static ArrayList<Gadget> sortByYearSamsung(SamsungFactory samsungFactory) {
        ArrayList<Gadget> allProdSamsung = new ArrayList<>();
        allProdSamsung.addAll(getAllGadgetsSamsung(samsungFactory));


        Collections.sort(allProdSamsung, new YearComparator().reversed());

        return allProdSamsung;
    }

    public static ArrayList<Gadget> sortByPriceSamsung(SamsungFactory samsungFactory) {
        ArrayList<Gadget> allProdSamsung = new ArrayList<>();
        allProdSamsung.addAll(getAllGadgetsSamsung(samsungFactory));

        Collections.sort(allProdSamsung, new PriceComparator());

        return allProdSamsung;
    }

    public static ArrayList<Gadget> sortByPriceSamsungReverse(SamsungFactory samsungFactory) {
        ArrayList<Gadget> allProdSamsung = new ArrayList<>();
        allProdSamsung.addAll(getAllGadgetsSamsung(samsungFactory));

        Collections.sort(allProdSamsung, new PriceComparator().reversed());

        return allProdSamsung;
    }

    public static ArrayList<Gadget> newSamsungProducts(SamsungFactory samsungFactory) {
        ArrayList<Gadget> gadgets = new ArrayList<>();

        for (Gadget x : getAllGadgetsSamsung(samsungFactory)) {
            if (x.getYear() > 2020)
                gadgets.add(x);
        }
        return gadgets;
    }

    public static ArrayList<Galaxy> sortByYearGalaxy(SamsungFactory samsungFactory) {
        ArrayList<Galaxy> allGalaxy = new ArrayList<>();
        allGalaxy.addAll(samsungFactory.getGalaxy());

        Collections.sort(allGalaxy, new YearComparator().reversed());
        return allGalaxy;
    }

    public static ArrayList<Galaxy> sortByPriceGalaxy(SamsungFactory samsungFactory) {
        ArrayList<Galaxy> allGalaxy = new ArrayList<>();
        allGalaxy.addAll(samsungFactory.getGalaxy());

        Collections.sort(allGalaxy, new PriceComparator());
        return allGalaxy;
    }

    public static ArrayList<Galaxy> sortByPriceGalaxyReverse(SamsungFactory samsungFactory) {
        ArrayList<Galaxy> allGalaxy = new ArrayList<>();
        allGalaxy.addAll(samsungFactory.getGalaxy());

        Collections.sort(allGalaxy, new PriceComparator().reversed());
        return allGalaxy;
    }


    public static ArrayList<GalaxyBook> sortByYearGalaxyBooks(SamsungFactory samsungFactory) {
        ArrayList<GalaxyBook> allGalaxy = new ArrayList<>();
        allGalaxy.addAll(samsungFactory.getGalaxyBook());

        Collections.sort(allGalaxy, new YearComparator().reversed());
        return allGalaxy;
    }


    public static ArrayList<GalaxyBook> sortByPriceGalaxyBooks(SamsungFactory samsungFactory) {
        ArrayList<GalaxyBook> allGalaxy = new ArrayList<>();
        allGalaxy.addAll(samsungFactory.getGalaxyBook());

        Collections.sort(allGalaxy, new PriceComparator());
        return allGalaxy;
    }

    public static ArrayList<GalaxyBook> sortByPriceGalaxyBooksReverse(SamsungFactory samsungFactory) {
        ArrayList<GalaxyBook> allGalaxy = new ArrayList<>();
        allGalaxy.addAll(samsungFactory.getGalaxyBook());

        Collections.sort(allGalaxy, new PriceComparator().reversed());
        return allGalaxy;
    }


    public static ArrayList<GalaxyWatch> sortByYearGalaxyWatches(SamsungFactory samsungFactory) {
        ArrayList<GalaxyWatch> allGalaxy = new ArrayList<>();
        allGalaxy.addAll(samsungFactory.getGalaxyWatch());

        Collections.sort(allGalaxy, new YearComparator().reversed());
        return allGalaxy;
    }


    public static ArrayList<GalaxyWatch> sortByPriceGalaxyWatches(SamsungFactory samsungFactory) {
        ArrayList<GalaxyWatch> allGalaxy = new ArrayList<>();
        allGalaxy.addAll(samsungFactory.getGalaxyWatch());

        Collections.sort(allGalaxy, new PriceComparator());
        return allGalaxy;
    }

    public static ArrayList<GalaxyWatch> sortByPriceGalaxyWatchesReverse(SamsungFactory samsungFactory) {
        ArrayList<GalaxyWatch> allGalaxy = new ArrayList<>();
        allGalaxy.addAll(samsungFactory.getGalaxyWatch());

        Collections.sort(allGalaxy, new PriceComparator().reversed());
        return allGalaxy;
    }


    public static ArrayList<GalaxyTab> sortByYearGalaxyTabs(SamsungFactory samsungFactory) {
        ArrayList<GalaxyTab> allGalaxy = new ArrayList<>();
        allGalaxy.addAll(samsungFactory.getGalaxyTab());

        Collections.sort(allGalaxy, new YearComparator().reversed());
        return allGalaxy;
    }

    public static ArrayList<GalaxyTab> sortByPriceGalaxyTabs(SamsungFactory samsungFactory) {
        ArrayList<GalaxyTab> allGalaxy = new ArrayList<>();
        allGalaxy.addAll(samsungFactory.getGalaxyTab());

        Collections.sort(allGalaxy, new PriceComparator());
        return allGalaxy;
    }

    public static ArrayList<GalaxyTab> sortByPriceGalaxyTabsReverse(SamsungFactory samsungFactory) {
        ArrayList<GalaxyTab> allGalaxy = new ArrayList<>();
        allGalaxy.addAll(samsungFactory.getGalaxyTab());

        Collections.sort(allGalaxy, new PriceComparator().reversed());
        return allGalaxy;
    }


    public static ArrayList<GalaxyBuds> sortByYearGalaxyBuds(SamsungFactory samsungFactory) {
        ArrayList<GalaxyBuds> allGalaxy = new ArrayList<>();
        allGalaxy.addAll(samsungFactory.getGalaxyBud());

        Collections.sort(allGalaxy, new YearComparator().reversed());
        return allGalaxy;
    }

    public static ArrayList<GalaxyBuds> sortByPriceGalaxyBuds(SamsungFactory samsungFactory) {
        ArrayList<GalaxyBuds> allGalaxy = new ArrayList<>();
        allGalaxy.addAll(samsungFactory.getGalaxyBud());

        Collections.sort(allGalaxy, new PriceComparator());
        return allGalaxy;
    }

    public static ArrayList<GalaxyBuds> sortByPriceGalaxyBudsReverse(SamsungFactory samsungFactory) {
        ArrayList<GalaxyBuds> allGalaxy = new ArrayList<>();
        allGalaxy.addAll(samsungFactory.getGalaxyBud());

        Collections.sort(allGalaxy, new PriceComparator().reversed());
        return allGalaxy;
    }


    //////////////////////apple & samsung//////////////////


    public static ArrayList<Gadget> getAllProduct(AppleFactory appleFac, SamsungFactory samsungFac) {
        ArrayList<Gadget> gadget = new ArrayList<>();

        gadget.addAll(getAllGadgetsApple(appleFac));
        gadget.addAll(getAllGadgetsSamsung(samsungFac));

        return gadget;
    }

    public static ArrayList<Gadget> sortByYearAllProducts(AppleFactory appleFac, SamsungFactory samsungFac) {
        ArrayList<Gadget> all = new ArrayList<>();
        all.addAll(getAllProduct(appleFac, samsungFac));

        Collections.sort(all, new YearComparator().reversed());
        return all;
    }

    public static ArrayList<Gadget> sortByPriceAllProducts(AppleFactory appleFac, SamsungFactory samsungFac) {
        ArrayList<Gadget> all = new ArrayList<>();
        all.addAll(getAllProduct(appleFac, samsungFac));

        Collections.sort(all, new PriceComparator());
        return all;
    }


    public static ArrayList<Gadget> sortByPriceAllProductsReverse(AppleFactory appleFac, SamsungFactory samsungFac) {
        ArrayList<Gadget> all = new ArrayList<>();
        all.addAll(getAllProduct(appleFac, samsungFac));

        Collections.sort(all, new PriceComparator().reversed());
        return all;
    }


    public static ArrayList<Gadget> allNewProducts(AppleFactory appleFac, SamsungFactory samsungFac) {
        ArrayList<Gadget> gadgets = new ArrayList<>();

        for (Gadget x : getAllProduct(appleFac, samsungFac)) {
            if (x.getYear() > 2020)
                gadgets.add(x);
        }
        return gadgets;
    }

    public static ArrayList<Phone> getAllPhones(AppleFactory appleFac, SamsungFactory samsungFac) {
        ArrayList<Phone> phones = new ArrayList<>();

        phones.addAll(appleFac.getIphone());
        phones.addAll(samsungFac.getGalaxy());

        return phones;
    }


    public static ArrayList<Phone> sortByYearPhones(AppleFactory appleFac, SamsungFactory samsungFac) {
        ArrayList<Phone> all = new ArrayList<>();
        all.addAll(getAllPhones(appleFac, samsungFac));

        Collections.sort(all, new YearComparator().reversed());
        return all;
    }


    public static ArrayList<Phone> sortByPricePhones(AppleFactory appleFac, SamsungFactory samsungFac) {
        ArrayList<Phone> all = new ArrayList<>();
        all.addAll(getAllPhones(appleFac, samsungFac));

        Collections.sort(all, new PriceComparator());
        return all;
    }

    public static ArrayList<Phone> sortByPricePhonesReverse(AppleFactory appleFac, SamsungFactory samsungFac) {
        ArrayList<Phone> all = new ArrayList<>();
        all.addAll(getAllPhones(appleFac, samsungFac));

        Collections.sort(all, new PriceComparator().reversed());
        return all;
    }

    public static ArrayList<Notebook> getAllNotebooks(AppleFactory appleFac, SamsungFactory samsungFac) {
        ArrayList<Notebook> note = new ArrayList<>();

        note.addAll(appleFac.getMacbook());
        note.addAll(samsungFac.getGalaxyBook());

        return note;
    }

    public static ArrayList<Notebook> sortByYearNotes(AppleFactory appleFac, SamsungFactory samsungFac) {
        ArrayList<Notebook> all = new ArrayList<>();
        all.addAll(getAllNotebooks(appleFac, samsungFac));

        Collections.sort(all, new YearComparator().reversed());
        return all;
    }

    public static ArrayList<Notebook> sortByPriceNotes(AppleFactory appleFac, SamsungFactory samsungFac) {
        ArrayList<Notebook> all = new ArrayList<>();
        all.addAll(getAllNotebooks(appleFac, samsungFac));

        Collections.sort(all, new PriceComparator());
        return all;
    }

    public static ArrayList<Notebook> sortByPriceNotesReverse(AppleFactory appleFac, SamsungFactory samsungFac) {
        ArrayList<Notebook> all = new ArrayList<>();
        all.addAll(getAllNotebooks(appleFac, samsungFac));

        Collections.sort(all, new PriceComparator().reversed());
        return all;
    }


    public static ArrayList<SmartWatch> getAllWatches(AppleFactory appleFac, SamsungFactory samsungFac) {
        ArrayList<SmartWatch> watches = new ArrayList<>();

        watches.addAll(appleFac.getIwatch());
        watches.addAll(samsungFac.getGalaxyWatch());

        return watches;
    }

    public static ArrayList<SmartWatch> sortByYearWatches(AppleFactory appleFac, SamsungFactory samsungFac) {
        ArrayList<SmartWatch> all = new ArrayList<>();
        all.addAll(getAllWatches(appleFac, samsungFac));

        Collections.sort(all, new YearComparator().reversed());
        return all;
    }

    public static ArrayList<SmartWatch> sortByPriceWatches(AppleFactory appleFac, SamsungFactory samsungFac) {
        ArrayList<SmartWatch> all = new ArrayList<>();

        all.addAll(getAllWatches(appleFac, samsungFac));

        Collections.sort(all, new PriceComparator());

        return all;
    }

    public static ArrayList<SmartWatch> sortByPriceWatchesReverse(AppleFactory appleFac, SamsungFactory samsungFac) {
        ArrayList<SmartWatch> all = new ArrayList<>();

        all.addAll(getAllWatches(appleFac, samsungFac));

        Collections.sort(all, new PriceComparator().reversed());

        return all;
    }

    public static ArrayList<Tablet> getAllTablets(AppleFactory appleFac, SamsungFactory samsungFac) {
        ArrayList<Tablet> tablet = new ArrayList<>();

        tablet.addAll(appleFac.getIpad());
        tablet.addAll(samsungFac.getGalaxyTab());

        return tablet;
    }

    public static ArrayList<Tablet> sortByYearTablets(AppleFactory appleFac, SamsungFactory samsungFac) {
        ArrayList<Tablet> all = new ArrayList<>();
        all.addAll(getAllTablets(appleFac, samsungFac));

        Collections.sort(all, new YearComparator().reversed());
        return all;
    }

    public static ArrayList<Tablet> sortByPriceTablets(AppleFactory appleFac, SamsungFactory samsungFac) {
        ArrayList<Tablet> all = new ArrayList<>();
        all.addAll(getAllTablets(appleFac, samsungFac));

        Collections.sort(all, new PriceComparator());
        return all;
    }

    public static ArrayList<Tablet> sortByPriceTabletsReverse(AppleFactory appleFac, SamsungFactory samsungFac) {
        ArrayList<Tablet> all = new ArrayList<>();
        all.addAll(getAllTablets(appleFac, samsungFac));

        Collections.sort(all, new PriceComparator().reversed());
        return all;
    }

    public static ArrayList<Headphone> getAllHeadphone(AppleFactory appleFac, SamsungFactory samsungFac) {
        ArrayList<Headphone> headphones = new ArrayList<>();

        headphones.addAll(appleFac.getAirpod());
        headphones.addAll(samsungFac.getGalaxyBud());
        return headphones;
    }
    public static ArrayList<Headphone> sortByYearHeadphone(AppleFactory appleFac, SamsungFactory samsungFac) {
        ArrayList<Headphone> all = new ArrayList<>();
        all.addAll(getAllHeadphone(appleFac, samsungFac));

        Collections.sort(all, new YearComparator().reversed());
        return all;
    }
    public static ArrayList<Headphone> sortByPriceHeadphone(AppleFactory appleFac, SamsungFactory samsungFac) {
        ArrayList<Headphone> all = new ArrayList<>();
        all.addAll(getAllHeadphone(appleFac, samsungFac));

        Collections.sort(all, new PriceComparator());
        return all;
    }

    public static ArrayList<Headphone> sortByPriceHeadphoneRev(AppleFactory appleFac, SamsungFactory samsungFac) {
        ArrayList<Headphone> all = new ArrayList<>();
        all.addAll(getAllHeadphone(appleFac, samsungFac));

        Collections.sort(all, new PriceComparator().reversed());
        return all;
    }

}
