// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.fluent.models.RestorableDroppedSqlPoolInner;
import com.azure.resourcemanager.synapse.models.RestorableDroppedSqlPool;
import java.time.OffsetDateTime;

public final class RestorableDroppedSqlPoolImpl implements RestorableDroppedSqlPool {
    private RestorableDroppedSqlPoolInner innerObject;

    private final SynapseManager serviceManager;

    public RestorableDroppedSqlPoolImpl(RestorableDroppedSqlPoolInner innerObject, SynapseManager serviceManager) {
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

    public String location() {
        return this.innerModel().location();
    }

    public String databaseName() {
        return this.innerModel().databaseName();
    }

    public String edition() {
        return this.innerModel().edition();
    }

    public String maxSizeBytes() {
        return this.innerModel().maxSizeBytes();
    }

    public String serviceLevelObjective() {
        return this.innerModel().serviceLevelObjective();
    }

    public String elasticPoolName() {
        return this.innerModel().elasticPoolName();
    }

    public OffsetDateTime creationDate() {
        return this.innerModel().creationDate();
    }

    public OffsetDateTime deletionDate() {
        return this.innerModel().deletionDate();
    }

    public OffsetDateTime earliestRestoreDate() {
        return this.innerModel().earliestRestoreDate();
    }

    public RestorableDroppedSqlPoolInner innerModel() {
        return this.innerObject;
    }

    private SynapseManager manager() {
        return this.serviceManager;
    }
}
