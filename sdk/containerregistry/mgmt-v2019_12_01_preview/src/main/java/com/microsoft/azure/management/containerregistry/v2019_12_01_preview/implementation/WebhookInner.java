/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview.implementation;

import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.WebhookStatus;
import java.util.List;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.WebhookAction;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * An object that represents a webhook for a container registry.
 */
@JsonFlatten
public class WebhookInner extends Resource {
    /**
     * The status of the webhook at the time the operation was called. Possible
     * values include: 'enabled', 'disabled'.
     */
    @JsonProperty(value = "properties.status")
    private WebhookStatus status;

    /**
     * The scope of repositories where the event can be triggered. For example,
     * 'foo:*' means events for all tags under repository 'foo'. 'foo:bar'
     * means events for 'foo:bar' only. 'foo' is equivalent to 'foo:latest'.
     * Empty means all events.
     */
    @JsonProperty(value = "properties.scope")
    private String scope;

    /**
     * The list of actions that trigger the webhook to post notifications.
     */
    @JsonProperty(value = "properties.actions", required = true)
    private List<WebhookAction> actions;

    /**
     * The provisioning state of the webhook at the time the operation was
     * called. Possible values include: 'Creating', 'Updating', 'Deleting',
     * 'Succeeded', 'Failed', 'Canceled'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the status of the webhook at the time the operation was called. Possible values include: 'enabled', 'disabled'.
     *
     * @return the status value
     */
    public WebhookStatus status() {
        return this.status;
    }

    /**
     * Set the status of the webhook at the time the operation was called. Possible values include: 'enabled', 'disabled'.
     *
     * @param status the status value to set
     * @return the WebhookInner object itself.
     */
    public WebhookInner withStatus(WebhookStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the scope of repositories where the event can be triggered. For example, 'foo:*' means events for all tags under repository 'foo'. 'foo:bar' means events for 'foo:bar' only. 'foo' is equivalent to 'foo:latest'. Empty means all events.
     *
     * @return the scope value
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope of repositories where the event can be triggered. For example, 'foo:*' means events for all tags under repository 'foo'. 'foo:bar' means events for 'foo:bar' only. 'foo' is equivalent to 'foo:latest'. Empty means all events.
     *
     * @param scope the scope value to set
     * @return the WebhookInner object itself.
     */
    public WebhookInner withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the list of actions that trigger the webhook to post notifications.
     *
     * @return the actions value
     */
    public List<WebhookAction> actions() {
        return this.actions;
    }

    /**
     * Set the list of actions that trigger the webhook to post notifications.
     *
     * @param actions the actions value to set
     * @return the WebhookInner object itself.
     */
    public WebhookInner withActions(List<WebhookAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Get the provisioning state of the webhook at the time the operation was called. Possible values include: 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Failed', 'Canceled'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

}
