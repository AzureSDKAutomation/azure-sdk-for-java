/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2019_05_01.implementation;

import com.microsoft.azure.management.logic.v2019_05_01.RequestHistoryProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * The request history.
 */
@SkipParentValidation
public class RequestHistoryInner extends Resource {
    /**
     * The request history properties.
     */
    @JsonProperty(value = "properties")
    private RequestHistoryProperties properties;

    /**
     * Get the request history properties.
     *
     * @return the properties value
     */
    public RequestHistoryProperties properties() {
        return this.properties;
    }

    /**
     * Set the request history properties.
     *
     * @param properties the properties value to set
     * @return the RequestHistoryInner object itself.
     */
    public RequestHistoryInner withProperties(RequestHistoryProperties properties) {
        this.properties = properties;
        return this;
    }

}
