// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PlannedFailoverStatus. */
public final class PlannedFailoverStatus extends ExpandableStringEnum<PlannedFailoverStatus> {
    /** Static value Succeeded for PlannedFailoverStatus. */
    public static final PlannedFailoverStatus SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for PlannedFailoverStatus. */
    public static final PlannedFailoverStatus FAILED = fromString("Failed");

    /** Static value Cancelled for PlannedFailoverStatus. */
    public static final PlannedFailoverStatus CANCELLED = fromString("Cancelled");

    /** Static value Unknown for PlannedFailoverStatus. */
    public static final PlannedFailoverStatus UNKNOWN = fromString("Unknown");

    /**
     * Creates or finds a PlannedFailoverStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PlannedFailoverStatus.
     */
    @JsonCreator
    public static PlannedFailoverStatus fromString(String name) {
        return fromString(name, PlannedFailoverStatus.class);
    }

    /** @return known PlannedFailoverStatus values. */
    public static Collection<PlannedFailoverStatus> values() {
        return values(PlannedFailoverStatus.class);
    }
}
