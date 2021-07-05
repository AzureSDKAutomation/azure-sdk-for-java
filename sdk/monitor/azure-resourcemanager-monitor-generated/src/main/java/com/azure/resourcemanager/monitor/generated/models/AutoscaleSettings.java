// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of AutoscaleSettings. */
public interface AutoscaleSettings {
    /**
     * Lists the autoscale settings for a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of autoscale setting resources.
     */
    PagedIterable<AutoscaleSettingResource> listByResourceGroup(String resourceGroupName);

    /**
     * Lists the autoscale settings for a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of autoscale setting resources.
     */
    PagedIterable<AutoscaleSettingResource> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Deletes and autoscale setting.
     *
     * @param resourceGroupName The name of the resource group.
     * @param autoscaleSettingName The autoscale setting name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String autoscaleSettingName);

    /**
     * Deletes and autoscale setting.
     *
     * @param resourceGroupName The name of the resource group.
     * @param autoscaleSettingName The autoscale setting name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String autoscaleSettingName, Context context);

    /**
     * Gets an autoscale setting.
     *
     * @param resourceGroupName The name of the resource group.
     * @param autoscaleSettingName The autoscale setting name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an autoscale setting.
     */
    AutoscaleSettingResource getByResourceGroup(String resourceGroupName, String autoscaleSettingName);

    /**
     * Gets an autoscale setting.
     *
     * @param resourceGroupName The name of the resource group.
     * @param autoscaleSettingName The autoscale setting name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an autoscale setting.
     */
    Response<AutoscaleSettingResource> getByResourceGroupWithResponse(
        String resourceGroupName, String autoscaleSettingName, Context context);

    /**
     * Lists the autoscale settings for a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of autoscale setting resources.
     */
    PagedIterable<AutoscaleSettingResource> list();

    /**
     * Lists the autoscale settings for a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of autoscale setting resources.
     */
    PagedIterable<AutoscaleSettingResource> list(Context context);

    /**
     * Gets an autoscale setting.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an autoscale setting.
     */
    AutoscaleSettingResource getById(String id);

    /**
     * Gets an autoscale setting.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an autoscale setting.
     */
    Response<AutoscaleSettingResource> getByIdWithResponse(String id, Context context);

    /**
     * Deletes and autoscale setting.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes and autoscale setting.
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
     * Begins definition for a new AutoscaleSettingResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new AutoscaleSettingResource definition.
     */
    AutoscaleSettingResource.DefinitionStages.Blank define(String name);
}
