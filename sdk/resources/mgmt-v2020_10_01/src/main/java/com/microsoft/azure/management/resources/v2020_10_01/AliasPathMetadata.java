/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2020_10_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AliasPathMetadata model.
 */
public class AliasPathMetadata {
    /**
     * The type of the token that the alias path is referring to. Possible
     * values include: 'NotSpecified', 'Any', 'String', 'Object', 'Array',
     * 'Integer', 'Number', 'Boolean'.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private AliasPathTokenType type;

    /**
     * The attributes of the token that the alias path is referring to.
     * Possible values include: 'None', 'Modifiable'.
     */
    @JsonProperty(value = "attributes", access = JsonProperty.Access.WRITE_ONLY)
    private AliasPathAttributes attributes;

    /**
     * Get the type of the token that the alias path is referring to. Possible values include: 'NotSpecified', 'Any', 'String', 'Object', 'Array', 'Integer', 'Number', 'Boolean'.
     *
     * @return the type value
     */
    public AliasPathTokenType type() {
        return this.type;
    }

    /**
     * Get the attributes of the token that the alias path is referring to. Possible values include: 'None', 'Modifiable'.
     *
     * @return the attributes value
     */
    public AliasPathAttributes attributes() {
        return this.attributes;
    }

}
