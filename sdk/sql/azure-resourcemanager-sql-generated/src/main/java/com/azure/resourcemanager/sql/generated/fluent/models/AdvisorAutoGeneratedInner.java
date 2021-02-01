// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.models.AdvisorStatus;
import com.azure.resourcemanager.sql.generated.models.AutoExecuteStatus;
import com.azure.resourcemanager.sql.generated.models.AutoExecuteStatusInheritedFrom;
import com.azure.resourcemanager.sql.generated.models.RecommendedActionAutoGenerated2;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Database, Server or Elastic Pool Advisor. */
@JsonFlatten
@Fluent
public class AdvisorAutoGeneratedInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AdvisorAutoGeneratedInner.class);

    /*
     * Resource kind.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /*
     * Resource location.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /*
     * Gets the status of availability of this advisor to customers. Possible
     * values are 'GA', 'PublicPreview', 'LimitedPublicPreview' and
     * 'PrivatePreview'.
     */
    @JsonProperty(value = "properties.advisorStatus", access = JsonProperty.Access.WRITE_ONLY)
    private AdvisorStatus advisorStatus;

    /*
     * Gets the auto-execute status (whether to let the system execute the
     * recommendations) of this advisor. Possible values are 'Enabled' and
     * 'Disabled'
     */
    @JsonProperty(value = "properties.autoExecuteStatus")
    private AutoExecuteStatus autoExecuteStatus;

    /*
     * Gets the resource from which current value of auto-execute status is
     * inherited. Auto-execute status can be set on (and inherited from)
     * different levels in the resource hierarchy. Possible values are
     * 'Subscription', 'Server', 'ElasticPool', 'Database' and 'Default' (when
     * status is not explicitly set on any level).
     */
    @JsonProperty(value = "properties.autoExecuteStatusInheritedFrom", access = JsonProperty.Access.WRITE_ONLY)
    private AutoExecuteStatusInheritedFrom autoExecuteStatusInheritedFrom;

    /*
     * Gets that status of recommendations for this advisor and reason for not
     * having any recommendations. Possible values include, but are not limited
     * to, 'Ok' (Recommendations available),LowActivity (not enough workload to
     * analyze), 'DbSeemsTuned' (Database is doing well), etc.
     */
    @JsonProperty(value = "properties.recommendationsStatus", access = JsonProperty.Access.WRITE_ONLY)
    private String recommendationsStatus;

    /*
     * Gets the time when the current resource was analyzed for recommendations
     * by this advisor.
     */
    @JsonProperty(value = "properties.lastChecked", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastChecked;

    /*
     * Gets the recommended actions for this advisor.
     */
    @JsonProperty(value = "properties.recommendedActions", access = JsonProperty.Access.WRITE_ONLY)
    private List<RecommendedActionAutoGenerated2> recommendedActions;

    /**
     * Get the kind property: Resource kind.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get the location property: Resource location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the advisorStatus property: Gets the status of availability of this advisor to customers. Possible values are
     * 'GA', 'PublicPreview', 'LimitedPublicPreview' and 'PrivatePreview'.
     *
     * @return the advisorStatus value.
     */
    public AdvisorStatus advisorStatus() {
        return this.advisorStatus;
    }

    /**
     * Get the autoExecuteStatus property: Gets the auto-execute status (whether to let the system execute the
     * recommendations) of this advisor. Possible values are 'Enabled' and 'Disabled'.
     *
     * @return the autoExecuteStatus value.
     */
    public AutoExecuteStatus autoExecuteStatus() {
        return this.autoExecuteStatus;
    }

    /**
     * Set the autoExecuteStatus property: Gets the auto-execute status (whether to let the system execute the
     * recommendations) of this advisor. Possible values are 'Enabled' and 'Disabled'.
     *
     * @param autoExecuteStatus the autoExecuteStatus value to set.
     * @return the AdvisorAutoGeneratedInner object itself.
     */
    public AdvisorAutoGeneratedInner withAutoExecuteStatus(AutoExecuteStatus autoExecuteStatus) {
        this.autoExecuteStatus = autoExecuteStatus;
        return this;
    }

    /**
     * Get the autoExecuteStatusInheritedFrom property: Gets the resource from which current value of auto-execute
     * status is inherited. Auto-execute status can be set on (and inherited from) different levels in the resource
     * hierarchy. Possible values are 'Subscription', 'Server', 'ElasticPool', 'Database' and 'Default' (when status is
     * not explicitly set on any level).
     *
     * @return the autoExecuteStatusInheritedFrom value.
     */
    public AutoExecuteStatusInheritedFrom autoExecuteStatusInheritedFrom() {
        return this.autoExecuteStatusInheritedFrom;
    }

    /**
     * Get the recommendationsStatus property: Gets that status of recommendations for this advisor and reason for not
     * having any recommendations. Possible values include, but are not limited to, 'Ok' (Recommendations
     * available),LowActivity (not enough workload to analyze), 'DbSeemsTuned' (Database is doing well), etc.
     *
     * @return the recommendationsStatus value.
     */
    public String recommendationsStatus() {
        return this.recommendationsStatus;
    }

    /**
     * Get the lastChecked property: Gets the time when the current resource was analyzed for recommendations by this
     * advisor.
     *
     * @return the lastChecked value.
     */
    public OffsetDateTime lastChecked() {
        return this.lastChecked;
    }

    /**
     * Get the recommendedActions property: Gets the recommended actions for this advisor.
     *
     * @return the recommendedActions value.
     */
    public List<RecommendedActionAutoGenerated2> recommendedActions() {
        return this.recommendedActions;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (recommendedActions() != null) {
            recommendedActions().forEach(e -> e.validate());
        }
    }
}
