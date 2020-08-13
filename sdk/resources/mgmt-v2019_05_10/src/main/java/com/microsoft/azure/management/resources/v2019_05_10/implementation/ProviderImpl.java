/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_05_10.implementation;

import com.microsoft.azure.management.resources.v2019_05_10.Provider;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.resources.v2019_05_10.ProviderResourceType;

class ProviderImpl extends IndexableRefreshableWrapperImpl<Provider, ProviderInner> implements Provider {
    private final ResourcesManager manager;
    private String resourceProviderNamespace;

    ProviderImpl(ProviderInner inner,  ResourcesManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceProviderNamespace = IdParsingUtils.getValueFromIdByName(inner.id(), "providers");
    }

    @Override
    public ResourcesManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<ProviderInner> getInnerAsync() {
        ProvidersInner client = this.manager().inner().providers();
        return client.getAsync(this.resourceProviderNamespace);
    }



    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String namespace() {
        return this.inner().namespace();
    }

    @Override
    public String registrationPolicy() {
        return this.inner().registrationPolicy();
    }

    @Override
    public String registrationState() {
        return this.inner().registrationState();
    }

    @Override
    public List<ProviderResourceType> resourceTypes() {
        return this.inner().resourceTypes();
    }

}
