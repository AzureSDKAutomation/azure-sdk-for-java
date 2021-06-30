// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.azurearcdata.fluent.models.PostgresInstanceInner;
import com.azure.resourcemanager.azurearcdata.models.PostgresInstanceUpdate;

/** An instance of this class provides access to all the operations defined in PostgresInstancesClient. */
public interface PostgresInstancesClient {
    /**
     * List postgres Instance resources in the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of PostgresInstance.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PostgresInstanceInner> list();

    /**
     * List postgres Instance resources in the subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of PostgresInstance.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PostgresInstanceInner> list(Context context);

    /**
     * Get a postgres Instances list by Resource group name.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a postgres Instances list by Resource group name.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PostgresInstanceInner> listByResourceGroup(String resourceGroupName);

    /**
     * Get a postgres Instances list by Resource group name.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a postgres Instances list by Resource group name.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PostgresInstanceInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Retrieves a postgres Instance resource.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param postgresInstanceName Name of Postgres Instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Postgres Instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PostgresInstanceInner getByResourceGroup(String resourceGroupName, String postgresInstanceName);

    /**
     * Retrieves a postgres Instance resource.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param postgresInstanceName Name of Postgres Instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Postgres Instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PostgresInstanceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String postgresInstanceName, Context context);

    /**
     * Creates or replaces a postgres Instance resource.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param postgresInstanceName Name of PostgresInstance.
     * @param resource The postgres instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Postgres Instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<PostgresInstanceInner>, PostgresInstanceInner> beginCreate(
        String resourceGroupName, String postgresInstanceName, PostgresInstanceInner resource);

    /**
     * Creates or replaces a postgres Instance resource.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param postgresInstanceName Name of PostgresInstance.
     * @param resource The postgres instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Postgres Instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<PostgresInstanceInner>, PostgresInstanceInner> beginCreate(
        String resourceGroupName, String postgresInstanceName, PostgresInstanceInner resource, Context context);

    /**
     * Creates or replaces a postgres Instance resource.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param postgresInstanceName Name of PostgresInstance.
     * @param resource The postgres instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Postgres Instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PostgresInstanceInner create(String resourceGroupName, String postgresInstanceName, PostgresInstanceInner resource);

    /**
     * Creates or replaces a postgres Instance resource.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param postgresInstanceName Name of PostgresInstance.
     * @param resource The postgres instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Postgres Instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PostgresInstanceInner create(
        String resourceGroupName, String postgresInstanceName, PostgresInstanceInner resource, Context context);

    /**
     * Deletes a postgres Instance resource.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param postgresInstanceName Name of Postgres Instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String postgresInstanceName);

    /**
     * Deletes a postgres Instance resource.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param postgresInstanceName Name of Postgres Instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String postgresInstanceName, Context context);

    /**
     * Updates a postgres Instance resource.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param postgresInstanceName Name of Postgres Instance.
     * @param parameters The Postgres Instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Postgres Instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PostgresInstanceInner update(
        String resourceGroupName, String postgresInstanceName, PostgresInstanceUpdate parameters);

    /**
     * Updates a postgres Instance resource.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param postgresInstanceName Name of Postgres Instance.
     * @param parameters The Postgres Instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Postgres Instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PostgresInstanceInner> updateWithResponse(
        String resourceGroupName, String postgresInstanceName, PostgresInstanceUpdate parameters, Context context);
}
