// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of BillingSubscriptions. */
public interface BillingSubscriptions {
    /**
     * Lists the subscriptions for a billing account. The operation is supported for billing accounts with agreement
     * type Microsoft Customer Agreement or Microsoft Partner Agreement or Microsoft Online Services Program Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of billing subscriptions.
     */
    PagedIterable<BillingSubscription> listByBillingAccount(String billingAccountName);

    /**
     * Lists the subscriptions for a billing account. The operation is supported for billing accounts with agreement
     * type Microsoft Customer Agreement or Microsoft Partner Agreement or Microsoft Online Services Program Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of billing subscriptions.
     */
    PagedIterable<BillingSubscription> listByBillingAccount(String billingAccountName, Context context);

    /**
     * Gets a billing subscription by id.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingSubscriptionId The ID that uniquely identifies a billing subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a billing subscription by id.
     */
    BillingSubscription get(String billingAccountName, String billingSubscriptionId);

    /**
     * Gets a billing subscription by id.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingSubscriptionId The ID that uniquely identifies a billing subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a billing subscription by id.
     */
    Response<BillingSubscription> getWithResponse(
        String billingAccountName, String billingSubscriptionId, Context context);

    /**
     * Updates a billing subscription. Currently, cost center can be updated.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingSubscriptionId The ID that uniquely identifies a billing subscription.
     * @param parameters The request properties of the billing subscription that can be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a billing subscription.
     */
    BillingSubscription update(
        String billingAccountName, String billingSubscriptionId, BillingSubscriptionUpdateRequest parameters);

    /**
     * Updates a billing subscription. Currently, cost center can be updated.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingSubscriptionId The ID that uniquely identifies a billing subscription.
     * @param parameters The request properties of the billing subscription that can be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a billing subscription.
     */
    Response<BillingSubscription> updateWithResponse(
        String billingAccountName,
        String billingSubscriptionId,
        BillingSubscriptionUpdateRequest parameters,
        Context context);

    /**
     * Lists the subscriptions for a billing profile. The operation is supported for billing accounts with agreement
     * type Microsoft Customer Agreement or Microsoft Partner Agreement or Microsoft Online Services Program Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of billing subscriptions.
     */
    PagedIterable<BillingSubscription> listByBillingProfile(String billingAccountName, String billingProfileName);

    /**
     * Lists the subscriptions for a billing profile. The operation is supported for billing accounts with agreement
     * type Microsoft Customer Agreement or Microsoft Partner Agreement or Microsoft Online Services Program Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of billing subscriptions.
     */
    PagedIterable<BillingSubscription> listByBillingProfile(
        String billingAccountName, String billingProfileName, Context context);

    /**
     * Lists the subscriptions for an invoice section. The operation is supported for billing profiles with agreement
     * type Microsoft Customer Agreement or Microsoft Partner Agreement or Microsoft Online Services Program Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of billing subscriptions.
     */
    PagedIterable<BillingSubscription> listByInvoiceSection(
        String billingAccountName, String billingProfileName, String invoiceSectionName);

    /**
     * Lists the subscriptions for an invoice section. The operation is supported for billing profiles with agreement
     * type Microsoft Customer Agreement or Microsoft Partner Agreement or Microsoft Online Services Program Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of billing subscriptions.
     */
    PagedIterable<BillingSubscription> listByInvoiceSection(
        String billingAccountName, String billingProfileName, String invoiceSectionName, Context context);
}
