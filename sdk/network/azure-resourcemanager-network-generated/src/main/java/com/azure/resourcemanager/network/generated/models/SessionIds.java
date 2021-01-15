// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of session IDs. */
@Fluent
public final class SessionIds {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SessionIds.class);

    /*
     * List of session IDs.
     */
    @JsonProperty(value = "sessionIds")
    private List<String> sessionIds;

    /**
     * Get the sessionIds property: List of session IDs.
     *
     * @return the sessionIds value.
     */
    public List<String> sessionIds() {
        return this.sessionIds;
    }

    /**
     * Set the sessionIds property: List of session IDs.
     *
     * @param sessionIds the sessionIds value to set.
     * @return the SessionIds object itself.
     */
    public SessionIds withSessionIds(List<String> sessionIds) {
        this.sessionIds = sessionIds;
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
