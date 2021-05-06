package fullOOP.main;


import fullOOP.model.apple.*;
import fullOOP.model.devices.*;
import fullOOP.model.samsung.*;
import fullOOP.service.AppleFacDeviceService;
import fullOOP.service.FileService;
import fullOOP.service.ProductService;
import fullOOP.service.SamsungFacDeviceService;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        FileService.createFolder("files");
        try {
            FileService.createFile("files", "device.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try {
//            FileService.write("files\\device.txt","smth");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        AppleFactory appleFactory = AppleFacDeviceService.create();
        SamsungFactory samsungFactory = SamsungFacDeviceService.create();

        Scanner s = new Scanner(System.in);
        boolean isMenuActive = true;
        while (isMenuActive) {
            System.out.println("----------------------------");
            System.out.println("Hi choose what product do you want");
            System.out.println("Enter command number  | 1.apple| |2.samsung | |3.All| |0.exit|");


            int command = s.nextInt();
            switch (command) {
                case 1:

                    initCommandApple(s, appleFactory);

                    break;
                case 2:
                    initCommandSamsung(s, samsungFactory);

                    break;
                case 3:

                    initCommandSamsungApple(s, samsungFactory,appleFactory);
                    break;

                case 0:
                    isMenuActive = false;
                    System.out.println("bye");
                    break;
                default:
                    System.out.println("invalid number");
            }
        }
    }




    private static void initCommandApple(Scanner s, AppleFactory appleFactory) {
        int commandApple = 0;
        while (true) {
            System.out.println("----------------------------");
            System.out.println("enter command number in Apple");
            System.out.println("1.Show all devices ");
            System.out.println("2.Show all iPhones");
            System.out.println("3.Show all macBooks");
            System.out.println("4.Show all iWatches ");
            System.out.println("5.Show all iPads");
            System.out.println("6.Show all airPods");

            System.out.println("0. Go previous menu");
            commandApple = s.nextInt();


            switch (commandApple) {
                case 1:
                    commandShowAllDevicesApple(s, appleFactory);

                    break;
                case 2:
                    commandShowAllIphones(s, appleFactory);

                    break;
                case 3:
                    commandShowAllMacBooks(s, appleFactory);

                    break;
                case 4:
                    commandShowAllIwatches(s, appleFactory);

                    break;
                case 5:
                    commandShowAllIpads(s, appleFactory);

                    break;
                case 6:
                    commandShowAllAirPods(s, appleFactory);

                    break;
                case 0:
                    return;

                default:
                    System.out.println("invalid number");

            }
        }

    }

    private static void commandShowAllDevicesApple(Scanner s, AppleFactory appleFactory) {
        int command = 0;
        for (Gadget x : ProductService.getAllGadgetsApple(appleFactory)) {
            System.out.println(x);
        }
        while (true) {
            System.out.println("----------------------------");
            System.out.println("1.Show all Apple sorting by year ");
            System.out.println("2.Show all Apple sorting by min price ");
            System.out.println("3.Show all Apple sorting by max price ");
            System.out.println("4.Show all new Apple products  ");
            System.out.println("0. Go previous menu");

            command = s.nextInt();

            switch (command) {
                case 1:
                    for (Gadget x : ProductService.sortByYearApple(appleFactory)) {
                        System.out.println(x);
                    }
                    break;
                case 2:
                    for (Gadget x : ProductService.sortByPriceApple(appleFactory)) {
                        System.out.println(x);
                    }
                    break;
                case 3:
                    for (Gadget x : ProductService.sortByPriceAppleReverse(appleFactory)) {
                        System.out.println(x);
                    }
                    break;
                case 4:
                    for (Gadget x : ProductService.newAppleProducts(appleFactory)) {
                        System.out.println(x);
                    }

                    break;
                case 0:
                    return;

                default:
                    System.out.println("invalid number");

            }

        }

    }

    private static void commandShowAllIphones(Scanner s, AppleFactory appleFactory) {
        int command = 0;
        for (Gadget x : appleFactory.getIphone()) {
            System.out.println(x);
        }
        while (true) {
            System.out.println("----------------------------");
            System.out.println("1.Show all iPhones sorting by year ");
            System.out.println("2.Show all iPhones sorting by min price ");
            System.out.println("3.Show all iPhones sorting by max price ");
            System.out.println("0. Go previous menu");

            command = s.nextInt();
            switch (command) {
                case 1:
                    for (IPhone x : ProductService.sortByYearIphone(appleFactory)) {
                        System.out.println(x);
                    }
                    break;
                case 2:
                    for (IPhone x : ProductService.sortByPriceIphone(appleFactory)) {
                        System.out.println(x);
                    }
                    break;
                case 3:
                    for (IPhone x : ProductService.sortByPriceReverseIphone(appleFactory)) {
                        System.out.println(x);
                    }
                    break;


                case 0:
                    return;

                default:
                    System.out.println("invalid number");

            }
        }

    }

    private static void commandShowAllMacBooks(Scanner s, AppleFactory appleFactory) {
        int command = 0;
        for (Gadget x : appleFactory.getMacbook()) {
            System.out.println(x);
        }
        while (true) {
            System.out.println("----------------------------");
            System.out.println("1.Show all Macbook sorting by year ");
            System.out.println("2.Show all Macbook sorting by min price ");
            System.out.println("3.Show all Macbook sorting by max price ");
            System.out.println("0. Go previous menu");

            command = s.nextInt();
            switch (command) {
                case 1:
                    for (MacBook x : ProductService.sortByYearMacBook(appleFactory)) {
                        System.out.println(x);
                    }
                    break;
                case 2:
                    for (MacBook x : ProductService.sortByPriceMacBook(appleFactory)) {
                        System.out.println(x);
                    }
                    break;
                case 3:
                    for (MacBook x : ProductService.sortByPriceMacBookReverse(appleFactory)) {
                        System.out.println(x);
                    }
                    break;


                case 0:
                    return;

                default:
                    System.out.println("invalid number");

            }
        }
    }

    private static void commandShowAllIwatches(Scanner s, AppleFactory appleFactory) {
        int command = 0;
        for (Gadget x : appleFactory.getIwatch()) {
            System.out.println(x);
        }
        while (true) {
            System.out.println("----------------------------");
            System.out.println("1.Show all Iwatches sorting by year ");
            System.out.println("2.Show all Iwatches sorting by min price ");
            System.out.println("3.Show all Iwatches sorting by max price ");
            System.out.println("0. Go previous menu");

            command = s.nextInt();
            switch (command) {
                case 1:
                    for (Iwatch x:ProductService.sortByYearIwatch(appleFactory)) {
                        System.out.println(x);
                    }
                    break;
                case 2:
                    for (Iwatch x:ProductService.sortByPriceIwatch(appleFactory)) {
                        System.out.println(x);
                    }
                    break;
                case 3:
                    for (Iwatch x:ProductService.sortByPriceIwatchReverse(appleFactory)) {
                        System.out.println(x);
                    }
                    break;

                case 0:
                    return;

                default:
                    System.out.println("invalid number");

            }
        }

    }

    private static void commandShowAllIpads(Scanner s, AppleFactory appleFactory) {
        int command = 0;
        for (Gadget x : appleFactory.getIpad()) {
            System.out.println(x);
        }
        while (true) {
            System.out.println("----------------------------");
            System.out.println("1.Show all Ipads sorting by year ");
            System.out.println("2.Show all Ipads sorting by min price ");
            System.out.println("3.Show all Ipads sorting by max price ");
            System.out.println("0. Go previous menu");

            command = s.nextInt();
            switch (command) {
                case 1:
                    for (Ipad x:ProductService.sortByYearIPad(appleFactory)) {
                        System.out.println(x);
                    }
                    break;
                case 2:
                    for (Ipad x:ProductService.sortByPriceIPad(appleFactory)) {
                        System.out.println(x);
                    }
                    break;
                case 3:
                    for (Ipad x:ProductService.sortByPriceIPadReverse(appleFactory)) {
                        System.out.println(x);
                    }
                    break;

                case 0:
                    return;

                default:
                    System.out.println("invalid number");

            }
        }
    }

    private static void commandShowAllAirPods(Scanner s, AppleFactory appleFactory) {
        int command = 0;
        for (Gadget x : appleFactory.getAirpod()) {
            System.out.println(x);
        }
        while (true) {
            System.out.println("----------------------------");
            System.out.println("1.Show all AirPods sorting by year ");
            System.out.println("2.Show all AirPods sorting by min price ");
            System.out.println("3.Show all AirPods sorting by max price ");
            System.out.println("0. Go previous menu");

            command = s.nextInt();
            switch (command) {
                case 1:
                    for (AirPods x:ProductService.sortByYearAirPods(appleFactory)) {
                        System.out.println(x);
                    }
                    break;
                case 2:
                    for (AirPods x:ProductService.sortByPriceAirPods(appleFactory)) {
                        System.out.println(x);
                    }
                    break;
                case 3:
                    for (AirPods x:ProductService.sortByPriceAirPodsReverse(appleFactory)) {
                        System.out.println(x);
                    }
                    break;

                case 0:
                    return;

                default:
                    System.out.println("invalid number");

            }
        }
    }

    //samsung
    private static void initCommandSamsung(Scanner s, SamsungFactory samsungFactory) {
        int commandApple = 0;
        while (true) {
            System.out.println("----------------------------");
            System.out.println("enter command number in Samsung");
            System.out.println("1.Show all devices ");
            System.out.println("2.Show all phones");
            System.out.println("3.Show all galaxyBooks");
            System.out.println("4.Show all galaxyWatches ");
            System.out.println("5.Show all galaxyTabs");
            System.out.println("6.Show all galaxyBuds");
            System.out.println("0. Go previous menu");

            commandApple = s.nextInt();
            switch (commandApple) {
                case 1:
                    commandShowAllDevicesSamsung(s, samsungFactory);

                    break;
                case 2:
                    commandShowAllGalaxy(s, samsungFactory);

                    break;
                case 3:
                    commandShowAllGalaxyBooks(s, samsungFactory);

                    break;
                case 4:
                    commandShowAllGalaxyWatches(s, samsungFactory);

                    break;
                case 5:
                    commandShowAllGalaxyTabs(s, samsungFactory);

                    break;
                case 6:
                    commandShowAllGalaxyBuds(s, samsungFactory);

                    break;
                case 0:
                    return;

                default:
                    System.out.println("invalid number");

            }
        }
    }

    private static void commandShowAllDevicesSamsung(Scanner s, SamsungFactory samsungFactory) {
        int command = 0;
        for (Gadget x : ProductService.getAllGadgetsSamsung(samsungFactory)) {
            System.out.println(x);
        }
        while (true) {
            System.out.println("----------------------------");
            System.out.println("1.Show all Samsung sorting by year ");
            System.out.println("2.Show all Samsung sorting by min price ");
            System.out.println("3.Show all Samsung sorting by max price ");
            System.out.println("4.Show all new Samsung products  ");
            System.out.println("0. Go previous menu");

            command = s.nextInt();

            switch (command) {
                case 1:
                    for (Gadget x : ProductService.sortByYearSamsung(samsungFactory)) {
                        System.out.println(x);
                    }
                    break;
                case 2:
                    for (Gadget x : ProductService.sortByPriceSamsung(samsungFactory)) {
                        System.out.println(x);
                    }
                    break;
                case 3:
                    for (Gadget x : ProductService.sortByPriceSamsungReverse(samsungFactory)) {
                        System.out.println(x);
                    }
                    break;
                case 4:
                    for (Gadget x : ProductService.newSamsungProducts(samsungFactory)) {
                        System.out.println(x);
                    }
                    break;
                case 0:
                    return;

                default:
                    System.out.println("invalid number");

            }
        }
    }

    private static void commandShowAllGalaxy(Scanner s, SamsungFactory samsungFactory) {
        int command = 0;
        for (Gadget x : samsungFactory.getGalaxy()) {
            System.out.println(x);
        }
        while (true) {
            System.out.println("----------------------------");
            System.out.println("1.Show all Galaxies sorting by year ");
            System.out.println("2.Show all Galaxies sorting by min price ");
            System.out.println("3.Show all Galaxies sorting by max price ");
            System.out.println("0. Go previous menu");

            command = s.nextInt();

            switch (command) {
                case 1:
                    for (Galaxy x : ProductService.sortByYearGalaxy(samsungFactory)) {
                        System.out.println(x);
                    }

                    break;
                case 2:
                    for (Galaxy x : ProductService.sortByPriceGalaxy(samsungFactory)) {
                        System.out.println(x);
                    }
                    break;
                case 3:
                    for (Galaxy x : ProductService.sortByPriceGalaxyReverse(samsungFactory)) {
                        System.out.println(x);
                    }
                    break;
                case 0:
                    return;

                default:
                    System.out.println("invalid number");

            }
        }
    }

    private static void commandShowAllGalaxyBooks(Scanner s, SamsungFactory samsungFactory) {
        int command = 0;
        for (Gadget x : samsungFactory.getGalaxyBook()) {
            System.out.println(x);
        }
        while (true) {
            System.out.println("----------------------------");
            System.out.println("1.Show all GalaxyBooks sorting by year ");
            System.out.println("2.Show all GalaxyBooks sorting by min price ");
            System.out.println("3.Show all GalaxyBooks sorting by max price ");
            System.out.println("0. Go previous menu");

            command = s.nextInt();

            switch (command) {
                case 1:
                    for (GalaxyBook x : ProductService.sortByYearGalaxyBooks(samsungFactory)) {
                        System.out.println(x);
                    }
                    break;
                case 2:
                    for (GalaxyBook x : ProductService.sortByPriceGalaxyBooks(samsungFactory)) {
                        System.out.println(x);
                    }
                    break;
                case 3:
                    for (GalaxyBook x : ProductService.sortByPriceGalaxyBooksReverse(samsungFactory)) {
                        System.out.println(x);
                    }
                    break;
                case 0:
                    return;

                default:
                    System.out.println("invalid number");

            }
        }
    }

    private static void commandShowAllGalaxyWatches(Scanner s, SamsungFactory samsungFactory) {
        int command = 0;
        for (Gadget x : samsungFactory.getGalaxyWatch()) {
            System.out.println(x);
        }
        while (true) {
            System.out.println("----------------------------");
            System.out.println("1.Show all GalaxyWatches sorting by year ");
            System.out.println("2.Show all GalaxyWatches sorting by min price ");
            System.out.println("3.Show all GalaxyWatches sorting by max price ");
            System.out.println("0. Go previous menu");

            command = s.nextInt();

            switch (command) {
                case 1:
                    for (GalaxyWatch x : ProductService.sortByYearGalaxyWatches(samsungFactory)) {
                        System.out.println(x);
                    }
                    break;
                case 2:
                    for (GalaxyWatch x : ProductService.sortByPriceGalaxyWatches(samsungFactory)) {
                        System.out.println(x);
                    }
                    break;
                case 3:
                    for (GalaxyWatch x : ProductService.sortByPriceGalaxyWatchesReverse(samsungFactory)) {
                        System.out.println(x);
                    }
                    break;
                case 0:
                    return;

                default:
                    System.out.println("invalid number");

            }
        }
    }

    private static void commandShowAllGalaxyTabs(Scanner s, SamsungFactory samsungFactory) {
        int command = 0;
        for (Gadget x : samsungFactory.getGalaxyTab()) {
            System.out.println(x);
        }
        while (true) {
            System.out.println("----------------------------");
            System.out.println("1.Show all GalaxyTabs sorting by year ");
            System.out.println("2.Show all GalaxyTabs sorting by min price ");
            System.out.println("3.Show all GalaxyTabs sorting by max price ");
            System.out.println("0. Go previous menu");

            command = s.nextInt();

            switch (command) {
                case 1:
                    for (GalaxyTab x : ProductService.sortByYearGalaxyTabs(samsungFactory)) {
                        System.out.println(x);
                    }
                    break;
                case 2:
                    for (GalaxyTab x : ProductService.sortByPriceGalaxyTabs(samsungFactory)) {
                        System.out.println(x);
                    }
                    break;
                case 3:
                    for (GalaxyTab x : ProductService.sortByPriceGalaxyTabsReverse(samsungFactory)) {
                        System.out.println(x);
                    }
                    break;
                case 0:
                    return;

                default:
                    System.out.println("invalid number");

            }
        }
    }

    private static void commandShowAllGalaxyBuds(Scanner s, SamsungFactory samsungFactory) {
        int command = 0;
        for (Gadget x : samsungFactory.getGalaxyBud()) {
            System.out.println(x);
        }
        while (true) {
            System.out.println("----------------------------");
            System.out.println("1.Show all GalaxyBuds sorting by year ");
            System.out.println("2.Show all GalaxyBuds sorting by min price ");
            System.out.println("3.Show all GalaxyBuds sorting by max price ");
            System.out.println("0. Go previous menu");

            command = s.nextInt();
            switch (command) {
                case 1:
                    for (GalaxyBuds x : ProductService.sortByYearGalaxyBuds(samsungFactory)) {
                        System.out.println(x);
                    }
                    break;
                case 2:
                    for (GalaxyBuds x : ProductService.sortByPriceGalaxyBuds(samsungFactory)) {
                        System.out.println(x);
                    }
                    break;
                case 3:
                    for (GalaxyBuds x : ProductService.sortByPriceGalaxyBudsReverse(samsungFactory)) {
                        System.out.println(x);
                    }
                    break;
                case 0:
                    return;

                default:
                    System.out.println("invalid number");

            }
        }
    }
    //All Samsung Apple
    private static void initCommandSamsungApple(Scanner s, SamsungFactory samsungFac, AppleFactory appleFac) {
        int commandAll = 0;
        while (true) {
            System.out.println("enter command number in Apple & Samsung");
            System.out.println("1.Show all devices ");
            System.out.println("2.Show all phones");
            System.out.println("3.Show all notebooks");
            System.out.println("4.Show all watches ");
            System.out.println("5.Show all tablets");
            System.out.println("6.Show all headphones");

            System.out.println("0. Go previous menu");

            commandAll = s.nextInt();
            switch (commandAll) {
                case 1:
                    commandShowAllDevices(s, samsungFac,appleFac);

                    break;
                case 2:
                    commandShowAllPhones(s,samsungFac, appleFac);

                    break;
                case 3:
                    commandShowAllNoteBooks(s,samsungFac, appleFac);

                    break;
                case 4:
                    commandShowAllWatches(s, samsungFac,appleFac);

                    break;
                case 5:
                    commandShowAllTablets(s, samsungFac,appleFac);

                    break;
                case 6:
                    commandShowAllHeadPhone(s,samsungFac, appleFac);

                    break;
                case 0:
                    return;

                default:
                    System.out.println("invalid number");

            }
        }

    }

    private static void commandShowAllDevices(Scanner s, SamsungFactory samsungFac, AppleFactory appleFac) {
        int command = 0;
        for (Gadget x:ProductService.getAllProduct(appleFac,samsungFac)) {
            System.out.println(x);

        }
        while (true) {
            System.out.println("----------------------------");
            System.out.println("1.Show all samsung & apple sorting by year ");
            System.out.println("2.Show all samsung & apple sorting by min price ");
            System.out.println("3.Show all samsung & apple sorting by max price ");
            System.out.println("4.Show all new Samsung & new apple  products  ");
            System.out.println("0. Go previous menu");

            command = s.nextInt();

            switch (command) {
                case 1:
                    for (Gadget x:ProductService.sortByYearAllProducts(appleFac,samsungFac)) {
                        System.out.println(x);
                    }
                    break;
                case 2:
                    for (Gadget x:ProductService.sortByPriceAllProducts(appleFac,samsungFac)) {
                        System.out.println(x);
                    }
                    break;
                case 3:
                    for (Gadget x:ProductService.sortByPriceAllProductsReverse(appleFac,samsungFac)) {
                        System.out.println(x);
                    }
                    break;
                case 4:
                    for (Gadget x:ProductService.allNewProducts(appleFac,samsungFac)) {
                        System.out.println(x);
                    }
                    break;
                case 0:
                    return;

                default:
                    System.out.println("invalid number");

            }
        }

    }

    private static void commandShowAllPhones(Scanner s, SamsungFactory samsungFac,AppleFactory appleFac) {
        int command = 0;
        for (Gadget x:ProductService.getAllPhones(appleFac,samsungFac)) {
            System.out.println(x);
        }
        while (true) {
            System.out.println("----------------------------");
            System.out.println("1.Show all phones sorting by year ");
            System.out.println("2.Show all phones sorting by min price ");
            System.out.println("3.Show all phones sorting by max price ");

            System.out.println("0. Go previous menu");

            command = s.nextInt();

            switch (command) {
                case 1:
                    for (Phone x:ProductService.sortByYearPhones(appleFac,samsungFac)) {
                        System.out.println(x);
                    }
                    break;
                case 2:
                    for (Phone x:ProductService.sortByPricePhones(appleFac,samsungFac)) {
                        System.out.println(x);
                    }
                    break;
                case 3:
                    for (Phone x:ProductService.sortByPricePhonesReverse(appleFac,samsungFac)) {
                        System.out.println(x);
                    }
                    break;

                case 0:
                    return;

                default:
                    System.out.println("invalid number");

            }
        }
    }

    private static void commandShowAllNoteBooks(Scanner s, SamsungFactory samsungFac,AppleFactory appleFac) {
        int command = 0;
        for (Notebook x:ProductService.getAllNotebooks(appleFac,samsungFac)) {
            System.out.println(x);
        }
        while (true) {
            System.out.println("----------------------------");
            System.out.println("1.Show all NoteBooks sorting by year ");
            System.out.println("2.Show all NoteBooks sorting by min price ");
            System.out.println("3.Show all NoteBooks sorting by max price ");

            System.out.println("0. Go previous menu");

            command = s.nextInt();

            switch (command) {
                case 1:
                    for (Notebook x:ProductService.sortByYearNotes(appleFac,samsungFac)) {
                        System.out.println(x);
                    }
                    break;
                case 2:
                    for (Notebook x:ProductService.sortByPriceNotes(appleFac,samsungFac)) {
                        System.out.println(x);
                    }
                    break;
                case 3:
                    for (Notebook x:ProductService.sortByPriceNotesReverse(appleFac,samsungFac)) {
                        System.out.println(x);
                    }
                    break;

                case 0:
                    return;

                default:
                    System.out.println("invalid number");

            }
        }

    }

    private static void commandShowAllWatches(Scanner s,SamsungFactory samsungFac, AppleFactory appleFac) {
        int command = 0;
        for (SmartWatch x:ProductService.getAllWatches(appleFac,samsungFac)) {
            System.out.println(x);
        }
        while (true) {
            System.out.println("----------------------------");
            System.out.println("1.Show all Watches sorting by year ");
            System.out.println("2.Show all Watches sorting by min price ");
            System.out.println("3.Show all Watches sorting by max price ");

            System.out.println("0. Go previous menu");

            command = s.nextInt();

            switch (command) {
                case 1:
                    for (SmartWatch x:ProductService.sortByYearWatches(appleFac,samsungFac)) {
                        System.out.println(x);
                    }
                    break;
                case 2:
                    for (SmartWatch x:ProductService.sortByPriceWatches(appleFac,samsungFac)) {
                        System.out.println(x);
                    }
                    break;
                case 3:
                    for (SmartWatch x:ProductService.sortByPriceWatchesReverse(appleFac,samsungFac)) {
                        System.out.println(x);
                    }
                    break;

                case 0:
                    return;

                default:
                    System.out.println("invalid number");

            }
        }

    }

    private static void commandShowAllTablets(Scanner s,SamsungFactory samsungFac, AppleFactory appleFac) {
        int command = 0;
        for (Tablet x:ProductService.getAllTablets(appleFac,samsungFac)) {
            System.out.println(x);
        }
        while (true) {
            System.out.println("----------------------------");
            System.out.println("1.Show all Tablets sorting by year ");
            System.out.println("2.Show all Tablets sorting by min price ");
            System.out.println("3.Show all Tablets sorting by max price ");

            System.out.println("0. Go previous menu");

            command = s.nextInt();

            switch (command) {
                case 1:
                    for (Tablet x:ProductService.sortByYearTablets(appleFac,samsungFac)) {
                        System.out.println(x);
                    }
                    break;
                case 2:
                    for (Tablet x:ProductService.sortByPriceTablets(appleFac,samsungFac)) {
                        System.out.println(x);
                    }
                    break;
                case 3:
                    for (Tablet x:ProductService.sortByPriceTabletsReverse(appleFac,samsungFac)) {
                        System.out.println(x);
                    }
                    break;

                case 0:
                    return;

                default:
                    System.out.println("invalid number");

            }
        }
    }

    private static void commandShowAllHeadPhone(Scanner s, SamsungFactory samsungFac,AppleFactory appleFac) {
        int command = 0;
        for (Headphone x:ProductService.getAllHeadphone(appleFac,samsungFac)) {
            System.out.println(x);
        }
        while (true) {
            System.out.println("----------------------------");
            System.out.println("1.Show all HeadPhone sorting by year ");
            System.out.println("2.Show all HeadPhone sorting by min price ");
            System.out.println("3.Show all HeadPhone sorting by max price ");

            System.out.println("0. Go previous menu");

            command = s.nextInt();

            switch (command) {
                case 1:
                    for (Headphone x:ProductService.sortByYearHeadphone(appleFac,samsungFac)) {
                        System.out.println(x);
                    }
                    break;
                case 2:
                    for (Headphone x:ProductService.sortByPriceHeadphone(appleFac,samsungFac)) {
                        System.out.println(x);
                    }
                    break;
                case 3:
                    for (Headphone x:ProductService.sortByPriceHeadphoneRev(appleFac,samsungFac)) {
                        System.out.println(x);
                    }
                    break;
                case 0:
                    return;

                default:
                    System.out.println("invalid number");

            }
        }
    }

}



