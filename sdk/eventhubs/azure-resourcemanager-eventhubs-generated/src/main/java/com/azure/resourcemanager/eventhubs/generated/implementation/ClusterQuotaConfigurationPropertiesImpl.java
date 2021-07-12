// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.implementation;

import com.azure.resourcemanager.eventhubs.generated.fluent.models.ClusterQuotaConfigurationPropertiesInner;
import com.azure.resourcemanager.eventhubs.generated.models.ClusterQuotaConfigurationProperties;
import java.util.Collections;
import java.util.Map;

public final class ClusterQuotaConfigurationPropertiesImpl implements ClusterQuotaConfigurationProperties {
    private ClusterQuotaConfigurationPropertiesInner innerObject;

    private final com.azure.resourcemanager.eventhubs.generated.EventHubsManager serviceManager;

    ClusterQuotaConfigurationPropertiesImpl(
        ClusterQuotaConfigurationPropertiesInner innerObject,
        com.azure.resourcemanager.eventhubs.generated.EventHubsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Map<String, String> settings() {
        Map<String, String> inner = this.innerModel().settings();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ClusterQuotaConfigurationPropertiesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.eventhubs.generated.EventHubsManager manager() {
        return this.serviceManager;
    }
}
