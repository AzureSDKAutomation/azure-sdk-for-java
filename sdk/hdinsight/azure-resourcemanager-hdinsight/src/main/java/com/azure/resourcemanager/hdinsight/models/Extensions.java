// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hdinsight.fluent.models.ExtensionInner;

/** Resource collection API of Extensions. */
public interface Extensions {
    /**
     * Enables the Operations Management Suite (OMS) on the HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The Operations Management Suite (OMS) parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void enableMonitoring(String resourceGroupName, String clusterName, ClusterMonitoringRequest parameters);

    /**
     * Enables the Operations Management Suite (OMS) on the HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param parameters The Operations Management Suite (OMS) parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void enableMonitoring(
        String resourceGroupName, String clusterName, ClusterMonitoringRequest parameters, Context context);

    /**
     * Gets the status of Operations Management Suite (OMS) on the HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of Operations Management Suite (OMS) on the HDInsight cluster.
     */
    ClusterMonitoringResponse getMonitoringStatus(String resourceGroupName, String clusterName);

    /**
     * Gets the status of Operations Management Suite (OMS) on the HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of Operations Management Suite (OMS) on the HDInsight cluster.
     */
    Response<ClusterMonitoringResponse> getMonitoringStatusWithResponse(
        String resourceGroupName, String clusterName, Context context);

    /**
     * Disables the Operations Management Suite (OMS) on the HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void disableMonitoring(String resourceGroupName, String clusterName);

    /**
     * Disables the Operations Management Suite (OMS) on the HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void disableMonitoring(String resourceGroupName, String clusterName, Context context);

    /**
     * Creates an HDInsight cluster extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param extensionName The name of the cluster extension.
     * @param parameters Cluster monitoring extensions.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void create(String resourceGroupName, String clusterName, String extensionName, ExtensionInner parameters);

    /**
     * Creates an HDInsight cluster extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param extensionName The name of the cluster extension.
     * @param parameters Cluster monitoring extensions.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void create(
        String resourceGroupName, String clusterName, String extensionName, ExtensionInner parameters, Context context);

    /**
     * Gets the extension properties for the specified HDInsight cluster extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param extensionName The name of the cluster extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the extension properties for the specified HDInsight cluster extension.
     */
    Extension get(String resourceGroupName, String clusterName, String extensionName);

    /**
     * Gets the extension properties for the specified HDInsight cluster extension.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param extensionName The name of the cluster extension.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the extension properties for the specified HDInsight cluster extension.
     */
    Response<Extension> getWithResponse(
        String resourceGroupName, String clusterName, String extensionName, Context context);

    /**
     * Deletes the specified extension for HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param extensionName The name of the cluster extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String clusterName, String extensionName);

    /**
     * Deletes the specified extension for HDInsight cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param extensionName The name of the cluster extension.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String clusterName, String extensionName, Context context);
}
