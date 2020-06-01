/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2020_05_01;

import rx.Observable;
import com.microsoft.azure.management.billing.v2020_05_01.implementation.InvoicesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Invoices.
 */
public interface Invoices extends HasInner<InvoicesInner> {
    /**
     * Lists the invoices for a billing profile for a given start date and end date. The operation is supported for billing accounts with agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param periodStartDate The start date to fetch the invoices. The date should be specified in MM-DD-YYYY format.
     * @param periodEndDate The end date to fetch the invoices. The date should be specified in MM-DD-YYYY format.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Invoice> listByBillingProfileAsync(final String billingAccountName, final String billingProfileName, final String periodStartDate, final String periodEndDate);

    /**
     * Gets an invoice by ID. The operation is supported for billing accounts with agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.
     *
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Invoice> getByIdAsync(String invoiceName);

    /**
     * Gets a URL to download an invoice. The operation is supported for billing accounts with agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DownloadUrl> downloadInvoiceAsync(String billingAccountName, String invoiceName);

    /**
     * Lists the invoices for a subscription.
     *
     * @param periodStartDate Invoice period start date.
     * @param periodEndDate Invoice period end date.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Invoice> listByBillingSubscriptionAsync(final String periodStartDate, final String periodEndDate);

    /**
     * Gets an invoice by subscription ID and invoice ID.
     *
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Invoice> getBySubscriptionAndInvoiceIdAsync(String invoiceName);

    /**
     * Gets a URL to download an invoice.
     *
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @param downloadToken Download token with document source and document ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DownloadUrl> downloadBillingSubscriptionInvoiceAsync(String invoiceName, String downloadToken);

    /**
     * Gets an invoice by billing account name and ID. The operation is supported for billing accounts with agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Invoice> getAsync(String billingAccountName, String invoiceName);

    /**
     * Lists the invoices for a billing account for a given start date and end date. The operation is supported for billing accounts with agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param periodStartDate The start date to fetch the invoices. The date should be specified in MM-DD-YYYY format.
     * @param periodEndDate The end date to fetch the invoices. The date should be specified in MM-DD-YYYY format.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Invoice> listByBillingAccountAsync(final String billingAccountName, final String periodStartDate, final String periodEndDate);

}
