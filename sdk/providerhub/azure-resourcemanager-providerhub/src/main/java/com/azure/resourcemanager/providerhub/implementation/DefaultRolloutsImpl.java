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
import com.azure.resourcemanager.providerhub.fluent.DefaultRolloutsClient;
import com.azure.resourcemanager.providerhub.fluent.models.DefaultRolloutInner;
import com.azure.resourcemanager.providerhub.models.DefaultRollout;
import com.azure.resourcemanager.providerhub.models.DefaultRollouts;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DefaultRolloutsImpl implements DefaultRollouts {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DefaultRolloutsImpl.class);

    private final DefaultRolloutsClient innerClient;

    private final ProviderhubManager serviceManager;

    public DefaultRolloutsImpl(DefaultRolloutsClient innerClient, ProviderhubManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public DefaultRollout get(String providerNamespace, String rolloutName) {
        DefaultRolloutInner inner = this.serviceClient().get(providerNamespace, rolloutName);
        if (inner != null) {
            return new DefaultRolloutImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DefaultRollout> getWithResponse(String providerNamespace, String rolloutName, Context context) {
        Response<DefaultRolloutInner> inner =
            this.serviceClient().getWithResponse(providerNamespace, rolloutName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DefaultRolloutImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String providerNamespace, String rolloutName) {
        this.serviceClient().delete(providerNamespace, rolloutName);
    }

    public Response<Void> deleteWithResponse(String providerNamespace, String rolloutName, Context context) {
        return this.serviceClient().deleteWithResponse(providerNamespace, rolloutName, context);
    }

    public DefaultRollout createOrUpdate(String providerNamespace, String rolloutName) {
        DefaultRolloutInner inner = this.serviceClient().createOrUpdate(providerNamespace, rolloutName);
        if (inner != null) {
            return new DefaultRolloutImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DefaultRollout createOrUpdate(String providerNamespace, String rolloutName, Context context) {
        DefaultRolloutInner inner = this.serviceClient().createOrUpdate(providerNamespace, rolloutName, context);
        if (inner != null) {
            return new DefaultRolloutImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<DefaultRollout> listByProviderRegistration(String providerNamespace) {
        PagedIterable<DefaultRolloutInner> inner = this.serviceClient().listByProviderRegistration(providerNamespace);
        return Utils.mapPage(inner, inner1 -> new DefaultRolloutImpl(inner1, this.manager()));
    }

    public PagedIterable<DefaultRollout> listByProviderRegistration(String providerNamespace, Context context) {
        PagedIterable<DefaultRolloutInner> inner =
            this.serviceClient().listByProviderRegistration(providerNamespace, context);
        return Utils.mapPage(inner, inner1 -> new DefaultRolloutImpl(inner1, this.manager()));
    }

    public void stop(String providerNamespace, String rolloutName) {
        this.serviceClient().stop(providerNamespace, rolloutName);
    }

    public Response<Void> stopWithResponse(String providerNamespace, String rolloutName, Context context) {
        return this.serviceClient().stopWithResponse(providerNamespace, rolloutName, context);
    }

    private DefaultRolloutsClient serviceClient() {
        return this.innerClient;
    }

    private ProviderhubManager manager() {
        return this.serviceManager;
    }
}
