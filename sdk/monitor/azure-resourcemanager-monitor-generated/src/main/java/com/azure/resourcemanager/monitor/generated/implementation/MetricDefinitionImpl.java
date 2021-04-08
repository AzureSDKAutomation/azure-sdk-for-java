// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.resourcemanager.monitor.generated.fluent.models.LocalizableStringInner;
import com.azure.resourcemanager.monitor.generated.fluent.models.MetricDefinitionInner;
import com.azure.resourcemanager.monitor.generated.models.AggregationType;
import com.azure.resourcemanager.monitor.generated.models.LocalizableString;
import com.azure.resourcemanager.monitor.generated.models.MetricAvailability;
import com.azure.resourcemanager.monitor.generated.models.MetricDefinition;
import com.azure.resourcemanager.monitor.generated.models.Unit;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class MetricDefinitionImpl implements MetricDefinition {
    private MetricDefinitionInner innerObject;

    private final com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager;

    MetricDefinitionImpl(
        MetricDefinitionInner innerObject, com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Boolean isDimensionRequired() {
        return this.innerModel().isDimensionRequired();
    }

    public String resourceId() {
        return this.innerModel().resourceId();
    }

    public String namespace() {
        return this.innerModel().namespace();
    }

    public LocalizableString name() {
        LocalizableStringInner inner = this.innerModel().name();
        if (inner != null) {
            return new LocalizableStringImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Unit unit() {
        return this.innerModel().unit();
    }

    public AggregationType primaryAggregationType() {
        return this.innerModel().primaryAggregationType();
    }

    public List<AggregationType> supportedAggregationTypes() {
        List<AggregationType> inner = this.innerModel().supportedAggregationTypes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<MetricAvailability> metricAvailabilities() {
        List<MetricAvailability> inner = this.innerModel().metricAvailabilities();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String id() {
        return this.innerModel().id();
    }

    public List<LocalizableString> dimensions() {
        List<LocalizableStringInner> inner = this.innerModel().dimensions();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new LocalizableStringImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public MetricDefinitionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.monitor.generated.MonitorManager manager() {
        return this.serviceManager;
    }
}
