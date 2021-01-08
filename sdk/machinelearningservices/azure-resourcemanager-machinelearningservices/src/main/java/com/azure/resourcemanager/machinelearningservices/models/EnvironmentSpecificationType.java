// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for EnvironmentSpecificationType. */
public final class EnvironmentSpecificationType extends ExpandableStringEnum<EnvironmentSpecificationType> {
    /** Static value Curated for EnvironmentSpecificationType. */
    public static final EnvironmentSpecificationType CURATED = fromString("Curated");

    /** Static value UserCreated for EnvironmentSpecificationType. */
    public static final EnvironmentSpecificationType USER_CREATED = fromString("UserCreated");

    /**
     * Creates or finds a EnvironmentSpecificationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EnvironmentSpecificationType.
     */
    @JsonCreator
    public static EnvironmentSpecificationType fromString(String name) {
        return fromString(name, EnvironmentSpecificationType.class);
    }

    /** @return known EnvironmentSpecificationType values. */
    public static Collection<EnvironmentSpecificationType> values() {
        return values(EnvironmentSpecificationType.class);
    }
}
