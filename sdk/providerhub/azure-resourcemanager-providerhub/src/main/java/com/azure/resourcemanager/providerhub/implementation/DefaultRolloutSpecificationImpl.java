// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.implementation;

import com.azure.resourcemanager.providerhub.ProviderhubManager;
import com.azure.resourcemanager.providerhub.fluent.models.DefaultRolloutSpecificationInner;
import com.azure.resourcemanager.providerhub.fluent.models.ProviderRegistrationInner;
import com.azure.resourcemanager.providerhub.fluent.models.ResourceTypeRegistrationInner;
import com.azure.resourcemanager.providerhub.models.CanaryTrafficRegionRolloutConfiguration;
import com.azure.resourcemanager.providerhub.models.DefaultRolloutSpecification;
import com.azure.resourcemanager.providerhub.models.ProviderRegistration;
import com.azure.resourcemanager.providerhub.models.ResourceTypeRegistration;
import com.azure.resourcemanager.providerhub.models.TrafficRegionRolloutConfiguration;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class DefaultRolloutSpecificationImpl implements DefaultRolloutSpecification {
    private DefaultRolloutSpecificationInner innerObject;

    private final ProviderhubManager serviceManager;

    DefaultRolloutSpecificationImpl(DefaultRolloutSpecificationInner innerObject, ProviderhubManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public CanaryTrafficRegionRolloutConfiguration canary() {
        return this.innerModel().canary();
    }

    public TrafficRegionRolloutConfiguration lowTraffic() {
        return this.innerModel().lowTraffic();
    }

    public TrafficRegionRolloutConfiguration mediumTraffic() {
        return this.innerModel().mediumTraffic();
    }

    public TrafficRegionRolloutConfiguration highTraffic() {
        return this.innerModel().highTraffic();
    }

    public TrafficRegionRolloutConfiguration restOfTheWorldGroupOne() {
        return this.innerModel().restOfTheWorldGroupOne();
    }

    public TrafficRegionRolloutConfiguration restOfTheWorldGroupTwo() {
        return this.innerModel().restOfTheWorldGroupTwo();
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

    public DefaultRolloutSpecificationInner innerModel() {
        return this.innerObject;
    }

    private ProviderhubManager manager() {
        return this.serviceManager;
    }
}
