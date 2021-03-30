// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.SqlPoolGeoBackupPoliciesClient;
import com.azure.resourcemanager.synapse.fluent.models.GeoBackupPolicyInner;
import com.azure.resourcemanager.synapse.models.GeoBackupPolicy;
import com.azure.resourcemanager.synapse.models.GeoBackupPolicyName;
import com.azure.resourcemanager.synapse.models.SqlPoolGeoBackupPolicies;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class SqlPoolGeoBackupPoliciesImpl implements SqlPoolGeoBackupPolicies {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SqlPoolGeoBackupPoliciesImpl.class);

    private final SqlPoolGeoBackupPoliciesClient innerClient;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    public SqlPoolGeoBackupPoliciesImpl(
        SqlPoolGeoBackupPoliciesClient innerClient, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<GeoBackupPolicy> list(String resourceGroupName, String workspaceName, String sqlPoolName) {
        PagedIterable<GeoBackupPolicyInner> inner =
            this.serviceClient().list(resourceGroupName, workspaceName, sqlPoolName);
        return Utils.mapPage(inner, inner1 -> new GeoBackupPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<GeoBackupPolicy> list(
        String resourceGroupName, String workspaceName, String sqlPoolName, Context context) {
        PagedIterable<GeoBackupPolicyInner> inner =
            this.serviceClient().list(resourceGroupName, workspaceName, sqlPoolName, context);
        return Utils.mapPage(inner, inner1 -> new GeoBackupPolicyImpl(inner1, this.manager()));
    }

    public GeoBackupPolicy get(
        String resourceGroupName, String workspaceName, String sqlPoolName, GeoBackupPolicyName geoBackupPolicyName) {
        GeoBackupPolicyInner inner =
            this.serviceClient().get(resourceGroupName, workspaceName, sqlPoolName, geoBackupPolicyName);
        if (inner != null) {
            return new GeoBackupPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<GeoBackupPolicy> getWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        GeoBackupPolicyName geoBackupPolicyName,
        Context context) {
        Response<GeoBackupPolicyInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, workspaceName, sqlPoolName, geoBackupPolicyName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new GeoBackupPolicyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public GeoBackupPolicy getById(String id) {
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
        GeoBackupPolicyName geoBackupPolicyName =
            GeoBackupPolicyName.fromString(Utils.getValueFromIdByName(id, "geoBackupPolicies"));
        if (geoBackupPolicyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'geoBackupPolicies'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, workspaceName, sqlPoolName, geoBackupPolicyName, Context.NONE)
            .getValue();
    }

    public Response<GeoBackupPolicy> getByIdWithResponse(String id, Context context) {
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
        GeoBackupPolicyName geoBackupPolicyName =
            GeoBackupPolicyName.fromString(Utils.getValueFromIdByName(id, "geoBackupPolicies"));
        if (geoBackupPolicyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'geoBackupPolicies'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, sqlPoolName, geoBackupPolicyName, context);
    }

    private SqlPoolGeoBackupPoliciesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }

    public GeoBackupPolicyImpl define(GeoBackupPolicyName name) {
        return new GeoBackupPolicyImpl(name, this.manager());
    }
}
