// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.implementation;

import com.azure.resourcemanager.cdn.generated.fluent.models.MetricsResponseInner;
import com.azure.resourcemanager.cdn.generated.models.MetricsResponse;
import com.azure.resourcemanager.cdn.generated.models.MetricsResponseGranularity;
import com.azure.resourcemanager.cdn.generated.models.MetricsResponseSeriesItem;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public final class MetricsResponseImpl implements MetricsResponse {
    private MetricsResponseInner innerObject;

    private final com.azure.resourcemanager.cdn.generated.CdnManager serviceManager;

    MetricsResponseImpl(
        MetricsResponseInner innerObject, com.azure.resourcemanager.cdn.generated.CdnManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public OffsetDateTime dateTimeBegin() {
        return this.innerModel().dateTimeBegin();
    }

    public OffsetDateTime dateTimeEnd() {
        return this.innerModel().dateTimeEnd();
    }

    public MetricsResponseGranularity granularity() {
        return this.innerModel().granularity();
    }

    public List<MetricsResponseSeriesItem> series() {
        List<MetricsResponseSeriesItem> inner = this.innerModel().series();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public MetricsResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.cdn.generated.CdnManager manager() {
        return this.serviceManager;
    }
}
