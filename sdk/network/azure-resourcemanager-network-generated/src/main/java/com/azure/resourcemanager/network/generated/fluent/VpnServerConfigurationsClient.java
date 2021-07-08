// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.generated.fluent.models.VpnServerConfigurationInner;
import com.azure.resourcemanager.network.generated.models.TagsObject;

/** An instance of this class provides access to all the operations defined in VpnServerConfigurationsClient. */
public interface VpnServerConfigurationsClient {
    /**
     * Retrieves the details of a VpnServerConfiguration.
     *
     * @param resourceGroupName The resource group name of the VpnServerConfiguration.
     * @param vpnServerConfigurationName The name of the VpnServerConfiguration being retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfiguration Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VpnServerConfigurationInner getByResourceGroup(String resourceGroupName, String vpnServerConfigurationName);

    /**
     * Retrieves the details of a VpnServerConfiguration.
     *
     * @param resourceGroupName The resource group name of the VpnServerConfiguration.
     * @param vpnServerConfigurationName The name of the VpnServerConfiguration being retrieved.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfiguration Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VpnServerConfigurationInner> getByResourceGroupWithResponse(
        String resourceGroupName, String vpnServerConfigurationName, Context context);

    /**
     * Creates a VpnServerConfiguration resource if it doesn't exist else updates the existing VpnServerConfiguration.
     *
     * @param resourceGroupName The resource group name of the VpnServerConfiguration.
     * @param vpnServerConfigurationName The name of the VpnServerConfiguration being created or updated.
     * @param vpnServerConfigurationParameters Parameters supplied to create or update VpnServerConfiguration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfiguration Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VpnServerConfigurationInner>, VpnServerConfigurationInner> beginCreateOrUpdate(
        String resourceGroupName,
        String vpnServerConfigurationName,
        VpnServerConfigurationInner vpnServerConfigurationParameters);

    /**
     * Creates a VpnServerConfiguration resource if it doesn't exist else updates the existing VpnServerConfiguration.
     *
     * @param resourceGroupName The resource group name of the VpnServerConfiguration.
     * @param vpnServerConfigurationName The name of the VpnServerConfiguration being created or updated.
     * @param vpnServerConfigurationParameters Parameters supplied to create or update VpnServerConfiguration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfiguration Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VpnServerConfigurationInner>, VpnServerConfigurationInner> beginCreateOrUpdate(
        String resourceGroupName,
        String vpnServerConfigurationName,
        VpnServerConfigurationInner vpnServerConfigurationParameters,
        Context context);

    /**
     * Creates a VpnServerConfiguration resource if it doesn't exist else updates the existing VpnServerConfiguration.
     *
     * @param resourceGroupName The resource group name of the VpnServerConfiguration.
     * @param vpnServerConfigurationName The name of the VpnServerConfiguration being created or updated.
     * @param vpnServerConfigurationParameters Parameters supplied to create or update VpnServerConfiguration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfiguration Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VpnServerConfigurationInner createOrUpdate(
        String resourceGroupName,
        String vpnServerConfigurationName,
        VpnServerConfigurationInner vpnServerConfigurationParameters);

    /**
     * Creates a VpnServerConfiguration resource if it doesn't exist else updates the existing VpnServerConfiguration.
     *
     * @param resourceGroupName The resource group name of the VpnServerConfiguration.
     * @param vpnServerConfigurationName The name of the VpnServerConfiguration being created or updated.
     * @param vpnServerConfigurationParameters Parameters supplied to create or update VpnServerConfiguration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfiguration Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VpnServerConfigurationInner createOrUpdate(
        String resourceGroupName,
        String vpnServerConfigurationName,
        VpnServerConfigurationInner vpnServerConfigurationParameters,
        Context context);

    /**
     * Updates VpnServerConfiguration tags.
     *
     * @param resourceGroupName The resource group name of the VpnServerConfiguration.
     * @param vpnServerConfigurationName The name of the VpnServerConfiguration being updated.
     * @param vpnServerConfigurationParameters Parameters supplied to update VpnServerConfiguration tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfiguration Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VpnServerConfigurationInner updateTags(
        String resourceGroupName, String vpnServerConfigurationName, TagsObject vpnServerConfigurationParameters);

    /**
     * Updates VpnServerConfiguration tags.
     *
     * @param resourceGroupName The resource group name of the VpnServerConfiguration.
     * @param vpnServerConfigurationName The name of the VpnServerConfiguration being updated.
     * @param vpnServerConfigurationParameters Parameters supplied to update VpnServerConfiguration tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnServerConfiguration Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VpnServerConfigurationInner> updateTagsWithResponse(
        String resourceGroupName,
        String vpnServerConfigurationName,
        TagsObject vpnServerConfigurationParameters,
        Context context);

    /**
     * Deletes a VpnServerConfiguration.
     *
     * @param resourceGroupName The resource group name of the VpnServerConfiguration.
     * @param vpnServerConfigurationName The name of the VpnServerConfiguration being deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String vpnServerConfigurationName);

    /**
     * Deletes a VpnServerConfiguration.
     *
     * @param resourceGroupName The resource group name of the VpnServerConfiguration.
     * @param vpnServerConfigurationName The name of the VpnServerConfiguration being deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String vpnServerConfigurationName, Context context);

    /**
     * Deletes a VpnServerConfiguration.
     *
     * @param resourceGroupName The resource group name of the VpnServerConfiguration.
     * @param vpnServerConfigurationName The name of the VpnServerConfiguration being deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String vpnServerConfigurationName);

    /**
     * Deletes a VpnServerConfiguration.
     *
     * @param resourceGroupName The resource group name of the VpnServerConfiguration.
     * @param vpnServerConfigurationName The name of the VpnServerConfiguration being deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String vpnServerConfigurationName, Context context);

    /**
     * Lists all the vpnServerConfigurations in a resource group.
     *
     * @param resourceGroupName The resource group name of the VpnServerConfiguration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list all VpnServerConfigurations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VpnServerConfigurationInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the vpnServerConfigurations in a resource group.
     *
     * @param resourceGroupName The resource group name of the VpnServerConfiguration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list all VpnServerConfigurations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VpnServerConfigurationInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all the VpnServerConfigurations in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list all VpnServerConfigurations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VpnServerConfigurationInner> list();

    /**
     * Lists all the VpnServerConfigurations in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list all VpnServerConfigurations.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VpnServerConfigurationInner> list(Context context);
}
