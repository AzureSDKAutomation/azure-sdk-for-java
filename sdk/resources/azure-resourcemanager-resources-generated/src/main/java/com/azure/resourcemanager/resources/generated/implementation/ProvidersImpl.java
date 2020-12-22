// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.resources.generated.ResourceManager;
import com.azure.resourcemanager.resources.generated.fluent.ProvidersClient;
import com.azure.resourcemanager.resources.generated.fluent.models.ProviderInner;
import com.azure.resourcemanager.resources.generated.models.Provider;
import com.azure.resourcemanager.resources.generated.models.Providers;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ProvidersImpl implements Providers {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProvidersImpl.class);

    private final ProvidersClient innerClient;

    private final ResourceManager serviceManager;

    public ProvidersImpl(ProvidersClient innerClient, ResourceManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Provider unregister(String resourceProviderNamespace) {
        ProviderInner inner = this.serviceClient().unregister(resourceProviderNamespace);
        if (inner != null) {
            return new ProviderImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Provider> unregisterWithResponse(String resourceProviderNamespace, Context context) {
        Response<ProviderInner> inner = this.serviceClient().unregisterWithResponse(resourceProviderNamespace, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ProviderImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void registerAtManagementGroupScope(String resourceProviderNamespace, String groupId) {
        this.serviceClient().registerAtManagementGroupScope(resourceProviderNamespace, groupId);
    }

    public Response<Void> registerAtManagementGroupScopeWithResponse(
        String resourceProviderNamespace, String groupId, Context context) {
        return this
            .serviceClient()
            .registerAtManagementGroupScopeWithResponse(resourceProviderNamespace, groupId, context);
    }

    public Provider register(String resourceProviderNamespace) {
        ProviderInner inner = this.serviceClient().register(resourceProviderNamespace);
        if (inner != null) {
            return new ProviderImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Provider> registerWithResponse(String resourceProviderNamespace, Context context) {
        Response<ProviderInner> inner = this.serviceClient().registerWithResponse(resourceProviderNamespace, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ProviderImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<Provider> list() {
        PagedIterable<ProviderInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new ProviderImpl(inner1, this.manager()));
    }

    public PagedIterable<Provider> list(Integer top, String expand, Context context) {
        PagedIterable<ProviderInner> inner = this.serviceClient().list(top, expand, context);
        return inner.mapPage(inner1 -> new ProviderImpl(inner1, this.manager()));
    }

    public PagedIterable<Provider> listAtTenantScope() {
        PagedIterable<ProviderInner> inner = this.serviceClient().listAtTenantScope();
        return inner.mapPage(inner1 -> new ProviderImpl(inner1, this.manager()));
    }

    public PagedIterable<Provider> listAtTenantScope(Integer top, String expand, Context context) {
        PagedIterable<ProviderInner> inner = this.serviceClient().listAtTenantScope(top, expand, context);
        return inner.mapPage(inner1 -> new ProviderImpl(inner1, this.manager()));
    }

    public Provider get(String resourceProviderNamespace) {
        ProviderInner inner = this.serviceClient().get(resourceProviderNamespace);
        if (inner != null) {
            return new ProviderImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Provider> getWithResponse(String resourceProviderNamespace, String expand, Context context) {
        Response<ProviderInner> inner =
            this.serviceClient().getWithResponse(resourceProviderNamespace, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ProviderImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Provider getAtTenantScope(String resourceProviderNamespace) {
        ProviderInner inner = this.serviceClient().getAtTenantScope(resourceProviderNamespace);
        if (inner != null) {
            return new ProviderImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Provider> getAtTenantScopeWithResponse(
        String resourceProviderNamespace, String expand, Context context) {
        Response<ProviderInner> inner =
            this.serviceClient().getAtTenantScopeWithResponse(resourceProviderNamespace, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ProviderImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ProvidersClient serviceClient() {
        return this.innerClient;
    }

    private ResourceManager manager() {
        return this.serviceManager;
    }
}
