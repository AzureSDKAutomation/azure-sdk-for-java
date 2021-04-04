// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of InventoryItems. */
public interface InventoryItems {
    /**
     * Implements InventoryItem GET method.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param vcenterName Name of the vCenter.
     * @param inventoryItemName Name of the inventoryItem.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the inventory item.
     */
    InventoryItem get(String resourceGroupName, String vcenterName, String inventoryItemName);

    /**
     * Implements InventoryItem GET method.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param vcenterName Name of the vCenter.
     * @param inventoryItemName Name of the inventoryItem.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the inventory item.
     */
    Response<InventoryItem> getWithResponse(
        String resourceGroupName, String vcenterName, String inventoryItemName, Context context);

    /**
     * Implements inventoryItem DELETE method.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param vcenterName Name of the vCenter.
     * @param inventoryItemName Name of the inventoryItem.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String vcenterName, String inventoryItemName);

    /**
     * Implements inventoryItem DELETE method.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param vcenterName Name of the vCenter.
     * @param inventoryItemName Name of the inventoryItem.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String vcenterName, String inventoryItemName, Context context);

    /**
     * Returns the list of inventoryItems of the given vCenter.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param vcenterName Name of the vCenter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of InventoryItems.
     */
    PagedIterable<InventoryItem> listByVCenter(String resourceGroupName, String vcenterName);

    /**
     * Returns the list of inventoryItems of the given vCenter.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param vcenterName Name of the vCenter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of InventoryItems.
     */
    PagedIterable<InventoryItem> listByVCenter(String resourceGroupName, String vcenterName, Context context);

    /**
     * Implements InventoryItem GET method.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the inventory item.
     */
    InventoryItem getById(String id);

    /**
     * Implements InventoryItem GET method.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the inventory item.
     */
    Response<InventoryItem> getByIdWithResponse(String id, Context context);

    /**
     * Implements inventoryItem DELETE method.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Implements inventoryItem DELETE method.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new InventoryItem resource.
     *
     * @param name resource name.
     * @return the first stage of the new InventoryItem definition.
     */
    InventoryItem.DefinitionStages.Blank define(String name);
}
