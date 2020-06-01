/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.BillingRoleAssignmentsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing BillingRoleAssignments.
 */
public interface BillingRoleAssignments extends HasInner<BillingRoleAssignmentsInner> {
    /**
     * Gets a role assignment for the caller on an invoice section. The operation is supported for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param billingRoleAssignmentName The ID that uniquely identifies a role assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleAssignment> getByInvoiceSectionAsync(String billingAccountName, String billingProfileName, String invoiceSectionName, String billingRoleAssignmentName);

    /**
     * Deletes a role assignment for the caller on an invoice section. The operation is supported for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param billingRoleAssignmentName The ID that uniquely identifies a role assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleAssignment> deleteByInvoiceSectionAsync(String billingAccountName, String billingProfileName, String invoiceSectionName, String billingRoleAssignmentName);

    /**
     * Gets a role assignment for the caller on a billing profile. The operation is supported for billing accounts with agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param billingRoleAssignmentName The ID that uniquely identifies a role assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleAssignment> getByBillingProfileAsync(String billingAccountName, String billingProfileName, String billingRoleAssignmentName);

    /**
     * Deletes a role assignment for the caller on a billing profile. The operation is supported for billing accounts with agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param billingRoleAssignmentName The ID that uniquely identifies a role assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleAssignment> deleteByBillingProfileAsync(String billingAccountName, String billingProfileName, String billingRoleAssignmentName);

    /**
     * Lists the role assignments for the caller on a billing account. The operation is supported for billing accounts with agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleAssignmentListResult> listByBillingAccountAsync(String billingAccountName);

    /**
     * Lists the role assignments for the caller on an invoice section. The operation is supported for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleAssignmentListResult> listByInvoiceSectionAsync(String billingAccountName, String billingProfileName, String invoiceSectionName);

    /**
     * Lists the role assignments for the caller on a billing profile. The operation is supported for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleAssignmentListResult> listByBillingProfileAsync(String billingAccountName, String billingProfileName);

    /**
     * Gets a role assignment for the caller on a billing account. The operation is supported for billing accounts with agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingRoleAssignmentName The ID that uniquely identifies a role assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleAssignment> getByBillingAccountAsync(String billingAccountName, String billingRoleAssignmentName);

    /**
     * Deletes a role assignment for the caller on a billing account. The operation is supported for billing accounts with agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingRoleAssignmentName The ID that uniquely identifies a role assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteByBillingAccountAsync(String billingAccountName, String billingRoleAssignmentName);

    /**
     * Adds a role assignment on a billing account. The operation is supported for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param parameters Request parameters that are provided to the create billing role assignment operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleAssignmentListResult> addByBillingAccountAsync(String billingAccountName, BillingRoleAssignmentPayload parameters);

    /**
     * Adds a role assignment on an invoice section. The operation is supported for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param parameters Request parameters that are provided to the create billing role assignment operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleAssignmentListResult> addByInvoiceSectionAsync(String billingAccountName, String billingProfileName, String invoiceSectionName, BillingRoleAssignmentPayload parameters);

    /**
     * Adds a role assignment on a billing profile. The operation is supported for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param parameters Request parameters that are provided to the create billing role assignment operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleAssignmentListResult> addByBillingProfileAsync(String billingAccountName, String billingProfileName, BillingRoleAssignmentPayload parameters);

}
