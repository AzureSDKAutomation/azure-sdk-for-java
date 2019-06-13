/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import java.util.List;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.PolicySnippetContract;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The response of the list policy snippets operation.
 */
public class PolicySnippetsCollectionInner {
    /**
     * Policy snippet value.
     */
    @JsonProperty(value = "value")
    private List<PolicySnippetContract> value;

    /**
     * Get policy snippet value.
     *
     * @return the value value
     */
    public List<PolicySnippetContract> value() {
        return this.value;
    }

    /**
     * Set policy snippet value.
     *
     * @param value the value value to set
     * @return the PolicySnippetsCollectionInner object itself.
     */
    public PolicySnippetsCollectionInner withValue(List<PolicySnippetContract> value) {
        this.value = value;
        return this;
    }

}
