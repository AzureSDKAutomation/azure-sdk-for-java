/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.notificationhubs.v2017_04_01.implementation;

import com.microsoft.azure.management.notificationhubs.v2017_04_01.Sku;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Description of a CheckAvailability resource.
 */
@SkipParentValidation
public class CheckAvailabilityResultInner extends Resource {
    /**
     * True if the name is available and can be used to create new
     * Namespace/NotificationHub. Otherwise false.
     */
    @JsonProperty(value = "isAvailiable")
    private Boolean isAvailiable;

    /**
     * The sku of the created namespace.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * Get true if the name is available and can be used to create new Namespace/NotificationHub. Otherwise false.
     *
     * @return the isAvailiable value
     */
    public Boolean isAvailiable() {
        return this.isAvailiable;
    }

    /**
     * Set true if the name is available and can be used to create new Namespace/NotificationHub. Otherwise false.
     *
     * @param isAvailiable the isAvailiable value to set
     * @return the CheckAvailabilityResultInner object itself.
     */
    public CheckAvailabilityResultInner withIsAvailiable(Boolean isAvailiable) {
        this.isAvailiable = isAvailiable;
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
     * @return the CheckAvailabilityResultInner object itself.
     */
    public CheckAvailabilityResultInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

}
