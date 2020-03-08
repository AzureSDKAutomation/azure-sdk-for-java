/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_04_01_preview.implementation;

import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.PartnerTopicProvisioningState;
import com.microsoft.azure.management.eventgrid.v2020_04_01_preview.PartnerTopicActivationState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * EventGrid Partner Topic.
 */
@JsonFlatten
public class PartnerTopicInner extends Resource {
    /**
     * Source associated with this partner topic. This represents a unique
     * partner resource.
     */
    @JsonProperty(value = "properties.source")
    private String source;

    /**
     * Provisioning state of the partner topic. Possible values include:
     * 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Canceled', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private PartnerTopicProvisioningState provisioningState;

    /**
     * Activation state of the partner topic. Possible values include:
     * 'NeverActivated', 'Activated', 'Deactivated'.
     */
    @JsonProperty(value = "properties.activationState")
    private PartnerTopicActivationState activationState;

    /**
     * Get source associated with this partner topic. This represents a unique partner resource.
     *
     * @return the source value
     */
    public String source() {
        return this.source;
    }

    /**
     * Set source associated with this partner topic. This represents a unique partner resource.
     *
     * @param source the source value to set
     * @return the PartnerTopicInner object itself.
     */
    public PartnerTopicInner withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get provisioning state of the partner topic. Possible values include: 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Canceled', 'Failed'.
     *
     * @return the provisioningState value
     */
    public PartnerTopicProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get activation state of the partner topic. Possible values include: 'NeverActivated', 'Activated', 'Deactivated'.
     *
     * @return the activationState value
     */
    public PartnerTopicActivationState activationState() {
        return this.activationState;
    }

    /**
     * Set activation state of the partner topic. Possible values include: 'NeverActivated', 'Activated', 'Deactivated'.
     *
     * @param activationState the activationState value to set
     * @return the PartnerTopicInner object itself.
     */
    public PartnerTopicInner withActivationState(PartnerTopicActivationState activationState) {
        this.activationState = activationState;
        return this;
    }

}
