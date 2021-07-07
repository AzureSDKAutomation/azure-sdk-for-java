// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.fluent.models.AzureReachabilityReportInner;
import com.azure.resourcemanager.network.generated.models.AzureReachabilityReport;
import com.azure.resourcemanager.network.generated.models.AzureReachabilityReportItem;
import com.azure.resourcemanager.network.generated.models.AzureReachabilityReportLocation;
import java.util.Collections;
import java.util.List;

public final class AzureReachabilityReportImpl implements AzureReachabilityReport {
    private AzureReachabilityReportInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    AzureReachabilityReportImpl(
        AzureReachabilityReportInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String aggregationLevel() {
        return this.innerModel().aggregationLevel();
    }

    public AzureReachabilityReportLocation providerLocation() {
        return this.innerModel().providerLocation();
    }

    public List<AzureReachabilityReportItem> reachabilityReport() {
        List<AzureReachabilityReportItem> inner = this.innerModel().reachabilityReport();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public AzureReachabilityReportInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
