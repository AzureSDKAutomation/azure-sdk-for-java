// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.ElasticPoolActivitiesClient;
import com.azure.resourcemanager.sql.generated.fluent.models.ElasticPoolActivityInner;
import com.azure.resourcemanager.sql.generated.models.ElasticPoolActivities;
import com.azure.resourcemanager.sql.generated.models.ElasticPoolActivity;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ElasticPoolActivitiesImpl implements ElasticPoolActivities {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ElasticPoolActivitiesImpl.class);

    private final ElasticPoolActivitiesClient innerClient;

    private final SqlManager serviceManager;

    public ElasticPoolActivitiesImpl(ElasticPoolActivitiesClient innerClient, SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ElasticPoolActivity> listByElasticPool(
        String resourceGroupName, String serverName, String elasticPoolName) {
        PagedIterable<ElasticPoolActivityInner> inner =
            this.serviceClient().listByElasticPool(resourceGroupName, serverName, elasticPoolName);
        return inner.mapPage(inner1 -> new ElasticPoolActivityImpl(inner1, this.manager()));
    }

    public PagedIterable<ElasticPoolActivity> listByElasticPool(
        String resourceGroupName, String serverName, String elasticPoolName, Context context) {
        PagedIterable<ElasticPoolActivityInner> inner =
            this.serviceClient().listByElasticPool(resourceGroupName, serverName, elasticPoolName, context);
        return inner.mapPage(inner1 -> new ElasticPoolActivityImpl(inner1, this.manager()));
    }

    private ElasticPoolActivitiesClient serviceClient() {
        return this.innerClient;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }
}
