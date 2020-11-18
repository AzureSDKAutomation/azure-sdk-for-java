/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020-12-01;

import rx.Observable;
import com.microsoft.azure.management.synapse.v2020-12-01.implementation.WorkspaceManagedSqlServerUsagesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing WorkspaceManagedSqlServerUsages.
 */
public interface WorkspaceManagedSqlServerUsages extends HasInner<WorkspaceManagedSqlServerUsagesInner> {
    /**
     * Get list of usages metric for the server.
     * Get list of server usages metric for workspace managed sql server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServerUsage> listAsync(final String resourceGroupName, final String workspaceName);

}
