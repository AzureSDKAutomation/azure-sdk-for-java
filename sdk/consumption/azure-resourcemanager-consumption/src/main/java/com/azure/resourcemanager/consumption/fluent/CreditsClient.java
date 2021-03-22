// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.consumption.fluent.models.CreditSummaryInner;

/** An instance of this class provides access to all the operations defined in CreditsClient. */
public interface CreditsClient {
    /**
     * The credit summary by billingAccountId and billingProfileId.
     *
     * @param billingAccountId BillingAccount ID.
     * @param billingProfileId Azure Billing Profile ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a credit summary resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CreditSummaryInner get(String billingAccountId, String billingProfileId);

    /**
     * The credit summary by billingAccountId and billingProfileId.
     *
     * @param billingAccountId BillingAccount ID.
     * @param billingProfileId Azure Billing Profile ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a credit summary resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CreditSummaryInner> getWithResponse(String billingAccountId, String billingProfileId, Context context);
}
