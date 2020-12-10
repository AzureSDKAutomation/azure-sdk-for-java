// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mariadb.MariaDBManager;
import com.azure.resourcemanager.mariadb.fluent.WaitStatisticsClient;
import com.azure.resourcemanager.mariadb.fluent.models.WaitStatisticInner;
import com.azure.resourcemanager.mariadb.models.WaitStatistic;
import com.azure.resourcemanager.mariadb.models.WaitStatistics;
import com.azure.resourcemanager.mariadb.models.WaitStatisticsInput;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class WaitStatisticsImpl implements WaitStatistics {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WaitStatisticsImpl.class);

    private final WaitStatisticsClient innerClient;

    private final MariaDBManager serviceManager;

    public WaitStatisticsImpl(WaitStatisticsClient innerClient, MariaDBManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public WaitStatistic get(String resourceGroupName, String serverName, String waitStatisticsId) {
        WaitStatisticInner inner = this.serviceClient().get(resourceGroupName, serverName, waitStatisticsId);
        if (inner != null) {
            return new WaitStatisticImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<WaitStatistic> getWithResponse(
        String resourceGroupName, String serverName, String waitStatisticsId, Context context) {
        Response<WaitStatisticInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serverName, waitStatisticsId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new WaitStatisticImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<WaitStatistic> listByServer(
        String resourceGroupName, String serverName, WaitStatisticsInput parameters) {
        PagedIterable<WaitStatisticInner> inner =
            this.serviceClient().listByServer(resourceGroupName, serverName, parameters);
        return inner.mapPage(inner1 -> new WaitStatisticImpl(inner1, this.manager()));
    }

    public PagedIterable<WaitStatistic> listByServer(
        String resourceGroupName, String serverName, WaitStatisticsInput parameters, Context context) {
        PagedIterable<WaitStatisticInner> inner =
            this.serviceClient().listByServer(resourceGroupName, serverName, parameters, context);
        return inner.mapPage(inner1 -> new WaitStatisticImpl(inner1, this.manager()));
    }

    private WaitStatisticsClient serviceClient() {
        return this.innerClient;
    }

    private MariaDBManager manager() {
        return this.serviceManager;
    }
}
