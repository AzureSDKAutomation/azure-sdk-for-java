/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020-12-01.implementation;

import com.microsoft.azure.management.synapse.v2020-12-01.IntegrationRuntimeAuthKeys;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class IntegrationRuntimeAuthKeysImpl extends WrapperImpl<IntegrationRuntimeAuthKeysInner> implements IntegrationRuntimeAuthKeys {
    private final SynapseManager manager;
    IntegrationRuntimeAuthKeysImpl(IntegrationRuntimeAuthKeysInner inner, SynapseManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public SynapseManager manager() {
        return this.manager;
    }

    @Override
    public String authKey1() {
        return this.inner().authKey1();
    }

    @Override
    public String authKey2() {
        return this.inner().authKey2();
    }

}
