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
import com.azure.resourcemanager.sql.generated.fluent.SyncAgentsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.SyncAgentInner;
import com.azure.resourcemanager.sql.generated.fluent.models.SyncAgentKeyPropertiesInner;
import com.azure.resourcemanager.sql.generated.fluent.models.SyncAgentLinkedDatabaseInner;
import com.azure.resourcemanager.sql.generated.models.SyncAgent;
import com.azure.resourcemanager.sql.generated.models.SyncAgentKeyProperties;
import com.azure.resourcemanager.sql.generated.models.SyncAgentLinkedDatabase;
import com.azure.resourcemanager.sql.generated.models.SyncAgents;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class SyncAgentsImpl implements SyncAgents {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SyncAgentsImpl.class);

    private final SyncAgentsClient innerClient;

    private final SqlManager serviceManager;

    public SyncAgentsImpl(SyncAgentsClient innerClient, SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public SyncAgent get(String resourceGroupName, String serverName, String syncAgentName) {
        SyncAgentInner inner = this.serviceClient().get(resourceGroupName, serverName, syncAgentName);
        if (inner != null) {
            return new SyncAgentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SyncAgent> getWithResponse(
        String resourceGroupName, String serverName, String syncAgentName, Context context) {
        Response<SyncAgentInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serverName, syncAgentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SyncAgentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String serverName, String syncAgentName) {
        this.serviceClient().delete(resourceGroupName, serverName, syncAgentName);
    }

    public void delete(String resourceGroupName, String serverName, String syncAgentName, Context context) {
        this.serviceClient().delete(resourceGroupName, serverName, syncAgentName, context);
    }

    public PagedIterable<SyncAgent> listByServer(String resourceGroupName, String serverName) {
        PagedIterable<SyncAgentInner> inner = this.serviceClient().listByServer(resourceGroupName, serverName);
        return Utils.mapPage(inner, inner1 -> new SyncAgentImpl(inner1, this.manager()));
    }

    public PagedIterable<SyncAgent> listByServer(String resourceGroupName, String serverName, Context context) {
        PagedIterable<SyncAgentInner> inner = this.serviceClient().listByServer(resourceGroupName, serverName, context);
        return Utils.mapPage(inner, inner1 -> new SyncAgentImpl(inner1, this.manager()));
    }

    public SyncAgentKeyProperties generateKey(String resourceGroupName, String serverName, String syncAgentName) {
        SyncAgentKeyPropertiesInner inner =
            this.serviceClient().generateKey(resourceGroupName, serverName, syncAgentName);
        if (inner != null) {
            return new SyncAgentKeyPropertiesImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SyncAgentKeyProperties> generateKeyWithResponse(
        String resourceGroupName, String serverName, String syncAgentName, Context context) {
        Response<SyncAgentKeyPropertiesInner> inner =
            this.serviceClient().generateKeyWithResponse(resourceGroupName, serverName, syncAgentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SyncAgentKeyPropertiesImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<SyncAgentLinkedDatabase> listLinkedDatabases(
        String resourceGroupName, String serverName, String syncAgentName) {
        PagedIterable<SyncAgentLinkedDatabaseInner> inner =
            this.serviceClient().listLinkedDatabases(resourceGroupName, serverName, syncAgentName);
        return Utils.mapPage(inner, inner1 -> new SyncAgentLinkedDatabaseImpl(inner1, this.manager()));
    }

    public PagedIterable<SyncAgentLinkedDatabase> listLinkedDatabases(
        String resourceGroupName, String serverName, String syncAgentName, Context context) {
        PagedIterable<SyncAgentLinkedDatabaseInner> inner =
            this.serviceClient().listLinkedDatabases(resourceGroupName, serverName, syncAgentName, context);
        return Utils.mapPage(inner, inner1 -> new SyncAgentLinkedDatabaseImpl(inner1, this.manager()));
    }

    public SyncAgent getById(String id) {
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
        String syncAgentName = Utils.getValueFromIdByName(id, "syncAgents");
        if (syncAgentName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'syncAgents'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, syncAgentName, Context.NONE).getValue();
    }

    public Response<SyncAgent> getByIdWithResponse(String id, Context context) {
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
        String syncAgentName = Utils.getValueFromIdByName(id, "syncAgents");
        if (syncAgentName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'syncAgents'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, syncAgentName, context);
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
        String syncAgentName = Utils.getValueFromIdByName(id, "syncAgents");
        if (syncAgentName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'syncAgents'.", id)));
        }
        this.delete(resourceGroupName, serverName, syncAgentName, Context.NONE);
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
        String syncAgentName = Utils.getValueFromIdByName(id, "syncAgents");
        if (syncAgentName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'syncAgents'.", id)));
        }
        this.delete(resourceGroupName, serverName, syncAgentName, context);
    }

    private SyncAgentsClient serviceClient() {
        return this.innerClient;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }

    public SyncAgentImpl define(String name) {
        return new SyncAgentImpl(name, this.manager());
    }
}
