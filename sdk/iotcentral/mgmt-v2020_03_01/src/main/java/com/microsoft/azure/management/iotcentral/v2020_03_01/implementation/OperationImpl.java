/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iotcentral.v2020_03_01.implementation;

import com.microsoft.azure.management.iotcentral.v2020_03_01.Operation;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.iotcentral.v2020_03_01.OperationDisplay;

class OperationImpl extends WrapperImpl<OperationInner> implements Operation {
    private final IoTCentralManager manager;
    OperationImpl(OperationInner inner, IoTCentralManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public IoTCentralManager manager() {
        return this.manager;
    }

    @Override
    public OperationDisplay display() {
        return this.inner().display();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

}
