// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for NetworkApiVersion. */
public final class NetworkApiVersion extends ExpandableStringEnum<NetworkApiVersion> {
    /** Static value 2020-11-01 for NetworkApiVersion. */
    public static final NetworkApiVersion TWO_ZERO_TWO_ZERO_ONE_ONE_ZERO_ONE = fromString("2020-11-01");

    /**
     * Creates or finds a NetworkApiVersion from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NetworkApiVersion.
     */
    @JsonCreator
    public static NetworkApiVersion fromString(String name) {
        return fromString(name, NetworkApiVersion.class);
    }

    /** @return known NetworkApiVersion values. */
    public static Collection<NetworkApiVersion> values() {
        return values(NetworkApiVersion.class);
    }
}
