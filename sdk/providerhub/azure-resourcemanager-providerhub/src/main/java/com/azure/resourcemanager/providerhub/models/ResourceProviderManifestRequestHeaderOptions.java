// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;

/** The ResourceProviderManifestRequestHeaderOptions model. */
@Immutable
public final class ResourceProviderManifestRequestHeaderOptions extends RequestHeaderOptions {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ResourceProviderManifestRequestHeaderOptions.class);

    /** {@inheritDoc} */
    @Override
    public ResourceProviderManifestRequestHeaderOptions withOptInHeaders(OptInHeaderType optInHeaders) {
        super.withOptInHeaders(optInHeaders);
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
    }
}
