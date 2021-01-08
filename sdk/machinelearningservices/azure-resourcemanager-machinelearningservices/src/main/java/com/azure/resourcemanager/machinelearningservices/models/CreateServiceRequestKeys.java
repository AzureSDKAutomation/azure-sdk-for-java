// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearningservices.fluent.models.AuthKeysInner;
import com.fasterxml.jackson.annotation.JsonIgnore;

/** The authentication keys. */
@Immutable
public final class CreateServiceRequestKeys extends AuthKeysInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CreateServiceRequestKeys.class);

    /** {@inheritDoc} */
    @Override
    public CreateServiceRequestKeys withPrimaryKey(String primaryKey) {
        super.withPrimaryKey(primaryKey);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CreateServiceRequestKeys withSecondaryKey(String secondaryKey) {
        super.withSecondaryKey(secondaryKey);
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
