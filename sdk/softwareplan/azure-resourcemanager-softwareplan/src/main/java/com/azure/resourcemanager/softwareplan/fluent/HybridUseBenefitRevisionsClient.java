// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.softwareplan.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.softwareplan.fluent.models.HybridUseBenefitModelInner;

/** An instance of this class provides access to all the operations defined in HybridUseBenefitRevisionsClient. */
public interface HybridUseBenefitRevisionsClient {
    /**
     * Gets the version history of a hybrid use benefit.
     *
     * @param scope The scope at which the operation is performed. This is limited to Microsoft.Compute/virtualMachines
     *     and Microsoft.Compute/hostGroups/hosts for now.
     * @param planId This is a unique identifier for a plan. Should be a guid.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the version history of a hybrid use benefit.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<HybridUseBenefitModelInner> list(String scope, String planId);

    /**
     * Gets the version history of a hybrid use benefit.
     *
     * @param scope The scope at which the operation is performed. This is limited to Microsoft.Compute/virtualMachines
     *     and Microsoft.Compute/hostGroups/hosts for now.
     * @param planId This is a unique identifier for a plan. Should be a guid.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the version history of a hybrid use benefit.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<HybridUseBenefitModelInner> list(String scope, String planId, Context context);

    /**
     * Gets the version history of a hybrid use benefit.
     *
     * @param scope The scope at which the operation is performed. This is limited to Microsoft.Compute/virtualMachines
     *     and Microsoft.Compute/hostGroups/hosts for now.
     * @param planId This is a unique identifier for a plan. Should be a guid.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the version history of a hybrid use benefit.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<HybridUseBenefitModelInner> list(String scope, String planId);

    /**
     * Gets the version history of a hybrid use benefit.
     *
     * @param scope The scope at which the operation is performed. This is limited to Microsoft.Compute/virtualMachines
     *     and Microsoft.Compute/hostGroups/hosts for now.
     * @param planId This is a unique identifier for a plan. Should be a guid.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the version history of a hybrid use benefit.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<HybridUseBenefitModelInner> list(String scope, String planId, Context context);

    /**
     * Gets the version history of a hybrid use benefit.
     *
     * @param scope The scope at which the operation is performed. This is limited to Microsoft.Compute/virtualMachines
     *     and Microsoft.Compute/hostGroups/hosts for now.
     * @param planId This is a unique identifier for a plan. Should be a guid.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the version history of a hybrid use benefit.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<HybridUseBenefitModelInner> list(String scope, String planId);

    /**
     * Gets the version history of a hybrid use benefit.
     *
     * @param scope The scope at which the operation is performed. This is limited to Microsoft.Compute/virtualMachines
     *     and Microsoft.Compute/hostGroups/hosts for now.
     * @param planId This is a unique identifier for a plan. Should be a guid.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the version history of a hybrid use benefit.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<HybridUseBenefitModelInner> list(String scope, String planId, Context context);
}
