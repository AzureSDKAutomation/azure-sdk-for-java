// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.ManagedInstanceEncryptionProtectorsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.ManagedInstanceEncryptionProtectorInner;
import com.azure.resourcemanager.sql.generated.models.EncryptionProtectorName;
import com.azure.resourcemanager.sql.generated.models.ManagedInstanceEncryptionProtector;
import com.azure.resourcemanager.sql.generated.models.ManagedInstanceEncryptionProtectors;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ManagedInstanceEncryptionProtectorsImpl implements ManagedInstanceEncryptionProtectors {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedInstanceEncryptionProtectorsImpl.class);

    private final ManagedInstanceEncryptionProtectorsClient innerClient;

    private final SqlManager serviceManager;

    public ManagedInstanceEncryptionProtectorsImpl(
        ManagedInstanceEncryptionProtectorsClient innerClient, SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void revalidate(
        String resourceGroupName, String managedInstanceName, EncryptionProtectorName encryptionProtectorName) {
        this.serviceClient().revalidate(resourceGroupName, managedInstanceName, encryptionProtectorName);
    }

    public void revalidate(
        String resourceGroupName,
        String managedInstanceName,
        EncryptionProtectorName encryptionProtectorName,
        Context context) {
        this.serviceClient().revalidate(resourceGroupName, managedInstanceName, encryptionProtectorName, context);
    }

    public PagedIterable<ManagedInstanceEncryptionProtector> listByInstance(
        String resourceGroupName, String managedInstanceName) {
        PagedIterable<ManagedInstanceEncryptionProtectorInner> inner =
            this.serviceClient().listByInstance(resourceGroupName, managedInstanceName);
        return inner.mapPage(inner1 -> new ManagedInstanceEncryptionProtectorImpl(inner1, this.manager()));
    }

    public PagedIterable<ManagedInstanceEncryptionProtector> listByInstance(
        String resourceGroupName, String managedInstanceName, Context context) {
        PagedIterable<ManagedInstanceEncryptionProtectorInner> inner =
            this.serviceClient().listByInstance(resourceGroupName, managedInstanceName, context);
        return inner.mapPage(inner1 -> new ManagedInstanceEncryptionProtectorImpl(inner1, this.manager()));
    }

    public ManagedInstanceEncryptionProtector get(
        String resourceGroupName, String managedInstanceName, EncryptionProtectorName encryptionProtectorName) {
        ManagedInstanceEncryptionProtectorInner inner =
            this.serviceClient().get(resourceGroupName, managedInstanceName, encryptionProtectorName);
        if (inner != null) {
            return new ManagedInstanceEncryptionProtectorImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ManagedInstanceEncryptionProtector> getWithResponse(
        String resourceGroupName,
        String managedInstanceName,
        EncryptionProtectorName encryptionProtectorName,
        Context context) {
        Response<ManagedInstanceEncryptionProtectorInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, managedInstanceName, encryptionProtectorName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ManagedInstanceEncryptionProtectorImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ManagedInstanceEncryptionProtector getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String managedInstanceName = Utils.getValueFromIdByName(id, "managedInstances");
        if (managedInstanceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'managedInstances'.", id)));
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
        return this
            .getWithResponse(resourceGroupName, managedInstanceName, encryptionProtectorName, Context.NONE)
            .getValue();
    }

    public Response<ManagedInstanceEncryptionProtector> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String managedInstanceName = Utils.getValueFromIdByName(id, "managedInstances");
        if (managedInstanceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'managedInstances'.", id)));
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
        return this.getWithResponse(resourceGroupName, managedInstanceName, encryptionProtectorName, context);
    }

    private ManagedInstanceEncryptionProtectorsClient serviceClient() {
        return this.innerClient;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }

    public ManagedInstanceEncryptionProtectorImpl define(EncryptionProtectorName name) {
        return new ManagedInstanceEncryptionProtectorImpl(name, this.manager());
    }
}
