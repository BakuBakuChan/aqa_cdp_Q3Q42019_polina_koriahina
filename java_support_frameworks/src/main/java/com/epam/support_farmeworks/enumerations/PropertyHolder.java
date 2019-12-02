package com.epam.support_farmeworks.enumerations;

import org.aeonbits.owner.ConfigFactory;

import java.util.Random;

public class  PropertyHolder {
    CuteLevelPropsGet cuteLevel = ConfigFactory.create(CuteLevelPropsGet.class);;
    CaloriePropsGet calories  = ConfigFactory.create(CaloriePropsGet.class);

    public CuteLevel getCuteLevel() {
        Random random = new Random();
        int i = random.nextInt(4);
        if (i == 1) {
            return getCuteLevel(Integer.parseInt(cuteLevel.getFirstVal()));
        } else if (i == 2) {
            return getCuteLevel(Integer.parseInt(cuteLevel.getSecondVal()));
        } else if (i == 3) {
            return getCuteLevel(Integer.parseInt(cuteLevel.getFourthVal()));
        } else {
            return getCuteLevel(Integer.parseInt(cuteLevel.getThirdVal()));
        }
    }

    public String getCalories() {
        Random random = new Random();
        int i = random.nextInt(4);
        if (i == 1) {
            return calories.getFirstVal();
        } else if (i == 2) {
            return calories.getSecondVal();
        } else if (i == 3) {
            return calories.getFourthVal();
        } else {
            return calories.getThirdVal();
        }
    }

    private CuteLevel getCuteLevel(int i){
        if (i == 1) {
            return CuteLevel.LITTLE_KITTY;
        } else if (i == 2) {
            return CuteLevel.JUST_A_CAT;
        } else if (i == 3) {
            return CuteLevel.GOOD_CAT;
        } else {
            return CuteLevel.BAD_CAT;
        }
    }

}
