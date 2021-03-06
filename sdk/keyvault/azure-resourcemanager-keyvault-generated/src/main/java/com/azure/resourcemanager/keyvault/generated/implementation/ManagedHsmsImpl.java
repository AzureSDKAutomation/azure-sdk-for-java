// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.keyvault.generated.KeyVaultManager;
import com.azure.resourcemanager.keyvault.generated.fluent.ManagedHsmsClient;
import com.azure.resourcemanager.keyvault.generated.fluent.models.ManagedHsmInner;
import com.azure.resourcemanager.keyvault.generated.models.ManagedHsm;
import com.azure.resourcemanager.keyvault.generated.models.ManagedHsms;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ManagedHsmsImpl implements ManagedHsms {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedHsmsImpl.class);

    private final ManagedHsmsClient innerClient;

    private final KeyVaultManager serviceManager;

    public ManagedHsmsImpl(ManagedHsmsClient innerClient, KeyVaultManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String name) {
        this.serviceClient().delete(resourceGroupName, name);
    }

    public void delete(String resourceGroupName, String name, Context context) {
        this.serviceClient().delete(resourceGroupName, name, context);
    }

    public ManagedHsm getByResourceGroup(String resourceGroupName, String name) {
        ManagedHsmInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, name);
        if (inner != null) {
            return new ManagedHsmImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ManagedHsm> getByResourceGroupWithResponse(String resourceGroupName, String name, Context context) {
        Response<ManagedHsmInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ManagedHsmImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<ManagedHsm> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ManagedHsmInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new ManagedHsmImpl(inner1, this.manager()));
    }

    public PagedIterable<ManagedHsm> listByResourceGroup(String resourceGroupName, Integer top, Context context) {
        PagedIterable<ManagedHsmInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, top, context);
        return Utils.mapPage(inner, inner1 -> new ManagedHsmImpl(inner1, this.manager()));
    }

    public PagedIterable<ManagedHsm> list() {
        PagedIterable<ManagedHsmInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new ManagedHsmImpl(inner1, this.manager()));
    }

    public PagedIterable<ManagedHsm> list(Integer top, Context context) {
        PagedIterable<ManagedHsmInner> inner = this.serviceClient().list(top, context);
        return Utils.mapPage(inner, inner1 -> new ManagedHsmImpl(inner1, this.manager()));
    }

    public PagedIterable<ManagedHsm> listDeleted() {
        PagedIterable<ManagedHsmInner> inner = this.serviceClient().listDeleted();
        return Utils.mapPage(inner, inner1 -> new ManagedHsmImpl(inner1, this.manager()));
    }

    public PagedIterable<ManagedHsm> listDeleted(Context context) {
        PagedIterable<ManagedHsmInner> inner = this.serviceClient().listDeleted(context);
        return Utils.mapPage(inner, inner1 -> new ManagedHsmImpl(inner1, this.manager()));
    }

    public ManagedHsm getDeleted(String name, String location) {
        ManagedHsmInner inner = this.serviceClient().getDeleted(name, location);
        if (inner != null) {
            return new ManagedHsmImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ManagedHsm> getDeletedWithResponse(String name, String location, Context context) {
        Response<ManagedHsmInner> inner = this.serviceClient().getDeletedWithResponse(name, location, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ManagedHsmImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void purgeDeleted(String name, String location) {
        this.serviceClient().purgeDeleted(name, location);
    }

    public void purgeDeleted(String name, String location, Context context) {
        this.serviceClient().purgeDeleted(name, location, context);
    }

    public ManagedHsm getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "managedHSMs");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'managedHSMs'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, name, Context.NONE).getValue();
    }

    public Response<ManagedHsm> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "managedHSMs");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'managedHSMs'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, name, context);
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
        String name = Utils.getValueFromIdByName(id, "managedHSMs");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'managedHSMs'.", id)));
        }
        this.delete(resourceGroupName, name, Context.NONE);
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
        String name = Utils.getValueFromIdByName(id, "managedHSMs");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'managedHSMs'.", id)));
        }
        this.delete(resourceGroupName, name, context);
    }

    private ManagedHsmsClient serviceClient() {
        return this.innerClient;
    }

    private KeyVaultManager manager() {
        return this.serviceManager;
    }

    public ManagedHsmImpl define(String name) {
        return new ManagedHsmImpl(name, this.manager());
    }
}
