/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.storagecache.v2020-03-01.implementation;

import com.microsoft.azure.management.storagecache.v2020-03-01.ResourceSku;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.storagecache.v2020-03-01.ResourceSkuCapabilities;
import com.microsoft.azure.management.storagecache.v2020-03-01.ResourceSkuLocationInfo;
import com.microsoft.azure.management.storagecache.v2020-03-01.Restriction;

class ResourceSkuImpl extends WrapperImpl<ResourceSkuInner> implements ResourceSku {
    private final StorageCacheManager manager;

    ResourceSkuImpl(ResourceSkuInner inner,  StorageCacheManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public StorageCacheManager manager() {
        return this.manager;
    }



    @Override
    public List<ResourceSkuCapabilities> capabilities() {
        return this.inner().capabilities();
    }

    @Override
    public List<ResourceSkuLocationInfo> locationInfo() {
        return this.inner().locationInfo();
    }

    @Override
    public List<String> locations() {
        return this.inner().locations();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String resourceType() {
        return this.inner().resourceType();
    }

    @Override
    public List<Restriction> restrictions() {
        return this.inner().restrictions();
    }

}
