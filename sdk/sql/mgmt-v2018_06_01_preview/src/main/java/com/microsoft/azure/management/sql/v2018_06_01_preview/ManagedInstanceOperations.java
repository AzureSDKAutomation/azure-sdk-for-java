/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2018_06_01_preview;

import rx.Observable;
import com.microsoft.azure.management.sql.v2018_06_01_preview.ManagedInstanceOperation;

/**
 * Type representing ManagedInstanceOperations.
 */
public interface ManagedInstanceOperations {
    /**
     * Gets a management operation on a managed instance.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param operationId the UUID value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ManagedInstanceOperation> getAsync(String resourceGroupName, String managedInstanceName, UUID operationId);

    /**
     * Gets a list of operations performed on the managed instance.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ManagedInstanceOperation> listByManagedInstanceAsync(final String resourceGroupName, final String managedInstanceName);

}
