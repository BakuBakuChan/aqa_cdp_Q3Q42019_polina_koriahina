package com.epam.support_farmeworks.animals;

import lombok.*;

@Getter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(exclude = "weight")
public abstract class Animals {
    private @EqualsAndHashCode.Include
    String name;
    private @EqualsAndHashCode.Include
    @Setter
    float weight;
}
