// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.implementation;

import com.azure.resourcemanager.imagebuilder.ImageBuilderManager;
import com.azure.resourcemanager.imagebuilder.fluent.models.OperationInner;
import com.azure.resourcemanager.imagebuilder.models.Operation;
import com.azure.resourcemanager.imagebuilder.models.OperationDisplay;

public final class OperationImpl implements Operation {
    private OperationInner innerObject;

    private final ImageBuilderManager serviceManager;

    OperationImpl(OperationInner innerObject, ImageBuilderManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public OperationDisplay display() {
        return this.innerModel().display();
    }

    public String origin() {
        return this.innerModel().origin();
    }

    public Object properties() {
        return this.innerModel().properties();
    }

    public Boolean isDataAction() {
        return this.innerModel().isDataAction();
    }

    public OperationInner innerModel() {
        return this.innerObject;
    }

    private ImageBuilderManager manager() {
        return this.serviceManager;
    }
}
