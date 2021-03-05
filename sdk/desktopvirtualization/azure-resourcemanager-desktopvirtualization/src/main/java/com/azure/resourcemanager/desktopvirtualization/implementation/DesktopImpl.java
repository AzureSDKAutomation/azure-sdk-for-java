// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.implementation;

import com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.DesktopInner;
import com.azure.resourcemanager.desktopvirtualization.models.Desktop;

public final class DesktopImpl implements Desktop {
    private DesktopInner innerObject;

    private final DesktopVirtualizationManager serviceManager;

    DesktopImpl(DesktopInner innerObject, DesktopVirtualizationManager serviceManager) {
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

    public String objectId() {
        return this.innerModel().objectId();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String friendlyName() {
        return this.innerModel().friendlyName();
    }

    public String iconHash() {
        return this.innerModel().iconHash();
    }

    public byte[] iconContent() {
        return this.innerModel().iconContent();
    }

    public DesktopInner innerModel() {
        return this.innerObject;
    }

    private DesktopVirtualizationManager manager() {
        return this.serviceManager;
    }
}
