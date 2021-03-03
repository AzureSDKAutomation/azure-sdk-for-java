// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurestack.AzureStackManager;
import com.azure.resourcemanager.azurestack.fluent.RegistrationsClient;
import com.azure.resourcemanager.azurestack.fluent.models.ActivationKeyResultInner;
import com.azure.resourcemanager.azurestack.fluent.models.RegistrationInner;
import com.azure.resourcemanager.azurestack.models.ActivationKeyResult;
import com.azure.resourcemanager.azurestack.models.Registration;
import com.azure.resourcemanager.azurestack.models.Registrations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class RegistrationsImpl implements Registrations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RegistrationsImpl.class);

    private final RegistrationsClient innerClient;

    private final AzureStackManager serviceManager;

    public RegistrationsImpl(RegistrationsClient innerClient, AzureStackManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Registration> listByResourceGroup(String resourceGroup) {
        PagedIterable<RegistrationInner> inner = this.serviceClient().listByResourceGroup(resourceGroup);
        return Utils.mapPage(inner, inner1 -> new RegistrationImpl(inner1, this.manager()));
    }

    public PagedIterable<Registration> listByResourceGroup(String resourceGroup, Context context) {
        PagedIterable<RegistrationInner> inner = this.serviceClient().listByResourceGroup(resourceGroup, context);
        return Utils.mapPage(inner, inner1 -> new RegistrationImpl(inner1, this.manager()));
    }

    public Registration getByResourceGroup(String resourceGroup, String registrationName) {
        RegistrationInner inner = this.serviceClient().getByResourceGroup(resourceGroup, registrationName);
        if (inner != null) {
            return new RegistrationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Registration> getByResourceGroupWithResponse(
        String resourceGroup, String registrationName, Context context) {
        Response<RegistrationInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroup, registrationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RegistrationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroup, String registrationName) {
        this.serviceClient().delete(resourceGroup, registrationName);
    }

    public Response<Void> deleteWithResponse(String resourceGroup, String registrationName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroup, registrationName, context);
    }

    public ActivationKeyResult getActivationKey(String resourceGroup, String registrationName) {
        ActivationKeyResultInner inner = this.serviceClient().getActivationKey(resourceGroup, registrationName);
        if (inner != null) {
            return new ActivationKeyResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ActivationKeyResult> getActivationKeyWithResponse(
        String resourceGroup, String registrationName, Context context) {
        Response<ActivationKeyResultInner> inner =
            this.serviceClient().getActivationKeyWithResponse(resourceGroup, registrationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ActivationKeyResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void enableRemoteManagement(String resourceGroup, String registrationName) {
        this.serviceClient().enableRemoteManagement(resourceGroup, registrationName);
    }

    public Response<Void> enableRemoteManagementWithResponse(
        String resourceGroup, String registrationName, Context context) {
        return this.serviceClient().enableRemoteManagementWithResponse(resourceGroup, registrationName, context);
    }

    public Registration getById(String id) {
        String resourceGroup = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroup == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String registrationName = Utils.getValueFromIdByName(id, "registrations");
        if (registrationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'registrations'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroup, registrationName, Context.NONE).getValue();
    }

    public Response<Registration> getByIdWithResponse(String id, Context context) {
        String resourceGroup = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroup == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String registrationName = Utils.getValueFromIdByName(id, "registrations");
        if (registrationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'registrations'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroup, registrationName, context);
    }

    public void deleteById(String id) {
        String resourceGroup = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroup == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String registrationName = Utils.getValueFromIdByName(id, "registrations");
        if (registrationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'registrations'.", id)));
        }
        this.deleteWithResponse(resourceGroup, registrationName, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroup = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroup == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String registrationName = Utils.getValueFromIdByName(id, "registrations");
        if (registrationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'registrations'.", id)));
        }
        return this.deleteWithResponse(resourceGroup, registrationName, context);
    }

    private RegistrationsClient serviceClient() {
        return this.innerClient;
    }

    private AzureStackManager manager() {
        return this.serviceManager;
    }

    public RegistrationImpl define(String name) {
        return new RegistrationImpl(name, this.manager());
    }
}
