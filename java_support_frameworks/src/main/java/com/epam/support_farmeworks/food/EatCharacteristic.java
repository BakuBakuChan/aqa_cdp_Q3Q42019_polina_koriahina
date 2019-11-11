package com.epam.support_farmeworks.food;

import com.epam.support_farmeworks.enumerations.CatPosition;
import com.epam.support_farmeworks.enumerations.DayPart;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(builderClassName = "FoodCollector", builderMethodName = "createCharacteristic")
public class EatCharacteristic {
    private double eaten;
    private DayPart dayPart;
    private CatPosition catPosition;
}
