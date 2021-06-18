// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.resourcemanager.monitor.generated.fluent.models.MetricNamespaceInner;
import com.azure.resourcemanager.monitor.generated.models.MetricNamespace;
import com.azure.resourcemanager.monitor.generated.models.MetricNamespaceName;
import com.azure.resourcemanager.monitor.generated.models.NamespaceClassification;

public final class MetricNamespaceImpl implements MetricNamespace {
    private MetricNamespaceInner innerObject;

    private final com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager;

    MetricNamespaceImpl(
        MetricNamespaceInner innerObject, com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String name() {
        return this.innerModel().name();
    }

    public NamespaceClassification classification() {
        return this.innerModel().classification();
    }

    public MetricNamespaceName properties() {
        return this.innerModel().properties();
    }

    public MetricNamespaceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.monitor.generated.MonitorManager manager() {
        return this.serviceManager;
    }
}
