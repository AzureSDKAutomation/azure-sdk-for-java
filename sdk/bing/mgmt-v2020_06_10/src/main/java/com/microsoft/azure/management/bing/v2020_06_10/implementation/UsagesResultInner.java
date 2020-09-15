/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.bing.v2020_06_10.implementation;

import java.util.List;
import com.microsoft.azure.management.bing.v2020_06_10.Usage;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The response to a list usage request.
 */
public class UsagesResultInner {
    /**
     * The list of usages for bing account.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<Usage> value;

    /**
     * Get the list of usages for bing account.
     *
     * @return the value value
     */
    public List<Usage> value() {
        return this.value;
    }

}
