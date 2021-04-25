// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.testbase.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.testbase.fluent.models.AnalysisResultSingletonResourceInner;
import com.azure.resourcemanager.testbase.models.AnalysisResultSingletonResource;
import com.azure.resourcemanager.testbase.models.Grade;

public final class AnalysisResultSingletonResourceImpl implements AnalysisResultSingletonResource {
    private AnalysisResultSingletonResourceInner innerObject;

    private final com.azure.resourcemanager.testbase.TestbaseManager serviceManager;

    AnalysisResultSingletonResourceImpl(
        AnalysisResultSingletonResourceInner innerObject,
        com.azure.resourcemanager.testbase.TestbaseManager serviceManager) {
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

    public Grade grade() {
        return this.innerModel().grade();
    }

    public AnalysisResultSingletonResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.testbase.TestbaseManager manager() {
        return this.serviceManager;
    }
}
