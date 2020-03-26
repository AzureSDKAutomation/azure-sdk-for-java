/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview.implementation;

import com.microsoft.azure.management.billing.v2019_10_01_preview.AddressDetails;
import java.util.List;
import com.microsoft.azure.management.billing.v2019_10_01_preview.AzurePlan;
import com.microsoft.azure.management.billing.v2019_10_01_preview.StatusReasonCode;
import com.microsoft.azure.management.billing.v2019_10_01_preview.SpendingLimit;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A billing profile.
 */
@JsonFlatten
public class BillingProfileInner extends ProxyResource {
    /**
     * The name of the billing profile.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * The purchase order name that will appear on the invoices generated for
     * the billing profile.
     */
    @JsonProperty(value = "properties.poNumber")
    private String poNumber;

    /**
     * Billing address.
     */
    @JsonProperty(value = "properties.address")
    private AddressDetails address;

    /**
     * Flag controlling whether the invoices for the billing profile are sent
     * through email.
     */
    @JsonProperty(value = "properties.invoiceEmailOptIn")
    private Boolean invoiceEmailOptIn;

    /**
     * The day of the month when the invoice for the billing profile is
     * generated.
     */
    @JsonProperty(value = "properties.invoiceDay", access = JsonProperty.Access.WRITE_ONLY)
    private Integer invoiceDay;

    /**
     * The currency in which the charges for the billing profile are billed.
     */
    @JsonProperty(value = "properties.currency", access = JsonProperty.Access.WRITE_ONLY)
    private String currency;

    /**
     * Information about the enabled azure plans.
     */
    @JsonProperty(value = "properties.enabledAzurePlans")
    private List<AzurePlan> enabledAzurePlans;

    /**
     * The invoice sections associated to the billing profile.
     */
    @JsonProperty(value = "properties.invoiceSections")
    private List<InvoiceSectionInner> invoiceSections;

    /**
     * The status of the billing profile.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private Object status;

    /**
     * Reason for the specified billing profile status. Possible values
     * include: 'PastDue', 'SpendingLimitReached', 'SpendingLimitExpired'.
     */
    @JsonProperty(value = "properties.statusReasonCode", access = JsonProperty.Access.WRITE_ONLY)
    private StatusReasonCode statusReasonCode;

    /**
     * The billing profile spending limit. Possible values include: 'Off',
     * 'On'.
     */
    @JsonProperty(value = "properties.spendingLimit", access = JsonProperty.Access.WRITE_ONLY)
    private SpendingLimit spendingLimit;

    /**
     * Get the name of the billing profile.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the name of the billing profile.
     *
     * @param displayName the displayName value to set
     * @return the BillingProfileInner object itself.
     */
    public BillingProfileInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the purchase order name that will appear on the invoices generated for the billing profile.
     *
     * @return the poNumber value
     */
    public String poNumber() {
        return this.poNumber;
    }

    /**
     * Set the purchase order name that will appear on the invoices generated for the billing profile.
     *
     * @param poNumber the poNumber value to set
     * @return the BillingProfileInner object itself.
     */
    public BillingProfileInner withPoNumber(String poNumber) {
        this.poNumber = poNumber;
        return this;
    }

    /**
     * Get billing address.
     *
     * @return the address value
     */
    public AddressDetails address() {
        return this.address;
    }

    /**
     * Set billing address.
     *
     * @param address the address value to set
     * @return the BillingProfileInner object itself.
     */
    public BillingProfileInner withAddress(AddressDetails address) {
        this.address = address;
        return this;
    }

    /**
     * Get flag controlling whether the invoices for the billing profile are sent through email.
     *
     * @return the invoiceEmailOptIn value
     */
    public Boolean invoiceEmailOptIn() {
        return this.invoiceEmailOptIn;
    }

    /**
     * Set flag controlling whether the invoices for the billing profile are sent through email.
     *
     * @param invoiceEmailOptIn the invoiceEmailOptIn value to set
     * @return the BillingProfileInner object itself.
     */
    public BillingProfileInner withInvoiceEmailOptIn(Boolean invoiceEmailOptIn) {
        this.invoiceEmailOptIn = invoiceEmailOptIn;
        return this;
    }

    /**
     * Get the day of the month when the invoice for the billing profile is generated.
     *
     * @return the invoiceDay value
     */
    public Integer invoiceDay() {
        return this.invoiceDay;
    }

    /**
     * Get the currency in which the charges for the billing profile are billed.
     *
     * @return the currency value
     */
    public String currency() {
        return this.currency;
    }

    /**
     * Get information about the enabled azure plans.
     *
     * @return the enabledAzurePlans value
     */
    public List<AzurePlan> enabledAzurePlans() {
        return this.enabledAzurePlans;
    }

    /**
     * Set information about the enabled azure plans.
     *
     * @param enabledAzurePlans the enabledAzurePlans value to set
     * @return the BillingProfileInner object itself.
     */
    public BillingProfileInner withEnabledAzurePlans(List<AzurePlan> enabledAzurePlans) {
        this.enabledAzurePlans = enabledAzurePlans;
        return this;
    }

    /**
     * Get the invoice sections associated to the billing profile.
     *
     * @return the invoiceSections value
     */
    public List<InvoiceSectionInner> invoiceSections() {
        return this.invoiceSections;
    }

    /**
     * Set the invoice sections associated to the billing profile.
     *
     * @param invoiceSections the invoiceSections value to set
     * @return the BillingProfileInner object itself.
     */
    public BillingProfileInner withInvoiceSections(List<InvoiceSectionInner> invoiceSections) {
        this.invoiceSections = invoiceSections;
        return this;
    }

    /**
     * Get the status of the billing profile.
     *
     * @return the status value
     */
    public Object status() {
        return this.status;
    }

    /**
     * Get reason for the specified billing profile status. Possible values include: 'PastDue', 'SpendingLimitReached', 'SpendingLimitExpired'.
     *
     * @return the statusReasonCode value
     */
    public StatusReasonCode statusReasonCode() {
        return this.statusReasonCode;
    }

    /**
     * Get the billing profile spending limit. Possible values include: 'Off', 'On'.
     *
     * @return the spendingLimit value
     */
    public SpendingLimit spendingLimit() {
        return this.spendingLimit;
    }

}
