// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.openai.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.openai.fluent.ResourceSkusClient;
import com.azure.resourcemanager.openai.fluent.models.ResourceSkuInner;
import com.azure.resourcemanager.openai.models.ResourceSku;
import com.azure.resourcemanager.openai.models.ResourceSkus;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ResourceSkusImpl implements ResourceSkus {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceSkusImpl.class);

    private final ResourceSkusClient innerClient;

    private final com.azure.resourcemanager.openai.OpenAIManager serviceManager;

    public ResourceSkusImpl(
        ResourceSkusClient innerClient, com.azure.resourcemanager.openai.OpenAIManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ResourceSku> list() {
        PagedIterable<ResourceSkuInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new ResourceSkuImpl(inner1, this.manager()));
    }

    public PagedIterable<ResourceSku> list(Context context) {
        PagedIterable<ResourceSkuInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new ResourceSkuImpl(inner1, this.manager()));
    }

    private ResourceSkusClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.openai.OpenAIManager manager() {
        return this.serviceManager;
    }
}
