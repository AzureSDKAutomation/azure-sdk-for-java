// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.testbase.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for RestApiForTestBase class. */
public interface RestApiForTestBase {
    /**
     * Gets The Azure subscription ID. This is a GUID-formatted string.
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
     * Gets the SKUsClient object to access its operations.
     *
     * @return the SKUsClient object.
     */
    SKUsClient getSKUs();

    /**
     * Gets the TestBaseAccountsClient object to access its operations.
     *
     * @return the TestBaseAccountsClient object.
     */
    TestBaseAccountsClient getTestBaseAccounts();

    /**
     * Gets the TestBaseAccountOperationsClient object to access its operations.
     *
     * @return the TestBaseAccountOperationsClient object.
     */
    TestBaseAccountOperationsClient getTestBaseAccountOperations();

    /**
     * Gets the TestBaseAccountUsagesClient object to access its operations.
     *
     * @return the TestBaseAccountUsagesClient object.
     */
    TestBaseAccountUsagesClient getTestBaseAccountUsages();

    /**
     * Gets the ResourceProvidersClient object to access its operations.
     *
     * @return the ResourceProvidersClient object.
     */
    ResourceProvidersClient getResourceProviders();

    /**
     * Gets the TestBaseAccountAvailableOSsClient object to access its operations.
     *
     * @return the TestBaseAccountAvailableOSsClient object.
     */
    TestBaseAccountAvailableOSsClient getTestBaseAccountAvailableOSs();

    /**
     * Gets the TestBaseAccountAvailableOSClient object to access its operations.
     *
     * @return the TestBaseAccountAvailableOSClient object.
     */
    TestBaseAccountAvailableOSClient getTestBaseAccountAvailableOS();

    /**
     * Gets the TestBaseAccountFlightingRingsClient object to access its operations.
     *
     * @return the TestBaseAccountFlightingRingsClient object.
     */
    TestBaseAccountFlightingRingsClient getTestBaseAccountFlightingRings();

    /**
     * Gets the TestBaseAccountFlightingRingOperationsClient object to access its operations.
     *
     * @return the TestBaseAccountFlightingRingOperationsClient object.
     */
    TestBaseAccountFlightingRingOperationsClient getTestBaseAccountFlightingRingOperations();

    /**
     * Gets the TestBaseAccountTestTypesClient object to access its operations.
     *
     * @return the TestBaseAccountTestTypesClient object.
     */
    TestBaseAccountTestTypesClient getTestBaseAccountTestTypes();

    /**
     * Gets the TestBaseAccountTestTypeOperationsClient object to access its operations.
     *
     * @return the TestBaseAccountTestTypeOperationsClient object.
     */
    TestBaseAccountTestTypeOperationsClient getTestBaseAccountTestTypeOperations();

    /**
     * Gets the PackagesClient object to access its operations.
     *
     * @return the PackagesClient object.
     */
    PackagesClient getPackages();

    /**
     * Gets the PackageOperationsClient object to access its operations.
     *
     * @return the PackageOperationsClient object.
     */
    PackageOperationsClient getPackageOperations();

    /**
     * Gets the TestSummariesClient object to access its operations.
     *
     * @return the TestSummariesClient object.
     */
    TestSummariesClient getTestSummaries();

    /**
     * Gets the TestSummaryOperationsClient object to access its operations.
     *
     * @return the TestSummaryOperationsClient object.
     */
    TestSummaryOperationsClient getTestSummaryOperations();

    /**
     * Gets the TestResultsClient object to access its operations.
     *
     * @return the TestResultsClient object.
     */
    TestResultsClient getTestResults();

    /**
     * Gets the TestResultOperationsClient object to access its operations.
     *
     * @return the TestResultOperationsClient object.
     */
    TestResultOperationsClient getTestResultOperations();

    /**
     * Gets the OSUpdatesClient object to access its operations.
     *
     * @return the OSUpdatesClient object.
     */
    OSUpdatesClient getOSUpdates();

    /**
     * Gets the OSUpdateOperationsClient object to access its operations.
     *
     * @return the OSUpdateOperationsClient object.
     */
    OSUpdateOperationsClient getOSUpdateOperations();

    /**
     * Gets the FavoriteProcessesClient object to access its operations.
     *
     * @return the FavoriteProcessesClient object.
     */
    FavoriteProcessesClient getFavoriteProcesses();

    /**
     * Gets the FavoriteProcessClient object to access its operations.
     *
     * @return the FavoriteProcessClient object.
     */
    FavoriteProcessClient getFavoriteProcess();

    /**
     * Gets the AnalysisResultsClient object to access its operations.
     *
     * @return the AnalysisResultsClient object.
     */
    AnalysisResultsClient getAnalysisResults();

    /**
     * Gets the AnalysisResultOperationsClient object to access its operations.
     *
     * @return the AnalysisResultOperationsClient object.
     */
    AnalysisResultOperationsClient getAnalysisResultOperations();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();
}
