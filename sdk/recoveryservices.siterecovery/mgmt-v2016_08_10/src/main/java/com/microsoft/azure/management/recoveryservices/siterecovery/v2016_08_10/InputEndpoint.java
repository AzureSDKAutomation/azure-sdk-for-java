/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure VM input endpoint details.
 */
public class InputEndpoint {
    /**
     * The input endpoint name.
     */
    @JsonProperty(value = "endpointName")
    private String endpointName;

    /**
     * The input endpoint private port.
     */
    @JsonProperty(value = "privatePort")
    private Integer privatePort;

    /**
     * The input endpoint public port.
     */
    @JsonProperty(value = "publicPort")
    private Integer publicPort;

    /**
     * The input endpoint protocol.
     */
    @JsonProperty(value = "protocol")
    private String protocol;

    /**
     * Get the input endpoint name.
     *
     * @return the endpointName value
     */
    public String endpointName() {
        return this.endpointName;
    }

    /**
     * Set the input endpoint name.
     *
     * @param endpointName the endpointName value to set
     * @return the InputEndpoint object itself.
     */
    public InputEndpoint withEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }

    /**
     * Get the input endpoint private port.
     *
     * @return the privatePort value
     */
    public Integer privatePort() {
        return this.privatePort;
    }

    /**
     * Set the input endpoint private port.
     *
     * @param privatePort the privatePort value to set
     * @return the InputEndpoint object itself.
     */
    public InputEndpoint withPrivatePort(Integer privatePort) {
        this.privatePort = privatePort;
        return this;
    }

    /**
     * Get the input endpoint public port.
     *
     * @return the publicPort value
     */
    public Integer publicPort() {
        return this.publicPort;
    }

    /**
     * Set the input endpoint public port.
     *
     * @param publicPort the publicPort value to set
     * @return the InputEndpoint object itself.
     */
    public InputEndpoint withPublicPort(Integer publicPort) {
        this.publicPort = publicPort;
        return this;
    }

    /**
     * Get the input endpoint protocol.
     *
     * @return the protocol value
     */
    public String protocol() {
        return this.protocol;
    }

    /**
     * Set the input endpoint protocol.
     *
     * @param protocol the protocol value to set
     * @return the InputEndpoint object itself.
     */
    public InputEndpoint withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

}
