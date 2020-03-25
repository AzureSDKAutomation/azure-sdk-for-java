/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.PrivateLinkResources;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.PrivateLinkResource;

class PrivateLinkResourcesImpl extends WrapperImpl<PrivateLinkResourcesInner> implements PrivateLinkResources {
    private final SynapseManager manager;

    PrivateLinkResourcesImpl(SynapseManager manager) {
        super(manager.inner().privateLinkResources());
        this.manager = manager;
    }

    public SynapseManager manager() {
        return this.manager;
    }

    private PrivateLinkResourceImpl wrapModel(PrivateLinkResourceInner inner) {
        return  new PrivateLinkResourceImpl(inner, manager());
    }

    @Override
    public Observable<PrivateLinkResource> listAsync(final String resourceGroupName, final String workspaceName) {
        PrivateLinkResourcesInner client = this.inner();
        return client.listAsync(resourceGroupName, workspaceName)
        .flatMapIterable(new Func1<Page<PrivateLinkResourceInner>, Iterable<PrivateLinkResourceInner>>() {
            @Override
            public Iterable<PrivateLinkResourceInner> call(Page<PrivateLinkResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PrivateLinkResourceInner, PrivateLinkResource>() {
            @Override
            public PrivateLinkResource call(PrivateLinkResourceInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
