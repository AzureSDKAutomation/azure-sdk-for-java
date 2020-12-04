/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.postgresql.v2020_10_05_privatepreview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ServerState.
 */
public final class ServerState extends ExpandableStringEnum<ServerState> {
    /** Static value Ready for ServerState. */
    public static final ServerState READY = fromString("Ready");

    /** Static value Dropping for ServerState. */
    public static final ServerState DROPPING = fromString("Dropping");

    /** Static value Disabled for ServerState. */
    public static final ServerState DISABLED = fromString("Disabled");

    /** Static value Starting for ServerState. */
    public static final ServerState STARTING = fromString("Starting");

    /** Static value Stopping for ServerState. */
    public static final ServerState STOPPING = fromString("Stopping");

    /** Static value Stopped for ServerState. */
    public static final ServerState STOPPED = fromString("Stopped");

    /** Static value Updating for ServerState. */
    public static final ServerState UPDATING = fromString("Updating");

    /** Static value Provisioning for ServerState. */
    public static final ServerState PROVISIONING = fromString("Provisioning");

    /**
     * Creates or finds a ServerState from its string representation.
     * @param name a name to look for
     * @return the corresponding ServerState
     */
    @JsonCreator
    public static ServerState fromString(String name) {
        return fromString(name, ServerState.class);
    }

    /**
     * @return known ServerState values
     */
    public static Collection<ServerState> values() {
        return values(ServerState.class);
    }
}
