// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.testbase.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.testbase.fluent.models.AnalysisResultSingletonResourceInner;
import com.azure.resourcemanager.testbase.models.AnalysisResultName;
import com.azure.resourcemanager.testbase.models.AnalysisResultType;

/** An instance of this class provides access to all the operations defined in AnalysisResultsClient. */
public interface AnalysisResultsClient {
    /**
     * Lists the Analysis Results of a Test Result. The result collection will only contain one element as all the data
     * will be nested in a singleton object.
     *
     * @param resourceGroupName The name of the resource group that contains the resource.
     * @param testBaseAccountName The resource name of the Test Base Account.
     * @param packageName The resource name of the Test Base Package.
     * @param testResultName The Test Result Name. It equals to {osName}-{TestResultId} string.
     * @param analysisResultType The type of the Analysis Result of a Test Result.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Analysis Results.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AnalysisResultSingletonResourceInner> list(
        String resourceGroupName,
        String testBaseAccountName,
        String packageName,
        String testResultName,
        AnalysisResultType analysisResultType);

    /**
     * Lists the Analysis Results of a Test Result. The result collection will only contain one element as all the data
     * will be nested in a singleton object.
     *
     * @param resourceGroupName The name of the resource group that contains the resource.
     * @param testBaseAccountName The resource name of the Test Base Account.
     * @param packageName The resource name of the Test Base Package.
     * @param testResultName The Test Result Name. It equals to {osName}-{TestResultId} string.
     * @param analysisResultType The type of the Analysis Result of a Test Result.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Analysis Results.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AnalysisResultSingletonResourceInner> list(
        String resourceGroupName,
        String testBaseAccountName,
        String packageName,
        String testResultName,
        AnalysisResultType analysisResultType,
        Context context);

    /**
     * Gets an Analysis Result of a Test Result by name.
     *
     * @param resourceGroupName The name of the resource group that contains the resource.
     * @param testBaseAccountName The resource name of the Test Base Account.
     * @param packageName The resource name of the Test Base Package.
     * @param testResultName The Test Result Name. It equals to {osName}-{TestResultId} string.
     * @param analysisResultName The name of the Analysis Result of a Test Result.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Analysis Result of a Test Result by name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AnalysisResultSingletonResourceInner get(
        String resourceGroupName,
        String testBaseAccountName,
        String packageName,
        String testResultName,
        AnalysisResultName analysisResultName);

    /**
     * Gets an Analysis Result of a Test Result by name.
     *
     * @param resourceGroupName The name of the resource group that contains the resource.
     * @param testBaseAccountName The resource name of the Test Base Account.
     * @param packageName The resource name of the Test Base Package.
     * @param testResultName The Test Result Name. It equals to {osName}-{TestResultId} string.
     * @param analysisResultName The name of the Analysis Result of a Test Result.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Analysis Result of a Test Result by name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AnalysisResultSingletonResourceInner> getWithResponse(
        String resourceGroupName,
        String testBaseAccountName,
        String packageName,
        String testResultName,
        AnalysisResultName analysisResultName,
        Context context);
}
