/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_03_01;

import rx.Observable;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.SqlDatabaseGetResults;
import rx.Completable;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.SqlContainerGetResults;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.SqlStoredProcedureGetResults;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.SqlUserDefinedFunctionGetResults;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.SqlTriggerGetResults;

/**
 * Type representing SqlResources.
 */
public interface SqlResources {
    /**
     * Begins definition for a new SqlDatabasis resource.
     * @param name resource name.
     * @return the first stage of the new SqlDatabasis definition.
     */
    SqlDatabaseGetResults.DefinitionStages.Blank defineSqlDatabasis(String name);

    /**
     * Begins definition for a new Container resource.
     * @param name resource name.
     * @return the first stage of the new Container definition.
     */
    SqlContainerGetResults.DefinitionStages.Blank defineContainer(String name);

    /**
     * Begins definition for a new StoredProcedure resource.
     * @param name resource name.
     * @return the first stage of the new StoredProcedure definition.
     */
    SqlStoredProcedureGetResults.DefinitionStages.Blank defineStoredProcedure(String name);

    /**
     * Begins definition for a new UserDefinedFunction resource.
     * @param name resource name.
     * @return the first stage of the new UserDefinedFunction definition.
     */
    SqlUserDefinedFunctionGetResults.DefinitionStages.Blank defineUserDefinedFunction(String name);

    /**
     * Begins definition for a new Trigger resource.
     * @param name resource name.
     * @return the first stage of the new Trigger definition.
     */
    SqlTriggerGetResults.DefinitionStages.Blank defineTrigger(String name);

    /**
     * Gets the SQL database under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SqlDatabaseGetResults> getSqlDatabaseAsync(String resourceGroupName, String accountName, String databaseName);

    /**
     * Lists the SQL databases under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SqlDatabaseGetResults> listSqlDatabasesAsync(String resourceGroupName, String accountName);

    /**
     * Deletes an existing Azure Cosmos DB SQL database.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteSqlDatabaseAsync(String resourceGroupName, String accountName, String databaseName);

    /**
     * Gets the RUs per second of the SQL database under an existing Azure Cosmos DB database account with the provided name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ThroughputSettingsGetResults> getSqlDatabaseThroughputAsync(String resourceGroupName, String accountName, String databaseName);

    /**
     * Update RUs per second of an Azure Cosmos DB SQL database.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param updateThroughputParameters The parameters to provide for the RUs per second of the current SQL database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ThroughputSettingsGetResults> updateSqlDatabaseThroughputAsync(String resourceGroupName, String accountName, String databaseName, ThroughputSettingsUpdateParameters updateThroughputParameters);

    /**
     * Migrate an Azure Cosmos DB SQL database from manual throughput to autoscale.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ThroughputSettingsGetResults> migrateSqlDatabaseToAutoscaleAsync(String resourceGroupName, String accountName, String databaseName);

    /**
     * Migrate an Azure Cosmos DB SQL database from autoscale to manual throughput.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ThroughputSettingsGetResults> migrateSqlDatabaseToManualThroughputAsync(String resourceGroupName, String accountName, String databaseName);

    /**
     * Gets the RUs per second of the SQL container under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param containerName Cosmos DB container name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ThroughputSettingsGetResults> getSqlContainerThroughputAsync(String resourceGroupName, String accountName, String databaseName, String containerName);

    /**
     * Update RUs per second of an Azure Cosmos DB SQL container.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param containerName Cosmos DB container name.
     * @param updateThroughputParameters The parameters to provide for the RUs per second of the current SQL container.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ThroughputSettingsGetResults> updateSqlContainerThroughputAsync(String resourceGroupName, String accountName, String databaseName, String containerName, ThroughputSettingsUpdateParameters updateThroughputParameters);

    /**
     * Migrate an Azure Cosmos DB SQL container from manual throughput to autoscale.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param containerName Cosmos DB container name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ThroughputSettingsGetResults> migrateSqlContainerToAutoscaleAsync(String resourceGroupName, String accountName, String databaseName, String containerName);

    /**
     * Migrate an Azure Cosmos DB SQL container from autoscale to manual throughput.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param containerName Cosmos DB container name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ThroughputSettingsGetResults> migrateSqlContainerToManualThroughputAsync(String resourceGroupName, String accountName, String databaseName, String containerName);

    /**
     * Gets the SQL container under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param containerName Cosmos DB container name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SqlContainerGetResults> getSqlContainerAsync(String resourceGroupName, String accountName, String databaseName, String containerName);

    /**
     * Lists the SQL container under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SqlContainerGetResults> listSqlContainersAsync(String resourceGroupName, String accountName, String databaseName);

    /**
     * Deletes an existing Azure Cosmos DB SQL container.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param containerName Cosmos DB container name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteSqlContainerAsync(String resourceGroupName, String accountName, String databaseName, String containerName);

    /**
     * Gets the SQL storedProcedure under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param containerName Cosmos DB container name.
     * @param storedProcedureName Cosmos DB storedProcedure name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SqlStoredProcedureGetResults> getSqlStoredProcedureAsync(String resourceGroupName, String accountName, String databaseName, String containerName, String storedProcedureName);

    /**
     * Lists the SQL storedProcedure under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param containerName Cosmos DB container name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SqlStoredProcedureGetResults> listSqlStoredProceduresAsync(String resourceGroupName, String accountName, String databaseName, String containerName);

    /**
     * Deletes an existing Azure Cosmos DB SQL storedProcedure.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param containerName Cosmos DB container name.
     * @param storedProcedureName Cosmos DB storedProcedure name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteSqlStoredProcedureAsync(String resourceGroupName, String accountName, String databaseName, String containerName, String storedProcedureName);

    /**
     * Gets the SQL userDefinedFunction under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param containerName Cosmos DB container name.
     * @param userDefinedFunctionName Cosmos DB userDefinedFunction name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SqlUserDefinedFunctionGetResults> getSqlUserDefinedFunctionAsync(String resourceGroupName, String accountName, String databaseName, String containerName, String userDefinedFunctionName);

    /**
     * Lists the SQL userDefinedFunction under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param containerName Cosmos DB container name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SqlUserDefinedFunctionGetResults> listSqlUserDefinedFunctionsAsync(String resourceGroupName, String accountName, String databaseName, String containerName);

    /**
     * Deletes an existing Azure Cosmos DB SQL userDefinedFunction.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param containerName Cosmos DB container name.
     * @param userDefinedFunctionName Cosmos DB userDefinedFunction name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteSqlUserDefinedFunctionAsync(String resourceGroupName, String accountName, String databaseName, String containerName, String userDefinedFunctionName);

    /**
     * Gets the SQL trigger under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param containerName Cosmos DB container name.
     * @param triggerName Cosmos DB trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SqlTriggerGetResults> getSqlTriggerAsync(String resourceGroupName, String accountName, String databaseName, String containerName, String triggerName);

    /**
     * Lists the SQL trigger under an existing Azure Cosmos DB database account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param containerName Cosmos DB container name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SqlTriggerGetResults> listSqlTriggersAsync(String resourceGroupName, String accountName, String databaseName, String containerName);

    /**
     * Deletes an existing Azure Cosmos DB SQL trigger.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param databaseName Cosmos DB database name.
     * @param containerName Cosmos DB container name.
     * @param triggerName Cosmos DB trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteSqlTriggerAsync(String resourceGroupName, String accountName, String databaseName, String containerName, String triggerName);

}
