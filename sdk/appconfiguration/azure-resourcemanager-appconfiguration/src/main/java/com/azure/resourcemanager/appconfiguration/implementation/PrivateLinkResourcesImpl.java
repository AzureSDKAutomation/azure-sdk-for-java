// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appconfiguration.AppConfigurationManager;
import com.azure.resourcemanager.appconfiguration.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.appconfiguration.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.appconfiguration.models.PrivateLinkResource;
import com.azure.resourcemanager.appconfiguration.models.PrivateLinkResources;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class PrivateLinkResourcesImpl implements PrivateLinkResources {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateLinkResourcesImpl.class);

    private final PrivateLinkResourcesClient innerClient;

    private final AppConfigurationManager serviceManager;

    public PrivateLinkResourcesImpl(PrivateLinkResourcesClient innerClient, AppConfigurationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PrivateLinkResource> listByConfigurationStore(
        String resourceGroupName, String configStoreName) {
        PagedIterable<PrivateLinkResourceInner> inner =
            this.serviceClient().listByConfigurationStore(resourceGroupName, configStoreName);
        return Utils.mapPage(inner, inner1 -> new PrivateLinkResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateLinkResource> listByConfigurationStore(
        String resourceGroupName, String configStoreName, Context context) {
        PagedIterable<PrivateLinkResourceInner> inner =
            this.serviceClient().listByConfigurationStore(resourceGroupName, configStoreName, context);
        return Utils.mapPage(inner, inner1 -> new PrivateLinkResourceImpl(inner1, this.manager()));
    }

    public PrivateLinkResource get(String resourceGroupName, String configStoreName, String groupName) {
        PrivateLinkResourceInner inner = this.serviceClient().get(resourceGroupName, configStoreName, groupName);
        if (inner != null) {
            return new PrivateLinkResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PrivateLinkResource> getWithResponse(
        String resourceGroupName, String configStoreName, String groupName, Context context) {
        Response<PrivateLinkResourceInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, configStoreName, groupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrivateLinkResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private PrivateLinkResourcesClient serviceClient() {
        return this.innerClient;
    }

    private AppConfigurationManager manager() {
        return this.serviceManager;
    }
}
