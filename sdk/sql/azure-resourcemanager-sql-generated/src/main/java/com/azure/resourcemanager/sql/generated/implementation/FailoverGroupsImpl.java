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
import com.azure.resourcemanager.sql.generated.fluent.FailoverGroupsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.FailoverGroupInner;
import com.azure.resourcemanager.sql.generated.models.FailoverGroup;
import com.azure.resourcemanager.sql.generated.models.FailoverGroups;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class FailoverGroupsImpl implements FailoverGroups {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FailoverGroupsImpl.class);

    private final FailoverGroupsClient innerClient;

    private final SqlManager serviceManager;

    public FailoverGroupsImpl(FailoverGroupsClient innerClient, SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public FailoverGroup get(String resourceGroupName, String serverName, String failoverGroupName) {
        FailoverGroupInner inner = this.serviceClient().get(resourceGroupName, serverName, failoverGroupName);
        if (inner != null) {
            return new FailoverGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<FailoverGroup> getWithResponse(
        String resourceGroupName, String serverName, String failoverGroupName, Context context) {
        Response<FailoverGroupInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serverName, failoverGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new FailoverGroupImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String serverName, String failoverGroupName) {
        this.serviceClient().delete(resourceGroupName, serverName, failoverGroupName);
    }

    public void delete(String resourceGroupName, String serverName, String failoverGroupName, Context context) {
        this.serviceClient().delete(resourceGroupName, serverName, failoverGroupName, context);
    }

    public PagedIterable<FailoverGroup> listByServer(String resourceGroupName, String serverName) {
        PagedIterable<FailoverGroupInner> inner = this.serviceClient().listByServer(resourceGroupName, serverName);
        return inner.mapPage(inner1 -> new FailoverGroupImpl(inner1, this.manager()));
    }

    public PagedIterable<FailoverGroup> listByServer(String resourceGroupName, String serverName, Context context) {
        PagedIterable<FailoverGroupInner> inner =
            this.serviceClient().listByServer(resourceGroupName, serverName, context);
        return inner.mapPage(inner1 -> new FailoverGroupImpl(inner1, this.manager()));
    }

    public FailoverGroup failover(String resourceGroupName, String serverName, String failoverGroupName) {
        FailoverGroupInner inner = this.serviceClient().failover(resourceGroupName, serverName, failoverGroupName);
        if (inner != null) {
            return new FailoverGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public FailoverGroup failover(
        String resourceGroupName, String serverName, String failoverGroupName, Context context) {
        FailoverGroupInner inner =
            this.serviceClient().failover(resourceGroupName, serverName, failoverGroupName, context);
        if (inner != null) {
            return new FailoverGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public FailoverGroup forceFailoverAllowDataLoss(
        String resourceGroupName, String serverName, String failoverGroupName) {
        FailoverGroupInner inner =
            this.serviceClient().forceFailoverAllowDataLoss(resourceGroupName, serverName, failoverGroupName);
        if (inner != null) {
            return new FailoverGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public FailoverGroup forceFailoverAllowDataLoss(
        String resourceGroupName, String serverName, String failoverGroupName, Context context) {
        FailoverGroupInner inner =
            this.serviceClient().forceFailoverAllowDataLoss(resourceGroupName, serverName, failoverGroupName, context);
        if (inner != null) {
            return new FailoverGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public FailoverGroup getById(String id) {
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
        String failoverGroupName = Utils.getValueFromIdByName(id, "failoverGroups");
        if (failoverGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'failoverGroups'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, failoverGroupName, Context.NONE).getValue();
    }

    public Response<FailoverGroup> getByIdWithResponse(String id, Context context) {
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
        String failoverGroupName = Utils.getValueFromIdByName(id, "failoverGroups");
        if (failoverGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'failoverGroups'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, failoverGroupName, context);
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
        String failoverGroupName = Utils.getValueFromIdByName(id, "failoverGroups");
        if (failoverGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'failoverGroups'.", id)));
        }
        this.delete(resourceGroupName, serverName, failoverGroupName, Context.NONE);
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
        String failoverGroupName = Utils.getValueFromIdByName(id, "failoverGroups");
        if (failoverGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'failoverGroups'.", id)));
        }
        this.delete(resourceGroupName, serverName, failoverGroupName, context);
    }

    private FailoverGroupsClient serviceClient() {
        return this.innerClient;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }

    public FailoverGroupImpl define(String name) {
        return new FailoverGroupImpl(name, this.manager());
    }
}
