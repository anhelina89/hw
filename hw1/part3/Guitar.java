package Homework.Lesson1.Part3;

import Homework.Lesson1.Part2.MusicInstruments;

/**
 * Created by apodushkina on 16.12.2016.
 */
public class Guitar extends MusicInstruments {

    private static int strings = 7;
    private int price = 150;
    private int weght = 15;

    private void makeSound() {
    }


    @Override
    public void setType(String type) {
        super.setType(type = "electric");
    }

    @Override
    public void setSize(double size) {
        super.setSize(size = 200);
    }

}
