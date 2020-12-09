// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hdinsight.fluent.models.RuntimeScriptActionDetailInner;

/** An instance of this class provides access to all the operations defined in ScriptExecutionHistoriesClient. */
public interface ScriptExecutionHistoriesClient {
    /**
     * Lists all scripts' execution history for the specified cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list script execution history response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RuntimeScriptActionDetailInner> listByCluster(String resourceGroupName, String clusterName);

    /**
     * Lists all scripts' execution history for the specified cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list script execution history response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RuntimeScriptActionDetailInner> listByCluster(
        String resourceGroupName, String clusterName, Context context);

    /**
     * Promotes the specified ad-hoc script execution to a persisted script.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param scriptExecutionId The script execution Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void promote(String resourceGroupName, String clusterName, String scriptExecutionId);

    /**
     * Promotes the specified ad-hoc script execution to a persisted script.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param scriptExecutionId The script execution Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> promoteWithResponse(
        String resourceGroupName, String clusterName, String scriptExecutionId, Context context);
}
