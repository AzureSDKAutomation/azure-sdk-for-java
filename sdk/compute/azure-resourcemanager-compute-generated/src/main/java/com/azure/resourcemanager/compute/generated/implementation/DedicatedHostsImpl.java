// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.DedicatedHostsClient;
import com.azure.resourcemanager.compute.generated.fluent.models.DedicatedHostInner;
import com.azure.resourcemanager.compute.generated.models.DedicatedHost;
import com.azure.resourcemanager.compute.generated.models.DedicatedHosts;
import com.azure.resourcemanager.compute.generated.models.InstanceViewTypes;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DedicatedHostsImpl implements DedicatedHosts {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DedicatedHostsImpl.class);

    private final DedicatedHostsClient innerClient;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    public DedicatedHostsImpl(
        DedicatedHostsClient innerClient, com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String hostGroupName, String hostname) {
        this.serviceClient().delete(resourceGroupName, hostGroupName, hostname);
    }

    public void delete(String resourceGroupName, String hostGroupName, String hostname, Context context) {
        this.serviceClient().delete(resourceGroupName, hostGroupName, hostname, context);
    }

    public DedicatedHost get(String resourceGroupName, String hostGroupName, String hostname) {
        DedicatedHostInner inner = this.serviceClient().get(resourceGroupName, hostGroupName, hostname);
        if (inner != null) {
            return new DedicatedHostImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DedicatedHost> getWithResponse(
        String resourceGroupName, String hostGroupName, String hostname, InstanceViewTypes expand, Context context) {
        Response<DedicatedHostInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, hostGroupName, hostname, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DedicatedHostImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<DedicatedHost> listByHostGroup(String resourceGroupName, String hostGroupName) {
        PagedIterable<DedicatedHostInner> inner =
            this.serviceClient().listByHostGroup(resourceGroupName, hostGroupName);
        return Utils.mapPage(inner, inner1 -> new DedicatedHostImpl(inner1, this.manager()));
    }

    public PagedIterable<DedicatedHost> listByHostGroup(
        String resourceGroupName, String hostGroupName, Context context) {
        PagedIterable<DedicatedHostInner> inner =
            this.serviceClient().listByHostGroup(resourceGroupName, hostGroupName, context);
        return Utils.mapPage(inner, inner1 -> new DedicatedHostImpl(inner1, this.manager()));
    }

    public DedicatedHost getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String hostGroupName = Utils.getValueFromIdByName(id, "hostGroups");
        if (hostGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'hostGroups'.", id)));
        }
        String hostname = Utils.getValueFromIdByName(id, "hosts");
        if (hostname == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'hosts'.", id)));
        }
        InstanceViewTypes localExpand = null;
        return this.getWithResponse(resourceGroupName, hostGroupName, hostname, localExpand, Context.NONE).getValue();
    }

    public Response<DedicatedHost> getByIdWithResponse(String id, InstanceViewTypes expand, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String hostGroupName = Utils.getValueFromIdByName(id, "hostGroups");
        if (hostGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'hostGroups'.", id)));
        }
        String hostname = Utils.getValueFromIdByName(id, "hosts");
        if (hostname == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'hosts'.", id)));
        }
        return this.getWithResponse(resourceGroupName, hostGroupName, hostname, expand, context);
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
        String hostGroupName = Utils.getValueFromIdByName(id, "hostGroups");
        if (hostGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'hostGroups'.", id)));
        }
        String hostname = Utils.getValueFromIdByName(id, "hosts");
        if (hostname == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'hosts'.", id)));
        }
        this.delete(resourceGroupName, hostGroupName, hostname, Context.NONE);
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
        String hostGroupName = Utils.getValueFromIdByName(id, "hostGroups");
        if (hostGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'hostGroups'.", id)));
        }
        String hostname = Utils.getValueFromIdByName(id, "hosts");
        if (hostname == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'hosts'.", id)));
        }
        this.delete(resourceGroupName, hostGroupName, hostname, context);
    }

    private DedicatedHostsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }

    public DedicatedHostImpl define(String name) {
        return new DedicatedHostImpl(name, this.manager());
    }
}
