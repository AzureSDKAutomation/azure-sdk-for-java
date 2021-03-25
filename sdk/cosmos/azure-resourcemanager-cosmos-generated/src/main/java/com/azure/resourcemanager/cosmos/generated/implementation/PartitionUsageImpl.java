// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.resourcemanager.cosmos.generated.fluent.models.PartitionUsageInner;
import com.azure.resourcemanager.cosmos.generated.models.MetricName;
import com.azure.resourcemanager.cosmos.generated.models.PartitionUsage;
import com.azure.resourcemanager.cosmos.generated.models.UnitType;

public final class PartitionUsageImpl implements PartitionUsage {
    private PartitionUsageInner innerObject;

    private final com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager;

    PartitionUsageImpl(
        PartitionUsageInner innerObject, com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public UnitType unit() {
        return this.innerModel().unit();
    }

    public MetricName name() {
        return this.innerModel().name();
    }

    public String quotaPeriod() {
        return this.innerModel().quotaPeriod();
    }

    public Long limit() {
        return this.innerModel().limit();
    }

    public Long currentValue() {
        return this.innerModel().currentValue();
    }

    public String partitionId() {
        return this.innerModel().partitionId();
    }

    public String partitionKeyRangeId() {
        return this.innerModel().partitionKeyRangeId();
    }

    public PartitionUsageInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager() {
        return this.serviceManager;
    }
}
