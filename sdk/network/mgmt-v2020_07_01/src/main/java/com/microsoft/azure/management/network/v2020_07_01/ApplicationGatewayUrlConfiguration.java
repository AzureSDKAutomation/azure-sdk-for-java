/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Url configuration of the Actions set in Application Gateway.
 */
public class ApplicationGatewayUrlConfiguration {
    /**
     * Url path which user has provided for url rewrite. Null means no path
     * will be updated. Default value is null.
     */
    @JsonProperty(value = "modifiedPath")
    private String modifiedPath;

    /**
     * Query string which user has provided for url rewrite. Null means no
     * query string will be updated. Default value is null.
     */
    @JsonProperty(value = "modifiedQueryString")
    private String modifiedQueryString;

    /**
     * If set as true, it will re-evaluate the url path map provided in path
     * based request routing rules using modified path. Default value is false.
     */
    @JsonProperty(value = "reroute")
    private Boolean reroute;

    /**
     * Get url path which user has provided for url rewrite. Null means no path will be updated. Default value is null.
     *
     * @return the modifiedPath value
     */
    public String modifiedPath() {
        return this.modifiedPath;
    }

    /**
     * Set url path which user has provided for url rewrite. Null means no path will be updated. Default value is null.
     *
     * @param modifiedPath the modifiedPath value to set
     * @return the ApplicationGatewayUrlConfiguration object itself.
     */
    public ApplicationGatewayUrlConfiguration withModifiedPath(String modifiedPath) {
        this.modifiedPath = modifiedPath;
        return this;
    }

    /**
     * Get query string which user has provided for url rewrite. Null means no query string will be updated. Default value is null.
     *
     * @return the modifiedQueryString value
     */
    public String modifiedQueryString() {
        return this.modifiedQueryString;
    }

    /**
     * Set query string which user has provided for url rewrite. Null means no query string will be updated. Default value is null.
     *
     * @param modifiedQueryString the modifiedQueryString value to set
     * @return the ApplicationGatewayUrlConfiguration object itself.
     */
    public ApplicationGatewayUrlConfiguration withModifiedQueryString(String modifiedQueryString) {
        this.modifiedQueryString = modifiedQueryString;
        return this;
    }

    /**
     * Get if set as true, it will re-evaluate the url path map provided in path based request routing rules using modified path. Default value is false.
     *
     * @return the reroute value
     */
    public Boolean reroute() {
        return this.reroute;
    }

    /**
     * Set if set as true, it will re-evaluate the url path map provided in path based request routing rules using modified path. Default value is false.
     *
     * @param reroute the reroute value to set
     * @return the ApplicationGatewayUrlConfiguration object itself.
     */
    public ApplicationGatewayUrlConfiguration withReroute(Boolean reroute) {
        this.reroute = reroute;
        return this;
    }

}
