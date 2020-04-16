/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A response.
 */
public class Response {
    /**
     * A list of all the headers attached to the response.
     */
    @JsonProperty(value = "headers")
    private Object headers;

    /**
     * The status code of the response.
     */
    @JsonProperty(value = "statusCode")
    private Integer statusCode;

    /**
     * Details on the location of the body content.
     */
    @JsonProperty(value = "bodyLink")
    private ContentLink bodyLink;

    /**
     * Get a list of all the headers attached to the response.
     *
     * @return the headers value
     */
    public Object headers() {
        return this.headers;
    }

    /**
     * Set a list of all the headers attached to the response.
     *
     * @param headers the headers value to set
     * @return the Response object itself.
     */
    public Response withHeaders(Object headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Get the status code of the response.
     *
     * @return the statusCode value
     */
    public Integer statusCode() {
        return this.statusCode;
    }

    /**
     * Set the status code of the response.
     *
     * @param statusCode the statusCode value to set
     * @return the Response object itself.
     */
    public Response withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Get details on the location of the body content.
     *
     * @return the bodyLink value
     */
    public ContentLink bodyLink() {
        return this.bodyLink;
    }

    /**
     * Set details on the location of the body content.
     *
     * @param bodyLink the bodyLink value to set
     * @return the Response object itself.
     */
    public Response withBodyLink(ContentLink bodyLink) {
        this.bodyLink = bodyLink;
        return this;
    }

}
