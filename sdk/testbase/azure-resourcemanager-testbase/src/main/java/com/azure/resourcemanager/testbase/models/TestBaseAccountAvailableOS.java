// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.testbase.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of TestBaseAccountAvailableOS. */
public interface TestBaseAccountAvailableOS {
    /**
     * Gets an available OS to run a package under a Test Base Account.
     *
     * @param resourceGroupName The name of the resource group that contains the resource.
     * @param testBaseAccountName The resource name of the Test Base Account.
     * @param availableOSResourceName The resource name of an Available OS.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an available OS to run a package under a Test Base Account.
     */
    AvailableOSResource get(String resourceGroupName, String testBaseAccountName, String availableOSResourceName);

    /**
     * Gets an available OS to run a package under a Test Base Account.
     *
     * @param resourceGroupName The name of the resource group that contains the resource.
     * @param testBaseAccountName The resource name of the Test Base Account.
     * @param availableOSResourceName The resource name of an Available OS.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an available OS to run a package under a Test Base Account.
     */
    Response<AvailableOSResource> getWithResponse(
        String resourceGroupName, String testBaseAccountName, String availableOSResourceName, Context context);
}
