// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.AzureFirewallFqdnTagsClient;
import com.azure.resourcemanager.network.generated.fluent.models.AzureFirewallFqdnTagInner;
import com.azure.resourcemanager.network.generated.models.AzureFirewallFqdnTag;
import com.azure.resourcemanager.network.generated.models.AzureFirewallFqdnTags;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class AzureFirewallFqdnTagsImpl implements AzureFirewallFqdnTags {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureFirewallFqdnTagsImpl.class);

    private final AzureFirewallFqdnTagsClient innerClient;

    private final NetworkManager serviceManager;

    public AzureFirewallFqdnTagsImpl(AzureFirewallFqdnTagsClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AzureFirewallFqdnTag> list() {
        PagedIterable<AzureFirewallFqdnTagInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new AzureFirewallFqdnTagImpl(inner1, this.manager()));
    }

    public PagedIterable<AzureFirewallFqdnTag> list(Context context) {
        PagedIterable<AzureFirewallFqdnTagInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new AzureFirewallFqdnTagImpl(inner1, this.manager()));
    }

    private AzureFirewallFqdnTagsClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}
