// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.openai.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.openai.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.openai.fluent.models.PrivateEndpointConnectionListResultInner;

/** An instance of this class provides access to all the operations defined in PrivateEndpointConnectionsClient. */
public interface PrivateEndpointConnectionsClient {
    /**
     * Gets the private endpoint connections associated with the OpenAI account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of OpenAI account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private endpoint connections associated with the OpenAI account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionListResultInner list(String resourceGroupName, String accountName);

    /**
     * Gets the private endpoint connections associated with the OpenAI account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of OpenAI account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private endpoint connections associated with the OpenAI account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionListResultInner> listWithResponse(
        String resourceGroupName, String accountName, Context context);

    /**
     * Gets the specified private endpoint connection associated with the OpenAI account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of OpenAI account.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the OpenAI
     *     Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the OpenAI account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner get(
        String resourceGroupName, String accountName, String privateEndpointConnectionName);

    /**
     * Gets the specified private endpoint connection associated with the OpenAI account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of OpenAI account.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the OpenAI
     *     Account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the OpenAI account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionInner> getWithResponse(
        String resourceGroupName, String accountName, String privateEndpointConnectionName, Context context);

    /**
     * Update the state of specified private endpoint connection associated with the OpenAI account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of OpenAI account.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the OpenAI
     *     Account.
     * @param properties The private endpoint connection properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<PrivateEndpointConnectionInner>, PrivateEndpointConnectionInner> beginCreateOrUpdate(
        String resourceGroupName,
        String accountName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner properties);

    /**
     * Update the state of specified private endpoint connection associated with the OpenAI account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of OpenAI account.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the OpenAI
     *     Account.
     * @param properties The private endpoint connection properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<PrivateEndpointConnectionInner>, PrivateEndpointConnectionInner> beginCreateOrUpdate(
        String resourceGroupName,
        String accountName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner properties,
        Context context);

    /**
     * Update the state of specified private endpoint connection associated with the OpenAI account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of OpenAI account.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the OpenAI
     *     Account.
     * @param properties The private endpoint connection properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner createOrUpdate(
        String resourceGroupName,
        String accountName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner properties);

    /**
     * Update the state of specified private endpoint connection associated with the OpenAI account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of OpenAI account.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the OpenAI
     *     Account.
     * @param properties The private endpoint connection properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner createOrUpdate(
        String resourceGroupName,
        String accountName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner properties,
        Context context);

    /**
     * Deletes the specified private endpoint connection associated with the OpenAI account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of OpenAI account.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the OpenAI
     *     Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String accountName, String privateEndpointConnectionName);

    /**
     * Deletes the specified private endpoint connection associated with the OpenAI account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of OpenAI account.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the OpenAI
     *     Account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String accountName, String privateEndpointConnectionName, Context context);

    /**
     * Deletes the specified private endpoint connection associated with the OpenAI account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of OpenAI account.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the OpenAI
     *     Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String privateEndpointConnectionName);

    /**
     * Deletes the specified private endpoint connection associated with the OpenAI account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of OpenAI account.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the OpenAI
     *     Account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String privateEndpointConnectionName, Context context);
}
