/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.microsoft.azure.management.synapse.v2019_06_01_preview.PrivateLinkResource;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.PrivateLinkResourceProperties;

class PrivateLinkResourceImpl extends WrapperImpl<PrivateLinkResourceInner> implements PrivateLinkResource {
    private final SynapseManager manager;

    PrivateLinkResourceImpl(PrivateLinkResourceInner inner,  SynapseManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public SynapseManager manager() {
        return this.manager;
    }



    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public PrivateLinkResourceProperties properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
