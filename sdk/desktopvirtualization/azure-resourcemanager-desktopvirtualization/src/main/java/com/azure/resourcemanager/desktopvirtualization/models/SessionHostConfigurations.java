// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.SessionHostConfigurationInner;

/** Resource collection API of SessionHostConfigurations. */
public interface SessionHostConfigurations {
    /**
     * Get a SessionHostConfiguration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SessionHostConfiguration.
     */
    SessionHostConfiguration get(String resourceGroupName, String hostPoolName);

    /**
     * Get a SessionHostConfiguration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a SessionHostConfiguration.
     */
    Response<SessionHostConfiguration> getWithResponse(String resourceGroupName, String hostPoolName, Context context);

    /**
     * Create or update a SessionHostConfiguration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostConfiguration Object containing HostPool definitions.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a SessionHostConfiguration definition.
     */
    SessionHostConfiguration createOrUpdate(
        String resourceGroupName, String hostPoolName, SessionHostConfigurationInner sessionHostConfiguration);

    /**
     * Create or update a SessionHostConfiguration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostConfiguration Object containing HostPool definitions.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a SessionHostConfiguration definition.
     */
    Response<SessionHostConfiguration> createOrUpdateWithResponse(
        String resourceGroupName,
        String hostPoolName,
        SessionHostConfigurationInner sessionHostConfiguration,
        Context context);

    /**
     * Remove a SessionHostConfiguration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a SessionHostConfiguration definition.
     */
    SessionHostConfiguration deleteByResourceGroup(String resourceGroupName, String hostPoolName);

    /**
     * Remove a SessionHostConfiguration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a SessionHostConfiguration definition.
     */
    Response<SessionHostConfiguration> deleteWithResponse(
        String resourceGroupName, String hostPoolName, Context context);

    /**
     * Update a SessionHostConfiguration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a SessionHostConfiguration definition.
     */
    SessionHostConfiguration update(String resourceGroupName, String hostPoolName);

    /**
     * Update a SessionHostConfiguration.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param hostPool Object containing HostPool definitions.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a SessionHostConfiguration definition.
     */
    Response<SessionHostConfiguration> updateWithResponse(
        String resourceGroupName, String hostPoolName, HostPoolPatch hostPool, Context context);

    /**
     * List sessionHostConfigurations.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of SessionHostConfiguration definitions.
     */
    PagedIterable<SessionHostConfiguration> listByHostPool(String resourceGroupName, String hostPoolName);

    /**
     * List sessionHostConfigurations.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of SessionHostConfiguration definitions.
     */
    PagedIterable<SessionHostConfiguration> listByHostPool(
        String resourceGroupName, String hostPoolName, Context context);
}
