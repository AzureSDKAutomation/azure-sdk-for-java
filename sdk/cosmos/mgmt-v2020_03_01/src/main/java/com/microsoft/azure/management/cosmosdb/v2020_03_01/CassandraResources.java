/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_03_01;

import rx.Observable;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.CassandraKeyspaceGetResults;
import rx.Completable;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.CassandraTableGetResults;

/**
 * Type representing CassandraResources.
 */
public interface CassandraResources {
    /**
     * Begins definition for a new CassandraKeyspace resource.
     * @param name resource name.
     * @return the first stage of the new CassandraKeyspace definition.
     */
    CassandraKeyspaceGetResults.DefinitionStages.Blank defineCassandraKeyspace(String name);

    /**
     * Begins definition for a new Table resource.
     * @param name resource name.
     * @return the first stage of the new Table definition.
     */
    CassandraTableGetResults.DefinitionStages.Blank defineTable(String name);

    /**
     * Gets the Cassandra keyspaces under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CassandraKeyspaceGetResults> getCassandraKeyspaceAsync(String resourceGroupName, String accountName, String keyspaceName);

    /**
     * Lists the Cassandra keyspaces under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CassandraKeyspaceGetResults> listCassandraKeyspacesAsync(String resourceGroupName, String accountName);

    /**
     * Deletes an existing Azure Cosmos DB Cassandra keyspace.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteCassandraKeyspaceAsync(String resourceGroupName, String accountName, String keyspaceName);

    /**
     * Gets the RUs per second of the Cassandra Keyspace under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ThroughputSettingsGetResults> getCassandraKeyspaceThroughputAsync(String resourceGroupName, String accountName, String keyspaceName);

    /**
     * Update RUs per second of an Azure Cosmos DB Cassandra Keyspace.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @param updateThroughputParameters The RUs per second of the parameters to provide for the current Cassandra Keyspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ThroughputSettingsGetResults> updateCassandraKeyspaceThroughputAsync(String resourceGroupName, String accountName, String keyspaceName, ThroughputSettingsUpdateParameters updateThroughputParameters);

    /**
     * Migrate an Azure Cosmos DB Cassandra Keyspace from manual throughput to autoscale.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ThroughputSettingsGetResults> migrateCassandraKeyspaceToAutoscaleAsync(String resourceGroupName, String accountName, String keyspaceName);

    /**
     * Migrate an Azure Cosmos DB Cassandra Keyspace from autoscale to manual throughput.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ThroughputSettingsGetResults> migrateCassandraKeyspaceToManualThroughputAsync(String resourceGroupName, String accountName, String keyspaceName);

    /**
     * Gets the RUs per second of the Cassandra table under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @param tableName Cosmos DB table name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ThroughputSettingsGetResults> getCassandraTableThroughputAsync(String resourceGroupName, String accountName, String keyspaceName, String tableName);

    /**
     * Update RUs per second of an Azure Cosmos DB Cassandra table.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @param tableName Cosmos DB table name.
     * @param updateThroughputParameters The RUs per second of the parameters to provide for the current Cassandra table.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ThroughputSettingsGetResults> updateCassandraTableThroughputAsync(String resourceGroupName, String accountName, String keyspaceName, String tableName, ThroughputSettingsUpdateParameters updateThroughputParameters);

    /**
     * Migrate an Azure Cosmos DB Cassandra table from manual throughput to autoscale.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @param tableName Cosmos DB table name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ThroughputSettingsGetResults> migrateCassandraTableToAutoscaleAsync(String resourceGroupName, String accountName, String keyspaceName, String tableName);

    /**
     * Migrate an Azure Cosmos DB Cassandra table from autoscale to manual throughput.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @param tableName Cosmos DB table name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ThroughputSettingsGetResults> migrateCassandraTableToManualThroughputAsync(String resourceGroupName, String accountName, String keyspaceName, String tableName);

    /**
     * Gets the Cassandra table under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @param tableName Cosmos DB table name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CassandraTableGetResults> getCassandraTableAsync(String resourceGroupName, String accountName, String keyspaceName, String tableName);

    /**
     * Lists the Cassandra table under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CassandraTableGetResults> listCassandraTablesAsync(String resourceGroupName, String accountName, String keyspaceName);

    /**
     * Deletes an existing Azure Cosmos DB Cassandra table.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param keyspaceName Cosmos DB keyspace name.
     * @param tableName Cosmos DB table name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteCassandraTableAsync(String resourceGroupName, String accountName, String keyspaceName, String tableName);

}
