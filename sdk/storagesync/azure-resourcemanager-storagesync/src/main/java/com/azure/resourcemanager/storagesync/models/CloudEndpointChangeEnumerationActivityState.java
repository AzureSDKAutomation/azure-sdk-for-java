// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagesync.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CloudEndpointChangeEnumerationActivityState. */
public final class CloudEndpointChangeEnumerationActivityState
    extends ExpandableStringEnum<CloudEndpointChangeEnumerationActivityState> {
    /** Static value InitialEnumerationInProgress for CloudEndpointChangeEnumerationActivityState. */
    public static final CloudEndpointChangeEnumerationActivityState INITIAL_ENUMERATION_IN_PROGRESS =
        fromString("InitialEnumerationInProgress");

    /** Static value EnumerationInProgress for CloudEndpointChangeEnumerationActivityState. */
    public static final CloudEndpointChangeEnumerationActivityState ENUMERATION_IN_PROGRESS =
        fromString("EnumerationInProgress");

    /** Static value Delayed for CloudEndpointChangeEnumerationActivityState. */
    public static final CloudEndpointChangeEnumerationActivityState DELAYED = fromString("Delayed");

    /**
     * Creates or finds a CloudEndpointChangeEnumerationActivityState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CloudEndpointChangeEnumerationActivityState.
     */
    @JsonCreator
    public static CloudEndpointChangeEnumerationActivityState fromString(String name) {
        return fromString(name, CloudEndpointChangeEnumerationActivityState.class);
    }

    /** @return known CloudEndpointChangeEnumerationActivityState values. */
    public static Collection<CloudEndpointChangeEnumerationActivityState> values() {
        return values(CloudEndpointChangeEnumerationActivityState.class);
    }
}
