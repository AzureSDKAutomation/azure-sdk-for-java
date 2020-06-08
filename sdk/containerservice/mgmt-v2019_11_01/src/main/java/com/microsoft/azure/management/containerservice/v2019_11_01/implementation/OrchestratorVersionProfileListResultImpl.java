/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2019_11_01.implementation;

import com.microsoft.azure.management.containerservice.v2019_11_01.OrchestratorVersionProfileListResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.containerservice.v2019_11_01.OrchestratorVersionProfile;

class OrchestratorVersionProfileListResultImpl extends WrapperImpl<OrchestratorVersionProfileListResultInner> implements OrchestratorVersionProfileListResult {
    private final ContainerServiceManager manager;
    OrchestratorVersionProfileListResultImpl(OrchestratorVersionProfileListResultInner inner, ContainerServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ContainerServiceManager manager() {
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
    public List<OrchestratorVersionProfile> orchestrators() {
        return this.inner().orchestrators();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
