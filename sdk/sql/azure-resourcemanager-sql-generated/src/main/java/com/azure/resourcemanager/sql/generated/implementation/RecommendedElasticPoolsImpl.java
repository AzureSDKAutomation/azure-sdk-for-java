// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.RecommendedElasticPoolsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.RecommendedElasticPoolInner;
import com.azure.resourcemanager.sql.generated.fluent.models.RecommendedElasticPoolMetricInner;
import com.azure.resourcemanager.sql.generated.models.RecommendedElasticPool;
import com.azure.resourcemanager.sql.generated.models.RecommendedElasticPoolMetric;
import com.azure.resourcemanager.sql.generated.models.RecommendedElasticPools;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class RecommendedElasticPoolsImpl implements RecommendedElasticPools {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RecommendedElasticPoolsImpl.class);

    private final RecommendedElasticPoolsClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public RecommendedElasticPoolsImpl(
        RecommendedElasticPoolsClient innerClient, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public RecommendedElasticPool get(String resourceGroupName, String serverName, String recommendedElasticPoolName) {
        RecommendedElasticPoolInner inner =
            this.serviceClient().get(resourceGroupName, serverName, recommendedElasticPoolName);
        if (inner != null) {
            return new RecommendedElasticPoolImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RecommendedElasticPool> getWithResponse(
        String resourceGroupName, String serverName, String recommendedElasticPoolName, Context context) {
        Response<RecommendedElasticPoolInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serverName, recommendedElasticPoolName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RecommendedElasticPoolImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<RecommendedElasticPool> listByServer(String resourceGroupName, String serverName) {
        PagedIterable<RecommendedElasticPoolInner> inner =
            this.serviceClient().listByServer(resourceGroupName, serverName);
        return Utils.mapPage(inner, inner1 -> new RecommendedElasticPoolImpl(inner1, this.manager()));
    }

    public PagedIterable<RecommendedElasticPool> listByServer(
        String resourceGroupName, String serverName, Context context) {
        PagedIterable<RecommendedElasticPoolInner> inner =
            this.serviceClient().listByServer(resourceGroupName, serverName, context);
        return Utils.mapPage(inner, inner1 -> new RecommendedElasticPoolImpl(inner1, this.manager()));
    }

    public PagedIterable<RecommendedElasticPoolMetric> listMetrics(
        String resourceGroupName, String serverName, String recommendedElasticPoolName) {
        PagedIterable<RecommendedElasticPoolMetricInner> inner =
            this.serviceClient().listMetrics(resourceGroupName, serverName, recommendedElasticPoolName);
        return Utils.mapPage(inner, inner1 -> new RecommendedElasticPoolMetricImpl(inner1, this.manager()));
    }

    public PagedIterable<RecommendedElasticPoolMetric> listMetrics(
        String resourceGroupName, String serverName, String recommendedElasticPoolName, Context context) {
        PagedIterable<RecommendedElasticPoolMetricInner> inner =
            this.serviceClient().listMetrics(resourceGroupName, serverName, recommendedElasticPoolName, context);
        return Utils.mapPage(inner, inner1 -> new RecommendedElasticPoolMetricImpl(inner1, this.manager()));
    }

    private RecommendedElasticPoolsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }
}
