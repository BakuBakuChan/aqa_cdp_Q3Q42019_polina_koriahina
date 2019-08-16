package com.epam.support_farmeworks.enumerations;

public enum CuteLevel {
    JUST_A_CAT,
    LITTLE_KITTY,
    GOOD_CAT,
    BAD_CAT;

    @Override
    public String toString() {
        return name().substring(0, 1).concat(name().substring(1).toLowerCase().replace("_", " "));
    }
}
