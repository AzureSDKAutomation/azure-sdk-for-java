// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.SnapshotsClient;
import com.azure.resourcemanager.compute.generated.fluent.models.AccessUriInner;
import com.azure.resourcemanager.compute.generated.fluent.models.SnapshotInner;
import com.azure.resourcemanager.compute.generated.models.AccessUri;
import com.azure.resourcemanager.compute.generated.models.GrantAccessData;
import com.azure.resourcemanager.compute.generated.models.Snapshot;
import com.azure.resourcemanager.compute.generated.models.Snapshots;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class SnapshotsImpl implements Snapshots {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SnapshotsImpl.class);

    private final SnapshotsClient innerClient;

    private final ComputeManager serviceManager;

    public SnapshotsImpl(SnapshotsClient innerClient, ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Snapshot getByResourceGroup(String resourceGroupName, String snapshotName) {
        SnapshotInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, snapshotName);
        if (inner != null) {
            return new SnapshotImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Snapshot> getByResourceGroupWithResponse(
        String resourceGroupName, String snapshotName, Context context) {
        Response<SnapshotInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, snapshotName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SnapshotImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String snapshotName) {
        this.serviceClient().delete(resourceGroupName, snapshotName);
    }

    public void delete(String resourceGroupName, String snapshotName, Context context) {
        this.serviceClient().delete(resourceGroupName, snapshotName, context);
    }

    public PagedIterable<Snapshot> listByResourceGroup(String resourceGroupName) {
        PagedIterable<SnapshotInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new SnapshotImpl(inner1, this.manager()));
    }

    public PagedIterable<Snapshot> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<SnapshotInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new SnapshotImpl(inner1, this.manager()));
    }

    public PagedIterable<Snapshot> list() {
        PagedIterable<SnapshotInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new SnapshotImpl(inner1, this.manager()));
    }

    public PagedIterable<Snapshot> list(Context context) {
        PagedIterable<SnapshotInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new SnapshotImpl(inner1, this.manager()));
    }

    public AccessUri grantAccess(String resourceGroupName, String snapshotName, GrantAccessData grantAccessData) {
        AccessUriInner inner = this.serviceClient().grantAccess(resourceGroupName, snapshotName, grantAccessData);
        if (inner != null) {
            return new AccessUriImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public AccessUri grantAccess(
        String resourceGroupName, String snapshotName, GrantAccessData grantAccessData, Context context) {
        AccessUriInner inner =
            this.serviceClient().grantAccess(resourceGroupName, snapshotName, grantAccessData, context);
        if (inner != null) {
            return new AccessUriImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void revokeAccess(String resourceGroupName, String snapshotName) {
        this.serviceClient().revokeAccess(resourceGroupName, snapshotName);
    }

    public void revokeAccess(String resourceGroupName, String snapshotName, Context context) {
        this.serviceClient().revokeAccess(resourceGroupName, snapshotName, context);
    }

    public Snapshot getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String snapshotName = Utils.getValueFromIdByName(id, "snapshots");
        if (snapshotName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'snapshots'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, snapshotName, Context.NONE).getValue();
    }

    public Response<Snapshot> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String snapshotName = Utils.getValueFromIdByName(id, "snapshots");
        if (snapshotName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'snapshots'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, snapshotName, context);
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
        String snapshotName = Utils.getValueFromIdByName(id, "snapshots");
        if (snapshotName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'snapshots'.", id)));
        }
        this.delete(resourceGroupName, snapshotName, Context.NONE);
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
        String snapshotName = Utils.getValueFromIdByName(id, "snapshots");
        if (snapshotName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'snapshots'.", id)));
        }
        this.delete(resourceGroupName, snapshotName, context);
    }

    private SnapshotsClient serviceClient() {
        return this.innerClient;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }

    public SnapshotImpl define(String name) {
        return new SnapshotImpl(name, this.manager());
    }
}
