// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The parameters used to regenerate the login credential. */
@Fluent
public final class RegenerateCredentialParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RegenerateCredentialParameters.class);

    /*
     * Specifies name of the password which should be regenerated -- password
     * or password2.
     */
    @JsonProperty(value = "name", required = true)
    private PasswordName name;

    /**
     * Get the name property: Specifies name of the password which should be regenerated -- password or password2.
     *
     * @return the name value.
     */
    public PasswordName name() {
        return this.name;
    }

    /**
     * Set the name property: Specifies name of the password which should be regenerated -- password or password2.
     *
     * @param name the name value to set.
     * @return the RegenerateCredentialParameters object itself.
     */
    public RegenerateCredentialParameters withName(PasswordName name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model RegenerateCredentialParameters"));
        }
    }
}
