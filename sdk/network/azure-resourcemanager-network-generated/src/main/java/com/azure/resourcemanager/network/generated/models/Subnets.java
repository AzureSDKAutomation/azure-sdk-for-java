// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.SubnetInner;

/** Resource collection API of Subnets. */
public interface Subnets {
    /**
     * Deletes the specified subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String virtualNetworkName, String subnetName);

    /**
     * Deletes the specified subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String virtualNetworkName, String subnetName, Context context);

    /**
     * Gets the specified subnet by virtual network and resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified subnet by virtual network and resource group.
     */
    Subnet get(String resourceGroupName, String virtualNetworkName, String subnetName);

    /**
     * Gets the specified subnet by virtual network and resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified subnet by virtual network and resource group.
     */
    Response<Subnet> getWithResponse(
        String resourceGroupName, String virtualNetworkName, String subnetName, String expand, Context context);

    /**
     * Creates or updates a subnet in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param subnetParameters Parameters supplied to the create or update subnet operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return subnet in a virtual network resource.
     */
    Subnet createOrUpdate(
        String resourceGroupName, String virtualNetworkName, String subnetName, SubnetInner subnetParameters);

    /**
     * Creates or updates a subnet in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param subnetParameters Parameters supplied to the create or update subnet operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return subnet in a virtual network resource.
     */
    Subnet createOrUpdate(
        String resourceGroupName,
        String virtualNetworkName,
        String subnetName,
        SubnetInner subnetParameters,
        Context context);

    /**
     * Prepares a subnet by applying network intent policies.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param prepareNetworkPoliciesRequestParameters Parameters supplied to prepare subnet by applying network intent
     *     policies.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void prepareNetworkPolicies(
        String resourceGroupName,
        String virtualNetworkName,
        String subnetName,
        PrepareNetworkPoliciesRequest prepareNetworkPoliciesRequestParameters);

    /**
     * Prepares a subnet by applying network intent policies.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param prepareNetworkPoliciesRequestParameters Parameters supplied to prepare subnet by applying network intent
     *     policies.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void prepareNetworkPolicies(
        String resourceGroupName,
        String virtualNetworkName,
        String subnetName,
        PrepareNetworkPoliciesRequest prepareNetworkPoliciesRequestParameters,
        Context context);

    /**
     * Unprepares a subnet by removing network intent policies.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param unprepareNetworkPoliciesRequestParameters Parameters supplied to unprepare subnet to remove network intent
     *     policies.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void unprepareNetworkPolicies(
        String resourceGroupName,
        String virtualNetworkName,
        String subnetName,
        UnprepareNetworkPoliciesRequest unprepareNetworkPoliciesRequestParameters);

    /**
     * Unprepares a subnet by removing network intent policies.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param unprepareNetworkPoliciesRequestParameters Parameters supplied to unprepare subnet to remove network intent
     *     policies.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void unprepareNetworkPolicies(
        String resourceGroupName,
        String virtualNetworkName,
        String subnetName,
        UnprepareNetworkPoliciesRequest unprepareNetworkPoliciesRequestParameters,
        Context context);

    /**
     * Gets all subnets in a virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all subnets in a virtual network.
     */
    PagedIterable<Subnet> list(String resourceGroupName, String virtualNetworkName);

    /**
     * Gets all subnets in a virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all subnets in a virtual network.
     */
    PagedIterable<Subnet> list(String resourceGroupName, String virtualNetworkName, Context context);
}
