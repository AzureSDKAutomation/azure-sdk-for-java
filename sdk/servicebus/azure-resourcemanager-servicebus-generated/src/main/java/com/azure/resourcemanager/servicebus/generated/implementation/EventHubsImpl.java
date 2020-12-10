// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicebus.generated.ServiceBusManager;
import com.azure.resourcemanager.servicebus.generated.fluent.EventHubsClient;
import com.azure.resourcemanager.servicebus.generated.fluent.models.EventhubInner;
import com.azure.resourcemanager.servicebus.generated.models.EventHubs;
import com.azure.resourcemanager.servicebus.generated.models.Eventhub;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class EventHubsImpl implements EventHubs {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EventHubsImpl.class);

    private final EventHubsClient innerClient;

    private final ServiceBusManager serviceManager;

    public EventHubsImpl(EventHubsClient innerClient, ServiceBusManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Eventhub> listByNamespace(String resourceGroupName, String namespaceName) {
        PagedIterable<EventhubInner> inner = this.serviceClient().listByNamespace(resourceGroupName, namespaceName);
        return inner.mapPage(inner1 -> new EventhubImpl(inner1, this.manager()));
    }

    public PagedIterable<Eventhub> listByNamespace(String resourceGroupName, String namespaceName, Context context) {
        PagedIterable<EventhubInner> inner =
            this.serviceClient().listByNamespace(resourceGroupName, namespaceName, context);
        return inner.mapPage(inner1 -> new EventhubImpl(inner1, this.manager()));
    }

    private EventHubsClient serviceClient() {
        return this.innerClient;
    }

    private ServiceBusManager manager() {
        return this.serviceManager;
    }
}
