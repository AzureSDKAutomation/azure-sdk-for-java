// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayPrivateLinkResourceInner;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayPrivateLinkResource;
import java.util.Collections;
import java.util.List;

public final class ApplicationGatewayPrivateLinkResourceImpl implements ApplicationGatewayPrivateLinkResource {
    private ApplicationGatewayPrivateLinkResourceInner innerObject;

    private final NetworkManager serviceManager;

    public ApplicationGatewayPrivateLinkResourceImpl(
        ApplicationGatewayPrivateLinkResourceInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String groupId() {
        return this.innerModel().groupId();
    }

    public List<String> requiredMembers() {
        List<String> inner = this.innerModel().requiredMembers();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> requiredZoneNames() {
        List<String> inner = this.innerModel().requiredZoneNames();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ApplicationGatewayPrivateLinkResourceInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}
