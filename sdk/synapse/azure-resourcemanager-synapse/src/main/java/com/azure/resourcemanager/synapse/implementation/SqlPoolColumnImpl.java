// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.fluent.models.SqlPoolColumnInner;
import com.azure.resourcemanager.synapse.models.ColumnDataType;
import com.azure.resourcemanager.synapse.models.SqlPoolColumn;

public final class SqlPoolColumnImpl implements SqlPoolColumn {
    private SqlPoolColumnInner innerObject;

    private final SynapseManager serviceManager;

    public SqlPoolColumnImpl(SqlPoolColumnInner innerObject, SynapseManager serviceManager) {
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

    public ColumnDataType columnType() {
        return this.innerModel().columnType();
    }

    public SqlPoolColumnInner innerModel() {
        return this.innerObject;
    }

    private SynapseManager manager() {
        return this.serviceManager;
    }
}
