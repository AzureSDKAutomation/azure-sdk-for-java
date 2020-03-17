/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2019_05_01_preview.implementation;

import com.microsoft.azure.management.appplatform.v2019_05_01_preview.ServiceResource;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.appplatform.v2019_05_01_preview.ManagedIdentityProperties;
import com.microsoft.azure.management.appplatform.v2019_05_01_preview.ClusterResourceProperties;
import java.util.Map;

class ServiceResourceImpl extends WrapperImpl<ServiceResourceInner> implements ServiceResource {
    private final AppPlatformManager manager;
    ServiceResourceImpl(ServiceResourceInner inner, AppPlatformManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AppPlatformManager manager() {
        return this.manager;
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public ManagedIdentityProperties identity() {
        return this.inner().identity();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public ClusterResourceProperties properties() {
        return this.inner().properties();
    }

    @Override
    public SkuInner sku() {
        return this.inner().sku();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
