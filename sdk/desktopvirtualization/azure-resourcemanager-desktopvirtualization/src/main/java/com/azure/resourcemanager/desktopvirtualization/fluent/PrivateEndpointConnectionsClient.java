// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.PrivateEndpointConnectionListResultWithSystemDataInner;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.PrivateEndpointConnectionWithSystemDataInner;
import com.azure.resourcemanager.desktopvirtualization.models.PrivateEndpointConnection;

/** An instance of this class provides access to all the operations defined in PrivateEndpointConnectionsClient. */
public interface PrivateEndpointConnectionsClient {
    /**
     * List private endpoint connections associated with hostpool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionListResultWithSystemDataInner listByHostPool(
        String resourceGroupName, String hostPoolName);

    /**
     * List private endpoint connections associated with hostpool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionListResultWithSystemDataInner> listByHostPoolWithResponse(
        String resourceGroupName, String hostPoolName, Context context);

    /**
     * Get a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionWithSystemDataInner getByHostPool(
        String resourceGroupName, String hostPoolName, String privateEndpointConnectionName);

    /**
     * Get a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionWithSystemDataInner> getByHostPoolWithResponse(
        String resourceGroupName, String hostPoolName, String privateEndpointConnectionName, Context context);

    /**
     * Remove a connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteByHostPool(String resourceGroupName, String hostPoolName, String privateEndpointConnectionName);

    /**
     * Remove a connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteByHostPoolWithResponse(
        String resourceGroupName, String hostPoolName, String privateEndpointConnectionName, Context context);

    /**
     * Approve or reject a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param connection Object containing the updated connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionWithSystemDataInner updateByHostPool(
        String resourceGroupName,
        String hostPoolName,
        String privateEndpointConnectionName,
        PrivateEndpointConnection connection);

    /**
     * Approve or reject a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param connection Object containing the updated connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionWithSystemDataInner> updateByHostPoolWithResponse(
        String resourceGroupName,
        String hostPoolName,
        String privateEndpointConnectionName,
        PrivateEndpointConnection connection,
        Context context);

    /**
     * List private endpoint connections.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionListResultWithSystemDataInner listByWorkspace(
        String resourceGroupName, String workspaceName);

    /**
     * List private endpoint connections.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified storage account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionListResultWithSystemDataInner> listByWorkspaceWithResponse(
        String resourceGroupName, String workspaceName, Context context);

    /**
     * Get a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionWithSystemDataInner getByWorkspace(
        String resourceGroupName, String workspaceName, String privateEndpointConnectionName);

    /**
     * Get a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionWithSystemDataInner> getByWorkspaceWithResponse(
        String resourceGroupName, String workspaceName, String privateEndpointConnectionName, Context context);

    /**
     * Remove a connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteByWorkspace(String resourceGroupName, String workspaceName, String privateEndpointConnectionName);

    /**
     * Remove a connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteByWorkspaceWithResponse(
        String resourceGroupName, String workspaceName, String privateEndpointConnectionName, Context context);

    /**
     * Approve or reject a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param connection Object containing the updated connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionWithSystemDataInner updateByWorkspace(
        String resourceGroupName,
        String workspaceName,
        String privateEndpointConnectionName,
        PrivateEndpointConnection connection);

    /**
     * Approve or reject a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param connection Object containing the updated connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionWithSystemDataInner> updateByWorkspaceWithResponse(
        String resourceGroupName,
        String workspaceName,
        String privateEndpointConnectionName,
        PrivateEndpointConnection connection,
        Context context);
}
