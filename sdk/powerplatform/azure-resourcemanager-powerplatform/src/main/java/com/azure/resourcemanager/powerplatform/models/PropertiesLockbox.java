// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Settings concerning lockbox. */
@Fluent
public final class PropertiesLockbox {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PropertiesLockbox.class);

    /*
     * lockbox configuration
     */
    @JsonProperty(value = "state")
    private State state;

    /**
     * Get the state property: lockbox configuration.
     *
     * @return the state value.
     */
    public State state() {
        return this.state;
    }

    /**
     * Set the state property: lockbox configuration.
     *
     * @param state the state value to set.
     * @return the PropertiesLockbox object itself.
     */
    public PropertiesLockbox withState(State state) {
        this.state = state;
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
