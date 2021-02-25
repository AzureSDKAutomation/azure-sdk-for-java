// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.AppServiceManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.SkuInfosInner;
import com.azure.resourcemanager.appservice.generated.models.GlobalCsmSkuDescription;
import com.azure.resourcemanager.appservice.generated.models.SkuInfos;
import java.util.Collections;
import java.util.List;

public final class SkuInfosImpl implements SkuInfos {
    private SkuInfosInner innerObject;

    private final AppServiceManager serviceManager;

    SkuInfosImpl(SkuInfosInner innerObject, AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String resourceType() {
        return this.innerModel().resourceType();
    }

    public List<GlobalCsmSkuDescription> skus() {
        List<GlobalCsmSkuDescription> inner = this.innerModel().skus();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public SkuInfosInner innerModel() {
        return this.innerObject;
    }

    private AppServiceManager manager() {
        return this.serviceManager;
    }
}
