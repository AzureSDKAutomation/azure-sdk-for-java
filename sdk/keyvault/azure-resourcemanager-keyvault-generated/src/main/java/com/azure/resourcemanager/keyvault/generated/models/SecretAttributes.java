// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;

/** The secret management attributes. */
@Immutable
public final class SecretAttributes extends Attributes {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SecretAttributes.class);

    /** {@inheritDoc} */
    @Override
    public SecretAttributes withEnabled(Boolean enabled) {
        super.withEnabled(enabled);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SecretAttributes withNotBefore(Long notBefore) {
        super.withNotBefore(notBefore);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SecretAttributes withExpires(Long expires) {
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
