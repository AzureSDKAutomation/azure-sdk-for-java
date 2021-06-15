// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.openai.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for QuotaUsageStatus. */
public final class QuotaUsageStatus extends ExpandableStringEnum<QuotaUsageStatus> {
    /** Static value Included for QuotaUsageStatus. */
    public static final QuotaUsageStatus INCLUDED = fromString("Included");

    /** Static value Blocked for QuotaUsageStatus. */
    public static final QuotaUsageStatus BLOCKED = fromString("Blocked");

    /** Static value InOverage for QuotaUsageStatus. */
    public static final QuotaUsageStatus IN_OVERAGE = fromString("InOverage");

    /** Static value Unknown for QuotaUsageStatus. */
    public static final QuotaUsageStatus UNKNOWN = fromString("Unknown");

    /**
     * Creates or finds a QuotaUsageStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding QuotaUsageStatus.
     */
    @JsonCreator
    public static QuotaUsageStatus fromString(String name) {
        return fromString(name, QuotaUsageStatus.class);
    }

    /** @return known QuotaUsageStatus values. */
    public static Collection<QuotaUsageStatus> values() {
        return values(QuotaUsageStatus.class);
    }
}
