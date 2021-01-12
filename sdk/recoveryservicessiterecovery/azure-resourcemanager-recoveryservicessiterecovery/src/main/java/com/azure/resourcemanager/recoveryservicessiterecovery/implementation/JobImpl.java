// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

import com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.JobInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.Job;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.JobProperties;

public final class JobImpl implements Job {
    private JobInner innerObject;

    private final SiteRecoveryManager serviceManager;

    JobImpl(JobInner innerObject, SiteRecoveryManager serviceManager) {
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

    public JobProperties properties() {
        return this.innerModel().properties();
    }

    public String location() {
        return this.innerModel().location();
    }

    public JobInner innerModel() {
        return this.innerObject;
    }

    private SiteRecoveryManager manager() {
        return this.serviceManager;
    }
}
