/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Protectable Container Class.
 */
@SkipParentValidation
public class ProtectableContainerResourceInner extends Resource {
    /**
     * ProtectableContainerResource properties.
     */
    @JsonProperty(value = "properties")
    private ProtectableContainerInner properties;

    /**
     * Optional ETag.
     */
    @JsonProperty(value = "eTag")
    private String eTag;

    /**
     * Get protectableContainerResource properties.
     *
     * @return the properties value
     */
    public ProtectableContainerInner properties() {
        return this.properties;
    }

    /**
     * Set protectableContainerResource properties.
     *
     * @param properties the properties value to set
     * @return the ProtectableContainerResourceInner object itself.
     */
    public ProtectableContainerResourceInner withProperties(ProtectableContainerInner properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get optional ETag.
     *
     * @return the eTag value
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set optional ETag.
     *
     * @param eTag the eTag value to set
     * @return the ProtectableContainerResourceInner object itself.
     */
    public ProtectableContainerResourceInner withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

}
