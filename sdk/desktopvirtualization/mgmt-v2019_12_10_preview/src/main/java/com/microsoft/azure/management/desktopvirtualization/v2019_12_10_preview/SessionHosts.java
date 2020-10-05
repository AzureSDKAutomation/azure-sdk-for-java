/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview;

import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview.implementation.SessionHostsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing SessionHosts.
 */
public interface SessionHosts extends HasInner<SessionHostsInner> {
    /**
     * Get a session host.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group
     * @param sessionHostName The name of the session host within the specified host pool
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SessionHost> getAsync(String resourceGroupName, String hostPoolName, String sessionHostName);

    /**
     * List sessionHosts.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SessionHost> listAsync(final String resourceGroupName, final String hostPoolName);

    /**
     * Remove a SessionHost.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group
     * @param sessionHostName The name of the session host within the specified host pool
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String hostPoolName, String sessionHostName);

}
