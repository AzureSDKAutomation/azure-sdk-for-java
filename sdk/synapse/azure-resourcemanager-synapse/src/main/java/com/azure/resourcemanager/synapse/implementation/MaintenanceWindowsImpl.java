// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.fluent.models.MaintenanceWindowsInner;
import com.azure.resourcemanager.synapse.models.MaintenanceWindowTimeRange;
import com.azure.resourcemanager.synapse.models.MaintenanceWindows;
import java.util.Collections;
import java.util.List;

public final class MaintenanceWindowsImpl implements MaintenanceWindows {
    private MaintenanceWindowsInner innerObject;

    private final SynapseManager serviceManager;

    MaintenanceWindowsImpl(MaintenanceWindowsInner innerObject, SynapseManager serviceManager) {
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

    public List<MaintenanceWindowTimeRange> timeRanges() {
        List<MaintenanceWindowTimeRange> inner = this.innerModel().timeRanges();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public MaintenanceWindowsInner innerModel() {
        return this.innerObject;
    }

    private SynapseManager manager() {
        return this.serviceManager;
    }
}
