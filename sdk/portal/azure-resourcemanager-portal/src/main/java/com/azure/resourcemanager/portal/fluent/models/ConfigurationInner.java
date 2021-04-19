// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.portal.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Tenant configuration. */
@JsonFlatten
@Fluent
public class ConfigurationInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConfigurationInner.class);

    /*
     * When flag is set to true Markdown tile will require external storage
     * configuration (URI). The inline content configuration will be
     * prohibited.
     */
    @JsonProperty(value = "properties.enforcePrivateMarkdownStorage")
    private Boolean enforcePrivateMarkdownStorage;

    /**
     * Get the enforcePrivateMarkdownStorage property: When flag is set to true Markdown tile will require external
     * storage configuration (URI). The inline content configuration will be prohibited.
     *
     * @return the enforcePrivateMarkdownStorage value.
     */
    public Boolean enforcePrivateMarkdownStorage() {
        return this.enforcePrivateMarkdownStorage;
    }

    /**
     * Set the enforcePrivateMarkdownStorage property: When flag is set to true Markdown tile will require external
     * storage configuration (URI). The inline content configuration will be prohibited.
     *
     * @param enforcePrivateMarkdownStorage the enforcePrivateMarkdownStorage value to set.
     * @return the ConfigurationInner object itself.
     */
    public ConfigurationInner withEnforcePrivateMarkdownStorage(Boolean enforcePrivateMarkdownStorage) {
        this.enforcePrivateMarkdownStorage = enforcePrivateMarkdownStorage;
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
