// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of EffectiveConfigurations. */
public interface EffectiveConfigurations {
    /**
     * List all configurations in a virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list networkManagerEffectiveConfiguration.
     */
    PagedIterable<EffectiveConfiguration> list(String resourceGroupName, String virtualNetworkName);

    /**
     * List all configurations in a virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param top An optional query parameter which specifies the maximum number of records to be returned by the
     *     server.
     * @param skipToken SkipToken is only used if a previous operation returned a partial result. If a previous response
     *     contains a nextLink element, the value of the nextLink element will include a skipToken parameter that
     *     specifies a starting point to use for subsequent calls.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list networkManagerEffectiveConfiguration.
     */
    PagedIterable<EffectiveConfiguration> list(
        String resourceGroupName, String virtualNetworkName, Integer top, String skipToken, Context context);
}
