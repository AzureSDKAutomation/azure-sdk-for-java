// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.attestation.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of PrivateEndpointConnections. */
public interface PrivateEndpointConnections {
    /**
     * List all the private endpoint connections associated with the attestation provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName The name of the attestation provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified storage account.
     */
    PagedIterable<PrivateEndpointConnection> list(String resourceGroupName, String providerName);

    /**
     * List all the private endpoint connections associated with the attestation provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName The name of the attestation provider.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified storage account.
     */
    PagedIterable<PrivateEndpointConnection> list(String resourceGroupName, String providerName, Context context);

    /**
     * Gets the specified private endpoint connection associated with the attestation provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName The name of the attestation provider.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the attestation provider.
     */
    PrivateEndpointConnection get(String resourceGroupName, String providerName, String privateEndpointConnectionName);

    /**
     * Gets the specified private endpoint connection associated with the attestation provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName The name of the attestation provider.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the attestation provider.
     */
    Response<PrivateEndpointConnection> getWithResponse(
        String resourceGroupName, String providerName, String privateEndpointConnectionName, Context context);

    /**
     * Deletes the specified private endpoint connection associated with the attestation provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName The name of the attestation provider.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String providerName, String privateEndpointConnectionName);

    /**
     * Deletes the specified private endpoint connection associated with the attestation provider.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param providerName The name of the attestation provider.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String providerName, String privateEndpointConnectionName, Context context);

    /**
     * Gets the specified private endpoint connection associated with the attestation provider.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the attestation provider.
     */
    PrivateEndpointConnection getById(String id);

    /**
     * Gets the specified private endpoint connection associated with the attestation provider.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the attestation provider.
     */
    Response<PrivateEndpointConnection> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the specified private endpoint connection associated with the attestation provider.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified private endpoint connection associated with the attestation provider.
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
     * Begins definition for a new PrivateEndpointConnection resource.
     *
     * @param name resource name.
     * @return the first stage of the new PrivateEndpointConnection definition.
     */
    PrivateEndpointConnection.DefinitionStages.Blank define(String name);
}
