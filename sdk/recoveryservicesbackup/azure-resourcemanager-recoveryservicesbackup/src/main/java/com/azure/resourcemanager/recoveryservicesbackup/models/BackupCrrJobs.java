// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of BackupCrrJobs. */
public interface BackupCrrJobs {
    /**
     * Gets the list of CRR jobs from the target region.
     *
     * @param azureRegion Azure region to hit Api.
     * @param parameters Request object for fetching CRR jobs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of CRR jobs from the target region.
     */
    PagedIterable<JobResource> list(String azureRegion, CrrJobRequest parameters);

    /**
     * Gets the list of CRR jobs from the target region.
     *
     * @param azureRegion Azure region to hit Api.
     * @param parameters Request object for fetching CRR jobs.
     * @param filter OData filter options.
     * @param skipToken skipToken Filter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of CRR jobs from the target region.
     */
    PagedIterable<JobResource> list(
        String azureRegion, CrrJobRequest parameters, String filter, String skipToken, Context context);
}
