// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.appservice.generated.fluent.models.MSDeployStatusInner;
import com.azure.resourcemanager.appservice.generated.models.MSDeployProvisioningState;
import com.azure.resourcemanager.appservice.generated.models.MSDeployStatus;
import java.time.OffsetDateTime;

public final class MSDeployStatusImpl implements MSDeployStatus {
    private MSDeployStatusInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    MSDeployStatusImpl(
        MSDeployStatusInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
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

    public String deployer() {
        return this.innerModel().deployer();
    }

    public MSDeployProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public OffsetDateTime startTime() {
        return this.innerModel().startTime();
    }

    public OffsetDateTime endTime() {
        return this.innerModel().endTime();
    }

    public Boolean complete() {
        return this.innerModel().complete();
    }

    public MSDeployStatusInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
