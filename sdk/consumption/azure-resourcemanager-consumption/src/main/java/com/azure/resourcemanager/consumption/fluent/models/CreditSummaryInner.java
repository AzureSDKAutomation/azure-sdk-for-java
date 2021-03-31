// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.models.Amount;
import com.azure.resourcemanager.consumption.models.CreditBalanceSummary;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** A credit summary resource. */
@JsonFlatten
@Immutable
public class CreditSummaryInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CreditSummaryInner.class);

    /*
     * Summary of balances associated with this credit summary.
     */
    @JsonProperty(value = "properties.balanceSummary", access = JsonProperty.Access.WRITE_ONLY)
    private CreditBalanceSummary balanceSummary;

    /*
     * Pending credit adjustments.
     */
    @JsonProperty(value = "properties.pendingCreditAdjustments", access = JsonProperty.Access.WRITE_ONLY)
    private Amount pendingCreditAdjustments;

    /*
     * Expired credit.
     */
    @JsonProperty(value = "properties.expiredCredit", access = JsonProperty.Access.WRITE_ONLY)
    private Amount expiredCredit;

    /*
     * Pending eligible charges.
     */
    @JsonProperty(value = "properties.pendingEligibleCharges", access = JsonProperty.Access.WRITE_ONLY)
    private Amount pendingEligibleCharges;

    /*
     * Resource etag.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> tags;

    /**
     * Get the balanceSummary property: Summary of balances associated with this credit summary.
     *
     * @return the balanceSummary value.
     */
    public CreditBalanceSummary balanceSummary() {
        return this.balanceSummary;
    }

    /**
     * Get the pendingCreditAdjustments property: Pending credit adjustments.
     *
     * @return the pendingCreditAdjustments value.
     */
    public Amount pendingCreditAdjustments() {
        return this.pendingCreditAdjustments;
    }

    /**
     * Get the expiredCredit property: Expired credit.
     *
     * @return the expiredCredit value.
     */
    public Amount expiredCredit() {
        return this.expiredCredit;
    }

    /**
     * Get the pendingEligibleCharges property: Pending eligible charges.
     *
     * @return the pendingEligibleCharges value.
     */
    public Amount pendingEligibleCharges() {
        return this.pendingEligibleCharges;
    }

    /**
     * Get the etag property: Resource etag.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (balanceSummary() != null) {
            balanceSummary().validate();
        }
        if (pendingCreditAdjustments() != null) {
            pendingCreditAdjustments().validate();
        }
        if (expiredCredit() != null) {
            expiredCredit().validate();
        }
        if (pendingEligibleCharges() != null) {
            pendingEligibleCharges().validate();
        }
    }
}
