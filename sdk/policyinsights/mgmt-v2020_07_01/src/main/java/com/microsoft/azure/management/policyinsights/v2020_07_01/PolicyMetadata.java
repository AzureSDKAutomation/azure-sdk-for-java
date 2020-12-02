/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.v2020_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.policyinsights.v2020_07_01.implementation.PolicyInsightsManager;
import com.microsoft.azure.management.policyinsights.v2020_07_01.implementation.PolicyMetadataInner;

/**
 * Type representing PolicyMetadata.
 */
public interface PolicyMetadata extends HasInner<PolicyMetadataInner>, HasManager<PolicyInsightsManager> {
    /**
     * @return the additionalContentUrl value.
     */
    String additionalContentUrl();

    /**
     * @return the category value.
     */
    String category();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the metadata value.
     */
    Object metadata();

    /**
     * @return the metadataId value.
     */
    String metadataId();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the owner value.
     */
    String owner();

    /**
     * @return the requirements value.
     */
    String requirements();

    /**
     * @return the title value.
     */
    String title();

    /**
     * @return the type value.
     */
    String type();

}
