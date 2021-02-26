// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthbot.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.healthbot.HealthbotManager;
import com.azure.resourcemanager.healthbot.fluent.BotsClient;
import com.azure.resourcemanager.healthbot.fluent.models.HealthBotInner;
import com.azure.resourcemanager.healthbot.models.Bots;
import com.azure.resourcemanager.healthbot.models.HealthBot;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class BotsImpl implements Bots {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BotsImpl.class);

    private final BotsClient innerClient;

    private final HealthbotManager serviceManager;

    public BotsImpl(BotsClient innerClient, HealthbotManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public HealthBot getByResourceGroup(String resourceGroupName, String botName) {
        HealthBotInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, botName);
        if (inner != null) {
            return new HealthBotImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<HealthBot> getByResourceGroupWithResponse(
        String resourceGroupName, String botName, Context context) {
        Response<HealthBotInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, botName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new HealthBotImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String botName) {
        this.serviceClient().delete(resourceGroupName, botName);
    }

    public void delete(String resourceGroupName, String botName, Context context) {
        this.serviceClient().delete(resourceGroupName, botName, context);
    }

    public PagedIterable<HealthBot> listByResourceGroup(String resourceGroupName) {
        PagedIterable<HealthBotInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new HealthBotImpl(inner1, this.manager()));
    }

    public PagedIterable<HealthBot> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<HealthBotInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new HealthBotImpl(inner1, this.manager()));
    }

    public PagedIterable<HealthBot> list() {
        PagedIterable<HealthBotInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new HealthBotImpl(inner1, this.manager()));
    }

    public PagedIterable<HealthBot> list(Context context) {
        PagedIterable<HealthBotInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new HealthBotImpl(inner1, this.manager()));
    }

    public HealthBot getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String botName = Utils.getValueFromIdByName(id, "healthBots");
        if (botName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'healthBots'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, botName, Context.NONE).getValue();
    }

    public Response<HealthBot> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String botName = Utils.getValueFromIdByName(id, "healthBots");
        if (botName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'healthBots'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, botName, context);
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
        String botName = Utils.getValueFromIdByName(id, "healthBots");
        if (botName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'healthBots'.", id)));
        }
        this.delete(resourceGroupName, botName, Context.NONE);
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
        String botName = Utils.getValueFromIdByName(id, "healthBots");
        if (botName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'healthBots'.", id)));
        }
        this.delete(resourceGroupName, botName, context);
    }

    private BotsClient serviceClient() {
        return this.innerClient;
    }

    private HealthbotManager manager() {
        return this.serviceManager;
    }

    public HealthBotImpl define(String name) {
        return new HealthBotImpl(name, this.manager());
    }
}
