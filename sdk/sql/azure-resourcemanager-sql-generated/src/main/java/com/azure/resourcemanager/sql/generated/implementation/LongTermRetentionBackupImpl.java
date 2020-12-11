// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.models.LongTermRetentionBackupInner;
import com.azure.resourcemanager.sql.generated.models.LongTermRetentionBackup;
import java.time.OffsetDateTime;

public final class LongTermRetentionBackupImpl implements LongTermRetentionBackup {
    private LongTermRetentionBackupInner innerObject;

    private final SqlManager serviceManager;

    public LongTermRetentionBackupImpl(LongTermRetentionBackupInner innerObject, SqlManager serviceManager) {
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

    public String serverName() {
        return this.innerModel().serverName();
    }

    public OffsetDateTime serverCreateTime() {
        return this.innerModel().serverCreateTime();
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

    public LongTermRetentionBackupInner innerModel() {
        return this.innerObject;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }
}
