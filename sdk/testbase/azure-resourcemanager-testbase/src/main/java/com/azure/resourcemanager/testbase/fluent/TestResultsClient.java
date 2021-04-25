// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.testbase.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.testbase.fluent.models.TestResultResourceInner;
import com.azure.resourcemanager.testbase.models.OsUpdateType;

/** An instance of this class provides access to all the operations defined in TestResultsClient. */
public interface TestResultsClient {
    /**
     * Lists all the Test Results with specified OS Update type for a Test Base Package. Can be filtered by osName,
     * releaseName, flightingRing, buildVersion, buildRevision.
     *
     * @param resourceGroupName The name of the resource group that contains the resource.
     * @param testBaseAccountName The resource name of the Test Base Account.
     * @param packageName The resource name of the Test Base Package.
     * @param osUpdateType The type of the OS Update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Test Results.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TestResultResourceInner> list(
        String resourceGroupName, String testBaseAccountName, String packageName, OsUpdateType osUpdateType);

    /**
     * Lists all the Test Results with specified OS Update type for a Test Base Package. Can be filtered by osName,
     * releaseName, flightingRing, buildVersion, buildRevision.
     *
     * @param resourceGroupName The name of the resource group that contains the resource.
     * @param testBaseAccountName The resource name of the Test Base Account.
     * @param packageName The resource name of the Test Base Package.
     * @param osUpdateType The type of the OS Update.
     * @param filter Odata filter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Test Results.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TestResultResourceInner> list(
        String resourceGroupName,
        String testBaseAccountName,
        String packageName,
        OsUpdateType osUpdateType,
        String filter,
        Context context);
}
