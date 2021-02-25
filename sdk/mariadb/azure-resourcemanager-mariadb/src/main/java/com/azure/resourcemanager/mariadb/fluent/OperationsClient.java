// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mariadb.fluent.models.OperationListResultInner;

/** An instance of this class provides access to all the operations defined in OperationsClient. */
public interface OperationsClient {
    /**
     * Lists all of the available REST API operations.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of resource provider operations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationListResultInner list();

    /**
     * Lists all of the available REST API operations.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of resource provider operations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OperationListResultInner> listWithResponse(Context context);
}
