// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.WebSiteInstanceStatusInner;
import com.azure.resourcemanager.appservice.generated.models.ContainerInfo;
import com.azure.resourcemanager.appservice.generated.models.SiteRuntimeState;
import com.azure.resourcemanager.appservice.generated.models.SystemData;
import com.azure.resourcemanager.appservice.generated.models.WebSiteInstanceStatus;
import java.util.Collections;
import java.util.Map;

public final class WebSiteInstanceStatusImpl implements WebSiteInstanceStatus {
    private WebSiteInstanceStatusInner innerObject;

    private final WebSiteManager serviceManager;

    public WebSiteInstanceStatusImpl(WebSiteInstanceStatusInner innerObject, WebSiteManager serviceManager) {
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

    public SiteRuntimeState state() {
        return this.innerModel().state();
    }

    public String statusUrl() {
        return this.innerModel().statusUrl();
    }

    public String detectorUrl() {
        return this.innerModel().detectorUrl();
    }

    public String consoleUrl() {
        return this.innerModel().consoleUrl();
    }

    public String healthCheckUrl() {
        return this.innerModel().healthCheckUrl();
    }

    public Map<String, ContainerInfo> containers() {
        Map<String, ContainerInfo> inner = this.innerModel().containers();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public WebSiteInstanceStatusInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}
