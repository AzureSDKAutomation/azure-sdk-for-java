// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.fluent.WorkspaceManagedIdentitySqlControlSettingsClient;
import com.azure.resourcemanager.synapse.fluent.models.ManagedIdentitySqlControlSettingsModelInner;
import com.azure.resourcemanager.synapse.models.ManagedIdentitySqlControlSettingsModel;
import com.azure.resourcemanager.synapse.models.WorkspaceManagedIdentitySqlControlSettings;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class WorkspaceManagedIdentitySqlControlSettingsImpl
    implements WorkspaceManagedIdentitySqlControlSettings {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(WorkspaceManagedIdentitySqlControlSettingsImpl.class);

    private final WorkspaceManagedIdentitySqlControlSettingsClient innerClient;

    private final SynapseManager serviceManager;

    public WorkspaceManagedIdentitySqlControlSettingsImpl(
        WorkspaceManagedIdentitySqlControlSettingsClient innerClient, SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ManagedIdentitySqlControlSettingsModel get(String resourceGroupName, String workspaceName) {
        ManagedIdentitySqlControlSettingsModelInner inner = this.serviceClient().get(resourceGroupName, workspaceName);
        if (inner != null) {
            return new ManagedIdentitySqlControlSettingsModelImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ManagedIdentitySqlControlSettingsModel> getWithResponse(
        String resourceGroupName, String workspaceName, Context context) {
        Response<ManagedIdentitySqlControlSettingsModelInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, workspaceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ManagedIdentitySqlControlSettingsModelImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ManagedIdentitySqlControlSettingsModel createOrUpdate(
        String resourceGroupName,
        String workspaceName,
        ManagedIdentitySqlControlSettingsModelInner managedIdentitySqlControlSettings) {
        ManagedIdentitySqlControlSettingsModelInner inner =
            this.serviceClient().createOrUpdate(resourceGroupName, workspaceName, managedIdentitySqlControlSettings);
        if (inner != null) {
            return new ManagedIdentitySqlControlSettingsModelImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ManagedIdentitySqlControlSettingsModel createOrUpdate(
        String resourceGroupName,
        String workspaceName,
        ManagedIdentitySqlControlSettingsModelInner managedIdentitySqlControlSettings,
        Context context) {
        ManagedIdentitySqlControlSettingsModelInner inner =
            this
                .serviceClient()
                .createOrUpdate(resourceGroupName, workspaceName, managedIdentitySqlControlSettings, context);
        if (inner != null) {
            return new ManagedIdentitySqlControlSettingsModelImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private WorkspaceManagedIdentitySqlControlSettingsClient serviceClient() {
        return this.innerClient;
    }

    private SynapseManager manager() {
        return this.serviceManager;
    }
}