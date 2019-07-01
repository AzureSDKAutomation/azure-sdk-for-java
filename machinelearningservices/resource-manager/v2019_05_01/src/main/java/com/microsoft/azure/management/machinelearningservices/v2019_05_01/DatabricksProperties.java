/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.machinelearningservices.v2019_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The DatabricksProperties model.
 */
public class DatabricksProperties {
    /**
     * Databricks access token.
     */
    @JsonProperty(value = "databricksAccessToken")
    private String databricksAccessToken;

    /**
     * Get databricks access token.
     *
     * @return the databricksAccessToken value
     */
    public String databricksAccessToken() {
        return this.databricksAccessToken;
    }

    /**
     * Set databricks access token.
     *
     * @param databricksAccessToken the databricksAccessToken value to set
     * @return the DatabricksProperties object itself.
     */
    public DatabricksProperties withDatabricksAccessToken(String databricksAccessToken) {
        this.databricksAccessToken = databricksAccessToken;
        return this;
    }

}
