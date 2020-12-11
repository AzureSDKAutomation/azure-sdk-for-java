// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

import com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.TargetComputeSizeInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.TargetComputeSize;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.TargetComputeSizeProperties;

public final class TargetComputeSizeImpl implements TargetComputeSize {
    private TargetComputeSizeInner innerObject;

    private final SiteRecoveryManager serviceManager;

    public TargetComputeSizeImpl(TargetComputeSizeInner innerObject, SiteRecoveryManager serviceManager) {
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

    public TargetComputeSizeProperties properties() {
        return this.innerModel().properties();
    }

    public TargetComputeSizeInner innerModel() {
        return this.innerObject;
    }

    private SiteRecoveryManager manager() {
        return this.serviceManager;
    }
}
