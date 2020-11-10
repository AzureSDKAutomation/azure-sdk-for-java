/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_09_01.implementation;

import com.microsoft.azure.management.cosmosdb.v2020_09_01.PercentileMetric;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.cosmosdb.v2020_09_01.PercentileMetricValue;
import com.microsoft.azure.management.cosmosdb.v2020_09_01.MetricName;
import com.microsoft.azure.management.cosmosdb.v2020_09_01.UnitType;

class PercentileMetricImpl extends WrapperImpl<PercentileMetricInner> implements PercentileMetric {
    private final CosmosDBManager manager;
    PercentileMetricImpl(PercentileMetricInner inner, CosmosDBManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CosmosDBManager manager() {
        return this.manager;
    }

    @Override
    public DateTime endTime() {
        return this.inner().endTime();
    }

    @Override
    public List<PercentileMetricValue> metricValues() {
        return this.inner().metricValues();
    }

    @Override
    public MetricName name() {
        return this.inner().name();
    }

    @Override
    public DateTime startTime() {
        return this.inner().startTime();
    }

    @Override
    public String timeGrain() {
        return this.inner().timeGrain();
    }

    @Override
    public UnitType unit() {
        return this.inner().unit();
    }

}
