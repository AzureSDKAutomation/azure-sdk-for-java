// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmos.generated.fluent.models.SqlContainerGetResultsInner;
import com.azure.resourcemanager.cosmos.generated.models.BackupInformation;
import com.azure.resourcemanager.cosmos.generated.models.ContinuousBackupRestoreLocation;
import com.azure.resourcemanager.cosmos.generated.models.CreateUpdateOptions;
import com.azure.resourcemanager.cosmos.generated.models.SqlContainerCreateUpdateParameters;
import com.azure.resourcemanager.cosmos.generated.models.SqlContainerGetPropertiesOptions;
import com.azure.resourcemanager.cosmos.generated.models.SqlContainerGetPropertiesResource;
import com.azure.resourcemanager.cosmos.generated.models.SqlContainerGetResults;
import com.azure.resourcemanager.cosmos.generated.models.SqlContainerResource;
import java.util.Collections;
import java.util.Map;

public final class SqlContainerGetResultsImpl
    implements SqlContainerGetResults, SqlContainerGetResults.Definition, SqlContainerGetResults.Update {
    private SqlContainerGetResultsInner innerObject;

    private final com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager;

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

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public SqlContainerGetPropertiesResource resource() {
        return this.innerModel().resource();
    }

    public SqlContainerGetPropertiesOptions options() {
        return this.innerModel().options();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public SqlContainerGetResultsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String databaseName;

    private String containerName;

    private SqlContainerCreateUpdateParameters createCreateUpdateSqlContainerParameters;

    private SqlContainerCreateUpdateParameters updateCreateUpdateSqlContainerParameters;

    public SqlContainerGetResultsImpl withExistingSqlDatabase(
        String resourceGroupName, String accountName, String databaseName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        this.databaseName = databaseName;
        return this;
    }

    public SqlContainerGetResults create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlResources()
                .createUpdateSqlContainer(
                    resourceGroupName,
                    accountName,
                    databaseName,
                    containerName,
                    createCreateUpdateSqlContainerParameters,
                    Context.NONE);
        return this;
    }

    public SqlContainerGetResults create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlResources()
                .createUpdateSqlContainer(
                    resourceGroupName,
                    accountName,
                    databaseName,
                    containerName,
                    createCreateUpdateSqlContainerParameters,
                    context);
        return this;
    }

    SqlContainerGetResultsImpl(String name, com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerObject = new SqlContainerGetResultsInner();
        this.serviceManager = serviceManager;
        this.containerName = name;
        this.createCreateUpdateSqlContainerParameters = new SqlContainerCreateUpdateParameters();
    }

    public SqlContainerGetResultsImpl update() {
        this.updateCreateUpdateSqlContainerParameters = new SqlContainerCreateUpdateParameters();
        return this;
    }

    public SqlContainerGetResults apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlResources()
                .createUpdateSqlContainer(
                    resourceGroupName,
                    accountName,
                    databaseName,
                    containerName,
                    updateCreateUpdateSqlContainerParameters,
                    Context.NONE);
        return this;
    }

    public SqlContainerGetResults apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlResources()
                .createUpdateSqlContainer(
                    resourceGroupName,
                    accountName,
                    databaseName,
                    containerName,
                    updateCreateUpdateSqlContainerParameters,
                    context);
        return this;
    }

    SqlContainerGetResultsImpl(
        SqlContainerGetResultsInner innerObject,
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "databaseAccounts");
        this.databaseName = Utils.getValueFromIdByName(innerObject.id(), "sqlDatabases");
        this.containerName = Utils.getValueFromIdByName(innerObject.id(), "containers");
    }

    public SqlContainerGetResults refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlResources()
                .getSqlContainerWithResponse(resourceGroupName, accountName, databaseName, containerName, Context.NONE)
                .getValue();
        return this;
    }

    public SqlContainerGetResults refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlResources()
                .getSqlContainerWithResponse(resourceGroupName, accountName, databaseName, containerName, context)
                .getValue();
        return this;
    }

    public BackupInformation retrieveContinuousBackupInformation(ContinuousBackupRestoreLocation location) {
        return serviceManager
            .sqlResources()
            .retrieveContinuousBackupInformation(resourceGroupName, accountName, databaseName, containerName, location);
    }

    public BackupInformation retrieveContinuousBackupInformation(
        ContinuousBackupRestoreLocation location, Context context) {
        return serviceManager
            .sqlResources()
            .retrieveContinuousBackupInformation(
                resourceGroupName, accountName, databaseName, containerName, location, context);
    }

    public SqlContainerGetResultsImpl withRegion(Region location) {
        this.createCreateUpdateSqlContainerParameters.withLocation(location.toString());
        return this;
    }

    public SqlContainerGetResultsImpl withRegion(String location) {
        this.createCreateUpdateSqlContainerParameters.withLocation(location);
        return this;
    }

    public SqlContainerGetResultsImpl withResource(SqlContainerResource resource) {
        if (isInCreateMode()) {
            this.createCreateUpdateSqlContainerParameters.withResource(resource);
            return this;
        } else {
            this.updateCreateUpdateSqlContainerParameters.withResource(resource);
            return this;
        }
    }

    public SqlContainerGetResultsImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.createCreateUpdateSqlContainerParameters.withTags(tags);
            return this;
        } else {
            this.updateCreateUpdateSqlContainerParameters.withTags(tags);
            return this;
        }
    }

    public SqlContainerGetResultsImpl withOptions(CreateUpdateOptions options) {
        if (isInCreateMode()) {
            this.createCreateUpdateSqlContainerParameters.withOptions(options);
            return this;
        } else {
            this.updateCreateUpdateSqlContainerParameters.withOptions(options);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
