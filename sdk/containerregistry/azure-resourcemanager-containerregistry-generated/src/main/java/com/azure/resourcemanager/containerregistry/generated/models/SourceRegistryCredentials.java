// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the credential parameters for accessing the source registry. */
@Fluent
public final class SourceRegistryCredentials {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SourceRegistryCredentials.class);

    /*
     * The authentication mode which determines the source registry login
     * scope. The credentials for the source registry
     * will be generated using the given scope. These credentials will be used
     * to login to
     * the source registry during the run.
     */
    @JsonProperty(value = "loginMode")
    private SourceRegistryLoginMode loginMode;

    /**
     * Get the loginMode property: The authentication mode which determines the source registry login scope. The
     * credentials for the source registry will be generated using the given scope. These credentials will be used to
     * login to the source registry during the run.
     *
     * @return the loginMode value.
     */
    public SourceRegistryLoginMode loginMode() {
        return this.loginMode;
    }

    /**
     * Set the loginMode property: The authentication mode which determines the source registry login scope. The
     * credentials for the source registry will be generated using the given scope. These credentials will be used to
     * login to the source registry during the run.
     *
     * @param loginMode the loginMode value to set.
     * @return the SourceRegistryCredentials object itself.
     */
    public SourceRegistryCredentials withLoginMode(SourceRegistryLoginMode loginMode) {
        this.loginMode = loginMode;
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
