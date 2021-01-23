// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.fluent.models.IntegrationRuntimeNodeIpAddressInner;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeNodeIpAddress;

public final class IntegrationRuntimeNodeIpAddressImpl implements IntegrationRuntimeNodeIpAddress {
    private IntegrationRuntimeNodeIpAddressInner innerObject;

    private final SynapseManager serviceManager;

    IntegrationRuntimeNodeIpAddressImpl(
        IntegrationRuntimeNodeIpAddressInner innerObject, SynapseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String ipAddress() {
        return this.innerModel().ipAddress();
    }

    public IntegrationRuntimeNodeIpAddressInner innerModel() {
        return this.innerObject;
    }

    private SynapseManager manager() {
        return this.serviceManager;
    }
}