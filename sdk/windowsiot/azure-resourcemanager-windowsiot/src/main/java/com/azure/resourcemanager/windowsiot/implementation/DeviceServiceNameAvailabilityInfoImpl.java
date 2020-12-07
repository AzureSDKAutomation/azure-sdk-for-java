// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.windowsiot.implementation;

import com.azure.resourcemanager.windowsiot.WindowsiotManager;
import com.azure.resourcemanager.windowsiot.fluent.models.DeviceServiceNameAvailabilityInfoInner;
import com.azure.resourcemanager.windowsiot.models.DeviceServiceNameAvailabilityInfo;
import com.azure.resourcemanager.windowsiot.models.ServiceNameUnavailabilityReason;

public final class DeviceServiceNameAvailabilityInfoImpl implements DeviceServiceNameAvailabilityInfo {
    private DeviceServiceNameAvailabilityInfoInner innerObject;

    private final WindowsiotManager serviceManager;

    public DeviceServiceNameAvailabilityInfoImpl(
        DeviceServiceNameAvailabilityInfoInner innerObject, WindowsiotManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Boolean nameAvailable() {
        return this.innerModel().nameAvailable();
    }

    public ServiceNameUnavailabilityReason reason() {
        return this.innerModel().reason();
    }

    public String message() {
        return this.innerModel().message();
    }

    public DeviceServiceNameAvailabilityInfoInner innerModel() {
        return this.innerObject;
    }

    private WindowsiotManager manager() {
        return this.serviceManager;
    }
}
