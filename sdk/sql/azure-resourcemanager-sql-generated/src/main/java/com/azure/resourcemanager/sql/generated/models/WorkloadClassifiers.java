// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of WorkloadClassifiers. */
public interface WorkloadClassifiers {
    /**
     * Gets a workload classifier.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workload classifier.
     */
    WorkloadClassifier get(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String workloadGroupName,
        String workloadClassifierName);

    /**
     * Gets a workload classifier.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workload classifier.
     */
    Response<WorkloadClassifier> getWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String workloadGroupName,
        String workloadClassifierName,
        Context context);

    /**
     * Deletes a workload classifier.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String workloadGroupName,
        String workloadClassifierName);

    /**
     * Deletes a workload classifier.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String workloadGroupName,
        String workloadClassifierName,
        Context context);

    /**
     * Gets the list of workload classifiers for a workload group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifiers from.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of workload classifiers for a workload group.
     */
    PagedIterable<WorkloadClassifier> listByWorkloadGroup(
        String resourceGroupName, String serverName, String databaseName, String workloadGroupName);

    /**
     * Gets the list of workload classifiers for a workload group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifiers from.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of workload classifiers for a workload group.
     */
    PagedIterable<WorkloadClassifier> listByWorkloadGroup(
        String resourceGroupName, String serverName, String databaseName, String workloadGroupName, Context context);

    /**
     * Gets a workload classifier.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workload classifier.
     */
    WorkloadClassifier getById(String id);

    /**
     * Gets a workload classifier.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workload classifier.
     */
    Response<WorkloadClassifier> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a workload classifier.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a workload classifier.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new WorkloadClassifier resource.
     *
     * @param name resource name.
     * @return the first stage of the new WorkloadClassifier definition.
     */
    WorkloadClassifier.DefinitionStages.Blank define(String name);
}
