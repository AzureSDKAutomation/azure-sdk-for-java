/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2015_11_01_preview.implementation;

import com.microsoft.azure.management.loganalytics.v2015_11_01_preview.UsageMetric;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.loganalytics.v2015_11_01_preview.MetricName;
import org.joda.time.DateTime;

class UsageMetricImpl extends WrapperImpl<UsageMetricInner> implements UsageMetric {
    private final LogAnalyticsManager manager;

    UsageMetricImpl(UsageMetricInner inner,  LogAnalyticsManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public LogAnalyticsManager manager() {
        return this.manager;
    }



    @Override
    public Double currentValue() {
        return this.inner().currentValue();
    }

    @Override
    public Double limit() {
        return this.inner().limit();
    }

    @Override
    public MetricName name() {
        return this.inner().name();
    }

    @Override
    public DateTime nextResetTime() {
        return this.inner().nextResetTime();
    }

    @Override
    public String quotaPeriod() {
        return this.inner().quotaPeriod();
    }

    @Override
    public String unit() {
        return this.inner().unit();
    }

}
