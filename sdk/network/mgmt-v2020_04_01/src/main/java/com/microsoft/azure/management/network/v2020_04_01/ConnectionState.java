/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ConnectionState.
 */
public final class ConnectionState extends ExpandableStringEnum<ConnectionState> {
    /** Static value Reachable for ConnectionState. */
    public static final ConnectionState REACHABLE = fromString("Reachable");

    /** Static value Unreachable for ConnectionState. */
    public static final ConnectionState UNREACHABLE = fromString("Unreachable");

    /** Static value Unknown for ConnectionState. */
    public static final ConnectionState UNKNOWN = fromString("Unknown");

    /**
     * Creates or finds a ConnectionState from its string representation.
     * @param name a name to look for
     * @return the corresponding ConnectionState
     */
    @JsonCreator
    public static ConnectionState fromString(String name) {
        return fromString(name, ConnectionState.class);
    }

    /**
     * @return known ConnectionState values
     */
    public static Collection<ConnectionState> values() {
        return values(ConnectionState.class);
    }
}
