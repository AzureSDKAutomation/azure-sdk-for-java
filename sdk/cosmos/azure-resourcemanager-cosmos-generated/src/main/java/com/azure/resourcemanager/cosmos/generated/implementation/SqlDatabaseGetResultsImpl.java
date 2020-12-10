// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmos.generated.CosmosDBManager;
import com.azure.resourcemanager.cosmos.generated.fluent.models.SqlDatabaseGetResultsInner;
import com.azure.resourcemanager.cosmos.generated.models.CreateUpdateOptions;
import com.azure.resourcemanager.cosmos.generated.models.OptionsResource;
import com.azure.resourcemanager.cosmos.generated.models.SqlDatabaseCreateUpdateParameters;
import com.azure.resourcemanager.cosmos.generated.models.SqlDatabaseGetPropertiesResource;
import com.azure.resourcemanager.cosmos.generated.models.SqlDatabaseGetResults;
import com.azure.resourcemanager.cosmos.generated.models.SqlDatabaseResource;
import java.util.Collections;
import java.util.Map;

public final class SqlDatabaseGetResultsImpl
    implements SqlDatabaseGetResults, SqlDatabaseGetResults.Definition, SqlDatabaseGetResults.Update {
    private SqlDatabaseGetResultsInner innerObject;

    private final CosmosDBManager serviceManager;

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

    public SqlDatabaseGetPropertiesResource resource() {
        return this.innerModel().resource();
    }

    public OptionsResource options() {
        return this.innerModel().options();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public SqlDatabaseGetResultsInner innerModel() {
        return this.innerObject;
    }

    private CosmosDBManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String databaseName;

    private SqlDatabaseCreateUpdateParameters createCreateUpdateSqlDatabaseParameters;

    private SqlDatabaseCreateUpdateParameters updateCreateUpdateSqlDatabaseParameters;

    public SqlDatabaseGetResultsImpl withExistingDatabaseAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public SqlDatabaseGetResults create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlResources()
                .createUpdateSqlDatabase(
                    resourceGroupName,
                    accountName,
                    databaseName,
                    createCreateUpdateSqlDatabaseParameters,
                    Context.NONE);
        return this;
    }

    public SqlDatabaseGetResults create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlResources()
                .createUpdateSqlDatabase(
                    resourceGroupName, accountName, databaseName, createCreateUpdateSqlDatabaseParameters, context);
        return this;
    }

    public SqlDatabaseGetResultsImpl(String name, CosmosDBManager serviceManager) {
        this.innerObject = new SqlDatabaseGetResultsInner();
        this.serviceManager = serviceManager;
        this.databaseName = name;
        this.createCreateUpdateSqlDatabaseParameters = new SqlDatabaseCreateUpdateParameters();
    }

    public SqlDatabaseGetResultsImpl update() {
        this.updateCreateUpdateSqlDatabaseParameters = new SqlDatabaseCreateUpdateParameters();
        return this;
    }

    public SqlDatabaseGetResults apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlResources()
                .createUpdateSqlDatabase(
                    resourceGroupName,
                    accountName,
                    databaseName,
                    updateCreateUpdateSqlDatabaseParameters,
                    Context.NONE);
        return this;
    }

    public SqlDatabaseGetResults apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlResources()
                .createUpdateSqlDatabase(
                    resourceGroupName, accountName, databaseName, updateCreateUpdateSqlDatabaseParameters, context);
        return this;
    }

    public SqlDatabaseGetResultsImpl(SqlDatabaseGetResultsInner innerObject, CosmosDBManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "databaseAccounts");
        this.databaseName = Utils.getValueFromIdByName(innerObject.id(), "sqlDatabases");
    }

    public SqlDatabaseGetResults refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlResources()
                .getSqlDatabaseWithResponse(resourceGroupName, accountName, databaseName, Context.NONE)
                .getValue();
        return this;
    }

    public SqlDatabaseGetResults refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlResources()
                .getSqlDatabaseWithResponse(resourceGroupName, accountName, databaseName, context)
                .getValue();
        return this;
    }

    public SqlDatabaseGetResultsImpl withRegion(Region location) {
        this.createCreateUpdateSqlDatabaseParameters.withLocation(location.toString());
        return this;
    }

    public SqlDatabaseGetResultsImpl withRegion(String location) {
        this.createCreateUpdateSqlDatabaseParameters.withLocation(location);
        return this;
    }

    public SqlDatabaseGetResultsImpl withResource(SqlDatabaseResource resource) {
        if (isInCreateMode()) {
            this.createCreateUpdateSqlDatabaseParameters.withResource(resource);
            return this;
        } else {
            this.updateCreateUpdateSqlDatabaseParameters.withResource(resource);
            return this;
        }
    }

    public SqlDatabaseGetResultsImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.createCreateUpdateSqlDatabaseParameters.withTags(tags);
            return this;
        } else {
            this.updateCreateUpdateSqlDatabaseParameters.withTags(tags);
            return this;
        }
    }

    public SqlDatabaseGetResultsImpl withOptions(CreateUpdateOptions options) {
        if (isInCreateMode()) {
            this.createCreateUpdateSqlDatabaseParameters.withOptions(options);
            return this;
        } else {
            this.updateCreateUpdateSqlDatabaseParameters.withOptions(options);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
