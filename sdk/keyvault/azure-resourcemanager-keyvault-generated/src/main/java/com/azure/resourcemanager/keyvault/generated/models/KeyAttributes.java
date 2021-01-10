// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;

/** The attributes of the key. */
@Immutable
public final class KeyAttributes extends Attributes {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KeyAttributes.class);

    /** {@inheritDoc} */
    @Override
    public KeyAttributes withEnabled(Boolean enabled) {
        super.withEnabled(enabled);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public KeyAttributes withNotBefore(Long notBefore) {
        super.withNotBefore(notBefore);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public KeyAttributes withExpires(Long expires) {
        super.withExpires(expires);
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
