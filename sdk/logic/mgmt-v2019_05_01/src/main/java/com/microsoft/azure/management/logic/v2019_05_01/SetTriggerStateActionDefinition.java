/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2019_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The set trigger state action definition.
 */
public class SetTriggerStateActionDefinition {
    /**
     * The source.
     */
    @JsonProperty(value = "source", required = true)
    private WorkflowTriggerReference source;

    /**
     * Get the source.
     *
     * @return the source value
     */
    public WorkflowTriggerReference source() {
        return this.source;
    }

    /**
     * Set the source.
     *
     * @param source the source value to set
     * @return the SetTriggerStateActionDefinition object itself.
     */
    public SetTriggerStateActionDefinition withSource(WorkflowTriggerReference source) {
        this.source = source;
        return this;
    }

}
