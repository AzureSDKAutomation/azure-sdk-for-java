// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.implementation;

import com.azure.resourcemanager.hdinsight.HDInsightManager;
import com.azure.resourcemanager.hdinsight.fluent.models.ClusterMonitoringResponseInner;
import com.azure.resourcemanager.hdinsight.models.ClusterMonitoringResponse;

public final class ClusterMonitoringResponseImpl implements ClusterMonitoringResponse {
    private ClusterMonitoringResponseInner innerObject;

    private final HDInsightManager serviceManager;

    public ClusterMonitoringResponseImpl(ClusterMonitoringResponseInner innerObject, HDInsightManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Boolean clusterMonitoringEnabled() {
        return this.innerModel().clusterMonitoringEnabled();
    }

    public String workspaceId() {
        return this.innerModel().workspaceId();
    }

    public ClusterMonitoringResponseInner innerModel() {
        return this.innerObject;
    }

    private HDInsightManager manager() {
        return this.serviceManager;
    }
}
