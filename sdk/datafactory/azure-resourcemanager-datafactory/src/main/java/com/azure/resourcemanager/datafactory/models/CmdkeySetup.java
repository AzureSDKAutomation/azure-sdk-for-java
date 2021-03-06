// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The custom setup of running cmdkey commands. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("CmdkeySetup")
@JsonFlatten
@Fluent
public class CmdkeySetup extends CustomSetupBase {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CmdkeySetup.class);

    /*
     * The server name of data source access.
     */
    @JsonProperty(value = "typeProperties.targetName", required = true)
    private Object targetName;

    /*
     * The user name of data source access.
     */
    @JsonProperty(value = "typeProperties.userName", required = true)
    private Object username;

    /*
     * The password of data source access.
     */
    @JsonProperty(value = "typeProperties.password", required = true)
    private SecretBase password;

    /**
     * Get the targetName property: The server name of data source access.
     *
     * @return the targetName value.
     */
    public Object targetName() {
        return this.targetName;
    }

    /**
     * Set the targetName property: The server name of data source access.
     *
     * @param targetName the targetName value to set.
     * @return the CmdkeySetup object itself.
     */
    public CmdkeySetup withTargetName(Object targetName) {
        this.targetName = targetName;
        return this;
    }

    /**
     * Get the username property: The user name of data source access.
     *
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: The user name of data source access.
     *
     * @param username the username value to set.
     * @return the CmdkeySetup object itself.
     */
    public CmdkeySetup withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password of data source access.
     *
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: The password of data source access.
     *
     * @param password the password value to set.
     * @return the CmdkeySetup object itself.
     */
    public CmdkeySetup withPassword(SecretBase password) {
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
        if (targetName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property targetName in model CmdkeySetup"));
        }
        if (username() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property username in model CmdkeySetup"));
        }
        if (password() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property password in model CmdkeySetup"));
        } else {
            password().validate();
        }
    }
}
