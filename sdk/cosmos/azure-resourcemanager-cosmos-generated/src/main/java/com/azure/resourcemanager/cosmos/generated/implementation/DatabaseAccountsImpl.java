// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.CosmosDBManager;
import com.azure.resourcemanager.cosmos.generated.fluent.DatabaseAccountsClient;
import com.azure.resourcemanager.cosmos.generated.fluent.models.DatabaseAccountGetResultsInner;
import com.azure.resourcemanager.cosmos.generated.fluent.models.DatabaseAccountListConnectionStringsResultInner;
import com.azure.resourcemanager.cosmos.generated.fluent.models.DatabaseAccountListKeysResultInner;
import com.azure.resourcemanager.cosmos.generated.fluent.models.DatabaseAccountListReadOnlyKeysResultInner;
import com.azure.resourcemanager.cosmos.generated.fluent.models.MetricDefinitionInner;
import com.azure.resourcemanager.cosmos.generated.fluent.models.MetricInner;
import com.azure.resourcemanager.cosmos.generated.fluent.models.UsageInner;
import com.azure.resourcemanager.cosmos.generated.models.DatabaseAccountGetResults;
import com.azure.resourcemanager.cosmos.generated.models.DatabaseAccountListConnectionStringsResult;
import com.azure.resourcemanager.cosmos.generated.models.DatabaseAccountListKeysResult;
import com.azure.resourcemanager.cosmos.generated.models.DatabaseAccountListReadOnlyKeysResult;
import com.azure.resourcemanager.cosmos.generated.models.DatabaseAccountRegenerateKeyParameters;
import com.azure.resourcemanager.cosmos.generated.models.DatabaseAccounts;
import com.azure.resourcemanager.cosmos.generated.models.FailoverPolicies;
import com.azure.resourcemanager.cosmos.generated.models.Metric;
import com.azure.resourcemanager.cosmos.generated.models.MetricDefinition;
import com.azure.resourcemanager.cosmos.generated.models.RegionForOnlineOffline;
import com.azure.resourcemanager.cosmos.generated.models.Usage;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DatabaseAccountsImpl implements DatabaseAccounts {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatabaseAccountsImpl.class);

    private final DatabaseAccountsClient innerClient;

    private final CosmosDBManager serviceManager;

    public DatabaseAccountsImpl(DatabaseAccountsClient innerClient, CosmosDBManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public DatabaseAccountGetResults getByResourceGroup(String resourceGroupName, String accountName) {
        DatabaseAccountGetResultsInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, accountName);
        if (inner != null) {
            return new DatabaseAccountGetResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DatabaseAccountGetResults> getByResourceGroupWithResponse(
        String resourceGroupName, String accountName, Context context) {
        Response<DatabaseAccountGetResultsInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, accountName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DatabaseAccountGetResultsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String accountName) {
        this.serviceClient().delete(resourceGroupName, accountName);
    }

    public void delete(String resourceGroupName, String accountName, Context context) {
        this.serviceClient().delete(resourceGroupName, accountName, context);
    }

    public void failoverPriorityChange(
        String resourceGroupName, String accountName, FailoverPolicies failoverParameters) {
        this.serviceClient().failoverPriorityChange(resourceGroupName, accountName, failoverParameters);
    }

    public void failoverPriorityChange(
        String resourceGroupName, String accountName, FailoverPolicies failoverParameters, Context context) {
        this.serviceClient().failoverPriorityChange(resourceGroupName, accountName, failoverParameters, context);
    }

    public PagedIterable<DatabaseAccountGetResults> list() {
        PagedIterable<DatabaseAccountGetResultsInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new DatabaseAccountGetResultsImpl(inner1, this.manager()));
    }

    public PagedIterable<DatabaseAccountGetResults> list(Context context) {
        PagedIterable<DatabaseAccountGetResultsInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new DatabaseAccountGetResultsImpl(inner1, this.manager()));
    }

    public PagedIterable<DatabaseAccountGetResults> listByResourceGroup(String resourceGroupName) {
        PagedIterable<DatabaseAccountGetResultsInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new DatabaseAccountGetResultsImpl(inner1, this.manager()));
    }

    public PagedIterable<DatabaseAccountGetResults> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<DatabaseAccountGetResultsInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new DatabaseAccountGetResultsImpl(inner1, this.manager()));
    }

    public DatabaseAccountListKeysResult listKeys(String resourceGroupName, String accountName) {
        DatabaseAccountListKeysResultInner inner = this.serviceClient().listKeys(resourceGroupName, accountName);
        if (inner != null) {
            return new DatabaseAccountListKeysResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DatabaseAccountListKeysResult> listKeysWithResponse(
        String resourceGroupName, String accountName, Context context) {
        Response<DatabaseAccountListKeysResultInner> inner =
            this.serviceClient().listKeysWithResponse(resourceGroupName, accountName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DatabaseAccountListKeysResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DatabaseAccountListConnectionStringsResult listConnectionStrings(
        String resourceGroupName, String accountName) {
        DatabaseAccountListConnectionStringsResultInner inner =
            this.serviceClient().listConnectionStrings(resourceGroupName, accountName);
        if (inner != null) {
            return new DatabaseAccountListConnectionStringsResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DatabaseAccountListConnectionStringsResult> listConnectionStringsWithResponse(
        String resourceGroupName, String accountName, Context context) {
        Response<DatabaseAccountListConnectionStringsResultInner> inner =
            this.serviceClient().listConnectionStringsWithResponse(resourceGroupName, accountName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DatabaseAccountListConnectionStringsResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void offlineRegion(
        String resourceGroupName, String accountName, RegionForOnlineOffline regionParameterForOffline) {
        this.serviceClient().offlineRegion(resourceGroupName, accountName, regionParameterForOffline);
    }

    public void offlineRegion(
        String resourceGroupName,
        String accountName,
        RegionForOnlineOffline regionParameterForOffline,
        Context context) {
        this.serviceClient().offlineRegion(resourceGroupName, accountName, regionParameterForOffline, context);
    }

    public void onlineRegion(
        String resourceGroupName, String accountName, RegionForOnlineOffline regionParameterForOnline) {
        this.serviceClient().onlineRegion(resourceGroupName, accountName, regionParameterForOnline);
    }

    public void onlineRegion(
        String resourceGroupName,
        String accountName,
        RegionForOnlineOffline regionParameterForOnline,
        Context context) {
        this.serviceClient().onlineRegion(resourceGroupName, accountName, regionParameterForOnline, context);
    }

    public DatabaseAccountListReadOnlyKeysResult getReadOnlyKeys(String resourceGroupName, String accountName) {
        DatabaseAccountListReadOnlyKeysResultInner inner =
            this.serviceClient().getReadOnlyKeys(resourceGroupName, accountName);
        if (inner != null) {
            return new DatabaseAccountListReadOnlyKeysResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DatabaseAccountListReadOnlyKeysResult> getReadOnlyKeysWithResponse(
        String resourceGroupName, String accountName, Context context) {
        Response<DatabaseAccountListReadOnlyKeysResultInner> inner =
            this.serviceClient().getReadOnlyKeysWithResponse(resourceGroupName, accountName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DatabaseAccountListReadOnlyKeysResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DatabaseAccountListReadOnlyKeysResult listReadOnlyKeys(String resourceGroupName, String accountName) {
        DatabaseAccountListReadOnlyKeysResultInner inner =
            this.serviceClient().listReadOnlyKeys(resourceGroupName, accountName);
        if (inner != null) {
            return new DatabaseAccountListReadOnlyKeysResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DatabaseAccountListReadOnlyKeysResult> listReadOnlyKeysWithResponse(
        String resourceGroupName, String accountName, Context context) {
        Response<DatabaseAccountListReadOnlyKeysResultInner> inner =
            this.serviceClient().listReadOnlyKeysWithResponse(resourceGroupName, accountName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DatabaseAccountListReadOnlyKeysResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void regenerateKey(
        String resourceGroupName, String accountName, DatabaseAccountRegenerateKeyParameters keyToRegenerate) {
        this.serviceClient().regenerateKey(resourceGroupName, accountName, keyToRegenerate);
    }

    public void regenerateKey(
        String resourceGroupName,
        String accountName,
        DatabaseAccountRegenerateKeyParameters keyToRegenerate,
        Context context) {
        this.serviceClient().regenerateKey(resourceGroupName, accountName, keyToRegenerate, context);
    }

    public boolean checkNameExists(String accountName) {
        return this.serviceClient().checkNameExists(accountName);
    }

    public Response<Boolean> checkNameExistsWithResponse(String accountName, Context context) {
        return this.serviceClient().checkNameExistsWithResponse(accountName, context);
    }

    public PagedIterable<Metric> listMetrics(String resourceGroupName, String accountName, String filter) {
        PagedIterable<MetricInner> inner = this.serviceClient().listMetrics(resourceGroupName, accountName, filter);
        return Utils.mapPage(inner, inner1 -> new MetricImpl(inner1, this.manager()));
    }

    public PagedIterable<Metric> listMetrics(
        String resourceGroupName, String accountName, String filter, Context context) {
        PagedIterable<MetricInner> inner =
            this.serviceClient().listMetrics(resourceGroupName, accountName, filter, context);
        return Utils.mapPage(inner, inner1 -> new MetricImpl(inner1, this.manager()));
    }

    public PagedIterable<Usage> listUsages(String resourceGroupName, String accountName) {
        PagedIterable<UsageInner> inner = this.serviceClient().listUsages(resourceGroupName, accountName);
        return Utils.mapPage(inner, inner1 -> new UsageImpl(inner1, this.manager()));
    }

    public PagedIterable<Usage> listUsages(
        String resourceGroupName, String accountName, String filter, Context context) {
        PagedIterable<UsageInner> inner =
            this.serviceClient().listUsages(resourceGroupName, accountName, filter, context);
        return Utils.mapPage(inner, inner1 -> new UsageImpl(inner1, this.manager()));
    }

    public PagedIterable<MetricDefinition> listMetricDefinitions(String resourceGroupName, String accountName) {
        PagedIterable<MetricDefinitionInner> inner =
            this.serviceClient().listMetricDefinitions(resourceGroupName, accountName);
        return Utils.mapPage(inner, inner1 -> new MetricDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<MetricDefinition> listMetricDefinitions(
        String resourceGroupName, String accountName, Context context) {
        PagedIterable<MetricDefinitionInner> inner =
            this.serviceClient().listMetricDefinitions(resourceGroupName, accountName, context);
        return Utils.mapPage(inner, inner1 -> new MetricDefinitionImpl(inner1, this.manager()));
    }

    public DatabaseAccountGetResults getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "databaseAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'databaseAccounts'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, accountName, Context.NONE).getValue();
    }

    public Response<DatabaseAccountGetResults> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "databaseAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'databaseAccounts'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, accountName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "databaseAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'databaseAccounts'.", id)));
        }
        this.delete(resourceGroupName, accountName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "databaseAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'databaseAccounts'.", id)));
        }
        this.delete(resourceGroupName, accountName, context);
    }

    private DatabaseAccountsClient serviceClient() {
        return this.innerClient;
    }

    private CosmosDBManager manager() {
        return this.serviceManager;
    }

    public DatabaseAccountGetResultsImpl define(String name) {
        return new DatabaseAccountGetResultsImpl(name, this.manager());
    }
}
