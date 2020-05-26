/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.v2014_01_01;

import rx.Observable;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.ServicememberAddsserviceAlert;
import rx.Completable;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.implementation.ServicePropertiesInner;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.ReplicationSummary;

/**
 * Type representing AddsServices.
 */
public interface AddsServices {
    /**
     * Gets the details of an alert for a given Active Directory Domain Controller service and server combination.
     *
     * @param serviceMemberId The server Id for which the alert details needs to be queried.
     * @param serviceName The name of the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServicememberAddsserviceAlert> listServerAlertsAsync(final UUID serviceMemberId, final String serviceName);

    /**
     * Gets the server related metrics for a given metric and group combination.
     *
     * @param serviceName The name of the service.
     * @param metricName The metric name
     * @param groupName The group name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AddsserviceMetricSets> getMetricsAsync(String serviceName, String metricName, String groupName);

    /**
     * Gets the average of the metric values for a given metric and group combination.
     *
     * @param serviceName The name of the service.
     * @param metricName The metric name
     * @param groupName The group name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServiceItem> listMetricsAverageAsync(final String serviceName, final String metricName, final String groupName);

    /**
     * Gets the sum of the metric values for a given metric and group combination.
     *
     * @param serviceName The name of the service.
     * @param metricName The metric name
     * @param groupName The group name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServiceItem> listMetricsSumAsync(final String serviceName, final String metricName, final String groupName);

    /**
     * Gets the service related metrics for a given metric and group combination.
     *
     * @param serviceName The name of the service.
     * @param metricName The metric name
     * @param groupName The group name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AddsserviceMetricSets> getMetricMetadataForGroupAsync(String serviceName, String metricName, String groupName);

    /**
     * Gets the details of an Active Directory Domain Service for a tenant having Azure AD Premium license and is onboarded to Azure Active Directory Connect Health.
     *
     * @param serviceName The name of the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServiceProperties> getAsync(String serviceName);

    /**
     * Deletes an Active Directory Domain Service which is onboarded to Azure Active Directory Connect Health.
     *
     * @param serviceName The name of the service which needs to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String serviceName);

    /**
     * Updates an Active Directory Domain Service properties of an onboarded service.
     *
     * @param serviceName The name of the service which needs to be deleted.
     * @param service The service object.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServiceProperties> updateAsync(String serviceName, ServicePropertiesInner service);

    /**
     * Gets the forest summary for a given Active Directory Domain Service, that is onboarded to Azure Active Directory Connect Health.
     *
     * @param serviceName The name of the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ForestSummary> getForestSummaryAsync(String serviceName);

    /**
     * Gets the service related metrics information.
     *
     * @param serviceName The name of the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<MetricMetadata> listMetricMetadataAsync(final String serviceName);

    /**
     * Gets the service related metric information.
     *
     * @param serviceName The name of the service.
     * @param metricName The metric name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<MetricMetadata> getMetricMetadataAsync(String serviceName, String metricName);

    /**
     * Gets complete domain controller list along with replication details for a given Active Directory Domain Service, that is onboarded to Azure Active Directory Connect Health.
     *
     * @param serviceName The name of the service.
     * @param isGroupbySite Indicates if the result should be grouped by site or not.
     * @param query The custom query.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReplicationSummary> listReplicationSummaryAsync(String serviceName, boolean isGroupbySite, String query);

    /**
     * Gets the details of Active Directory Domain Services for a tenant having Azure AD Premium license and is onboarded to Azure Active Directory Connect Health.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServiceProperties> listPremiumServicesAsync();

    /**
     * Gets the details of Active Directory Domain Service, for a tenant, that are onboarded to Azure Active Directory Connect Health.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServiceProperties> listAsync();

    /**
     * Onboards a service for a given tenant in Azure Active Directory Connect Health.
     *
     * @param service The service object.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServiceProperties> addAsync(ServicePropertiesInner service);

    /**
     * Gets complete domain controller list along with replication details for a given Active Directory Domain Service, that is onboarded to Azure Active Directory Connect Health.
     *
     * @param serviceName The name of the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReplicationSummary> listReplicationDetailsAsync(String serviceName);

}
