// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.MigrationRecoveryPointsClient;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.MigrationRecoveryPointInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.MigrationRecoveryPoint;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.MigrationRecoveryPoints;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class MigrationRecoveryPointsImpl implements MigrationRecoveryPoints {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MigrationRecoveryPointsImpl.class);

    private final MigrationRecoveryPointsClient innerClient;

    private final SiteRecoveryManager serviceManager;

    public MigrationRecoveryPointsImpl(MigrationRecoveryPointsClient innerClient, SiteRecoveryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<MigrationRecoveryPoint> listByReplicationMigrationItems(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName) {
        PagedIterable<MigrationRecoveryPointInner> inner =
            this
                .serviceClient()
                .listByReplicationMigrationItems(
                    resourceName, resourceGroupName, fabricName, protectionContainerName, migrationItemName);
        return Utils.mapPage(inner, inner1 -> new MigrationRecoveryPointImpl(inner1, this.manager()));
    }

    public PagedIterable<MigrationRecoveryPoint> listByReplicationMigrationItems(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        Context context) {
        PagedIterable<MigrationRecoveryPointInner> inner =
            this
                .serviceClient()
                .listByReplicationMigrationItems(
                    resourceName, resourceGroupName, fabricName, protectionContainerName, migrationItemName, context);
        return Utils.mapPage(inner, inner1 -> new MigrationRecoveryPointImpl(inner1, this.manager()));
    }

    public MigrationRecoveryPoint get(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        String migrationRecoveryPointName) {
        MigrationRecoveryPointInner inner =
            this
                .serviceClient()
                .get(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    migrationItemName,
                    migrationRecoveryPointName);
        if (inner != null) {
            return new MigrationRecoveryPointImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<MigrationRecoveryPoint> getWithResponse(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        String migrationRecoveryPointName,
        Context context) {
        Response<MigrationRecoveryPointInner> inner =
            this
                .serviceClient()
                .getWithResponse(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    migrationItemName,
                    migrationRecoveryPointName,
                    context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new MigrationRecoveryPointImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private MigrationRecoveryPointsClient serviceClient() {
        return this.innerClient;
    }

    private SiteRecoveryManager manager() {
        return this.serviceManager;
    }
}
