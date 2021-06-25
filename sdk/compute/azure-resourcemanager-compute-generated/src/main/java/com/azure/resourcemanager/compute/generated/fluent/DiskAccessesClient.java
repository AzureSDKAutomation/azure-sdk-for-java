// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.compute.generated.fluent.models.DiskAccessInner;
import com.azure.resourcemanager.compute.generated.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.compute.generated.fluent.models.PrivateLinkResourceListResultInner;
import com.azure.resourcemanager.compute.generated.models.DiskAccessUpdate;

/** An instance of this class provides access to all the operations defined in DiskAccessesClient. */
public interface DiskAccessesClient {
    /**
     * Creates or updates a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, underscore, and
     *     hyphen. The maximum name length is 80 characters.
     * @param diskAccess disk access object supplied in the body of the Put disk access operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk access resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<DiskAccessInner>, DiskAccessInner> beginCreateOrUpdate(
        String resourceGroupName, String diskAccessName, DiskAccessInner diskAccess);

    /**
     * Creates or updates a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, underscore, and
     *     hyphen. The maximum name length is 80 characters.
     * @param diskAccess disk access object supplied in the body of the Put disk access operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk access resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<DiskAccessInner>, DiskAccessInner> beginCreateOrUpdate(
        String resourceGroupName, String diskAccessName, DiskAccessInner diskAccess, Context context);

    /**
     * Creates or updates a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, underscore, and
     *     hyphen. The maximum name length is 80 characters.
     * @param diskAccess disk access object supplied in the body of the Put disk access operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk access resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiskAccessInner createOrUpdate(String resourceGroupName, String diskAccessName, DiskAccessInner diskAccess);

    /**
     * Creates or updates a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, underscore, and
     *     hyphen. The maximum name length is 80 characters.
     * @param diskAccess disk access object supplied in the body of the Put disk access operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk access resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiskAccessInner createOrUpdate(
        String resourceGroupName, String diskAccessName, DiskAccessInner diskAccess, Context context);

    /**
     * Updates (patches) a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, underscore, and
     *     hyphen. The maximum name length is 80 characters.
     * @param diskAccess disk access object supplied in the body of the Patch disk access operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk access resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<DiskAccessInner>, DiskAccessInner> beginUpdate(
        String resourceGroupName, String diskAccessName, DiskAccessUpdate diskAccess);

    /**
     * Updates (patches) a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, underscore, and
     *     hyphen. The maximum name length is 80 characters.
     * @param diskAccess disk access object supplied in the body of the Patch disk access operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk access resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<DiskAccessInner>, DiskAccessInner> beginUpdate(
        String resourceGroupName, String diskAccessName, DiskAccessUpdate diskAccess, Context context);

    /**
     * Updates (patches) a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, underscore, and
     *     hyphen. The maximum name length is 80 characters.
     * @param diskAccess disk access object supplied in the body of the Patch disk access operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk access resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiskAccessInner update(String resourceGroupName, String diskAccessName, DiskAccessUpdate diskAccess);

    /**
     * Updates (patches) a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, underscore, and
     *     hyphen. The maximum name length is 80 characters.
     * @param diskAccess disk access object supplied in the body of the Patch disk access operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk access resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiskAccessInner update(
        String resourceGroupName, String diskAccessName, DiskAccessUpdate diskAccess, Context context);

    /**
     * Gets information about a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, underscore, and
     *     hyphen. The maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a disk access resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiskAccessInner getByResourceGroup(String resourceGroupName, String diskAccessName);

    /**
     * Gets information about a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, underscore, and
     *     hyphen. The maximum name length is 80 characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a disk access resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DiskAccessInner> getByResourceGroupWithResponse(
        String resourceGroupName, String diskAccessName, Context context);

    /**
     * Deletes a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, underscore, and
     *     hyphen. The maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String diskAccessName);

    /**
     * Deletes a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, underscore, and
     *     hyphen. The maximum name length is 80 characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String diskAccessName, Context context);

    /**
     * Deletes a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, underscore, and
     *     hyphen. The maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String diskAccessName);

    /**
     * Deletes a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, underscore, and
     *     hyphen. The maximum name length is 80 characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String diskAccessName, Context context);

    /**
     * Lists all the disk access resources under a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List disk access operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DiskAccessInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the disk access resources under a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List disk access operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DiskAccessInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all the disk access resources under a subscription.
     *
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List disk access operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DiskAccessInner> list();

    /**
     * Lists all the disk access resources under a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List disk access operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DiskAccessInner> list(Context context);

    /**
     * Gets the private link resources possible under disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, underscore, and
     *     hyphen. The maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources possible under disk access resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateLinkResourceListResultInner getPrivateLinkResources(String resourceGroupName, String diskAccessName);

    /**
     * Gets the private link resources possible under disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, underscore, and
     *     hyphen. The maximum name length is 80 characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources possible under disk access resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateLinkResourceListResultInner> getPrivateLinkResourcesWithResponse(
        String resourceGroupName, String diskAccessName, Context context);

    /**
     * Approve or reject a private endpoint connection under disk access resource, this can't be used to create a new
     * private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, underscore, and
     *     hyphen. The maximum name length is 80 characters.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param privateEndpointConnection private endpoint connection object supplied in the body of the Put private
     *     endpoint connection operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<PrivateEndpointConnectionInner>, PrivateEndpointConnectionInner>
        beginUpdateAPrivateEndpointConnection(
            String resourceGroupName,
            String diskAccessName,
            String privateEndpointConnectionName,
            PrivateEndpointConnectionInner privateEndpointConnection);

    /**
     * Approve or reject a private endpoint connection under disk access resource, this can't be used to create a new
     * private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, underscore, and
     *     hyphen. The maximum name length is 80 characters.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param privateEndpointConnection private endpoint connection object supplied in the body of the Put private
     *     endpoint connection operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<PrivateEndpointConnectionInner>, PrivateEndpointConnectionInner>
        beginUpdateAPrivateEndpointConnection(
            String resourceGroupName,
            String diskAccessName,
            String privateEndpointConnectionName,
            PrivateEndpointConnectionInner privateEndpointConnection,
            Context context);

    /**
     * Approve or reject a private endpoint connection under disk access resource, this can't be used to create a new
     * private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, underscore, and
     *     hyphen. The maximum name length is 80 characters.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param privateEndpointConnection private endpoint connection object supplied in the body of the Put private
     *     endpoint connection operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner updateAPrivateEndpointConnection(
        String resourceGroupName,
        String diskAccessName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner privateEndpointConnection);

    /**
     * Approve or reject a private endpoint connection under disk access resource, this can't be used to create a new
     * private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, underscore, and
     *     hyphen. The maximum name length is 80 characters.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param privateEndpointConnection private endpoint connection object supplied in the body of the Put private
     *     endpoint connection operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner updateAPrivateEndpointConnection(
        String resourceGroupName,
        String diskAccessName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner privateEndpointConnection,
        Context context);

    /**
     * Gets information about a private endpoint connection under a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, underscore, and
     *     hyphen. The maximum name length is 80 characters.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a private endpoint connection under a disk access resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner getAPrivateEndpointConnection(
        String resourceGroupName, String diskAccessName, String privateEndpointConnectionName);

    /**
     * Gets information about a private endpoint connection under a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, underscore, and
     *     hyphen. The maximum name length is 80 characters.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a private endpoint connection under a disk access resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionInner> getAPrivateEndpointConnectionWithResponse(
        String resourceGroupName, String diskAccessName, String privateEndpointConnectionName, Context context);

    /**
     * Deletes a private endpoint connection under a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, underscore, and
     *     hyphen. The maximum name length is 80 characters.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDeleteAPrivateEndpointConnection(
        String resourceGroupName, String diskAccessName, String privateEndpointConnectionName);

    /**
     * Deletes a private endpoint connection under a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, underscore, and
     *     hyphen. The maximum name length is 80 characters.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDeleteAPrivateEndpointConnection(
        String resourceGroupName, String diskAccessName, String privateEndpointConnectionName, Context context);

    /**
     * Deletes a private endpoint connection under a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, underscore, and
     *     hyphen. The maximum name length is 80 characters.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteAPrivateEndpointConnection(
        String resourceGroupName, String diskAccessName, String privateEndpointConnectionName);

    /**
     * Deletes a private endpoint connection under a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, underscore, and
     *     hyphen. The maximum name length is 80 characters.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteAPrivateEndpointConnection(
        String resourceGroupName, String diskAccessName, String privateEndpointConnectionName, Context context);

    /**
     * List information about private endpoint connections under a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, underscore, and
     *     hyphen. The maximum name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of private link resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateEndpointConnectionInner> listPrivateEndpointConnections(
        String resourceGroupName, String diskAccessName);

    /**
     * List information about private endpoint connections under a disk access resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param diskAccessName The name of the disk access resource that is being created. The name can't be changed after
     *     the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9, underscore, and
     *     hyphen. The maximum name length is 80 characters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of private link resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateEndpointConnectionInner> listPrivateEndpointConnections(
        String resourceGroupName, String diskAccessName, Context context);
}
