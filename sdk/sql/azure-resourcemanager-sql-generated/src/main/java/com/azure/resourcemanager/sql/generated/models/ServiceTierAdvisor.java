// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.resourcemanager.sql.generated.fluent.models.ServiceTierAdvisorInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/** An immutable client-side representation of ServiceTierAdvisor. */
public interface ServiceTierAdvisor {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the observationPeriodStart property: The observation period start (ISO8601 format).
     *
     * @return the observationPeriodStart value.
     */
    OffsetDateTime observationPeriodStart();

    /**
     * Gets the observationPeriodEnd property: The observation period start (ISO8601 format).
     *
     * @return the observationPeriodEnd value.
     */
    OffsetDateTime observationPeriodEnd();

    /**
     * Gets the activeTimeRatio property: The activeTimeRatio for service tier advisor.
     *
     * @return the activeTimeRatio value.
     */
    Double activeTimeRatio();

    /**
     * Gets the minDtu property: Gets or sets minDtu for service tier advisor.
     *
     * @return the minDtu value.
     */
    Double minDtu();

    /**
     * Gets the avgDtu property: Gets or sets avgDtu for service tier advisor.
     *
     * @return the avgDtu value.
     */
    Double avgDtu();

    /**
     * Gets the maxDtu property: Gets or sets maxDtu for service tier advisor.
     *
     * @return the maxDtu value.
     */
    Double maxDtu();

    /**
     * Gets the maxSizeInGB property: Gets or sets maxSizeInGB for service tier advisor.
     *
     * @return the maxSizeInGB value.
     */
    Double maxSizeInGB();

    /**
     * Gets the serviceLevelObjectiveUsageMetrics property: Gets or sets serviceLevelObjectiveUsageMetrics for the
     * service tier advisor.
     *
     * @return the serviceLevelObjectiveUsageMetrics value.
     */
    List<SloUsageMetric> serviceLevelObjectiveUsageMetrics();

    /**
     * Gets the currentServiceLevelObjective property: Gets or sets currentServiceLevelObjective for service tier
     * advisor.
     *
     * @return the currentServiceLevelObjective value.
     */
    String currentServiceLevelObjective();

    /**
     * Gets the currentServiceLevelObjectiveId property: Gets or sets currentServiceLevelObjectiveId for service tier
     * advisor.
     *
     * @return the currentServiceLevelObjectiveId value.
     */
    UUID currentServiceLevelObjectiveId();

    /**
     * Gets the usageBasedRecommendationServiceLevelObjective property: Gets or sets
     * usageBasedRecommendationServiceLevelObjective for service tier advisor.
     *
     * @return the usageBasedRecommendationServiceLevelObjective value.
     */
    String usageBasedRecommendationServiceLevelObjective();

    /**
     * Gets the usageBasedRecommendationServiceLevelObjectiveId property: Gets or sets
     * usageBasedRecommendationServiceLevelObjectiveId for service tier advisor.
     *
     * @return the usageBasedRecommendationServiceLevelObjectiveId value.
     */
    UUID usageBasedRecommendationServiceLevelObjectiveId();

    /**
     * Gets the databaseSizeBasedRecommendationServiceLevelObjective property: Gets or sets
     * databaseSizeBasedRecommendationServiceLevelObjective for service tier advisor.
     *
     * @return the databaseSizeBasedRecommendationServiceLevelObjective value.
     */
    String databaseSizeBasedRecommendationServiceLevelObjective();

    /**
     * Gets the databaseSizeBasedRecommendationServiceLevelObjectiveId property: Gets or sets
     * databaseSizeBasedRecommendationServiceLevelObjectiveId for service tier advisor.
     *
     * @return the databaseSizeBasedRecommendationServiceLevelObjectiveId value.
     */
    UUID databaseSizeBasedRecommendationServiceLevelObjectiveId();

    /**
     * Gets the disasterPlanBasedRecommendationServiceLevelObjective property: Gets or sets
     * disasterPlanBasedRecommendationServiceLevelObjective for service tier advisor.
     *
     * @return the disasterPlanBasedRecommendationServiceLevelObjective value.
     */
    String disasterPlanBasedRecommendationServiceLevelObjective();

    /**
     * Gets the disasterPlanBasedRecommendationServiceLevelObjectiveId property: Gets or sets
     * disasterPlanBasedRecommendationServiceLevelObjectiveId for service tier advisor.
     *
     * @return the disasterPlanBasedRecommendationServiceLevelObjectiveId value.
     */
    UUID disasterPlanBasedRecommendationServiceLevelObjectiveId();

    /**
     * Gets the overallRecommendationServiceLevelObjective property: Gets or sets
     * overallRecommendationServiceLevelObjective for service tier advisor.
     *
     * @return the overallRecommendationServiceLevelObjective value.
     */
    String overallRecommendationServiceLevelObjective();

    /**
     * Gets the overallRecommendationServiceLevelObjectiveId property: Gets or sets
     * overallRecommendationServiceLevelObjectiveId for service tier advisor.
     *
     * @return the overallRecommendationServiceLevelObjectiveId value.
     */
    UUID overallRecommendationServiceLevelObjectiveId();

    /**
     * Gets the confidence property: Gets or sets confidence for service tier advisor.
     *
     * @return the confidence value.
     */
    Double confidence();

    /**
     * Gets the inner com.azure.resourcemanager.sql.generated.fluent.models.ServiceTierAdvisorInner object.
     *
     * @return the inner object.
     */
    ServiceTierAdvisorInner innerModel();
}
