// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.OperationsOperationsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ClientDiscoveryValueForSingleApiInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.ClientDiscoveryValueForSingleApi;
import com.azure.resourcemanager.recoveryservicesbackup.models.OperationsOperations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class OperationsOperationsImpl implements OperationsOperations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationsOperationsImpl.class);

    private final OperationsOperationsClient innerClient;

    private final RecoveryServicesBackupManager serviceManager;

    public OperationsOperationsImpl(
        OperationsOperationsClient innerClient, RecoveryServicesBackupManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ClientDiscoveryValueForSingleApi> list() {
        PagedIterable<ClientDiscoveryValueForSingleApiInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new ClientDiscoveryValueForSingleApiImpl(inner1, this.manager()));
    }

    public PagedIterable<ClientDiscoveryValueForSingleApi> list(Context context) {
        PagedIterable<ClientDiscoveryValueForSingleApiInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new ClientDiscoveryValueForSingleApiImpl(inner1, this.manager()));
    }

    private OperationsOperationsClient serviceClient() {
        return this.innerClient;
    }

    private RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}
