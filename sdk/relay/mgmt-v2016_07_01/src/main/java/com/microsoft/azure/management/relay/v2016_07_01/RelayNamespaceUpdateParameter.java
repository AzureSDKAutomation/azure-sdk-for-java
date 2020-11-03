/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.relay.v2016_07_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters supplied to the Patch Namespace operation.
 */
public class RelayNamespaceUpdateParameter {
    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * The sku of the created namespace.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * Creates an instance of RelayNamespaceUpdateParameter class.
     */
    public RelayNamespaceUpdateParameter() {
        sku = new Sku();
    }

    /**
     * Get resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set resource tags.
     *
     * @param tags the tags value to set
     * @return the RelayNamespaceUpdateParameter object itself.
     */
    public RelayNamespaceUpdateParameter withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the sku of the created namespace.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku of the created namespace.
     *
     * @param sku the sku value to set
     * @return the RelayNamespaceUpdateParameter object itself.
     */
    public RelayNamespaceUpdateParameter withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

}
