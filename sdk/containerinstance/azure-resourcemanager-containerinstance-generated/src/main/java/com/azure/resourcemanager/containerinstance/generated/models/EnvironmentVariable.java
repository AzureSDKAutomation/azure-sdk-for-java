// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The environment variable to set within the container instance. */
@Fluent
public final class EnvironmentVariable {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EnvironmentVariable.class);

    /*
     * The name of the environment variable.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The value of the environment variable.
     */
    @JsonProperty(value = "value")
    private String value;

    /*
     * The value of the secure environment variable.
     */
    @JsonProperty(value = "secureValue")
    private String secureValue;

    /**
     * Get the name property: The name of the environment variable.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the environment variable.
     *
     * @param name the name value to set.
     * @return the EnvironmentVariable object itself.
     */
    public EnvironmentVariable withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: The value of the environment variable.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The value of the environment variable.
     *
     * @param value the value value to set.
     * @return the EnvironmentVariable object itself.
     */
    public EnvironmentVariable withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the secureValue property: The value of the secure environment variable.
     *
     * @return the secureValue value.
     */
    public String secureValue() {
        return this.secureValue;
    }

    /**
     * Set the secureValue property: The value of the secure environment variable.
     *
     * @param secureValue the secureValue value to set.
     * @return the EnvironmentVariable object itself.
     */
    public EnvironmentVariable withSecureValue(String secureValue) {
        this.secureValue = secureValue;
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
                    new IllegalArgumentException("Missing required property name in model EnvironmentVariable"));
        }
    }
}
