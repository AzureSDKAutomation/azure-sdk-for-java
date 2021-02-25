// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysql.MySqlManager;
import com.azure.resourcemanager.mysql.fluent.VirtualNetworkRulesClient;
import com.azure.resourcemanager.mysql.fluent.models.VirtualNetworkRuleInner;
import com.azure.resourcemanager.mysql.models.VirtualNetworkRule;
import com.azure.resourcemanager.mysql.models.VirtualNetworkRules;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class VirtualNetworkRulesImpl implements VirtualNetworkRules {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualNetworkRulesImpl.class);

    private final VirtualNetworkRulesClient innerClient;

    private final MySqlManager serviceManager;

    public VirtualNetworkRulesImpl(VirtualNetworkRulesClient innerClient, MySqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public VirtualNetworkRule get(String resourceGroupName, String serverName, String virtualNetworkRuleName) {
        VirtualNetworkRuleInner inner = this.serviceClient().get(resourceGroupName, serverName, virtualNetworkRuleName);
        if (inner != null) {
            return new VirtualNetworkRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualNetworkRule> getWithResponse(
        String resourceGroupName, String serverName, String virtualNetworkRuleName, Context context) {
        Response<VirtualNetworkRuleInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serverName, virtualNetworkRuleName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualNetworkRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String serverName, String virtualNetworkRuleName) {
        this.serviceClient().delete(resourceGroupName, serverName, virtualNetworkRuleName);
    }

    public void delete(String resourceGroupName, String serverName, String virtualNetworkRuleName, Context context) {
        this.serviceClient().delete(resourceGroupName, serverName, virtualNetworkRuleName, context);
    }

    public PagedIterable<VirtualNetworkRule> listByServer(String resourceGroupName, String serverName) {
        PagedIterable<VirtualNetworkRuleInner> inner = this.serviceClient().listByServer(resourceGroupName, serverName);
        return Utils.mapPage(inner, inner1 -> new VirtualNetworkRuleImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualNetworkRule> listByServer(
        String resourceGroupName, String serverName, Context context) {
        PagedIterable<VirtualNetworkRuleInner> inner =
            this.serviceClient().listByServer(resourceGroupName, serverName, context);
        return Utils.mapPage(inner, inner1 -> new VirtualNetworkRuleImpl(inner1, this.manager()));
    }

    public VirtualNetworkRule getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        String virtualNetworkRuleName = Utils.getValueFromIdByName(id, "virtualNetworkRules");
        if (virtualNetworkRuleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'virtualNetworkRules'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, virtualNetworkRuleName, Context.NONE).getValue();
    }

    public Response<VirtualNetworkRule> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        String virtualNetworkRuleName = Utils.getValueFromIdByName(id, "virtualNetworkRules");
        if (virtualNetworkRuleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'virtualNetworkRules'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, virtualNetworkRuleName, context);
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
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        String virtualNetworkRuleName = Utils.getValueFromIdByName(id, "virtualNetworkRules");
        if (virtualNetworkRuleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'virtualNetworkRules'.", id)));
        }
        this.delete(resourceGroupName, serverName, virtualNetworkRuleName, Context.NONE);
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
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        String virtualNetworkRuleName = Utils.getValueFromIdByName(id, "virtualNetworkRules");
        if (virtualNetworkRuleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'virtualNetworkRules'.", id)));
        }
        this.delete(resourceGroupName, serverName, virtualNetworkRuleName, context);
    }

    private VirtualNetworkRulesClient serviceClient() {
        return this.innerClient;
    }

    private MySqlManager manager() {
        return this.serviceManager;
    }

    public VirtualNetworkRuleImpl define(String name) {
        return new VirtualNetworkRuleImpl(name, this.manager());
    }
}
