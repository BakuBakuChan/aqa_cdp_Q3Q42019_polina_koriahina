package com.epam.support_farmeworks.animals;

import com.epam.support_farmeworks.enumerations.CuteLevel;
import com.epam.support_farmeworks.food.EatCharacteristic;
import com.epam.support_farmeworks.food.KittyCat;
import com.epam.support_farmeworks.humans.Owner;
import lombok.*;
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

    public Kitty(String name, float weight, Owner owner, CuteLevel cuteLevel) {
        super(name, weight);
        this.owner = owner;
        this.cuteLevel = cuteLevel;
        log.info("Kitty was born");
    }

    public void eatFood(EatCharacteristic eatCharacteristic) {
        if (kittyCatDailyFood.getWeight() > 0.0) {
            double wight = kittyCatDailyFood.getWeight() - eatCharacteristic.getEaten();
            if (wight < 0) {
                wight = 0;
            }
            kittyCatDailyFood.setWeight(wight);
            log.info("Cat eat");
        } else {
            log.warn("Cat worried about food shortage");
        }
    }

    @SneakyThrows(InterruptedException.class)
    public void killCat() {
        log.error("Cat dead");
        if (cuteLevel != CuteLevel.BAD_CAT) {
            log.info(("The master name in sorrow").replace("name", owner.getName()));
        }
        throw new InterruptedException("Cat dead");
    }
}
