// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.logic.LogicManager;
import com.azure.resourcemanager.logic.fluent.IntegrationAccountSessionsClient;
import com.azure.resourcemanager.logic.fluent.models.IntegrationAccountSessionInner;
import com.azure.resourcemanager.logic.models.IntegrationAccountSession;
import com.azure.resourcemanager.logic.models.IntegrationAccountSessions;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class IntegrationAccountSessionsImpl implements IntegrationAccountSessions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IntegrationAccountSessionsImpl.class);

    private final IntegrationAccountSessionsClient innerClient;

    private final LogicManager serviceManager;

    public IntegrationAccountSessionsImpl(IntegrationAccountSessionsClient innerClient, LogicManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<IntegrationAccountSession> list(String resourceGroupName, String integrationAccountName) {
        PagedIterable<IntegrationAccountSessionInner> inner =
            this.serviceClient().list(resourceGroupName, integrationAccountName);
        return inner.mapPage(inner1 -> new IntegrationAccountSessionImpl(inner1, this.manager()));
    }

    public PagedIterable<IntegrationAccountSession> list(
        String resourceGroupName, String integrationAccountName, Integer top, String filter, Context context) {
        PagedIterable<IntegrationAccountSessionInner> inner =
            this.serviceClient().list(resourceGroupName, integrationAccountName, top, filter, context);
        return inner.mapPage(inner1 -> new IntegrationAccountSessionImpl(inner1, this.manager()));
    }

    public IntegrationAccountSession get(String resourceGroupName, String integrationAccountName, String sessionName) {
        IntegrationAccountSessionInner inner =
            this.serviceClient().get(resourceGroupName, integrationAccountName, sessionName);
        if (inner != null) {
            return new IntegrationAccountSessionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IntegrationAccountSession> getWithResponse(
        String resourceGroupName, String integrationAccountName, String sessionName, Context context) {
        Response<IntegrationAccountSessionInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, integrationAccountName, sessionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IntegrationAccountSessionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String integrationAccountName, String sessionName) {
        this.serviceClient().delete(resourceGroupName, integrationAccountName, sessionName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String integrationAccountName, String sessionName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, integrationAccountName, sessionName, context);
    }

    public IntegrationAccountSession getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String integrationAccountName = Utils.getValueFromIdByName(id, "integrationAccounts");
        if (integrationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'integrationAccounts'.", id)));
        }
        String sessionName = Utils.getValueFromIdByName(id, "sessions");
        if (sessionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'sessions'.", id)));
        }
        return this.getWithResponse(resourceGroupName, integrationAccountName, sessionName, Context.NONE).getValue();
    }

    public Response<IntegrationAccountSession> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String integrationAccountName = Utils.getValueFromIdByName(id, "integrationAccounts");
        if (integrationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'integrationAccounts'.", id)));
        }
        String sessionName = Utils.getValueFromIdByName(id, "sessions");
        if (sessionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'sessions'.", id)));
        }
        return this.getWithResponse(resourceGroupName, integrationAccountName, sessionName, context);
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
        String integrationAccountName = Utils.getValueFromIdByName(id, "integrationAccounts");
        if (integrationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'integrationAccounts'.", id)));
        }
        String sessionName = Utils.getValueFromIdByName(id, "sessions");
        if (sessionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'sessions'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, integrationAccountName, sessionName, Context.NONE).getValue();
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
        String integrationAccountName = Utils.getValueFromIdByName(id, "integrationAccounts");
        if (integrationAccountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'integrationAccounts'.", id)));
        }
        String sessionName = Utils.getValueFromIdByName(id, "sessions");
        if (sessionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'sessions'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, integrationAccountName, sessionName, context);
    }

    private IntegrationAccountSessionsClient serviceClient() {
        return this.innerClient;
    }

    private LogicManager manager() {
        return this.serviceManager;
    }

    public IntegrationAccountSessionImpl define(String name) {
        return new IntegrationAccountSessionImpl(name, this.manager());
    }
}
