// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.providerhub.ProviderHubManager;
import com.azure.resourcemanager.providerhub.fluent.ResourceProvidersClient;
import com.azure.resourcemanager.providerhub.fluent.models.CheckinManifestInfoInner;
import com.azure.resourcemanager.providerhub.fluent.models.ResourceProviderManifestInner;
import com.azure.resourcemanager.providerhub.models.CheckinManifestInfo;
import com.azure.resourcemanager.providerhub.models.CheckinManifestParams;
import com.azure.resourcemanager.providerhub.models.ResourceProviderManifest;
import com.azure.resourcemanager.providerhub.models.ResourceProviders;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ResourceProvidersImpl implements ResourceProviders {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceProvidersImpl.class);

    private final ResourceProvidersClient innerClient;

    private final ProviderHubManager serviceManager;

    public ResourceProvidersImpl(ResourceProvidersClient innerClient, ProviderHubManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ResourceProviderManifest generateManifest(String providerNamespace) {
        ResourceProviderManifestInner inner = this.serviceClient().generateManifest(providerNamespace);
        if (inner != null) {
            return new ResourceProviderManifestImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ResourceProviderManifest> generateManifestWithResponse(String providerNamespace, Context context) {
        Response<ResourceProviderManifestInner> inner =
            this.serviceClient().generateManifestWithResponse(providerNamespace, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ResourceProviderManifestImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CheckinManifestInfo checkinManifest(String providerNamespace, CheckinManifestParams checkinManifestParams) {
        CheckinManifestInfoInner inner = this.serviceClient().checkinManifest(providerNamespace, checkinManifestParams);
        if (inner != null) {
            return new CheckinManifestInfoImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CheckinManifestInfo> checkinManifestWithResponse(
        String providerNamespace, CheckinManifestParams checkinManifestParams, Context context) {
        Response<CheckinManifestInfoInner> inner =
            this.serviceClient().checkinManifestWithResponse(providerNamespace, checkinManifestParams, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CheckinManifestInfoImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ResourceProvidersClient serviceClient() {
        return this.innerClient;
    }

    private ProviderHubManager manager() {
        return this.serviceManager;
    }
}
