package com.epam.support_farmeworks.food;

import com.sun.istack.internal.NotNull;
import lombok.*;

@ToString(exclude = "calorieContent")
@RequiredArgsConstructor
@EqualsAndHashCode(doNotUseGetters = true)
@Getter
@Setter
public class KittyCat {
    private @NonNull
    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.NONE)
    String name;
    private @NonNull
    double weight;
    private float calorieContent;
}
