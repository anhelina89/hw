package Homework.Lesson1.Part2;

/**
 * Created by apodushkina on 15.12.2016.
 */
public class MusicInstruments {

    private String type;
    private boolean portability;
    private boolean AbleToAdjust;
    private double prevalencePercentage;
    private double price;
    private boolean complexityToLearn;
    private double size;
    private double weight;
    private String OriginCountry;
    private int age;

    //methods started
    // methods finished

    //getters started
    // Для boolean свойств рекомендуется использовать префикс is, а не get
    public String getType() {
        return type;
    }

    public boolean isPortability() {
        return portability;
    }

    public boolean isAbleToAdjust() {
        return AbleToAdjust;
    }

    public double getPrevalencePercentage() {
        return prevalencePercentage;
    }

    public double getPrice() {
        return price;
    }

    public boolean isComplexityToLearn() {
        return complexityToLearn;
    }

    public double getSize() {
        return size;
    }

    public double getWeight() {
        return weight;
    }

    public String getOriginCountry() {
        return OriginCountry;
    }

    public int getAge() {
        return age;
    }
    //getters finished

    //setters started
    public void setType(String type) {
        this.type = type;
    }

    public void setPortability(boolean portability) {
        this.portability = portability;
    }

    public void setAbleToAdjust(boolean ableToAdjust) {
        AbleToAdjust = ableToAdjust;
    }

    public void setPrevalencePercentage(double prevalencePercentage) {
        this.prevalencePercentage = prevalencePercentage;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setComplexityToLearn(boolean complexityToLearn) {
        this.complexityToLearn = complexityToLearn;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setOriginCountry(String originCountry) {
        OriginCountry = originCountry;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //setters finished


}
