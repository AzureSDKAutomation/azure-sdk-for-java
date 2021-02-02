// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.ReplicationProtectedItemsClient;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.ReplicationProtectedItemInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.AddDisksInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ApplyRecoveryPointInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.DisableProtectionInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.PlannedFailoverInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RemoveDisksInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationProtectedItem;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationProtectedItems;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ResolveHealthInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReverseReplicationInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.TestFailoverCleanupInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.TestFailoverInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.UnplannedFailoverInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.UpdateMobilityServiceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ReplicationProtectedItemsImpl implements ReplicationProtectedItems {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ReplicationProtectedItemsImpl.class);

    private final ReplicationProtectedItemsClient innerClient;

    private final SiteRecoveryManager serviceManager;

    public ReplicationProtectedItemsImpl(
        ReplicationProtectedItemsClient innerClient, SiteRecoveryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ReplicationProtectedItem> listByReplicationProtectionContainers(
        String resourceName, String resourceGroupName, String fabricName, String protectionContainerName) {
        PagedIterable<ReplicationProtectedItemInner> inner =
            this
                .serviceClient()
                .listByReplicationProtectionContainers(
                    resourceName, resourceGroupName, fabricName, protectionContainerName);
        return inner.mapPage(inner1 -> new ReplicationProtectedItemImpl(inner1, this.manager()));
    }

    public PagedIterable<ReplicationProtectedItem> listByReplicationProtectionContainers(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        Context context) {
        PagedIterable<ReplicationProtectedItemInner> inner =
            this
                .serviceClient()
                .listByReplicationProtectionContainers(
                    resourceName, resourceGroupName, fabricName, protectionContainerName, context);
        return inner.mapPage(inner1 -> new ReplicationProtectedItemImpl(inner1, this.manager()));
    }

    public ReplicationProtectedItem get(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName) {
        ReplicationProtectedItemInner inner =
            this
                .serviceClient()
                .get(resourceName, resourceGroupName, fabricName, protectionContainerName, replicatedProtectedItemName);
        if (inner != null) {
            return new ReplicationProtectedItemImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ReplicationProtectedItem> getWithResponse(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName,
        Context context) {
        Response<ReplicationProtectedItemInner> inner =
            this
                .serviceClient()
                .getWithResponse(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    replicatedProtectedItemName,
                    context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ReplicationProtectedItemImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void purge(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName) {
        this
            .serviceClient()
            .purge(resourceName, resourceGroupName, fabricName, protectionContainerName, replicatedProtectedItemName);
    }

    public void purge(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName,
        Context context) {
        this
            .serviceClient()
            .purge(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                replicatedProtectedItemName,
                context);
    }

    public ReplicationProtectedItem addDisks(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName,
        AddDisksInput addDisksInput) {
        ReplicationProtectedItemInner inner =
            this
                .serviceClient()
                .addDisks(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    replicatedProtectedItemName,
                    addDisksInput);
        if (inner != null) {
            return new ReplicationProtectedItemImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ReplicationProtectedItem addDisks(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName,
        AddDisksInput addDisksInput,
        Context context) {
        ReplicationProtectedItemInner inner =
            this
                .serviceClient()
                .addDisks(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    replicatedProtectedItemName,
                    addDisksInput,
                    context);
        if (inner != null) {
            return new ReplicationProtectedItemImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ReplicationProtectedItem applyRecoveryPoint(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName,
        ApplyRecoveryPointInput applyRecoveryPointInput) {
        ReplicationProtectedItemInner inner =
            this
                .serviceClient()
                .applyRecoveryPoint(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    replicatedProtectedItemName,
                    applyRecoveryPointInput);
        if (inner != null) {
            return new ReplicationProtectedItemImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ReplicationProtectedItem applyRecoveryPoint(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName,
        ApplyRecoveryPointInput applyRecoveryPointInput,
        Context context) {
        ReplicationProtectedItemInner inner =
            this
                .serviceClient()
                .applyRecoveryPoint(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    replicatedProtectedItemName,
                    applyRecoveryPointInput,
                    context);
        if (inner != null) {
            return new ReplicationProtectedItemImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ReplicationProtectedItem failoverCommit(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName) {
        ReplicationProtectedItemInner inner =
            this
                .serviceClient()
                .failoverCommit(
                    resourceName, resourceGroupName, fabricName, protectionContainerName, replicatedProtectedItemName);
        if (inner != null) {
            return new ReplicationProtectedItemImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ReplicationProtectedItem failoverCommit(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName,
        Context context) {
        ReplicationProtectedItemInner inner =
            this
                .serviceClient()
                .failoverCommit(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    replicatedProtectedItemName,
                    context);
        if (inner != null) {
            return new ReplicationProtectedItemImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ReplicationProtectedItem plannedFailover(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName,
        PlannedFailoverInput failoverInput) {
        ReplicationProtectedItemInner inner =
            this
                .serviceClient()
                .plannedFailover(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    replicatedProtectedItemName,
                    failoverInput);
        if (inner != null) {
            return new ReplicationProtectedItemImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ReplicationProtectedItem plannedFailover(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName,
        PlannedFailoverInput failoverInput,
        Context context) {
        ReplicationProtectedItemInner inner =
            this
                .serviceClient()
                .plannedFailover(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    replicatedProtectedItemName,
                    failoverInput,
                    context);
        if (inner != null) {
            return new ReplicationProtectedItemImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName,
        DisableProtectionInput disableProtectionInput) {
        this
            .serviceClient()
            .delete(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                replicatedProtectedItemName,
                disableProtectionInput);
    }

    public void delete(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName,
        DisableProtectionInput disableProtectionInput,
        Context context) {
        this
            .serviceClient()
            .delete(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                replicatedProtectedItemName,
                disableProtectionInput,
                context);
    }

    public ReplicationProtectedItem removeDisks(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName,
        RemoveDisksInput removeDisksInput) {
        ReplicationProtectedItemInner inner =
            this
                .serviceClient()
                .removeDisks(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    replicatedProtectedItemName,
                    removeDisksInput);
        if (inner != null) {
            return new ReplicationProtectedItemImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ReplicationProtectedItem removeDisks(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName,
        RemoveDisksInput removeDisksInput,
        Context context) {
        ReplicationProtectedItemInner inner =
            this
                .serviceClient()
                .removeDisks(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    replicatedProtectedItemName,
                    removeDisksInput,
                    context);
        if (inner != null) {
            return new ReplicationProtectedItemImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ReplicationProtectedItem repairReplication(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName) {
        ReplicationProtectedItemInner inner =
            this
                .serviceClient()
                .repairReplication(
                    resourceName, resourceGroupName, fabricName, protectionContainerName, replicatedProtectedItemName);
        if (inner != null) {
            return new ReplicationProtectedItemImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ReplicationProtectedItem repairReplication(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName,
        Context context) {
        ReplicationProtectedItemInner inner =
            this
                .serviceClient()
                .repairReplication(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    replicatedProtectedItemName,
                    context);
        if (inner != null) {
            return new ReplicationProtectedItemImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ReplicationProtectedItem reprotect(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName,
        ReverseReplicationInput rrInput) {
        ReplicationProtectedItemInner inner =
            this
                .serviceClient()
                .reprotect(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    replicatedProtectedItemName,
                    rrInput);
        if (inner != null) {
            return new ReplicationProtectedItemImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ReplicationProtectedItem reprotect(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName,
        ReverseReplicationInput rrInput,
        Context context) {
        ReplicationProtectedItemInner inner =
            this
                .serviceClient()
                .reprotect(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    replicatedProtectedItemName,
                    rrInput,
                    context);
        if (inner != null) {
            return new ReplicationProtectedItemImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ReplicationProtectedItem resolveHealthErrors(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName,
        ResolveHealthInput resolveHealthInput) {
        ReplicationProtectedItemInner inner =
            this
                .serviceClient()
                .resolveHealthErrors(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    replicatedProtectedItemName,
                    resolveHealthInput);
        if (inner != null) {
            return new ReplicationProtectedItemImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ReplicationProtectedItem resolveHealthErrors(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName,
        ResolveHealthInput resolveHealthInput,
        Context context) {
        ReplicationProtectedItemInner inner =
            this
                .serviceClient()
                .resolveHealthErrors(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    replicatedProtectedItemName,
                    resolveHealthInput,
                    context);
        if (inner != null) {
            return new ReplicationProtectedItemImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ReplicationProtectedItem testFailover(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName,
        TestFailoverInput failoverInput) {
        ReplicationProtectedItemInner inner =
            this
                .serviceClient()
                .testFailover(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    replicatedProtectedItemName,
                    failoverInput);
        if (inner != null) {
            return new ReplicationProtectedItemImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ReplicationProtectedItem testFailover(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName,
        TestFailoverInput failoverInput,
        Context context) {
        ReplicationProtectedItemInner inner =
            this
                .serviceClient()
                .testFailover(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    replicatedProtectedItemName,
                    failoverInput,
                    context);
        if (inner != null) {
            return new ReplicationProtectedItemImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ReplicationProtectedItem testFailoverCleanup(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName,
        TestFailoverCleanupInput cleanupInput) {
        ReplicationProtectedItemInner inner =
            this
                .serviceClient()
                .testFailoverCleanup(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    replicatedProtectedItemName,
                    cleanupInput);
        if (inner != null) {
            return new ReplicationProtectedItemImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ReplicationProtectedItem testFailoverCleanup(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName,
        TestFailoverCleanupInput cleanupInput,
        Context context) {
        ReplicationProtectedItemInner inner =
            this
                .serviceClient()
                .testFailoverCleanup(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    replicatedProtectedItemName,
                    cleanupInput,
                    context);
        if (inner != null) {
            return new ReplicationProtectedItemImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ReplicationProtectedItem unplannedFailover(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName,
        UnplannedFailoverInput failoverInput) {
        ReplicationProtectedItemInner inner =
            this
                .serviceClient()
                .unplannedFailover(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    replicatedProtectedItemName,
                    failoverInput);
        if (inner != null) {
            return new ReplicationProtectedItemImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ReplicationProtectedItem unplannedFailover(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName,
        UnplannedFailoverInput failoverInput,
        Context context) {
        ReplicationProtectedItemInner inner =
            this
                .serviceClient()
                .unplannedFailover(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    replicatedProtectedItemName,
                    failoverInput,
                    context);
        if (inner != null) {
            return new ReplicationProtectedItemImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ReplicationProtectedItem updateMobilityService(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicationProtectedItemName,
        UpdateMobilityServiceRequest updateMobilityServiceRequest) {
        ReplicationProtectedItemInner inner =
            this
                .serviceClient()
                .updateMobilityService(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    replicationProtectedItemName,
                    updateMobilityServiceRequest);
        if (inner != null) {
            return new ReplicationProtectedItemImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ReplicationProtectedItem updateMobilityService(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicationProtectedItemName,
        UpdateMobilityServiceRequest updateMobilityServiceRequest,
        Context context) {
        ReplicationProtectedItemInner inner =
            this
                .serviceClient()
                .updateMobilityService(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    replicationProtectedItemName,
                    updateMobilityServiceRequest,
                    context);
        if (inner != null) {
            return new ReplicationProtectedItemImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<ReplicationProtectedItem> list(String resourceName, String resourceGroupName) {
        PagedIterable<ReplicationProtectedItemInner> inner = this.serviceClient().list(resourceName, resourceGroupName);
        return inner.mapPage(inner1 -> new ReplicationProtectedItemImpl(inner1, this.manager()));
    }

    public PagedIterable<ReplicationProtectedItem> list(
        String resourceName, String resourceGroupName, String skipToken, String filter, Context context) {
        PagedIterable<ReplicationProtectedItemInner> inner =
            this.serviceClient().list(resourceName, resourceGroupName, skipToken, filter, context);
        return inner.mapPage(inner1 -> new ReplicationProtectedItemImpl(inner1, this.manager()));
    }

    public ReplicationProtectedItem getById(String id) {
        String resourceName = Utils.getValueFromIdByName(id, "vaults");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'vaults'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String fabricName = Utils.getValueFromIdByName(id, "replicationFabrics");
        if (fabricName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'replicationFabrics'.", id)));
        }
        String protectionContainerName = Utils.getValueFromIdByName(id, "replicationProtectionContainers");
        if (protectionContainerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment"
                                    + " 'replicationProtectionContainers'.",
                                id)));
        }
        String replicatedProtectedItemName = Utils.getValueFromIdByName(id, "replicationProtectedItems");
        if (replicatedProtectedItemName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'replicationProtectedItems'.",
                                id)));
        }
        return this
            .getWithResponse(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                replicatedProtectedItemName,
                Context.NONE)
            .getValue();
    }

    public Response<ReplicationProtectedItem> getByIdWithResponse(String id, Context context) {
        String resourceName = Utils.getValueFromIdByName(id, "vaults");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'vaults'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String fabricName = Utils.getValueFromIdByName(id, "replicationFabrics");
        if (fabricName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'replicationFabrics'.", id)));
        }
        String protectionContainerName = Utils.getValueFromIdByName(id, "replicationProtectionContainers");
        if (protectionContainerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment"
                                    + " 'replicationProtectionContainers'.",
                                id)));
        }
        String replicatedProtectedItemName = Utils.getValueFromIdByName(id, "replicationProtectedItems");
        if (replicatedProtectedItemName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'replicationProtectedItems'.",
                                id)));
        }
        return this
            .getWithResponse(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                replicatedProtectedItemName,
                context);
    }

    private ReplicationProtectedItemsClient serviceClient() {
        return this.innerClient;
    }

    private SiteRecoveryManager manager() {
        return this.serviceManager;
    }

    public ReplicationProtectedItemImpl define(String name) {
        return new ReplicationProtectedItemImpl(name, this.manager());
    }
}
