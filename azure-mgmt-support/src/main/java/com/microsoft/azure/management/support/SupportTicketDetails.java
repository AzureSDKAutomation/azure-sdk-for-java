/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.support;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.support.implementation.SupportTicketDetailsInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.support.implementation.SupportManager;
import org.joda.time.DateTime;

/**
 * Type representing SupportTicketDetails.
 */
public interface SupportTicketDetails extends HasInner<SupportTicketDetailsInner>, Indexable, Refreshable<SupportTicketDetails>, HasManager<SupportManager> {
    /**
     * @return the contactDetails value.
     */
    ContactProfile contactDetails();

    /**
     * @return the createdDate value.
     */
    DateTime createdDate();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the enrollmentId value.
     */
    String enrollmentId();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the is24X7Response value.
     */
    Boolean is24X7Response();

    /**
     * @return the modifiedDate value.
     */
    DateTime modifiedDate();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the problemClassificationDetails value.
     */
    ProblemClassificationDetails problemClassificationDetails();

    /**
     * @return the productionOutage value.
     */
    Boolean productionOutage();

    /**
     * @return the quotaTicketDetails value.
     */
    QuotaTicketDetails quotaTicketDetails();

    /**
     * @return the serviceDetails value.
     */
    ServiceDetails serviceDetails();

    /**
     * @return the serviceLevelAgreement value.
     */
    ServiceLevelAgreement serviceLevelAgreement();

    /**
     * @return the severity value.
     */
    SeverityLevel severity();

    /**
     * @return the status value.
     */
    String status();

    /**
     * @return the supportEngineer value.
     */
    SupportEngineer supportEngineer();

    /**
     * @return the supportPlanType value.
     */
    String supportPlanType();

    /**
     * @return the supportTicketId value.
     */
    String supportTicketId();

    /**
     * @return the technicalTicketDetails value.
     */
    TechnicalTicketDetails technicalTicketDetails();

    /**
     * @return the title value.
     */
    String title();

    /**
     * @return the type value.
     */
    String type();

}
