// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.testbase.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.testbase.fluent.models.FlightingRingResourceInner;
import com.azure.resourcemanager.testbase.models.FlightingRingResource;

public final class FlightingRingResourceImpl implements FlightingRingResource {
    private FlightingRingResourceInner innerObject;

    private final com.azure.resourcemanager.testbase.TestbaseManager serviceManager;

    FlightingRingResourceImpl(
        FlightingRingResourceInner innerObject, com.azure.resourcemanager.testbase.TestbaseManager serviceManager) {
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

    public String actualFlightingRingName() {
        return this.innerModel().actualFlightingRingName();
    }

    public FlightingRingResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.testbase.TestbaseManager manager() {
        return this.serviceManager;
    }
}
