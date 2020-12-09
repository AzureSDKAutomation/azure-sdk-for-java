// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagesync.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.storagesync.fluent.models.ServerEndpointInner;
import com.azure.resourcemanager.storagesync.models.RecallActionParameters;
import com.azure.resourcemanager.storagesync.models.ServerEndpointCreateParameters;
import com.azure.resourcemanager.storagesync.models.ServerEndpointUpdateParameters;

/** An instance of this class provides access to all the operations defined in ServerEndpointsClient. */
public interface ServerEndpointsClient {
    /**
     * Create a new ServerEndpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @param serverEndpointName Name of Server Endpoint object.
     * @param parameters The parameters used when creating a server endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return server Endpoint object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ServerEndpointInner>, ServerEndpointInner> beginCreate(
        String resourceGroupName,
        String storageSyncServiceName,
        String syncGroupName,
        String serverEndpointName,
        ServerEndpointCreateParameters parameters);

    /**
     * Create a new ServerEndpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @param serverEndpointName Name of Server Endpoint object.
     * @param parameters The parameters used when creating a server endpoint.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return server Endpoint object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ServerEndpointInner>, ServerEndpointInner> beginCreate(
        String resourceGroupName,
        String storageSyncServiceName,
        String syncGroupName,
        String serverEndpointName,
        ServerEndpointCreateParameters parameters,
        Context context);

    /**
     * Create a new ServerEndpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @param serverEndpointName Name of Server Endpoint object.
     * @param parameters The parameters used when creating a server endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return server Endpoint object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerEndpointInner create(
        String resourceGroupName,
        String storageSyncServiceName,
        String syncGroupName,
        String serverEndpointName,
        ServerEndpointCreateParameters parameters);

    /**
     * Create a new ServerEndpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @param serverEndpointName Name of Server Endpoint object.
     * @param parameters The parameters used when creating a server endpoint.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return server Endpoint object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerEndpointInner create(
        String resourceGroupName,
        String storageSyncServiceName,
        String syncGroupName,
        String serverEndpointName,
        ServerEndpointCreateParameters parameters,
        Context context);

    /**
     * Patch a given ServerEndpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @param serverEndpointName Name of Server Endpoint object.
     * @param parameters Parameters for updating an Server Endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return server Endpoint object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ServerEndpointInner>, ServerEndpointInner> beginUpdate(
        String resourceGroupName,
        String storageSyncServiceName,
        String syncGroupName,
        String serverEndpointName,
        ServerEndpointUpdateParameters parameters);

    /**
     * Patch a given ServerEndpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @param serverEndpointName Name of Server Endpoint object.
     * @param parameters Parameters for updating an Server Endpoint.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return server Endpoint object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ServerEndpointInner>, ServerEndpointInner> beginUpdate(
        String resourceGroupName,
        String storageSyncServiceName,
        String syncGroupName,
        String serverEndpointName,
        ServerEndpointUpdateParameters parameters,
        Context context);

    /**
     * Patch a given ServerEndpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @param serverEndpointName Name of Server Endpoint object.
     * @param parameters Parameters for updating an Server Endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return server Endpoint object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerEndpointInner update(
        String resourceGroupName,
        String storageSyncServiceName,
        String syncGroupName,
        String serverEndpointName,
        ServerEndpointUpdateParameters parameters);

    /**
     * Patch a given ServerEndpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @param serverEndpointName Name of Server Endpoint object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return server Endpoint object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerEndpointInner update(
        String resourceGroupName, String storageSyncServiceName, String syncGroupName, String serverEndpointName);

    /**
     * Patch a given ServerEndpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @param serverEndpointName Name of Server Endpoint object.
     * @param parameters Parameters for updating an Server Endpoint.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return server Endpoint object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerEndpointInner update(
        String resourceGroupName,
        String storageSyncServiceName,
        String syncGroupName,
        String serverEndpointName,
        ServerEndpointUpdateParameters parameters,
        Context context);

    /**
     * Get a ServerEndpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @param serverEndpointName Name of Server Endpoint object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a ServerEndpoint.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServerEndpointInner get(
        String resourceGroupName, String storageSyncServiceName, String syncGroupName, String serverEndpointName);

    /**
     * Get a ServerEndpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @param serverEndpointName Name of Server Endpoint object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a ServerEndpoint.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ServerEndpointInner> getWithResponse(
        String resourceGroupName,
        String storageSyncServiceName,
        String syncGroupName,
        String serverEndpointName,
        Context context);

    /**
     * Delete a given ServerEndpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @param serverEndpointName Name of Server Endpoint object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String storageSyncServiceName, String syncGroupName, String serverEndpointName);

    /**
     * Delete a given ServerEndpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @param serverEndpointName Name of Server Endpoint object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName,
        String storageSyncServiceName,
        String syncGroupName,
        String serverEndpointName,
        Context context);

    /**
     * Delete a given ServerEndpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @param serverEndpointName Name of Server Endpoint object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceGroupName, String storageSyncServiceName, String syncGroupName, String serverEndpointName);

    /**
     * Delete a given ServerEndpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @param serverEndpointName Name of Server Endpoint object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceGroupName,
        String storageSyncServiceName,
        String syncGroupName,
        String serverEndpointName,
        Context context);

    /**
     * Get a ServerEndpoint list.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a ServerEndpoint list.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServerEndpointInner> listBySyncGroup(
        String resourceGroupName, String storageSyncServiceName, String syncGroupName);

    /**
     * Get a ServerEndpoint list.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a ServerEndpoint list.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServerEndpointInner> listBySyncGroup(
        String resourceGroupName, String storageSyncServiceName, String syncGroupName, Context context);

    /**
     * Recall a server endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @param serverEndpointName Name of Server Endpoint object.
     * @param parameters The parameters used when calling recall action on server endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginRecallAction(
        String resourceGroupName,
        String storageSyncServiceName,
        String syncGroupName,
        String serverEndpointName,
        RecallActionParameters parameters);

    /**
     * Recall a server endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @param serverEndpointName Name of Server Endpoint object.
     * @param parameters The parameters used when calling recall action on server endpoint.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginRecallAction(
        String resourceGroupName,
        String storageSyncServiceName,
        String syncGroupName,
        String serverEndpointName,
        RecallActionParameters parameters,
        Context context);

    /**
     * Recall a server endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @param serverEndpointName Name of Server Endpoint object.
     * @param parameters The parameters used when calling recall action on server endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void recallAction(
        String resourceGroupName,
        String storageSyncServiceName,
        String syncGroupName,
        String serverEndpointName,
        RecallActionParameters parameters);

    /**
     * Recall a server endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param storageSyncServiceName Name of Storage Sync Service resource.
     * @param syncGroupName Name of Sync Group resource.
     * @param serverEndpointName Name of Server Endpoint object.
     * @param parameters The parameters used when calling recall action on server endpoint.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.storagesync.models.StorageSyncApiErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void recallAction(
        String resourceGroupName,
        String storageSyncServiceName,
        String syncGroupName,
        String serverEndpointName,
        RecallActionParameters parameters,
        Context context);
}
