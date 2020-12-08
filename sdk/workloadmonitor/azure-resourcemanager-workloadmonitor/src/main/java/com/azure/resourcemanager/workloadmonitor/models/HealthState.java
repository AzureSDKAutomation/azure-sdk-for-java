// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloadmonitor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for HealthState. */
public final class HealthState extends ExpandableStringEnum<HealthState> {
    /** Static value Healthy for HealthState. */
    public static final HealthState HEALTHY = fromString("Healthy");

    /** Static value Critical for HealthState. */
    public static final HealthState CRITICAL = fromString("Critical");

    /** Static value Warning for HealthState. */
    public static final HealthState WARNING = fromString("Warning");

    /** Static value Unknown for HealthState. */
    public static final HealthState UNKNOWN = fromString("Unknown");

    /** Static value Disabled for HealthState. */
    public static final HealthState DISABLED = fromString("Disabled");

    /** Static value None for HealthState. */
    public static final HealthState NONE = fromString("None");

    /**
     * Creates or finds a HealthState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding HealthState.
     */
    @JsonCreator
    public static HealthState fromString(String name) {
        return fromString(name, HealthState.class);
    }

    /** @return known HealthState values. */
    public static Collection<HealthState> values() {
        return values(HealthState.class);
    }
}
