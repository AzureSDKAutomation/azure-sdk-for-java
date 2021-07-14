// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes properties of an assessment metadata. */
@Fluent
public class SecurityAssessmentMetadataProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SecurityAssessmentMetadataProperties.class);

    /*
     * User friendly display name of the assessment
     */
    @JsonProperty(value = "displayName", required = true)
    private String displayName;

    /*
     * Azure resource ID of the policy definition that turns this assessment
     * calculation on
     */
    @JsonProperty(value = "policyDefinitionId", access = JsonProperty.Access.WRITE_ONLY)
    private String policyDefinitionId;

    /*
     * Human readable description of the assessment
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Human readable description of what you should do to mitigate this
     * security issue
     */
    @JsonProperty(value = "remediationDescription")
    private String remediationDescription;

    /*
     * The categories property.
     */
    @JsonProperty(value = "categories")
    private List<Categories> categories;

    /*
     * The severity level of the assessment
     */
    @JsonProperty(value = "severity", required = true)
    private Severity severity;

    /*
     * The user impact of the assessment
     */
    @JsonProperty(value = "userImpact")
    private UserImpact userImpact;

    /*
     * The implementation effort required to remediate this assessment
     */
    @JsonProperty(value = "implementationEffort")
    private ImplementationEffort implementationEffort;

    /*
     * The threats property.
     */
    @JsonProperty(value = "threats")
    private List<Threats> threats;

    /*
     * True if this assessment is in preview release status
     */
    @JsonProperty(value = "preview")
    private Boolean preview;

    /*
     * BuiltIn if the assessment based on built-in Azure Policy definition,
     * Custom if the assessment based on custom Azure Policy definition
     */
    @JsonProperty(value = "assessmentType", required = true)
    private AssessmentType assessmentType;

    /*
     * Describes the partner that created the assessment
     */
    @JsonProperty(value = "partnerData")
    private SecurityAssessmentMetadataPartnerData partnerData;

    /**
     * Get the displayName property: User friendly display name of the assessment.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: User friendly display name of the assessment.
     *
     * @param displayName the displayName value to set.
     * @return the SecurityAssessmentMetadataProperties object itself.
     */
    public SecurityAssessmentMetadataProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the policyDefinitionId property: Azure resource ID of the policy definition that turns this assessment
     * calculation on.
     *
     * @return the policyDefinitionId value.
     */
    public String policyDefinitionId() {
        return this.policyDefinitionId;
    }

    /**
     * Get the description property: Human readable description of the assessment.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Human readable description of the assessment.
     *
     * @param description the description value to set.
     * @return the SecurityAssessmentMetadataProperties object itself.
     */
    public SecurityAssessmentMetadataProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the remediationDescription property: Human readable description of what you should do to mitigate this
     * security issue.
     *
     * @return the remediationDescription value.
     */
    public String remediationDescription() {
        return this.remediationDescription;
    }

    /**
     * Set the remediationDescription property: Human readable description of what you should do to mitigate this
     * security issue.
     *
     * @param remediationDescription the remediationDescription value to set.
     * @return the SecurityAssessmentMetadataProperties object itself.
     */
    public SecurityAssessmentMetadataProperties withRemediationDescription(String remediationDescription) {
        this.remediationDescription = remediationDescription;
        return this;
    }

    /**
     * Get the categories property: The categories property.
     *
     * @return the categories value.
     */
    public List<Categories> categories() {
        return this.categories;
    }

    /**
     * Set the categories property: The categories property.
     *
     * @param categories the categories value to set.
     * @return the SecurityAssessmentMetadataProperties object itself.
     */
    public SecurityAssessmentMetadataProperties withCategories(List<Categories> categories) {
        this.categories = categories;
        return this;
    }

    /**
     * Get the severity property: The severity level of the assessment.
     *
     * @return the severity value.
     */
    public Severity severity() {
        return this.severity;
    }

    /**
     * Set the severity property: The severity level of the assessment.
     *
     * @param severity the severity value to set.
     * @return the SecurityAssessmentMetadataProperties object itself.
     */
    public SecurityAssessmentMetadataProperties withSeverity(Severity severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get the userImpact property: The user impact of the assessment.
     *
     * @return the userImpact value.
     */
    public UserImpact userImpact() {
        return this.userImpact;
    }

    /**
     * Set the userImpact property: The user impact of the assessment.
     *
     * @param userImpact the userImpact value to set.
     * @return the SecurityAssessmentMetadataProperties object itself.
     */
    public SecurityAssessmentMetadataProperties withUserImpact(UserImpact userImpact) {
        this.userImpact = userImpact;
        return this;
    }

    /**
     * Get the implementationEffort property: The implementation effort required to remediate this assessment.
     *
     * @return the implementationEffort value.
     */
    public ImplementationEffort implementationEffort() {
        return this.implementationEffort;
    }

    /**
     * Set the implementationEffort property: The implementation effort required to remediate this assessment.
     *
     * @param implementationEffort the implementationEffort value to set.
     * @return the SecurityAssessmentMetadataProperties object itself.
     */
    public SecurityAssessmentMetadataProperties withImplementationEffort(ImplementationEffort implementationEffort) {
        this.implementationEffort = implementationEffort;
        return this;
    }

    /**
     * Get the threats property: The threats property.
     *
     * @return the threats value.
     */
    public List<Threats> threats() {
        return this.threats;
    }

    /**
     * Set the threats property: The threats property.
     *
     * @param threats the threats value to set.
     * @return the SecurityAssessmentMetadataProperties object itself.
     */
    public SecurityAssessmentMetadataProperties withThreats(List<Threats> threats) {
        this.threats = threats;
        return this;
    }

    /**
     * Get the preview property: True if this assessment is in preview release status.
     *
     * @return the preview value.
     */
    public Boolean preview() {
        return this.preview;
    }

    /**
     * Set the preview property: True if this assessment is in preview release status.
     *
     * @param preview the preview value to set.
     * @return the SecurityAssessmentMetadataProperties object itself.
     */
    public SecurityAssessmentMetadataProperties withPreview(Boolean preview) {
        this.preview = preview;
        return this;
    }

    /**
     * Get the assessmentType property: BuiltIn if the assessment based on built-in Azure Policy definition, Custom if
     * the assessment based on custom Azure Policy definition.
     *
     * @return the assessmentType value.
     */
    public AssessmentType assessmentType() {
        return this.assessmentType;
    }

    /**
     * Set the assessmentType property: BuiltIn if the assessment based on built-in Azure Policy definition, Custom if
     * the assessment based on custom Azure Policy definition.
     *
     * @param assessmentType the assessmentType value to set.
     * @return the SecurityAssessmentMetadataProperties object itself.
     */
    public SecurityAssessmentMetadataProperties withAssessmentType(AssessmentType assessmentType) {
        this.assessmentType = assessmentType;
        return this;
    }

    /**
     * Get the partnerData property: Describes the partner that created the assessment.
     *
     * @return the partnerData value.
     */
    public SecurityAssessmentMetadataPartnerData partnerData() {
        return this.partnerData;
    }

    /**
     * Set the partnerData property: Describes the partner that created the assessment.
     *
     * @param partnerData the partnerData value to set.
     * @return the SecurityAssessmentMetadataProperties object itself.
     */
    public SecurityAssessmentMetadataProperties withPartnerData(SecurityAssessmentMetadataPartnerData partnerData) {
        this.partnerData = partnerData;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (displayName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property displayName in model SecurityAssessmentMetadataProperties"));
        }
        if (severity() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property severity in model SecurityAssessmentMetadataProperties"));
        }
        if (assessmentType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property assessmentType in model SecurityAssessmentMetadataProperties"));
        }
        if (partnerData() != null) {
            partnerData().validate();
        }
    }
}
