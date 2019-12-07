/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.support.implementation;

import com.microsoft.azure.management.support.ProblemClassificationDetails;
import com.microsoft.azure.management.support.SeverityLevel;
import com.microsoft.azure.management.support.ContactProfile;
import com.microsoft.azure.management.support.ServiceLevelAgreement;
import com.microsoft.azure.management.support.SupportEngineer;
import com.microsoft.azure.management.support.ServiceDetails;
import org.joda.time.DateTime;
import com.microsoft.azure.management.support.TechnicalTicketDetails;
import com.microsoft.azure.management.support.QuotaTicketDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Object that represents SupportTicketDetails resource.
 */
@JsonFlatten
public class SupportTicketDetailsInner extends ProxyResource {
    /**
     * System generated support ticket id.
     */
    @JsonProperty(value = "properties.supportTicketId")
    private String supportTicketId;

    /**
     * Description of the support ticket.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * This is the issue or the problem details that the support ticket is
     * opened for.
     */
    @JsonProperty(value = "properties.problemClassificationDetails")
    private ProblemClassificationDetails problemClassificationDetails;

    /**
     * Severity of the support ticket. Possible values include: 'minimal',
     * 'moderate', 'critical'.
     */
    @JsonProperty(value = "properties.severity")
    private SeverityLevel severity;

    /**
     * Enrollment ID associated with the support ticket.
     */
    @JsonProperty(value = "properties.enrollmentId")
    private String enrollmentId;

    /**
     * Indicates if this is a production outage.
     */
    @JsonProperty(value = "properties.productionOutage")
    private Boolean productionOutage;

    /**
     * Indicates if this is a 24x7 support ticket.
     */
    @JsonProperty(value = "properties.is24X7Response")
    private Boolean is24X7Response;

    /**
     * User information associated with the support ticket.
     */
    @JsonProperty(value = "properties.contactDetails")
    private ContactProfile contactDetails;

    /**
     * Service Level Agreement information for this support ticket.
     */
    @JsonProperty(value = "properties.serviceLevelAgreement")
    private ServiceLevelAgreement serviceLevelAgreement;

    /**
     * Information about support engineer working on this support ticket.
     */
    @JsonProperty(value = "properties.supportEngineer")
    private SupportEngineer supportEngineer;

    /**
     * Support plan type associated with the support ticket.
     */
    @JsonProperty(value = "properties.supportPlanType")
    private String supportPlanType;

    /**
     * Title of the support ticket.
     */
    @JsonProperty(value = "properties.title")
    private String title;

    /**
     * This is the Azure service details for which the support ticket was
     * opened.
     */
    @JsonProperty(value = "properties.serviceDetails")
    private ServiceDetails serviceDetails;

    /**
     * Status of the support ticket.
     */
    @JsonProperty(value = "properties.status")
    private String status;

    /**
     * Time in UTC (ISO 8601 format) when support ticket was created.
     */
    @JsonProperty(value = "properties.createdDate")
    private DateTime createdDate;

    /**
     * Time in UTC (ISO 8601 format) when support ticket was last modified.
     */
    @JsonProperty(value = "properties.modifiedDate")
    private DateTime modifiedDate;

    /**
     * Additional ticket details associated with a technical support ticket
     * request.
     */
    @JsonProperty(value = "properties.technicalTicketDetails")
    private TechnicalTicketDetails technicalTicketDetails;

    /**
     * Additional ticket details associated with a quota support ticket
     * request.
     */
    @JsonProperty(value = "properties.quotaTicketDetails")
    private QuotaTicketDetails quotaTicketDetails;

    /**
     * Get system generated support ticket id.
     *
     * @return the supportTicketId value
     */
    public String supportTicketId() {
        return this.supportTicketId;
    }

    /**
     * Set system generated support ticket id.
     *
     * @param supportTicketId the supportTicketId value to set
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withSupportTicketId(String supportTicketId) {
        this.supportTicketId = supportTicketId;
        return this;
    }

    /**
     * Get description of the support ticket.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description of the support ticket.
     *
     * @param description the description value to set
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get this is the issue or the problem details that the support ticket is opened for.
     *
     * @return the problemClassificationDetails value
     */
    public ProblemClassificationDetails problemClassificationDetails() {
        return this.problemClassificationDetails;
    }

    /**
     * Set this is the issue or the problem details that the support ticket is opened for.
     *
     * @param problemClassificationDetails the problemClassificationDetails value to set
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withProblemClassificationDetails(ProblemClassificationDetails problemClassificationDetails) {
        this.problemClassificationDetails = problemClassificationDetails;
        return this;
    }

    /**
     * Get severity of the support ticket. Possible values include: 'minimal', 'moderate', 'critical'.
     *
     * @return the severity value
     */
    public SeverityLevel severity() {
        return this.severity;
    }

    /**
     * Set severity of the support ticket. Possible values include: 'minimal', 'moderate', 'critical'.
     *
     * @param severity the severity value to set
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withSeverity(SeverityLevel severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get enrollment ID associated with the support ticket.
     *
     * @return the enrollmentId value
     */
    public String enrollmentId() {
        return this.enrollmentId;
    }

    /**
     * Set enrollment ID associated with the support ticket.
     *
     * @param enrollmentId the enrollmentId value to set
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withEnrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
        return this;
    }

    /**
     * Get indicates if this is a production outage.
     *
     * @return the productionOutage value
     */
    public Boolean productionOutage() {
        return this.productionOutage;
    }

    /**
     * Set indicates if this is a production outage.
     *
     * @param productionOutage the productionOutage value to set
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withProductionOutage(Boolean productionOutage) {
        this.productionOutage = productionOutage;
        return this;
    }

    /**
     * Get indicates if this is a 24x7 support ticket.
     *
     * @return the is24X7Response value
     */
    public Boolean is24X7Response() {
        return this.is24X7Response;
    }

    /**
     * Set indicates if this is a 24x7 support ticket.
     *
     * @param is24X7Response the is24X7Response value to set
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withIs24X7Response(Boolean is24X7Response) {
        this.is24X7Response = is24X7Response;
        return this;
    }

    /**
     * Get user information associated with the support ticket.
     *
     * @return the contactDetails value
     */
    public ContactProfile contactDetails() {
        return this.contactDetails;
    }

    /**
     * Set user information associated with the support ticket.
     *
     * @param contactDetails the contactDetails value to set
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withContactDetails(ContactProfile contactDetails) {
        this.contactDetails = contactDetails;
        return this;
    }

    /**
     * Get service Level Agreement information for this support ticket.
     *
     * @return the serviceLevelAgreement value
     */
    public ServiceLevelAgreement serviceLevelAgreement() {
        return this.serviceLevelAgreement;
    }

    /**
     * Set service Level Agreement information for this support ticket.
     *
     * @param serviceLevelAgreement the serviceLevelAgreement value to set
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withServiceLevelAgreement(ServiceLevelAgreement serviceLevelAgreement) {
        this.serviceLevelAgreement = serviceLevelAgreement;
        return this;
    }

    /**
     * Get information about support engineer working on this support ticket.
     *
     * @return the supportEngineer value
     */
    public SupportEngineer supportEngineer() {
        return this.supportEngineer;
    }

    /**
     * Set information about support engineer working on this support ticket.
     *
     * @param supportEngineer the supportEngineer value to set
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withSupportEngineer(SupportEngineer supportEngineer) {
        this.supportEngineer = supportEngineer;
        return this;
    }

    /**
     * Get support plan type associated with the support ticket.
     *
     * @return the supportPlanType value
     */
    public String supportPlanType() {
        return this.supportPlanType;
    }

    /**
     * Set support plan type associated with the support ticket.
     *
     * @param supportPlanType the supportPlanType value to set
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withSupportPlanType(String supportPlanType) {
        this.supportPlanType = supportPlanType;
        return this;
    }

    /**
     * Get title of the support ticket.
     *
     * @return the title value
     */
    public String title() {
        return this.title;
    }

    /**
     * Set title of the support ticket.
     *
     * @param title the title value to set
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get this is the Azure service details for which the support ticket was opened.
     *
     * @return the serviceDetails value
     */
    public ServiceDetails serviceDetails() {
        return this.serviceDetails;
    }

    /**
     * Set this is the Azure service details for which the support ticket was opened.
     *
     * @param serviceDetails the serviceDetails value to set
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withServiceDetails(ServiceDetails serviceDetails) {
        this.serviceDetails = serviceDetails;
        return this;
    }

    /**
     * Get status of the support ticket.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set status of the support ticket.
     *
     * @param status the status value to set
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get time in UTC (ISO 8601 format) when support ticket was created.
     *
     * @return the createdDate value
     */
    public DateTime createdDate() {
        return this.createdDate;
    }

    /**
     * Set time in UTC (ISO 8601 format) when support ticket was created.
     *
     * @param createdDate the createdDate value to set
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withCreatedDate(DateTime createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * Get time in UTC (ISO 8601 format) when support ticket was last modified.
     *
     * @return the modifiedDate value
     */
    public DateTime modifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Set time in UTC (ISO 8601 format) when support ticket was last modified.
     *
     * @param modifiedDate the modifiedDate value to set
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withModifiedDate(DateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    /**
     * Get additional ticket details associated with a technical support ticket request.
     *
     * @return the technicalTicketDetails value
     */
    public TechnicalTicketDetails technicalTicketDetails() {
        return this.technicalTicketDetails;
    }

    /**
     * Set additional ticket details associated with a technical support ticket request.
     *
     * @param technicalTicketDetails the technicalTicketDetails value to set
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withTechnicalTicketDetails(TechnicalTicketDetails technicalTicketDetails) {
        this.technicalTicketDetails = technicalTicketDetails;
        return this;
    }

    /**
     * Get additional ticket details associated with a quota support ticket request.
     *
     * @return the quotaTicketDetails value
     */
    public QuotaTicketDetails quotaTicketDetails() {
        return this.quotaTicketDetails;
    }

    /**
     * Set additional ticket details associated with a quota support ticket request.
     *
     * @param quotaTicketDetails the quotaTicketDetails value to set
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withQuotaTicketDetails(QuotaTicketDetails quotaTicketDetails) {
        this.quotaTicketDetails = quotaTicketDetails;
        return this;
    }

}
