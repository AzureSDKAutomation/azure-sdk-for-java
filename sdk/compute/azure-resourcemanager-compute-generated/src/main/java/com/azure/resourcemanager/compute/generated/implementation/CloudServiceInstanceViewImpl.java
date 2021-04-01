// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.resourcemanager.compute.generated.fluent.models.CloudServiceInstanceViewInner;
import com.azure.resourcemanager.compute.generated.models.CloudServiceInstanceView;
import com.azure.resourcemanager.compute.generated.models.InstanceViewStatusesSummary;
import com.azure.resourcemanager.compute.generated.models.ResourceInstanceViewStatus;
import java.util.Collections;
import java.util.List;

public final class CloudServiceInstanceViewImpl implements CloudServiceInstanceView {
    private CloudServiceInstanceViewInner innerObject;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    CloudServiceInstanceViewImpl(
        CloudServiceInstanceViewInner innerObject,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public InstanceViewStatusesSummary roleInstance() {
        return this.innerModel().roleInstance();
    }

    public String sdkVersion() {
        return this.innerModel().sdkVersion();
    }

    public List<String> privateIds() {
        List<String> inner = this.innerModel().privateIds();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ResourceInstanceViewStatus> statuses() {
        List<ResourceInstanceViewStatus> inner = this.innerModel().statuses();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public CloudServiceInstanceViewInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }
}
