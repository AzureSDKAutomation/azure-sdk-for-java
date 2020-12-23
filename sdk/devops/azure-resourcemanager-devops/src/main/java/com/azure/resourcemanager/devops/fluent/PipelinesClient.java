// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devops.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.devops.fluent.models.PipelineInner;
import com.azure.resourcemanager.devops.models.PipelineUpdateParameters;

/** An instance of this class provides access to all the operations defined in PipelinesClient. */
public interface PipelinesClient {
    /**
     * Creates or updates an Azure Pipeline.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param pipelineName The name of the Azure Pipeline resource in ARM.
     * @param createOperationParameters The request payload to create the Azure Pipeline.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure DevOps Pipeline used to configure Continuous Integration (CI) &amp; Continuous Delivery (CD) for
     *     Azure resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<PipelineInner>, PipelineInner> beginCreateOrUpdate(
        String resourceGroupName, String pipelineName, PipelineInner createOperationParameters);

    /**
     * Creates or updates an Azure Pipeline.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param pipelineName The name of the Azure Pipeline resource in ARM.
     * @param createOperationParameters The request payload to create the Azure Pipeline.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure DevOps Pipeline used to configure Continuous Integration (CI) &amp; Continuous Delivery (CD) for
     *     Azure resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<PipelineInner>, PipelineInner> beginCreateOrUpdate(
        String resourceGroupName, String pipelineName, PipelineInner createOperationParameters, Context context);

    /**
     * Creates or updates an Azure Pipeline.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param pipelineName The name of the Azure Pipeline resource in ARM.
     * @param createOperationParameters The request payload to create the Azure Pipeline.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure DevOps Pipeline used to configure Continuous Integration (CI) &amp; Continuous Delivery (CD) for
     *     Azure resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PipelineInner createOrUpdate(
        String resourceGroupName, String pipelineName, PipelineInner createOperationParameters);

    /**
     * Creates or updates an Azure Pipeline.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param pipelineName The name of the Azure Pipeline resource in ARM.
     * @param createOperationParameters The request payload to create the Azure Pipeline.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure DevOps Pipeline used to configure Continuous Integration (CI) &amp; Continuous Delivery (CD) for
     *     Azure resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PipelineInner createOrUpdate(
        String resourceGroupName, String pipelineName, PipelineInner createOperationParameters, Context context);

    /**
     * Gets an existing Azure Pipeline.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param pipelineName The name of the Azure Pipeline resource in ARM.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing Azure Pipeline.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PipelineInner getByResourceGroup(String resourceGroupName, String pipelineName);

    /**
     * Gets an existing Azure Pipeline.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param pipelineName The name of the Azure Pipeline resource in ARM.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing Azure Pipeline.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PipelineInner> getByResourceGroupWithResponse(
        String resourceGroupName, String pipelineName, Context context);

    /**
     * Updates the properties of an Azure Pipeline. Currently, only tags can be updated.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param pipelineName The name of the Azure Pipeline resource.
     * @param updateOperationParameters The request payload containing the properties to update in the Azure Pipeline.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure DevOps Pipeline used to configure Continuous Integration (CI) &amp; Continuous Delivery (CD) for
     *     Azure resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PipelineInner update(
        String resourceGroupName, String pipelineName, PipelineUpdateParameters updateOperationParameters);

    /**
     * Updates the properties of an Azure Pipeline. Currently, only tags can be updated.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param pipelineName The name of the Azure Pipeline resource.
     * @param updateOperationParameters The request payload containing the properties to update in the Azure Pipeline.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure DevOps Pipeline used to configure Continuous Integration (CI) &amp; Continuous Delivery (CD) for
     *     Azure resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PipelineInner> updateWithResponse(
        String resourceGroupName,
        String pipelineName,
        PipelineUpdateParameters updateOperationParameters,
        Context context);

    /**
     * Deletes an Azure Pipeline.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param pipelineName The name of the Azure Pipeline resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String pipelineName);

    /**
     * Deletes an Azure Pipeline.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param pipelineName The name of the Azure Pipeline resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String pipelineName, Context context);

    /**
     * Lists all Azure Pipelines under the specified resource group.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of a request to list all Azure Pipelines under a given scope.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PipelineInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all Azure Pipelines under the specified resource group.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of a request to list all Azure Pipelines under a given scope.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PipelineInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all Azure Pipelines under the specified subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of a request to list all Azure Pipelines under a given scope.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PipelineInner> list();

    /**
     * Lists all Azure Pipelines under the specified subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of a request to list all Azure Pipelines under a given scope.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PipelineInner> list(Context context);
}
