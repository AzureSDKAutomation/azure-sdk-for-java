// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.ReplicationVaultSettingsClient;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.VaultSettingInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationVaultSettings;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.VaultSetting;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ReplicationVaultSettingsImpl implements ReplicationVaultSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ReplicationVaultSettingsImpl.class);

    private final ReplicationVaultSettingsClient innerClient;

    private final com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager;

    public ReplicationVaultSettingsImpl(
        ReplicationVaultSettingsClient innerClient,
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<VaultSetting> list(String resourceName, String resourceGroupName) {
        PagedIterable<VaultSettingInner> inner = this.serviceClient().list(resourceName, resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new VaultSettingImpl(inner1, this.manager()));
    }

    public PagedIterable<VaultSetting> list(String resourceName, String resourceGroupName, Context context) {
        PagedIterable<VaultSettingInner> inner = this.serviceClient().list(resourceName, resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new VaultSettingImpl(inner1, this.manager()));
    }

    public VaultSetting get(String resourceName, String resourceGroupName, String vaultSettingName) {
        VaultSettingInner inner = this.serviceClient().get(resourceName, resourceGroupName, vaultSettingName);
        if (inner != null) {
            return new VaultSettingImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VaultSetting> getWithResponse(
        String resourceName, String resourceGroupName, String vaultSettingName, Context context) {
        Response<VaultSettingInner> inner =
            this.serviceClient().getWithResponse(resourceName, resourceGroupName, vaultSettingName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VaultSettingImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public VaultSetting getById(String id) {
        String resourceName = Utils.getValueFromIdByName(id, "vaults");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'vaults'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vaultSettingName = Utils.getValueFromIdByName(id, "replicationVaultSettings");
        if (vaultSettingName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'replicationVaultSettings'.",
                                id)));
        }
        return this.getWithResponse(resourceName, resourceGroupName, vaultSettingName, Context.NONE).getValue();
    }

    public Response<VaultSetting> getByIdWithResponse(String id, Context context) {
        String resourceName = Utils.getValueFromIdByName(id, "vaults");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'vaults'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vaultSettingName = Utils.getValueFromIdByName(id, "replicationVaultSettings");
        if (vaultSettingName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'replicationVaultSettings'.",
                                id)));
        }
        return this.getWithResponse(resourceName, resourceGroupName, vaultSettingName, context);
    }

    private ReplicationVaultSettingsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager() {
        return this.serviceManager;
    }

    public VaultSettingImpl define(String name) {
        return new VaultSettingImpl(name, this.manager());
    }
}
