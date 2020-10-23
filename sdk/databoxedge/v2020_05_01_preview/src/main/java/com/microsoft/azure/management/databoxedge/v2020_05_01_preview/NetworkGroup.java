/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2020_05_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for NetworkGroup.
 */
public final class NetworkGroup extends ExpandableStringEnum<NetworkGroup> {
    /** Static value None for NetworkGroup. */
    public static final NetworkGroup NONE = fromString("None");

    /** Static value NonRDMA for NetworkGroup. */
    public static final NetworkGroup NON_RDMA = fromString("NonRDMA");

    /** Static value RDMA for NetworkGroup. */
    public static final NetworkGroup RDMA = fromString("RDMA");

    /**
     * Creates or finds a NetworkGroup from its string representation.
     * @param name a name to look for
     * @return the corresponding NetworkGroup
     */
    @JsonCreator
    public static NetworkGroup fromString(String name) {
        return fromString(name, NetworkGroup.class);
    }

    /**
     * @return known NetworkGroup values
     */
    public static Collection<NetworkGroup> values() {
        return values(NetworkGroup.class);
    }
}
