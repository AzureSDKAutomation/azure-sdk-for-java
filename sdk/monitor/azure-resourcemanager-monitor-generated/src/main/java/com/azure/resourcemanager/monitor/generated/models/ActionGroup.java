// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** A pointer to an Azure Action Group. */
@Fluent
public final class ActionGroup {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ActionGroup.class);

    /*
     * The resource ID of the Action Group. This cannot be null or empty.
     */
    @JsonProperty(value = "actionGroupId", required = true)
    private String actionGroupId;

    /*
     * the dictionary of custom properties to include with the post operation.
     * These data are appended to the webhook payload.
     */
    @JsonProperty(value = "webhookProperties")
    private Map<String, String> webhookProperties;

    /**
     * Get the actionGroupId property: The resource ID of the Action Group. This cannot be null or empty.
     *
     * @return the actionGroupId value.
     */
    public String actionGroupId() {
        return this.actionGroupId;
    }

    /**
     * Set the actionGroupId property: The resource ID of the Action Group. This cannot be null or empty.
     *
     * @param actionGroupId the actionGroupId value to set.
     * @return the ActionGroup object itself.
     */
    public ActionGroup withActionGroupId(String actionGroupId) {
        this.actionGroupId = actionGroupId;
        return this;
    }

    /**
     * Get the webhookProperties property: the dictionary of custom properties to include with the post operation. These
     * data are appended to the webhook payload.
     *
     * @return the webhookProperties value.
     */
    public Map<String, String> webhookProperties() {
        return this.webhookProperties;
    }

    /**
     * Set the webhookProperties property: the dictionary of custom properties to include with the post operation. These
     * data are appended to the webhook payload.
     *
     * @param webhookProperties the webhookProperties value to set.
     * @return the ActionGroup object itself.
     */
    public ActionGroup withWebhookProperties(Map<String, String> webhookProperties) {
        this.webhookProperties = webhookProperties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (actionGroupId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property actionGroupId in model ActionGroup"));
        }
    }
}
