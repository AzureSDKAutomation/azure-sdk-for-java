// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.resourcemanager.cosmos.generated.CosmosDBManager;
import com.azure.resourcemanager.cosmos.generated.fluent.models.PercentileMetricInner;
import com.azure.resourcemanager.cosmos.generated.models.MetricName;
import com.azure.resourcemanager.cosmos.generated.models.PercentileMetric;
import com.azure.resourcemanager.cosmos.generated.models.PercentileMetricValue;
import com.azure.resourcemanager.cosmos.generated.models.UnitType;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public final class PercentileMetricImpl implements PercentileMetric {
    private PercentileMetricInner innerObject;

    private final CosmosDBManager serviceManager;

    PercentileMetricImpl(PercentileMetricInner innerObject, CosmosDBManager serviceManager) {
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

    public List<PercentileMetricValue> metricValues() {
        List<PercentileMetricValue> inner = this.innerModel().metricValues();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public PercentileMetricInner innerModel() {
        return this.innerObject;
    }

    private CosmosDBManager manager() {
        return this.serviceManager;
    }
}
