// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.signalr.fluent.models.PrivateEndpointConnectionInner;

/** Resource collection API of SignalRPrivateEndpointConnections. */
public interface SignalRPrivateEndpointConnections {
    /**
     * Get the specified private endpoint connection associated with a SignalR resource.
     *
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the SignalR
     *     resource.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the SignalR resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with a SignalR resource.
     */
    PrivateEndpointConnection get(String privateEndpointConnectionName, String resourceGroupName, String resourceName);

    /**
     * Get the specified private endpoint connection associated with a SignalR resource.
     *
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the SignalR
     *     resource.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the SignalR resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with a SignalR resource.
     */
    Response<PrivateEndpointConnection> getWithResponse(
        String privateEndpointConnectionName, String resourceGroupName, String resourceName, Context context);

    /**
     * Update the state of specified private endpoint connection associated with a SignalR resource.
     *
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the SignalR
     *     resource.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the SignalR resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection to SignalR resource.
     */
    PrivateEndpointConnection update(
        String privateEndpointConnectionName, String resourceGroupName, String resourceName);

    /**
     * Update the state of specified private endpoint connection associated with a SignalR resource.
     *
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the SignalR
     *     resource.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the SignalR resource.
     * @param parameters The resource of private endpoint and its properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection to SignalR resource.
     */
    Response<PrivateEndpointConnection> updateWithResponse(
        String privateEndpointConnectionName,
        String resourceGroupName,
        String resourceName,
        PrivateEndpointConnectionInner parameters,
        Context context);

    /**
     * Delete the specified private endpoint connection associated with a SignalR resource.
     *
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the SignalR
     *     resource.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the SignalR resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String privateEndpointConnectionName, String resourceGroupName, String resourceName);

    /**
     * Delete the specified private endpoint connection associated with a SignalR resource.
     *
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the SignalR
     *     resource.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the SignalR resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String privateEndpointConnectionName, String resourceGroupName, String resourceName, Context context);
}
