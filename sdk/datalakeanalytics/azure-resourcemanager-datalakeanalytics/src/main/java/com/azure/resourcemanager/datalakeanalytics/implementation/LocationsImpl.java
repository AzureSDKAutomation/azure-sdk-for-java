// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager;
import com.azure.resourcemanager.datalakeanalytics.fluent.LocationsClient;
import com.azure.resourcemanager.datalakeanalytics.fluent.models.CapabilityInformationInner;
import com.azure.resourcemanager.datalakeanalytics.models.CapabilityInformation;
import com.azure.resourcemanager.datalakeanalytics.models.Locations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class LocationsImpl implements Locations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LocationsImpl.class);

    private final LocationsClient innerClient;

    private final DataLakeAnalyticsManager serviceManager;

    public LocationsImpl(LocationsClient innerClient, DataLakeAnalyticsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public CapabilityInformation getCapability(String location) {
        CapabilityInformationInner inner = this.serviceClient().getCapability(location);
        if (inner != null) {
            return new CapabilityInformationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CapabilityInformation> getCapabilityWithResponse(String location, Context context) {
        Response<CapabilityInformationInner> inner = this.serviceClient().getCapabilityWithResponse(location, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CapabilityInformationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private LocationsClient serviceClient() {
        return this.innerClient;
    }

    private DataLakeAnalyticsManager manager() {
        return this.serviceManager;
    }
}
