// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.SessionHostInner;
import com.azure.resourcemanager.desktopvirtualization.models.SessionHostPatch;

/** An instance of this class provides access to all the operations defined in SessionHostsClient. */
public interface SessionHostsClient {
    /**
     * Get a session host.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a session host.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SessionHostInner get(String resourceGroupName, String hostPoolName, String sessionHostname);

    /**
     * Get a session host.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a session host.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SessionHostInner> getWithResponse(
        String resourceGroupName, String hostPoolName, String sessionHostname, Context context);

    /**
     * Remove a SessionHost.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String hostPoolName, String sessionHostname);

    /**
     * Remove a SessionHost.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @param force Force flag to force sessionHost deletion even when userSession exists.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String hostPoolName, String sessionHostname, Boolean force, Context context);

    /**
     * Update a session host.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a SessionHost definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SessionHostInner update(String resourceGroupName, String hostPoolName, String sessionHostname);

    /**
     * Update a session host.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param sessionHostname The name of the session host within the specified host pool.
     * @param sessionHost Object containing SessionHost definitions.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a SessionHost definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SessionHostInner> updateWithResponse(
        String resourceGroupName,
        String hostPoolName,
        String sessionHostname,
        SessionHostPatch sessionHost,
        Context context);

    /**
     * List sessionHosts.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of SessionHost definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SessionHostInner> list(String resourceGroupName, String hostPoolName);

    /**
     * List sessionHosts.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of SessionHost definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SessionHostInner> list(String resourceGroupName, String hostPoolName, Context context);
}
