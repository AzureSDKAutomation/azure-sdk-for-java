/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2018_01_01_preview.implementation;

import java.util.List;
import com.microsoft.azure.management.servicebus.v2018_01_01_preview.AccessRights;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Description of a namespace authorization rule.
 */
@JsonFlatten
public class SBAuthorizationRuleInner extends ProxyResource {
    /**
     * The rights associated with the rule.
     */
    @JsonProperty(value = "properties.rights", required = true)
    private List<AccessRights> rights;

    /**
     * Get the rights associated with the rule.
     *
     * @return the rights value
     */
    public List<AccessRights> rights() {
        return this.rights;
    }

    /**
     * Set the rights associated with the rule.
     *
     * @param rights the rights value to set
     * @return the SBAuthorizationRuleInner object itself.
     */
    public SBAuthorizationRuleInner withRights(List<AccessRights> rights) {
        this.rights = rights;
        return this;
    }

}
