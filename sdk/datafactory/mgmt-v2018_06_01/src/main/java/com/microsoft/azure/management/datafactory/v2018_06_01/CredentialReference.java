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
 * Credential reference type.
 */
public class CredentialReference {
    /**
     * Credential reference type.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Reference credential name.
     */
    @JsonProperty(value = "referenceName", required = true)
    private String referenceName;

    /**
     * Creates an instance of CredentialReference class.
     * @param referenceName reference credential name.
     */
    public CredentialReference() {
        type = "CredentialReference";
    }

    /**
     * Get credential reference type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set credential reference type.
     *
     * @param type the type value to set
     * @return the CredentialReference object itself.
     */
    public CredentialReference withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get reference credential name.
     *
     * @return the referenceName value
     */
    public String referenceName() {
        return this.referenceName;
    }

    /**
     * Set reference credential name.
     *
     * @param referenceName the referenceName value to set
     * @return the CredentialReference object itself.
     */
    public CredentialReference withReferenceName(String referenceName) {
        this.referenceName = referenceName;
        return this;
    }

}
