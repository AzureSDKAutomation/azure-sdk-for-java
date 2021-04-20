// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.resourcemanager.sql.generated.fluent.models.DatabaseOperationInner;
import com.azure.resourcemanager.sql.generated.models.DatabaseOperation;
import com.azure.resourcemanager.sql.generated.models.ManagementOperationState;
import java.time.OffsetDateTime;

public final class DatabaseOperationImpl implements DatabaseOperation {
    private DatabaseOperationInner innerObject;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    DatabaseOperationImpl(
        DatabaseOperationInner innerObject, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
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

    public String databaseName() {
        return this.innerModel().databaseName();
    }

    public String operation() {
        return this.innerModel().operation();
    }

    public String operationFriendlyName() {
        return this.innerModel().operationFriendlyName();
    }

    public Integer percentComplete() {
        return this.innerModel().percentComplete();
    }

    public String serverName() {
        return this.innerModel().serverName();
    }

    public OffsetDateTime startTime() {
        return this.innerModel().startTime();
    }

    public ManagementOperationState state() {
        return this.innerModel().state();
    }

    public Integer errorCode() {
        return this.innerModel().errorCode();
    }

    public String errorDescription() {
        return this.innerModel().errorDescription();
    }

    public Integer errorSeverity() {
        return this.innerModel().errorSeverity();
    }

    public Boolean isUserError() {
        return this.innerModel().isUserError();
    }

    public OffsetDateTime estimatedCompletionTime() {
        return this.innerModel().estimatedCompletionTime();
    }

    public String description() {
        return this.innerModel().description();
    }

    public Boolean isCancellable() {
        return this.innerModel().isCancellable();
    }

    public DatabaseOperationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }
}
