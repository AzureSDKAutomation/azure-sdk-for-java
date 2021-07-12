// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerregistry.generated.models.TokenPassword;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response from the GenerateCredentials operation. */
@Fluent
public final class GenerateCredentialsResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GenerateCredentialsResultInner.class);

    /*
     * The username for a container registry.
     */
    @JsonProperty(value = "username")
    private String username;

    /*
     * The list of passwords for a container registry.
     */
    @JsonProperty(value = "passwords")
    private List<TokenPassword> passwords;

    /**
     * Get the username property: The username for a container registry.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: The username for a container registry.
     *
     * @param username the username value to set.
     * @return the GenerateCredentialsResultInner object itself.
     */
    public GenerateCredentialsResultInner withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the passwords property: The list of passwords for a container registry.
     *
     * @return the passwords value.
     */
    public List<TokenPassword> passwords() {
        return this.passwords;
    }

    /**
     * Set the passwords property: The list of passwords for a container registry.
     *
     * @param passwords the passwords value to set.
     * @return the GenerateCredentialsResultInner object itself.
     */
    public GenerateCredentialsResultInner withPasswords(List<TokenPassword> passwords) {
        this.passwords = passwords;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (passwords() != null) {
            passwords().forEach(e -> e.validate());
        }
    }
}
