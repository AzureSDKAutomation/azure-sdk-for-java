// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.kusto.fluent.models.CheckNameResultInner;
import com.azure.resourcemanager.kusto.fluent.models.DataConnectionInner;
import com.azure.resourcemanager.kusto.fluent.models.DataConnectionValidationInner;
import com.azure.resourcemanager.kusto.fluent.models.DataConnectionValidationListResultInner;
import com.azure.resourcemanager.kusto.models.DataConnectionCheckNameRequest;

/** An instance of this class provides access to all the operations defined in DataConnectionsClient. */
public interface DataConnectionsClient {
    /**
     * Returns the list of data connections of the given Kusto database.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Kusto data connections operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataConnectionInner> listByDatabase(
        String resourceGroupName, String clusterName, String databaseName);

    /**
     * Returns the list of data connections of the given Kusto database.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Kusto data connections operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataConnectionInner> listByDatabase(
        String resourceGroupName, String clusterName, String databaseName, Context context);

    /**
     * Checks that the data connection parameters are valid.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param parameters Class representing an data connection validation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Kusto data connection validation result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<DataConnectionValidationListResultInner>, DataConnectionValidationListResultInner>
        beginDataConnectionValidation(
            String resourceGroupName,
            String clusterName,
            String databaseName,
            DataConnectionValidationInner parameters);

    /**
     * Checks that the data connection parameters are valid.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param parameters Class representing an data connection validation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Kusto data connection validation result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<DataConnectionValidationListResultInner>, DataConnectionValidationListResultInner>
        beginDataConnectionValidation(
            String resourceGroupName,
            String clusterName,
            String databaseName,
            DataConnectionValidationInner parameters,
            Context context);

    /**
     * Checks that the data connection parameters are valid.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param parameters Class representing an data connection validation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Kusto data connection validation result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataConnectionValidationListResultInner dataConnectionValidation(
        String resourceGroupName, String clusterName, String databaseName, DataConnectionValidationInner parameters);

    /**
     * Checks that the data connection parameters are valid.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param parameters Class representing an data connection validation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Kusto data connection validation result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataConnectionValidationListResultInner dataConnectionValidation(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        DataConnectionValidationInner parameters,
        Context context);

    /**
     * Checks that the data connection name is valid and is not already in use.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param dataConnectionName A data connection check name availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result returned from a check name availability request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CheckNameResultInner checkNameAvailability(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        DataConnectionCheckNameRequest dataConnectionName);

    /**
     * Checks that the data connection name is valid and is not already in use.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param dataConnectionName A data connection check name availability request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result returned from a check name availability request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CheckNameResultInner> checkNameAvailabilityWithResponse(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        DataConnectionCheckNameRequest dataConnectionName,
        Context context);

    /**
     * Returns a data connection.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param dataConnectionName The name of the data connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing an data connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataConnectionInner get(
        String resourceGroupName, String clusterName, String databaseName, String dataConnectionName);

    /**
     * Returns a data connection.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param dataConnectionName The name of the data connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing an data connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DataConnectionInner> getWithResponse(
        String resourceGroupName, String clusterName, String databaseName, String dataConnectionName, Context context);

    /**
     * Creates or updates a data connection.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param dataConnectionName The name of the data connection.
     * @param parameters Class representing an data connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing an data connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<DataConnectionInner>, DataConnectionInner> beginCreateOrUpdate(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        String dataConnectionName,
        DataConnectionInner parameters);

    /**
     * Creates or updates a data connection.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param dataConnectionName The name of the data connection.
     * @param parameters Class representing an data connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing an data connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<DataConnectionInner>, DataConnectionInner> beginCreateOrUpdate(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        String dataConnectionName,
        DataConnectionInner parameters,
        Context context);

    /**
     * Creates or updates a data connection.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param dataConnectionName The name of the data connection.
     * @param parameters Class representing an data connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing an data connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataConnectionInner createOrUpdate(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        String dataConnectionName,
        DataConnectionInner parameters);

    /**
     * Creates or updates a data connection.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param dataConnectionName The name of the data connection.
     * @param parameters Class representing an data connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing an data connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataConnectionInner createOrUpdate(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        String dataConnectionName,
        DataConnectionInner parameters,
        Context context);

    /**
     * Updates a data connection.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param dataConnectionName The name of the data connection.
     * @param parameters Class representing an data connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing an data connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<DataConnectionInner>, DataConnectionInner> beginUpdate(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        String dataConnectionName,
        DataConnectionInner parameters);

    /**
     * Updates a data connection.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param dataConnectionName The name of the data connection.
     * @param parameters Class representing an data connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing an data connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<DataConnectionInner>, DataConnectionInner> beginUpdate(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        String dataConnectionName,
        DataConnectionInner parameters,
        Context context);

    /**
     * Updates a data connection.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param dataConnectionName The name of the data connection.
     * @param parameters Class representing an data connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing an data connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataConnectionInner update(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        String dataConnectionName,
        DataConnectionInner parameters);

    /**
     * Updates a data connection.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param dataConnectionName The name of the data connection.
     * @param parameters Class representing an data connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing an data connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataConnectionInner update(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        String dataConnectionName,
        DataConnectionInner parameters,
        Context context);

    /**
     * Deletes the data connection with the given name.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param dataConnectionName The name of the data connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String clusterName, String databaseName, String dataConnectionName);

    /**
     * Deletes the data connection with the given name.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param dataConnectionName The name of the data connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String clusterName, String databaseName, String dataConnectionName, Context context);

    /**
     * Deletes the data connection with the given name.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param dataConnectionName The name of the data connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName, String databaseName, String dataConnectionName);

    /**
     * Deletes the data connection with the given name.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param dataConnectionName The name of the data connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceGroupName, String clusterName, String databaseName, String dataConnectionName, Context context);
}
