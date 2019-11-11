package com.epam.support_farmeworks.main;

import com.epam.support_farmeworks.*;
import com.epam.support_farmeworks.enumerations.CatPosition;
import com.epam.support_farmeworks.enumerations.CuteLevel;
import com.epam.support_farmeworks.enumerations.CuteLevelPropsGet;
import com.epam.support_farmeworks.enumerations.DayPart;
import com.epam.support_farmeworks.food.EatCharacteristic;
import com.epam.support_farmeworks.food.KittyCat;
import com.epam.support_farmeworks.humans.Owner;
import lombok.Cleanup;
import org.aeonbits.owner.ConfigFactory;
import sun.security.krb5.Config;

public class Main {
    public static void main(String[] args) {
//        EatCharacteristic characteristic = EatCharacteristic.createCharacteristic().catPosition(CatPosition.SITS).dayPart(DayPart.DAY).eaten(0.0).build();
//        Owner owner = new Owner();
//        owner.setName("Jhon");
//        owner.setLastName("lname");
//        owner.setAge(20);
//
//        KittyCat food = new KittyCat("name",0.4);
//
//        @Cleanup("killCat") Kitty newone = new Kitty("hjbj", 3,owner, CuteLevel.GOOD_CAT);
//        newone.setKittyCatDailyFood(food);
//        newone.eatFood(characteristic);

        CuteLevelPropsGet props = ConfigFactory.create(CuteLevelPropsGet.class);
        System.out.println(props.getSecondVal());
        System.out.println(props.getFirstVal());

    }
}
