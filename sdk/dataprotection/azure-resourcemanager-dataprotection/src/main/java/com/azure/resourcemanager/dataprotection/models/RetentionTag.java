// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Retention tag. */
@Fluent
public final class RetentionTag {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RetentionTag.class);

    /*
     * Retention Tag version.
     */
    @JsonProperty(value = "eTag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Retention Tag version.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Retention Tag Name to relate it to retention rule.
     */
    @JsonProperty(value = "tagName", required = true)
    private String tagName;

    /**
     * Get the etag property: Retention Tag version.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the id property: Retention Tag version.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the tagName property: Retention Tag Name to relate it to retention rule.
     *
     * @return the tagName value.
     */
    public String tagName() {
        return this.tagName;
    }

    /**
     * Set the tagName property: Retention Tag Name to relate it to retention rule.
     *
     * @param tagName the tagName value to set.
     * @return the RetentionTag object itself.
     */
    public RetentionTag withTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (tagName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property tagName in model RetentionTag"));
        }
    }
}
