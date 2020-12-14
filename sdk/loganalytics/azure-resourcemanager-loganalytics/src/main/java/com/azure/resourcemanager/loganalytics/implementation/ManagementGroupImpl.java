// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.implementation;

import com.azure.resourcemanager.loganalytics.LogAnalyticsManager;
import com.azure.resourcemanager.loganalytics.fluent.models.ManagementGroupInner;
import com.azure.resourcemanager.loganalytics.models.ManagementGroup;
import java.time.OffsetDateTime;

public final class ManagementGroupImpl implements ManagementGroup {
    private ManagementGroupInner innerObject;

    private final LogAnalyticsManager serviceManager;

    public ManagementGroupImpl(ManagementGroupInner innerObject, LogAnalyticsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Integer serverCount() {
        return this.innerModel().serverCount();
    }

    public Boolean isGateway() {
        return this.innerModel().isGateway();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String id() {
        return this.innerModel().id();
    }

    public OffsetDateTime created() {
        return this.innerModel().created();
    }

    public OffsetDateTime dataReceived() {
        return this.innerModel().dataReceived();
    }

    public String version() {
        return this.innerModel().version();
    }

    public String sku() {
        return this.innerModel().sku();
    }

    public ManagementGroupInner innerModel() {
        return this.innerObject;
    }

    private LogAnalyticsManager manager() {
        return this.serviceManager;
    }
}
