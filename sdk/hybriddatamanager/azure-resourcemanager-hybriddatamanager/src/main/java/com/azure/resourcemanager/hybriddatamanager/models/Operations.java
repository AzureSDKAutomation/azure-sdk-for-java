// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybriddatamanager.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of Operations. */
public interface Operations {
    /**
     * The list of operations for Microsoft.HybridData provider.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class for set of operations used for discovery of available provider operations.
     */
    PagedIterable<AvailableProviderOperation> list();

    /**
     * The list of operations for Microsoft.HybridData provider.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class for set of operations used for discovery of available provider operations.
     */
    PagedIterable<AvailableProviderOperation> list(Context context);
}
