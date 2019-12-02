package com.epam.support_farmeworks.enumerations;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

@Config.Sources("classpath:cute-levels.properties")
public interface CuteLevelPropsGet extends Config {
    @DefaultValue("noVal1")
    @Key("one.prop")
    String getFirstVal();

    @Key("two.prop")
    String getSecondVal();

    @Key("tree.prop")
    String getThirdVal();

    @Key("four.prop")
    String getFourthVal();

    CuteLevelPropsGet props = ConfigFactory.create(CuteLevelPropsGet.class);
}
