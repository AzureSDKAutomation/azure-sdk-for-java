// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.postgresql.fluent.LocationBasedCapabilitiesClient;
import com.azure.resourcemanager.postgresql.fluent.models.CapabilityPropertiesInner;
import com.azure.resourcemanager.postgresql.models.CapabilityProperties;
import com.azure.resourcemanager.postgresql.models.LocationBasedCapabilities;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class LocationBasedCapabilitiesImpl implements LocationBasedCapabilities {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LocationBasedCapabilitiesImpl.class);

    private final LocationBasedCapabilitiesClient innerClient;

    private final com.azure.resourcemanager.postgresql.PostgreSqlManager serviceManager;

    public LocationBasedCapabilitiesImpl(
        LocationBasedCapabilitiesClient innerClient,
        com.azure.resourcemanager.postgresql.PostgreSqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<CapabilityProperties> execute(String locationName) {
        PagedIterable<CapabilityPropertiesInner> inner = this.serviceClient().execute(locationName);
        return Utils.mapPage(inner, inner1 -> new CapabilityPropertiesImpl(inner1, this.manager()));
    }

    public PagedIterable<CapabilityProperties> execute(String locationName, Context context) {
        PagedIterable<CapabilityPropertiesInner> inner = this.serviceClient().execute(locationName, context);
        return Utils.mapPage(inner, inner1 -> new CapabilityPropertiesImpl(inner1, this.manager()));
    }

    private LocationBasedCapabilitiesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.postgresql.PostgreSqlManager manager() {
        return this.serviceManager;
    }
}
