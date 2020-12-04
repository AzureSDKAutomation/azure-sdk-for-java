/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2020_05_01;

import rx.Observable;
import com.microsoft.azure.management.billing.v2020_05_01.implementation.BillingRoleDefinitionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing BillingRoleDefinitions.
 */
public interface BillingRoleDefinitions extends HasInner<BillingRoleDefinitionsInner> {
    /**
     * Gets the definition for a role on an invoice section. The operation is supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param billingRoleDefinitionName The ID that uniquely identifies a role definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleDefinition> getByInvoiceSectionAsync(String billingAccountName, String billingProfileName, String invoiceSectionName, String billingRoleDefinitionName);

    /**
     * Gets the definition for a role on a billing profile. The operation is supported for billing accounts with agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param billingRoleDefinitionName The ID that uniquely identifies a role definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleDefinition> getByBillingProfileAsync(String billingAccountName, String billingProfileName, String billingRoleDefinitionName);

    /**
     * Lists the role definitions for an invoice section. The operation is supported for billing accounts with agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleDefinition> listByInvoiceSectionAsync(final String billingAccountName, final String billingProfileName, final String invoiceSectionName);

    /**
     * Lists the role definitions for a billing profile. The operation is supported for billing accounts with agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleDefinition> listByBillingProfileAsync(final String billingAccountName, final String billingProfileName);

    /**
     * Gets the definition for a role on a billing account. The operation is supported for billing accounts with agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingRoleDefinitionName The ID that uniquely identifies a role definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleDefinition> getByBillingAccountAsync(String billingAccountName, String billingRoleDefinitionName);

    /**
     * Lists the role definitions for a billing account. The operation is supported for billing accounts with agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingRoleDefinition> listByBillingAccountAsync(final String billingAccountName);

}
