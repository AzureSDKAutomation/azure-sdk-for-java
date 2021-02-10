// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.AppServiceManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.WebJobInner;
import com.azure.resourcemanager.appservice.generated.models.SystemData;
import com.azure.resourcemanager.appservice.generated.models.WebJob;
import com.azure.resourcemanager.appservice.generated.models.WebJobType;
import java.util.Collections;
import java.util.Map;

public final class WebJobImpl implements WebJob {
    private WebJobInner innerObject;

    private final AppServiceManager serviceManager;

    WebJobImpl(WebJobInner innerObject, AppServiceManager serviceManager) {
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

    public String runCommand() {
        return this.innerModel().runCommand();
    }

    public String url() {
        return this.innerModel().url();
    }

    public String extraInfoUrl() {
        return this.innerModel().extraInfoUrl();
    }

    public WebJobType webJobType() {
        return this.innerModel().webJobType();
    }

    public String error() {
        return this.innerModel().error();
    }

    public Boolean usingSdk() {
        return this.innerModel().usingSdk();
    }

    public Map<String, Object> settings() {
        Map<String, Object> inner = this.innerModel().settings();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public WebJobInner innerModel() {
        return this.innerObject;
    }

    private AppServiceManager manager() {
        return this.serviceManager;
    }
}
