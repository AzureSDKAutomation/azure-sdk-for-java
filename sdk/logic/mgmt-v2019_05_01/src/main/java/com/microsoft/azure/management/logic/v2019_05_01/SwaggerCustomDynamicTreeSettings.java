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
 * The swagger custom dynamic tree settings.
 */
public class SwaggerCustomDynamicTreeSettings {
    /**
     * Indicates whether parent nodes can be selected.
     */
    @JsonProperty(value = "CanSelectParentNodes")
    private Boolean canSelectParentNodes;

    /**
     * Indicates whether leaf nodes can be selected.
     */
    @JsonProperty(value = "CanSelectLeafNodes")
    private Boolean canSelectLeafNodes;

    /**
     * Get indicates whether parent nodes can be selected.
     *
     * @return the canSelectParentNodes value
     */
    public Boolean canSelectParentNodes() {
        return this.canSelectParentNodes;
    }

    /**
     * Set indicates whether parent nodes can be selected.
     *
     * @param canSelectParentNodes the canSelectParentNodes value to set
     * @return the SwaggerCustomDynamicTreeSettings object itself.
     */
    public SwaggerCustomDynamicTreeSettings withCanSelectParentNodes(Boolean canSelectParentNodes) {
        this.canSelectParentNodes = canSelectParentNodes;
        return this;
    }

    /**
     * Get indicates whether leaf nodes can be selected.
     *
     * @return the canSelectLeafNodes value
     */
    public Boolean canSelectLeafNodes() {
        return this.canSelectLeafNodes;
    }

    /**
     * Set indicates whether leaf nodes can be selected.
     *
     * @param canSelectLeafNodes the canSelectLeafNodes value to set
     * @return the SwaggerCustomDynamicTreeSettings object itself.
     */
    public SwaggerCustomDynamicTreeSettings withCanSelectLeafNodes(Boolean canSelectLeafNodes) {
        this.canSelectLeafNodes = canSelectLeafNodes;
        return this;
    }

}
