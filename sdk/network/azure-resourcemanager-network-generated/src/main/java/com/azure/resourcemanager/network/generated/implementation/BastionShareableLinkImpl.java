// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Resource;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.BastionShareableLinkInner;
import com.azure.resourcemanager.network.generated.models.BastionShareableLink;

public final class BastionShareableLinkImpl implements BastionShareableLink {
    private BastionShareableLinkInner innerObject;

    private final NetworkManager serviceManager;

    public BastionShareableLinkImpl(BastionShareableLinkInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Resource vm() {
        return this.innerModel().vm();
    }

    public String bsl() {
        return this.innerModel().bsl();
    }

    public String createdAt() {
        return this.innerModel().createdAt();
    }

    public String message() {
        return this.innerModel().message();
    }

    public BastionShareableLinkInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}
