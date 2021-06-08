// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.testbase.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.testbase.fluent.models.TestBaseAccountUsageDataInner;

/** An instance of this class provides access to all the operations defined in UsagesClient. */
public interface UsagesClient {
    /**
     * Lists the usage data of a Test Base Account.
     *
     * @param resourceGroupName The name of the resource group that contains the resource.
     * @param testBaseAccountName The resource name of the Test Base Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Test Base Account usage data.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TestBaseAccountUsageDataInner> list(String resourceGroupName, String testBaseAccountName);

    /**
     * Lists the usage data of a Test Base Account.
     *
     * @param resourceGroupName The name of the resource group that contains the resource.
     * @param testBaseAccountName The resource name of the Test Base Account.
     * @param filter Odata filter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Test Base Account usage data.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TestBaseAccountUsageDataInner> list(
        String resourceGroupName, String testBaseAccountName, String filter, Context context);
}
