/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.deploymentmanager.v2019-11-01-preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A REST based health check.
 */
public class RestHealthCheck {
    /**
     * A unique name for this check.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The request to the health provider.
     */
    @JsonProperty(value = "request", required = true)
    private RestRequest request;

    /**
     * The expected response from the health provider. If no expected response
     * is provided, the default is to expect the received response to have an
     * HTTP status code of 200 OK.
     */
    @JsonProperty(value = "response")
    private RestResponse response;

    /**
     * Get a unique name for this check.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set a unique name for this check.
     *
     * @param name the name value to set
     * @return the RestHealthCheck object itself.
     */
    public RestHealthCheck withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the request to the health provider.
     *
     * @return the request value
     */
    public RestRequest request() {
        return this.request;
    }

    /**
     * Set the request to the health provider.
     *
     * @param request the request value to set
     * @return the RestHealthCheck object itself.
     */
    public RestHealthCheck withRequest(RestRequest request) {
        this.request = request;
        return this;
    }

    /**
     * Get the expected response from the health provider. If no expected response is provided, the default is to expect the received response to have an HTTP status code of 200 OK.
     *
     * @return the response value
     */
    public RestResponse response() {
        return this.response;
    }

    /**
     * Set the expected response from the health provider. If no expected response is provided, the default is to expect the received response to have an HTTP status code of 200 OK.
     *
     * @param response the response value to set
     * @return the RestHealthCheck object itself.
     */
    public RestHealthCheck withResponse(RestResponse response) {
        this.response = response;
        return this;
    }

}
