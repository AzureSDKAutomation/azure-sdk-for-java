// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicefabric.fluent.ManagedClusterVersionsClient;
import com.azure.resourcemanager.servicefabric.fluent.models.ManagedClusterVersionDetailsInner;
import com.azure.resourcemanager.servicefabric.models.ManagedClusterVersionDetails;
import com.azure.resourcemanager.servicefabric.models.ManagedClusterVersions;
import com.azure.resourcemanager.servicefabric.models.ManagedClusterVersionsOsType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class ManagedClusterVersionsImpl implements ManagedClusterVersions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedClusterVersionsImpl.class);

    private final ManagedClusterVersionsClient innerClient;

    private final com.azure.resourcemanager.servicefabric.ServiceFabricManager serviceManager;

    public ManagedClusterVersionsImpl(
        ManagedClusterVersionsClient innerClient,
        com.azure.resourcemanager.servicefabric.ServiceFabricManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public List<ManagedClusterVersionDetails> listByOS(String location, ManagedClusterVersionsOsType osType) {
        List<ManagedClusterVersionDetailsInner> inner = this.serviceClient().listByOS(location, osType);
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new ManagedClusterVersionDetailsImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Response<List<ManagedClusterVersionDetails>> listByOSWithResponse(
        String location, ManagedClusterVersionsOsType osType, Context context) {
        Response<List<ManagedClusterVersionDetailsInner>> inner =
            this.serviceClient().listByOSWithResponse(location, osType, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                inner
                    .getValue()
                    .stream()
                    .map(inner1 -> new ManagedClusterVersionDetailsImpl(inner1, this.manager()))
                    .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    private ManagedClusterVersionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.servicefabric.ServiceFabricManager manager() {
        return this.serviceManager;
    }
}
