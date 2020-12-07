// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedservices.implementation;

import com.azure.resourcemanager.managedservices.ManagedServicesManager;
import com.azure.resourcemanager.managedservices.fluent.models.RegistrationDefinitionInner;
import com.azure.resourcemanager.managedservices.models.Plan;
import com.azure.resourcemanager.managedservices.models.RegistrationDefinition;
import com.azure.resourcemanager.managedservices.models.RegistrationDefinitionProperties;

public final class RegistrationDefinitionImpl implements RegistrationDefinition {
    private RegistrationDefinitionInner innerObject;

    private final ManagedServicesManager serviceManager;

    public RegistrationDefinitionImpl(RegistrationDefinitionInner innerObject, ManagedServicesManager serviceManager) {
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

    public RegistrationDefinitionProperties properties() {
        return this.innerModel().properties();
    }

    public Plan plan() {
        return this.innerModel().plan();
    }

    public RegistrationDefinitionInner innerModel() {
        return this.innerObject;
    }

    private ManagedServicesManager manager() {
        return this.serviceManager;
    }
}
