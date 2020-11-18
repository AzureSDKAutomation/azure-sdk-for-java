/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020-12-01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.synapse.v2020-12-01.implementation.SqlPoolsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing SqlPools.
 */
public interface SqlPools extends SupportsCreating<SqlPool.DefinitionStages.Blank>, HasInner<SqlPoolsInner> {
    /**
     * Pause SQL pool.
     * Pause a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Object> pauseAsync(String resourceGroupName, String workspaceName, String sqlPoolName);

    /**
     * Resume SQL pool.
     * Resume a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Object> resumeAsync(String resourceGroupName, String workspaceName, String sqlPoolName);

    /**
     * Rename a SQL pool.
     * Rename a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param id The target ID for the resource
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable renameAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String id);

    /**
     * Get SQL pool.
     * Get SQL pool properties.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SqlPool> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName);

    /**
     * List SQL pools.
     * List all SQL pools.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SqlPool> listByWorkspaceAsync(final String resourceGroupName, final String workspaceName);

    /**
     * Delete SQL pool.
     * Delete a SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String workspaceName, String sqlPoolName);

}
