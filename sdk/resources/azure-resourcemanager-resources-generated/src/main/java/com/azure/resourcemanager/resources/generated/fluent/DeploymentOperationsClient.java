// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.resources.generated.fluent.models.DeploymentOperationInner;

/** An instance of this class provides access to all the operations defined in DeploymentOperationsClient. */
public interface DeploymentOperationsClient {
    /**
     * Gets a deployments operation.
     *
     * @param scope The resource scope.
     * @param deploymentName The name of the deployment.
     * @param operationId The ID of the operation to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deployments operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DeploymentOperationInner getAtScope(String scope, String deploymentName, String operationId);

    /**
     * Gets a deployments operation.
     *
     * @param scope The resource scope.
     * @param deploymentName The name of the deployment.
     * @param operationId The ID of the operation to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deployments operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DeploymentOperationInner> getAtScopeWithResponse(
        String scope, String deploymentName, String operationId, Context context);

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param scope The resource scope.
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all deployments operations for a deployment.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DeploymentOperationInner> listAtScope(String scope, String deploymentName);

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param scope The resource scope.
     * @param deploymentName The name of the deployment.
     * @param top The number of results to return.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all deployments operations for a deployment.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DeploymentOperationInner> listAtScope(
        String scope, String deploymentName, Integer top, Context context);

    /**
     * Gets a deployments operation.
     *
     * @param deploymentName The name of the deployment.
     * @param operationId The ID of the operation to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deployments operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DeploymentOperationInner getAtTenantScope(String deploymentName, String operationId);

    /**
     * Gets a deployments operation.
     *
     * @param deploymentName The name of the deployment.
     * @param operationId The ID of the operation to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deployments operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DeploymentOperationInner> getAtTenantScopeWithResponse(
        String deploymentName, String operationId, Context context);

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all deployments operations for a deployment.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DeploymentOperationInner> listAtTenantScope(String deploymentName);

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param deploymentName The name of the deployment.
     * @param top The number of results to return.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all deployments operations for a deployment.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DeploymentOperationInner> listAtTenantScope(String deploymentName, Integer top, Context context);

    /**
     * Gets a deployments operation.
     *
     * @param deploymentName The name of the deployment.
     * @param operationId The ID of the operation to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deployments operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DeploymentOperationInner getAtSubscriptionScope(String deploymentName, String operationId);

    /**
     * Gets a deployments operation.
     *
     * @param deploymentName The name of the deployment.
     * @param operationId The ID of the operation to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deployments operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DeploymentOperationInner> getAtSubscriptionScopeWithResponse(
        String deploymentName, String operationId, Context context);

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all deployments operations for a deployment.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DeploymentOperationInner> listAtSubscriptionScope(String deploymentName);

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param deploymentName The name of the deployment.
     * @param top The number of results to return.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all deployments operations for a deployment.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DeploymentOperationInner> listAtSubscriptionScope(
        String deploymentName, Integer top, Context context);

    /**
     * Gets a deployments operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @param operationId The ID of the operation to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deployments operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DeploymentOperationInner get(String resourceGroupName, String deploymentName, String operationId);

    /**
     * Gets a deployments operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @param operationId The ID of the operation to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deployments operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DeploymentOperationInner> getWithResponse(
        String resourceGroupName, String deploymentName, String operationId, Context context);

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all deployments operations for a deployment.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DeploymentOperationInner> listByResourceGroup(String resourceGroupName, String deploymentName);

    /**
     * Gets all deployments operations for a deployment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @param top The number of results to return.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all deployments operations for a deployment.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DeploymentOperationInner> listByResourceGroup(
        String resourceGroupName, String deploymentName, Integer top, Context context);
}
