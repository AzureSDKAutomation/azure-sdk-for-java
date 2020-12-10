// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of CassandraResources. */
public interface CassandraResources {
    /**
     * Lists the Cassandra keyspaces under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the Cassandra keyspaces and their properties.
     */
    PagedIterable<CassandraKeyspaceGetResults> listCassandraKeyspaces(String resourceGroupName, String accountName);

    /**
     * Lists the Cassandra keyspaces under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the Cassandra keyspaces and their properties.
     */
    PagedIterable<CassandraKeyspaceGetResults> listCassandraKeyspaces(
        String resourceGroupName, String accountName, Context context);

    /**
     * Gets the Cassandra keyspaces under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Cassandra keyspaces under an existing Azure Cosmos DB database account with the provided name.
     */
    CassandraKeyspaceGetResults getCassandraKeyspace(String resourceGroupName, String accountName, String keyspaceName);

    /**
     * Gets the Cassandra keyspaces under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Cassandra keyspaces under an existing Azure Cosmos DB database account with the provided name.
     */
    Response<CassandraKeyspaceGetResults> getCassandraKeyspaceWithResponse(
        String resourceGroupName, String accountName, String keyspaceName, Context context);

    /**
     * Deletes an existing Azure Cosmos DB Cassandra keyspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteCassandraKeyspace(String resourceGroupName, String accountName, String keyspaceName);

    /**
     * Deletes an existing Azure Cosmos DB Cassandra keyspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteCassandraKeyspace(String resourceGroupName, String accountName, String keyspaceName, Context context);

    /**
     * Gets the RUs per second of the Cassandra Keyspace under an existing Azure Cosmos DB database account with the
     * provided name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the RUs per second of the Cassandra Keyspace under an existing Azure Cosmos DB database account with the
     *     provided name.
     */
    ThroughputSettingsGetResults getCassandraKeyspaceThroughput(
        String resourceGroupName, String accountName, String keyspaceName);

    /**
     * Gets the RUs per second of the Cassandra Keyspace under an existing Azure Cosmos DB database account with the
     * provided name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the RUs per second of the Cassandra Keyspace under an existing Azure Cosmos DB database account with the
     *     provided name.
     */
    Response<ThroughputSettingsGetResults> getCassandraKeyspaceThroughputWithResponse(
        String resourceGroupName, String accountName, String keyspaceName, Context context);

    /**
     * Update RUs per second of an Azure Cosmos DB Cassandra Keyspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @param updateThroughputParameters Parameters to update Cosmos DB resource throughput.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB resource throughput.
     */
    ThroughputSettingsGetResults updateCassandraKeyspaceThroughput(
        String resourceGroupName,
        String accountName,
        String keyspaceName,
        ThroughputSettingsUpdateParameters updateThroughputParameters);

    /**
     * Update RUs per second of an Azure Cosmos DB Cassandra Keyspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @param updateThroughputParameters Parameters to update Cosmos DB resource throughput.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB resource throughput.
     */
    ThroughputSettingsGetResults updateCassandraKeyspaceThroughput(
        String resourceGroupName,
        String accountName,
        String keyspaceName,
        ThroughputSettingsUpdateParameters updateThroughputParameters,
        Context context);

    /**
     * Migrate an Azure Cosmos DB Cassandra Keyspace from manual throughput to autoscale.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB resource throughput.
     */
    ThroughputSettingsGetResults migrateCassandraKeyspaceToAutoscale(
        String resourceGroupName, String accountName, String keyspaceName);

    /**
     * Migrate an Azure Cosmos DB Cassandra Keyspace from manual throughput to autoscale.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB resource throughput.
     */
    ThroughputSettingsGetResults migrateCassandraKeyspaceToAutoscale(
        String resourceGroupName, String accountName, String keyspaceName, Context context);

    /**
     * Migrate an Azure Cosmos DB Cassandra Keyspace from autoscale to manual throughput.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB resource throughput.
     */
    ThroughputSettingsGetResults migrateCassandraKeyspaceToManualThroughput(
        String resourceGroupName, String accountName, String keyspaceName);

    /**
     * Migrate an Azure Cosmos DB Cassandra Keyspace from autoscale to manual throughput.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB resource throughput.
     */
    ThroughputSettingsGetResults migrateCassandraKeyspaceToManualThroughput(
        String resourceGroupName, String accountName, String keyspaceName, Context context);

    /**
     * Lists the Cassandra table under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the Cassandra tables and their properties.
     */
    PagedIterable<CassandraTableGetResults> listCassandraTables(
        String resourceGroupName, String accountName, String keyspaceName);

    /**
     * Lists the Cassandra table under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the Cassandra tables and their properties.
     */
    PagedIterable<CassandraTableGetResults> listCassandraTables(
        String resourceGroupName, String accountName, String keyspaceName, Context context);

    /**
     * Gets the Cassandra table under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @param tableName Cosmos DB table name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Cassandra table under an existing Azure Cosmos DB database account.
     */
    CassandraTableGetResults getCassandraTable(
        String resourceGroupName, String accountName, String keyspaceName, String tableName);

    /**
     * Gets the Cassandra table under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @param tableName Cosmos DB table name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Cassandra table under an existing Azure Cosmos DB database account.
     */
    Response<CassandraTableGetResults> getCassandraTableWithResponse(
        String resourceGroupName, String accountName, String keyspaceName, String tableName, Context context);

    /**
     * Deletes an existing Azure Cosmos DB Cassandra table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @param tableName Cosmos DB table name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteCassandraTable(String resourceGroupName, String accountName, String keyspaceName, String tableName);

    /**
     * Deletes an existing Azure Cosmos DB Cassandra table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @param tableName Cosmos DB table name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteCassandraTable(
        String resourceGroupName, String accountName, String keyspaceName, String tableName, Context context);

    /**
     * Gets the RUs per second of the Cassandra table under an existing Azure Cosmos DB database account with the
     * provided name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @param tableName Cosmos DB table name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the RUs per second of the Cassandra table under an existing Azure Cosmos DB database account with the
     *     provided name.
     */
    ThroughputSettingsGetResults getCassandraTableThroughput(
        String resourceGroupName, String accountName, String keyspaceName, String tableName);

    /**
     * Gets the RUs per second of the Cassandra table under an existing Azure Cosmos DB database account with the
     * provided name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @param tableName Cosmos DB table name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the RUs per second of the Cassandra table under an existing Azure Cosmos DB database account with the
     *     provided name.
     */
    Response<ThroughputSettingsGetResults> getCassandraTableThroughputWithResponse(
        String resourceGroupName, String accountName, String keyspaceName, String tableName, Context context);

    /**
     * Update RUs per second of an Azure Cosmos DB Cassandra table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @param tableName Cosmos DB table name.
     * @param updateThroughputParameters Parameters to update Cosmos DB resource throughput.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB resource throughput.
     */
    ThroughputSettingsGetResults updateCassandraTableThroughput(
        String resourceGroupName,
        String accountName,
        String keyspaceName,
        String tableName,
        ThroughputSettingsUpdateParameters updateThroughputParameters);

    /**
     * Update RUs per second of an Azure Cosmos DB Cassandra table.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @param tableName Cosmos DB table name.
     * @param updateThroughputParameters Parameters to update Cosmos DB resource throughput.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB resource throughput.
     */
    ThroughputSettingsGetResults updateCassandraTableThroughput(
        String resourceGroupName,
        String accountName,
        String keyspaceName,
        String tableName,
        ThroughputSettingsUpdateParameters updateThroughputParameters,
        Context context);

    /**
     * Migrate an Azure Cosmos DB Cassandra table from manual throughput to autoscale.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @param tableName Cosmos DB table name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB resource throughput.
     */
    ThroughputSettingsGetResults migrateCassandraTableToAutoscale(
        String resourceGroupName, String accountName, String keyspaceName, String tableName);

    /**
     * Migrate an Azure Cosmos DB Cassandra table from manual throughput to autoscale.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @param tableName Cosmos DB table name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB resource throughput.
     */
    ThroughputSettingsGetResults migrateCassandraTableToAutoscale(
        String resourceGroupName, String accountName, String keyspaceName, String tableName, Context context);

    /**
     * Migrate an Azure Cosmos DB Cassandra table from autoscale to manual throughput.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @param tableName Cosmos DB table name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB resource throughput.
     */
    ThroughputSettingsGetResults migrateCassandraTableToManualThroughput(
        String resourceGroupName, String accountName, String keyspaceName, String tableName);

    /**
     * Migrate an Azure Cosmos DB Cassandra table from autoscale to manual throughput.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @param tableName Cosmos DB table name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure Cosmos DB resource throughput.
     */
    ThroughputSettingsGetResults migrateCassandraTableToManualThroughput(
        String resourceGroupName, String accountName, String keyspaceName, String tableName, Context context);

    /**
     * Gets the Cassandra keyspaces under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Cassandra keyspaces under an existing Azure Cosmos DB database account with the provided name.
     */
    CassandraKeyspaceGetResults getCassandraKeyspaceById(String id);

    /**
     * Gets the Cassandra keyspaces under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Cassandra keyspaces under an existing Azure Cosmos DB database account with the provided name.
     */
    Response<CassandraKeyspaceGetResults> getCassandraKeyspaceByIdWithResponse(String id, Context context);

    /**
     * Gets the Cassandra table under an existing Azure Cosmos DB database account.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Cassandra table under an existing Azure Cosmos DB database account.
     */
    CassandraTableGetResults getCassandraTableById(String id);

    /**
     * Gets the Cassandra table under an existing Azure Cosmos DB database account.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Cassandra table under an existing Azure Cosmos DB database account.
     */
    Response<CassandraTableGetResults> getCassandraTableByIdWithResponse(String id, Context context);

    /**
     * Deletes an existing Azure Cosmos DB Cassandra keyspace.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteCassandraKeyspaceById(String id);

    /**
     * Deletes an existing Azure Cosmos DB Cassandra keyspace.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteCassandraKeyspaceByIdWithResponse(String id, Context context);

    /**
     * Deletes an existing Azure Cosmos DB Cassandra table.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteCassandraTableById(String id);

    /**
     * Deletes an existing Azure Cosmos DB Cassandra table.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteCassandraTableByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new CassandraKeyspaceGetResults resource.
     *
     * @param name resource name.
     * @return the first stage of the new CassandraKeyspaceGetResults definition.
     */
    CassandraKeyspaceGetResults.DefinitionStages.Blank defineUpdateCassandraKeyspace(String name);

    /**
     * Begins definition for a new CassandraTableGetResults resource.
     *
     * @param name resource name.
     * @return the first stage of the new CassandraTableGetResults definition.
     */
    CassandraTableGetResults.DefinitionStages.Blank defineUpdateCassandraTable(String name);
}
