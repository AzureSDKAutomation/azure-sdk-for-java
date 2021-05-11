// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.resourcemanager.netapp.fluent.models.QuotaLimitsResponseInner;
import com.azure.resourcemanager.netapp.models.QuotaLimitsResponse;

public final class QuotaLimitsResponseImpl implements QuotaLimitsResponse {
    private QuotaLimitsResponseInner innerObject;

    private final com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager;

    QuotaLimitsResponseImpl(
        QuotaLimitsResponseInner innerObject, com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String subscriptionId() {
        return this.innerModel().subscriptionId();
    }

    public Object accountsPerSubscription() {
        return this.innerModel().accountsPerSubscription();
    }

    public Object poolsPerAccount() {
        return this.innerModel().poolsPerAccount();
    }

    public Object volumesPerPool() {
        return this.innerModel().volumesPerPool();
    }

    public Object snapshotsPerVolume() {
        return this.innerModel().snapshotsPerVolume();
    }

    public Object totalTiBsPerSubscription() {
        return this.innerModel().totalTiBsPerSubscription();
    }

    public Object totalDPVolumesPerSubscription() {
        return this.innerModel().totalDPVolumesPerSubscription();
    }

    public Object totalVolumesPerSubscription() {
        return this.innerModel().totalVolumesPerSubscription();
    }

    public QuotaLimitsResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.netapp.NetAppFilesManager manager() {
        return this.serviceManager;
    }
}
