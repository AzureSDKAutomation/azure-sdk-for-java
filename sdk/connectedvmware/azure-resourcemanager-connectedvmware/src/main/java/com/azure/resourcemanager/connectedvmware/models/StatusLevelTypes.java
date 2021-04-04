// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for StatusLevelTypes. */
public final class StatusLevelTypes extends ExpandableStringEnum<StatusLevelTypes> {
    /** Static value Info for StatusLevelTypes. */
    public static final StatusLevelTypes INFO = fromString("Info");

    /** Static value Warning for StatusLevelTypes. */
    public static final StatusLevelTypes WARNING = fromString("Warning");

    /** Static value Error for StatusLevelTypes. */
    public static final StatusLevelTypes ERROR = fromString("Error");

    /**
     * Creates or finds a StatusLevelTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding StatusLevelTypes.
     */
    @JsonCreator
    public static StatusLevelTypes fromString(String name) {
        return fromString(name, StatusLevelTypes.class);
    }

    /** @return known StatusLevelTypes values. */
    public static Collection<StatusLevelTypes> values() {
        return values(StatusLevelTypes.class);
    }
}
