// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.ServiceTierAdvisorsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.ServiceTierAdvisorInner;
import com.azure.resourcemanager.sql.generated.models.ServiceTierAdvisor;
import com.azure.resourcemanager.sql.generated.models.ServiceTierAdvisors;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ServiceTierAdvisorsImpl implements ServiceTierAdvisors {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServiceTierAdvisorsImpl.class);

    private final ServiceTierAdvisorsClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public ServiceTierAdvisorsImpl(
        ServiceTierAdvisorsClient innerClient, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ServiceTierAdvisor get(
        String resourceGroupName, String serverName, String databaseName, String serviceTierAdvisorName) {
        ServiceTierAdvisorInner inner =
            this.serviceClient().get(resourceGroupName, serverName, databaseName, serviceTierAdvisorName);
        if (inner != null) {
            return new ServiceTierAdvisorImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ServiceTierAdvisor> getWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String serviceTierAdvisorName,
        Context context) {
        Response<ServiceTierAdvisorInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, serverName, databaseName, serviceTierAdvisorName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ServiceTierAdvisorImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<ServiceTierAdvisor> listByDatabase(
        String resourceGroupName, String serverName, String databaseName) {
        PagedIterable<ServiceTierAdvisorInner> inner =
            this.serviceClient().listByDatabase(resourceGroupName, serverName, databaseName);
        return Utils.mapPage(inner, inner1 -> new ServiceTierAdvisorImpl(inner1, this.manager()));
    }

    public PagedIterable<ServiceTierAdvisor> listByDatabase(
        String resourceGroupName, String serverName, String databaseName, Context context) {
        PagedIterable<ServiceTierAdvisorInner> inner =
            this.serviceClient().listByDatabase(resourceGroupName, serverName, databaseName, context);
        return Utils.mapPage(inner, inner1 -> new ServiceTierAdvisorImpl(inner1, this.manager()));
    }

    private ServiceTierAdvisorsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }
}
