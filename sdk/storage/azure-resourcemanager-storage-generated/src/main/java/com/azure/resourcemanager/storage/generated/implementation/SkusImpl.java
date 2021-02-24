// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storage.generated.StorageManager;
import com.azure.resourcemanager.storage.generated.fluent.SkusClient;
import com.azure.resourcemanager.storage.generated.fluent.models.SkuInformationInner;
import com.azure.resourcemanager.storage.generated.models.SkuInformation;
import com.azure.resourcemanager.storage.generated.models.Skus;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class SkusImpl implements Skus {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SkusImpl.class);

    private final SkusClient innerClient;

    private final StorageManager serviceManager;

    public SkusImpl(SkusClient innerClient, StorageManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SkuInformation> list() {
        PagedIterable<SkuInformationInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new SkuInformationImpl(inner1, this.manager()));
    }

    public PagedIterable<SkuInformation> list(Context context) {
        PagedIterable<SkuInformationInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new SkuInformationImpl(inner1, this.manager()));
    }

    private SkusClient serviceClient() {
        return this.innerClient;
    }

    private StorageManager manager() {
        return this.serviceManager;
    }
}
