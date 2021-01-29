// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.loganalytics.models.DataSourceKind;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Datasources under OMS Workspace. */
@Fluent
public final class DataSourceInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataSourceInner.class);

    /*
     * The data source properties in raw json format, each kind of data source
     * have it's own schema.
     */
    @JsonProperty(value = "properties", required = true)
    private Map<String, Object> properties;

    /*
     * The ETag of the data source.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * The kind of the DataSource.
     */
    @JsonProperty(value = "kind", required = true)
    private DataSourceKind kind;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the properties property: The data source properties in raw json format, each kind of data source have it's
     * own schema.
     *
     * @return the properties value.
     */
    public Map<String, Object> properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The data source properties in raw json format, each kind of data source have it's
     * own schema.
     *
     * @param properties the properties value to set.
     * @return the DataSourceInner object itself.
     */
    public DataSourceInner withProperties(Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the etag property: The ETag of the data source.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: The ETag of the data source.
     *
     * @param etag the etag value to set.
     * @return the DataSourceInner object itself.
     */
    public DataSourceInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the kind property: The kind of the DataSource.
     *
     * @return the kind value.
     */
    public DataSourceKind kind() {
        return this.kind;
    }

    /**
     * Set the kind property: The kind of the DataSource.
     *
     * @param kind the kind value to set.
     * @return the DataSourceInner object itself.
     */
    public DataSourceInner withKind(DataSourceKind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the DataSourceInner object itself.
     */
    public DataSourceInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property properties in model DataSourceInner"));
        }
        if (kind() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property kind in model DataSourceInner"));
        }
    }
}
