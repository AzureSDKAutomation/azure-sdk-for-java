// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.resourcemanager.synapse.fluent.models.OperationResourceInner;
import com.azure.resourcemanager.synapse.models.ErrorDetailAutoGenerated;
import com.azure.resourcemanager.synapse.models.OperationResource;
import com.azure.resourcemanager.synapse.models.OperationStatus;
import java.time.OffsetDateTime;

public final class OperationResourceImpl implements OperationResource {
    private OperationResourceInner innerObject;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    OperationResourceImpl(
        OperationResourceInner innerObject, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public OperationStatus status() {
        return this.innerModel().status();
    }

    public Object properties() {
        return this.innerModel().properties();
    }

    public ErrorDetailAutoGenerated error() {
        return this.innerModel().error();
    }

    public OffsetDateTime startTime() {
        return this.innerModel().startTime();
    }

    public OffsetDateTime endTime() {
        return this.innerModel().endTime();
    }

    public Float percentComplete() {
        return this.innerModel().percentComplete();
    }

    public OperationResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }
}
