// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagesync.implementation;

import com.azure.resourcemanager.storagesync.StoragesyncManager;
import com.azure.resourcemanager.storagesync.fluent.models.OperationEntityInner;
import com.azure.resourcemanager.storagesync.models.OperationDisplayInfo;
import com.azure.resourcemanager.storagesync.models.OperationEntity;
import com.azure.resourcemanager.storagesync.models.OperationProperties;

public final class OperationEntityImpl implements OperationEntity {
    private OperationEntityInner innerObject;

    private final StoragesyncManager serviceManager;

    OperationEntityImpl(OperationEntityInner innerObject, StoragesyncManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public OperationDisplayInfo display() {
        return this.innerModel().display();
    }

    public String origin() {
        return this.innerModel().origin();
    }

    public OperationProperties properties() {
        return this.innerModel().properties();
    }

    public OperationEntityInner innerModel() {
        return this.innerObject;
    }

    private StoragesyncManager manager() {
        return this.serviceManager;
    }
}
