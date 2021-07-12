// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlhsc.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.postgresqlhsc.models.ConfigurationDataType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents a configuration. */
@JsonFlatten
@Fluent
public class ServerConfigurationInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServerConfigurationInner.class);

    /*
     * The system metadata relating to this resource
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Value of the configuration.
     */
    @JsonProperty(value = "properties.value")
    private String value;

    /*
     * Source of the configuration.
     */
    @JsonProperty(value = "properties.source", access = JsonProperty.Access.WRITE_ONLY)
    private String source;

    /*
     * Description of the configuration.
     */
    @JsonProperty(value = "properties.description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * Default value of the configuration.
     */
    @JsonProperty(value = "properties.defaultValue", access = JsonProperty.Access.WRITE_ONLY)
    private String defaultValue;

    /*
     * Data type of the configuration.
     */
    @JsonProperty(value = "properties.dataType", access = JsonProperty.Access.WRITE_ONLY)
    private ConfigurationDataType dataType;

    /*
     * Allowed values of the configuration.
     */
    @JsonProperty(value = "properties.allowedValues", access = JsonProperty.Access.WRITE_ONLY)
    private String allowedValues;

    /**
     * Get the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the value property: Value of the configuration.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Value of the configuration.
     *
     * @param value the value value to set.
     * @return the ServerConfigurationInner object itself.
     */
    public ServerConfigurationInner withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the source property: Source of the configuration.
     *
     * @return the source value.
     */
    public String source() {
        return this.source;
    }

    /**
     * Get the description property: Description of the configuration.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the defaultValue property: Default value of the configuration.
     *
     * @return the defaultValue value.
     */
    public String defaultValue() {
        return this.defaultValue;
    }

    /**
     * Get the dataType property: Data type of the configuration.
     *
     * @return the dataType value.
     */
    public ConfigurationDataType dataType() {
        return this.dataType;
    }

    /**
     * Get the allowedValues property: Allowed values of the configuration.
     *
     * @return the allowedValues value.
     */
    public String allowedValues() {
        return this.allowedValues;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
