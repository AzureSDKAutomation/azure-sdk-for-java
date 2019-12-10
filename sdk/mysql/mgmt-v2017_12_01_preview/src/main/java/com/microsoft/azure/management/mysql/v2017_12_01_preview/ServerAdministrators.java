/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mysql.v2017_12_01_preview;

import rx.Observable;
import rx.Completable;
import com.microsoft.azure.management.mysql.v2017_12_01_preview.implementation.ServerAdministratorResourceInner;
import com.microsoft.azure.management.mysql.v2017_12_01_preview.implementation.ServerAdministratorsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ServerAdministrators.
 */
public interface ServerAdministrators extends HasInner<ServerAdministratorsInner> {
    /**
     * Gets information about a AAD server administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServerAdministratorResource> getAsync(String resourceGroupName, String serverName);

    /**
     * Creates or update active directory administrator on an existing server. The update action will overwrite the existing administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param properties The required parameters for creating or updating an AAD server administrator.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServerAdministratorResource> createOrUpdateAsync(String resourceGroupName, String serverName, ServerAdministratorResourceInner properties);

    /**
     * Deletes AAD Administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServerAdministratorResource> deleteAsync(String resourceGroupName, String serverName);

    /**
     * Returns a list of server Administrators.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServerAdministratorResource> listByServerAsync(String resourceGroupName, String serverName);

}
