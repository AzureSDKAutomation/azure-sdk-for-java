// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.models.LedgerDigestUploadsState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure SQL Database ledger digest upload settings. */
@JsonFlatten
@Fluent
public class LedgerDigestUploadsInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LedgerDigestUploadsInner.class);

    /*
     * The digest storage endpoint, which must be either an Azure blob storage
     * endpoint or an URI for Azure Confidential Ledger.
     */
    @JsonProperty(value = "properties.digestStorageEndpoint")
    private String digestStorageEndpoint;

    /*
     * Specifies the state of ledger digest upload.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private LedgerDigestUploadsState state;

    /**
     * Get the digestStorageEndpoint property: The digest storage endpoint, which must be either an Azure blob storage
     * endpoint or an URI for Azure Confidential Ledger.
     *
     * @return the digestStorageEndpoint value.
     */
    public String digestStorageEndpoint() {
        return this.digestStorageEndpoint;
    }

    /**
     * Set the digestStorageEndpoint property: The digest storage endpoint, which must be either an Azure blob storage
     * endpoint or an URI for Azure Confidential Ledger.
     *
     * @param digestStorageEndpoint the digestStorageEndpoint value to set.
     * @return the LedgerDigestUploadsInner object itself.
     */
    public LedgerDigestUploadsInner withDigestStorageEndpoint(String digestStorageEndpoint) {
        this.digestStorageEndpoint = digestStorageEndpoint;
        return this;
    }

    /**
     * Get the state property: Specifies the state of ledger digest upload.
     *
     * @return the state value.
     */
    public LedgerDigestUploadsState state() {
        return this.state;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
