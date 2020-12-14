// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datadog.MicrosoftDatadogManager;
import com.azure.resourcemanager.datadog.fluent.LinkedResourcesClient;
import com.azure.resourcemanager.datadog.fluent.models.LinkedResourceInner;
import com.azure.resourcemanager.datadog.models.LinkedResource;
import com.azure.resourcemanager.datadog.models.LinkedResources;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class LinkedResourcesImpl implements LinkedResources {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LinkedResourcesImpl.class);

    private final LinkedResourcesClient innerClient;

    private final MicrosoftDatadogManager serviceManager;

    public LinkedResourcesImpl(LinkedResourcesClient innerClient, MicrosoftDatadogManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<LinkedResource> list(String resourceGroupName, String monitorName) {
        PagedIterable<LinkedResourceInner> inner = this.serviceClient().list(resourceGroupName, monitorName);
        return inner.mapPage(inner1 -> new LinkedResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<LinkedResource> list(String resourceGroupName, String monitorName, Context context) {
        PagedIterable<LinkedResourceInner> inner = this.serviceClient().list(resourceGroupName, monitorName, context);
        return inner.mapPage(inner1 -> new LinkedResourceImpl(inner1, this.manager()));
    }

    private LinkedResourcesClient serviceClient() {
        return this.innerClient;
    }

    private MicrosoftDatadogManager manager() {
        return this.serviceManager;
    }
}
