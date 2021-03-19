// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.consumption.fluent.models.EventSummaryInner;

/** An instance of this class provides access to all the operations defined in EventsOperationsClient. */
public interface EventsOperationsClient {
    /**
     * Lists the events by billingAccountId and billingProfileId for given start and end date.
     *
     * @param billingAccountId BillingAccount ID.
     * @param billingProfileId Azure Billing Profile ID.
     * @param startDate Start date.
     * @param endDate End date.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing event summary.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EventSummaryInner> list(
        String billingAccountId, String billingProfileId, String startDate, String endDate);

    /**
     * Lists the events by billingAccountId and billingProfileId for given start and end date.
     *
     * @param billingAccountId BillingAccount ID.
     * @param billingProfileId Azure Billing Profile ID.
     * @param startDate Start date.
     * @param endDate End date.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing event summary.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EventSummaryInner> list(
        String billingAccountId, String billingProfileId, String startDate, String endDate, Context context);
}
