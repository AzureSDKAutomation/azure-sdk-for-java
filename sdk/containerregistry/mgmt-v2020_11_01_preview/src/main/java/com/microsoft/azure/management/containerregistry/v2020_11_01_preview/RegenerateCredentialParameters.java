/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2020_11_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The parameters used to regenerate the login credential.
 */
public class RegenerateCredentialParameters {
    /**
     * Specifies name of the password which should be regenerated -- password
     * or password2. Possible values include: 'password', 'password2'.
     */
    @JsonProperty(value = "name", required = true)
    private PasswordName name;

    /**
     * Get specifies name of the password which should be regenerated -- password or password2. Possible values include: 'password', 'password2'.
     *
     * @return the name value
     */
    public PasswordName name() {
        return this.name;
    }

    /**
     * Set specifies name of the password which should be regenerated -- password or password2. Possible values include: 'password', 'password2'.
     *
     * @param name the name value to set
     * @return the RegenerateCredentialParameters object itself.
     */
    public RegenerateCredentialParameters withName(PasswordName name) {
        this.name = name;
        return this;
    }

}
