// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cdn.generated.fluent.RulesClient;
import com.azure.resourcemanager.cdn.generated.fluent.models.RuleInner;
import com.azure.resourcemanager.cdn.generated.models.Rule;
import com.azure.resourcemanager.cdn.generated.models.Rules;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class RulesImpl implements Rules {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RulesImpl.class);

    private final RulesClient innerClient;

    private final com.azure.resourcemanager.cdn.generated.CdnManager serviceManager;

    public RulesImpl(RulesClient innerClient, com.azure.resourcemanager.cdn.generated.CdnManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Rule> listByRuleSet(String resourceGroupName, String profileName, String ruleSetName) {
        PagedIterable<RuleInner> inner =
            this.serviceClient().listByRuleSet(resourceGroupName, profileName, ruleSetName);
        return Utils.mapPage(inner, inner1 -> new RuleImpl(inner1, this.manager()));
    }

    public PagedIterable<Rule> listByRuleSet(
        String resourceGroupName, String profileName, String ruleSetName, Context context) {
        PagedIterable<RuleInner> inner =
            this.serviceClient().listByRuleSet(resourceGroupName, profileName, ruleSetName, context);
        return Utils.mapPage(inner, inner1 -> new RuleImpl(inner1, this.manager()));
    }

    public Rule get(String resourceGroupName, String profileName, String ruleSetName, String ruleName) {
        RuleInner inner = this.serviceClient().get(resourceGroupName, profileName, ruleSetName, ruleName);
        if (inner != null) {
            return new RuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Rule> getWithResponse(
        String resourceGroupName, String profileName, String ruleSetName, String ruleName, Context context) {
        Response<RuleInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, profileName, ruleSetName, ruleName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String profileName, String ruleSetName, String ruleName) {
        this.serviceClient().delete(resourceGroupName, profileName, ruleSetName, ruleName);
    }

    public void delete(
        String resourceGroupName, String profileName, String ruleSetName, String ruleName, Context context) {
        this.serviceClient().delete(resourceGroupName, profileName, ruleSetName, ruleName, context);
    }

    public Rule getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String profileName = Utils.getValueFromIdByName(id, "profiles");
        if (profileName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'profiles'.", id)));
        }
        String ruleSetName = Utils.getValueFromIdByName(id, "ruleSets");
        if (ruleSetName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'ruleSets'.", id)));
        }
        String ruleName = Utils.getValueFromIdByName(id, "rules");
        if (ruleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'rules'.", id)));
        }
        return this.getWithResponse(resourceGroupName, profileName, ruleSetName, ruleName, Context.NONE).getValue();
    }

    public Response<Rule> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String profileName = Utils.getValueFromIdByName(id, "profiles");
        if (profileName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'profiles'.", id)));
        }
        String ruleSetName = Utils.getValueFromIdByName(id, "ruleSets");
        if (ruleSetName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'ruleSets'.", id)));
        }
        String ruleName = Utils.getValueFromIdByName(id, "rules");
        if (ruleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'rules'.", id)));
        }
        return this.getWithResponse(resourceGroupName, profileName, ruleSetName, ruleName, context);
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
        String profileName = Utils.getValueFromIdByName(id, "profiles");
        if (profileName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'profiles'.", id)));
        }
        String ruleSetName = Utils.getValueFromIdByName(id, "ruleSets");
        if (ruleSetName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'ruleSets'.", id)));
        }
        String ruleName = Utils.getValueFromIdByName(id, "rules");
        if (ruleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'rules'.", id)));
        }
        this.delete(resourceGroupName, profileName, ruleSetName, ruleName, Context.NONE);
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
        String profileName = Utils.getValueFromIdByName(id, "profiles");
        if (profileName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'profiles'.", id)));
        }
        String ruleSetName = Utils.getValueFromIdByName(id, "ruleSets");
        if (ruleSetName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'ruleSets'.", id)));
        }
        String ruleName = Utils.getValueFromIdByName(id, "rules");
        if (ruleName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'rules'.", id)));
        }
        this.delete(resourceGroupName, profileName, ruleSetName, ruleName, context);
    }

    private RulesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.cdn.generated.CdnManager manager() {
        return this.serviceManager;
    }

    public RuleImpl define(String name) {
        return new RuleImpl(name, this.manager());
    }
}
