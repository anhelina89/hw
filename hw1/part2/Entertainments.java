package Homework.Lesson1.Part2;

/**
 * Created by apodushkina on 15.12.2016.
 */
public class Entertainments {

    public String type; // active or not
    public String TargetGroup; //old, middle,
    public boolean safe;
    public int numberOfInvolvedPeople;
    public String supportingComponents; // musicInstruments, toys, fireworks, animals in the circle
    public int NumOfPeopleInvolved;
    public String originCountry;
    public String location;
    public double widespreadPersentage;
    public boolean isReligious;

    //methods started
    public void playGame() {
    }

    public void playMusic() {
    }

    public void selectTargetPeople() {
    }

    public void checkSecurity() {
    }

    public void checkAbleLocation() {
    }

    public void invitePeople() {
    }

    public void approveOriginCountry() {
    }

    public void countWidespread() {
    }

    public void countIncome() {
    }

    public void calculateFun() {
    }


    // methods finished


    //setters started
    public void setType(String type) {
        this.type = type;
    }

    public void setTargetGroup(String targetGroup) {
        TargetGroup = targetGroup;
    }

    public void setSafe(boolean safe) {
        this.safe = safe;
    }

    public void setNumberOfInvolvedPeople(int numberOfInvolvedPeople) {
        this.numberOfInvolvedPeople = numberOfInvolvedPeople;
    }

    public void setSupportingComponents(String supportingComponents) {
        this.supportingComponents = supportingComponents;
    }

    public void setNumOfPeopleInvolved(int numOfPeopleInvolved) {
        NumOfPeopleInvolved = numOfPeopleInvolved;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setWidespreadPersentage(double widespreadPersentage) {
        this.widespreadPersentage = widespreadPersentage;
    }

    public void setReligious(boolean religious) {
        isReligious = religious;
    }
    //setters finished

    //getter started
    //// Для boolean свойств рекомендуется использовать префикс is, а не get
    public String getType() {
        return type;
    }

    public String getTargetGroup() {
        return TargetGroup;
    }

    public boolean isSafe() {
        return safe;
    }

    public int getNumberOfInvolvedPeople() {
        return numberOfInvolvedPeople;
    }

    public String getSupportingComponents() {
        return supportingComponents;
    }

    public int getNumOfPeopleInvolved() {
        return NumOfPeopleInvolved;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public String getLocation() {
        return location;
    }

    public double getWidespreadPersentage() {
        return widespreadPersentage;
    }

    public boolean isReligious() {
        return isReligious;
    }
    //getter started

}
