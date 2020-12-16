// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.digitaltwins.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.digitaltwins.fluent.models.PrivateEndpointConnectionsResponseInner;

/** An instance of this class provides access to all the operations defined in PrivateEndpointConnectionsClient. */
public interface PrivateEndpointConnectionsClient {
    /**
     * List private endpoint connection properties.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the available private link connections for a Digital Twin.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionsResponseInner list(String resourceGroupName, String resourceName);

    /**
     * List private endpoint connection properties.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the available private link connections for a Digital Twin.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionsResponseInner> listWithResponse(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Get private endpoint connection properties for the given private endpoint.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection properties for the given private endpoint.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner get(
        String resourceGroupName, String resourceName, String privateEndpointConnectionName);

    /**
     * Get private endpoint connection properties for the given private endpoint.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection properties for the given private endpoint.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionInner> getWithResponse(
        String resourceGroupName, String resourceName, String privateEndpointConnectionName, Context context);

    /**
     * Delete private endpoint connection with the specified name.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
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
     * Delete private endpoint connection with the specified name.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
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
     * Delete private endpoint connection with the specified name.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String resourceName, String privateEndpointConnectionName);

    /**
     * Delete private endpoint connection with the specified name.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String resourceName, String privateEndpointConnectionName, Context context);

    /**
     * Update the status of a private endpoint connection with the given name.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param privateEndpointConnection The private endpoint connection of a Digital Twin.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private endpoint connection of a Digital Twin.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<PrivateEndpointConnectionInner>, PrivateEndpointConnectionInner> beginCreateOrUpdate(
        String resourceGroupName,
        String resourceName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner privateEndpointConnection);

    /**
     * Update the status of a private endpoint connection with the given name.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param privateEndpointConnection The private endpoint connection of a Digital Twin.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private endpoint connection of a Digital Twin.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<PrivateEndpointConnectionInner>, PrivateEndpointConnectionInner> beginCreateOrUpdate(
        String resourceGroupName,
        String resourceName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner privateEndpointConnection,
        Context context);

    /**
     * Update the status of a private endpoint connection with the given name.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param privateEndpointConnection The private endpoint connection of a Digital Twin.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private endpoint connection of a Digital Twin.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner createOrUpdate(
        String resourceGroupName,
        String resourceName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner privateEndpointConnection);

    /**
     * Update the status of a private endpoint connection with the given name.
     *
     * @param resourceGroupName The name of the resource group that contains the DigitalTwinsInstance.
     * @param resourceName The name of the DigitalTwinsInstance.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param privateEndpointConnection The private endpoint connection of a Digital Twin.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private endpoint connection of a Digital Twin.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner createOrUpdate(
        String resourceGroupName,
        String resourceName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner privateEndpointConnection,
        Context context);
}
