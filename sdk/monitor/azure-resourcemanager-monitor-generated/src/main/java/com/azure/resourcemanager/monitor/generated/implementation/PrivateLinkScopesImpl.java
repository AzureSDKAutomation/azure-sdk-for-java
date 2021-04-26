// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.fluent.PrivateLinkScopesClient;
import com.azure.resourcemanager.monitor.generated.fluent.models.AzureMonitorPrivateLinkScopeInner;
import com.azure.resourcemanager.monitor.generated.models.AzureMonitorPrivateLinkScope;
import com.azure.resourcemanager.monitor.generated.models.PrivateLinkScopes;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class PrivateLinkScopesImpl implements PrivateLinkScopes {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateLinkScopesImpl.class);

    private final PrivateLinkScopesClient innerClient;

    private final com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager;

    public PrivateLinkScopesImpl(
        PrivateLinkScopesClient innerClient,
        com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AzureMonitorPrivateLinkScope> list() {
        PagedIterable<AzureMonitorPrivateLinkScopeInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new AzureMonitorPrivateLinkScopeImpl(inner1, this.manager()));
    }

    public PagedIterable<AzureMonitorPrivateLinkScope> list(Context context) {
        PagedIterable<AzureMonitorPrivateLinkScopeInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new AzureMonitorPrivateLinkScopeImpl(inner1, this.manager()));
    }

    public PagedIterable<AzureMonitorPrivateLinkScope> listByResourceGroup(String resourceGroupName) {
        PagedIterable<AzureMonitorPrivateLinkScopeInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new AzureMonitorPrivateLinkScopeImpl(inner1, this.manager()));
    }

    public PagedIterable<AzureMonitorPrivateLinkScope> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<AzureMonitorPrivateLinkScopeInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new AzureMonitorPrivateLinkScopeImpl(inner1, this.manager()));
    }

    public void deleteByResourceGroup(String resourceGroupName, String scopeName) {
        this.serviceClient().delete(resourceGroupName, scopeName);
    }

    public void delete(String resourceGroupName, String scopeName, Context context) {
        this.serviceClient().delete(resourceGroupName, scopeName, context);
    }

    public AzureMonitorPrivateLinkScope getByResourceGroup(String resourceGroupName, String scopeName) {
        AzureMonitorPrivateLinkScopeInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, scopeName);
        if (inner != null) {
            return new AzureMonitorPrivateLinkScopeImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AzureMonitorPrivateLinkScope> getByResourceGroupWithResponse(
        String resourceGroupName, String scopeName, Context context) {
        Response<AzureMonitorPrivateLinkScopeInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, scopeName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AzureMonitorPrivateLinkScopeImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AzureMonitorPrivateLinkScope getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String scopeName = Utils.getValueFromIdByName(id, "privateLinkScopes");
        if (scopeName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'privateLinkScopes'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, scopeName, Context.NONE).getValue();
    }

    public Response<AzureMonitorPrivateLinkScope> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String scopeName = Utils.getValueFromIdByName(id, "privateLinkScopes");
        if (scopeName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'privateLinkScopes'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, scopeName, context);
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
        String scopeName = Utils.getValueFromIdByName(id, "privateLinkScopes");
        if (scopeName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'privateLinkScopes'.", id)));
        }
        this.delete(resourceGroupName, scopeName, Context.NONE);
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
        String scopeName = Utils.getValueFromIdByName(id, "privateLinkScopes");
        if (scopeName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'privateLinkScopes'.", id)));
        }
        this.delete(resourceGroupName, scopeName, context);
    }

    private PrivateLinkScopesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.monitor.generated.MonitorManager manager() {
        return this.serviceManager;
    }

    public AzureMonitorPrivateLinkScopeImpl define(String name) {
        return new AzureMonitorPrivateLinkScopeImpl(name, this.manager());
    }
}
