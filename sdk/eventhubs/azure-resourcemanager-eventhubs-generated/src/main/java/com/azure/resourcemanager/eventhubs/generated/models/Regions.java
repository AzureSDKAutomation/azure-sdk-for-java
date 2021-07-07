// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of Regions. */
public interface Regions {
    /**
     * Gets the available Regions for a given sku.
     *
     * @param sku The sku type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the available Regions for a given sku.
     */
    PagedIterable<MessagingRegions> listBySku(String sku);

    /**
     * Gets the available Regions for a given sku.
     *
     * @param sku The sku type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the available Regions for a given sku.
     */
    PagedIterable<MessagingRegions> listBySku(String sku, Context context);
}
