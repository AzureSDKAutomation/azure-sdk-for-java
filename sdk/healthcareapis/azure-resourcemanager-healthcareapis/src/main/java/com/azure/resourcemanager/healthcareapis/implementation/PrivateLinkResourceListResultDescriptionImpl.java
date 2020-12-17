// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.implementation;

import com.azure.resourcemanager.healthcareapis.HealthcareApisManager;
import com.azure.resourcemanager.healthcareapis.fluent.models.PrivateLinkResourceDescriptionInner;
import com.azure.resourcemanager.healthcareapis.fluent.models.PrivateLinkResourceListResultDescriptionInner;
import com.azure.resourcemanager.healthcareapis.models.PrivateLinkResourceDescription;
import com.azure.resourcemanager.healthcareapis.models.PrivateLinkResourceListResultDescription;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class PrivateLinkResourceListResultDescriptionImpl implements PrivateLinkResourceListResultDescription {
    private PrivateLinkResourceListResultDescriptionInner innerObject;

    private final HealthcareApisManager serviceManager;

    PrivateLinkResourceListResultDescriptionImpl(
        PrivateLinkResourceListResultDescriptionInner innerObject, HealthcareApisManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<PrivateLinkResourceDescription> value() {
        List<PrivateLinkResourceDescriptionInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new PrivateLinkResourceDescriptionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public PrivateLinkResourceListResultDescriptionInner innerModel() {
        return this.innerObject;
    }

    private HealthcareApisManager manager() {
        return this.serviceManager;
    }
}
