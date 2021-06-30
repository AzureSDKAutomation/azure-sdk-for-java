// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** File storage information. */
@Fluent
public final class FileStorageInfoInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FileStorageInfoInner.class);

    /*
     * A URI that can be used to access the file content.
     */
    @JsonProperty(value = "uri")
    private String uri;

    /*
     * Dictionary of <string>
     */
    @JsonProperty(value = "headers")
    private Map<String, String> headers;

    /**
     * Get the uri property: A URI that can be used to access the file content.
     *
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri property: A URI that can be used to access the file content.
     *
     * @param uri the uri value to set.
     * @return the FileStorageInfoInner object itself.
     */
    public FileStorageInfoInner withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the headers property: Dictionary of &lt;string&gt;.
     *
     * @return the headers value.
     */
    public Map<String, String> headers() {
        return this.headers;
    }

    /**
     * Set the headers property: Dictionary of &lt;string&gt;.
     *
     * @param headers the headers value to set.
     * @return the FileStorageInfoInner object itself.
     */
    public FileStorageInfoInner withHeaders(Map<String, String> headers) {
        this.headers = headers;
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
