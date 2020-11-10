/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.ProxyResource;

/**
 * Entity Resource.
 * The resource model definition for an Azure Resource Manager resource with an
 * etag.
 */
public class AzureEntityResource extends ProxyResource {
    /**
     * Resource Etag.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get resource Etag.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

}
