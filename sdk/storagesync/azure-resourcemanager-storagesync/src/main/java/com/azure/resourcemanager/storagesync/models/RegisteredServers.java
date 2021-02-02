// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagesync.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of RegisteredServers. */
public interface RegisteredServers {
    /**
     * Get a given registered server list.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a given registered server list.
     */
    PagedIterable<RegisteredServer> listByStorageSyncService(String resourceGroupName, String storageSyncServiceName);

    /**
     * Get a given registered server list.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a given registered server list.
     */
    PagedIterable<RegisteredServer> listByStorageSyncService(
        String resourceGroupName, String storageSyncServiceName, Context context);

    /**
     * Get a given registered server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param serverId GUID identifying the on-premises server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a given registered server.
     */
    RegisteredServer get(String resourceGroupName, String storageSyncServiceName, String serverId);

    /**
     * Get a given registered server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param serverId GUID identifying the on-premises server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a given registered server.
     */
    Response<RegisteredServer> getWithResponse(
        String resourceGroupName, String storageSyncServiceName, String serverId, Context context);

    /**
     * Delete the given registered server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param serverId GUID identifying the on-premises server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String storageSyncServiceName, String serverId);

    /**
     * Delete the given registered server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param serverId GUID identifying the on-premises server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String storageSyncServiceName, String serverId, Context context);

    /**
     * Triggers Server certificate rollover.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param serverId Server Id.
     * @param parameters Body of Trigger Rollover request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void triggerRollover(
        String resourceGroupName, String storageSyncServiceName, String serverId, TriggerRolloverRequest parameters);

    /**
     * Triggers Server certificate rollover.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param serverId Server Id.
     * @param parameters Body of Trigger Rollover request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void triggerRollover(
        String resourceGroupName,
        String storageSyncServiceName,
        String serverId,
        TriggerRolloverRequest parameters,
        Context context);

    /**
     * Get a given registered server.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a given registered server.
     */
    RegisteredServer getById(String id);

    /**
     * Get a given registered server.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a given registered server.
     */
    Response<RegisteredServer> getByIdWithResponse(String id, Context context);

    /**
     * Delete the given registered server.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete the given registered server.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new RegisteredServer resource.
     *
     * @param name resource name.
     * @return the first stage of the new RegisteredServer definition.
     */
    RegisteredServer.DefinitionStages.Blank define(String name);
}
