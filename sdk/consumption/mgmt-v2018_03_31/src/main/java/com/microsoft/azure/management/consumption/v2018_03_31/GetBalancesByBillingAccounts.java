/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_03_31;

import rx.Observable;

/**
 * Type representing GetBalancesByBillingAccounts.
 */
public interface GetBalancesByBillingAccounts {
    /**
     * Gets the balances for a scope by billing period and billingAccountId. Balances are available via this API only for May 1, 2014 or later.
     *
     * @param billingAccountId BillingAccount ID
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Balance> byBillingPeriodAsync(String billingAccountId, String billingPeriodName);

}
