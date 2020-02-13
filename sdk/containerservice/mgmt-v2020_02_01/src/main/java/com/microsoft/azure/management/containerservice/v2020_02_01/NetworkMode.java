/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_02_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for NetworkMode.
 */
public final class NetworkMode extends ExpandableStringEnum<NetworkMode> {
    /** Static value transparent for NetworkMode. */
    public static final NetworkMode TRANSPARENT = fromString("transparent");

    /** Static value bridge for NetworkMode. */
    public static final NetworkMode BRIDGE = fromString("bridge");

    /**
     * Creates or finds a NetworkMode from its string representation.
     * @param name a name to look for
     * @return the corresponding NetworkMode
     */
    @JsonCreator
    public static NetworkMode fromString(String name) {
        return fromString(name, NetworkMode.class);
    }

    /**
     * @return known NetworkMode values
     */
    public static Collection<NetworkMode> values() {
        return values(NetworkMode.class);
    }
}
