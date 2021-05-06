// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.fluent.models.VpnClientConnectionHealthDetailListResultInner;
import com.azure.resourcemanager.network.generated.models.VpnClientConnectionHealthDetail;
import com.azure.resourcemanager.network.generated.models.VpnClientConnectionHealthDetailListResult;
import java.util.Collections;
import java.util.List;

public final class VpnClientConnectionHealthDetailListResultImpl implements VpnClientConnectionHealthDetailListResult {
    private VpnClientConnectionHealthDetailListResultInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    VpnClientConnectionHealthDetailListResultImpl(
        VpnClientConnectionHealthDetailListResultInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<VpnClientConnectionHealthDetail> value() {
        List<VpnClientConnectionHealthDetail> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public VpnClientConnectionHealthDetailListResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
