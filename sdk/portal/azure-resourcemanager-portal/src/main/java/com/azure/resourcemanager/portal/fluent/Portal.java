// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.portal.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for Portal class. */
public interface Portal {
    /**
     * Gets The Azure subscription ID. This is a GUID-formatted string (e.g. 00000000-0000-0000-0000-000000000000).
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the DashboardsClient object to access its operations.
     *
     * @return the DashboardsClient object.
     */
    DashboardsClient getDashboards();

    /**
     * Gets the TenantConfigurationsClient object to access its operations.
     *
     * @return the TenantConfigurationsClient object.
     */
    TenantConfigurationsClient getTenantConfigurations();

    /**
     * Gets the ListTenantConfigurationViolationsClient object to access its operations.
     *
     * @return the ListTenantConfigurationViolationsClient object.
     */
    ListTenantConfigurationViolationsClient getListTenantConfigurationViolations();
}
