// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.implementation;

import com.azure.resourcemanager.logic.LogicManager;
import com.azure.resourcemanager.logic.fluent.models.WorkflowTriggerCallbackUrlInner;
import com.azure.resourcemanager.logic.models.WorkflowTriggerCallbackUrl;
import com.azure.resourcemanager.logic.models.WorkflowTriggerListCallbackUrlQueries;
import java.util.Collections;
import java.util.List;

public final class WorkflowTriggerCallbackUrlImpl implements WorkflowTriggerCallbackUrl {
    private WorkflowTriggerCallbackUrlInner innerObject;

    private final LogicManager serviceManager;

    WorkflowTriggerCallbackUrlImpl(WorkflowTriggerCallbackUrlInner innerObject, LogicManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String value() {
        return this.innerModel().value();
    }

    public String method() {
        return this.innerModel().method();
    }

    public String basePath() {
        return this.innerModel().basePath();
    }

    public String relativePath() {
        return this.innerModel().relativePath();
    }

    public List<String> relativePathParameters() {
        List<String> inner = this.innerModel().relativePathParameters();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public WorkflowTriggerListCallbackUrlQueries queries() {
        return this.innerModel().queries();
    }

    public WorkflowTriggerCallbackUrlInner innerModel() {
        return this.innerObject;
    }

    private LogicManager manager() {
        return this.serviceManager;
    }
}
