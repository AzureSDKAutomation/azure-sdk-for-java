/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import rx.Observable;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.ProductsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Products.
 */
public interface Products extends HasInner<ProductsInner> {
    /**
     * Lists products by customer id.
     *
     * @param billingAccountName billing Account Id.
     * @param customerName Customer name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ProductsListResult> listByCustomerAsync(String billingAccountName, String customerName);

    /**
     * Lists products by billing account name.
     *
     * @param billingAccountName billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Product> listByBillingAccountAsync(final String billingAccountName);

    /**
     * Lists products by invoice section name.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ProductsListResult> listByInvoiceSectionAsync(String billingAccountName, String billingProfileName, String invoiceSectionName);

    /**
     * Get a single product by name.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @param productName Invoice Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Product> getAsync(String billingAccountName, String billingProfileName, String invoiceSectionName, String productName);

    /**
     * The operation to transfer a Product to another invoice section.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @param productName Invoice Id.
     * @param parameters Parameters supplied to the Transfer Product operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Product> transferAsync(String billingAccountName, String billingProfileName, String invoiceSectionName, String productName, TransferProductRequestProperties parameters);

    /**
     * Validates the transfer of products across invoice sections.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @param productName Invoice Id.
     * @param parameters Parameters supplied to the Transfer Products operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ValidateProductTransferEligibilityResult> validateTransferAsync(String billingAccountName, String billingProfileName, String invoiceSectionName, String productName, TransferProductRequestProperties parameters);

    /**
     * Cancel auto renew for product by product id and invoice section name.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @param productName Invoice Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<UpdateAutoRenewOperation> updateAutoRenewByInvoiceSectionAsync(String billingAccountName, String billingProfileName, String invoiceSectionName, String productName);

    /**
     * Get a customer's product by name.
     *
     * @param billingAccountName billing Account Id.
     * @param customerName Customer name.
     * @param productName Invoice Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Product> getByCustomerAsync(String billingAccountName, String customerName, String productName);

}
