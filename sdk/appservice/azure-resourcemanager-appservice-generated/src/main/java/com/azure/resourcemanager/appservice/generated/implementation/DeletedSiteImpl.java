// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.DeletedSiteInner;
import com.azure.resourcemanager.appservice.generated.models.DeletedSite;
import com.azure.resourcemanager.appservice.generated.models.SystemData;

public final class DeletedSiteImpl implements DeletedSite {
    private DeletedSiteInner innerObject;

    private final WebSiteManager serviceManager;

    public DeletedSiteImpl(DeletedSiteInner innerObject, WebSiteManager serviceManager) {
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

    public Integer deletedSiteId() {
        return this.innerModel().deletedSiteId();
    }

    public String deletedTimestamp() {
        return this.innerModel().deletedTimestamp();
    }

    public String subscription() {
        return this.innerModel().subscription();
    }

    public String resourceGroup() {
        return this.innerModel().resourceGroup();
    }

    public String deletedSiteName() {
        return this.innerModel().deletedSiteName();
    }

    public String slot() {
        return this.innerModel().slot();
    }

    public String kindPropertiesKind() {
        return this.innerModel().kindPropertiesKind();
    }

    public String geoRegionName() {
        return this.innerModel().geoRegionName();
    }

    public DeletedSiteInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}
