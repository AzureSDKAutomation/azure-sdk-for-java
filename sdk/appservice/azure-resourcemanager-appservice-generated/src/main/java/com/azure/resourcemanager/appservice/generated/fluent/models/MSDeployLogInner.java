// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.MSDeployLogEntry;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** MSDeploy log. */
@JsonFlatten
@Immutable
public class MSDeployLogInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MSDeployLogInner.class);

    /*
     * List of log entry messages
     */
    @JsonProperty(value = "properties.entries", access = JsonProperty.Access.WRITE_ONLY)
    private List<MSDeployLogEntry> entries;

    /**
     * Get the entries property: List of log entry messages.
     *
     * @return the entries value.
     */
    public List<MSDeployLogEntry> entries() {
        return this.entries;
    }

    /** {@inheritDoc} */
    @Override
    public MSDeployLogInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (entries() != null) {
            entries().forEach(e -> e.validate());
        }
    }
}
