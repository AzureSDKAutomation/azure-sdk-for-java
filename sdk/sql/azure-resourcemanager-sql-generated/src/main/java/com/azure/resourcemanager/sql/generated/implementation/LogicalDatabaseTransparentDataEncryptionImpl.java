// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.LogicalDatabaseTransparentDataEncryptionInner;
import com.azure.resourcemanager.sql.generated.models.LogicalDatabaseTransparentDataEncryption;
import com.azure.resourcemanager.sql.generated.models.TransparentDataEncryptionName;
import com.azure.resourcemanager.sql.generated.models.TransparentDataEncryptionState;

public final class LogicalDatabaseTransparentDataEncryptionImpl
    implements LogicalDatabaseTransparentDataEncryption,
        LogicalDatabaseTransparentDataEncryption.Definition,
        LogicalDatabaseTransparentDataEncryption.Update {
    private LogicalDatabaseTransparentDataEncryptionInner innerObject;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public TransparentDataEncryptionState state() {
        return this.innerModel().state();
    }

    public LogicalDatabaseTransparentDataEncryptionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverName;

    private String databaseName;

    private TransparentDataEncryptionName tdeName;

    public LogicalDatabaseTransparentDataEncryptionImpl withExistingDatabase(
        String resourceGroupName, String serverName, String databaseName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        this.databaseName = databaseName;
        return this;
    }

    public LogicalDatabaseTransparentDataEncryption create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTransparentDataEncryptions()
                .createOrUpdateWithResponse(
                    resourceGroupName, serverName, databaseName, tdeName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public LogicalDatabaseTransparentDataEncryption create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTransparentDataEncryptions()
                .createOrUpdateWithResponse(
                    resourceGroupName, serverName, databaseName, tdeName, this.innerModel(), context)
                .getValue();
        return this;
    }

    LogicalDatabaseTransparentDataEncryptionImpl(
        TransparentDataEncryptionName name, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = new LogicalDatabaseTransparentDataEncryptionInner();
        this.serviceManager = serviceManager;
        this.tdeName = name;
    }

    public LogicalDatabaseTransparentDataEncryptionImpl update() {
        return this;
    }

    public LogicalDatabaseTransparentDataEncryption apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTransparentDataEncryptions()
                .createOrUpdateWithResponse(
                    resourceGroupName, serverName, databaseName, tdeName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public LogicalDatabaseTransparentDataEncryption apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTransparentDataEncryptions()
                .createOrUpdateWithResponse(
                    resourceGroupName, serverName, databaseName, tdeName, this.innerModel(), context)
                .getValue();
        return this;
    }

    LogicalDatabaseTransparentDataEncryptionImpl(
        LogicalDatabaseTransparentDataEncryptionInner innerObject,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serverName = Utils.getValueFromIdByName(innerObject.id(), "servers");
        this.databaseName = Utils.getValueFromIdByName(innerObject.id(), "databases");
        this.tdeName =
            TransparentDataEncryptionName
                .fromString(Utils.getValueFromIdByName(innerObject.id(), "transparentDataEncryption"));
    }

    public LogicalDatabaseTransparentDataEncryption refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTransparentDataEncryptions()
                .getWithResponse(resourceGroupName, serverName, databaseName, tdeName, Context.NONE)
                .getValue();
        return this;
    }

    public LogicalDatabaseTransparentDataEncryption refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTransparentDataEncryptions()
                .getWithResponse(resourceGroupName, serverName, databaseName, tdeName, context)
                .getValue();
        return this;
    }

    public LogicalDatabaseTransparentDataEncryptionImpl withState(TransparentDataEncryptionState state) {
        this.innerModel().withState(state);
        return this;
    }
}
