// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.devtestlabs.fluent.models.DiskInner;
import com.azure.resourcemanager.devtestlabs.models.AttachDiskProperties;
import com.azure.resourcemanager.devtestlabs.models.DetachDiskProperties;
import com.azure.resourcemanager.devtestlabs.models.UpdateResource;

/** An instance of this class provides access to all the operations defined in DisksClient. */
public interface DisksClient {
    /**
     * List disks in a given user profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DiskInner> list(String resourceGroupName, String labName, String username);

    /**
     * List disks in a given user profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param expand Specify the $expand query. Example: 'properties($select=diskType)'.
     * @param filter The filter to apply to the operation. Example: '$filter=contains(name,'myName').
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param orderby The ordering expression for the results, using OData notation. Example: '$orderby=name desc'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DiskInner> list(
        String resourceGroupName,
        String labName,
        String username,
        String expand,
        String filter,
        Integer top,
        String orderby,
        Context context);

    /**
     * Get disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the disk.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiskInner get(String resourceGroupName, String labName, String username, String name);

    /**
     * Get disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the disk.
     * @param expand Specify the $expand query. Example: 'properties($select=diskType)'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DiskInner> getWithResponse(
        String resourceGroupName, String labName, String username, String name, String expand, Context context);

    /**
     * Create or replace an existing disk. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the disk.
     * @param disk A Disk.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Disk.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<DiskInner>, DiskInner> beginCreateOrUpdate(
        String resourceGroupName, String labName, String username, String name, DiskInner disk);

    /**
     * Create or replace an existing disk. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the disk.
     * @param disk A Disk.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Disk.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<DiskInner>, DiskInner> beginCreateOrUpdate(
        String resourceGroupName, String labName, String username, String name, DiskInner disk, Context context);

    /**
     * Create or replace an existing disk. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the disk.
     * @param disk A Disk.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Disk.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiskInner createOrUpdate(String resourceGroupName, String labName, String username, String name, DiskInner disk);

    /**
     * Create or replace an existing disk. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the disk.
     * @param disk A Disk.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Disk.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiskInner createOrUpdate(
        String resourceGroupName, String labName, String username, String name, DiskInner disk, Context context);

    /**
     * Delete disk. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the disk.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String labName, String username, String name);

    /**
     * Delete disk. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the disk.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String labName, String username, String name, Context context);

    /**
     * Delete disk. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the disk.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String labName, String username, String name);

    /**
     * Delete disk. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the disk.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String labName, String username, String name, Context context);

    /**
     * Allows modifying tags of disks. All other properties will be ignored.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the disk.
     * @param disk A Disk.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Disk.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiskInner update(String resourceGroupName, String labName, String username, String name, UpdateResource disk);

    /**
     * Allows modifying tags of disks. All other properties will be ignored.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the disk.
     * @param disk A Disk.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Disk.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DiskInner> updateWithResponse(
        String resourceGroupName, String labName, String username, String name, UpdateResource disk, Context context);

    /**
     * Attach and create the lease of the disk to the virtual machine. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the disk.
     * @param attachDiskProperties Properties of the disk to attach.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginAttach(
        String resourceGroupName,
        String labName,
        String username,
        String name,
        AttachDiskProperties attachDiskProperties);

    /**
     * Attach and create the lease of the disk to the virtual machine. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the disk.
     * @param attachDiskProperties Properties of the disk to attach.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginAttach(
        String resourceGroupName,
        String labName,
        String username,
        String name,
        AttachDiskProperties attachDiskProperties,
        Context context);

    /**
     * Attach and create the lease of the disk to the virtual machine. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the disk.
     * @param attachDiskProperties Properties of the disk to attach.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void attach(
        String resourceGroupName,
        String labName,
        String username,
        String name,
        AttachDiskProperties attachDiskProperties);

    /**
     * Attach and create the lease of the disk to the virtual machine. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the disk.
     * @param attachDiskProperties Properties of the disk to attach.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void attach(
        String resourceGroupName,
        String labName,
        String username,
        String name,
        AttachDiskProperties attachDiskProperties,
        Context context);

    /**
     * Detach and break the lease of the disk attached to the virtual machine. This operation can take a while to
     * complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the disk.
     * @param detachDiskProperties Properties of the disk to detach.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDetach(
        String resourceGroupName,
        String labName,
        String username,
        String name,
        DetachDiskProperties detachDiskProperties);

    /**
     * Detach and break the lease of the disk attached to the virtual machine. This operation can take a while to
     * complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the disk.
     * @param detachDiskProperties Properties of the disk to detach.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDetach(
        String resourceGroupName,
        String labName,
        String username,
        String name,
        DetachDiskProperties detachDiskProperties,
        Context context);

    /**
     * Detach and break the lease of the disk attached to the virtual machine. This operation can take a while to
     * complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the disk.
     * @param detachDiskProperties Properties of the disk to detach.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void detach(
        String resourceGroupName,
        String labName,
        String username,
        String name,
        DetachDiskProperties detachDiskProperties);

    /**
     * Detach and break the lease of the disk attached to the virtual machine. This operation can take a while to
     * complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the disk.
     * @param detachDiskProperties Properties of the disk to detach.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void detach(
        String resourceGroupName,
        String labName,
        String username,
        String name,
        DetachDiskProperties detachDiskProperties,
        Context context);
}
