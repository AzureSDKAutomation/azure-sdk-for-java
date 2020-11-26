/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview;

import rx.Observable;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.BillingPermissionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing BillingPermissions.
 */
public interface BillingPermissions extends HasInner<BillingPermissionsInner> {
    /**
     * Lists all billing permissions for the caller under a billing account.
     *
     * @param billingAccountName Billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingPermissionsListResult> listByBillingAccountAsync(String billingAccountName);

    /**
     * Lists all billing permissions for the caller under customer.
     *
     * @param billingAccountName Billing Account Id.
     * @param customerName Customer Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingPermissionsListResult> listByCustomersAsync(String billingAccountName, String customerName);

    /**
     * Lists all billing permissions for the caller under invoice section.
     *
     * @param billingAccountName Billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingPermissionsListResult> listByInvoiceSectionsAsync(String billingAccountName, String invoiceSectionName);

    /**
     * Lists all billingPermissions for the caller has for a billing account.
     *
     * @param billingAccountName Billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingPermissionsListResult> listByBillingProfileAsync(String billingAccountName, String billingProfileName);

}
