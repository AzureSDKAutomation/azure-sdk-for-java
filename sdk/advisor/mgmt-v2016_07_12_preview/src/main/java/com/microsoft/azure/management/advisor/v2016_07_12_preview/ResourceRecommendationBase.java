/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.advisor.v2016_07_12_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.advisor.v2016_07_12_preview.implementation.ResourceRecommendationBaseInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.advisor.v2016_07_12_preview.implementation.AdvisorManager;
import org.joda.time.DateTime;
import java.util.Map;
import java.util.List;
import java.util.UUID;

/**
 * Type representing ResourceRecommendationBase.
 */
public interface ResourceRecommendationBase extends HasInner<ResourceRecommendationBaseInner>, Indexable, Refreshable<ResourceRecommendationBase>, HasManager<AdvisorManager> {
    /**
     * @return the category value.
     */
    Category category();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the impact value.
     */
    Impact impact();

    /**
     * @return the impactedField value.
     */
    String impactedField();

    /**
     * @return the impactedValue value.
     */
    String impactedValue();

    /**
     * @return the lastUpdated value.
     */
    DateTime lastUpdated();

    /**
     * @return the metadata value.
     */
    Map<String, Object> metadata();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the recommendationTypeId value.
     */
    String recommendationTypeId();

    /**
     * @return the risk value.
     */
    Risk risk();

    /**
     * @return the shortDescription value.
     */
    ShortDescription shortDescription();

    /**
     * @return the suppressionIds value.
     */
    List<UUID> suppressionIds();

    /**
     * @return the type value.
     */
    String type();

}
