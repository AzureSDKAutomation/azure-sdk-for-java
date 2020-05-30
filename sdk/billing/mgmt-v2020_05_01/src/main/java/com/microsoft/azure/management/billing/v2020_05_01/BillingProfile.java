/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2020_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.billing.v2020_05_01.implementation.BillingProfileInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.billing.v2020_05_01.implementation.BillingManager;
import java.util.List;

/**
 * Type representing BillingProfile.
 */
public interface BillingProfile extends HasInner<BillingProfileInner>, Indexable, Refreshable<BillingProfile>, Updatable<BillingProfile.Update>, HasManager<BillingManager> {
    /**
     * @return the billTo value.
     */
    AddressDetails billTo();

    /**
     * @return the currency value.
     */
    String currency();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the enabledAzurePlans value.
     */
    List<AzurePlan> enabledAzurePlans();

    /**
     * @return the hasReadAccess value.
     */
    Boolean hasReadAccess();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the invoiceDay value.
     */
    Integer invoiceDay();

    /**
     * @return the invoiceEmailOptIn value.
     */
    Boolean invoiceEmailOptIn();

    /**
     * @return the invoiceSections value.
     */
    InvoiceSectionsOnExpand invoiceSections();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the poNumber value.
     */
    String poNumber();

    /**
     * @return the spendingLimit value.
     */
    SpendingLimit spendingLimit();

    /**
     * @return the status value.
     */
    BillingProfileStatus status();

    /**
     * @return the statusReasonCode value.
     */
    StatusReasonCode statusReasonCode();

    /**
     * @return the systemId value.
     */
    String systemId();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the BillingProfile definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithBillingAccount, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of BillingProfile definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a BillingProfile definition.
         */
        interface Blank extends WithBillingAccount {
        }

        /**
         * The stage of the billingprofile definition allowing to specify BillingAccount.
         */
        interface WithBillingAccount {
           /**
            * Specifies billingAccountName.
            * @param billingAccountName The ID that uniquely identifies a billing account
            * @return the next definition stage
            */
            WithCreate withExistingBillingAccount(String billingAccountName);
        }

        /**
         * The stage of the billingprofile definition allowing to specify BillTo.
         */
        interface WithBillTo {
            /**
             * Specifies billTo.
             * @param billTo Billing address
             * @return the next definition stage
             */
            WithCreate withBillTo(AddressDetails billTo);
        }

        /**
         * The stage of the billingprofile definition allowing to specify DisplayName.
         */
        interface WithDisplayName {
            /**
             * Specifies displayName.
             * @param displayName The name of the billing profile
             * @return the next definition stage
             */
            WithCreate withDisplayName(String displayName);
        }

        /**
         * The stage of the billingprofile definition allowing to specify EnabledAzurePlans.
         */
        interface WithEnabledAzurePlans {
            /**
             * Specifies enabledAzurePlans.
             * @param enabledAzurePlans Information about the enabled azure plans
             * @return the next definition stage
             */
            WithCreate withEnabledAzurePlans(List<AzurePlan> enabledAzurePlans);
        }

        /**
         * The stage of the billingprofile definition allowing to specify InvoiceEmailOptIn.
         */
        interface WithInvoiceEmailOptIn {
            /**
             * Specifies invoiceEmailOptIn.
             * @param invoiceEmailOptIn Flag controlling whether the invoices for the billing profile are sent through email
             * @return the next definition stage
             */
            WithCreate withInvoiceEmailOptIn(Boolean invoiceEmailOptIn);
        }

        /**
         * The stage of the billingprofile definition allowing to specify InvoiceSections.
         */
        interface WithInvoiceSections {
            /**
             * Specifies invoiceSections.
             * @param invoiceSections The invoice sections associated to the billing profile. By default this is not populated, unless it's specified in $expand
             * @return the next definition stage
             */
            WithCreate withInvoiceSections(InvoiceSectionsOnExpand invoiceSections);
        }

        /**
         * The stage of the billingprofile definition allowing to specify PoNumber.
         */
        interface WithPoNumber {
            /**
             * Specifies poNumber.
             * @param poNumber The purchase order name that will appear on the invoices generated for the billing profile
             * @return the next definition stage
             */
            WithCreate withPoNumber(String poNumber);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<BillingProfile>, DefinitionStages.WithBillTo, DefinitionStages.WithDisplayName, DefinitionStages.WithEnabledAzurePlans, DefinitionStages.WithInvoiceEmailOptIn, DefinitionStages.WithInvoiceSections, DefinitionStages.WithPoNumber {
        }
    }
    /**
     * The template for a BillingProfile update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<BillingProfile>, UpdateStages.WithBillTo, UpdateStages.WithDisplayName, UpdateStages.WithEnabledAzurePlans, UpdateStages.WithInvoiceEmailOptIn, UpdateStages.WithInvoiceSections, UpdateStages.WithPoNumber {
    }

    /**
     * Grouping of BillingProfile update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the billingprofile update allowing to specify BillTo.
         */
        interface WithBillTo {
            /**
             * Specifies billTo.
             * @param billTo Billing address
             * @return the next update stage
             */
            Update withBillTo(AddressDetails billTo);
        }

        /**
         * The stage of the billingprofile update allowing to specify DisplayName.
         */
        interface WithDisplayName {
            /**
             * Specifies displayName.
             * @param displayName The name of the billing profile
             * @return the next update stage
             */
            Update withDisplayName(String displayName);
        }

        /**
         * The stage of the billingprofile update allowing to specify EnabledAzurePlans.
         */
        interface WithEnabledAzurePlans {
            /**
             * Specifies enabledAzurePlans.
             * @param enabledAzurePlans Information about the enabled azure plans
             * @return the next update stage
             */
            Update withEnabledAzurePlans(List<AzurePlan> enabledAzurePlans);
        }

        /**
         * The stage of the billingprofile update allowing to specify InvoiceEmailOptIn.
         */
        interface WithInvoiceEmailOptIn {
            /**
             * Specifies invoiceEmailOptIn.
             * @param invoiceEmailOptIn Flag controlling whether the invoices for the billing profile are sent through email
             * @return the next update stage
             */
            Update withInvoiceEmailOptIn(Boolean invoiceEmailOptIn);
        }

        /**
         * The stage of the billingprofile update allowing to specify InvoiceSections.
         */
        interface WithInvoiceSections {
            /**
             * Specifies invoiceSections.
             * @param invoiceSections The invoice sections associated to the billing profile. By default this is not populated, unless it's specified in $expand
             * @return the next update stage
             */
            Update withInvoiceSections(InvoiceSectionsOnExpand invoiceSections);
        }

        /**
         * The stage of the billingprofile update allowing to specify PoNumber.
         */
        interface WithPoNumber {
            /**
             * Specifies poNumber.
             * @param poNumber The purchase order name that will appear on the invoices generated for the billing profile
             * @return the next update stage
             */
            Update withPoNumber(String poNumber);
        }

    }
}
