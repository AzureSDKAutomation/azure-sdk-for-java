// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.blockchain.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.blockchain.models.NameAvailabilityReason;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Name availability payload which is exposed in the response of the resource provider. */
@Fluent
public final class NameAvailabilityInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NameAvailabilityInner.class);

    /*
     * Gets or sets the value indicating whether the name is available.
     */
    @JsonProperty(value = "nameAvailable")
    private Boolean nameAvailable;

    /*
     * Gets or sets the message.
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * Gets or sets the name availability reason.
     */
    @JsonProperty(value = "reason")
    private NameAvailabilityReason reason;

    /**
     * Get the nameAvailable property: Gets or sets the value indicating whether the name is available.
     *
     * @return the nameAvailable value.
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Set the nameAvailable property: Gets or sets the value indicating whether the name is available.
     *
     * @param nameAvailable the nameAvailable value to set.
     * @return the NameAvailabilityInner object itself.
     */
    public NameAvailabilityInner withNameAvailable(Boolean nameAvailable) {
        this.nameAvailable = nameAvailable;
        return this;
    }

    /**
     * Get the message property: Gets or sets the message.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Gets or sets the message.
     *
     * @param message the message value to set.
     * @return the NameAvailabilityInner object itself.
     */
    public NameAvailabilityInner withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the reason property: Gets or sets the name availability reason.
     *
     * @return the reason value.
     */
    public NameAvailabilityReason reason() {
        return this.reason;
    }

    /**
     * Set the reason property: Gets or sets the name availability reason.
     *
     * @param reason the reason value to set.
     * @return the NameAvailabilityInner object itself.
     */
    public NameAvailabilityInner withReason(NameAvailabilityReason reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
