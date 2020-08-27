/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_08_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.cosmosdb.v2020_08_01.ARMProxyResource;

/**
 * A notebook workspace resource.
 */
@JsonFlatten
public class NotebookWorkspaceInner extends ARMProxyResource {
    /**
     * Specifies the endpoint of Notebook server.
     */
    @JsonProperty(value = "properties.notebookServerEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String notebookServerEndpoint;

    /**
     * Status of the notebook workspace. Possible values are: Creating, Online,
     * Deleting, Failed, Updating.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /**
     * Get specifies the endpoint of Notebook server.
     *
     * @return the notebookServerEndpoint value
     */
    public String notebookServerEndpoint() {
        return this.notebookServerEndpoint;
    }

    /**
     * Get status of the notebook workspace. Possible values are: Creating, Online, Deleting, Failed, Updating.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

}
