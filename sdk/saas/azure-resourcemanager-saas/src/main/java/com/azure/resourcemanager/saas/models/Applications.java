// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.saas.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of Applications. */
public interface Applications {
    /**
     * Gets all SaaS resources by subscription id and resource group name.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all SaaS resources by subscription id and resource group name.
     */
    PagedIterable<SaasApp> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all SaaS resources by subscription id and resource group name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all SaaS resources by subscription id and resource group name.
     */
    PagedIterable<SaasApp> listByResourceGroup(String resourceGroupName, Context context);
}
