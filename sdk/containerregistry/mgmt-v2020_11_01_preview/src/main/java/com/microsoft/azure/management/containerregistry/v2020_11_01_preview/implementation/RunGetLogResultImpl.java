/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2020_11_01_preview.implementation;

import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.RunGetLogResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class RunGetLogResultImpl extends WrapperImpl<RunGetLogResultInner> implements RunGetLogResult {
    private final ContainerRegistryManager manager;
    RunGetLogResultImpl(RunGetLogResultInner inner, ContainerRegistryManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ContainerRegistryManager manager() {
        return this.manager;
    }

    @Override
    public String logArtifactLink() {
        return this.inner().logArtifactLink();
    }

    @Override
    public String logLink() {
        return this.inner().logLink();
    }

}
