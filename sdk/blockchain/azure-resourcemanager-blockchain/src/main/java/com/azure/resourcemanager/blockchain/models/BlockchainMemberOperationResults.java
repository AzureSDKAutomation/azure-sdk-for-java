// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.blockchain.models;

import com.azure.core.util.Context;

/** Resource collection API of BlockchainMemberOperationResults. */
public interface BlockchainMemberOperationResults {
    /**
     * Get Async operation result.
     *
     * @param locationName Location name.
     * @param operationId Operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return async operation result.
     */
    OperationResult get(String locationName, String operationId);

    /**
     * Get Async operation result.
     *
     * @param locationName Location name.
     * @param operationId Operation Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return async operation result.
     */
    OperationResult get(String locationName, String operationId, Context context);
}
