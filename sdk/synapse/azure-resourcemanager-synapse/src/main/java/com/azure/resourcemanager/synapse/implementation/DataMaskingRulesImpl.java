// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.fluent.DataMaskingRulesClient;
import com.azure.resourcemanager.synapse.fluent.models.DataMaskingRuleInner;
import com.azure.resourcemanager.synapse.models.DataMaskingRule;
import com.azure.resourcemanager.synapse.models.DataMaskingRules;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DataMaskingRulesImpl implements DataMaskingRules {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataMaskingRulesImpl.class);

    private final DataMaskingRulesClient innerClient;

    private final SynapseManager serviceManager;

    public DataMaskingRulesImpl(DataMaskingRulesClient innerClient, SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public DataMaskingRule get(
        String resourceGroupName, String workspaceName, String sqlPoolName, String dataMaskingRuleName) {
        DataMaskingRuleInner inner =
            this.serviceClient().get(resourceGroupName, workspaceName, sqlPoolName, dataMaskingRuleName);
        if (inner != null) {
            return new DataMaskingRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DataMaskingRule> getWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        String dataMaskingRuleName,
        Context context) {
        Response<DataMaskingRuleInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, workspaceName, sqlPoolName, dataMaskingRuleName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DataMaskingRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<DataMaskingRule> listBySqlPool(
        String resourceGroupName, String workspaceName, String sqlPoolName) {
        PagedIterable<DataMaskingRuleInner> inner =
            this.serviceClient().listBySqlPool(resourceGroupName, workspaceName, sqlPoolName);
        return inner.mapPage(inner1 -> new DataMaskingRuleImpl(inner1, this.manager()));
    }

    public PagedIterable<DataMaskingRule> listBySqlPool(
        String resourceGroupName, String workspaceName, String sqlPoolName, Context context) {
        PagedIterable<DataMaskingRuleInner> inner =
            this.serviceClient().listBySqlPool(resourceGroupName, workspaceName, sqlPoolName, context);
        return inner.mapPage(inner1 -> new DataMaskingRuleImpl(inner1, this.manager()));
    }

    public DataMaskingRule getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String sqlPoolName = Utils.getValueFromIdByName(id, "sqlPools");
        if (sqlPoolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'sqlPools'.", id)));
        }
        String dataMaskingRuleName = Utils.getValueFromIdByName(id, "rules");
        if (dataMaskingRuleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'rules'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, workspaceName, sqlPoolName, dataMaskingRuleName, Context.NONE)
            .getValue();
    }

    public Response<DataMaskingRule> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String sqlPoolName = Utils.getValueFromIdByName(id, "sqlPools");
        if (sqlPoolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'sqlPools'.", id)));
        }
        String dataMaskingRuleName = Utils.getValueFromIdByName(id, "rules");
        if (dataMaskingRuleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'rules'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, sqlPoolName, dataMaskingRuleName, context);
    }

    private DataMaskingRulesClient serviceClient() {
        return this.innerClient;
    }

    private SynapseManager manager() {
        return this.serviceManager;
    }

    public DataMaskingRuleImpl define(String name) {
        return new DataMaskingRuleImpl(name, this.manager());
    }
}