// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.testbase.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.testbase.fluent.models.CustomerEventResourceInner;

/** An instance of this class provides access to all the operations defined in CustomerEventsClient. */
public interface CustomerEventsClient {
    /**
     * Lists all notification events subscribed under a Test Base Account.
     *
     * @param resourceGroupName The name of the resource group that contains the resource.
     * @param testBaseAccountName The resource name of the Test Base Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Test Base Customer Events.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CustomerEventResourceInner> listByTestBaseAccount(
        String resourceGroupName, String testBaseAccountName);

    /**
     * Lists all notification events subscribed under a Test Base Account.
     *
     * @param resourceGroupName The name of the resource group that contains the resource.
     * @param testBaseAccountName The resource name of the Test Base Account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Test Base Customer Events.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CustomerEventResourceInner> listByTestBaseAccount(
        String resourceGroupName, String testBaseAccountName, Context context);

    /**
     * Create or replace a Test Base Customer Event.
     *
     * @param resourceGroupName The name of the resource group that contains the resource.
     * @param testBaseAccountName The resource name of the Test Base Account.
     * @param customerEventName The resource name of the Test Base Customer event.
     * @param parameters Parameters supplied to create a Test Base CustomerEvent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Customer Notification Event resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<CustomerEventResourceInner>, CustomerEventResourceInner> beginCreate(
        String resourceGroupName,
        String testBaseAccountName,
        String customerEventName,
        CustomerEventResourceInner parameters);

    /**
     * Create or replace a Test Base Customer Event.
     *
     * @param resourceGroupName The name of the resource group that contains the resource.
     * @param testBaseAccountName The resource name of the Test Base Account.
     * @param customerEventName The resource name of the Test Base Customer event.
     * @param parameters Parameters supplied to create a Test Base CustomerEvent.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Customer Notification Event resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<CustomerEventResourceInner>, CustomerEventResourceInner> beginCreate(
        String resourceGroupName,
        String testBaseAccountName,
        String customerEventName,
        CustomerEventResourceInner parameters,
        Context context);

    /**
     * Create or replace a Test Base Customer Event.
     *
     * @param resourceGroupName The name of the resource group that contains the resource.
     * @param testBaseAccountName The resource name of the Test Base Account.
     * @param customerEventName The resource name of the Test Base Customer event.
     * @param parameters Parameters supplied to create a Test Base CustomerEvent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Customer Notification Event resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CustomerEventResourceInner create(
        String resourceGroupName,
        String testBaseAccountName,
        String customerEventName,
        CustomerEventResourceInner parameters);

    /**
     * Create or replace a Test Base Customer Event.
     *
     * @param resourceGroupName The name of the resource group that contains the resource.
     * @param testBaseAccountName The resource name of the Test Base Account.
     * @param customerEventName The resource name of the Test Base Customer event.
     * @param parameters Parameters supplied to create a Test Base CustomerEvent.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Customer Notification Event resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CustomerEventResourceInner create(
        String resourceGroupName,
        String testBaseAccountName,
        String customerEventName,
        CustomerEventResourceInner parameters,
        Context context);

    /**
     * Deletes a Test Base Customer Event.
     *
     * @param resourceGroupName The name of the resource group that contains the resource.
     * @param testBaseAccountName The resource name of the Test Base Account.
     * @param customerEventName The resource name of the Test Base Customer event.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String testBaseAccountName, String customerEventName);

    /**
     * Deletes a Test Base Customer Event.
     *
     * @param resourceGroupName The name of the resource group that contains the resource.
     * @param testBaseAccountName The resource name of the Test Base Account.
     * @param customerEventName The resource name of the Test Base Customer event.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String testBaseAccountName, String customerEventName, Context context);

    /**
     * Deletes a Test Base Customer Event.
     *
     * @param resourceGroupName The name of the resource group that contains the resource.
     * @param testBaseAccountName The resource name of the Test Base Account.
     * @param customerEventName The resource name of the Test Base Customer event.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String testBaseAccountName, String customerEventName);

    /**
     * Deletes a Test Base Customer Event.
     *
     * @param resourceGroupName The name of the resource group that contains the resource.
     * @param testBaseAccountName The resource name of the Test Base Account.
     * @param customerEventName The resource name of the Test Base Customer event.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String testBaseAccountName, String customerEventName, Context context);

    /**
     * Gets a Test Base CustomerEvent.
     *
     * @param resourceGroupName The name of the resource group that contains the resource.
     * @param testBaseAccountName The resource name of the Test Base Account.
     * @param customerEventName The resource name of the Test Base Customer event.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Test Base CustomerEvent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CustomerEventResourceInner get(String resourceGroupName, String testBaseAccountName, String customerEventName);

    /**
     * Gets a Test Base CustomerEvent.
     *
     * @param resourceGroupName The name of the resource group that contains the resource.
     * @param testBaseAccountName The resource name of the Test Base Account.
     * @param customerEventName The resource name of the Test Base Customer event.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Test Base CustomerEvent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CustomerEventResourceInner> getWithResponse(
        String resourceGroupName, String testBaseAccountName, String customerEventName, Context context);
}
