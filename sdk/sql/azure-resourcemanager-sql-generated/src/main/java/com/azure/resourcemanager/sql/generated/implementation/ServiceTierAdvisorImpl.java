// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.resourcemanager.sql.generated.fluent.models.ServiceTierAdvisorInner;
import com.azure.resourcemanager.sql.generated.models.ServiceTierAdvisor;
import com.azure.resourcemanager.sql.generated.models.SloUsageMetric;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class ServiceTierAdvisorImpl implements ServiceTierAdvisor {
    private ServiceTierAdvisorInner innerObject;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    ServiceTierAdvisorImpl(
        ServiceTierAdvisorInner innerObject, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public OffsetDateTime observationPeriodStart() {
        return this.innerModel().observationPeriodStart();
    }

    public OffsetDateTime observationPeriodEnd() {
        return this.innerModel().observationPeriodEnd();
    }

    public Double activeTimeRatio() {
        return this.innerModel().activeTimeRatio();
    }

    public Double minDtu() {
        return this.innerModel().minDtu();
    }

    public Double avgDtu() {
        return this.innerModel().avgDtu();
    }

    public Double maxDtu() {
        return this.innerModel().maxDtu();
    }

    public Double maxSizeInGB() {
        return this.innerModel().maxSizeInGB();
    }

    public List<SloUsageMetric> serviceLevelObjectiveUsageMetrics() {
        List<SloUsageMetric> inner = this.innerModel().serviceLevelObjectiveUsageMetrics();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String currentServiceLevelObjective() {
        return this.innerModel().currentServiceLevelObjective();
    }

    public UUID currentServiceLevelObjectiveId() {
        return this.innerModel().currentServiceLevelObjectiveId();
    }

    public String usageBasedRecommendationServiceLevelObjective() {
        return this.innerModel().usageBasedRecommendationServiceLevelObjective();
    }

    public UUID usageBasedRecommendationServiceLevelObjectiveId() {
        return this.innerModel().usageBasedRecommendationServiceLevelObjectiveId();
    }

    public String databaseSizeBasedRecommendationServiceLevelObjective() {
        return this.innerModel().databaseSizeBasedRecommendationServiceLevelObjective();
    }

    public UUID databaseSizeBasedRecommendationServiceLevelObjectiveId() {
        return this.innerModel().databaseSizeBasedRecommendationServiceLevelObjectiveId();
    }

    public String disasterPlanBasedRecommendationServiceLevelObjective() {
        return this.innerModel().disasterPlanBasedRecommendationServiceLevelObjective();
    }

    public UUID disasterPlanBasedRecommendationServiceLevelObjectiveId() {
        return this.innerModel().disasterPlanBasedRecommendationServiceLevelObjectiveId();
    }

    public String overallRecommendationServiceLevelObjective() {
        return this.innerModel().overallRecommendationServiceLevelObjective();
    }

    public UUID overallRecommendationServiceLevelObjectiveId() {
        return this.innerModel().overallRecommendationServiceLevelObjectiveId();
    }

    public Double confidence() {
        return this.innerModel().confidence();
    }

    public ServiceTierAdvisorInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }
}
