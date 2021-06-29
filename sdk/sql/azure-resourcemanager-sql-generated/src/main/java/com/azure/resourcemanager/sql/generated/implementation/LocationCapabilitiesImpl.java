// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.resourcemanager.sql.generated.fluent.models.LocationCapabilitiesInner;
import com.azure.resourcemanager.sql.generated.models.CapabilityStatus;
import com.azure.resourcemanager.sql.generated.models.LocationCapabilities;
import com.azure.resourcemanager.sql.generated.models.ManagedInstanceVersionCapability;
import com.azure.resourcemanager.sql.generated.models.ServerVersionCapability;
import java.util.Collections;
import java.util.List;

public final class LocationCapabilitiesImpl implements LocationCapabilities {
    private LocationCapabilitiesInner innerObject;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    LocationCapabilitiesImpl(
        LocationCapabilitiesInner innerObject, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public List<ServerVersionCapability> supportedServerVersions() {
        List<ServerVersionCapability> inner = this.innerModel().supportedServerVersions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ManagedInstanceVersionCapability> supportedManagedInstanceVersions() {
        List<ManagedInstanceVersionCapability> inner = this.innerModel().supportedManagedInstanceVersions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public CapabilityStatus status() {
        return this.innerModel().status();
    }

    public String reason() {
        return this.innerModel().reason();
    }

    public LocationCapabilitiesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }
}
