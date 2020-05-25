/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Represents a Workspace definition.
 */
@JsonFlatten
public class WorkspaceInner extends Resource {
    /**
     * Description of Workspace.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Friendly name of Workspace.
     */
    @JsonProperty(value = "properties.friendlyName")
    private String friendlyName;

    /**
     * List of applicationGroup resource Ids.
     */
    @JsonProperty(value = "properties.applicationGroupReferences")
    private List<String> applicationGroupReferences;

    /**
     * Get description of Workspace.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description of Workspace.
     *
     * @param description the description value to set
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get friendly name of Workspace.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set friendly name of Workspace.
     *
     * @param friendlyName the friendlyName value to set
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get list of applicationGroup resource Ids.
     *
     * @return the applicationGroupReferences value
     */
    public List<String> applicationGroupReferences() {
        return this.applicationGroupReferences;
    }

    /**
     * Set list of applicationGroup resource Ids.
     *
     * @param applicationGroupReferences the applicationGroupReferences value to set
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withApplicationGroupReferences(List<String> applicationGroupReferences) {
        this.applicationGroupReferences = applicationGroupReferences;
        return this;
    }

}
