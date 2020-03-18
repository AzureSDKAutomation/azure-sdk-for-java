/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2019_05_01_preview.implementation;

import com.microsoft.azure.management.appplatform.v2019_05_01_preview.CustomDomainResourceCollection;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class CustomDomainResourceCollectionImpl extends WrapperImpl<CustomDomainResourceCollectionInner> implements CustomDomainResourceCollection {
    private final AppPlatformManager manager;
    CustomDomainResourceCollectionImpl(CustomDomainResourceCollectionInner inner, AppPlatformManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AppPlatformManager manager() {
        return this.manager;
    }

    @Override
    public String nextLink() {
        return this.inner().nextLink();
    }

    @Override
    public List<CustomDomainResourceInner> value() {
        return this.inner().value();
    }

}
