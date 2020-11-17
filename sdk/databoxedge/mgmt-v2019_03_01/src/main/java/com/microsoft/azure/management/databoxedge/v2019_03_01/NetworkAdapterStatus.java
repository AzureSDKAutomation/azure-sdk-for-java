/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_03_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for NetworkAdapterStatus.
 */
public final class NetworkAdapterStatus extends ExpandableStringEnum<NetworkAdapterStatus> {
    /** Static value Inactive for NetworkAdapterStatus. */
    public static final NetworkAdapterStatus INACTIVE = fromString("Inactive");

    /** Static value Active for NetworkAdapterStatus. */
    public static final NetworkAdapterStatus ACTIVE = fromString("Active");

    /**
     * Creates or finds a NetworkAdapterStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding NetworkAdapterStatus
     */
    @JsonCreator
    public static NetworkAdapterStatus fromString(String name) {
        return fromString(name, NetworkAdapterStatus.class);
    }

    /**
     * @return known NetworkAdapterStatus values
     */
    public static Collection<NetworkAdapterStatus> values() {
        return values(NetworkAdapterStatus.class);
    }
}
