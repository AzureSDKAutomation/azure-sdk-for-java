// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.implementation;

import com.azure.resourcemanager.logic.LogicManager;
import com.azure.resourcemanager.logic.fluent.models.WorkflowRunActionInner;
import com.azure.resourcemanager.logic.models.ContentLink;
import com.azure.resourcemanager.logic.models.RetryHistory;
import com.azure.resourcemanager.logic.models.RunActionCorrelation;
import com.azure.resourcemanager.logic.models.WorkflowRunAction;
import com.azure.resourcemanager.logic.models.WorkflowStatus;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

public final class WorkflowRunActionImpl implements WorkflowRunAction {
    private WorkflowRunActionInner innerObject;

    private final LogicManager serviceManager;

    WorkflowRunActionImpl(WorkflowRunActionInner innerObject, LogicManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public OffsetDateTime startTime() {
        return this.innerModel().startTime();
    }

    public OffsetDateTime endTime() {
        return this.innerModel().endTime();
    }

    public WorkflowStatus status() {
        return this.innerModel().status();
    }

    public String code() {
        return this.innerModel().code();
    }

    public Object error() {
        return this.innerModel().error();
    }

    public String trackingId() {
        return this.innerModel().trackingId();
    }

    public RunActionCorrelation correlation() {
        return this.innerModel().correlation();
    }

    public ContentLink inputsLink() {
        return this.innerModel().inputsLink();
    }

    public ContentLink outputsLink() {
        return this.innerModel().outputsLink();
    }

    public Object trackedProperties() {
        return this.innerModel().trackedProperties();
    }

    public List<RetryHistory> retryHistory() {
        List<RetryHistory> inner = this.innerModel().retryHistory();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public WorkflowRunActionInner innerModel() {
        return this.innerObject;
    }

    private LogicManager manager() {
        return this.serviceManager;
    }
}
