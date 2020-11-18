/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020-12-01;

import rx.Observable;
import com.microsoft.azure.management.synapse.v2020-12-01.implementation.SqlPoolGeoBackupPoliciesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing SqlPoolGeoBackupPolicies.
 */
public interface SqlPoolGeoBackupPolicies extends HasInner<SqlPoolGeoBackupPoliciesInner> {
    /**
     * Get a SQL pool geo backup policy.
     * Get the specified SQL pool geo backup policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<GeoBackupPolicy> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName);

    /**
     * List SQL pool geo backup policies.
     * Get list of SQL pool geo backup policies.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<GeoBackupPolicy> listAsync(String resourceGroupName, String workspaceName, String sqlPoolName);

}
