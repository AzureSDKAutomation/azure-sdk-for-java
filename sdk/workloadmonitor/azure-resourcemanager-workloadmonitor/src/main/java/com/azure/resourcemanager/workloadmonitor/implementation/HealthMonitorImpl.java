// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloadmonitor.implementation;

import com.azure.resourcemanager.workloadmonitor.WorkloadMonitorManager;
import com.azure.resourcemanager.workloadmonitor.fluent.models.HealthMonitorInner;
import com.azure.resourcemanager.workloadmonitor.models.HealthMonitor;
import com.azure.resourcemanager.workloadmonitor.models.HealthState;

public final class HealthMonitorImpl implements HealthMonitor {
    private HealthMonitorInner innerObject;

    private final WorkloadMonitorManager serviceManager;

    public HealthMonitorImpl(HealthMonitorInner innerObject, WorkloadMonitorManager serviceManager) {
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

    public String monitorName() {
        return this.innerModel().monitorName();
    }

    public String monitorType() {
        return this.innerModel().monitorType();
    }

    public String monitoredObject() {
        return this.innerModel().monitoredObject();
    }

    public String parentMonitorName() {
        return this.innerModel().parentMonitorName();
    }

    public HealthState previousMonitorState() {
        return this.innerModel().previousMonitorState();
    }

    public HealthState currentMonitorState() {
        return this.innerModel().currentMonitorState();
    }

    public String evaluationTimestamp() {
        return this.innerModel().evaluationTimestamp();
    }

    public String currentStateFirstObservedTimestamp() {
        return this.innerModel().currentStateFirstObservedTimestamp();
    }

    public String lastReportedTimestamp() {
        return this.innerModel().lastReportedTimestamp();
    }

    public Object evidence() {
        return this.innerModel().evidence();
    }

    public Object monitorConfiguration() {
        return this.innerModel().monitorConfiguration();
    }

    public HealthMonitorInner innerModel() {
        return this.innerObject;
    }

    private WorkloadMonitorManager manager() {
        return this.serviceManager;
    }
}
