// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagesync.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ServerEndpointOfflineDataTransferState. */
public final class ServerEndpointOfflineDataTransferState
    extends ExpandableStringEnum<ServerEndpointOfflineDataTransferState> {
    /** Static value InProgress for ServerEndpointOfflineDataTransferState. */
    public static final ServerEndpointOfflineDataTransferState IN_PROGRESS = fromString("InProgress");

    /** Static value Stopping for ServerEndpointOfflineDataTransferState. */
    public static final ServerEndpointOfflineDataTransferState STOPPING = fromString("Stopping");

    /** Static value NotRunning for ServerEndpointOfflineDataTransferState. */
    public static final ServerEndpointOfflineDataTransferState NOT_RUNNING = fromString("NotRunning");

    /** Static value Complete for ServerEndpointOfflineDataTransferState. */
    public static final ServerEndpointOfflineDataTransferState COMPLETE = fromString("Complete");

    /**
     * Creates or finds a ServerEndpointOfflineDataTransferState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ServerEndpointOfflineDataTransferState.
     */
    @JsonCreator
    public static ServerEndpointOfflineDataTransferState fromString(String name) {
        return fromString(name, ServerEndpointOfflineDataTransferState.class);
    }

    /** @return known ServerEndpointOfflineDataTransferState values. */
    public static Collection<ServerEndpointOfflineDataTransferState> values() {
        return values(ServerEndpointOfflineDataTransferState.class);
    }
}
