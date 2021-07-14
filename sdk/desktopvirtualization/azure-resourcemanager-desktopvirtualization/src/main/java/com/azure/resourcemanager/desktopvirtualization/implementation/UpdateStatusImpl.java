// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.UpdateStatusInner;
import com.azure.resourcemanager.desktopvirtualization.models.HostPoolUpdateConfigurationProperties;
import com.azure.resourcemanager.desktopvirtualization.models.HostPoolUpdateProgress;
import com.azure.resourcemanager.desktopvirtualization.models.HostPoolUpdateStatus;
import com.azure.resourcemanager.desktopvirtualization.models.SessionHostConfigurationProperties;
import com.azure.resourcemanager.desktopvirtualization.models.UpdateStatus;

public final class UpdateStatusImpl implements UpdateStatus {
    private UpdateStatusInner innerObject;

    private final com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager serviceManager;

    UpdateStatusImpl(
        UpdateStatusInner innerObject,
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager serviceManager) {
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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public HostPoolUpdateStatus updateStatus() {
        return this.innerModel().updateStatus();
    }

    public String version() {
        return this.innerModel().version();
    }

    public String hostPoolResourceId() {
        return this.innerModel().hostPoolResourceId();
    }

    public String correlationId() {
        return this.innerModel().correlationId();
    }

    public HostPoolUpdateProgress updateProgress() {
        return this.innerModel().updateProgress();
    }

    public HostPoolUpdateConfigurationProperties hostPoolUpdateConfiguration() {
        return this.innerModel().hostPoolUpdateConfiguration();
    }

    public SessionHostConfigurationProperties sessionHostConfiguration() {
        return this.innerModel().sessionHostConfiguration();
    }

    public UpdateStatusInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager() {
        return this.serviceManager;
    }
}
