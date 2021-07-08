// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.fluent.models.PrivateLinkResourcesWrapperInner;
import com.azure.resourcemanager.appservice.generated.models.PrivateLinkResource;
import com.azure.resourcemanager.appservice.generated.models.PrivateLinkResourcesWrapper;
import java.util.Collections;
import java.util.List;

public final class PrivateLinkResourcesWrapperImpl implements PrivateLinkResourcesWrapper {
    private PrivateLinkResourcesWrapperInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    PrivateLinkResourcesWrapperImpl(
        PrivateLinkResourcesWrapperInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<PrivateLinkResource> value() {
        List<PrivateLinkResource> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public PrivateLinkResourcesWrapperInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
