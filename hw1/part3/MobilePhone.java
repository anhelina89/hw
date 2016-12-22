package Homework.Lesson1.Part3;

import Homework.Lesson1.Part2.TouchScreenDevices;

/**
 * Created by apodushkina on 16.12.2016.
 */
public class MobilePhone extends TouchScreenDevices {

    //new variables
    private String keyBoardType = "sensor";
    public static boolean microphone = true;
    private String manufacture;

    //new methods
    private void takeCall() {
    }

    private String takeMsg(String msg) {
        return msg;
    }

    public void setKeyBoardType(String keyBoardType) {
        this.keyBoardType = keyBoardType;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public void checkInstallation(boolean ableInstallApps){
        if (super.ableInstallApps == true) {
            System.out.println("This device can install apps automatically.");
        } else {
            System.out.println("You have to install apps on your own!");
        }
    }
    @Override
    public void setEnergySaving(boolean energySaving) {
        super.setEnergySaving(energySaving == true);
    }

    @Override
    public void setRechargable(boolean rechargable) {
        super.setRechargable(rechargable == true);
    }

    @Override
    public boolean isMultiCardSupport() {
        return super.isMultiCardSupport();
    }

    @Override
    public boolean isInternet3G4GSupport() {
        return super.isInternet3G4GSupport();
    }


}
