/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PipelineSourceTriggerProperties model.
 */
public class PipelineSourceTriggerProperties {
    /**
     * The current status of the source trigger. Possible values include:
     * 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "status", required = true)
    private TriggerStatus status;

    /**
     * Get the current status of the source trigger. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the status value
     */
    public TriggerStatus status() {
        return this.status;
    }

    /**
     * Set the current status of the source trigger. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param status the status value to set
     * @return the PipelineSourceTriggerProperties object itself.
     */
    public PipelineSourceTriggerProperties withStatus(TriggerStatus status) {
        this.status = status;
        return this;
    }

}
