// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.billing.models.AcceptanceMode;
import com.azure.resourcemanager.billing.models.Category;
import com.azure.resourcemanager.billing.models.Participants;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** An agreement. */
@JsonFlatten
@Fluent
public class AgreementInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AgreementInner.class);

    /*
     * The URL to download the agreement.
     */
    @JsonProperty(value = "properties.agreementLink", access = JsonProperty.Access.WRITE_ONLY)
    private String agreementLink;

    /*
     * The category of the agreement signed by a customer.
     */
    @JsonProperty(value = "properties.category", access = JsonProperty.Access.WRITE_ONLY)
    private Category category;

    /*
     * The mode of acceptance for an agreement.
     */
    @JsonProperty(value = "properties.acceptanceMode", access = JsonProperty.Access.WRITE_ONLY)
    private AcceptanceMode acceptanceMode;

    /*
     * The date from which the agreement is effective.
     */
    @JsonProperty(value = "properties.effectiveDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime effectiveDate;

    /*
     * The date when the agreement expires.
     */
    @JsonProperty(value = "properties.expirationDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime expirationDate;

    /*
     * The list of participants that participates in acceptance of an
     * agreement.
     */
    @JsonProperty(value = "properties.participants")
    private List<Participants> participants;

    /*
     * The current status of the agreement.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /**
     * Get the agreementLink property: The URL to download the agreement.
     *
     * @return the agreementLink value.
     */
    public String agreementLink() {
        return this.agreementLink;
    }

    /**
     * Get the category property: The category of the agreement signed by a customer.
     *
     * @return the category value.
     */
    public Category category() {
        return this.category;
    }

    /**
     * Get the acceptanceMode property: The mode of acceptance for an agreement.
     *
     * @return the acceptanceMode value.
     */
    public AcceptanceMode acceptanceMode() {
        return this.acceptanceMode;
    }

    /**
     * Get the effectiveDate property: The date from which the agreement is effective.
     *
     * @return the effectiveDate value.
     */
    public OffsetDateTime effectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Get the expirationDate property: The date when the agreement expires.
     *
     * @return the expirationDate value.
     */
    public OffsetDateTime expirationDate() {
        return this.expirationDate;
    }

    /**
     * Get the participants property: The list of participants that participates in acceptance of an agreement.
     *
     * @return the participants value.
     */
    public List<Participants> participants() {
        return this.participants;
    }

    /**
     * Set the participants property: The list of participants that participates in acceptance of an agreement.
     *
     * @param participants the participants value to set.
     * @return the AgreementInner object itself.
     */
    public AgreementInner withParticipants(List<Participants> participants) {
        this.participants = participants;
        return this;
    }

    /**
     * Get the status property: The current status of the agreement.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (participants() != null) {
            participants().forEach(e -> e.validate());
        }
    }
}
