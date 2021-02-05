// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.avs.AvsManager;
import com.azure.resourcemanager.avs.fluent.LocationsClient;
import com.azure.resourcemanager.avs.fluent.models.QuotaInner;
import com.azure.resourcemanager.avs.fluent.models.TrialInner;
import com.azure.resourcemanager.avs.models.Locations;
import com.azure.resourcemanager.avs.models.Quota;
import com.azure.resourcemanager.avs.models.Trial;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class LocationsImpl implements Locations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LocationsImpl.class);

    private final LocationsClient innerClient;

    private final AvsManager serviceManager;

    public LocationsImpl(LocationsClient innerClient, AvsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Trial checkTrialAvailability(String location) {
        TrialInner inner = this.serviceClient().checkTrialAvailability(location);
        if (inner != null) {
            return new TrialImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Trial> checkTrialAvailabilityWithResponse(String location, Context context) {
        Response<TrialInner> inner = this.serviceClient().checkTrialAvailabilityWithResponse(location, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new TrialImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Quota checkQuotaAvailability(String location) {
        QuotaInner inner = this.serviceClient().checkQuotaAvailability(location);
        if (inner != null) {
            return new QuotaImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Quota> checkQuotaAvailabilityWithResponse(String location, Context context) {
        Response<QuotaInner> inner = this.serviceClient().checkQuotaAvailabilityWithResponse(location, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new QuotaImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private LocationsClient serviceClient() {
        return this.innerClient;
    }

    private AvsManager manager() {
        return this.serviceManager;
    }
}
