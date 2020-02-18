/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hybridkubernetes.v2019_09_01_privatepreview.implementation;

import com.microsoft.azure.management.hybridkubernetes.v2019_09_01_privatepreview.Operation;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.hybridkubernetes.v2019_09_01_privatepreview.OperationDisplay;

class OperationImpl extends WrapperImpl<OperationInner> implements Operation {
    private final KubernetesManager manager;
    OperationImpl(OperationInner inner, KubernetesManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public KubernetesManager manager() {
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
