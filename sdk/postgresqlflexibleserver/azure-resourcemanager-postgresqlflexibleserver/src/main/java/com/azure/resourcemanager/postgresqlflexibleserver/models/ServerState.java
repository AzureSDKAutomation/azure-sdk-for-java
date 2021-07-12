// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ServerState. */
public final class ServerState extends ExpandableStringEnum<ServerState> {
    /** Static value Ready for ServerState. */
    public static final ServerState READY = fromString("Ready");

    /** Static value Dropping for ServerState. */
    public static final ServerState DROPPING = fromString("Dropping");

    /** Static value Disabled for ServerState. */
    public static final ServerState DISABLED = fromString("Disabled");

    /** Static value Inaccessible for ServerState. */
    public static final ServerState INACCESSIBLE = fromString("Inaccessible");

    /**
     * Creates or finds a ServerState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ServerState.
     */
    @JsonCreator
    public static ServerState fromString(String name) {
        return fromString(name, ServerState.class);
    }

    /** @return known ServerState values. */
    public static Collection<ServerState> values() {
        return values(ServerState.class);
    }
}
