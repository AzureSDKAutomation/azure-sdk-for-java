// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.appservice.generated.fluent.models.GeoRegionInner;
import com.azure.resourcemanager.appservice.generated.models.GeoRegion;

public final class GeoRegionImpl implements GeoRegion {
    private GeoRegionInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    GeoRegionImpl(
        GeoRegionInner innerObject, com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
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

    public String description() {
        return this.innerModel().description();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String orgDomain() {
        return this.innerModel().orgDomain();
    }

    public GeoRegionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
