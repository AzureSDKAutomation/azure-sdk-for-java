// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.portal.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.portal.PortalManager;
import com.azure.resourcemanager.portal.fluent.TenantConfigurationsClient;
import com.azure.resourcemanager.portal.fluent.models.ConfigurationInner;
import com.azure.resourcemanager.portal.models.Configuration;
import com.azure.resourcemanager.portal.models.ConfigurationName;
import com.azure.resourcemanager.portal.models.TenantConfigurations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class TenantConfigurationsImpl implements TenantConfigurations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TenantConfigurationsImpl.class);

    private final TenantConfigurationsClient innerClient;

    private final PortalManager serviceManager;

    public TenantConfigurationsImpl(TenantConfigurationsClient innerClient, PortalManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Configuration> list() {
        PagedIterable<ConfigurationInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new ConfigurationImpl(inner1, this.manager()));
    }

    public PagedIterable<Configuration> list(Context context) {
        PagedIterable<ConfigurationInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new ConfigurationImpl(inner1, this.manager()));
    }

    public Configuration get(ConfigurationName configurationName) {
        ConfigurationInner inner = this.serviceClient().get(configurationName);
        if (inner != null) {
            return new ConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Configuration> getWithResponse(ConfigurationName configurationName, Context context) {
        Response<ConfigurationInner> inner = this.serviceClient().getWithResponse(configurationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Configuration create(ConfigurationName configurationName, ConfigurationInner tenantConfiguration) {
        ConfigurationInner inner = this.serviceClient().create(configurationName, tenantConfiguration);
        if (inner != null) {
            return new ConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Configuration> createWithResponse(
        ConfigurationName configurationName, ConfigurationInner tenantConfiguration, Context context) {
        Response<ConfigurationInner> inner =
            this.serviceClient().createWithResponse(configurationName, tenantConfiguration, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(ConfigurationName configurationName) {
        this.serviceClient().delete(configurationName);
    }

    public Response<Void> deleteWithResponse(ConfigurationName configurationName, Context context) {
        return this.serviceClient().deleteWithResponse(configurationName, context);
    }

    private TenantConfigurationsClient serviceClient() {
        return this.innerClient;
    }

    private PortalManager manager() {
        return this.serviceManager;
    }
}
