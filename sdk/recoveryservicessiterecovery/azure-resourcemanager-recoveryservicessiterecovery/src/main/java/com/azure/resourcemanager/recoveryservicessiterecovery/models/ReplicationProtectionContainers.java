// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ReplicationProtectionContainers. */
public interface ReplicationProtectionContainers {
    /**
     * Lists the protection containers in the specified fabric.
     *
     * @param fabricName Fabric name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protection Container collection.
     */
    PagedIterable<ProtectionContainer> listByReplicationFabrics(String fabricName);

    /**
     * Lists the protection containers in the specified fabric.
     *
     * @param fabricName Fabric name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protection Container collection.
     */
    PagedIterable<ProtectionContainer> listByReplicationFabrics(String fabricName, Context context);

    /**
     * Gets the details of a protection container.
     *
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a protection container.
     */
    ProtectionContainer get(String fabricName, String protectionContainerName);

    /**
     * Gets the details of a protection container.
     *
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a protection container.
     */
    Response<ProtectionContainer> getWithResponse(String fabricName, String protectionContainerName, Context context);

    /**
     * The operation to a add a protectable item to a protection container(Add physical server.).
     *
     * @param fabricName The name of the fabric.
     * @param protectionContainerName The name of the protection container.
     * @param discoverProtectableItemRequest Request to add a physical machine as a protectable item in a container.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protection container details.
     */
    ProtectionContainer discoverProtectableItem(
        String fabricName,
        String protectionContainerName,
        DiscoverProtectableItemRequest discoverProtectableItemRequest);

    /**
     * The operation to a add a protectable item to a protection container(Add physical server.).
     *
     * @param fabricName The name of the fabric.
     * @param protectionContainerName The name of the protection container.
     * @param discoverProtectableItemRequest Request to add a physical machine as a protectable item in a container.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protection container details.
     */
    ProtectionContainer discoverProtectableItem(
        String fabricName,
        String protectionContainerName,
        DiscoverProtectableItemRequest discoverProtectableItemRequest,
        Context context);

    /**
     * Operation to remove a protection container.
     *
     * @param fabricName Unique fabric ARM name.
     * @param protectionContainerName Unique protection container ARM name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String fabricName, String protectionContainerName);

    /**
     * Operation to remove a protection container.
     *
     * @param fabricName Unique fabric ARM name.
     * @param protectionContainerName Unique protection container ARM name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String fabricName, String protectionContainerName, Context context);

    /**
     * Operation to switch protection from one container to another or one replication provider to another.
     *
     * @param fabricName Unique fabric name.
     * @param protectionContainerName Protection container name.
     * @param switchInput Switch protection input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protection container details.
     */
    ProtectionContainer switchProtection(
        String fabricName, String protectionContainerName, SwitchProtectionInput switchInput);

    /**
     * Operation to switch protection from one container to another or one replication provider to another.
     *
     * @param fabricName Unique fabric name.
     * @param protectionContainerName Protection container name.
     * @param switchInput Switch protection input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protection container details.
     */
    ProtectionContainer switchProtection(
        String fabricName, String protectionContainerName, SwitchProtectionInput switchInput, Context context);

    /**
     * Lists the protection containers in a vault.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protection Container collection.
     */
    PagedIterable<ProtectionContainer> list();

    /**
     * Lists the protection containers in a vault.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protection Container collection.
     */
    PagedIterable<ProtectionContainer> list(Context context);

    /**
     * Gets the details of a protection container.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a protection container.
     */
    ProtectionContainer getById(String id);

    /**
     * Gets the details of a protection container.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a protection container.
     */
    Response<ProtectionContainer> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ProtectionContainer resource.
     *
     * @param name resource name.
     * @return the first stage of the new ProtectionContainer definition.
     */
    ProtectionContainer.DefinitionStages.Blank define(String name);
}
