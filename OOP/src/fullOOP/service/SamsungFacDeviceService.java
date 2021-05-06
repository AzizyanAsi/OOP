package fullOOP.service;

import fullOOP.model.samsung.*;

import java.io.IOException;
import java.util.List;

public class SamsungFacDeviceService {
   public static SamsungFactory create(){

        SamsungFactory samsungFac = new SamsungFactory("samsung", "samsung", 2000);


        try {
            List<String> read = FileService.read("files\\device.txt");
            String[] arr;
            for (String x : read) {
                arr = x.split(",");
                if (arr[0].equals("Samsung")) {
                    if (arr[1].equals("Galaxy")) {
                        samsungFac.getGalaxy().add(new Galaxy(arr[1], arr[2], Integer.parseInt(arr[3]), Integer.parseInt(arr[4])));
                    }

                    if (arr[1].equals("Galaxy Book")) {
                        samsungFac.getGalaxyBook().add(new GalaxyBook(arr[1], arr[2], Integer.parseInt(arr[3]), Integer.parseInt(arr[4])));
                    }
                    if (arr[1].equals("Galaxy Buds")) {
                        samsungFac.getGalaxyBud().add(new GalaxyBuds(arr[1], arr[2], Integer.parseInt(arr[3]), Integer.parseInt(arr[4])));
                    }
                    if (arr[1].equals("Galaxy Tab")) {
                        samsungFac.getGalaxyTab().add(new GalaxyTab(arr[1], arr[2], Integer.parseInt(arr[3]), Integer.parseInt(arr[4])));
                    }
                    if (arr[1].equals("Galaxy Watch")) {
                        samsungFac.getGalaxyWatch().add(new GalaxyWatch(arr[1], arr[2], Integer.parseInt(arr[3]), Integer.parseInt(arr[4])));
                    }


                }
            }



        } catch (IOException e) {
            e.printStackTrace();
        }

        return samsungFac;

    }
}