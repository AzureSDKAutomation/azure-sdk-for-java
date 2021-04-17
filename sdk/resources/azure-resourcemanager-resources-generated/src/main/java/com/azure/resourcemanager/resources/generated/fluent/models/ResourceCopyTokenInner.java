// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResourceCopyToken model. */
@Fluent
public final class ResourceCopyTokenInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceCopyTokenInner.class);

    /*
     * Resource copy token.
     */
    @JsonProperty(value = "token")
    private String token;

    /**
     * Get the token property: Resource copy token.
     *
     * @return the token value.
     */
    public String token() {
        return this.token;
    }

    /**
     * Set the token property: Resource copy token.
     *
     * @param token the token value to set.
     * @return the ResourceCopyTokenInner object itself.
     */
    public ResourceCopyTokenInner withToken(String token) {
        this.token = token;
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
