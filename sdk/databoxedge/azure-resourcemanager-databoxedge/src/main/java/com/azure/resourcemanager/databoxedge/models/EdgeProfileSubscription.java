// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Subscription details for the Edge Profile. */
@JsonFlatten
@Fluent
public class EdgeProfileSubscription {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EdgeProfileSubscription.class);

    /*
     * Edge Subscription Registration ID
     */
    @JsonProperty(value = "registrationId")
    private String registrationId;

    /*
     * ARM ID of the subscription
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The state property.
     */
    @JsonProperty(value = "state")
    private SubscriptionState state;

    /*
     * The registrationDate property.
     */
    @JsonProperty(value = "registrationDate")
    private String registrationDate;

    /*
     * The subscriptionId property.
     */
    @JsonProperty(value = "subscriptionId")
    private String subscriptionId;

    /*
     * The tenantId property.
     */
    @JsonProperty(value = "properties.tenantId")
    private String tenantId;

    /*
     * The locationPlacementId property.
     */
    @JsonProperty(value = "properties.locationPlacementId")
    private String locationPlacementId;

    /*
     * The quotaId property.
     */
    @JsonProperty(value = "properties.quotaId")
    private String quotaId;

    /*
     * The serializedDetails property.
     */
    @JsonProperty(value = "properties.serializedDetails")
    private String serializedDetails;

    /*
     * The registeredFeatures property.
     */
    @JsonProperty(value = "properties.registeredFeatures")
    private List<SubscriptionRegisteredFeatures> registeredFeatures;

    /**
     * Get the registrationId property: Edge Subscription Registration ID.
     *
     * @return the registrationId value.
     */
    public String registrationId() {
        return this.registrationId;
    }

    /**
     * Set the registrationId property: Edge Subscription Registration ID.
     *
     * @param registrationId the registrationId value to set.
     * @return the EdgeProfileSubscription object itself.
     */
    public EdgeProfileSubscription withRegistrationId(String registrationId) {
        this.registrationId = registrationId;
        return this;
    }

    /**
     * Get the id property: ARM ID of the subscription.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: ARM ID of the subscription.
     *
     * @param id the id value to set.
     * @return the EdgeProfileSubscription object itself.
     */
    public EdgeProfileSubscription withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the state property: The state property.
     *
     * @return the state value.
     */
    public SubscriptionState state() {
        return this.state;
    }

    /**
     * Set the state property: The state property.
     *
     * @param state the state value to set.
     * @return the EdgeProfileSubscription object itself.
     */
    public EdgeProfileSubscription withState(SubscriptionState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the registrationDate property: The registrationDate property.
     *
     * @return the registrationDate value.
     */
    public String registrationDate() {
        return this.registrationDate;
    }

    /**
     * Set the registrationDate property: The registrationDate property.
     *
     * @param registrationDate the registrationDate value to set.
     * @return the EdgeProfileSubscription object itself.
     */
    public EdgeProfileSubscription withRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
        return this;
    }

    /**
     * Get the subscriptionId property: The subscriptionId property.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: The subscriptionId property.
     *
     * @param subscriptionId the subscriptionId value to set.
     * @return the EdgeProfileSubscription object itself.
     */
    public EdgeProfileSubscription withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the tenantId property: The tenantId property.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The tenantId property.
     *
     * @param tenantId the tenantId value to set.
     * @return the EdgeProfileSubscription object itself.
     */
    public EdgeProfileSubscription withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the locationPlacementId property: The locationPlacementId property.
     *
     * @return the locationPlacementId value.
     */
    public String locationPlacementId() {
        return this.locationPlacementId;
    }

    /**
     * Set the locationPlacementId property: The locationPlacementId property.
     *
     * @param locationPlacementId the locationPlacementId value to set.
     * @return the EdgeProfileSubscription object itself.
     */
    public EdgeProfileSubscription withLocationPlacementId(String locationPlacementId) {
        this.locationPlacementId = locationPlacementId;
        return this;
    }

    /**
     * Get the quotaId property: The quotaId property.
     *
     * @return the quotaId value.
     */
    public String quotaId() {
        return this.quotaId;
    }

    /**
     * Set the quotaId property: The quotaId property.
     *
     * @param quotaId the quotaId value to set.
     * @return the EdgeProfileSubscription object itself.
     */
    public EdgeProfileSubscription withQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }

    /**
     * Get the serializedDetails property: The serializedDetails property.
     *
     * @return the serializedDetails value.
     */
    public String serializedDetails() {
        return this.serializedDetails;
    }

    /**
     * Set the serializedDetails property: The serializedDetails property.
     *
     * @param serializedDetails the serializedDetails value to set.
     * @return the EdgeProfileSubscription object itself.
     */
    public EdgeProfileSubscription withSerializedDetails(String serializedDetails) {
        this.serializedDetails = serializedDetails;
        return this;
    }

    /**
     * Get the registeredFeatures property: The registeredFeatures property.
     *
     * @return the registeredFeatures value.
     */
    public List<SubscriptionRegisteredFeatures> registeredFeatures() {
        return this.registeredFeatures;
    }

    /**
     * Set the registeredFeatures property: The registeredFeatures property.
     *
     * @param registeredFeatures the registeredFeatures value to set.
     * @return the EdgeProfileSubscription object itself.
     */
    public EdgeProfileSubscription withRegisteredFeatures(List<SubscriptionRegisteredFeatures> registeredFeatures) {
        this.registeredFeatures = registeredFeatures;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (registeredFeatures() != null) {
            registeredFeatures().forEach(e -> e.validate());
        }
    }
}
