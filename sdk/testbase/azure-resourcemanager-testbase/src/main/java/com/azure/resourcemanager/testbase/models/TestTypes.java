// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.testbase.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of TestTypes. */
public interface TestTypes {
    /**
     * Lists all the test types of a Test Base Account.
     *
     * @param resourceGroupName The name of the resource group that contains the resource.
     * @param testBaseAccountName The resource name of the Test Base Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of test types.
     */
    PagedIterable<TestTypeResource> list(String resourceGroupName, String testBaseAccountName);

    /**
     * Lists all the test types of a Test Base Account.
     *
     * @param resourceGroupName The name of the resource group that contains the resource.
     * @param testBaseAccountName The resource name of the Test Base Account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of test types.
     */
    PagedIterable<TestTypeResource> list(String resourceGroupName, String testBaseAccountName, Context context);

    /**
     * Gets a test type of a Test Base Account.
     *
     * @param resourceGroupName The name of the resource group that contains the resource.
     * @param testBaseAccountName The resource name of the Test Base Account.
     * @param testTypeResourceName The resource name of a test type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a test type of a Test Base Account.
     */
    TestTypeResource get(String resourceGroupName, String testBaseAccountName, String testTypeResourceName);

    /**
     * Gets a test type of a Test Base Account.
     *
     * @param resourceGroupName The name of the resource group that contains the resource.
     * @param testBaseAccountName The resource name of the Test Base Account.
     * @param testTypeResourceName The resource name of a test type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a test type of a Test Base Account.
     */
    Response<TestTypeResource> getWithResponse(
        String resourceGroupName, String testBaseAccountName, String testTypeResourceName, Context context);
}
