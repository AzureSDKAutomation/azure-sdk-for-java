// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** An azure resource object. */
@Fluent
public class AzureResource extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureResource.class);

    /*
     * Azure resource kind
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /*
     * Azure resource identity
     */
    @JsonProperty(value = "identity", access = JsonProperty.Access.WRITE_ONLY)
    private String identity;

    /**
     * Get the kind property: Azure resource kind.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get the identity property: Azure resource identity.
     *
     * @return the identity value.
     */
    public String identity() {
        return this.identity;
    }

    /** {@inheritDoc} */
    @Override
    public AzureResource withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureResource withTags(Map<String, String> tags) {
        super.withTags(tags);
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
