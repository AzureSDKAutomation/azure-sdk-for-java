// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.resourcemanager.hdinsight.fluent.models.ClusterConfigurationsInner;
import java.util.Map;

/** An immutable client-side representation of ClusterConfigurations. */
public interface ClusterConfigurations {
    /**
     * Gets the configurations property: The configuration object for the specified configuration for the specified
     * cluster.
     *
     * @return the configurations value.
     */
    Map<String, Object> configurations();

    /**
     * Gets the inner com.azure.resourcemanager.hdinsight.fluent.models.ClusterConfigurationsInner object.
     *
     * @return the inner object.
     */
    ClusterConfigurationsInner innerModel();
}
