// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.dataprotection.fluent.models.OperationResourceInner;

/** An instance of this class provides access to all the operations defined in OperationStatusClient. */
public interface OperationStatusClient {
    /**
     * Gets the operation status for a resource.
     *
     * @param location The location parameter.
     * @param operationId The operationId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation status for a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationResourceInner get(String location, String operationId);

    /**
     * Gets the operation status for a resource.
     *
     * @param location The location parameter.
     * @param operationId The operationId parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation status for a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OperationResourceInner> getWithResponse(String location, String operationId, Context context);
}
