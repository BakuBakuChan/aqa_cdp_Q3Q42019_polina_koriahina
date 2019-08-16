package com.epam.support_farmeworks.animals;

import com.epam.support_farmeworks.enumerations.CuteLevel;
import com.epam.support_farmeworks.food.EatCharacteristic;
import com.epam.support_farmeworks.food.KittyCat;
import com.epam.support_farmeworks.humans.Owner;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;

@ToString(callSuper = true)
@Getter
@Setter
@Log4j2
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
public class Kitty extends Animals {
    private @EqualsAndHashCode.Include
    CuteLevel cuteLevel;
    private @EqualsAndHashCode.Include
    Owner owner;
    private KittyCat kittyCatDailyFood;

    public Kitty(String name, float weight) {
        super(name, weight);
        log.info("Kitty was born");
    }

    public void eatFood(EatCharacteristic eatCharacteristic) {

    }

    public void killCat(){

    }
}
