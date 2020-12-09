// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.implementation;

import com.azure.resourcemanager.healthcareapis.HealthcareApisManager;
import com.azure.resourcemanager.healthcareapis.fluent.models.OperationInner;
import com.azure.resourcemanager.healthcareapis.models.Operation;
import com.azure.resourcemanager.healthcareapis.models.OperationDisplay;

public final class OperationImpl implements Operation {
    private OperationInner innerObject;

    private final HealthcareApisManager serviceManager;

    public OperationImpl(OperationInner innerObject, HealthcareApisManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public String origin() {
        return this.innerModel().origin();
    }

    public OperationDisplay display() {
        return this.innerModel().display();
    }

    public OperationInner innerModel() {
        return this.innerObject;
    }

    private HealthcareApisManager manager() {
        return this.serviceManager;
    }
}
