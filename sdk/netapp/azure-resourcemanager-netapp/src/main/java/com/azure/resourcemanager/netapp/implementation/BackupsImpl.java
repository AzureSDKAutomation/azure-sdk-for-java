// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.netapp.NetAppManager;
import com.azure.resourcemanager.netapp.fluent.BackupsClient;
import com.azure.resourcemanager.netapp.fluent.models.BackupInner;
import com.azure.resourcemanager.netapp.models.Backup;
import com.azure.resourcemanager.netapp.models.Backups;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class BackupsImpl implements Backups {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BackupsImpl.class);

    private final BackupsClient innerClient;

    private final NetAppManager serviceManager;

    public BackupsImpl(BackupsClient innerClient, NetAppManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Backup> list(
        String resourceGroupName, String accountName, String poolName, String volumeName) {
        PagedIterable<BackupInner> inner =
            this.serviceClient().list(resourceGroupName, accountName, poolName, volumeName);
        return inner.mapPage(inner1 -> new BackupImpl(inner1, this.manager()));
    }

    public PagedIterable<Backup> list(
        String resourceGroupName, String accountName, String poolName, String volumeName, Context context) {
        PagedIterable<BackupInner> inner =
            this.serviceClient().list(resourceGroupName, accountName, poolName, volumeName, context);
        return inner.mapPage(inner1 -> new BackupImpl(inner1, this.manager()));
    }

    public Backup get(
        String resourceGroupName, String accountName, String poolName, String volumeName, String backupName) {
        BackupInner inner = this.serviceClient().get(resourceGroupName, accountName, poolName, volumeName, backupName);
        if (inner != null) {
            return new BackupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Backup> getWithResponse(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        String backupName,
        Context context) {
        Response<BackupInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, accountName, poolName, volumeName, backupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new BackupImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(
        String resourceGroupName, String accountName, String poolName, String volumeName, String backupName) {
        this.serviceClient().delete(resourceGroupName, accountName, poolName, volumeName, backupName);
    }

    public void delete(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        String backupName,
        Context context) {
        this.serviceClient().delete(resourceGroupName, accountName, poolName, volumeName, backupName, context);
    }

    public Backup getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String poolName = Utils.getValueFromIdByName(id, "capacityPools");
        if (poolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'capacityPools'.", id)));
        }
        String volumeName = Utils.getValueFromIdByName(id, "volumes");
        if (volumeName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'volumes'.", id)));
        }
        String backupName = Utils.getValueFromIdByName(id, "backups");
        if (backupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'backups'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, accountName, poolName, volumeName, backupName, Context.NONE)
            .getValue();
    }

    public Response<Backup> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String poolName = Utils.getValueFromIdByName(id, "capacityPools");
        if (poolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'capacityPools'.", id)));
        }
        String volumeName = Utils.getValueFromIdByName(id, "volumes");
        if (volumeName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'volumes'.", id)));
        }
        String backupName = Utils.getValueFromIdByName(id, "backups");
        if (backupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'backups'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, poolName, volumeName, backupName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String poolName = Utils.getValueFromIdByName(id, "capacityPools");
        if (poolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'capacityPools'.", id)));
        }
        String volumeName = Utils.getValueFromIdByName(id, "volumes");
        if (volumeName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'volumes'.", id)));
        }
        String backupName = Utils.getValueFromIdByName(id, "backups");
        if (backupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'backups'.", id)));
        }
        this.delete(resourceGroupName, accountName, poolName, volumeName, backupName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String poolName = Utils.getValueFromIdByName(id, "capacityPools");
        if (poolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'capacityPools'.", id)));
        }
        String volumeName = Utils.getValueFromIdByName(id, "volumes");
        if (volumeName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'volumes'.", id)));
        }
        String backupName = Utils.getValueFromIdByName(id, "backups");
        if (backupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'backups'.", id)));
        }
        this.delete(resourceGroupName, accountName, poolName, volumeName, backupName, context);
    }

    private BackupsClient serviceClient() {
        return this.innerClient;
    }

    private NetAppManager manager() {
        return this.serviceManager;
    }

    public BackupImpl define(String name) {
        return new BackupImpl(name, this.manager());
    }
}
