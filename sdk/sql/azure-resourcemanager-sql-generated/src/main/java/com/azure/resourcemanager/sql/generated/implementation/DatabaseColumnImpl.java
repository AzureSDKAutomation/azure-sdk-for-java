// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.models.DatabaseColumnInner;
import com.azure.resourcemanager.sql.generated.models.ColumnDataType;
import com.azure.resourcemanager.sql.generated.models.DatabaseColumn;
import com.azure.resourcemanager.sql.generated.models.TableTemporalType;

public final class DatabaseColumnImpl implements DatabaseColumn {
    private DatabaseColumnInner innerObject;

    private final SqlManager serviceManager;

    DatabaseColumnImpl(DatabaseColumnInner innerObject, SqlManager serviceManager) {
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

    public TableTemporalType temporalType() {
        return this.innerModel().temporalType();
    }

    public Boolean memoryOptimized() {
        return this.innerModel().memoryOptimized();
    }

    public Boolean isComputed() {
        return this.innerModel().isComputed();
    }

    public DatabaseColumnInner innerModel() {
        return this.innerObject;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }
}
