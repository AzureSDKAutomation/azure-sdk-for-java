// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ScalingScheduleDaysOfWeekItem. */
public final class ScalingScheduleDaysOfWeekItem extends ExpandableStringEnum<ScalingScheduleDaysOfWeekItem> {
    /** Static value Sunday for ScalingScheduleDaysOfWeekItem. */
    public static final ScalingScheduleDaysOfWeekItem SUNDAY = fromString("Sunday");

    /** Static value Monday for ScalingScheduleDaysOfWeekItem. */
    public static final ScalingScheduleDaysOfWeekItem MONDAY = fromString("Monday");

    /** Static value Tuesday for ScalingScheduleDaysOfWeekItem. */
    public static final ScalingScheduleDaysOfWeekItem TUESDAY = fromString("Tuesday");

    /** Static value Wednesday for ScalingScheduleDaysOfWeekItem. */
    public static final ScalingScheduleDaysOfWeekItem WEDNESDAY = fromString("Wednesday");

    /** Static value Thursday for ScalingScheduleDaysOfWeekItem. */
    public static final ScalingScheduleDaysOfWeekItem THURSDAY = fromString("Thursday");

    /** Static value Friday for ScalingScheduleDaysOfWeekItem. */
    public static final ScalingScheduleDaysOfWeekItem FRIDAY = fromString("Friday");

    /** Static value Saturday for ScalingScheduleDaysOfWeekItem. */
    public static final ScalingScheduleDaysOfWeekItem SATURDAY = fromString("Saturday");

    /**
     * Creates or finds a ScalingScheduleDaysOfWeekItem from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ScalingScheduleDaysOfWeekItem.
     */
    @JsonCreator
    public static ScalingScheduleDaysOfWeekItem fromString(String name) {
        return fromString(name, ScalingScheduleDaysOfWeekItem.class);
    }

    /** @return known ScalingScheduleDaysOfWeekItem values. */
    public static Collection<ScalingScheduleDaysOfWeekItem> values() {
        return values(ScalingScheduleDaysOfWeekItem.class);
    }
}
