// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.resourcemanager.sql.generated.fluent.models.DatabaseUsageInner;
import com.azure.resourcemanager.sql.generated.models.DatabaseUsage;
import java.time.OffsetDateTime;

public final class DatabaseUsageImpl implements DatabaseUsage {
    private DatabaseUsageInner innerObject;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    DatabaseUsageImpl(
        DatabaseUsageInner innerObject, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public String resourceName() {
        return this.innerModel().resourceName();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public Double currentValue() {
        return this.innerModel().currentValue();
    }

    public Double limit() {
        return this.innerModel().limit();
    }

    public String unit() {
        return this.innerModel().unit();
    }

    public OffsetDateTime nextResetTime() {
        return this.innerModel().nextResetTime();
    }

    public DatabaseUsageInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }
}
