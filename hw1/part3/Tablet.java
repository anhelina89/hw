package Homework.Lesson1.Part3;

import Homework.Lesson1.Part2.TouchScreenDevices;

/**
 * Created by Angelina on 18.12.2016.
 */
public class Tablet extends TouchScreenDevices {
    //new variables
    private String operationSystem ;
    private boolean ableToPhone;
    private int rechargeSpead;
    private String photoProgrammProfessional;
    //new methods
    private void readBook(){}
    private void useNotePad(){}
    private void useGPS(){}


    @Override
    public void checkInstallation(boolean autoInstallation) {

    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public boolean isAbleToPhone() {
        return ableToPhone;
    }

    public int getRechargeSpead() {
        return rechargeSpead;
    }

    public String getPhotoProgrammProfessional() {
        return photoProgrammProfessional;
    }



    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public void setAbleToPhone(boolean ableToPhone) {
        this.ableToPhone = ableToPhone;
    }

    public void setRechargeSpead(int rechargeSpead) {
        this.rechargeSpead = rechargeSpead;
    }

    public void setPhotoProgrammProfessional(String photoProgrammProfessional) {
        this.photoProgrammProfessional = photoProgrammProfessional;
    }

}
