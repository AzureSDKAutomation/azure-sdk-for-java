// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.containerservice.generated.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.containerservice.generated.fluent.models.PrivateEndpointConnectionListResultInner;

/** An instance of this class provides access to all the operations defined in PrivateEndpointConnectionsClient. */
public interface PrivateEndpointConnectionsClient {
    /**
     * To learn more about private clusters, see: https://docs.microsoft.com/azure/aks/private-clusters.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of private endpoint connections.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionListResultInner list(String resourceGroupName, String resourceName);

    /**
     * To learn more about private clusters, see: https://docs.microsoft.com/azure/aks/private-clusters.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of private endpoint connections.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionListResultInner> listWithResponse(
        String resourceGroupName, String resourceName, Context context);

    /**
     * To learn more about private clusters, see: https://docs.microsoft.com/azure/aks/private-clusters.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner get(
        String resourceGroupName, String resourceName, String privateEndpointConnectionName);

    /**
     * To learn more about private clusters, see: https://docs.microsoft.com/azure/aks/private-clusters.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionInner> getWithResponse(
        String resourceGroupName, String resourceName, String privateEndpointConnectionName, Context context);

    /**
     * Updates a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param parameters The updated private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner update(
        String resourceGroupName,
        String resourceName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner parameters);

    /**
     * Updates a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param parameters The updated private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionInner> updateWithResponse(
        String resourceGroupName,
        String resourceName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner parameters,
        Context context);

    /**
     * Deletes a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String resourceName, String privateEndpointConnectionName);

    /**
     * Deletes a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String resourceName, String privateEndpointConnectionName, Context context);

    /**
     * Deletes a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String resourceName, String privateEndpointConnectionName);

    /**
     * Deletes a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String resourceName, String privateEndpointConnectionName, Context context);
}
