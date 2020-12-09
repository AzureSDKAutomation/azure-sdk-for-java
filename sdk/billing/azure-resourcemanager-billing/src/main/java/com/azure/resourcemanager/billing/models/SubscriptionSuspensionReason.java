// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The subscription state reason. */
@Fluent
public final class SubscriptionSuspensionReason {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SubscriptionSuspensionReason.class);

    /*
     * Subscription suspension reason.
     */
    @JsonProperty(value = "value")
    private SubscriptionSuspensionReasonValue value;

    /**
     * Get the value property: Subscription suspension reason.
     *
     * @return the value value.
     */
    public SubscriptionSuspensionReasonValue value() {
        return this.value;
    }

    /**
     * Set the value property: Subscription suspension reason.
     *
     * @param value the value value to set.
     * @return the SubscriptionSuspensionReason object itself.
     */
    public SubscriptionSuspensionReason withValue(SubscriptionSuspensionReasonValue value) {
        this.value = value;
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
