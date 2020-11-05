/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2020_10_19_preview;

import rx.Observable;
import rx.Completable;
import com.microsoft.azure.management.desktopvirtualization.v2020_10_19_preview.implementation.UserSessionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing UserSessions.
 */
public interface UserSessions extends HasInner<UserSessionsInner> {
    /**
     * Get a userSession.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group
     * @param sessionHostName The name of the session host within the specified host pool
     * @param userSessionId The name of the user session within the specified session host
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<UserSession> getAsync(String resourceGroupName, String hostPoolName, String sessionHostName, String userSessionId);

    /**
     * Remove a userSession.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group
     * @param sessionHostName The name of the session host within the specified host pool
     * @param userSessionId The name of the user session within the specified session host
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String hostPoolName, String sessionHostName, String userSessionId);

    /**
     * List userSessions.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group
     * @param sessionHostName The name of the session host within the specified host pool
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<UserSession> listAsync(final String resourceGroupName, final String hostPoolName, final String sessionHostName);

    /**
     * Disconnect a userSession.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group
     * @param sessionHostName The name of the session host within the specified host pool
     * @param userSessionId The name of the user session within the specified session host
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable disconnectAsync(String resourceGroupName, String hostPoolName, String sessionHostName, String userSessionId);

    /**
     * Send a message to a user.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group
     * @param sessionHostName The name of the session host within the specified host pool
     * @param userSessionId The name of the user session within the specified session host
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable sendMessageMethodAsync(String resourceGroupName, String hostPoolName, String sessionHostName, String userSessionId);

    /**
     * List userSessions.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<UserSession> listByHostPoolAsync(final String resourceGroupName, final String hostPoolName);

}
