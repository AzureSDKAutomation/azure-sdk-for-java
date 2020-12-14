// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datadog.MicrosoftDatadogManager;
import com.azure.resourcemanager.datadog.fluent.TagRulesClient;
import com.azure.resourcemanager.datadog.fluent.models.MonitoringTagRulesInner;
import com.azure.resourcemanager.datadog.models.MonitoringTagRules;
import com.azure.resourcemanager.datadog.models.TagRules;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class TagRulesImpl implements TagRules {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TagRulesImpl.class);

    private final TagRulesClient innerClient;

    private final MicrosoftDatadogManager serviceManager;

    public TagRulesImpl(TagRulesClient innerClient, MicrosoftDatadogManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<MonitoringTagRules> list(String resourceGroupName, String monitorName) {
        PagedIterable<MonitoringTagRulesInner> inner = this.serviceClient().list(resourceGroupName, monitorName);
        return inner.mapPage(inner1 -> new MonitoringTagRulesImpl(inner1, this.manager()));
    }

    public PagedIterable<MonitoringTagRules> list(String resourceGroupName, String monitorName, Context context) {
        PagedIterable<MonitoringTagRulesInner> inner =
            this.serviceClient().list(resourceGroupName, monitorName, context);
        return inner.mapPage(inner1 -> new MonitoringTagRulesImpl(inner1, this.manager()));
    }

    public MonitoringTagRules get(String resourceGroupName, String monitorName, String ruleSetName) {
        MonitoringTagRulesInner inner = this.serviceClient().get(resourceGroupName, monitorName, ruleSetName);
        if (inner != null) {
            return new MonitoringTagRulesImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<MonitoringTagRules> getWithResponse(
        String resourceGroupName, String monitorName, String ruleSetName, Context context) {
        Response<MonitoringTagRulesInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, monitorName, ruleSetName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new MonitoringTagRulesImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public MonitoringTagRules getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String monitorName = Utils.getValueFromIdByName(id, "monitors");
        if (monitorName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'monitors'.", id)));
        }
        String ruleSetName = Utils.getValueFromIdByName(id, "tagRules");
        if (ruleSetName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'tagRules'.", id)));
        }
        return this.getWithResponse(resourceGroupName, monitorName, ruleSetName, Context.NONE).getValue();
    }

    public Response<MonitoringTagRules> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String monitorName = Utils.getValueFromIdByName(id, "monitors");
        if (monitorName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'monitors'.", id)));
        }
        String ruleSetName = Utils.getValueFromIdByName(id, "tagRules");
        if (ruleSetName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'tagRules'.", id)));
        }
        return this.getWithResponse(resourceGroupName, monitorName, ruleSetName, context);
    }

    private TagRulesClient serviceClient() {
        return this.innerClient;
    }

    private MicrosoftDatadogManager manager() {
        return this.serviceManager;
    }

    public MonitoringTagRulesImpl define(String name) {
        return new MonitoringTagRulesImpl(name, this.manager());
    }
}
