// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Represents a log file. */
@JsonFlatten
@Fluent
public class LogFileInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LogFileInner.class);

    /*
     * Size of the log file.
     */
    @JsonProperty(value = "properties.sizeInKB")
    private Long sizeInKB;

    /*
     * Creation timestamp of the log file.
     */
    @JsonProperty(value = "properties.createdTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdTime;

    /*
     * Last modified timestamp of the log file.
     */
    @JsonProperty(value = "properties.lastModifiedTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModifiedTime;

    /*
     * Type of the log file.
     */
    @JsonProperty(value = "properties.type")
    private String typePropertiesType;

    /*
     * The url to download the log file from.
     */
    @JsonProperty(value = "properties.url")
    private String url;

    /**
     * Get the sizeInKB property: Size of the log file.
     *
     * @return the sizeInKB value.
     */
    public Long sizeInKB() {
        return this.sizeInKB;
    }

    /**
     * Set the sizeInKB property: Size of the log file.
     *
     * @param sizeInKB the sizeInKB value to set.
     * @return the LogFileInner object itself.
     */
    public LogFileInner withSizeInKB(Long sizeInKB) {
        this.sizeInKB = sizeInKB;
        return this;
    }

    /**
     * Get the createdTime property: Creation timestamp of the log file.
     *
     * @return the createdTime value.
     */
    public OffsetDateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Get the lastModifiedTime property: Last modified timestamp of the log file.
     *
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Get the typePropertiesType property: Type of the log file.
     *
     * @return the typePropertiesType value.
     */
    public String typePropertiesType() {
        return this.typePropertiesType;
    }

    /**
     * Set the typePropertiesType property: Type of the log file.
     *
     * @param typePropertiesType the typePropertiesType value to set.
     * @return the LogFileInner object itself.
     */
    public LogFileInner withTypePropertiesType(String typePropertiesType) {
        this.typePropertiesType = typePropertiesType;
        return this;
    }

    /**
     * Get the url property: The url to download the log file from.
     *
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url property: The url to download the log file from.
     *
     * @param url the url value to set.
     * @return the LogFileInner object itself.
     */
    public LogFileInner withUrl(String url) {
        this.url = url;
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
