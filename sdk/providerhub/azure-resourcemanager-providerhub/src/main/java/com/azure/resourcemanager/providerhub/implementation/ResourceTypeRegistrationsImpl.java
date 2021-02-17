// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.providerhub.ProviderhubManager;
import com.azure.resourcemanager.providerhub.fluent.ResourceTypeRegistrationsClient;
import com.azure.resourcemanager.providerhub.fluent.models.ResourceTypeRegistrationInner;
import com.azure.resourcemanager.providerhub.models.ResourceTypeRegistration;
import com.azure.resourcemanager.providerhub.models.ResourceTypeRegistrations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ResourceTypeRegistrationsImpl implements ResourceTypeRegistrations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceTypeRegistrationsImpl.class);

    private final ResourceTypeRegistrationsClient innerClient;

    private final ProviderhubManager serviceManager;

    public ResourceTypeRegistrationsImpl(
        ResourceTypeRegistrationsClient innerClient, ProviderhubManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ResourceTypeRegistration get(String providerNamespace, String resourceType) {
        ResourceTypeRegistrationInner inner = this.serviceClient().get(providerNamespace, resourceType);
        if (inner != null) {
            return new ResourceTypeRegistrationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ResourceTypeRegistration> getWithResponse(
        String providerNamespace, String resourceType, Context context) {
        Response<ResourceTypeRegistrationInner> inner =
            this.serviceClient().getWithResponse(providerNamespace, resourceType, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ResourceTypeRegistrationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String providerNamespace, String resourceType) {
        this.serviceClient().delete(providerNamespace, resourceType);
    }

    public Response<Void> deleteWithResponse(String providerNamespace, String resourceType, Context context) {
        return this.serviceClient().deleteWithResponse(providerNamespace, resourceType, context);
    }

    public PagedIterable<ResourceTypeRegistration> listByProviderRegistration(String providerNamespace) {
        PagedIterable<ResourceTypeRegistrationInner> inner =
            this.serviceClient().listByProviderRegistration(providerNamespace);
        return Utils.mapPage(inner, inner1 -> new ResourceTypeRegistrationImpl(inner1, this.manager()));
    }

    public PagedIterable<ResourceTypeRegistration> listByProviderRegistration(
        String providerNamespace, Context context) {
        PagedIterable<ResourceTypeRegistrationInner> inner =
            this.serviceClient().listByProviderRegistration(providerNamespace, context);
        return Utils.mapPage(inner, inner1 -> new ResourceTypeRegistrationImpl(inner1, this.manager()));
    }

    public ResourceTypeRegistration getById(String id) {
        String providerNamespace = Utils.getValueFromIdByName(id, "providerRegistrations");
        if (providerNamespace == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'providerRegistrations'.",
                                id)));
        }
        String resourceType = Utils.getValueFromIdByName(id, "resourcetypeRegistrations");
        if (resourceType == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'resourcetypeRegistrations'.",
                                id)));
        }
        return this.getWithResponse(providerNamespace, resourceType, Context.NONE).getValue();
    }

    public Response<ResourceTypeRegistration> getByIdWithResponse(String id, Context context) {
        String providerNamespace = Utils.getValueFromIdByName(id, "providerRegistrations");
        if (providerNamespace == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'providerRegistrations'.",
                                id)));
        }
        String resourceType = Utils.getValueFromIdByName(id, "resourcetypeRegistrations");
        if (resourceType == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'resourcetypeRegistrations'.",
                                id)));
        }
        return this.getWithResponse(providerNamespace, resourceType, context);
    }

    public void deleteById(String id) {
        String providerNamespace = Utils.getValueFromIdByName(id, "providerRegistrations");
        if (providerNamespace == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'providerRegistrations'.",
                                id)));
        }
        String resourceType = Utils.getValueFromIdByName(id, "resourcetypeRegistrations");
        if (resourceType == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'resourcetypeRegistrations'.",
                                id)));
        }
        this.deleteWithResponse(providerNamespace, resourceType, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String providerNamespace = Utils.getValueFromIdByName(id, "providerRegistrations");
        if (providerNamespace == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'providerRegistrations'.",
                                id)));
        }
        String resourceType = Utils.getValueFromIdByName(id, "resourcetypeRegistrations");
        if (resourceType == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'resourcetypeRegistrations'.",
                                id)));
        }
        return this.deleteWithResponse(providerNamespace, resourceType, context);
    }

    private ResourceTypeRegistrationsClient serviceClient() {
        return this.innerClient;
    }

    private ProviderhubManager manager() {
        return this.serviceManager;
    }

    public ResourceTypeRegistrationImpl define(String name) {
        return new ResourceTypeRegistrationImpl(name, this.manager());
    }
}
