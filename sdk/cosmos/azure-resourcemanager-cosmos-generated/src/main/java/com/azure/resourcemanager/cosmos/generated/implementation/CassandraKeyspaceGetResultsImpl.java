// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmos.generated.CosmosDBManager;
import com.azure.resourcemanager.cosmos.generated.fluent.models.CassandraKeyspaceGetResultsInner;
import com.azure.resourcemanager.cosmos.generated.models.CassandraKeyspaceCreateUpdateParameters;
import com.azure.resourcemanager.cosmos.generated.models.CassandraKeyspaceGetPropertiesResource;
import com.azure.resourcemanager.cosmos.generated.models.CassandraKeyspaceGetResults;
import com.azure.resourcemanager.cosmos.generated.models.CassandraKeyspaceResource;
import com.azure.resourcemanager.cosmos.generated.models.CreateUpdateOptions;
import com.azure.resourcemanager.cosmos.generated.models.OptionsResource;
import java.util.Collections;
import java.util.Map;

public final class CassandraKeyspaceGetResultsImpl
    implements CassandraKeyspaceGetResults, CassandraKeyspaceGetResults.Definition, CassandraKeyspaceGetResults.Update {
    private CassandraKeyspaceGetResultsInner innerObject;

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

    public CassandraKeyspaceGetPropertiesResource resource() {
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

    public CassandraKeyspaceGetResultsInner innerModel() {
        return this.innerObject;
    }

    private CosmosDBManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String keyspaceName;

    private CassandraKeyspaceCreateUpdateParameters createCreateUpdateCassandraKeyspaceParameters;

    private CassandraKeyspaceCreateUpdateParameters updateCreateUpdateCassandraKeyspaceParameters;

    public CassandraKeyspaceGetResultsImpl withExistingDatabaseAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public CassandraKeyspaceGetResults create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCassandraResources()
                .createUpdateCassandraKeyspace(
                    resourceGroupName,
                    accountName,
                    keyspaceName,
                    createCreateUpdateCassandraKeyspaceParameters,
                    Context.NONE);
        return this;
    }

    public CassandraKeyspaceGetResults create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCassandraResources()
                .createUpdateCassandraKeyspace(
                    resourceGroupName,
                    accountName,
                    keyspaceName,
                    createCreateUpdateCassandraKeyspaceParameters,
                    context);
        return this;
    }

    CassandraKeyspaceGetResultsImpl(String name, CosmosDBManager serviceManager) {
        this.innerObject = new CassandraKeyspaceGetResultsInner();
        this.serviceManager = serviceManager;
        this.keyspaceName = name;
        this.createCreateUpdateCassandraKeyspaceParameters = new CassandraKeyspaceCreateUpdateParameters();
    }

    public CassandraKeyspaceGetResultsImpl update() {
        this.updateCreateUpdateCassandraKeyspaceParameters = new CassandraKeyspaceCreateUpdateParameters();
        return this;
    }

    public CassandraKeyspaceGetResults apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCassandraResources()
                .createUpdateCassandraKeyspace(
                    resourceGroupName,
                    accountName,
                    keyspaceName,
                    updateCreateUpdateCassandraKeyspaceParameters,
                    Context.NONE);
        return this;
    }

    public CassandraKeyspaceGetResults apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCassandraResources()
                .createUpdateCassandraKeyspace(
                    resourceGroupName,
                    accountName,
                    keyspaceName,
                    updateCreateUpdateCassandraKeyspaceParameters,
                    context);
        return this;
    }

    CassandraKeyspaceGetResultsImpl(CassandraKeyspaceGetResultsInner innerObject, CosmosDBManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "databaseAccounts");
        this.keyspaceName = Utils.getValueFromIdByName(innerObject.id(), "cassandraKeyspaces");
    }

    public CassandraKeyspaceGetResults refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCassandraResources()
                .getCassandraKeyspaceWithResponse(resourceGroupName, accountName, keyspaceName, Context.NONE)
                .getValue();
        return this;
    }

    public CassandraKeyspaceGetResults refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCassandraResources()
                .getCassandraKeyspaceWithResponse(resourceGroupName, accountName, keyspaceName, context)
                .getValue();
        return this;
    }

    public CassandraKeyspaceGetResultsImpl withRegion(Region location) {
        this.createCreateUpdateCassandraKeyspaceParameters.withLocation(location.toString());
        return this;
    }

    public CassandraKeyspaceGetResultsImpl withRegion(String location) {
        this.createCreateUpdateCassandraKeyspaceParameters.withLocation(location);
        return this;
    }

    public CassandraKeyspaceGetResultsImpl withResource(CassandraKeyspaceResource resource) {
        if (isInCreateMode()) {
            this.createCreateUpdateCassandraKeyspaceParameters.withResource(resource);
            return this;
        } else {
            this.updateCreateUpdateCassandraKeyspaceParameters.withResource(resource);
            return this;
        }
    }

    public CassandraKeyspaceGetResultsImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.createCreateUpdateCassandraKeyspaceParameters.withTags(tags);
            return this;
        } else {
            this.updateCreateUpdateCassandraKeyspaceParameters.withTags(tags);
            return this;
        }
    }

    public CassandraKeyspaceGetResultsImpl withOptions(CreateUpdateOptions options) {
        if (isInCreateMode()) {
            this.createCreateUpdateCassandraKeyspaceParameters.withOptions(options);
            return this;
        } else {
            this.updateCreateUpdateCassandraKeyspaceParameters.withOptions(options);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
