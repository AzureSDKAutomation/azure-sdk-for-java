// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.keyvault.generated.fluent.models.DeletedManagedHsmInner;
import com.azure.resourcemanager.keyvault.generated.fluent.models.ManagedHsmInner;

/** An instance of this class provides access to all the operations defined in ManagedHsmsClient. */
public interface ManagedHsmsClient {
    /**
     * Create or update a managed HSM Pool in the specified subscription.
     *
     * @param resourceGroupName Name of the resource group that contains the managed HSM pool.
     * @param name Name of the managed HSM Pool.
     * @param parameters Parameters to create or update the managed HSM Pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.keyvault.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource information with extended details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ManagedHsmInner>, ManagedHsmInner> beginCreateOrUpdate(
        String resourceGroupName, String name, ManagedHsmInner parameters);

    /**
     * Create or update a managed HSM Pool in the specified subscription.
     *
     * @param resourceGroupName Name of the resource group that contains the managed HSM pool.
     * @param name Name of the managed HSM Pool.
     * @param parameters Parameters to create or update the managed HSM Pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.keyvault.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource information with extended details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ManagedHsmInner>, ManagedHsmInner> beginCreateOrUpdate(
        String resourceGroupName, String name, ManagedHsmInner parameters, Context context);

    /**
     * Create or update a managed HSM Pool in the specified subscription.
     *
     * @param resourceGroupName Name of the resource group that contains the managed HSM pool.
     * @param name Name of the managed HSM Pool.
     * @param parameters Parameters to create or update the managed HSM Pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.keyvault.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource information with extended details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedHsmInner createOrUpdate(String resourceGroupName, String name, ManagedHsmInner parameters);

    /**
     * Create or update a managed HSM Pool in the specified subscription.
     *
     * @param resourceGroupName Name of the resource group that contains the managed HSM pool.
     * @param name Name of the managed HSM Pool.
     * @param parameters Parameters to create or update the managed HSM Pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.keyvault.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource information with extended details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedHsmInner createOrUpdate(String resourceGroupName, String name, ManagedHsmInner parameters, Context context);

    /**
     * Update a managed HSM Pool in the specified subscription.
     *
     * @param resourceGroupName Name of the resource group that contains the managed HSM pool.
     * @param name Name of the managed HSM Pool.
     * @param parameters Parameters to patch the managed HSM Pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.keyvault.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource information with extended details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ManagedHsmInner>, ManagedHsmInner> beginUpdate(
        String resourceGroupName, String name, ManagedHsmInner parameters);

    /**
     * Update a managed HSM Pool in the specified subscription.
     *
     * @param resourceGroupName Name of the resource group that contains the managed HSM pool.
     * @param name Name of the managed HSM Pool.
     * @param parameters Parameters to patch the managed HSM Pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.keyvault.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource information with extended details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ManagedHsmInner>, ManagedHsmInner> beginUpdate(
        String resourceGroupName, String name, ManagedHsmInner parameters, Context context);

    /**
     * Update a managed HSM Pool in the specified subscription.
     *
     * @param resourceGroupName Name of the resource group that contains the managed HSM pool.
     * @param name Name of the managed HSM Pool.
     * @param parameters Parameters to patch the managed HSM Pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.keyvault.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource information with extended details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedHsmInner update(String resourceGroupName, String name, ManagedHsmInner parameters);

    /**
     * Update a managed HSM Pool in the specified subscription.
     *
     * @param resourceGroupName Name of the resource group that contains the managed HSM pool.
     * @param name Name of the managed HSM Pool.
     * @param parameters Parameters to patch the managed HSM Pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.keyvault.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource information with extended details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedHsmInner update(String resourceGroupName, String name, ManagedHsmInner parameters, Context context);

    /**
     * Deletes the specified managed HSM Pool.
     *
     * @param resourceGroupName Name of the resource group that contains the managed HSM pool.
     * @param name The name of the managed HSM Pool to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.keyvault.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String name);

    /**
     * Deletes the specified managed HSM Pool.
     *
     * @param resourceGroupName Name of the resource group that contains the managed HSM pool.
     * @param name The name of the managed HSM Pool to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.keyvault.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String name, Context context);

    /**
     * Deletes the specified managed HSM Pool.
     *
     * @param resourceGroupName Name of the resource group that contains the managed HSM pool.
     * @param name The name of the managed HSM Pool to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.keyvault.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String name);

    /**
     * Deletes the specified managed HSM Pool.
     *
     * @param resourceGroupName Name of the resource group that contains the managed HSM pool.
     * @param name The name of the managed HSM Pool to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.keyvault.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String name, Context context);

    /**
     * Gets the specified managed HSM Pool.
     *
     * @param resourceGroupName Name of the resource group that contains the managed HSM pool.
     * @param name The name of the managed HSM Pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.keyvault.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified managed HSM Pool.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedHsmInner getByResourceGroup(String resourceGroupName, String name);

    /**
     * Gets the specified managed HSM Pool.
     *
     * @param resourceGroupName Name of the resource group that contains the managed HSM pool.
     * @param name The name of the managed HSM Pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.keyvault.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified managed HSM Pool.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ManagedHsmInner> getByResourceGroupWithResponse(String resourceGroupName, String name, Context context);

    /**
     * The List operation gets information about the managed HSM Pools associated with the subscription and within the
     * specified resource group.
     *
     * @param resourceGroupName Name of the resource group that contains the managed HSM pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.keyvault.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of managed HSM Pools.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedHsmInner> listByResourceGroup(String resourceGroupName);

    /**
     * The List operation gets information about the managed HSM Pools associated with the subscription and within the
     * specified resource group.
     *
     * @param resourceGroupName Name of the resource group that contains the managed HSM pool.
     * @param top Maximum number of results to return.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.keyvault.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of managed HSM Pools.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedHsmInner> listByResourceGroup(String resourceGroupName, Integer top, Context context);

    /**
     * The List operation gets information about the managed HSM Pools associated with the subscription.
     *
     * @throws com.azure.resourcemanager.keyvault.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of managed HSM Pools.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedHsmInner> list();

    /**
     * The List operation gets information about the managed HSM Pools associated with the subscription.
     *
     * @param top Maximum number of results to return.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.keyvault.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of managed HSM Pools.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedHsmInner> list(Integer top, Context context);

    /**
     * The List operation gets information about the deleted managed HSMs associated with the subscription.
     *
     * @throws com.azure.resourcemanager.keyvault.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of deleted managed HSM Pools.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DeletedManagedHsmInner> listDeleted();

    /**
     * The List operation gets information about the deleted managed HSMs associated with the subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.keyvault.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of deleted managed HSM Pools.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DeletedManagedHsmInner> listDeleted(Context context);

    /**
     * Gets the specified deleted managed HSM.
     *
     * @param name The name of the deleted managed HSM.
     * @param location The location of the deleted managed HSM.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.keyvault.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified deleted managed HSM.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DeletedManagedHsmInner getDeleted(String name, String location);

    /**
     * Gets the specified deleted managed HSM.
     *
     * @param name The name of the deleted managed HSM.
     * @param location The location of the deleted managed HSM.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.keyvault.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified deleted managed HSM.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DeletedManagedHsmInner> getDeletedWithResponse(String name, String location, Context context);

    /**
     * Permanently deletes the specified managed HSM.
     *
     * @param name The name of the soft-deleted managed HSM.
     * @param location The location of the soft-deleted managed HSM.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.keyvault.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginPurgeDeleted(String name, String location);

    /**
     * Permanently deletes the specified managed HSM.
     *
     * @param name The name of the soft-deleted managed HSM.
     * @param location The location of the soft-deleted managed HSM.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.keyvault.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginPurgeDeleted(String name, String location, Context context);

    /**
     * Permanently deletes the specified managed HSM.
     *
     * @param name The name of the soft-deleted managed HSM.
     * @param location The location of the soft-deleted managed HSM.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.keyvault.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void purgeDeleted(String name, String location);

    /**
     * Permanently deletes the specified managed HSM.
     *
     * @param name The name of the soft-deleted managed HSM.
     * @param location The location of the soft-deleted managed HSM.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.keyvault.generated.models.ErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void purgeDeleted(String name, String location, Context context);
}
