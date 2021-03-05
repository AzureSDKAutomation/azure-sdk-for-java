// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.devtestlabs.fluent.models.ScheduleInner;
import com.azure.resourcemanager.devtestlabs.models.UpdateResource;

/** An instance of this class provides access to all the operations defined in SchedulesClient. */
public interface SchedulesClient {
    /**
     * List schedules in a given lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ScheduleInner> list(String resourceGroupName, String labName);

    /**
     * List schedules in a given lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param expand Specify the $expand query. Example: 'properties($select=status)'.
     * @param filter The filter to apply to the operation. Example: '$filter=contains(name,'myName').
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param orderby The ordering expression for the results, using OData notation. Example: '$orderby=name desc'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ScheduleInner> list(
        String resourceGroupName,
        String labName,
        String expand,
        String filter,
        Integer top,
        String orderby,
        Context context);

    /**
     * Get schedule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the schedule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return schedule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ScheduleInner get(String resourceGroupName, String labName, String name);

    /**
     * Get schedule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the schedule.
     * @param expand Specify the $expand query. Example: 'properties($select=status)'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return schedule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ScheduleInner> getWithResponse(
        String resourceGroupName, String labName, String name, String expand, Context context);

    /**
     * Create or replace an existing schedule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the schedule.
     * @param schedule A schedule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a schedule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ScheduleInner createOrUpdate(String resourceGroupName, String labName, String name, ScheduleInner schedule);

    /**
     * Create or replace an existing schedule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the schedule.
     * @param schedule A schedule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a schedule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ScheduleInner> createOrUpdateWithResponse(
        String resourceGroupName, String labName, String name, ScheduleInner schedule, Context context);

    /**
     * Delete schedule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the schedule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String labName, String name);

    /**
     * Delete schedule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the schedule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String labName, String name, Context context);

    /**
     * Allows modifying tags of schedules. All other properties will be ignored.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the schedule.
     * @param schedule A schedule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a schedule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ScheduleInner update(String resourceGroupName, String labName, String name, UpdateResource schedule);

    /**
     * Allows modifying tags of schedules. All other properties will be ignored.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the schedule.
     * @param schedule A schedule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a schedule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ScheduleInner> updateWithResponse(
        String resourceGroupName, String labName, String name, UpdateResource schedule, Context context);

    /**
     * Execute a schedule. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the schedule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginExecute(String resourceGroupName, String labName, String name);

    /**
     * Execute a schedule. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the schedule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginExecute(
        String resourceGroupName, String labName, String name, Context context);

    /**
     * Execute a schedule. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the schedule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void execute(String resourceGroupName, String labName, String name);

    /**
     * Execute a schedule. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the schedule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void execute(String resourceGroupName, String labName, String name, Context context);

    /**
     * Lists all applicable schedules.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the schedule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ScheduleInner> listApplicable(String resourceGroupName, String labName, String name);

    /**
     * Lists all applicable schedules.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the schedule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ScheduleInner> listApplicable(String resourceGroupName, String labName, String name, Context context);
}
