// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.testbase.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A notification event receiver value. */
@Fluent
public final class NotificationReceiverValue {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NotificationReceiverValue.class);

    /*
     * The user object receiver value.
     */
    @JsonProperty(value = "userObjectReceiverValue")
    private UserObjectReceiverValue userObjectReceiverValue;

    /*
     * The user object receiver value.
     */
    @JsonProperty(value = "subscriptionReceiverValue")
    private SubscriptionReceiverValue subscriptionReceiverValue;

    /*
     * The user object receiver value.
     */
    @JsonProperty(value = "distributionGroupListReceiverValue")
    private DistributionGroupListReceiverValue distributionGroupListReceiverValue;

    /**
     * Get the userObjectReceiverValue property: The user object receiver value.
     *
     * @return the userObjectReceiverValue value.
     */
    public UserObjectReceiverValue userObjectReceiverValue() {
        return this.userObjectReceiverValue;
    }

    /**
     * Set the userObjectReceiverValue property: The user object receiver value.
     *
     * @param userObjectReceiverValue the userObjectReceiverValue value to set.
     * @return the NotificationReceiverValue object itself.
     */
    public NotificationReceiverValue withUserObjectReceiverValue(UserObjectReceiverValue userObjectReceiverValue) {
        this.userObjectReceiverValue = userObjectReceiverValue;
        return this;
    }

    /**
     * Get the subscriptionReceiverValue property: The user object receiver value.
     *
     * @return the subscriptionReceiverValue value.
     */
    public SubscriptionReceiverValue subscriptionReceiverValue() {
        return this.subscriptionReceiverValue;
    }

    /**
     * Set the subscriptionReceiverValue property: The user object receiver value.
     *
     * @param subscriptionReceiverValue the subscriptionReceiverValue value to set.
     * @return the NotificationReceiverValue object itself.
     */
    public NotificationReceiverValue withSubscriptionReceiverValue(
        SubscriptionReceiverValue subscriptionReceiverValue) {
        this.subscriptionReceiverValue = subscriptionReceiverValue;
        return this;
    }

    /**
     * Get the distributionGroupListReceiverValue property: The user object receiver value.
     *
     * @return the distributionGroupListReceiverValue value.
     */
    public DistributionGroupListReceiverValue distributionGroupListReceiverValue() {
        return this.distributionGroupListReceiverValue;
    }

    /**
     * Set the distributionGroupListReceiverValue property: The user object receiver value.
     *
     * @param distributionGroupListReceiverValue the distributionGroupListReceiverValue value to set.
     * @return the NotificationReceiverValue object itself.
     */
    public NotificationReceiverValue withDistributionGroupListReceiverValue(
        DistributionGroupListReceiverValue distributionGroupListReceiverValue) {
        this.distributionGroupListReceiverValue = distributionGroupListReceiverValue;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (userObjectReceiverValue() != null) {
            userObjectReceiverValue().validate();
        }
        if (subscriptionReceiverValue() != null) {
            subscriptionReceiverValue().validate();
        }
        if (distributionGroupListReceiverValue() != null) {
            distributionGroupListReceiverValue().validate();
        }
    }
}
