// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;

/** The unique identifying details of the AZURE ML environment. */
@Fluent
public final class EnvironmentImageResponseEnvironmentReference extends EnvironmentReference {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(EnvironmentImageResponseEnvironmentReference.class);

    /** {@inheritDoc} */
    @Override
    public EnvironmentImageResponseEnvironmentReference withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EnvironmentImageResponseEnvironmentReference withVersion(String version) {
        super.withVersion(version);
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
