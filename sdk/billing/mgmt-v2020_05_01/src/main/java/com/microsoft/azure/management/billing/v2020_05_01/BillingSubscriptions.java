/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2020_05_01;

import rx.Observable;
import com.microsoft.azure.management.billing.v2020_05_01.implementation.BillingSubscriptionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing BillingSubscriptions.
 */
public interface BillingSubscriptions extends HasInner<BillingSubscriptionsInner> {
    /**
     * Lists the subscriptions for a billing account. The operation is supported for billing accounts with agreement type Microsoft Customer Agreement or Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingSubscription> listByBillingAccountAsync(final String billingAccountName);

    /**
     * Lists the subscriptions that are billed to a billing profile. The operation is supported for billing accounts with agreement type Microsoft Customer Agreement or Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingSubscription> listByBillingProfileAsync(final String billingAccountName, final String billingProfileName);

    /**
     * Lists the subscriptions that are billed to an invoice section. The operation is supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingSubscription> listByInvoiceSectionAsync(final String billingAccountName, final String billingProfileName, final String invoiceSectionName);

    /**
     * Gets a subscription by its ID. The operation is supported for billing accounts with agreement type Microsoft Customer Agreement and Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingSubscription> getAsync(String billingAccountName);

    /**
     * Moves a subscription's charges to a new invoice section. The new invoice section must belong to the same billing profile as the existing invoice section. This operation is supported for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param destinationInvoiceSectionId The destination invoice section id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingSubscription> moveAsync(String billingAccountName, String destinationInvoiceSectionId);

    /**
     * Validates if a subscription's charges can be moved to a new invoice section. This operation is supported for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param destinationInvoiceSectionId The destination invoice section id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ValidateSubscriptionTransferEligibilityResult> validateMoveAsync(String billingAccountName, String destinationInvoiceSectionId);

    /**
     * Lists the subscriptions for a customer. The operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingSubscription> listByCustomerAsync(final String billingAccountName, final String customerName);

}
