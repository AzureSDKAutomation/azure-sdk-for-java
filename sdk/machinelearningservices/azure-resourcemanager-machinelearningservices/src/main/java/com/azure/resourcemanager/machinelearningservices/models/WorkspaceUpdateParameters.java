// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The parameters for updating a machine learning workspace. */
@JsonFlatten
@Fluent
public class WorkspaceUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WorkspaceUpdateParameters.class);

    /*
     * The resource tags for the machine learning workspace.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * The sku of the workspace.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * The description of this workspace.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * The friendly name for this workspace.
     */
    @JsonProperty(value = "properties.friendlyName")
    private String friendlyName;

    /**
     * Get the tags property: The resource tags for the machine learning workspace.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The resource tags for the machine learning workspace.
     *
     * @param tags the tags value to set.
     * @return the WorkspaceUpdateParameters object itself.
     */
    public WorkspaceUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the sku property: The sku of the workspace.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The sku of the workspace.
     *
     * @param sku the sku value to set.
     * @return the WorkspaceUpdateParameters object itself.
     */
    public WorkspaceUpdateParameters withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the description property: The description of this workspace.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of this workspace.
     *
     * @param description the description value to set.
     * @return the WorkspaceUpdateParameters object itself.
     */
    public WorkspaceUpdateParameters withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the friendlyName property: The friendly name for this workspace.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: The friendly name for this workspace.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the WorkspaceUpdateParameters object itself.
     */
    public WorkspaceUpdateParameters withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
    }
}
