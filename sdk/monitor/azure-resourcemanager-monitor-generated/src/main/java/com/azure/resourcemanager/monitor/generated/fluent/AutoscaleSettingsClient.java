// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.fluent.models.AutoscaleSettingResourceInner;
import com.azure.resourcemanager.monitor.generated.models.AutoscaleSettingResourcePatch;

/** An instance of this class provides access to all the operations defined in AutoscaleSettingsClient. */
public interface AutoscaleSettingsClient {
    /**
     * Lists the autoscale settings for a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of autoscale setting resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AutoscaleSettingResourceInner> listByResourceGroup(String resourceGroupName);

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
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AutoscaleSettingResourceInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Creates or updates an autoscale setting.
     *
     * @param resourceGroupName The name of the resource group.
     * @param autoscaleSettingName The autoscale setting name.
     * @param parameters Parameters supplied to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the autoscale setting resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AutoscaleSettingResourceInner createOrUpdate(
        String resourceGroupName, String autoscaleSettingName, AutoscaleSettingResourceInner parameters);

    /**
     * Creates or updates an autoscale setting.
     *
     * @param resourceGroupName The name of the resource group.
     * @param autoscaleSettingName The autoscale setting name.
     * @param parameters Parameters supplied to the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the autoscale setting resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AutoscaleSettingResourceInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String autoscaleSettingName,
        AutoscaleSettingResourceInner parameters,
        Context context);

    /**
     * Deletes and autoscale setting.
     *
     * @param resourceGroupName The name of the resource group.
     * @param autoscaleSettingName The autoscale setting name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String autoscaleSettingName);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    AutoscaleSettingResourceInner getByResourceGroup(String resourceGroupName, String autoscaleSettingName);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AutoscaleSettingResourceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String autoscaleSettingName, Context context);

    /**
     * Updates an existing AutoscaleSettingsResource. To update other fields use the CreateOrUpdate method.
     *
     * @param resourceGroupName The name of the resource group.
     * @param autoscaleSettingName The autoscale setting name.
     * @param autoscaleSettingResource Parameters supplied to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the autoscale setting resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AutoscaleSettingResourceInner update(
        String resourceGroupName, String autoscaleSettingName, AutoscaleSettingResourcePatch autoscaleSettingResource);

    /**
     * Updates an existing AutoscaleSettingsResource. To update other fields use the CreateOrUpdate method.
     *
     * @param resourceGroupName The name of the resource group.
     * @param autoscaleSettingName The autoscale setting name.
     * @param autoscaleSettingResource Parameters supplied to the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the autoscale setting resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AutoscaleSettingResourceInner> updateWithResponse(
        String resourceGroupName,
        String autoscaleSettingName,
        AutoscaleSettingResourcePatch autoscaleSettingResource,
        Context context);

    /**
     * Lists the autoscale settings for a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of autoscale setting resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AutoscaleSettingResourceInner> list();

    /**
     * Lists the autoscale settings for a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of autoscale setting resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AutoscaleSettingResourceInner> list(Context context);
}
