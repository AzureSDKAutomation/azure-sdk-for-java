// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.implementation;

import com.azure.resourcemanager.providerhub.ProviderhubManager;
import com.azure.resourcemanager.providerhub.fluent.models.CustomRolloutSpecificationInner;
import com.azure.resourcemanager.providerhub.fluent.models.ProviderRegistrationInner;
import com.azure.resourcemanager.providerhub.fluent.models.ResourceTypeRegistrationInner;
import com.azure.resourcemanager.providerhub.models.CustomRolloutSpecification;
import com.azure.resourcemanager.providerhub.models.ProviderRegistration;
import com.azure.resourcemanager.providerhub.models.ResourceTypeRegistration;
import com.azure.resourcemanager.providerhub.models.TrafficRegions;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class CustomRolloutSpecificationImpl implements CustomRolloutSpecification {
    private CustomRolloutSpecificationInner innerObject;

    private final ProviderhubManager serviceManager;

    CustomRolloutSpecificationImpl(CustomRolloutSpecificationInner innerObject, ProviderhubManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public TrafficRegions canary() {
        return this.innerModel().canary();
    }

    public ProviderRegistration providerRegistration() {
        ProviderRegistrationInner inner = this.innerModel().providerRegistration();
        if (inner != null) {
            return new ProviderRegistrationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public List<ResourceTypeRegistration> resourceTypeRegistrations() {
        List<ResourceTypeRegistrationInner> inner = this.innerModel().resourceTypeRegistrations();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new ResourceTypeRegistrationImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public CustomRolloutSpecificationInner innerModel() {
        return this.innerObject;
    }

    private ProviderhubManager manager() {
        return this.serviceManager;
    }
}
