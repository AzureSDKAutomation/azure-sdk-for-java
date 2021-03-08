// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SsisLogLocationType. */
public final class SsisLogLocationType extends ExpandableStringEnum<SsisLogLocationType> {
    /** Static value File for SsisLogLocationType. */
    public static final SsisLogLocationType FILE = fromString("File");

    /**
     * Creates or finds a SsisLogLocationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SsisLogLocationType.
     */
    @JsonCreator
    public static SsisLogLocationType fromString(String name) {
        return fromString(name, SsisLogLocationType.class);
    }

    /** @return known SsisLogLocationType values. */
    public static Collection<SsisLogLocationType> values() {
        return values(SsisLogLocationType.class);
    }
}
