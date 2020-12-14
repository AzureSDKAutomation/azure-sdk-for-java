// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.adp.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.adp.fluent.models.AccountInner;
import com.azure.resourcemanager.adp.models.AccountPatch;

/** An instance of this class provides access to all the operations defined in AccountsClient. */
public interface AccountsClient {
    /**
     * List all ADP accounts available under the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list operation response, that contains the data pools and their properties.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AccountInner> list();

    /**
     * List all ADP accounts available under the subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list operation response, that contains the data pools and their properties.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AccountInner> list(Context context);

    /**
     * List all ADP accounts available under the resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list operation response, that contains the data pools and their properties.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AccountInner> listByResourceGroup(String resourceGroupName);

    /**
     * List all ADP accounts available under the resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list operation response, that contains the data pools and their properties.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AccountInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets the properties of an ADP account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the ADP account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of an ADP account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccountInner getByResourceGroup(String resourceGroupName, String accountName);

    /**
     * Gets the properties of an ADP account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the ADP account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of an ADP account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AccountInner> getByResourceGroupWithResponse(
        String resourceGroupName, String accountName, Context context);

    /**
     * Updates the properties of an existing ADP account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the ADP account.
     * @param parameters An ADP account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an ADP account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<AccountInner>, AccountInner> beginUpdate(
        String resourceGroupName, String accountName, AccountPatch parameters);

    /**
     * Updates the properties of an existing ADP account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the ADP account.
     * @param parameters An ADP account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an ADP account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<AccountInner>, AccountInner> beginUpdate(
        String resourceGroupName, String accountName, AccountPatch parameters, Context context);

    /**
     * Updates the properties of an existing ADP account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the ADP account.
     * @param parameters An ADP account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an ADP account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccountInner update(String resourceGroupName, String accountName, AccountPatch parameters);

    /**
     * Updates the properties of an existing ADP account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the ADP account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an ADP account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccountInner update(String resourceGroupName, String accountName);

    /**
     * Updates the properties of an existing ADP account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the ADP account.
     * @param parameters An ADP account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an ADP account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccountInner update(String resourceGroupName, String accountName, AccountPatch parameters, Context context);

    /**
     * Creates or updates an ADP account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the ADP account.
     * @param parameters An ADP account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an ADP account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<AccountInner>, AccountInner> beginCreateOrUpdate(
        String resourceGroupName, String accountName, AccountInner parameters);

    /**
     * Creates or updates an ADP account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the ADP account.
     * @param parameters An ADP account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an ADP account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<AccountInner>, AccountInner> beginCreateOrUpdate(
        String resourceGroupName, String accountName, AccountInner parameters, Context context);

    /**
     * Creates or updates an ADP account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the ADP account.
     * @param parameters An ADP account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an ADP account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccountInner createOrUpdate(String resourceGroupName, String accountName, AccountInner parameters);

    /**
     * Creates or updates an ADP account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the ADP account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an ADP account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccountInner createOrUpdate(String resourceGroupName, String accountName);

    /**
     * Creates or updates an ADP account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the ADP account.
     * @param parameters An ADP account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an ADP account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccountInner createOrUpdate(String resourceGroupName, String accountName, AccountInner parameters, Context context);

    /**
     * Deletes an ADP account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the ADP account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String accountName);

    /**
     * Deletes an ADP account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the ADP account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String accountName, Context context);

    /**
     * Deletes an ADP account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the ADP account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName);

    /**
     * Deletes an ADP account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the ADP account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, Context context);
}
