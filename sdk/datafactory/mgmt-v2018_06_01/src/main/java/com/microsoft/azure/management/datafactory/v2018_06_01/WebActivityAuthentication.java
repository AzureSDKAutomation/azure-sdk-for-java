/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Web activity authentication properties.
 */
public class WebActivityAuthentication {
    /**
     * Web activity authentication (Basic/ClientCertificate/MSI).
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Base64-encoded contents of a PFX file.
     */
    @JsonProperty(value = "pfx")
    private SecretBase pfx;

    /**
     * Web activity authentication user name for basic authentication.
     */
    @JsonProperty(value = "username")
    private String username;

    /**
     * Password for the PFX file or basic authentication.
     */
    @JsonProperty(value = "password")
    private SecretBase password;

    /**
     * Resource for which Azure Auth token will be requested when using MSI
     * Authentication.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /**
     * Get web activity authentication (Basic/ClientCertificate/MSI).
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set web activity authentication (Basic/ClientCertificate/MSI).
     *
     * @param type the type value to set
     * @return the WebActivityAuthentication object itself.
     */
    public WebActivityAuthentication withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get base64-encoded contents of a PFX file.
     *
     * @return the pfx value
     */
    public SecretBase pfx() {
        return this.pfx;
    }

    /**
     * Set base64-encoded contents of a PFX file.
     *
     * @param pfx the pfx value to set
     * @return the WebActivityAuthentication object itself.
     */
    public WebActivityAuthentication withPfx(SecretBase pfx) {
        this.pfx = pfx;
        return this;
    }

    /**
     * Get web activity authentication user name for basic authentication.
     *
     * @return the username value
     */
    public String username() {
        return this.username;
    }

    /**
     * Set web activity authentication user name for basic authentication.
     *
     * @param username the username value to set
     * @return the WebActivityAuthentication object itself.
     */
    public WebActivityAuthentication withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get password for the PFX file or basic authentication.
     *
     * @return the password value
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set password for the PFX file or basic authentication.
     *
     * @param password the password value to set
     * @return the WebActivityAuthentication object itself.
     */
    public WebActivityAuthentication withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get resource for which Azure Auth token will be requested when using MSI Authentication.
     *
     * @return the resource value
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set resource for which Azure Auth token will be requested when using MSI Authentication.
     *
     * @param resource the resource value to set
     * @return the WebActivityAuthentication object itself.
     */
    public WebActivityAuthentication withResource(String resource) {
        this.resource = resource;
        return this;
    }

}
