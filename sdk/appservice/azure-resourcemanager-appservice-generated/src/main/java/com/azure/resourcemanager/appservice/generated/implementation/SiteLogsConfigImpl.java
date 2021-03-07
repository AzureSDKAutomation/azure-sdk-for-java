// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.AppServiceManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.SiteLogsConfigInner;
import com.azure.resourcemanager.appservice.generated.models.ApplicationLogsConfig;
import com.azure.resourcemanager.appservice.generated.models.EnabledConfig;
import com.azure.resourcemanager.appservice.generated.models.HttpLogsConfig;
import com.azure.resourcemanager.appservice.generated.models.SiteLogsConfig;
import com.azure.resourcemanager.appservice.generated.models.SystemData;

public final class SiteLogsConfigImpl implements SiteLogsConfig {
    private SiteLogsConfigInner innerObject;

    private final AppServiceManager serviceManager;

    SiteLogsConfigImpl(SiteLogsConfigInner innerObject, AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ApplicationLogsConfig applicationLogs() {
        return this.innerModel().applicationLogs();
    }

    public HttpLogsConfig httpLogs() {
        return this.innerModel().httpLogs();
    }

    public EnabledConfig failedRequestsTracing() {
        return this.innerModel().failedRequestsTracing();
    }

    public EnabledConfig detailedErrorMessages() {
        return this.innerModel().detailedErrorMessages();
    }

    public SiteLogsConfigInner innerModel() {
        return this.innerObject;
    }

    private AppServiceManager manager() {
        return this.serviceManager;
    }
}
