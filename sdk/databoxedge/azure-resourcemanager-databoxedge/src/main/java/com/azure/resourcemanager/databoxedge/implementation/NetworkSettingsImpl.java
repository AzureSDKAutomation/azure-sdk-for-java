// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.implementation;

import com.azure.resourcemanager.databoxedge.DataBoxEdgeManager;
import com.azure.resourcemanager.databoxedge.fluent.models.NetworkSettingsInner;
import com.azure.resourcemanager.databoxedge.models.NetworkAdapter;
import com.azure.resourcemanager.databoxedge.models.NetworkSettings;
import java.util.Collections;
import java.util.List;

public final class NetworkSettingsImpl implements NetworkSettings {
    private NetworkSettingsInner innerObject;

    private final DataBoxEdgeManager serviceManager;

    public NetworkSettingsImpl(NetworkSettingsInner innerObject, DataBoxEdgeManager serviceManager) {
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

    public List<NetworkAdapter> networkAdapters() {
        List<NetworkAdapter> inner = this.innerModel().networkAdapters();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public NetworkSettingsInner innerModel() {
        return this.innerObject;
    }

    private DataBoxEdgeManager manager() {
        return this.serviceManager;
    }
}
