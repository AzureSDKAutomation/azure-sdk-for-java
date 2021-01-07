// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.RecoveryPointsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.AadPropertiesResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.CrrAccessTokenResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.RecoveryPointResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.CrrAccessTokenResource;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointResource;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPoints;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class RecoveryPointsImpl implements RecoveryPoints {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RecoveryPointsImpl.class);

    private final RecoveryPointsClient innerClient;

    private final RecoveryServicesBackupManager serviceManager;

    public RecoveryPointsImpl(RecoveryPointsClient innerClient, RecoveryServicesBackupManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<RecoveryPointResource> list(
        String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName) {
        PagedIterable<RecoveryPointResourceInner> inner =
            this.serviceClient().list(vaultName, resourceGroupName, fabricName, containerName, protectedItemName);
        return inner.mapPage(inner1 -> new RecoveryPointResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<RecoveryPointResource> list(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String filter,
        Context context) {
        PagedIterable<RecoveryPointResourceInner> inner =
            this
                .serviceClient()
                .list(vaultName, resourceGroupName, fabricName, containerName, protectedItemName, filter, context);
        return inner.mapPage(inner1 -> new RecoveryPointResourceImpl(inner1, this.manager()));
    }

    public RecoveryPointResource get(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String recoveryPointId) {
        RecoveryPointResourceInner inner =
            this
                .serviceClient()
                .get(vaultName, resourceGroupName, fabricName, containerName, protectedItemName, recoveryPointId);
        if (inner != null) {
            return new RecoveryPointResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RecoveryPointResource> getWithResponse(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String recoveryPointId,
        Context context) {
        Response<RecoveryPointResourceInner> inner =
            this
                .serviceClient()
                .getWithResponse(
                    vaultName,
                    resourceGroupName,
                    fabricName,
                    containerName,
                    protectedItemName,
                    recoveryPointId,
                    context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RecoveryPointResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CrrAccessTokenResource getAccessToken(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String recoveryPointId,
        AadPropertiesResourceInner parameters) {
        CrrAccessTokenResourceInner inner =
            this
                .serviceClient()
                .getAccessToken(
                    vaultName,
                    resourceGroupName,
                    fabricName,
                    containerName,
                    protectedItemName,
                    recoveryPointId,
                    parameters);
        if (inner != null) {
            return new CrrAccessTokenResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CrrAccessTokenResource> getAccessTokenWithResponse(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String recoveryPointId,
        AadPropertiesResourceInner parameters,
        Context context) {
        Response<CrrAccessTokenResourceInner> inner =
            this
                .serviceClient()
                .getAccessTokenWithResponse(
                    vaultName,
                    resourceGroupName,
                    fabricName,
                    containerName,
                    protectedItemName,
                    recoveryPointId,
                    parameters,
                    context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CrrAccessTokenResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private RecoveryPointsClient serviceClient() {
        return this.innerClient;
    }

    private RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}
