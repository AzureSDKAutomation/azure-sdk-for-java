// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.blockchain.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.blockchain.fluent.models.ApiKeyCollectionInner;
import com.azure.resourcemanager.blockchain.fluent.models.BlockchainMemberInner;
import com.azure.resourcemanager.blockchain.fluent.models.ConsortiumMemberInner;
import com.azure.resourcemanager.blockchain.models.ApiKey;
import com.azure.resourcemanager.blockchain.models.BlockchainMemberUpdate;

/** An instance of this class provides access to all the operations defined in BlockchainMembersClient. */
public interface BlockchainMembersClient {
    /**
     * Get details about a blockchain member.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param blockchainMemberName Blockchain member name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about a blockchain member.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BlockchainMemberInner getByResourceGroup(String resourceGroupName, String blockchainMemberName);

    /**
     * Get details about a blockchain member.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param blockchainMemberName Blockchain member name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about a blockchain member.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BlockchainMemberInner> getByResourceGroupWithResponse(
        String resourceGroupName, String blockchainMemberName, Context context);

    /**
     * Create a blockchain member.
     *
     * @param blockchainMemberName Blockchain member name.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param blockchainMember Payload to create a blockchain member.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return payload of the blockchain member which is exposed in the request/response of the resource provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<BlockchainMemberInner>, BlockchainMemberInner> beginCreate(
        String blockchainMemberName, String resourceGroupName, BlockchainMemberInner blockchainMember);

    /**
     * Create a blockchain member.
     *
     * @param blockchainMemberName Blockchain member name.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param blockchainMember Payload to create a blockchain member.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return payload of the blockchain member which is exposed in the request/response of the resource provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<BlockchainMemberInner>, BlockchainMemberInner> beginCreate(
        String blockchainMemberName, String resourceGroupName, BlockchainMemberInner blockchainMember, Context context);

    /**
     * Create a blockchain member.
     *
     * @param blockchainMemberName Blockchain member name.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param blockchainMember Payload to create a blockchain member.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return payload of the blockchain member which is exposed in the request/response of the resource provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BlockchainMemberInner create(
        String blockchainMemberName, String resourceGroupName, BlockchainMemberInner blockchainMember);

    /**
     * Create a blockchain member.
     *
     * @param blockchainMemberName Blockchain member name.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return payload of the blockchain member which is exposed in the request/response of the resource provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BlockchainMemberInner create(String blockchainMemberName, String resourceGroupName);

    /**
     * Create a blockchain member.
     *
     * @param blockchainMemberName Blockchain member name.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param blockchainMember Payload to create a blockchain member.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return payload of the blockchain member which is exposed in the request/response of the resource provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BlockchainMemberInner create(
        String blockchainMemberName, String resourceGroupName, BlockchainMemberInner blockchainMember, Context context);

    /**
     * Delete a blockchain member.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param blockchainMemberName Blockchain member name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String blockchainMemberName);

    /**
     * Delete a blockchain member.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param blockchainMemberName Blockchain member name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String blockchainMemberName, Context context);

    /**
     * Delete a blockchain member.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param blockchainMemberName Blockchain member name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String blockchainMemberName);

    /**
     * Delete a blockchain member.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param blockchainMemberName Blockchain member name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String blockchainMemberName, Context context);

    /**
     * Update a blockchain member.
     *
     * @param blockchainMemberName Blockchain member name.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return payload of the blockchain member which is exposed in the request/response of the resource provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BlockchainMemberInner update(String blockchainMemberName, String resourceGroupName);

    /**
     * Update a blockchain member.
     *
     * @param blockchainMemberName Blockchain member name.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param blockchainMember Payload to update the blockchain member.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return payload of the blockchain member which is exposed in the request/response of the resource provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BlockchainMemberInner> updateWithResponse(
        String blockchainMemberName,
        String resourceGroupName,
        BlockchainMemberUpdate blockchainMember,
        Context context);

    /**
     * Lists the blockchain members for a resource group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of the blockchain member payload which is exposed in the request/response of the resource
     *     provider.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BlockchainMemberInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists the blockchain members for a resource group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of the blockchain member payload which is exposed in the request/response of the resource
     *     provider.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BlockchainMemberInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists the blockchain members for a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of the blockchain member payload which is exposed in the request/response of the resource
     *     provider.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BlockchainMemberInner> list();

    /**
     * Lists the blockchain members for a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of the blockchain member payload which is exposed in the request/response of the resource
     *     provider.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BlockchainMemberInner> list(Context context);

    /**
     * Lists the consortium members for a blockchain member.
     *
     * @param blockchainMemberName Blockchain member name.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of consortium payload.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ConsortiumMemberInner> listConsortiumMembers(String blockchainMemberName, String resourceGroupName);

    /**
     * Lists the consortium members for a blockchain member.
     *
     * @param blockchainMemberName Blockchain member name.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of consortium payload.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ConsortiumMemberInner> listConsortiumMembers(
        String blockchainMemberName, String resourceGroupName, Context context);

    /**
     * Lists the API keys for a blockchain member.
     *
     * @param blockchainMemberName Blockchain member name.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of the API key payload which is exposed in the response of the resource provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiKeyCollectionInner listApiKeys(String blockchainMemberName, String resourceGroupName);

    /**
     * Lists the API keys for a blockchain member.
     *
     * @param blockchainMemberName Blockchain member name.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of the API key payload which is exposed in the response of the resource provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApiKeyCollectionInner> listApiKeysWithResponse(
        String blockchainMemberName, String resourceGroupName, Context context);

    /**
     * Regenerate the API keys for a blockchain member.
     *
     * @param blockchainMemberName Blockchain member name.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of the API key payload which is exposed in the response of the resource provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiKeyCollectionInner listRegenerateApiKeys(String blockchainMemberName, String resourceGroupName);

    /**
     * Regenerate the API keys for a blockchain member.
     *
     * @param blockchainMemberName Blockchain member name.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param apiKey api key to be regenerate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of the API key payload which is exposed in the response of the resource provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApiKeyCollectionInner> listRegenerateApiKeysWithResponse(
        String blockchainMemberName, String resourceGroupName, ApiKey apiKey, Context context);
}
