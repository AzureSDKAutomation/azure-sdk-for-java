// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of Operations. */
public interface Operations {
    /**
     * Lists all of the available Microsoft.Devices REST API operations.
     *
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list provisioning service operations.
     */
    PagedIterable<Operation> list();

    /**
     * Lists all of the available Microsoft.Devices REST API operations.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list provisioning service operations.
     */
    PagedIterable<Operation> list(Context context);
}
