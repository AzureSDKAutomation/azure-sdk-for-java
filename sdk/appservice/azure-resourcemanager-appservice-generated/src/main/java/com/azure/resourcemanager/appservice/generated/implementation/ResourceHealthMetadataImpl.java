// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.ResourceHealthMetadataInner;
import com.azure.resourcemanager.appservice.generated.models.ResourceHealthMetadata;
import com.azure.resourcemanager.appservice.generated.models.SystemData;

public final class ResourceHealthMetadataImpl implements ResourceHealthMetadata {
    private ResourceHealthMetadataInner innerObject;

    private final WebSiteManager serviceManager;

    public ResourceHealthMetadataImpl(ResourceHealthMetadataInner innerObject, WebSiteManager serviceManager) {
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

    public String category() {
        return this.innerModel().category();
    }

    public Boolean signalAvailability() {
        return this.innerModel().signalAvailability();
    }

    public ResourceHealthMetadataInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}
