// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.resourcemanager.synapse.fluent.models.FollowerDatabaseDefinitionInner;
import com.azure.resourcemanager.synapse.models.FollowerDatabaseDefinition;

public final class FollowerDatabaseDefinitionImpl implements FollowerDatabaseDefinition {
    private FollowerDatabaseDefinitionInner innerObject;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    FollowerDatabaseDefinitionImpl(
        FollowerDatabaseDefinitionInner innerObject, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String clusterResourceId() {
        return this.innerModel().clusterResourceId();
    }

    public String attachedDatabaseConfigurationName() {
        return this.innerModel().attachedDatabaseConfigurationName();
    }

    public String databaseName() {
        return this.innerModel().databaseName();
    }

    public FollowerDatabaseDefinitionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }
}
