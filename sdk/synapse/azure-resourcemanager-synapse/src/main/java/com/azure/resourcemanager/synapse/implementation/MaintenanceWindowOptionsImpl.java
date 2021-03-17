// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.resourcemanager.synapse.fluent.models.MaintenanceWindowOptionsInner;
import com.azure.resourcemanager.synapse.models.MaintenanceWindowOptions;
import com.azure.resourcemanager.synapse.models.MaintenanceWindowTimeRange;
import java.util.Collections;
import java.util.List;

public final class MaintenanceWindowOptionsImpl implements MaintenanceWindowOptions {
    private MaintenanceWindowOptionsInner innerObject;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    MaintenanceWindowOptionsImpl(
        MaintenanceWindowOptionsInner innerObject, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
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

    public Boolean isEnabled() {
        return this.innerModel().isEnabled();
    }

    public List<MaintenanceWindowTimeRange> maintenanceWindowCycles() {
        List<MaintenanceWindowTimeRange> inner = this.innerModel().maintenanceWindowCycles();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Integer minDurationInMinutes() {
        return this.innerModel().minDurationInMinutes();
    }

    public Integer defaultDurationInMinutes() {
        return this.innerModel().defaultDurationInMinutes();
    }

    public Integer minCycles() {
        return this.innerModel().minCycles();
    }

    public Integer timeGranularityInMinutes() {
        return this.innerModel().timeGranularityInMinutes();
    }

    public Boolean allowMultipleMaintenanceWindowsPerCycle() {
        return this.innerModel().allowMultipleMaintenanceWindowsPerCycle();
    }

    public MaintenanceWindowOptionsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }
}
