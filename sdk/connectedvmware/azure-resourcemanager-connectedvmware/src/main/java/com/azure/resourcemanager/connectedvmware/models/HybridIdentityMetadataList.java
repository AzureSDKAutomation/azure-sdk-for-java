// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.connectedvmware.fluent.models.HybridIdentityMetadataInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of HybridIdentityMetadata. */
@Fluent
public final class HybridIdentityMetadataList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HybridIdentityMetadataList.class);

    /*
     * Url to follow for getting next page of HybridIdentityMetadata.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * Array of HybridIdentityMetadata
     */
    @JsonProperty(value = "value", required = true)
    private List<HybridIdentityMetadataInner> value;

    /**
     * Get the nextLink property: Url to follow for getting next page of HybridIdentityMetadata.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Url to follow for getting next page of HybridIdentityMetadata.
     *
     * @param nextLink the nextLink value to set.
     * @return the HybridIdentityMetadataList object itself.
     */
    public HybridIdentityMetadataList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: Array of HybridIdentityMetadata.
     *
     * @return the value value.
     */
    public List<HybridIdentityMetadataInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Array of HybridIdentityMetadata.
     *
     * @param value the value value to set.
     * @return the HybridIdentityMetadataList object itself.
     */
    public HybridIdentityMetadataList withValue(List<HybridIdentityMetadataInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model HybridIdentityMetadataList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
