// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Azure action group. */
@Fluent
public final class AzNsActionGroup {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzNsActionGroup.class);

    /*
     * Azure Action Group reference.
     */
    @JsonProperty(value = "actionGroup")
    private List<String> actionGroup;

    /*
     * Custom subject override for all email ids in Azure action group
     */
    @JsonProperty(value = "emailSubject")
    private String emailSubject;

    /*
     * Custom payload to be sent for all webhook URI in Azure action group
     */
    @JsonProperty(value = "customWebhookPayload")
    private String customWebhookPayload;

    /**
     * Get the actionGroup property: Azure Action Group reference.
     *
     * @return the actionGroup value.
     */
    public List<String> actionGroup() {
        return this.actionGroup;
    }

    /**
     * Set the actionGroup property: Azure Action Group reference.
     *
     * @param actionGroup the actionGroup value to set.
     * @return the AzNsActionGroup object itself.
     */
    public AzNsActionGroup withActionGroup(List<String> actionGroup) {
        this.actionGroup = actionGroup;
        return this;
    }

    /**
     * Get the emailSubject property: Custom subject override for all email ids in Azure action group.
     *
     * @return the emailSubject value.
     */
    public String emailSubject() {
        return this.emailSubject;
    }

    /**
     * Set the emailSubject property: Custom subject override for all email ids in Azure action group.
     *
     * @param emailSubject the emailSubject value to set.
     * @return the AzNsActionGroup object itself.
     */
    public AzNsActionGroup withEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
        return this;
    }

    /**
     * Get the customWebhookPayload property: Custom payload to be sent for all webhook URI in Azure action group.
     *
     * @return the customWebhookPayload value.
     */
    public String customWebhookPayload() {
        return this.customWebhookPayload;
    }

    /**
     * Set the customWebhookPayload property: Custom payload to be sent for all webhook URI in Azure action group.
     *
     * @param customWebhookPayload the customWebhookPayload value to set.
     * @return the AzNsActionGroup object itself.
     */
    public AzNsActionGroup withCustomWebhookPayload(String customWebhookPayload) {
        this.customWebhookPayload = customWebhookPayload;
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
