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
 * Type representing BillingPermissions.
 */
public interface BillingPermissions {
    /**
     * Lists the billing permissions the caller has for a customer.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingPermissionsListResult> listByCustomerAsync(String billingAccountName, String customerName);

    /**
     * Lists the billing permissions the caller has on a billing account.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingPermissionsListResult> listByBillingAccountAsync(String billingAccountName);

    /**
     * Lists the billing permissions the caller has on an invoice section.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingPermissionsListResult> listByInvoiceSectionsAsync(String billingAccountName, String billingProfileName, String invoiceSectionName);

    /**
     * Lists the billing permissions the caller has on a billing profile.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingPermissionsListResult> listByBillingProfileAsync(String billingAccountName, String billingProfileName);

}
