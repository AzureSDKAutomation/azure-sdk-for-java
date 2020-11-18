/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020-12-01;

import rx.Observable;
import com.microsoft.azure.management.synapse.v2020-12-01.implementation.SqlPoolSchemasInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing SqlPoolSchemas.
 */
public interface SqlPoolSchemas extends HasInner<SqlPoolSchemasInner> {
    /**
     * Get Sql Pool schema.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param schemaName The name of the schema.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SqlPoolSchema> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String schemaName);

    /**
     * Gets schemas of a given SQL pool.
     * Gets schemas of a given SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SqlPoolSchema> listAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName);

}
