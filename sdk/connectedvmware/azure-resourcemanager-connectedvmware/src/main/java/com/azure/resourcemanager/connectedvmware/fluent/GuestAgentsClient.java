// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.connectedvmware.fluent.models.GuestAgentInner;

/** An instance of this class provides access to all the operations defined in GuestAgentsClient. */
public interface GuestAgentsClient {
    /**
     * Create Or Update GuestAgent.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the vm.
     * @param name Name of the guestAgents.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the GuestAgent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<GuestAgentInner>, GuestAgentInner> beginCreate(
        String resourceGroupName, String virtualMachineName, String name, GuestAgentInner body);

    /**
     * Create Or Update GuestAgent.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the vm.
     * @param name Name of the guestAgents.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the GuestAgent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<GuestAgentInner>, GuestAgentInner> beginCreate(
        String resourceGroupName, String virtualMachineName, String name, GuestAgentInner body, Context context);

    /**
     * Create Or Update GuestAgent.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the vm.
     * @param name Name of the guestAgents.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the GuestAgent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GuestAgentInner create(String resourceGroupName, String virtualMachineName, String name, GuestAgentInner body);

    /**
     * Create Or Update GuestAgent.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the vm.
     * @param name Name of the guestAgents.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the GuestAgent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GuestAgentInner create(String resourceGroupName, String virtualMachineName, String name);

    /**
     * Create Or Update GuestAgent.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the vm.
     * @param name Name of the guestAgents.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the GuestAgent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GuestAgentInner create(
        String resourceGroupName, String virtualMachineName, String name, GuestAgentInner body, Context context);

    /**
     * Implements GuestAgent GET method.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the vm.
     * @param name Name of the GuestAgent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the GuestAgent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GuestAgentInner get(String resourceGroupName, String virtualMachineName, String name);

    /**
     * Implements GuestAgent GET method.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the vm.
     * @param name Name of the GuestAgent.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the GuestAgent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GuestAgentInner> getWithResponse(
        String resourceGroupName, String virtualMachineName, String name, Context context);

    /**
     * Implements GuestAgent DELETE method.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the vm.
     * @param name Name of the GuestAgent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String virtualMachineName, String name);

    /**
     * Implements GuestAgent DELETE method.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the vm.
     * @param name Name of the GuestAgent.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String virtualMachineName, String name, Context context);

    /**
     * Implements GuestAgent DELETE method.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the vm.
     * @param name Name of the GuestAgent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualMachineName, String name);

    /**
     * Implements GuestAgent DELETE method.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the vm.
     * @param name Name of the GuestAgent.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualMachineName, String name, Context context);

    /**
     * Returns the list of GuestAgent of the given vm.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the vm.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of GuestAgent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GuestAgentInner> listByVm(String resourceGroupName, String virtualMachineName);

    /**
     * Returns the list of GuestAgent of the given vm.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the vm.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of GuestAgent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GuestAgentInner> listByVm(String resourceGroupName, String virtualMachineName, Context context);
}
