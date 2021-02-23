// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.resourcemanager.cosmos.generated.CosmosDBManager;
import com.azure.resourcemanager.cosmos.generated.fluent.models.MetricInner;
import com.azure.resourcemanager.cosmos.generated.models.Metric;
import com.azure.resourcemanager.cosmos.generated.models.MetricName;
import com.azure.resourcemanager.cosmos.generated.models.MetricValue;
import com.azure.resourcemanager.cosmos.generated.models.UnitType;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public final class MetricImpl implements Metric {
    private MetricInner innerObject;

    private final CosmosDBManager serviceManager;

    MetricImpl(MetricInner innerObject, CosmosDBManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public OffsetDateTime startTime() {
        return this.innerModel().startTime();
    }

    public OffsetDateTime endTime() {
        return this.innerModel().endTime();
    }

    public String timeGrain() {
        return this.innerModel().timeGrain();
    }

    public UnitType unit() {
        return this.innerModel().unit();
    }

    public MetricName name() {
        return this.innerModel().name();
    }

    public List<MetricValue> metricValues() {
        List<MetricValue> inner = this.innerModel().metricValues();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public MetricInner innerModel() {
        return this.innerObject;
    }

    private CosmosDBManager manager() {
        return this.serviceManager;
    }
}
