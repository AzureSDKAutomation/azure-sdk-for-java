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
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.ReplicationMigrationItemsClient;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.MigrationItemInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.MigrateInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.MigrationItem;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationMigrationItems;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.TestMigrateCleanupInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.TestMigrateInput;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ReplicationMigrationItemsImpl implements ReplicationMigrationItems {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ReplicationMigrationItemsImpl.class);

    private final ReplicationMigrationItemsClient innerClient;

    private final SiteRecoveryManager serviceManager;

    public ReplicationMigrationItemsImpl(
        ReplicationMigrationItemsClient innerClient, SiteRecoveryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<MigrationItem> listByReplicationProtectionContainers(
        String resourceName, String resourceGroupName, String fabricName, String protectionContainerName) {
        PagedIterable<MigrationItemInner> inner =
            this
                .serviceClient()
                .listByReplicationProtectionContainers(
                    resourceName, resourceGroupName, fabricName, protectionContainerName);
        return Utils.mapPage(inner, inner1 -> new MigrationItemImpl(inner1, this.manager()));
    }

    public PagedIterable<MigrationItem> listByReplicationProtectionContainers(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        Context context) {
        PagedIterable<MigrationItemInner> inner =
            this
                .serviceClient()
                .listByReplicationProtectionContainers(
                    resourceName, resourceGroupName, fabricName, protectionContainerName, context);
        return Utils.mapPage(inner, inner1 -> new MigrationItemImpl(inner1, this.manager()));
    }

    public MigrationItem get(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName) {
        MigrationItemInner inner =
            this
                .serviceClient()
                .get(resourceName, resourceGroupName, fabricName, protectionContainerName, migrationItemName);
        if (inner != null) {
            return new MigrationItemImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<MigrationItem> getWithResponse(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        Context context) {
        Response<MigrationItemInner> inner =
            this
                .serviceClient()
                .getWithResponse(
                    resourceName, resourceGroupName, fabricName, protectionContainerName, migrationItemName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new MigrationItemImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        String deleteOption) {
        this
            .serviceClient()
            .delete(
                resourceName, resourceGroupName, fabricName, protectionContainerName, migrationItemName, deleteOption);
    }

    public void delete(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName) {
        this
            .serviceClient()
            .delete(resourceName, resourceGroupName, fabricName, protectionContainerName, migrationItemName);
    }

    public void delete(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        String deleteOption,
        Context context) {
        this
            .serviceClient()
            .delete(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                migrationItemName,
                deleteOption,
                context);
    }

    public MigrationItem migrate(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        MigrateInput migrateInput) {
        MigrationItemInner inner =
            this
                .serviceClient()
                .migrate(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    migrationItemName,
                    migrateInput);
        if (inner != null) {
            return new MigrationItemImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public MigrationItem migrate(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        MigrateInput migrateInput,
        Context context) {
        MigrationItemInner inner =
            this
                .serviceClient()
                .migrate(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    migrationItemName,
                    migrateInput,
                    context);
        if (inner != null) {
            return new MigrationItemImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public MigrationItem testMigrate(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        TestMigrateInput testMigrateInput) {
        MigrationItemInner inner =
            this
                .serviceClient()
                .testMigrate(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    migrationItemName,
                    testMigrateInput);
        if (inner != null) {
            return new MigrationItemImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public MigrationItem testMigrate(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        TestMigrateInput testMigrateInput,
        Context context) {
        MigrationItemInner inner =
            this
                .serviceClient()
                .testMigrate(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    migrationItemName,
                    testMigrateInput,
                    context);
        if (inner != null) {
            return new MigrationItemImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public MigrationItem testMigrateCleanup(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        TestMigrateCleanupInput testMigrateCleanupInput) {
        MigrationItemInner inner =
            this
                .serviceClient()
                .testMigrateCleanup(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    migrationItemName,
                    testMigrateCleanupInput);
        if (inner != null) {
            return new MigrationItemImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public MigrationItem testMigrateCleanup(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String migrationItemName,
        TestMigrateCleanupInput testMigrateCleanupInput,
        Context context) {
        MigrationItemInner inner =
            this
                .serviceClient()
                .testMigrateCleanup(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    migrationItemName,
                    testMigrateCleanupInput,
                    context);
        if (inner != null) {
            return new MigrationItemImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<MigrationItem> list(String resourceName, String resourceGroupName) {
        PagedIterable<MigrationItemInner> inner = this.serviceClient().list(resourceName, resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new MigrationItemImpl(inner1, this.manager()));
    }

    public PagedIterable<MigrationItem> list(
        String resourceName, String resourceGroupName, String skipToken, String filter, Context context) {
        PagedIterable<MigrationItemInner> inner =
            this.serviceClient().list(resourceName, resourceGroupName, skipToken, filter, context);
        return Utils.mapPage(inner, inner1 -> new MigrationItemImpl(inner1, this.manager()));
    }

    public MigrationItem getById(String id) {
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
        String migrationItemName = Utils.getValueFromIdByName(id, "replicationMigrationItems");
        if (migrationItemName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'replicationMigrationItems'.",
                                id)));
        }
        return this
            .getWithResponse(
                resourceName, resourceGroupName, fabricName, protectionContainerName, migrationItemName, Context.NONE)
            .getValue();
    }

    public Response<MigrationItem> getByIdWithResponse(String id, Context context) {
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
        String migrationItemName = Utils.getValueFromIdByName(id, "replicationMigrationItems");
        if (migrationItemName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'replicationMigrationItems'.",
                                id)));
        }
        return this
            .getWithResponse(
                resourceName, resourceGroupName, fabricName, protectionContainerName, migrationItemName, context);
    }

    public void deleteById(String id) {
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
        String migrationItemName = Utils.getValueFromIdByName(id, "replicationMigrationItems");
        if (migrationItemName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'replicationMigrationItems'.",
                                id)));
        }
        String localDeleteOption = null;
        this
            .delete(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                migrationItemName,
                localDeleteOption,
                Context.NONE);
    }

    public void deleteByIdWithResponse(String id, String deleteOption, Context context) {
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
        String migrationItemName = Utils.getValueFromIdByName(id, "replicationMigrationItems");
        if (migrationItemName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'replicationMigrationItems'.",
                                id)));
        }
        this
            .delete(
                resourceName,
                resourceGroupName,
                fabricName,
                protectionContainerName,
                migrationItemName,
                deleteOption,
                context);
    }

    private ReplicationMigrationItemsClient serviceClient() {
        return this.innerClient;
    }

    private SiteRecoveryManager manager() {
        return this.serviceManager;
    }

    public MigrationItemImpl define(String name) {
        return new MigrationItemImpl(name, this.manager());
    }
}
