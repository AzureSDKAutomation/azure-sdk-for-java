/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2019_05_01_preview.implementation;

import com.microsoft.azure.management.appplatform.v2019_05_01_preview.ClusterResourceProperties;
import com.microsoft.azure.management.appplatform.v2019_05_01_preview.ManagedIdentityProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Service resource.
 */
@SkipParentValidation
public class ServiceResourceInner extends Resource {
    /**
     * Properties of the Service resource.
     */
    @JsonProperty(value = "properties")
    private ClusterResourceProperties properties;

    /**
     * The Managed Identity of the service resource.
     */
    @JsonProperty(value = "identity")
    private ManagedIdentityProperties identity;

    /**
     * Sku of the Service resource.
     */
    @JsonProperty(value = "sku")
    private SkuInner sku;

    /**
     * Get properties of the Service resource.
     *
     * @return the properties value
     */
    public ClusterResourceProperties properties() {
        return this.properties;
    }

    /**
     * Set properties of the Service resource.
     *
     * @param properties the properties value to set
     * @return the ServiceResourceInner object itself.
     */
    public ServiceResourceInner withProperties(ClusterResourceProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the Managed Identity of the service resource.
     *
     * @return the identity value
     */
    public ManagedIdentityProperties identity() {
        return this.identity;
    }

    /**
     * Set the Managed Identity of the service resource.
     *
     * @param identity the identity value to set
     * @return the ServiceResourceInner object itself.
     */
    public ServiceResourceInner withIdentity(ManagedIdentityProperties identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get sku of the Service resource.
     *
     * @return the sku value
     */
    public SkuInner sku() {
        return this.sku;
    }

    /**
     * Set sku of the Service resource.
     *
     * @param sku the sku value to set
     * @return the ServiceResourceInner object itself.
     */
    public ServiceResourceInner withSku(SkuInner sku) {
        this.sku = sku;
        return this;
    }

}
