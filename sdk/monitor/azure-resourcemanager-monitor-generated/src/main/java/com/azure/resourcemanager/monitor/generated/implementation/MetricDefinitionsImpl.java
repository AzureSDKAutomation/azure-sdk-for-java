// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.MonitorManager;
import com.azure.resourcemanager.monitor.generated.fluent.MetricDefinitionsClient;
import com.azure.resourcemanager.monitor.generated.fluent.models.MetricDefinitionInner;
import com.azure.resourcemanager.monitor.generated.models.MetricDefinition;
import com.azure.resourcemanager.monitor.generated.models.MetricDefinitions;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class MetricDefinitionsImpl implements MetricDefinitions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MetricDefinitionsImpl.class);

    private final MetricDefinitionsClient innerClient;

    private final MonitorManager serviceManager;

    public MetricDefinitionsImpl(MetricDefinitionsClient innerClient, MonitorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<MetricDefinition> list(String resourceUri) {
        PagedIterable<MetricDefinitionInner> inner = this.serviceClient().list(resourceUri);
        return inner.mapPage(inner1 -> new MetricDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<MetricDefinition> list(String resourceUri, String metricnamespace, Context context) {
        PagedIterable<MetricDefinitionInner> inner = this.serviceClient().list(resourceUri, metricnamespace, context);
        return inner.mapPage(inner1 -> new MetricDefinitionImpl(inner1, this.manager()));
    }

    private MetricDefinitionsClient serviceClient() {
        return this.innerClient;
    }

    private MonitorManager manager() {
        return this.serviceManager;
    }
}
