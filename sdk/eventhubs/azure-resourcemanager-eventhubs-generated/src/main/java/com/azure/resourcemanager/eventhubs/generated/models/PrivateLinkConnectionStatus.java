// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PrivateLinkConnectionStatus. */
public final class PrivateLinkConnectionStatus extends ExpandableStringEnum<PrivateLinkConnectionStatus> {
    /** Static value Pending for PrivateLinkConnectionStatus. */
    public static final PrivateLinkConnectionStatus PENDING = fromString("Pending");

    /** Static value Approved for PrivateLinkConnectionStatus. */
    public static final PrivateLinkConnectionStatus APPROVED = fromString("Approved");

    /** Static value Rejected for PrivateLinkConnectionStatus. */
    public static final PrivateLinkConnectionStatus REJECTED = fromString("Rejected");

    /** Static value Disconnected for PrivateLinkConnectionStatus. */
    public static final PrivateLinkConnectionStatus DISCONNECTED = fromString("Disconnected");

    /**
     * Creates or finds a PrivateLinkConnectionStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PrivateLinkConnectionStatus.
     */
    @JsonCreator
    public static PrivateLinkConnectionStatus fromString(String name) {
        return fromString(name, PrivateLinkConnectionStatus.class);
    }

    /** @return known PrivateLinkConnectionStatus values. */
    public static Collection<PrivateLinkConnectionStatus> values() {
        return values(PrivateLinkConnectionStatus.class);
    }
}
