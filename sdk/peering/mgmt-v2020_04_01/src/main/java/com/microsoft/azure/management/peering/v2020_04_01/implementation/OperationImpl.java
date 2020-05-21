/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2020_04_01.implementation;

import com.microsoft.azure.management.peering.v2020_04_01.Operation;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.peering.v2020_04_01.OperationDisplayInfo;

class OperationImpl extends WrapperImpl<OperationInner> implements Operation {
    private final PeeringManager manager;
    OperationImpl(OperationInner inner, PeeringManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public PeeringManager manager() {
        return this.manager;
    }

    @Override
    public OperationDisplayInfo display() {
        return this.inner().display();
    }

    @Override
    public Boolean isDataAction() {
        return this.inner().isDataAction();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

}
