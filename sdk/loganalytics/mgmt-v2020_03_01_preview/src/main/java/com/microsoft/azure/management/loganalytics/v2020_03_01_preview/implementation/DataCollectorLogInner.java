/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Data collector log top level resource container.
 */
@JsonFlatten
public class DataCollectorLogInner extends ProxyResource {
    /**
     * Table's name.
     */
    @JsonProperty(value = "properties.name")
    private String dataCollectorLogName;

    /**
     * Get table's name.
     *
     * @return the dataCollectorLogName value
     */
    public String dataCollectorLogName() {
        return this.dataCollectorLogName;
    }

    /**
     * Set table's name.
     *
     * @param dataCollectorLogName the dataCollectorLogName value to set
     * @return the DataCollectorLogInner object itself.
     */
    public DataCollectorLogInner withDataCollectorLogName(String dataCollectorLogName) {
        this.dataCollectorLogName = dataCollectorLogName;
        return this;
    }

}
