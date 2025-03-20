package SectionPOO.Exercise01;

import java.util.Scanner;

public class MainPhone {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter with phone brand: ");
        String phoneBrand = sc.nextLine();
        System.out.println("Enter with phone model: ");
        String model = sc.nextLine();
        System.out.println("Enter with phone battery: ");
        int battery = sc.nextInt();

        Phone cellPhone = new Phone();

        cellPhone.setCellPhoneBrand(phoneBrand);
        cellPhone.setModel(model);
        cellPhone.setBattery(battery);

        cellPhone.DeviceInfos();
        cellPhone.batteryPercentage();

        cellPhone.BatteryCheck();

        cellPhone.PowerCellOn(true);
        cellPhone.PowerCellOff(false);

        sc.close();
    }
}
