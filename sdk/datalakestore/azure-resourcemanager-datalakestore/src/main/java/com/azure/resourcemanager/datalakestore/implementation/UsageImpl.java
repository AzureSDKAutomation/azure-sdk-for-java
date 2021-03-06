// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.implementation;

import com.azure.resourcemanager.datalakestore.fluent.models.UsageInner;
import com.azure.resourcemanager.datalakestore.models.Usage;
import com.azure.resourcemanager.datalakestore.models.UsageName;
import com.azure.resourcemanager.datalakestore.models.UsageUnit;

public final class UsageImpl implements Usage {
    private UsageInner innerObject;

    private final com.azure.resourcemanager.datalakestore.DataLakeStoreManager serviceManager;

    UsageImpl(UsageInner innerObject, com.azure.resourcemanager.datalakestore.DataLakeStoreManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public UsageUnit unit() {
        return this.innerModel().unit();
    }

    public String id() {
        return this.innerModel().id();
    }

    public Integer currentValue() {
        return this.innerModel().currentValue();
    }

    public Integer limit() {
        return this.innerModel().limit();
    }

    public UsageName name() {
        return this.innerModel().name();
    }

    public UsageInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datalakestore.DataLakeStoreManager manager() {
        return this.serviceManager;
    }
}
