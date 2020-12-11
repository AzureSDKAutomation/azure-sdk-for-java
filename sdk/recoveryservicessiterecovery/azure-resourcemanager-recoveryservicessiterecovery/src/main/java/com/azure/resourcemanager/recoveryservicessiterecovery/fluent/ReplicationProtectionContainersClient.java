// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.ProtectionContainerInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.CreateProtectionContainerInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.DiscoverProtectableItemRequest;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.SwitchProtectionInput;

/** An instance of this class provides access to all the operations defined in ReplicationProtectionContainersClient. */
public interface ReplicationProtectionContainersClient {
    /**
     * Lists the protection containers in the specified fabric.
     *
     * @param fabricName Fabric name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protection Container collection.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProtectionContainerInner> listByReplicationFabrics(String fabricName);

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
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProtectionContainerInner> listByReplicationFabrics(String fabricName, Context context);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProtectionContainerInner get(String fabricName, String protectionContainerName);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ProtectionContainerInner> getWithResponse(
        String fabricName, String protectionContainerName, Context context);

    /**
     * Operation to create a protection container.
     *
     * @param fabricName Unique fabric ARM name.
     * @param protectionContainerName Unique protection container ARM name.
     * @param creationInput Create protection container input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protection container details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ProtectionContainerInner>, ProtectionContainerInner> beginCreate(
        String fabricName, String protectionContainerName, CreateProtectionContainerInput creationInput);

    /**
     * Operation to create a protection container.
     *
     * @param fabricName Unique fabric ARM name.
     * @param protectionContainerName Unique protection container ARM name.
     * @param creationInput Create protection container input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protection container details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ProtectionContainerInner>, ProtectionContainerInner> beginCreate(
        String fabricName,
        String protectionContainerName,
        CreateProtectionContainerInput creationInput,
        Context context);

    /**
     * Operation to create a protection container.
     *
     * @param fabricName Unique fabric ARM name.
     * @param protectionContainerName Unique protection container ARM name.
     * @param creationInput Create protection container input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protection container details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProtectionContainerInner create(
        String fabricName, String protectionContainerName, CreateProtectionContainerInput creationInput);

    /**
     * Operation to create a protection container.
     *
     * @param fabricName Unique fabric ARM name.
     * @param protectionContainerName Unique protection container ARM name.
     * @param creationInput Create protection container input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protection container details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProtectionContainerInner create(
        String fabricName,
        String protectionContainerName,
        CreateProtectionContainerInput creationInput,
        Context context);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ProtectionContainerInner>, ProtectionContainerInner> beginDiscoverProtectableItem(
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ProtectionContainerInner>, ProtectionContainerInner> beginDiscoverProtectableItem(
        String fabricName,
        String protectionContainerName,
        DiscoverProtectableItemRequest discoverProtectableItemRequest,
        Context context);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProtectionContainerInner discoverProtectableItem(
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProtectionContainerInner discoverProtectableItem(
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
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String fabricName, String protectionContainerName);

    /**
     * Operation to remove a protection container.
     *
     * @param fabricName Unique fabric ARM name.
     * @param protectionContainerName Unique protection container ARM name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String fabricName, String protectionContainerName, Context context);

    /**
     * Operation to remove a protection container.
     *
     * @param fabricName Unique fabric ARM name.
     * @param protectionContainerName Unique protection container ARM name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
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
    @ServiceMethod(returns = ReturnType.SINGLE)
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ProtectionContainerInner>, ProtectionContainerInner> beginSwitchProtection(
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ProtectionContainerInner>, ProtectionContainerInner> beginSwitchProtection(
        String fabricName, String protectionContainerName, SwitchProtectionInput switchInput, Context context);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProtectionContainerInner switchProtection(
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProtectionContainerInner switchProtection(
        String fabricName, String protectionContainerName, SwitchProtectionInput switchInput, Context context);

    /**
     * Lists the protection containers in a vault.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protection Container collection.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProtectionContainerInner> list();

    /**
     * Lists the protection containers in a vault.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protection Container collection.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProtectionContainerInner> list(Context context);
}
