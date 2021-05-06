package fullOOP.service;

import fullOOP.model.apple.*;

import java.io.IOException;
import java.util.List;

public class AppleFacDeviceService {
    public static AppleFactory create(){


        AppleFactory appleFac = new AppleFactory("apple", "apple", 2000);


        try {
            List<String> read = FileService.read("files\\device.txt");
            String[] arr;
            for (String x : read) {
                arr = x.split(",");
                if (arr[0].equals("Apple")) {
                    if (arr[1].equals("iphone")) {
                        appleFac.getIphone().add(new IPhone(arr[1], arr[2], Integer.parseInt(arr[3]), Integer.parseInt(arr[4])));
                    }

                    if (arr[1].equals("ipad")) {
                        appleFac.getIpad().add(new Ipad(arr[1], arr[2], Integer.parseInt(arr[3]), Integer.parseInt(arr[4])));
                    }
                    if (arr[1].equals("airpods")) {
                        appleFac.getAirpod().add(new AirPods(arr[1], arr[2], Integer.parseInt(arr[3]), Integer.parseInt(arr[4])));
                    }
                    if (arr[1].equals("iWatch")) {
                        appleFac.getIwatch().add(new Iwatch(arr[1], arr[2], Integer.parseInt(arr[3]), Integer.parseInt(arr[4])));
                    }
                    if (arr[1].equals("macbook")) {
                        appleFac.getMacbook().add(new MacBook(arr[1], arr[2], Integer.parseInt(arr[3]), Integer.parseInt(arr[4])));
                    }


                }
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
        return appleFac;
    }
}
