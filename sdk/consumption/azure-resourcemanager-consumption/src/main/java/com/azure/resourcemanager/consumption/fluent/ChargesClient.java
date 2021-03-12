// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.consumption.fluent.models.ChargesListResultInner;

/** An instance of this class provides access to all the operations defined in ChargesClient. */
public interface ChargesClient {
    /**
     * Lists the charges based for the defined scope.
     *
     * @param scope The scope associated with charges operations. This includes
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     *     scope, and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     *     for EnrollmentAccount scope. For department and enrollment accounts, you can also add billing period to the
     *     scope using '/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}'. For e.g. to specify billing
     *     period at department scope use
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}'.
     *     Also, Modern Commerce Account scopes are '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}'
     *     for billingAccount scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}/invoiceSections/{invoiceSectionId}'
     *     for invoiceSection scope, and
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for
     *     partners.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing charge summary.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ChargesListResultInner list(String scope);

    /**
     * Lists the charges based for the defined scope.
     *
     * @param scope The scope associated with charges operations. This includes
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department
     *     scope, and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}'
     *     for EnrollmentAccount scope. For department and enrollment accounts, you can also add billing period to the
     *     scope using '/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}'. For e.g. to specify billing
     *     period at department scope use
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}'.
     *     Also, Modern Commerce Account scopes are '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}'
     *     for billingAccount scope,
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope,
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}/invoiceSections/{invoiceSectionId}'
     *     for invoiceSection scope, and
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for
     *     partners.
     * @param startDate Start date.
     * @param endDate End date.
     * @param filter May be used to filter charges by properties/usageEnd (Utc time), properties/usageStart (Utc time).
     *     The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or
     *     'not'. Tag filter is a key value pair string where key and value is separated by a colon (:).
     * @param apply May be used to group charges for billingAccount scope by properties/billingProfileId,
     *     properties/invoiceSectionId, properties/customerId (specific for Partner Led), or for billingProfile scope by
     *     properties/invoiceSectionId.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing charge summary.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ChargesListResultInner> listWithResponse(
        String scope, String startDate, String endDate, String filter, String apply, Context context);
}
