// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicebus.generated.fluent.PremiumMessagingRegionsClient;
import com.azure.resourcemanager.servicebus.generated.fluent.models.PremiumMessagingRegionInner;
import com.azure.resourcemanager.servicebus.generated.models.PremiumMessagingRegion;
import com.azure.resourcemanager.servicebus.generated.models.PremiumMessagingRegions;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class PremiumMessagingRegionsImpl implements PremiumMessagingRegions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PremiumMessagingRegionsImpl.class);

    private final PremiumMessagingRegionsClient innerClient;

    private final com.azure.resourcemanager.servicebus.generated.ServiceBusManager serviceManager;

    public PremiumMessagingRegionsImpl(
        PremiumMessagingRegionsClient innerClient,
        com.azure.resourcemanager.servicebus.generated.ServiceBusManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PremiumMessagingRegion> list() {
        PagedIterable<PremiumMessagingRegionInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new PremiumMessagingRegionImpl(inner1, this.manager()));
    }

    public PagedIterable<PremiumMessagingRegion> list(Context context) {
        PagedIterable<PremiumMessagingRegionInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new PremiumMessagingRegionImpl(inner1, this.manager()));
    }

    private PremiumMessagingRegionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.servicebus.generated.ServiceBusManager manager() {
        return this.serviceManager;
    }
}
