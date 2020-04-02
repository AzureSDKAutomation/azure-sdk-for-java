/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import rx.Observable;

/**
 * Type representing BillingSubscriptionInvoices.
 */
public interface BillingSubscriptionInvoices {
    /**
     * Gets an invoice by ID.
     *
     * @param billingSubscriptionName The ID that uniquely identifies a subscription.
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingSubscriptionBillingAccountInvoice> getByIdAsync(String billingSubscriptionName, String invoiceName);

    /**
     * Gets a URL to download an invoice.
     *
     * @param billingSubscriptionName The ID that uniquely identifies a subscription.
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DownloadUrl> downloadAsync(String billingSubscriptionName, String invoiceName);

}
