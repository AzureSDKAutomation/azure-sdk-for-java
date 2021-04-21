// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.VpnSitesConfigurationsClient;
import com.azure.resourcemanager.network.generated.models.GetVpnSitesConfigurationRequest;
import com.azure.resourcemanager.network.generated.models.VpnSitesConfigurations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class VpnSitesConfigurationsImpl implements VpnSitesConfigurations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VpnSitesConfigurationsImpl.class);

    private final VpnSitesConfigurationsClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public VpnSitesConfigurationsImpl(
        VpnSitesConfigurationsClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void download(String resourceGroupName, String virtualWanName, GetVpnSitesConfigurationRequest request) {
        this.serviceClient().download(resourceGroupName, virtualWanName, request);
    }

    public void download(
        String resourceGroupName, String virtualWanName, GetVpnSitesConfigurationRequest request, Context context) {
        this.serviceClient().download(resourceGroupName, virtualWanName, request, context);
    }

    private VpnSitesConfigurationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
