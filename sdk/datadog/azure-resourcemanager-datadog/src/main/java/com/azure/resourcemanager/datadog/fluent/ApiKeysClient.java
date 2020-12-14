// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.datadog.fluent.models.DatadogApiKeyInner;

/** An instance of this class provides access to all the operations defined in ApiKeysClient. */
public interface ApiKeysClient {
    /**
     * List the api keys for a given monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of a list operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DatadogApiKeyInner> list(String resourceGroupName, String monitorName);

    /**
     * List the api keys for a given monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param monitorName Monitor resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of a list operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DatadogApiKeyInner> list(String resourceGroupName, String monitorName, Context context);

    /**
     * Get the default api key.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default api key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DatadogApiKeyInner getDefaultKey(String resourceGroupName, String monitorName);

    /**
     * Get the default api key.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param monitorName Monitor resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default api key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DatadogApiKeyInner> getDefaultKeyWithResponse(
        String resourceGroupName, String monitorName, Context context);

    /**
     * Set the default api key.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void setDefaultKey(String resourceGroupName, String monitorName);

    /**
     * Set the default api key.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param monitorName Monitor resource name.
     * @param body The body parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> setDefaultKeyWithResponse(
        String resourceGroupName, String monitorName, DatadogApiKeyInner body, Context context);
}
