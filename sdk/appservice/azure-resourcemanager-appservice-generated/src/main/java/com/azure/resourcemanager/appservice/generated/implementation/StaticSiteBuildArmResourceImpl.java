// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.StaticSiteBuildArmResourceInner;
import com.azure.resourcemanager.appservice.generated.models.BuildStatus;
import com.azure.resourcemanager.appservice.generated.models.StaticSiteBuildArmResource;
import com.azure.resourcemanager.appservice.generated.models.SystemData;
import java.time.OffsetDateTime;

public final class StaticSiteBuildArmResourceImpl implements StaticSiteBuildArmResource {
    private StaticSiteBuildArmResourceInner innerObject;

    private final WebSiteManager serviceManager;

    public StaticSiteBuildArmResourceImpl(StaticSiteBuildArmResourceInner innerObject, WebSiteManager serviceManager) {
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

    public String buildId() {
        return this.innerModel().buildId();
    }

    public String sourceBranch() {
        return this.innerModel().sourceBranch();
    }

    public String pullRequestTitle() {
        return this.innerModel().pullRequestTitle();
    }

    public String hostname() {
        return this.innerModel().hostname();
    }

    public OffsetDateTime createdTimeUtc() {
        return this.innerModel().createdTimeUtc();
    }

    public OffsetDateTime lastUpdatedOn() {
        return this.innerModel().lastUpdatedOn();
    }

    public BuildStatus status() {
        return this.innerModel().status();
    }

    public StaticSiteBuildArmResourceInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}
