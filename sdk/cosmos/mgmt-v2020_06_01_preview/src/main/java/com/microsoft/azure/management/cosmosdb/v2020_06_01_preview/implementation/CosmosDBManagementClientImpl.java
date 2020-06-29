/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the CosmosDBManagementClientImpl class.
 */
public class CosmosDBManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The ID of the target subscription. */
    private String subscriptionId;

    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The ID of the target subscription.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public CosmosDBManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** The preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets The preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets The preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public CosmosDBManagementClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** The retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public CosmosDBManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public CosmosDBManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The DatabaseAccountsInner object to access its operations.
     */
    private DatabaseAccountsInner databaseAccounts;

    /**
     * Gets the DatabaseAccountsInner object to access its operations.
     * @return the DatabaseAccountsInner object.
     */
    public DatabaseAccountsInner databaseAccounts() {
        return this.databaseAccounts;
    }

    /**
     * The OperationsInner object to access its operations.
     */
    private OperationsInner operations;

    /**
     * Gets the OperationsInner object to access its operations.
     * @return the OperationsInner object.
     */
    public OperationsInner operations() {
        return this.operations;
    }

    /**
     * The DatabasesInner object to access its operations.
     */
    private DatabasesInner databases;

    /**
     * Gets the DatabasesInner object to access its operations.
     * @return the DatabasesInner object.
     */
    public DatabasesInner databases() {
        return this.databases;
    }

    /**
     * The CollectionsInner object to access its operations.
     */
    private CollectionsInner collections;

    /**
     * Gets the CollectionsInner object to access its operations.
     * @return the CollectionsInner object.
     */
    public CollectionsInner collections() {
        return this.collections;
    }

    /**
     * The CollectionRegionsInner object to access its operations.
     */
    private CollectionRegionsInner collectionRegions;

    /**
     * Gets the CollectionRegionsInner object to access its operations.
     * @return the CollectionRegionsInner object.
     */
    public CollectionRegionsInner collectionRegions() {
        return this.collectionRegions;
    }

    /**
     * The DatabaseAccountRegionsInner object to access its operations.
     */
    private DatabaseAccountRegionsInner databaseAccountRegions;

    /**
     * Gets the DatabaseAccountRegionsInner object to access its operations.
     * @return the DatabaseAccountRegionsInner object.
     */
    public DatabaseAccountRegionsInner databaseAccountRegions() {
        return this.databaseAccountRegions;
    }

    /**
     * The PercentileSourceTargetsInner object to access its operations.
     */
    private PercentileSourceTargetsInner percentileSourceTargets;

    /**
     * Gets the PercentileSourceTargetsInner object to access its operations.
     * @return the PercentileSourceTargetsInner object.
     */
    public PercentileSourceTargetsInner percentileSourceTargets() {
        return this.percentileSourceTargets;
    }

    /**
     * The PercentileTargetsInner object to access its operations.
     */
    private PercentileTargetsInner percentileTargets;

    /**
     * Gets the PercentileTargetsInner object to access its operations.
     * @return the PercentileTargetsInner object.
     */
    public PercentileTargetsInner percentileTargets() {
        return this.percentileTargets;
    }

    /**
     * The PercentilesInner object to access its operations.
     */
    private PercentilesInner percentiles;

    /**
     * Gets the PercentilesInner object to access its operations.
     * @return the PercentilesInner object.
     */
    public PercentilesInner percentiles() {
        return this.percentiles;
    }

    /**
     * The CollectionPartitionRegionsInner object to access its operations.
     */
    private CollectionPartitionRegionsInner collectionPartitionRegions;

    /**
     * Gets the CollectionPartitionRegionsInner object to access its operations.
     * @return the CollectionPartitionRegionsInner object.
     */
    public CollectionPartitionRegionsInner collectionPartitionRegions() {
        return this.collectionPartitionRegions;
    }

    /**
     * The CollectionPartitionsInner object to access its operations.
     */
    private CollectionPartitionsInner collectionPartitions;

    /**
     * Gets the CollectionPartitionsInner object to access its operations.
     * @return the CollectionPartitionsInner object.
     */
    public CollectionPartitionsInner collectionPartitions() {
        return this.collectionPartitions;
    }

    /**
     * The PartitionKeyRangeIdsInner object to access its operations.
     */
    private PartitionKeyRangeIdsInner partitionKeyRangeIds;

    /**
     * Gets the PartitionKeyRangeIdsInner object to access its operations.
     * @return the PartitionKeyRangeIdsInner object.
     */
    public PartitionKeyRangeIdsInner partitionKeyRangeIds() {
        return this.partitionKeyRangeIds;
    }

    /**
     * The PartitionKeyRangeIdRegionsInner object to access its operations.
     */
    private PartitionKeyRangeIdRegionsInner partitionKeyRangeIdRegions;

    /**
     * Gets the PartitionKeyRangeIdRegionsInner object to access its operations.
     * @return the PartitionKeyRangeIdRegionsInner object.
     */
    public PartitionKeyRangeIdRegionsInner partitionKeyRangeIdRegions() {
        return this.partitionKeyRangeIdRegions;
    }

    /**
     * The SqlResourcesInner object to access its operations.
     */
    private SqlResourcesInner sqlResources;

    /**
     * Gets the SqlResourcesInner object to access its operations.
     * @return the SqlResourcesInner object.
     */
    public SqlResourcesInner sqlResources() {
        return this.sqlResources;
    }

    /**
     * The MongoDBResourcesInner object to access its operations.
     */
    private MongoDBResourcesInner mongoDBResources;

    /**
     * Gets the MongoDBResourcesInner object to access its operations.
     * @return the MongoDBResourcesInner object.
     */
    public MongoDBResourcesInner mongoDBResources() {
        return this.mongoDBResources;
    }

    /**
     * The TableResourcesInner object to access its operations.
     */
    private TableResourcesInner tableResources;

    /**
     * Gets the TableResourcesInner object to access its operations.
     * @return the TableResourcesInner object.
     */
    public TableResourcesInner tableResources() {
        return this.tableResources;
    }

    /**
     * The CassandraResourcesInner object to access its operations.
     */
    private CassandraResourcesInner cassandraResources;

    /**
     * Gets the CassandraResourcesInner object to access its operations.
     * @return the CassandraResourcesInner object.
     */
    public CassandraResourcesInner cassandraResources() {
        return this.cassandraResources;
    }

    /**
     * The GremlinResourcesInner object to access its operations.
     */
    private GremlinResourcesInner gremlinResources;

    /**
     * Gets the GremlinResourcesInner object to access its operations.
     * @return the GremlinResourcesInner object.
     */
    public GremlinResourcesInner gremlinResources() {
        return this.gremlinResources;
    }

    /**
     * The RestorableDatabaseAccountsInner object to access its operations.
     */
    private RestorableDatabaseAccountsInner restorableDatabaseAccounts;

    /**
     * Gets the RestorableDatabaseAccountsInner object to access its operations.
     * @return the RestorableDatabaseAccountsInner object.
     */
    public RestorableDatabaseAccountsInner restorableDatabaseAccounts() {
        return this.restorableDatabaseAccounts;
    }

    /**
     * The NotebookWorkspacesInner object to access its operations.
     */
    private NotebookWorkspacesInner notebookWorkspaces;

    /**
     * Gets the NotebookWorkspacesInner object to access its operations.
     * @return the NotebookWorkspacesInner object.
     */
    public NotebookWorkspacesInner notebookWorkspaces() {
        return this.notebookWorkspaces;
    }

    /**
     * The PrivateLinkResourcesInner object to access its operations.
     */
    private PrivateLinkResourcesInner privateLinkResources;

    /**
     * Gets the PrivateLinkResourcesInner object to access its operations.
     * @return the PrivateLinkResourcesInner object.
     */
    public PrivateLinkResourcesInner privateLinkResources() {
        return this.privateLinkResources;
    }

    /**
     * The PrivateEndpointConnectionsInner object to access its operations.
     */
    private PrivateEndpointConnectionsInner privateEndpointConnections;

    /**
     * Gets the PrivateEndpointConnectionsInner object to access its operations.
     * @return the PrivateEndpointConnectionsInner object.
     */
    public PrivateEndpointConnectionsInner privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Initializes an instance of CosmosDBManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public CosmosDBManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of CosmosDBManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public CosmosDBManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of CosmosDBManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public CosmosDBManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.databaseAccounts = new DatabaseAccountsInner(restClient().retrofit(), this);
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.databases = new DatabasesInner(restClient().retrofit(), this);
        this.collections = new CollectionsInner(restClient().retrofit(), this);
        this.collectionRegions = new CollectionRegionsInner(restClient().retrofit(), this);
        this.databaseAccountRegions = new DatabaseAccountRegionsInner(restClient().retrofit(), this);
        this.percentileSourceTargets = new PercentileSourceTargetsInner(restClient().retrofit(), this);
        this.percentileTargets = new PercentileTargetsInner(restClient().retrofit(), this);
        this.percentiles = new PercentilesInner(restClient().retrofit(), this);
        this.collectionPartitionRegions = new CollectionPartitionRegionsInner(restClient().retrofit(), this);
        this.collectionPartitions = new CollectionPartitionsInner(restClient().retrofit(), this);
        this.partitionKeyRangeIds = new PartitionKeyRangeIdsInner(restClient().retrofit(), this);
        this.partitionKeyRangeIdRegions = new PartitionKeyRangeIdRegionsInner(restClient().retrofit(), this);
        this.sqlResources = new SqlResourcesInner(restClient().retrofit(), this);
        this.mongoDBResources = new MongoDBResourcesInner(restClient().retrofit(), this);
        this.tableResources = new TableResourcesInner(restClient().retrofit(), this);
        this.cassandraResources = new CassandraResourcesInner(restClient().retrofit(), this);
        this.gremlinResources = new GremlinResourcesInner(restClient().retrofit(), this);
        this.restorableDatabaseAccounts = new RestorableDatabaseAccountsInner(restClient().retrofit(), this);
        this.notebookWorkspaces = new NotebookWorkspacesInner(restClient().retrofit(), this);
        this.privateLinkResources = new PrivateLinkResourcesInner(restClient().retrofit(), this);
        this.privateEndpointConnections = new PrivateEndpointConnectionsInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "CosmosDBManagementClient", "2020-06-01-preiew");
    }
}
