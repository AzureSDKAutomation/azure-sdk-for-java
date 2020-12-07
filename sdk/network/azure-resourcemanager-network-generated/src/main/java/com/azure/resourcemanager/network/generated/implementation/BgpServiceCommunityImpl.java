// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.BgpServiceCommunityInner;
import com.azure.resourcemanager.network.generated.models.BgpCommunity;
import com.azure.resourcemanager.network.generated.models.BgpServiceCommunity;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class BgpServiceCommunityImpl implements BgpServiceCommunity {
    private BgpServiceCommunityInner innerObject;

    private final NetworkManager serviceManager;

    public BgpServiceCommunityImpl(BgpServiceCommunityInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String serviceName() {
        return this.innerModel().serviceName();
    }

    public List<BgpCommunity> bgpCommunities() {
        List<BgpCommunity> inner = this.innerModel().bgpCommunities();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String id() {
        return this.innerModel().id();
    }

    public BgpServiceCommunityInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}
