/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datadog.v2020_02_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The DatadogLogsAgent model.
 */
public class DatadogLogsAgent {
    /**
     * The transport.
     */
    @JsonProperty(value = "transport")
    private String transport;

    /**
     * Get the transport.
     *
     * @return the transport value
     */
    public String transport() {
        return this.transport;
    }

    /**
     * Set the transport.
     *
     * @param transport the transport value to set
     * @return the DatadogLogsAgent object itself.
     */
    public DatadogLogsAgent withTransport(String transport) {
        this.transport = transport;
        return this;
    }

}
