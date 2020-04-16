/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2019_05_01.implementation;

import com.microsoft.azure.management.logic.v2019_05_01.IntegrationServiceEnvironmentSkuDefinition;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.logic.v2019_05_01.IntegrationServiceEnvironmentSkuCapacity;
import com.microsoft.azure.management.logic.v2019_05_01.IntegrationServiceEnvironmentSkuDefinitionSku;

class IntegrationServiceEnvironmentSkuDefinitionImpl extends WrapperImpl<IntegrationServiceEnvironmentSkuDefinitionInner> implements IntegrationServiceEnvironmentSkuDefinition {
    private final LogicManager manager;

    IntegrationServiceEnvironmentSkuDefinitionImpl(IntegrationServiceEnvironmentSkuDefinitionInner inner,  LogicManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public LogicManager manager() {
        return this.manager;
    }



    @Override
    public IntegrationServiceEnvironmentSkuCapacity capacity() {
        return this.inner().capacity();
    }

    @Override
    public String resourceType() {
        return this.inner().resourceType();
    }

    @Override
    public IntegrationServiceEnvironmentSkuDefinitionSku sku() {
        return this.inner().sku();
    }

}
