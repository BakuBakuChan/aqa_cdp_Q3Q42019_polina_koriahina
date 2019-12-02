package com.epam.support_farmeworks.main;

import com.epam.support_farmeworks.*;
import com.epam.support_farmeworks.animals.Kitty;
import com.epam.support_farmeworks.enumerations.*;
import com.epam.support_farmeworks.food.EatCharacteristic;
import com.epam.support_farmeworks.food.KittyCat;
import com.epam.support_farmeworks.humans.Owner;
import lombok.Cleanup;
import org.aeonbits.owner.ConfigFactory;
import sun.security.krb5.Config;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        PropertyHolder propertyHolder = new PropertyHolder();
        EatCharacteristic characteristic = EatCharacteristic.createCharacteristic().catPosition(CatPosition.SITS).dayPart(DayPart.DAY).eaten(0.0).build();
        Owner owner = new Owner();
        owner.setName("Jhon");
        owner.setLastName("lname");
        owner.setAge(random.nextInt(100));

        KittyCat food = new KittyCat("name",random.nextDouble()*10);

        @Cleanup("killCat") Kitty newone = new Kitty("hjbj", random.nextInt(10),owner,propertyHolder.getCuteLevel());
        newone.setKittyCatDailyFood(food);
        newone.eatFood(characteristic);


    }
}
