// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Delete option with duration. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("AbsoluteDeleteOption")
@Fluent
public final class AbsoluteDeleteOption extends DeleteOption {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AbsoluteDeleteOption.class);

    /** {@inheritDoc} */
    @Override
    public AbsoluteDeleteOption withDuration(String duration) {
        super.withDuration(duration);
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
