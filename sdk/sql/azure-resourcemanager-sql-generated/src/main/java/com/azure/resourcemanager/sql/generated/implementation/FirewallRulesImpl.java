// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.FirewallRulesClient;
import com.azure.resourcemanager.sql.generated.fluent.models.FirewallRuleInner;
import com.azure.resourcemanager.sql.generated.models.FirewallRule;
import com.azure.resourcemanager.sql.generated.models.FirewallRules;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class FirewallRulesImpl implements FirewallRules {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FirewallRulesImpl.class);

    private final FirewallRulesClient innerClient;

    private final SqlManager serviceManager;

    public FirewallRulesImpl(FirewallRulesClient innerClient, SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String serverName, String firewallRuleName) {
        this.serviceClient().delete(resourceGroupName, serverName, firewallRuleName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String serverName, String firewallRuleName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, serverName, firewallRuleName, context);
    }

    public FirewallRule get(String resourceGroupName, String serverName, String firewallRuleName) {
        FirewallRuleInner inner = this.serviceClient().get(resourceGroupName, serverName, firewallRuleName);
        if (inner != null) {
            return new FirewallRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<FirewallRule> getWithResponse(
        String resourceGroupName, String serverName, String firewallRuleName, Context context) {
        Response<FirewallRuleInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serverName, firewallRuleName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new FirewallRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<FirewallRule> listByServer(String resourceGroupName, String serverName) {
        PagedIterable<FirewallRuleInner> inner = this.serviceClient().listByServer(resourceGroupName, serverName);
        return Utils.mapPage(inner, inner1 -> new FirewallRuleImpl(inner1, this.manager()));
    }

    public PagedIterable<FirewallRule> listByServer(String resourceGroupName, String serverName, Context context) {
        PagedIterable<FirewallRuleInner> inner =
            this.serviceClient().listByServer(resourceGroupName, serverName, context);
        return Utils.mapPage(inner, inner1 -> new FirewallRuleImpl(inner1, this.manager()));
    }

    public FirewallRule getById(String id) {
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
        String firewallRuleName = Utils.getValueFromIdByName(id, "firewallRules");
        if (firewallRuleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'firewallRules'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, firewallRuleName, Context.NONE).getValue();
    }

    public Response<FirewallRule> getByIdWithResponse(String id, Context context) {
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
        String firewallRuleName = Utils.getValueFromIdByName(id, "firewallRules");
        if (firewallRuleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'firewallRules'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, firewallRuleName, context);
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
        String firewallRuleName = Utils.getValueFromIdByName(id, "firewallRules");
        if (firewallRuleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'firewallRules'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, serverName, firewallRuleName, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
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
        String firewallRuleName = Utils.getValueFromIdByName(id, "firewallRules");
        if (firewallRuleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'firewallRules'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, serverName, firewallRuleName, context);
    }

    private FirewallRulesClient serviceClient() {
        return this.innerClient;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }

    public FirewallRuleImpl define(String name) {
        return new FirewallRuleImpl(name, this.manager());
    }
}
