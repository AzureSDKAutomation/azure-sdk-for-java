// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scheduler.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The BasicAuthentication model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Basic")
@Fluent
public final class BasicAuthentication extends HttpAuthentication {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BasicAuthentication.class);

    /*
     * Gets or sets the username.
     */
    @JsonProperty(value = "username")
    private String username;

    /*
     * Gets or sets the password, return value will always be empty.
     */
    @JsonProperty(value = "password")
    private String password;

    /**
     * Get the username property: Gets or sets the username.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: Gets or sets the username.
     *
     * @param username the username value to set.
     * @return the BasicAuthentication object itself.
     */
    public BasicAuthentication withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Gets or sets the password, return value will always be empty.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: Gets or sets the password, return value will always be empty.
     *
     * @param password the password value to set.
     * @return the BasicAuthentication object itself.
     */
    public BasicAuthentication withPassword(String password) {
        this.password = password;
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
