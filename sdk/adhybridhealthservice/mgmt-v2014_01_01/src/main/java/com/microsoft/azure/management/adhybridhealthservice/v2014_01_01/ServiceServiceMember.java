/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.v2014_01_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.implementation.ServiceMemberInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.implementation.ADHybridHealthServiceManager;
import org.joda.time.DateTime;

/**
 * Type representing ServiceServiceMember.
 */
public interface ServiceServiceMember extends HasInner<ServiceMemberInner>, HasManager<ADHybridHealthServiceManager> {
    /**
     * @return the activeAlerts value.
     */
    Integer activeAlerts();

    /**
     * @return the additionalInformation value.
     */
    String additionalInformation();

    /**
     * @return the createdDate value.
     */
    DateTime createdDate();

    /**
     * @return the dimensions value.
     */
    Object dimensions();

    /**
     * @return the disabled value.
     */
    Boolean disabled();

    /**
     * @return the disabledReason value.
     */
    Integer disabledReason();

    /**
     * @return the installedQfes value.
     */
    Object installedQfes();

    /**
     * @return the lastDisabled value.
     */
    DateTime lastDisabled();

    /**
     * @return the lastReboot value.
     */
    DateTime lastReboot();

    /**
     * @return the lastServerReportedMonitoringLevelChange value.
     */
    DateTime lastServerReportedMonitoringLevelChange();

    /**
     * @return the lastUpdated value.
     */
    DateTime lastUpdated();

    /**
     * @return the machineId value.
     */
    String machineId();

    /**
     * @return the machineName value.
     */
    String machineName();

    /**
     * @return the monitoringConfigurationsComputed value.
     */
    Object monitoringConfigurationsComputed();

    /**
     * @return the monitoringConfigurationsCustomized value.
     */
    Object monitoringConfigurationsCustomized();

    /**
     * @return the osName value.
     */
    String osName();

    /**
     * @return the osVersion value.
     */
    String osVersion();

    /**
     * @return the properties value.
     */
    Object properties();

    /**
     * @return the recommendedQfes value.
     */
    Object recommendedQfes();

    /**
     * @return the resolvedAlerts value.
     */
    Integer resolvedAlerts();

    /**
     * @return the role value.
     */
    String role();

    /**
     * @return the serverReportedMonitoringLevel value.
     */
    MonitoringLevel serverReportedMonitoringLevel();

    /**
     * @return the serviceId value.
     */
    String serviceId();

    /**
     * @return the serviceMemberId value.
     */
    String serviceMemberId();

    /**
     * @return the status value.
     */
    String status();

    /**
     * @return the tenantId value.
     */
    String tenantId();

}
