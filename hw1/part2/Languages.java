package Homework.Lesson1.Part2;

/**
 * Created by apodushkina on 15.12.2016.
 */
public class Languages {


    private int AveregeNumofWords;
    private double UsedInTheWorld; //how many people are using it (xx%)
    private boolean DifficultyToLearn;
    private String difficultyByGrammar;
    private boolean spelling; // is it possible to spell
    private boolean allive;
    private String type; //a sign language or regular
    private int amountOfSinonims;
    private int NumOfLetters;

    //methods started
    public void countWord() {
    }

    public void checkUsageInWorld() {
    }

    public void estimateHardnessToLearn() {
    }

    public void estimateGrammar() {
    }

    public void checkSpellingAbility() {
    }

    public void checkIsNotExtinct() {
    }

    public void countSinonims() {
    }

    public void checkFilmSubtitels() {
    }

    public void findFairyTailsOnLanguage() {
    }

    public void checkSchoolsTeaching() {
    }


    // methods finished

    //getters started
    // Для boolean свойств рекомендуется использовать префикс is, а не get
    public int getNumOfLetters() {
        return NumOfLetters;
    }

    public int getAveregeNumofWords() {
        return AveregeNumofWords;
    }

    public double getUsedInTheWorld() {
        return UsedInTheWorld;
    }

    public boolean isDifficultyToLearn() {
        return DifficultyToLearn;
    }

    public String getDifficultyByGrammar() {
        return difficultyByGrammar;
    }

    public boolean isSpelling() {
        return spelling;
    }

    public boolean isAllive() {
        return allive;
    }

    public String getType() {
        return type;
    }

    public int getAmountOfSinonims() {
        return amountOfSinonims;
    }
    //getters finished

    //setter started
    public void setNumOfLetters(int numOfLetters) {
        NumOfLetters = numOfLetters;
    }

    public void setAveregeNumofWords(int averegeNumofWords) {
        AveregeNumofWords = averegeNumofWords;
    }

    public void setUsedInTheWorld(double usedInTheWorld) {
        UsedInTheWorld = usedInTheWorld;
    }

    public void setDifficultyToLearn(boolean difficultyToLearn) {
        DifficultyToLearn = difficultyToLearn;
    }

    public void setDifficultyByGrammar(String difficultyByGrammar) {
        this.difficultyByGrammar = difficultyByGrammar;
    }

    public void setSpelling(boolean spelling) {
        this.spelling = spelling;
    }

    public void setAllive(boolean allive) {
        this.allive = allive;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAmountOfSinonims(int amountOfSinonims) {
        this.amountOfSinonims = amountOfSinonims;
    }

    //setter finished


}
