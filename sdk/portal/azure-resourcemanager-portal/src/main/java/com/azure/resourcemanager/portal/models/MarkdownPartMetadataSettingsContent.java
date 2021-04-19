// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.portal.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The content of markdown part. */
@Fluent
public final class MarkdownPartMetadataSettingsContent {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MarkdownPartMetadataSettingsContent.class);

    /*
     * The setting of the content of markdown part.
     */
    @JsonProperty(value = "settings")
    private MarkdownPartMetadataSettingsContentSettings settings;

    /**
     * Get the settings property: The setting of the content of markdown part.
     *
     * @return the settings value.
     */
    public MarkdownPartMetadataSettingsContentSettings settings() {
        return this.settings;
    }

    /**
     * Set the settings property: The setting of the content of markdown part.
     *
     * @param settings the settings value to set.
     * @return the MarkdownPartMetadataSettingsContent object itself.
     */
    public MarkdownPartMetadataSettingsContent withSettings(MarkdownPartMetadataSettingsContentSettings settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (settings() != null) {
            settings().validate();
        }
    }
}
