// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.fluent.models.VpnProfileResponseInner;
import com.azure.resourcemanager.network.generated.models.VpnProfileResponse;

public final class VpnProfileResponseImpl implements VpnProfileResponse {
    private VpnProfileResponseInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    VpnProfileResponseImpl(
        VpnProfileResponseInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String profileUrl() {
        return this.innerModel().profileUrl();
    }

    public VpnProfileResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
