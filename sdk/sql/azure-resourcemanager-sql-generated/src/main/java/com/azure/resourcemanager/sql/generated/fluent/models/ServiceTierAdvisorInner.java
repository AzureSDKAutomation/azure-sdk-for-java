// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.models.SloUsageMetric;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/** Represents a Service Tier Advisor. */
@JsonFlatten
@Immutable
public class ServiceTierAdvisorInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServiceTierAdvisorInner.class);

    /*
     * The observation period start (ISO8601 format).
     */
    @JsonProperty(value = "properties.observationPeriodStart", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime observationPeriodStart;

    /*
     * The observation period start (ISO8601 format).
     */
    @JsonProperty(value = "properties.observationPeriodEnd", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime observationPeriodEnd;

    /*
     * The activeTimeRatio for service tier advisor.
     */
    @JsonProperty(value = "properties.activeTimeRatio", access = JsonProperty.Access.WRITE_ONLY)
    private Double activeTimeRatio;

    /*
     * Gets or sets minDtu for service tier advisor.
     */
    @JsonProperty(value = "properties.minDtu", access = JsonProperty.Access.WRITE_ONLY)
    private Double minDtu;

    /*
     * Gets or sets avgDtu for service tier advisor.
     */
    @JsonProperty(value = "properties.avgDtu", access = JsonProperty.Access.WRITE_ONLY)
    private Double avgDtu;

    /*
     * Gets or sets maxDtu for service tier advisor.
     */
    @JsonProperty(value = "properties.maxDtu", access = JsonProperty.Access.WRITE_ONLY)
    private Double maxDtu;

    /*
     * Gets or sets maxSizeInGB for service tier advisor.
     */
    @JsonProperty(value = "properties.maxSizeInGB", access = JsonProperty.Access.WRITE_ONLY)
    private Double maxSizeInGB;

    /*
     * Gets or sets serviceLevelObjectiveUsageMetrics for the service tier
     * advisor.
     */
    @JsonProperty(value = "properties.serviceLevelObjectiveUsageMetrics", access = JsonProperty.Access.WRITE_ONLY)
    private List<SloUsageMetric> serviceLevelObjectiveUsageMetrics;

    /*
     * Gets or sets currentServiceLevelObjective for service tier advisor.
     */
    @JsonProperty(value = "properties.currentServiceLevelObjective", access = JsonProperty.Access.WRITE_ONLY)
    private String currentServiceLevelObjective;

    /*
     * Gets or sets currentServiceLevelObjectiveId for service tier advisor.
     */
    @JsonProperty(value = "properties.currentServiceLevelObjectiveId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID currentServiceLevelObjectiveId;

    /*
     * Gets or sets usageBasedRecommendationServiceLevelObjective for service
     * tier advisor.
     */
    @JsonProperty(
        value = "properties.usageBasedRecommendationServiceLevelObjective",
        access = JsonProperty.Access.WRITE_ONLY)
    private String usageBasedRecommendationServiceLevelObjective;

    /*
     * Gets or sets usageBasedRecommendationServiceLevelObjectiveId for service
     * tier advisor.
     */
    @JsonProperty(
        value = "properties.usageBasedRecommendationServiceLevelObjectiveId",
        access = JsonProperty.Access.WRITE_ONLY)
    private UUID usageBasedRecommendationServiceLevelObjectiveId;

    /*
     * Gets or sets databaseSizeBasedRecommendationServiceLevelObjective for
     * service tier advisor.
     */
    @JsonProperty(
        value = "properties.databaseSizeBasedRecommendationServiceLevelObjective",
        access = JsonProperty.Access.WRITE_ONLY)
    private String databaseSizeBasedRecommendationServiceLevelObjective;

    /*
     * Gets or sets databaseSizeBasedRecommendationServiceLevelObjectiveId for
     * service tier advisor.
     */
    @JsonProperty(
        value = "properties.databaseSizeBasedRecommendationServiceLevelObjectiveId",
        access = JsonProperty.Access.WRITE_ONLY)
    private UUID databaseSizeBasedRecommendationServiceLevelObjectiveId;

    /*
     * Gets or sets disasterPlanBasedRecommendationServiceLevelObjective for
     * service tier advisor.
     */
    @JsonProperty(
        value = "properties.disasterPlanBasedRecommendationServiceLevelObjective",
        access = JsonProperty.Access.WRITE_ONLY)
    private String disasterPlanBasedRecommendationServiceLevelObjective;

    /*
     * Gets or sets disasterPlanBasedRecommendationServiceLevelObjectiveId for
     * service tier advisor.
     */
    @JsonProperty(
        value = "properties.disasterPlanBasedRecommendationServiceLevelObjectiveId",
        access = JsonProperty.Access.WRITE_ONLY)
    private UUID disasterPlanBasedRecommendationServiceLevelObjectiveId;

    /*
     * Gets or sets overallRecommendationServiceLevelObjective for service tier
     * advisor.
     */
    @JsonProperty(
        value = "properties.overallRecommendationServiceLevelObjective",
        access = JsonProperty.Access.WRITE_ONLY)
    private String overallRecommendationServiceLevelObjective;

    /*
     * Gets or sets overallRecommendationServiceLevelObjectiveId for service
     * tier advisor.
     */
    @JsonProperty(
        value = "properties.overallRecommendationServiceLevelObjectiveId",
        access = JsonProperty.Access.WRITE_ONLY)
    private UUID overallRecommendationServiceLevelObjectiveId;

    /*
     * Gets or sets confidence for service tier advisor.
     */
    @JsonProperty(value = "properties.confidence", access = JsonProperty.Access.WRITE_ONLY)
    private Double confidence;

    /**
     * Get the observationPeriodStart property: The observation period start (ISO8601 format).
     *
     * @return the observationPeriodStart value.
     */
    public OffsetDateTime observationPeriodStart() {
        return this.observationPeriodStart;
    }

    /**
     * Get the observationPeriodEnd property: The observation period start (ISO8601 format).
     *
     * @return the observationPeriodEnd value.
     */
    public OffsetDateTime observationPeriodEnd() {
        return this.observationPeriodEnd;
    }

    /**
     * Get the activeTimeRatio property: The activeTimeRatio for service tier advisor.
     *
     * @return the activeTimeRatio value.
     */
    public Double activeTimeRatio() {
        return this.activeTimeRatio;
    }

    /**
     * Get the minDtu property: Gets or sets minDtu for service tier advisor.
     *
     * @return the minDtu value.
     */
    public Double minDtu() {
        return this.minDtu;
    }

    /**
     * Get the avgDtu property: Gets or sets avgDtu for service tier advisor.
     *
     * @return the avgDtu value.
     */
    public Double avgDtu() {
        return this.avgDtu;
    }

    /**
     * Get the maxDtu property: Gets or sets maxDtu for service tier advisor.
     *
     * @return the maxDtu value.
     */
    public Double maxDtu() {
        return this.maxDtu;
    }

    /**
     * Get the maxSizeInGB property: Gets or sets maxSizeInGB for service tier advisor.
     *
     * @return the maxSizeInGB value.
     */
    public Double maxSizeInGB() {
        return this.maxSizeInGB;
    }

    /**
     * Get the serviceLevelObjectiveUsageMetrics property: Gets or sets serviceLevelObjectiveUsageMetrics for the
     * service tier advisor.
     *
     * @return the serviceLevelObjectiveUsageMetrics value.
     */
    public List<SloUsageMetric> serviceLevelObjectiveUsageMetrics() {
        return this.serviceLevelObjectiveUsageMetrics;
    }

    /**
     * Get the currentServiceLevelObjective property: Gets or sets currentServiceLevelObjective for service tier
     * advisor.
     *
     * @return the currentServiceLevelObjective value.
     */
    public String currentServiceLevelObjective() {
        return this.currentServiceLevelObjective;
    }

    /**
     * Get the currentServiceLevelObjectiveId property: Gets or sets currentServiceLevelObjectiveId for service tier
     * advisor.
     *
     * @return the currentServiceLevelObjectiveId value.
     */
    public UUID currentServiceLevelObjectiveId() {
        return this.currentServiceLevelObjectiveId;
    }

    /**
     * Get the usageBasedRecommendationServiceLevelObjective property: Gets or sets
     * usageBasedRecommendationServiceLevelObjective for service tier advisor.
     *
     * @return the usageBasedRecommendationServiceLevelObjective value.
     */
    public String usageBasedRecommendationServiceLevelObjective() {
        return this.usageBasedRecommendationServiceLevelObjective;
    }

    /**
     * Get the usageBasedRecommendationServiceLevelObjectiveId property: Gets or sets
     * usageBasedRecommendationServiceLevelObjectiveId for service tier advisor.
     *
     * @return the usageBasedRecommendationServiceLevelObjectiveId value.
     */
    public UUID usageBasedRecommendationServiceLevelObjectiveId() {
        return this.usageBasedRecommendationServiceLevelObjectiveId;
    }

    /**
     * Get the databaseSizeBasedRecommendationServiceLevelObjective property: Gets or sets
     * databaseSizeBasedRecommendationServiceLevelObjective for service tier advisor.
     *
     * @return the databaseSizeBasedRecommendationServiceLevelObjective value.
     */
    public String databaseSizeBasedRecommendationServiceLevelObjective() {
        return this.databaseSizeBasedRecommendationServiceLevelObjective;
    }

    /**
     * Get the databaseSizeBasedRecommendationServiceLevelObjectiveId property: Gets or sets
     * databaseSizeBasedRecommendationServiceLevelObjectiveId for service tier advisor.
     *
     * @return the databaseSizeBasedRecommendationServiceLevelObjectiveId value.
     */
    public UUID databaseSizeBasedRecommendationServiceLevelObjectiveId() {
        return this.databaseSizeBasedRecommendationServiceLevelObjectiveId;
    }

    /**
     * Get the disasterPlanBasedRecommendationServiceLevelObjective property: Gets or sets
     * disasterPlanBasedRecommendationServiceLevelObjective for service tier advisor.
     *
     * @return the disasterPlanBasedRecommendationServiceLevelObjective value.
     */
    public String disasterPlanBasedRecommendationServiceLevelObjective() {
        return this.disasterPlanBasedRecommendationServiceLevelObjective;
    }

    /**
     * Get the disasterPlanBasedRecommendationServiceLevelObjectiveId property: Gets or sets
     * disasterPlanBasedRecommendationServiceLevelObjectiveId for service tier advisor.
     *
     * @return the disasterPlanBasedRecommendationServiceLevelObjectiveId value.
     */
    public UUID disasterPlanBasedRecommendationServiceLevelObjectiveId() {
        return this.disasterPlanBasedRecommendationServiceLevelObjectiveId;
    }

    /**
     * Get the overallRecommendationServiceLevelObjective property: Gets or sets
     * overallRecommendationServiceLevelObjective for service tier advisor.
     *
     * @return the overallRecommendationServiceLevelObjective value.
     */
    public String overallRecommendationServiceLevelObjective() {
        return this.overallRecommendationServiceLevelObjective;
    }

    /**
     * Get the overallRecommendationServiceLevelObjectiveId property: Gets or sets
     * overallRecommendationServiceLevelObjectiveId for service tier advisor.
     *
     * @return the overallRecommendationServiceLevelObjectiveId value.
     */
    public UUID overallRecommendationServiceLevelObjectiveId() {
        return this.overallRecommendationServiceLevelObjectiveId;
    }

    /**
     * Get the confidence property: Gets or sets confidence for service tier advisor.
     *
     * @return the confidence value.
     */
    public Double confidence() {
        return this.confidence;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (serviceLevelObjectiveUsageMetrics() != null) {
            serviceLevelObjectiveUsageMetrics().forEach(e -> e.validate());
        }
    }
}
