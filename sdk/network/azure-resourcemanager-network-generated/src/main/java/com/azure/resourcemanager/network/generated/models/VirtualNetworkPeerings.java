// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkPeeringInner;

/** Resource collection API of VirtualNetworkPeerings. */
public interface VirtualNetworkPeerings {
    /**
     * Deletes the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName);

    /**
     * Deletes the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName, Context context);

    /**
     * Gets the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified virtual network peering.
     */
    VirtualNetworkPeering get(String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName);

    /**
     * Gets the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified virtual network peering.
     */
    Response<VirtualNetworkPeering> getWithResponse(
        String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName, Context context);

    /**
     * Creates or updates a peering in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the peering.
     * @param virtualNetworkPeeringParameters Parameters supplied to the create or update virtual network peering
     *     operation.
     * @param syncRemoteAddressSpace Parameter indicates the intention to sync the peering with the current address
     *     space on the remote vNet after it's updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return peerings in a virtual network resource.
     */
    VirtualNetworkPeering createOrUpdate(
        String resourceGroupName,
        String virtualNetworkName,
        String virtualNetworkPeeringName,
        VirtualNetworkPeeringInner virtualNetworkPeeringParameters,
        SyncRemoteAddressSpace syncRemoteAddressSpace);

    /**
     * Creates or updates a peering in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the peering.
     * @param virtualNetworkPeeringParameters Parameters supplied to the create or update virtual network peering
     *     operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return peerings in a virtual network resource.
     */
    VirtualNetworkPeering createOrUpdate(
        String resourceGroupName,
        String virtualNetworkName,
        String virtualNetworkPeeringName,
        VirtualNetworkPeeringInner virtualNetworkPeeringParameters);

    /**
     * Creates or updates a peering in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the peering.
     * @param virtualNetworkPeeringParameters Parameters supplied to the create or update virtual network peering
     *     operation.
     * @param syncRemoteAddressSpace Parameter indicates the intention to sync the peering with the current address
     *     space on the remote vNet after it's updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return peerings in a virtual network resource.
     */
    VirtualNetworkPeering createOrUpdate(
        String resourceGroupName,
        String virtualNetworkName,
        String virtualNetworkPeeringName,
        VirtualNetworkPeeringInner virtualNetworkPeeringParameters,
        SyncRemoteAddressSpace syncRemoteAddressSpace,
        Context context);

    /**
     * Gets all virtual network peerings in a virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all virtual network peerings in a virtual network.
     */
    PagedIterable<VirtualNetworkPeering> list(String resourceGroupName, String virtualNetworkName);

    /**
     * Gets all virtual network peerings in a virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all virtual network peerings in a virtual network.
     */
    PagedIterable<VirtualNetworkPeering> list(String resourceGroupName, String virtualNetworkName, Context context);
}
