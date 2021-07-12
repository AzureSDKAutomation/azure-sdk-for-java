// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.logz.fluent.models.LogzSingleSignOnResourceInner;

/** An instance of this class provides access to all the operations defined in SingleSignOnsClient. */
public interface SingleSignOnsClient {
    /**
     * List the single sign-on configurations for a given monitor resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of a list operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LogzSingleSignOnResourceInner> list(String resourceGroupName, String monitorName);

    /**
     * List the single sign-on configurations for a given monitor resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of a list operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LogzSingleSignOnResourceInner> list(String resourceGroupName, String monitorName, Context context);

    /**
     * Configures single-sign-on for this resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param configurationName The configurationName parameter.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<LogzSingleSignOnResourceInner>, LogzSingleSignOnResourceInner> beginCreateOrUpdate(
        String resourceGroupName, String monitorName, String configurationName, LogzSingleSignOnResourceInner body);

    /**
     * Configures single-sign-on for this resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param configurationName The configurationName parameter.
     * @param body The body parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<LogzSingleSignOnResourceInner>, LogzSingleSignOnResourceInner> beginCreateOrUpdate(
        String resourceGroupName,
        String monitorName,
        String configurationName,
        LogzSingleSignOnResourceInner body,
        Context context);

    /**
     * Configures single-sign-on for this resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param configurationName The configurationName parameter.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LogzSingleSignOnResourceInner createOrUpdate(
        String resourceGroupName, String monitorName, String configurationName, LogzSingleSignOnResourceInner body);

    /**
     * Configures single-sign-on for this resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param configurationName The configurationName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LogzSingleSignOnResourceInner createOrUpdate(
        String resourceGroupName, String monitorName, String configurationName);

    /**
     * Configures single-sign-on for this resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param configurationName The configurationName parameter.
     * @param body The body parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LogzSingleSignOnResourceInner createOrUpdate(
        String resourceGroupName,
        String monitorName,
        String configurationName,
        LogzSingleSignOnResourceInner body,
        Context context);

    /**
     * Gets the Logz single sign-on resource for the given Monitor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param configurationName The configurationName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Logz single sign-on resource for the given Monitor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LogzSingleSignOnResourceInner get(String resourceGroupName, String monitorName, String configurationName);

    /**
     * Gets the Logz single sign-on resource for the given Monitor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param monitorName Monitor resource name.
     * @param configurationName The configurationName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Logz single sign-on resource for the given Monitor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LogzSingleSignOnResourceInner> getWithResponse(
        String resourceGroupName, String monitorName, String configurationName, Context context);
}
