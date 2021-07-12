// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.baremetalinfrastructure.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.baremetalinfrastructure.fluent.models.AzureBareMetalInstanceInner;
import com.azure.resourcemanager.baremetalinfrastructure.models.Tags;

/** An instance of this class provides access to all the operations defined in AzureBareMetalInstancesClient. */
public interface AzureBareMetalInstancesClient {
    /**
     * The operation to start an AzureBareMetal instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureBareMetalInstanceName Name of the Azure BareMetal on Azure instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginStart(String resourceGroupName, String azureBareMetalInstanceName);

    /**
     * The operation to start an AzureBareMetal instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureBareMetalInstanceName Name of the Azure BareMetal on Azure instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginStart(
        String resourceGroupName, String azureBareMetalInstanceName, Context context);

    /**
     * The operation to start an AzureBareMetal instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureBareMetalInstanceName Name of the Azure BareMetal on Azure instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void start(String resourceGroupName, String azureBareMetalInstanceName);

    /**
     * The operation to start an AzureBareMetal instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureBareMetalInstanceName Name of the Azure BareMetal on Azure instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void start(String resourceGroupName, String azureBareMetalInstanceName, Context context);

    /**
     * The operation to restart an AzureBareMetal instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureBareMetalInstanceName Name of the Azure BareMetal on Azure instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginRestart(String resourceGroupName, String azureBareMetalInstanceName);

    /**
     * The operation to restart an AzureBareMetal instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureBareMetalInstanceName Name of the Azure BareMetal on Azure instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginRestart(
        String resourceGroupName, String azureBareMetalInstanceName, Context context);

    /**
     * The operation to restart an AzureBareMetal instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureBareMetalInstanceName Name of the Azure BareMetal on Azure instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void restart(String resourceGroupName, String azureBareMetalInstanceName);

    /**
     * The operation to restart an AzureBareMetal instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureBareMetalInstanceName Name of the Azure BareMetal on Azure instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void restart(String resourceGroupName, String azureBareMetalInstanceName, Context context);

    /**
     * The operation to shutdown an AzureBareMetal instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureBareMetalInstanceName Name of the Azure BareMetal on Azure instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginShutdown(String resourceGroupName, String azureBareMetalInstanceName);

    /**
     * The operation to shutdown an AzureBareMetal instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureBareMetalInstanceName Name of the Azure BareMetal on Azure instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginShutdown(
        String resourceGroupName, String azureBareMetalInstanceName, Context context);

    /**
     * The operation to shutdown an AzureBareMetal instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureBareMetalInstanceName Name of the Azure BareMetal on Azure instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void shutdown(String resourceGroupName, String azureBareMetalInstanceName);

    /**
     * The operation to shutdown an AzureBareMetal instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureBareMetalInstanceName Name of the Azure BareMetal on Azure instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void shutdown(String resourceGroupName, String azureBareMetalInstanceName, Context context);

    /**
     * Gets a list of AzureBareMetal instances in the specified subscription. The operations returns various properties
     * of each Azure BareMetal instance.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of AzureBareMetal instances in the specified subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AzureBareMetalInstanceInner> list();

    /**
     * Gets a list of AzureBareMetal instances in the specified subscription. The operations returns various properties
     * of each Azure BareMetal instance.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of AzureBareMetal instances in the specified subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AzureBareMetalInstanceInner> list(Context context);

    /**
     * Gets a list of AzureBareMetal instances in the specified subscription and resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of AzureBareMetal instances in the specified subscription and resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AzureBareMetalInstanceInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets a list of AzureBareMetal instances in the specified subscription and resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of AzureBareMetal instances in the specified subscription and resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AzureBareMetalInstanceInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets an Azure BareMetal instance for the specified subscription, resource group, and instance name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureBareMetalInstanceName Name of the Azure BareMetal on Azure instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure BareMetal instance for the specified subscription, resource group, and instance name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AzureBareMetalInstanceInner getByResourceGroup(String resourceGroupName, String azureBareMetalInstanceName);

    /**
     * Gets an Azure BareMetal instance for the specified subscription, resource group, and instance name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureBareMetalInstanceName Name of the Azure BareMetal on Azure instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure BareMetal instance for the specified subscription, resource group, and instance name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AzureBareMetalInstanceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String azureBareMetalInstanceName, Context context);

    /**
     * Deletes a Azure BareMetal instance with the specified subscription, resource group, and instance name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureBareMetalInstanceName Name of the Azure BareMetal on Azure instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String azureBareMetalInstanceName);

    /**
     * Deletes a Azure BareMetal instance with the specified subscription, resource group, and instance name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureBareMetalInstanceName Name of the Azure BareMetal on Azure instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String azureBareMetalInstanceName, Context context);

    /**
     * Deletes a Azure BareMetal instance with the specified subscription, resource group, and instance name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureBareMetalInstanceName Name of the Azure BareMetal on Azure instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String azureBareMetalInstanceName);

    /**
     * Deletes a Azure BareMetal instance with the specified subscription, resource group, and instance name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureBareMetalInstanceName Name of the Azure BareMetal on Azure instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String azureBareMetalInstanceName, Context context);

    /**
     * Patches the Tags field of a Azure BareMetal instance for the specified subscription, resource group, and instance
     * name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureBareMetalInstanceName Name of the Azure BareMetal on Azure instance.
     * @param tagsParameter Request body that only contains the new Tags field.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azureBareMetal instance info on Azure (ARM properties and AzureBareMetal properties).
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AzureBareMetalInstanceInner update(String resourceGroupName, String azureBareMetalInstanceName, Tags tagsParameter);

    /**
     * Patches the Tags field of a Azure BareMetal instance for the specified subscription, resource group, and instance
     * name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param azureBareMetalInstanceName Name of the Azure BareMetal on Azure instance.
     * @param tagsParameter Request body that only contains the new Tags field.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azureBareMetal instance info on Azure (ARM properties and AzureBareMetal properties).
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AzureBareMetalInstanceInner> updateWithResponse(
        String resourceGroupName, String azureBareMetalInstanceName, Tags tagsParameter, Context context);
}
