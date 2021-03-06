// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.quantum.jobs.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MeterPeriod. */
public final class MeterPeriod extends ExpandableStringEnum<MeterPeriod> {
    /** Static value None for MeterPeriod. */
    public static final MeterPeriod NONE = fromString("None");

    /** Static value Monthly for MeterPeriod. */
    public static final MeterPeriod MONTHLY = fromString("Monthly");

    /**
     * Creates or finds a MeterPeriod from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MeterPeriod.
     */
    @JsonCreator
    public static MeterPeriod fromString(String name) {
        return fromString(name, MeterPeriod.class);
    }

    /** @return known MeterPeriod values. */
    public static Collection<MeterPeriod> values() {
        return values(MeterPeriod.class);
    }
}
