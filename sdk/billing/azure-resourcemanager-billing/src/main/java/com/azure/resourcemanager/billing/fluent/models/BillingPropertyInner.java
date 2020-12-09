// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.billing.models.AddressDetailsAutoGenerated;
import com.azure.resourcemanager.billing.models.BillingAccountAgreementType;
import com.azure.resourcemanager.billing.models.BillingAccountStatus;
import com.azure.resourcemanager.billing.models.BillingAccountType;
import com.azure.resourcemanager.billing.models.BillingProfileSpendingLimit;
import com.azure.resourcemanager.billing.models.BillingProfileStatus;
import com.azure.resourcemanager.billing.models.BillingProfileStatusReasonCode;
import com.azure.resourcemanager.billing.models.SubscriptionBillingStatus;
import com.azure.resourcemanager.billing.models.SubscriptionBillingStatusReasonDetails;
import com.azure.resourcemanager.billing.models.SubscriptionBillingType;
import com.azure.resourcemanager.billing.models.SubscriptionTaxDetails;
import com.azure.resourcemanager.billing.models.SubscriptionWorkloadType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** A billing property. */
@JsonFlatten
@Fluent
public class BillingPropertyInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BillingPropertyInner.class);

    /*
     * The notification email address for the account admin. This property is
     * available for agreement type Microsoft Online Services Program.
     */
    @JsonProperty(value = "properties.accountAdminNotificationEmailAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String accountAdminNotificationEmailAddress;

    /*
     * The signed agreement of the billing account.
     */
    @JsonProperty(value = "properties.billingAccountAgreementType", access = JsonProperty.Access.WRITE_ONLY)
    private BillingAccountAgreementType billingAccountAgreementType;

    /*
     * The name of the billing account to which the subscription is billed.
     */
    @JsonProperty(value = "properties.billingAccountDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String billingAccountDisplayName;

    /*
     * The ID of the billing account to which the subscription is billed.
     */
    @JsonProperty(value = "properties.billingAccountId", access = JsonProperty.Access.WRITE_ONLY)
    private String billingAccountId;

    /*
     * Country code for billing account's billing address.
     */
    @JsonProperty(value = "properties.billingAccountSoldToCountry")
    private String billingAccountSoldToCountry;

    /*
     * The current status of the billing account.
     */
    @JsonProperty(value = "properties.billingAccountStatus", access = JsonProperty.Access.WRITE_ONLY)
    private BillingAccountStatus billingAccountStatus;

    /*
     * The type billing account.
     */
    @JsonProperty(value = "properties.billingAccountType", access = JsonProperty.Access.WRITE_ONLY)
    private BillingAccountType billingAccountType;

    /*
     * The ID of the billing profile to which the subscription is billed. This
     * property is available for agreement type Microsoft Customer Agreement
     * and Microsoft Partner Agreement.
     */
    @JsonProperty(value = "properties.billingProfileId", access = JsonProperty.Access.WRITE_ONLY)
    private String billingProfileId;

    /*
     * The name of the billing profile to which the subscription is billed.
     * This property is available for agreement type Microsoft Customer
     * Agreement and Microsoft Partner Agreement.
     */
    @JsonProperty(value = "properties.billingProfileDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String billingProfileDisplayName;

    /*
     * The billing profile spending limit. This property is available for
     * agreement type Microsoft Customer Agreement and Microsoft Partner
     * Agreement.
     */
    @JsonProperty(value = "properties.billingProfileSpendingLimit", access = JsonProperty.Access.WRITE_ONLY)
    private BillingProfileSpendingLimit billingProfileSpendingLimit;

    /*
     * The status of the billing profile. This property is available for
     * agreement type Microsoft Customer Agreement and Microsoft Partner
     * Agreement.
     */
    @JsonProperty(value = "properties.billingProfileStatus", access = JsonProperty.Access.WRITE_ONLY)
    private BillingProfileStatus billingProfileStatus;

    /*
     * The status reason code when the specified billing profile is in Disabled
     * status. This property is for agreement type Microsoft Customer Agreement
     * and Microsoft Partner Agreement.
     */
    @JsonProperty(value = "properties.billingProfileStatusReasonCode", access = JsonProperty.Access.WRITE_ONLY)
    private BillingProfileStatusReasonCode billingProfileStatusReasonCode;

    /*
     * The cost center applied to the subscription. This property is available
     * for agreement type Microsoft Customer Agreement and Microsoft Partner
     * Agreement.
     */
    @JsonProperty(value = "properties.costCenter")
    private String costCenter;

    /*
     * The ID of the customer to which the subscription is billed. This
     * property is available for agreement type Microsoft Partner Agreement.
     */
    @JsonProperty(value = "properties.customerId", access = JsonProperty.Access.WRITE_ONLY)
    private String customerId;

    /*
     * The display name of the customer to which the subscription is billed.
     * This property is available for agreement type Microsoft Partner
     * Agreement.
     */
    @JsonProperty(value = "properties.customerDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String customerDisplayName;

    /*
     * The end date of the free service benefit for the subscription.
     */
    @JsonProperty(value = "properties.freeServicesBenefitEndDate")
    private OffsetDateTime freeServicesBenefitEndDate;

    /*
     * The ID of the invoice section to which the subscription is billed. This
     * property is available for agreement type Microsoft Customer Agreement.
     */
    @JsonProperty(value = "properties.invoiceSectionId", access = JsonProperty.Access.WRITE_ONLY)
    private String invoiceSectionId;

    /*
     * The name of the invoice section to which the subscription is billed.
     * This property is available for agreement type Microsoft Customer
     * Agreement.
     */
    @JsonProperty(value = "properties.invoiceSectionDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String invoiceSectionDisplayName;

    /*
     * Indicates whether user is the billing account admin for the
     * subscription. This property is available for agreement type Microsoft
     * Online Services Program.
     */
    @JsonProperty(value = "properties.isAccountAdmin", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isAccountAdmin;

    /*
     * The sku ID of the Azure plan for the subscription. This property is
     * available for agreement type Microsoft Customer Agreement and Microsoft
     * Partner Agreement.
     */
    @JsonProperty(value = "properties.skuId", access = JsonProperty.Access.WRITE_ONLY)
    private String skuId;

    /*
     * The sku description of the Azure plan for the subscription. This
     * property is available for agreement type Microsoft Customer Agreement
     * and Microsoft Partner Agreement.
     */
    @JsonProperty(value = "properties.skuDescription", access = JsonProperty.Access.WRITE_ONLY)
    private String skuDescription;

    /*
     * The subscription status.
     */
    @JsonProperty(value = "properties.subscriptionBillingStatus", access = JsonProperty.Access.WRITE_ONLY)
    private SubscriptionBillingStatus subscriptionBillingStatus;

    /*
     * The reason codes for the subscription status.
     */
    @JsonProperty(value = "properties.subscriptionBillingStatusDetails")
    private List<SubscriptionBillingStatusReasonDetails> subscriptionBillingStatusDetails;

    /*
     * The tax details of the subscription. This property is available for
     * agreement type Microsoft Online Services Program and country India.
     */
    @JsonProperty(value = "properties.subscriptionTaxDetails")
    private List<SubscriptionTaxDetails> subscriptionTaxDetails;

    /*
     * The type of billing subscription.
     */
    @JsonProperty(value = "properties.subscriptionBillingType", access = JsonProperty.Access.WRITE_ONLY)
    private SubscriptionBillingType subscriptionBillingType;

    /*
     * The address of the individual or organization where service subscription
     * is being used. This property is available for agreement type Microsoft
     * Online Services Program.
     */
    @JsonProperty(value = "properties.subscriptionServiceUsageAddress")
    private AddressDetailsAutoGenerated subscriptionServiceUsageAddress;

    /*
     * The Azure workload type of the subscription.
     */
    @JsonProperty(value = "properties.subscriptionWorkloadType", access = JsonProperty.Access.WRITE_ONLY)
    private SubscriptionWorkloadType subscriptionWorkloadType;

    /**
     * Get the accountAdminNotificationEmailAddress property: The notification email address for the account admin. This
     * property is available for agreement type Microsoft Online Services Program.
     *
     * @return the accountAdminNotificationEmailAddress value.
     */
    public String accountAdminNotificationEmailAddress() {
        return this.accountAdminNotificationEmailAddress;
    }

    /**
     * Get the billingAccountAgreementType property: The signed agreement of the billing account.
     *
     * @return the billingAccountAgreementType value.
     */
    public BillingAccountAgreementType billingAccountAgreementType() {
        return this.billingAccountAgreementType;
    }

    /**
     * Get the billingAccountDisplayName property: The name of the billing account to which the subscription is billed.
     *
     * @return the billingAccountDisplayName value.
     */
    public String billingAccountDisplayName() {
        return this.billingAccountDisplayName;
    }

    /**
     * Get the billingAccountId property: The ID of the billing account to which the subscription is billed.
     *
     * @return the billingAccountId value.
     */
    public String billingAccountId() {
        return this.billingAccountId;
    }

    /**
     * Get the billingAccountSoldToCountry property: Country code for billing account's billing address.
     *
     * @return the billingAccountSoldToCountry value.
     */
    public String billingAccountSoldToCountry() {
        return this.billingAccountSoldToCountry;
    }

    /**
     * Set the billingAccountSoldToCountry property: Country code for billing account's billing address.
     *
     * @param billingAccountSoldToCountry the billingAccountSoldToCountry value to set.
     * @return the BillingPropertyInner object itself.
     */
    public BillingPropertyInner withBillingAccountSoldToCountry(String billingAccountSoldToCountry) {
        this.billingAccountSoldToCountry = billingAccountSoldToCountry;
        return this;
    }

    /**
     * Get the billingAccountStatus property: The current status of the billing account.
     *
     * @return the billingAccountStatus value.
     */
    public BillingAccountStatus billingAccountStatus() {
        return this.billingAccountStatus;
    }

    /**
     * Get the billingAccountType property: The type billing account.
     *
     * @return the billingAccountType value.
     */
    public BillingAccountType billingAccountType() {
        return this.billingAccountType;
    }

    /**
     * Get the billingProfileId property: The ID of the billing profile to which the subscription is billed. This
     * property is available for agreement type Microsoft Customer Agreement and Microsoft Partner Agreement.
     *
     * @return the billingProfileId value.
     */
    public String billingProfileId() {
        return this.billingProfileId;
    }

    /**
     * Get the billingProfileDisplayName property: The name of the billing profile to which the subscription is billed.
     * This property is available for agreement type Microsoft Customer Agreement and Microsoft Partner Agreement.
     *
     * @return the billingProfileDisplayName value.
     */
    public String billingProfileDisplayName() {
        return this.billingProfileDisplayName;
    }

    /**
     * Get the billingProfileSpendingLimit property: The billing profile spending limit. This property is available for
     * agreement type Microsoft Customer Agreement and Microsoft Partner Agreement.
     *
     * @return the billingProfileSpendingLimit value.
     */
    public BillingProfileSpendingLimit billingProfileSpendingLimit() {
        return this.billingProfileSpendingLimit;
    }

    /**
     * Get the billingProfileStatus property: The status of the billing profile. This property is available for
     * agreement type Microsoft Customer Agreement and Microsoft Partner Agreement.
     *
     * @return the billingProfileStatus value.
     */
    public BillingProfileStatus billingProfileStatus() {
        return this.billingProfileStatus;
    }

    /**
     * Get the billingProfileStatusReasonCode property: The status reason code when the specified billing profile is in
     * Disabled status. This property is for agreement type Microsoft Customer Agreement and Microsoft Partner
     * Agreement.
     *
     * @return the billingProfileStatusReasonCode value.
     */
    public BillingProfileStatusReasonCode billingProfileStatusReasonCode() {
        return this.billingProfileStatusReasonCode;
    }

    /**
     * Get the costCenter property: The cost center applied to the subscription. This property is available for
     * agreement type Microsoft Customer Agreement and Microsoft Partner Agreement.
     *
     * @return the costCenter value.
     */
    public String costCenter() {
        return this.costCenter;
    }

    /**
     * Set the costCenter property: The cost center applied to the subscription. This property is available for
     * agreement type Microsoft Customer Agreement and Microsoft Partner Agreement.
     *
     * @param costCenter the costCenter value to set.
     * @return the BillingPropertyInner object itself.
     */
    public BillingPropertyInner withCostCenter(String costCenter) {
        this.costCenter = costCenter;
        return this;
    }

    /**
     * Get the customerId property: The ID of the customer to which the subscription is billed. This property is
     * available for agreement type Microsoft Partner Agreement.
     *
     * @return the customerId value.
     */
    public String customerId() {
        return this.customerId;
    }

    /**
     * Get the customerDisplayName property: The display name of the customer to which the subscription is billed. This
     * property is available for agreement type Microsoft Partner Agreement.
     *
     * @return the customerDisplayName value.
     */
    public String customerDisplayName() {
        return this.customerDisplayName;
    }

    /**
     * Get the freeServicesBenefitEndDate property: The end date of the free service benefit for the subscription.
     *
     * @return the freeServicesBenefitEndDate value.
     */
    public OffsetDateTime freeServicesBenefitEndDate() {
        return this.freeServicesBenefitEndDate;
    }

    /**
     * Set the freeServicesBenefitEndDate property: The end date of the free service benefit for the subscription.
     *
     * @param freeServicesBenefitEndDate the freeServicesBenefitEndDate value to set.
     * @return the BillingPropertyInner object itself.
     */
    public BillingPropertyInner withFreeServicesBenefitEndDate(OffsetDateTime freeServicesBenefitEndDate) {
        this.freeServicesBenefitEndDate = freeServicesBenefitEndDate;
        return this;
    }

    /**
     * Get the invoiceSectionId property: The ID of the invoice section to which the subscription is billed. This
     * property is available for agreement type Microsoft Customer Agreement.
     *
     * @return the invoiceSectionId value.
     */
    public String invoiceSectionId() {
        return this.invoiceSectionId;
    }

    /**
     * Get the invoiceSectionDisplayName property: The name of the invoice section to which the subscription is billed.
     * This property is available for agreement type Microsoft Customer Agreement.
     *
     * @return the invoiceSectionDisplayName value.
     */
    public String invoiceSectionDisplayName() {
        return this.invoiceSectionDisplayName;
    }

    /**
     * Get the isAccountAdmin property: Indicates whether user is the billing account admin for the subscription. This
     * property is available for agreement type Microsoft Online Services Program.
     *
     * @return the isAccountAdmin value.
     */
    public Boolean isAccountAdmin() {
        return this.isAccountAdmin;
    }

    /**
     * Get the skuId property: The sku ID of the Azure plan for the subscription. This property is available for
     * agreement type Microsoft Customer Agreement and Microsoft Partner Agreement.
     *
     * @return the skuId value.
     */
    public String skuId() {
        return this.skuId;
    }

    /**
     * Get the skuDescription property: The sku description of the Azure plan for the subscription. This property is
     * available for agreement type Microsoft Customer Agreement and Microsoft Partner Agreement.
     *
     * @return the skuDescription value.
     */
    public String skuDescription() {
        return this.skuDescription;
    }

    /**
     * Get the subscriptionBillingStatus property: The subscription status.
     *
     * @return the subscriptionBillingStatus value.
     */
    public SubscriptionBillingStatus subscriptionBillingStatus() {
        return this.subscriptionBillingStatus;
    }

    /**
     * Get the subscriptionBillingStatusDetails property: The reason codes for the subscription status.
     *
     * @return the subscriptionBillingStatusDetails value.
     */
    public List<SubscriptionBillingStatusReasonDetails> subscriptionBillingStatusDetails() {
        return this.subscriptionBillingStatusDetails;
    }

    /**
     * Set the subscriptionBillingStatusDetails property: The reason codes for the subscription status.
     *
     * @param subscriptionBillingStatusDetails the subscriptionBillingStatusDetails value to set.
     * @return the BillingPropertyInner object itself.
     */
    public BillingPropertyInner withSubscriptionBillingStatusDetails(
        List<SubscriptionBillingStatusReasonDetails> subscriptionBillingStatusDetails) {
        this.subscriptionBillingStatusDetails = subscriptionBillingStatusDetails;
        return this;
    }

    /**
     * Get the subscriptionTaxDetails property: The tax details of the subscription. This property is available for
     * agreement type Microsoft Online Services Program and country India.
     *
     * @return the subscriptionTaxDetails value.
     */
    public List<SubscriptionTaxDetails> subscriptionTaxDetails() {
        return this.subscriptionTaxDetails;
    }

    /**
     * Set the subscriptionTaxDetails property: The tax details of the subscription. This property is available for
     * agreement type Microsoft Online Services Program and country India.
     *
     * @param subscriptionTaxDetails the subscriptionTaxDetails value to set.
     * @return the BillingPropertyInner object itself.
     */
    public BillingPropertyInner withSubscriptionTaxDetails(List<SubscriptionTaxDetails> subscriptionTaxDetails) {
        this.subscriptionTaxDetails = subscriptionTaxDetails;
        return this;
    }

    /**
     * Get the subscriptionBillingType property: The type of billing subscription.
     *
     * @return the subscriptionBillingType value.
     */
    public SubscriptionBillingType subscriptionBillingType() {
        return this.subscriptionBillingType;
    }

    /**
     * Get the subscriptionServiceUsageAddress property: The address of the individual or organization where service
     * subscription is being used. This property is available for agreement type Microsoft Online Services Program.
     *
     * @return the subscriptionServiceUsageAddress value.
     */
    public AddressDetailsAutoGenerated subscriptionServiceUsageAddress() {
        return this.subscriptionServiceUsageAddress;
    }

    /**
     * Set the subscriptionServiceUsageAddress property: The address of the individual or organization where service
     * subscription is being used. This property is available for agreement type Microsoft Online Services Program.
     *
     * @param subscriptionServiceUsageAddress the subscriptionServiceUsageAddress value to set.
     * @return the BillingPropertyInner object itself.
     */
    public BillingPropertyInner withSubscriptionServiceUsageAddress(
        AddressDetailsAutoGenerated subscriptionServiceUsageAddress) {
        this.subscriptionServiceUsageAddress = subscriptionServiceUsageAddress;
        return this;
    }

    /**
     * Get the subscriptionWorkloadType property: The Azure workload type of the subscription.
     *
     * @return the subscriptionWorkloadType value.
     */
    public SubscriptionWorkloadType subscriptionWorkloadType() {
        return this.subscriptionWorkloadType;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (subscriptionBillingStatusDetails() != null) {
            subscriptionBillingStatusDetails().forEach(e -> e.validate());
        }
        if (subscriptionTaxDetails() != null) {
            subscriptionTaxDetails().forEach(e -> e.validate());
        }
        if (subscriptionServiceUsageAddress() != null) {
            subscriptionServiceUsageAddress().validate();
        }
    }
}
