// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.TargetComputeSizesClient;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.TargetComputeSizeInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.TargetComputeSize;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.TargetComputeSizes;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class TargetComputeSizesImpl implements TargetComputeSizes {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TargetComputeSizesImpl.class);

    private final TargetComputeSizesClient innerClient;

    private final com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager;

    public TargetComputeSizesImpl(
        TargetComputeSizesClient innerClient,
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<TargetComputeSize> listByReplicationProtectedItems(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName) {
        PagedIterable<TargetComputeSizeInner> inner =
            this
                .serviceClient()
                .listByReplicationProtectedItems(
                    resourceName, resourceGroupName, fabricName, protectionContainerName, replicatedProtectedItemName);
        return Utils.mapPage(inner, inner1 -> new TargetComputeSizeImpl(inner1, this.manager()));
    }

    public PagedIterable<TargetComputeSize> listByReplicationProtectedItems(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String replicatedProtectedItemName,
        Context context) {
        PagedIterable<TargetComputeSizeInner> inner =
            this
                .serviceClient()
                .listByReplicationProtectedItems(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    replicatedProtectedItemName,
                    context);
        return Utils.mapPage(inner, inner1 -> new TargetComputeSizeImpl(inner1, this.manager()));
    }

    private TargetComputeSizesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager() {
        return this.serviceManager;
    }
}
