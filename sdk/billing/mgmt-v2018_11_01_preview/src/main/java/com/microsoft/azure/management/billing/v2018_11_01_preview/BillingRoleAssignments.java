/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview;

import rx.Completable;
import rx.Observable;

/**
 * Type representing BillingRoleAssignments.
 */
public interface BillingRoleAssignments {
    /**
     * Get the role assignment for the caller.
     *
     * @param billingAccountName Billing Account Id.
     * @param billingRoleAssignmentName role assignment id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleAssignment> getByBillingAccountAsync(String billingAccountName, String billingRoleAssignmentName);

    /**
     * Delete the role assignment on this billing account.
     *
     * @param billingAccountName Billing Account Id.
     * @param billingRoleAssignmentName role assignment id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleAssignment> deleteByBillingAccountNameAsync(String billingAccountName, String billingRoleAssignmentName);

    /**
     * Get the role assignment for the caller on the invoice Section.
     *
     * @param billingAccountName Billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @param billingRoleAssignmentName role assignment id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleAssignment> getByInvoiceSectionNameAsync(String billingAccountName, String invoiceSectionName, String billingRoleAssignmentName);

    /**
     * Delete the role assignment on the invoice Section.
     *
     * @param billingAccountName Billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @param billingRoleAssignmentName role assignment id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleAssignment> deleteByInvoiceSectionNameAsync(String billingAccountName, String invoiceSectionName, String billingRoleAssignmentName);

    /**
     * Get the role assignment for the caller on the Billing Profile.
     *
     * @param billingAccountName Billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param billingRoleAssignmentName role assignment id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleAssignment> getByBillingProfileNameAsync(String billingAccountName, String billingProfileName, String billingRoleAssignmentName);

    /**
     * Delete the role assignment on this Billing Profile.
     *
     * @param billingAccountName Billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param billingRoleAssignmentName role assignment id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleAssignment> deleteByBillingProfileNameAsync(String billingAccountName, String billingProfileName, String billingRoleAssignmentName);

    /**
     * Get the role assignments on the Billing Account.
     *
     * @param billingAccountName Billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleAssignmentListResult> listByBillingAccountNameAsync(String billingAccountName);

    /**
     * Get the role assignments on the invoice Section.
     *
     * @param billingAccountName Billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleAssignmentListResult> listByInvoiceSectionNameAsync(String billingAccountName, String invoiceSectionName);

    /**
     * Get the role assignments on the Billing Profile.
     *
     * @param billingAccountName Billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleAssignmentListResult> listByBillingProfileNameAsync(String billingAccountName, String billingProfileName);

    /**
     * The operation to add a role assignment to a billing account.
     *
     * @param billingAccountName Billing Account Id.
     * @param parameters Parameters supplied to add a role assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleAssignmentListResult> addByBillingAccountNameAsync(String billingAccountName, BillingRoleAssignmentPayload parameters);

    /**
     * The operation to add a role assignment to a invoice Section.
     *
     * @param billingAccountName Billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @param parameters Parameters supplied to add a role assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleAssignmentListResult> addByInvoiceSectionNameAsync(String billingAccountName, String invoiceSectionName, BillingRoleAssignmentPayload parameters);

    /**
     * The operation to add a role assignment to a billing profile.
     *
     * @param billingAccountName Billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param parameters Parameters supplied to add a role assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleAssignmentListResult> addByBillingProfileNameAsync(String billingAccountName, String billingProfileName, BillingRoleAssignmentPayload parameters);

}
