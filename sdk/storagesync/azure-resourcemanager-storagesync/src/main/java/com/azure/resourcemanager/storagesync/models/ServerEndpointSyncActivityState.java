// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagesync.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ServerEndpointSyncActivityState. */
public final class ServerEndpointSyncActivityState extends ExpandableStringEnum<ServerEndpointSyncActivityState> {
    /** Static value Upload for ServerEndpointSyncActivityState. */
    public static final ServerEndpointSyncActivityState UPLOAD = fromString("Upload");

    /** Static value Download for ServerEndpointSyncActivityState. */
    public static final ServerEndpointSyncActivityState DOWNLOAD = fromString("Download");

    /** Static value UploadAndDownload for ServerEndpointSyncActivityState. */
    public static final ServerEndpointSyncActivityState UPLOAD_AND_DOWNLOAD = fromString("UploadAndDownload");

    /**
     * Creates or finds a ServerEndpointSyncActivityState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ServerEndpointSyncActivityState.
     */
    @JsonCreator
    public static ServerEndpointSyncActivityState fromString(String name) {
        return fromString(name, ServerEndpointSyncActivityState.class);
    }

    /** @return known ServerEndpointSyncActivityState values. */
    public static Collection<ServerEndpointSyncActivityState> values() {
        return values(ServerEndpointSyncActivityState.class);
    }
}
