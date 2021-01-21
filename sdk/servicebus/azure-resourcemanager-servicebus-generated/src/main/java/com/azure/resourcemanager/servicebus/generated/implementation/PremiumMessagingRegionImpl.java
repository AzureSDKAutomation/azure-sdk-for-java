// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.implementation;

import com.azure.resourcemanager.servicebus.generated.ServiceBusManager;
import com.azure.resourcemanager.servicebus.generated.fluent.models.PremiumMessagingRegionInner;
import com.azure.resourcemanager.servicebus.generated.models.PremiumMessagingRegion;
import com.azure.resourcemanager.servicebus.generated.models.PremiumMessagingRegionProperties;
import java.util.Collections;
import java.util.Map;

public final class PremiumMessagingRegionImpl implements PremiumMessagingRegion {
    private PremiumMessagingRegionInner innerObject;

    private final ServiceBusManager serviceManager;

    PremiumMessagingRegionImpl(PremiumMessagingRegionInner innerObject, ServiceBusManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
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

    public PremiumMessagingRegionProperties properties() {
        return this.innerModel().properties();
    }

    public PremiumMessagingRegionInner innerModel() {
        return this.innerObject;
    }

    private ServiceBusManager manager() {
        return this.serviceManager;
    }
}
