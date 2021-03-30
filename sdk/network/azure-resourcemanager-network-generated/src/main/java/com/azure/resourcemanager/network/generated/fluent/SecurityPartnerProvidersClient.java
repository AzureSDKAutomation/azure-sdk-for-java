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
import com.azure.resourcemanager.network.generated.fluent.models.SecurityPartnerProviderInner;
import com.azure.resourcemanager.network.generated.models.TagsObject;

/** An instance of this class provides access to all the operations defined in SecurityPartnerProvidersClient. */
public interface SecurityPartnerProvidersClient {
    /**
     * Deletes the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String securityPartnerProviderName);

    /**
     * Deletes the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String securityPartnerProviderName, Context context);

    /**
     * Deletes the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String securityPartnerProviderName);

    /**
     * Deletes the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String securityPartnerProviderName, Context context);

    /**
     * Gets the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Security Partner Provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecurityPartnerProviderInner getByResourceGroup(String resourceGroupName, String securityPartnerProviderName);

    /**
     * Gets the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Security Partner Provider.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SecurityPartnerProviderInner> getByResourceGroupWithResponse(
        String resourceGroupName, String securityPartnerProviderName, Context context);

    /**
     * Creates or updates the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @param parameters Parameters supplied to the create or update Security Partner Provider operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security Partner Provider resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<SecurityPartnerProviderInner>, SecurityPartnerProviderInner> beginCreateOrUpdate(
        String resourceGroupName, String securityPartnerProviderName, SecurityPartnerProviderInner parameters);

    /**
     * Creates or updates the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @param parameters Parameters supplied to the create or update Security Partner Provider operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security Partner Provider resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<SecurityPartnerProviderInner>, SecurityPartnerProviderInner> beginCreateOrUpdate(
        String resourceGroupName,
        String securityPartnerProviderName,
        SecurityPartnerProviderInner parameters,
        Context context);

    /**
     * Creates or updates the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @param parameters Parameters supplied to the create or update Security Partner Provider operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security Partner Provider resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecurityPartnerProviderInner createOrUpdate(
        String resourceGroupName, String securityPartnerProviderName, SecurityPartnerProviderInner parameters);

    /**
     * Creates or updates the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @param parameters Parameters supplied to the create or update Security Partner Provider operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security Partner Provider resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecurityPartnerProviderInner createOrUpdate(
        String resourceGroupName,
        String securityPartnerProviderName,
        SecurityPartnerProviderInner parameters,
        Context context);

    /**
     * Updates tags of a Security Partner Provider resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @param parameters Parameters supplied to update Security Partner Provider tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security Partner Provider resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecurityPartnerProviderInner updateTags(
        String resourceGroupName, String securityPartnerProviderName, TagsObject parameters);

    /**
     * Updates tags of a Security Partner Provider resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @param parameters Parameters supplied to update Security Partner Provider tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security Partner Provider resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SecurityPartnerProviderInner> updateTagsWithResponse(
        String resourceGroupName, String securityPartnerProviderName, TagsObject parameters, Context context);

    /**
     * Lists all Security Partner Providers in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListSecurityPartnerProviders API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SecurityPartnerProviderInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all Security Partner Providers in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListSecurityPartnerProviders API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SecurityPartnerProviderInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets all the Security Partner Providers in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Security Partner Providers in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SecurityPartnerProviderInner> list();

    /**
     * Gets all the Security Partner Providers in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Security Partner Providers in a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SecurityPartnerProviderInner> list(Context context);
}
