// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of OperationResults. */
public interface OperationResults {
    /**
     * Gets the operation result for a resource.
     *
     * @param operationId The operationId parameter.
     * @param location The location parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation result for a resource.
     */
    OperationJobExtendedInfo get(String operationId, String location);

    /**
     * Gets the operation result for a resource.
     *
     * @param operationId The operationId parameter.
     * @param location The location parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation result for a resource.
     */
    Response<OperationJobExtendedInfo> getWithResponse(String operationId, String location, Context context);
}
