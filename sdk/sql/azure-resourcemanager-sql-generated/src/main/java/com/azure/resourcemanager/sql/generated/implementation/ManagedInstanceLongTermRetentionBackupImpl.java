// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.resourcemanager.sql.generated.fluent.models.ManagedInstanceLongTermRetentionBackupInner;
import com.azure.resourcemanager.sql.generated.models.ManagedInstanceLongTermRetentionBackup;
import java.time.OffsetDateTime;

public final class ManagedInstanceLongTermRetentionBackupImpl implements ManagedInstanceLongTermRetentionBackup {
    private ManagedInstanceLongTermRetentionBackupInner innerObject;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    ManagedInstanceLongTermRetentionBackupImpl(
        ManagedInstanceLongTermRetentionBackupInner innerObject,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
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

    public String managedInstanceName() {
        return this.innerModel().managedInstanceName();
    }

    public OffsetDateTime managedInstanceCreateTime() {
        return this.innerModel().managedInstanceCreateTime();
    }

    public String databaseName() {
        return this.innerModel().databaseName();
    }

    public OffsetDateTime databaseDeletionTime() {
        return this.innerModel().databaseDeletionTime();
    }

    public OffsetDateTime backupTime() {
        return this.innerModel().backupTime();
    }

    public OffsetDateTime backupExpirationTime() {
        return this.innerModel().backupExpirationTime();
    }

    public ManagedInstanceLongTermRetentionBackupInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }
}
