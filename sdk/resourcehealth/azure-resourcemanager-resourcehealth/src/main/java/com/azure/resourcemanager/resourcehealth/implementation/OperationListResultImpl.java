// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.implementation;

import com.azure.resourcemanager.resourcehealth.ResourcehealthManager;
import com.azure.resourcemanager.resourcehealth.fluent.models.OperationListResultInner;
import com.azure.resourcemanager.resourcehealth.models.Operation;
import com.azure.resourcemanager.resourcehealth.models.OperationListResult;
import java.util.Collections;
import java.util.List;

public final class OperationListResultImpl implements OperationListResult {
    private OperationListResultInner innerObject;

    private final ResourcehealthManager serviceManager;

    OperationListResultImpl(OperationListResultInner innerObject, ResourcehealthManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<Operation> value() {
        List<Operation> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public OperationListResultInner innerModel() {
        return this.innerObject;
    }

    private ResourcehealthManager manager() {
        return this.serviceManager;
    }
}
