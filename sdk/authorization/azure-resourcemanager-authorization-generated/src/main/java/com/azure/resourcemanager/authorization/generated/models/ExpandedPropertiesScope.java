// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Details of the resource scope. */
@Fluent
public final class ExpandedPropertiesScope {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExpandedPropertiesScope.class);

    /*
     * Scope id of the resource
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Display name of the resource
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Type of the resource
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the id property: Scope id of the resource.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Scope id of the resource.
     *
     * @param id the id value to set.
     * @return the ExpandedPropertiesScope object itself.
     */
    public ExpandedPropertiesScope withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the displayName property: Display name of the resource.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name of the resource.
     *
     * @param displayName the displayName value to set.
     * @return the ExpandedPropertiesScope object itself.
     */
    public ExpandedPropertiesScope withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the type property: Type of the resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Type of the resource.
     *
     * @param type the type value to set.
     * @return the ExpandedPropertiesScope object itself.
     */
    public ExpandedPropertiesScope withType(String type) {
        this.type = type;
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
