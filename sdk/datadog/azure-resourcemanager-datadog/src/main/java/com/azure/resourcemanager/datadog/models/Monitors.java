// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Monitors. */
public interface Monitors {
    /**
     * List all monitors under the specified subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of a list operation.
     */
    PagedIterable<DatadogMonitorResource> list();

    /**
     * List all monitors under the specified subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of a list operation.
     */
    PagedIterable<DatadogMonitorResource> list(Context context);

    /**
     * List all monitors under the specified resource group.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of a list operation.
     */
    PagedIterable<DatadogMonitorResource> listByResourceGroup(String resourceGroupName);

    /**
     * List all monitors under the specified resource group.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of a list operation.
     */
    PagedIterable<DatadogMonitorResource> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Get the properties of a specific monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a specific monitor resource.
     */
    DatadogMonitorResource getByResourceGroup(String resourceGroupName, String monitorName);

    /**
     * Get the properties of a specific monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param monitorName Monitor resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a specific monitor resource.
     */
    Response<DatadogMonitorResource> getByResourceGroupWithResponse(
        String resourceGroupName, String monitorName, Context context);

    /**
     * Delete a monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String monitorName);

    /**
     * Delete a monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param monitorName Monitor resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String monitorName, Context context);

    /**
     * Get the properties of a specific monitor resource.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a specific monitor resource.
     */
    DatadogMonitorResource getById(String id);

    /**
     * Get the properties of a specific monitor resource.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a specific monitor resource.
     */
    Response<DatadogMonitorResource> getByIdWithResponse(String id, Context context);

    /**
     * Delete a monitor resource.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a monitor resource.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new DatadogMonitorResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new DatadogMonitorResource definition.
     */
    DatadogMonitorResource.DefinitionStages.Blank define(String name);
}
