// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.netapp.NetAppFilesManager;
import com.azure.resourcemanager.netapp.fluent.VolumeBackupStatusClient;
import com.azure.resourcemanager.netapp.fluent.models.BackupStatusInner;
import com.azure.resourcemanager.netapp.models.BackupStatus;
import com.azure.resourcemanager.netapp.models.VolumeBackupStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class VolumeBackupStatusImpl implements VolumeBackupStatus {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VolumeBackupStatusImpl.class);

    private final VolumeBackupStatusClient innerClient;

    private final NetAppFilesManager serviceManager;

    public VolumeBackupStatusImpl(VolumeBackupStatusClient innerClient, NetAppFilesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public BackupStatus get(String resourceGroupName, String accountName, String poolName, String volumeName) {
        BackupStatusInner inner = this.serviceClient().get(resourceGroupName, accountName, poolName, volumeName);
        if (inner != null) {
            return new BackupStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<BackupStatus> getWithResponse(
        String resourceGroupName, String accountName, String poolName, String volumeName, Context context) {
        Response<BackupStatusInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, poolName, volumeName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new BackupStatusImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private VolumeBackupStatusClient serviceClient() {
        return this.innerClient;
    }

    private NetAppFilesManager manager() {
        return this.serviceManager;
    }
}
