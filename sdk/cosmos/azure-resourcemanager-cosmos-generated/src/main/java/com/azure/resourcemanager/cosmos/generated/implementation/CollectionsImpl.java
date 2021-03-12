// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.fluent.CollectionsClient;
import com.azure.resourcemanager.cosmos.generated.fluent.models.MetricDefinitionInner;
import com.azure.resourcemanager.cosmos.generated.fluent.models.MetricInner;
import com.azure.resourcemanager.cosmos.generated.fluent.models.UsageInner;
import com.azure.resourcemanager.cosmos.generated.models.Collections;
import com.azure.resourcemanager.cosmos.generated.models.Metric;
import com.azure.resourcemanager.cosmos.generated.models.MetricDefinition;
import com.azure.resourcemanager.cosmos.generated.models.Usage;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class CollectionsImpl implements Collections {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CollectionsImpl.class);

    private final CollectionsClient innerClient;

    private final com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager;

    public CollectionsImpl(
        CollectionsClient innerClient, com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Metric> listMetrics(
        String resourceGroupName, String accountName, String databaseRid, String collectionRid, String filter) {
        PagedIterable<MetricInner> inner =
            this.serviceClient().listMetrics(resourceGroupName, accountName, databaseRid, collectionRid, filter);
        return Utils.mapPage(inner, inner1 -> new MetricImpl(inner1, this.manager()));
    }

    public PagedIterable<Metric> listMetrics(
        String resourceGroupName,
        String accountName,
        String databaseRid,
        String collectionRid,
        String filter,
        Context context) {
        PagedIterable<MetricInner> inner =
            this
                .serviceClient()
                .listMetrics(resourceGroupName, accountName, databaseRid, collectionRid, filter, context);
        return Utils.mapPage(inner, inner1 -> new MetricImpl(inner1, this.manager()));
    }

    public PagedIterable<Usage> listUsages(
        String resourceGroupName, String accountName, String databaseRid, String collectionRid) {
        PagedIterable<UsageInner> inner =
            this.serviceClient().listUsages(resourceGroupName, accountName, databaseRid, collectionRid);
        return Utils.mapPage(inner, inner1 -> new UsageImpl(inner1, this.manager()));
    }

    public PagedIterable<Usage> listUsages(
        String resourceGroupName,
        String accountName,
        String databaseRid,
        String collectionRid,
        String filter,
        Context context) {
        PagedIterable<UsageInner> inner =
            this
                .serviceClient()
                .listUsages(resourceGroupName, accountName, databaseRid, collectionRid, filter, context);
        return Utils.mapPage(inner, inner1 -> new UsageImpl(inner1, this.manager()));
    }

    public PagedIterable<MetricDefinition> listMetricDefinitions(
        String resourceGroupName, String accountName, String databaseRid, String collectionRid) {
        PagedIterable<MetricDefinitionInner> inner =
            this.serviceClient().listMetricDefinitions(resourceGroupName, accountName, databaseRid, collectionRid);
        return Utils.mapPage(inner, inner1 -> new MetricDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<MetricDefinition> listMetricDefinitions(
        String resourceGroupName, String accountName, String databaseRid, String collectionRid, Context context) {
        PagedIterable<MetricDefinitionInner> inner =
            this
                .serviceClient()
                .listMetricDefinitions(resourceGroupName, accountName, databaseRid, collectionRid, context);
        return Utils.mapPage(inner, inner1 -> new MetricDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<Metric> listMetrics(
        String resourceGroupName, String accountName, String databaseRid, String collectionRid, String filter) {
        PagedIterable<MetricInner> inner =
            this.serviceClient().listMetrics(resourceGroupName, accountName, databaseRid, collectionRid, filter);
        return Utils.mapPage(inner, inner1 -> new MetricImpl(inner1, this.manager()));
    }

    public PagedIterable<Metric> listMetrics(
        String resourceGroupName,
        String accountName,
        String databaseRid,
        String collectionRid,
        String filter,
        Context context) {
        PagedIterable<MetricInner> inner =
            this
                .serviceClient()
                .listMetrics(resourceGroupName, accountName, databaseRid, collectionRid, filter, context);
        return Utils.mapPage(inner, inner1 -> new MetricImpl(inner1, this.manager()));
    }

    public PagedIterable<Usage> listUsages(
        String resourceGroupName, String accountName, String databaseRid, String collectionRid) {
        PagedIterable<UsageInner> inner =
            this.serviceClient().listUsages(resourceGroupName, accountName, databaseRid, collectionRid);
        return Utils.mapPage(inner, inner1 -> new UsageImpl(inner1, this.manager()));
    }

    public PagedIterable<Usage> listUsages(
        String resourceGroupName,
        String accountName,
        String databaseRid,
        String collectionRid,
        String filter,
        Context context) {
        PagedIterable<UsageInner> inner =
            this
                .serviceClient()
                .listUsages(resourceGroupName, accountName, databaseRid, collectionRid, filter, context);
        return Utils.mapPage(inner, inner1 -> new UsageImpl(inner1, this.manager()));
    }

    public PagedIterable<MetricDefinition> listMetricDefinitions(
        String resourceGroupName, String accountName, String databaseRid, String collectionRid) {
        PagedIterable<MetricDefinitionInner> inner =
            this.serviceClient().listMetricDefinitions(resourceGroupName, accountName, databaseRid, collectionRid);
        return Utils.mapPage(inner, inner1 -> new MetricDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<MetricDefinition> listMetricDefinitions(
        String resourceGroupName, String accountName, String databaseRid, String collectionRid, Context context) {
        PagedIterable<MetricDefinitionInner> inner =
            this
                .serviceClient()
                .listMetricDefinitions(resourceGroupName, accountName, databaseRid, collectionRid, context);
        return Utils.mapPage(inner, inner1 -> new MetricDefinitionImpl(inner1, this.manager()));
    }

    private CollectionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager() {
        return this.serviceManager;
    }
}
