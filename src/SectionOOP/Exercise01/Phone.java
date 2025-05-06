package SectionOOP.Exercise01;

public class Phone {
    private String cellPhoneBrand;
    private String model;
    private int battery;

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void setCellPhoneBrand(String cellPhoneBrand) {
        this.cellPhoneBrand = cellPhoneBrand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCellPhoneBrand() {
        return cellPhoneBrand;
    }

    public int getBattery() {
        return battery;
    }

    public String getModel() {
        return model;
    }


    public void PowerCellOn(boolean validatePower){
        if(validatePower){
            System.out.println("Your device is already turned on");
        }
        else{
            System.out.println("Turning on device...");
            long timer = System.currentTimeMillis();
            while(System.currentTimeMillis() - timer < 5000){
            }
            System.out.println("Device ON");
        }
    }

    public void PowerCellOff(boolean validatePower){
        if(!validatePower){
            System.out.println("Your device is already turned Off");
        }
        else{
            System.out.println("Turning off device...");
            long timer = System.currentTimeMillis();
            while(System.currentTimeMillis() - timer < 5000){
            }
            System.out.println("Device OFF");
        }
    }

    public void BatteryCheck(){
        if(this.battery == 0){
            System.out.println("Please, charge you phone!");
        }
        else if(this.battery>1 && this.battery <=19){
            System.out.println("Be careful, your device has low battery.");
        }
        else if(this.battery>20 && this.battery <50){
            System.out.println("Less than half the battery!");
        }
        else{
            System.out.println("Battery is normal level.");
        }
    }

    public void batteryPercentage(){
        System.out.println("Cellphone battery: " + getBattery()+ "%");
    }

    public void DeviceInfos(){
        System.out.println("Cellphone brand: " + getCellPhoneBrand() + "\nCellphone model: "+ getModel());
    }
}
