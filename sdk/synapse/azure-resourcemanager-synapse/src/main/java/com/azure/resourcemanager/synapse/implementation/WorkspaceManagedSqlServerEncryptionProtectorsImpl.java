// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.fluent.WorkspaceManagedSqlServerEncryptionProtectorsClient;
import com.azure.resourcemanager.synapse.fluent.models.EncryptionProtectorInner;
import com.azure.resourcemanager.synapse.models.EncryptionProtector;
import com.azure.resourcemanager.synapse.models.EncryptionProtectorName;
import com.azure.resourcemanager.synapse.models.WorkspaceManagedSqlServerEncryptionProtectors;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class WorkspaceManagedSqlServerEncryptionProtectorsImpl
    implements WorkspaceManagedSqlServerEncryptionProtectors {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(WorkspaceManagedSqlServerEncryptionProtectorsImpl.class);

    private final WorkspaceManagedSqlServerEncryptionProtectorsClient innerClient;

    private final SynapseManager serviceManager;

    public WorkspaceManagedSqlServerEncryptionProtectorsImpl(
        WorkspaceManagedSqlServerEncryptionProtectorsClient innerClient, SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public EncryptionProtector get(
        String resourceGroupName, String workspaceName, EncryptionProtectorName encryptionProtectorName) {
        EncryptionProtectorInner inner =
            this.serviceClient().get(resourceGroupName, workspaceName, encryptionProtectorName);
        if (inner != null) {
            return new EncryptionProtectorImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<EncryptionProtector> getWithResponse(
        String resourceGroupName,
        String workspaceName,
        EncryptionProtectorName encryptionProtectorName,
        Context context) {
        Response<EncryptionProtectorInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, workspaceName, encryptionProtectorName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new EncryptionProtectorImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<EncryptionProtector> list(String resourceGroupName, String workspaceName) {
        PagedIterable<EncryptionProtectorInner> inner = this.serviceClient().list(resourceGroupName, workspaceName);
        return inner.mapPage(inner1 -> new EncryptionProtectorImpl(inner1, this.manager()));
    }

    public PagedIterable<EncryptionProtector> list(String resourceGroupName, String workspaceName, Context context) {
        PagedIterable<EncryptionProtectorInner> inner =
            this.serviceClient().list(resourceGroupName, workspaceName, context);
        return inner.mapPage(inner1 -> new EncryptionProtectorImpl(inner1, this.manager()));
    }

    public void revalidate(
        String resourceGroupName, String workspaceName, EncryptionProtectorName encryptionProtectorName) {
        this.serviceClient().revalidate(resourceGroupName, workspaceName, encryptionProtectorName);
    }

    public void revalidate(
        String resourceGroupName,
        String workspaceName,
        EncryptionProtectorName encryptionProtectorName,
        Context context) {
        this.serviceClient().revalidate(resourceGroupName, workspaceName, encryptionProtectorName, context);
    }

    public EncryptionProtector getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        EncryptionProtectorName encryptionProtectorName =
            EncryptionProtectorName.fromString(Utils.getValueFromIdByName(id, "encryptionProtector"));
        if (encryptionProtectorName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'encryptionProtector'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, encryptionProtectorName, Context.NONE).getValue();
    }

    public Response<EncryptionProtector> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        EncryptionProtectorName encryptionProtectorName =
            EncryptionProtectorName.fromString(Utils.getValueFromIdByName(id, "encryptionProtector"));
        if (encryptionProtectorName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'encryptionProtector'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, encryptionProtectorName, context);
    }

    private WorkspaceManagedSqlServerEncryptionProtectorsClient serviceClient() {
        return this.innerClient;
    }

    private SynapseManager manager() {
        return this.serviceManager;
    }

    public EncryptionProtectorImpl define(EncryptionProtectorName name) {
        return new EncryptionProtectorImpl(name, this.manager());
    }
}
