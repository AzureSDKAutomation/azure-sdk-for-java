// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.saas.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** delete Options. */
@Fluent
public final class DeleteOptions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeleteOptions.class);

    /*
     * whether it is unsubscribeOnly
     */
    @JsonProperty(value = "unsubscribeOnly")
    private Boolean unsubscribeOnly;

    /*
     * The reasonCode
     */
    @JsonProperty(value = "reasonCode")
    private Float reasonCode;

    /*
     * the feedback
     */
    @JsonProperty(value = "feedback")
    private String feedback;

    /**
     * Get the unsubscribeOnly property: whether it is unsubscribeOnly.
     *
     * @return the unsubscribeOnly value.
     */
    public Boolean unsubscribeOnly() {
        return this.unsubscribeOnly;
    }

    /**
     * Set the unsubscribeOnly property: whether it is unsubscribeOnly.
     *
     * @param unsubscribeOnly the unsubscribeOnly value to set.
     * @return the DeleteOptions object itself.
     */
    public DeleteOptions withUnsubscribeOnly(Boolean unsubscribeOnly) {
        this.unsubscribeOnly = unsubscribeOnly;
        return this;
    }

    /**
     * Get the reasonCode property: The reasonCode.
     *
     * @return the reasonCode value.
     */
    public Float reasonCode() {
        return this.reasonCode;
    }

    /**
     * Set the reasonCode property: The reasonCode.
     *
     * @param reasonCode the reasonCode value to set.
     * @return the DeleteOptions object itself.
     */
    public DeleteOptions withReasonCode(Float reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }

    /**
     * Get the feedback property: the feedback.
     *
     * @return the feedback value.
     */
    public String feedback() {
        return this.feedback;
    }

    /**
     * Set the feedback property: the feedback.
     *
     * @param feedback the feedback value to set.
     * @return the DeleteOptions object itself.
     */
    public DeleteOptions withFeedback(String feedback) {
        this.feedback = feedback;
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
