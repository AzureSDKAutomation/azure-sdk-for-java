// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The NotificationRegistrationPropertiesAutoGenerated model. */
@Fluent
public class NotificationRegistrationPropertiesAutoGenerated {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(NotificationRegistrationPropertiesAutoGenerated.class);

    /*
     * The notificationMode property.
     */
    @JsonProperty(value = "notificationMode")
    private NotificationMode notificationMode;

    /*
     * The messageScope property.
     */
    @JsonProperty(value = "messageScope")
    private MessageScope messageScope;

    /*
     * The includedEvents property.
     */
    @JsonProperty(value = "includedEvents")
    private List<String> includedEvents;

    /*
     * The notificationEndpoints property.
     */
    @JsonProperty(value = "notificationEndpoints")
    private List<NotificationEndpoint> notificationEndpoints;

    /*
     * The provisioningState property.
     */
    @JsonProperty(value = "provisioningState")
    private ProvisioningState provisioningState;

    /**
     * Get the notificationMode property: The notificationMode property.
     *
     * @return the notificationMode value.
     */
    public NotificationMode notificationMode() {
        return this.notificationMode;
    }

    /**
     * Set the notificationMode property: The notificationMode property.
     *
     * @param notificationMode the notificationMode value to set.
     * @return the NotificationRegistrationPropertiesAutoGenerated object itself.
     */
    public NotificationRegistrationPropertiesAutoGenerated withNotificationMode(NotificationMode notificationMode) {
        this.notificationMode = notificationMode;
        return this;
    }

    /**
     * Get the messageScope property: The messageScope property.
     *
     * @return the messageScope value.
     */
    public MessageScope messageScope() {
        return this.messageScope;
    }

    /**
     * Set the messageScope property: The messageScope property.
     *
     * @param messageScope the messageScope value to set.
     * @return the NotificationRegistrationPropertiesAutoGenerated object itself.
     */
    public NotificationRegistrationPropertiesAutoGenerated withMessageScope(MessageScope messageScope) {
        this.messageScope = messageScope;
        return this;
    }

    /**
     * Get the includedEvents property: The includedEvents property.
     *
     * @return the includedEvents value.
     */
    public List<String> includedEvents() {
        return this.includedEvents;
    }

    /**
     * Set the includedEvents property: The includedEvents property.
     *
     * @param includedEvents the includedEvents value to set.
     * @return the NotificationRegistrationPropertiesAutoGenerated object itself.
     */
    public NotificationRegistrationPropertiesAutoGenerated withIncludedEvents(List<String> includedEvents) {
        this.includedEvents = includedEvents;
        return this;
    }

    /**
     * Get the notificationEndpoints property: The notificationEndpoints property.
     *
     * @return the notificationEndpoints value.
     */
    public List<NotificationEndpoint> notificationEndpoints() {
        return this.notificationEndpoints;
    }

    /**
     * Set the notificationEndpoints property: The notificationEndpoints property.
     *
     * @param notificationEndpoints the notificationEndpoints value to set.
     * @return the NotificationRegistrationPropertiesAutoGenerated object itself.
     */
    public NotificationRegistrationPropertiesAutoGenerated withNotificationEndpoints(
        List<NotificationEndpoint> notificationEndpoints) {
        this.notificationEndpoints = notificationEndpoints;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioningState property.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioningState property.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the NotificationRegistrationPropertiesAutoGenerated object itself.
     */
    public NotificationRegistrationPropertiesAutoGenerated withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (notificationEndpoints() != null) {
            notificationEndpoints().forEach(e -> e.validate());
        }
    }
}
