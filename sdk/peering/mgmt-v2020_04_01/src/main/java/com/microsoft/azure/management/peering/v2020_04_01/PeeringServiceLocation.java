/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2020_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.peering.v2020_04_01.implementation.PeeringServiceLocationInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.peering.v2020_04_01.implementation.PeeringManager;

/**
 * Type representing PeeringServiceLocation.
 */
public interface PeeringServiceLocation extends HasInner<PeeringServiceLocationInner>, HasManager<PeeringManager> {
    /**
     * @return the azureRegion value.
     */
    String azureRegion();

    /**
     * @return the country value.
     */
    String country();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the state value.
     */
    String state();

    /**
     * @return the type value.
     */
    String type();

}
