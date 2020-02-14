/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_12_12.implementation;

import com.microsoft.azure.management.cosmosdb.v2019_12_12.SqlStoredProcedureGetResults;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.cosmosdb.v2019_12_12.SqlStoredProcedureCreateUpdateParameters;
import java.util.Map;
import com.microsoft.azure.management.cosmosdb.v2019_12_12.SqlStoredProcedureGetPropertiesResource;
import com.microsoft.azure.management.cosmosdb.v2019_12_12.SqlStoredProcedureResource;
import rx.functions.Func1;

class SqlStoredProcedureGetResultsImpl extends CreatableUpdatableImpl<SqlStoredProcedureGetResults, SqlStoredProcedureGetResultsInner, SqlStoredProcedureGetResultsImpl> implements SqlStoredProcedureGetResults, SqlStoredProcedureGetResults.Definition, SqlStoredProcedureGetResults.Update {
    private final CosmosDBManager manager;
    private String resourceGroupName;
    private String accountName;
    private String databaseName;
    private String containerName;
    private String storedProcedureName;
    private SqlStoredProcedureCreateUpdateParameters createOrUpdateParameter;

    SqlStoredProcedureGetResultsImpl(String name, CosmosDBManager manager) {
        super(name, new SqlStoredProcedureGetResultsInner());
        this.manager = manager;
        // Set resource name
        this.storedProcedureName = name;
        //
        this.createOrUpdateParameter = new SqlStoredProcedureCreateUpdateParameters();
    }

    SqlStoredProcedureGetResultsImpl(SqlStoredProcedureGetResultsInner inner, CosmosDBManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.storedProcedureName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "databaseAccounts");
        this.databaseName = IdParsingUtils.getValueFromIdByName(inner.id(), "sqlDatabases");
        this.containerName = IdParsingUtils.getValueFromIdByName(inner.id(), "containers");
        this.storedProcedureName = IdParsingUtils.getValueFromIdByName(inner.id(), "storedProcedures");
        //
        this.createOrUpdateParameter = new SqlStoredProcedureCreateUpdateParameters();
    }

    @Override
    public CosmosDBManager manager() {
        return this.manager;
    }

    @Override
    public Observable<SqlStoredProcedureGetResults> createResourceAsync() {
        SqlResourcesInner client = this.manager().inner().sqlResources();
        return client.createUpdateSqlStoredProcedureAsync(this.resourceGroupName, this.accountName, this.databaseName, this.containerName, this.storedProcedureName, this.createOrUpdateParameter)
            .map(new Func1<SqlStoredProcedureGetResultsInner, SqlStoredProcedureGetResultsInner>() {
               @Override
               public SqlStoredProcedureGetResultsInner call(SqlStoredProcedureGetResultsInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<SqlStoredProcedureGetResults> updateResourceAsync() {
        SqlResourcesInner client = this.manager().inner().sqlResources();
        return client.createUpdateSqlStoredProcedureAsync(this.resourceGroupName, this.accountName, this.databaseName, this.containerName, this.storedProcedureName, this.createOrUpdateParameter)
            .map(new Func1<SqlStoredProcedureGetResultsInner, SqlStoredProcedureGetResultsInner>() {
               @Override
               public SqlStoredProcedureGetResultsInner call(SqlStoredProcedureGetResultsInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<SqlStoredProcedureGetResultsInner> getInnerAsync() {
        SqlResourcesInner client = this.manager().inner().sqlResources();
        return client.getSqlStoredProcedureAsync(this.resourceGroupName, this.accountName, this.databaseName, this.containerName, this.storedProcedureName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createOrUpdateParameter = new SqlStoredProcedureCreateUpdateParameters();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public SqlStoredProcedureGetPropertiesResource resource() {
        return this.inner().resource();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public SqlStoredProcedureGetResultsImpl withExistingContainer(String resourceGroupName, String accountName, String databaseName, String containerName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        this.databaseName = databaseName;
        this.containerName = containerName;
        return this;
    }

    @Override
    public SqlStoredProcedureGetResultsImpl withLocation(String location) {
        this.createOrUpdateParameter.withLocation(location);
        return this;
    }

    @Override
    public SqlStoredProcedureGetResultsImpl withOptions(Map<String, String> options) {
        this.createOrUpdateParameter.withOptions(options);
        return this;
    }

    @Override
    public SqlStoredProcedureGetResultsImpl withResource(SqlStoredProcedureResource resource) {
        this.createOrUpdateParameter.withResource(resource);
        return this;
    }

    @Override
    public SqlStoredProcedureGetResultsImpl withTags(Map<String, String> tags) {
        this.createOrUpdateParameter.withTags(tags);
        return this;
    }

}
