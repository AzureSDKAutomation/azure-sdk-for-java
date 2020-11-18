/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020-12-01.implementation;

import com.microsoft.azure.management.synapse.v2020-12-01.SsisObjectMetadataStatusResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class SsisObjectMetadataStatusResponseImpl extends WrapperImpl<SsisObjectMetadataStatusResponseInner> implements SsisObjectMetadataStatusResponse {
    private final SynapseManager manager;
    SsisObjectMetadataStatusResponseImpl(SsisObjectMetadataStatusResponseInner inner, SynapseManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public SynapseManager manager() {
        return this.manager;
    }

    @Override
    public String error() {
        return this.inner().error();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String properties() {
        return this.inner().properties();
    }

    @Override
    public String status() {
        return this.inner().status();
    }

}
