// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.generated.fluent.models.FlowLogInner;
import com.azure.resourcemanager.network.generated.models.TagsObject;

/** An instance of this class provides access to all the operations defined in FlowLogsClient. */
public interface FlowLogsClient {
    /**
     * Create or update a flow log for the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param flowLogName The name of the flow log.
     * @param parameters Parameters that define the create or update flow log resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a flow log resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<FlowLogInner>, FlowLogInner> beginCreateOrUpdate(
        String resourceGroupName, String networkWatcherName, String flowLogName, FlowLogInner parameters);

    /**
     * Create or update a flow log for the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param flowLogName The name of the flow log.
     * @param parameters Parameters that define the create or update flow log resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a flow log resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<FlowLogInner>, FlowLogInner> beginCreateOrUpdate(
        String resourceGroupName,
        String networkWatcherName,
        String flowLogName,
        FlowLogInner parameters,
        Context context);

    /**
     * Create or update a flow log for the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param flowLogName The name of the flow log.
     * @param parameters Parameters that define the create or update flow log resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a flow log resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FlowLogInner createOrUpdate(
        String resourceGroupName, String networkWatcherName, String flowLogName, FlowLogInner parameters);

    /**
     * Create or update a flow log for the specified network security group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param flowLogName The name of the flow log.
     * @param parameters Parameters that define the create or update flow log resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a flow log resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FlowLogInner createOrUpdate(
        String resourceGroupName,
        String networkWatcherName,
        String flowLogName,
        FlowLogInner parameters,
        Context context);

    /**
     * Update tags of the specified flow log.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param flowLogName The name of the flow log.
     * @param parameters Parameters supplied to update flow log tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a flow log resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FlowLogInner updateTags(
        String resourceGroupName, String networkWatcherName, String flowLogName, TagsObject parameters);

    /**
     * Update tags of the specified flow log.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param flowLogName The name of the flow log.
     * @param parameters Parameters supplied to update flow log tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a flow log resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FlowLogInner> updateTagsWithResponse(
        String resourceGroupName,
        String networkWatcherName,
        String flowLogName,
        TagsObject parameters,
        Context context);

    /**
     * Gets a flow log resource by name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param flowLogName The name of the flow log resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a flow log resource by name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FlowLogInner get(String resourceGroupName, String networkWatcherName, String flowLogName);

    /**
     * Gets a flow log resource by name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param flowLogName The name of the flow log resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a flow log resource by name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FlowLogInner> getWithResponse(
        String resourceGroupName, String networkWatcherName, String flowLogName, Context context);

    /**
     * Deletes the specified flow log resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param flowLogName The name of the flow log resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String networkWatcherName, String flowLogName);

    /**
     * Deletes the specified flow log resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param flowLogName The name of the flow log resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String networkWatcherName, String flowLogName, Context context);

    /**
     * Deletes the specified flow log resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param flowLogName The name of the flow log resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String networkWatcherName, String flowLogName);

    /**
     * Deletes the specified flow log resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param flowLogName The name of the flow log resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String networkWatcherName, String flowLogName, Context context);

    /**
     * Lists all flow log resources for the specified Network Watcher.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of flow logs.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FlowLogInner> list(String resourceGroupName, String networkWatcherName);

    /**
     * Lists all flow log resources for the specified Network Watcher.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of flow logs.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FlowLogInner> list(String resourceGroupName, String networkWatcherName, Context context);
}
