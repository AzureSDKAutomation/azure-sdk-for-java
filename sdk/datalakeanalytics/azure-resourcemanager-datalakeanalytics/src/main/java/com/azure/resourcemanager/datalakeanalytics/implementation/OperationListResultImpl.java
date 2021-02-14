// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.implementation;

import com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager;
import com.azure.resourcemanager.datalakeanalytics.fluent.models.OperationListResultInner;
import com.azure.resourcemanager.datalakeanalytics.models.Operation;
import com.azure.resourcemanager.datalakeanalytics.models.OperationListResult;
import java.util.Collections;
import java.util.List;

public final class OperationListResultImpl implements OperationListResult {
    private OperationListResultInner innerObject;

    private final DataLakeAnalyticsManager serviceManager;

    OperationListResultImpl(OperationListResultInner innerObject, DataLakeAnalyticsManager serviceManager) {
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

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public OperationListResultInner innerModel() {
        return this.innerObject;
    }

    private DataLakeAnalyticsManager manager() {
        return this.serviceManager;
    }
}
