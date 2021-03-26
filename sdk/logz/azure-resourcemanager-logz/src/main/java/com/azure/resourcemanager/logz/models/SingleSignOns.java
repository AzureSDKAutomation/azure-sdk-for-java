// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of SingleSignOns. */
public interface SingleSignOns {
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
    PagedIterable<LogzSingleSignOnResource> list(String resourceGroupName, String monitorName);

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
    PagedIterable<LogzSingleSignOnResource> list(String resourceGroupName, String monitorName, Context context);

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
    LogzSingleSignOnResource get(String resourceGroupName, String monitorName, String configurationName);

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
    Response<LogzSingleSignOnResource> getWithResponse(
        String resourceGroupName, String monitorName, String configurationName, Context context);

    /**
     * Gets the Logz single sign-on resource for the given Monitor.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Logz single sign-on resource for the given Monitor.
     */
    LogzSingleSignOnResource getById(String id);

    /**
     * Gets the Logz single sign-on resource for the given Monitor.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Logz single sign-on resource for the given Monitor.
     */
    Response<LogzSingleSignOnResource> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new LogzSingleSignOnResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new LogzSingleSignOnResource definition.
     */
    LogzSingleSignOnResource.DefinitionStages.Blank define(String name);
}
