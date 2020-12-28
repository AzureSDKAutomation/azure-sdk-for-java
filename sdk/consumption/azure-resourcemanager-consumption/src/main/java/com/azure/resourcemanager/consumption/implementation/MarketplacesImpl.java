// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.ConsumptionManager;
import com.azure.resourcemanager.consumption.fluent.MarketplacesClient;
import com.azure.resourcemanager.consumption.fluent.models.MarketplaceInner;
import com.azure.resourcemanager.consumption.models.Marketplace;
import com.azure.resourcemanager.consumption.models.Marketplaces;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class MarketplacesImpl implements Marketplaces {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MarketplacesImpl.class);

    private final MarketplacesClient innerClient;

    private final ConsumptionManager serviceManager;

    public MarketplacesImpl(MarketplacesClient innerClient, ConsumptionManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Marketplace> list(String scope) {
        PagedIterable<MarketplaceInner> inner = this.serviceClient().list(scope);
        return inner.mapPage(inner1 -> new MarketplaceImpl(inner1, this.manager()));
    }

    public PagedIterable<Marketplace> list(
        String scope, String filter, Integer top, String skiptoken, Context context) {
        PagedIterable<MarketplaceInner> inner = this.serviceClient().list(scope, filter, top, skiptoken, context);
        return inner.mapPage(inner1 -> new MarketplaceImpl(inner1, this.manager()));
    }

    private MarketplacesClient serviceClient() {
        return this.innerClient;
    }

    private ConsumptionManager manager() {
        return this.serviceManager;
    }
}
