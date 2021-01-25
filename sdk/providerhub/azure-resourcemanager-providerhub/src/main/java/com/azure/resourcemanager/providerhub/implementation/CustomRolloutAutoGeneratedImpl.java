// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.implementation;

import com.azure.resourcemanager.providerhub.ProviderhubManager;
import com.azure.resourcemanager.providerhub.fluent.models.CustomRolloutAutoGeneratedInner;
import com.azure.resourcemanager.providerhub.fluent.models.CustomRolloutSpecificationAutoGeneratedInner;
import com.azure.resourcemanager.providerhub.models.CustomRolloutAutoGenerated;
import com.azure.resourcemanager.providerhub.models.CustomRolloutSpecificationAutoGenerated;
import com.azure.resourcemanager.providerhub.models.CustomRolloutStatusAutoGenerated;
import com.azure.resourcemanager.providerhub.models.ProvisioningState;

public final class CustomRolloutAutoGeneratedImpl implements CustomRolloutAutoGenerated {
    private CustomRolloutAutoGeneratedInner innerObject;

    private final ProviderhubManager serviceManager;

    CustomRolloutAutoGeneratedImpl(CustomRolloutAutoGeneratedInner innerObject, ProviderhubManager serviceManager) {
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

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public CustomRolloutSpecificationAutoGenerated specification() {
        CustomRolloutSpecificationAutoGeneratedInner inner = this.innerModel().specification();
        if (inner != null) {
            return new CustomRolloutSpecificationAutoGeneratedImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public CustomRolloutStatusAutoGenerated status() {
        return this.innerModel().status();
    }

    public CustomRolloutAutoGeneratedInner innerModel() {
        return this.innerObject;
    }

    private ProviderhubManager manager() {
        return this.serviceManager;
    }
}
