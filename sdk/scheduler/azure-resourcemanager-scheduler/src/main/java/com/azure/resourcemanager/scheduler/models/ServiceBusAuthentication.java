// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scheduler.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ServiceBusAuthentication model. */
@Fluent
public final class ServiceBusAuthentication {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServiceBusAuthentication.class);

    /*
     * Gets or sets the SAS key.
     */
    @JsonProperty(value = "sasKey")
    private String sasKey;

    /*
     * Gets or sets the SAS key name.
     */
    @JsonProperty(value = "sasKeyName")
    private String sasKeyName;

    /*
     * Gets or sets the authentication type.
     */
    @JsonProperty(value = "type")
    private ServiceBusAuthenticationType type;

    /**
     * Get the sasKey property: Gets or sets the SAS key.
     *
     * @return the sasKey value.
     */
    public String sasKey() {
        return this.sasKey;
    }

    /**
     * Set the sasKey property: Gets or sets the SAS key.
     *
     * @param sasKey the sasKey value to set.
     * @return the ServiceBusAuthentication object itself.
     */
    public ServiceBusAuthentication withSasKey(String sasKey) {
        this.sasKey = sasKey;
        return this;
    }

    /**
     * Get the sasKeyName property: Gets or sets the SAS key name.
     *
     * @return the sasKeyName value.
     */
    public String sasKeyName() {
        return this.sasKeyName;
    }

    /**
     * Set the sasKeyName property: Gets or sets the SAS key name.
     *
     * @param sasKeyName the sasKeyName value to set.
     * @return the ServiceBusAuthentication object itself.
     */
    public ServiceBusAuthentication withSasKeyName(String sasKeyName) {
        this.sasKeyName = sasKeyName;
        return this;
    }

    /**
     * Get the type property: Gets or sets the authentication type.
     *
     * @return the type value.
     */
    public ServiceBusAuthenticationType type() {
        return this.type;
    }

    /**
     * Set the type property: Gets or sets the authentication type.
     *
     * @param type the type value to set.
     * @return the ServiceBusAuthentication object itself.
     */
    public ServiceBusAuthentication withType(ServiceBusAuthenticationType type) {
        this.type = type;
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
