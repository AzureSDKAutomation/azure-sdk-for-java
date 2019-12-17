/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.support.implementation;

import com.microsoft.azure.management.support.SeverityLevel;
import com.microsoft.azure.management.support.ContactProfile;
import com.microsoft.azure.management.support.ServiceLevelAgreement;
import com.microsoft.azure.management.support.SupportEngineer;
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
     * System generated support ticket name.
     */
    @JsonProperty(value = "properties.supportTicketId")
    private String supportTicketId;

    /**
     * Description of the support ticket.
     */
    @JsonProperty(value = "properties.description", required = true)
    private String description;

    /**
     * This is the resource id of ProblemClassification resource associated
     * with the support ticket. This is the issue or the problem that the
     * support ticket is opened for.
     */
    @JsonProperty(value = "properties.problemClassificationId", required = true)
    private String problemClassificationId;

    /**
     * Localized name of problem classification.
     */
    @JsonProperty(value = "properties.problemClassificationDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String problemClassificationDisplayName;

    /**
     * Severity of the support ticket. Possible values include: 'minimal',
     * 'moderate', 'critical'.
     */
    @JsonProperty(value = "properties.severity", required = true)
    private SeverityLevel severity;

    /**
     * Enrollment ID associated with the support ticket.
     */
    @JsonProperty(value = "properties.enrollmentId", access = JsonProperty.Access.WRITE_ONLY)
    private String enrollmentId;

    /**
     * Indicates if this is a production outage.
     */
    @JsonProperty(value = "properties.productionOutage", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean productionOutage;

    /**
     * Indicates if this is a 24x7 support ticket.
     */
    @JsonProperty(value = "properties.require24X7Response")
    private Boolean require24X7Response;

    /**
     * User information associated with the support ticket.
     */
    @JsonProperty(value = "properties.contactDetails", required = true)
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
    @JsonProperty(value = "properties.supportPlanType", access = JsonProperty.Access.WRITE_ONLY)
    private String supportPlanType;

    /**
     * Title of the support ticket.
     */
    @JsonProperty(value = "properties.title", required = true)
    private String title;

    /**
     * Time in UTC (ISO 8601 format) when the problem started.
     */
    @JsonProperty(value = "properties.problemStartTime")
    private DateTime problemStartTime;

    /**
     * This is the resource id of Service resource associated with the support
     * ticket. This is the Azure service for which the support ticket was
     * opened.
     */
    @JsonProperty(value = "properties.serviceId", required = true)
    private String serviceId;

    /**
     * Localized name of Azure service.
     */
    @JsonProperty(value = "properties.serviceDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceDisplayName;

    /**
     * Status of the support ticket.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /**
     * Time in UTC (ISO 8601 format) when support ticket was created.
     */
    @JsonProperty(value = "properties.createdDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdDate;

    /**
     * Time in UTC (ISO 8601 format) when support ticket was last modified.
     */
    @JsonProperty(value = "properties.modifiedDate", access = JsonProperty.Access.WRITE_ONLY)
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
     * Get system generated support ticket name.
     *
     * @return the supportTicketId value
     */
    public String supportTicketId() {
        return this.supportTicketId;
    }

    /**
     * Set system generated support ticket name.
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
     * Get this is the resource id of ProblemClassification resource associated with the support ticket. This is the issue or the problem that the support ticket is opened for.
     *
     * @return the problemClassificationId value
     */
    public String problemClassificationId() {
        return this.problemClassificationId;
    }

    /**
     * Set this is the resource id of ProblemClassification resource associated with the support ticket. This is the issue or the problem that the support ticket is opened for.
     *
     * @param problemClassificationId the problemClassificationId value to set
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withProblemClassificationId(String problemClassificationId) {
        this.problemClassificationId = problemClassificationId;
        return this;
    }

    /**
     * Get localized name of problem classification.
     *
     * @return the problemClassificationDisplayName value
     */
    public String problemClassificationDisplayName() {
        return this.problemClassificationDisplayName;
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
     * Get indicates if this is a production outage.
     *
     * @return the productionOutage value
     */
    public Boolean productionOutage() {
        return this.productionOutage;
    }

    /**
     * Get indicates if this is a 24x7 support ticket.
     *
     * @return the require24X7Response value
     */
    public Boolean require24X7Response() {
        return this.require24X7Response;
    }

    /**
     * Set indicates if this is a 24x7 support ticket.
     *
     * @param require24X7Response the require24X7Response value to set
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withRequire24X7Response(Boolean require24X7Response) {
        this.require24X7Response = require24X7Response;
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
     * Get time in UTC (ISO 8601 format) when the problem started.
     *
     * @return the problemStartTime value
     */
    public DateTime problemStartTime() {
        return this.problemStartTime;
    }

    /**
     * Set time in UTC (ISO 8601 format) when the problem started.
     *
     * @param problemStartTime the problemStartTime value to set
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withProblemStartTime(DateTime problemStartTime) {
        this.problemStartTime = problemStartTime;
        return this;
    }

    /**
     * Get this is the resource id of Service resource associated with the support ticket. This is the Azure service for which the support ticket was opened.
     *
     * @return the serviceId value
     */
    public String serviceId() {
        return this.serviceId;
    }

    /**
     * Set this is the resource id of Service resource associated with the support ticket. This is the Azure service for which the support ticket was opened.
     *
     * @param serviceId the serviceId value to set
     * @return the SupportTicketDetailsInner object itself.
     */
    public SupportTicketDetailsInner withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * Get localized name of Azure service.
     *
     * @return the serviceDisplayName value
     */
    public String serviceDisplayName() {
        return this.serviceDisplayName;
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
     * Get time in UTC (ISO 8601 format) when support ticket was created.
     *
     * @return the createdDate value
     */
    public DateTime createdDate() {
        return this.createdDate;
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
