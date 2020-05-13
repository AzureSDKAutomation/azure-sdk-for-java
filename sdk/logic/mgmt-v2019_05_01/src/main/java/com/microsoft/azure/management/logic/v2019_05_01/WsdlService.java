/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2019_05_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The WSDL service.
 */
public class WsdlService {
    /**
     * The qualified name.
     */
    @JsonProperty(value = "qualifiedName")
    private String qualifiedName;

    /**
     * The list of endpoints' qualified names.
     */
    @JsonProperty(value = "EndpointQualifiedNames")
    private List<String> endpointQualifiedNames;

    /**
     * Get the qualified name.
     *
     * @return the qualifiedName value
     */
    public String qualifiedName() {
        return this.qualifiedName;
    }

    /**
     * Set the qualified name.
     *
     * @param qualifiedName the qualifiedName value to set
     * @return the WsdlService object itself.
     */
    public WsdlService withQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }

    /**
     * Get the list of endpoints' qualified names.
     *
     * @return the endpointQualifiedNames value
     */
    public List<String> endpointQualifiedNames() {
        return this.endpointQualifiedNames;
    }

    /**
     * Set the list of endpoints' qualified names.
     *
     * @param endpointQualifiedNames the endpointQualifiedNames value to set
     * @return the WsdlService object itself.
     */
    public WsdlService withEndpointQualifiedNames(List<String> endpointQualifiedNames) {
        this.endpointQualifiedNames = endpointQualifiedNames;
        return this;
    }

}
