// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.BearerTokenAuthenticationPolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.fluent.CosmosDBManagementClient;
import com.azure.resourcemanager.cosmos.generated.implementation.CassandraClustersImpl;
import com.azure.resourcemanager.cosmos.generated.implementation.CassandraDataCentersImpl;
import com.azure.resourcemanager.cosmos.generated.implementation.CassandraResourcesImpl;
import com.azure.resourcemanager.cosmos.generated.implementation.CollectionPartitionRegionsImpl;
import com.azure.resourcemanager.cosmos.generated.implementation.CollectionPartitionsImpl;
import com.azure.resourcemanager.cosmos.generated.implementation.CollectionRegionsImpl;
import com.azure.resourcemanager.cosmos.generated.implementation.CollectionsImpl;
import com.azure.resourcemanager.cosmos.generated.implementation.CosmosDBManagementClientBuilder;
import com.azure.resourcemanager.cosmos.generated.implementation.DatabaseAccountRegionsImpl;
import com.azure.resourcemanager.cosmos.generated.implementation.DatabaseAccountsImpl;
import com.azure.resourcemanager.cosmos.generated.implementation.DatabasesImpl;
import com.azure.resourcemanager.cosmos.generated.implementation.GremlinResourcesImpl;
import com.azure.resourcemanager.cosmos.generated.implementation.MongoDBResourcesImpl;
import com.azure.resourcemanager.cosmos.generated.implementation.NotebookWorkspacesImpl;
import com.azure.resourcemanager.cosmos.generated.implementation.OperationsImpl;
import com.azure.resourcemanager.cosmos.generated.implementation.PartitionKeyRangeIdRegionsImpl;
import com.azure.resourcemanager.cosmos.generated.implementation.PartitionKeyRangeIdsImpl;
import com.azure.resourcemanager.cosmos.generated.implementation.PercentileSourceTargetsImpl;
import com.azure.resourcemanager.cosmos.generated.implementation.PercentileTargetsImpl;
import com.azure.resourcemanager.cosmos.generated.implementation.PercentilesImpl;
import com.azure.resourcemanager.cosmos.generated.implementation.PrivateEndpointConnectionsImpl;
import com.azure.resourcemanager.cosmos.generated.implementation.PrivateLinkResourcesImpl;
import com.azure.resourcemanager.cosmos.generated.implementation.RestorableDatabaseAccountsImpl;
import com.azure.resourcemanager.cosmos.generated.implementation.RestorableMongodbCollectionsImpl;
import com.azure.resourcemanager.cosmos.generated.implementation.RestorableMongodbDatabasesImpl;
import com.azure.resourcemanager.cosmos.generated.implementation.RestorableMongodbResourcesImpl;
import com.azure.resourcemanager.cosmos.generated.implementation.RestorableSqlContainersImpl;
import com.azure.resourcemanager.cosmos.generated.implementation.RestorableSqlDatabasesImpl;
import com.azure.resourcemanager.cosmos.generated.implementation.RestorableSqlResourcesImpl;
import com.azure.resourcemanager.cosmos.generated.implementation.SqlResourcesImpl;
import com.azure.resourcemanager.cosmos.generated.implementation.TableResourcesImpl;
import com.azure.resourcemanager.cosmos.generated.models.CassandraClusters;
import com.azure.resourcemanager.cosmos.generated.models.CassandraDataCenters;
import com.azure.resourcemanager.cosmos.generated.models.CassandraResources;
import com.azure.resourcemanager.cosmos.generated.models.CollectionPartitionRegions;
import com.azure.resourcemanager.cosmos.generated.models.CollectionPartitions;
import com.azure.resourcemanager.cosmos.generated.models.CollectionRegions;
import com.azure.resourcemanager.cosmos.generated.models.Collections;
import com.azure.resourcemanager.cosmos.generated.models.DatabaseAccountRegions;
import com.azure.resourcemanager.cosmos.generated.models.DatabaseAccounts;
import com.azure.resourcemanager.cosmos.generated.models.Databases;
import com.azure.resourcemanager.cosmos.generated.models.GremlinResources;
import com.azure.resourcemanager.cosmos.generated.models.MongoDBResources;
import com.azure.resourcemanager.cosmos.generated.models.NotebookWorkspaces;
import com.azure.resourcemanager.cosmos.generated.models.Operations;
import com.azure.resourcemanager.cosmos.generated.models.PartitionKeyRangeIdRegions;
import com.azure.resourcemanager.cosmos.generated.models.PartitionKeyRangeIds;
import com.azure.resourcemanager.cosmos.generated.models.PercentileSourceTargets;
import com.azure.resourcemanager.cosmos.generated.models.PercentileTargets;
import com.azure.resourcemanager.cosmos.generated.models.Percentiles;
import com.azure.resourcemanager.cosmos.generated.models.PrivateEndpointConnections;
import com.azure.resourcemanager.cosmos.generated.models.PrivateLinkResources;
import com.azure.resourcemanager.cosmos.generated.models.RestorableDatabaseAccounts;
import com.azure.resourcemanager.cosmos.generated.models.RestorableMongodbCollections;
import com.azure.resourcemanager.cosmos.generated.models.RestorableMongodbDatabases;
import com.azure.resourcemanager.cosmos.generated.models.RestorableMongodbResources;
import com.azure.resourcemanager.cosmos.generated.models.RestorableSqlContainers;
import com.azure.resourcemanager.cosmos.generated.models.RestorableSqlDatabases;
import com.azure.resourcemanager.cosmos.generated.models.RestorableSqlResources;
import com.azure.resourcemanager.cosmos.generated.models.SqlResources;
import com.azure.resourcemanager.cosmos.generated.models.TableResources;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Entry point to CosmosDBManager. Azure Cosmos DB Database Service Resource Provider REST API. */
public final class CosmosDBManager {
    private DatabaseAccounts databaseAccounts;

    private Operations operations;

    private Databases databases;

    private Collections collections;

    private CollectionRegions collectionRegions;

    private DatabaseAccountRegions databaseAccountRegions;

    private PercentileSourceTargets percentileSourceTargets;

    private PercentileTargets percentileTargets;

    private Percentiles percentiles;

    private CollectionPartitionRegions collectionPartitionRegions;

    private CollectionPartitions collectionPartitions;

    private PartitionKeyRangeIds partitionKeyRangeIds;

    private PartitionKeyRangeIdRegions partitionKeyRangeIdRegions;

    private SqlResources sqlResources;

    private MongoDBResources mongoDBResources;

    private TableResources tableResources;

    private CassandraResources cassandraResources;

    private GremlinResources gremlinResources;

    private RestorableDatabaseAccounts restorableDatabaseAccounts;

    private CassandraClusters cassandraClusters;

    private CassandraDataCenters cassandraDataCenters;

    private NotebookWorkspaces notebookWorkspaces;

    private PrivateEndpointConnections privateEndpointConnections;

    private PrivateLinkResources privateLinkResources;

    private RestorableSqlDatabases restorableSqlDatabases;

    private RestorableSqlContainers restorableSqlContainers;

    private RestorableSqlResources restorableSqlResources;

    private RestorableMongodbDatabases restorableMongodbDatabases;

    private RestorableMongodbCollections restorableMongodbCollections;

    private RestorableMongodbResources restorableMongodbResources;

    private final CosmosDBManagementClient clientObject;

    private CosmosDBManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new CosmosDBManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of CosmosDB service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the CosmosDB service API instance.
     */
    public static CosmosDBManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create CosmosDBManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new CosmosDBManager.Configurable();
    }

    /** The Configurable allowing configurations to be set. */
    public static final class Configurable {
        private final ClientLogger logger = new ClientLogger(Configurable.class);

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private RetryPolicy retryPolicy;
        private Duration defaultPollInterval;

        private Configurable() {
        }

        /**
         * Sets the http client.
         *
         * @param httpClient the HTTP client.
         * @return the configurable object itself.
         */
        public Configurable withHttpClient(HttpClient httpClient) {
            this.httpClient = Objects.requireNonNull(httpClient, "'httpClient' cannot be null.");
            return this;
        }

        /**
         * Sets the logging options to the HTTP pipeline.
         *
         * @param httpLogOptions the HTTP log options.
         * @return the configurable object itself.
         */
        public Configurable withLogOptions(HttpLogOptions httpLogOptions) {
            this.httpLogOptions = Objects.requireNonNull(httpLogOptions, "'httpLogOptions' cannot be null.");
            return this;
        }

        /**
         * Adds the pipeline policy to the HTTP pipeline.
         *
         * @param policy the HTTP pipeline policy.
         * @return the configurable object itself.
         */
        public Configurable withPolicy(HttpPipelinePolicy policy) {
            this.policies.add(Objects.requireNonNull(policy, "'policy' cannot be null."));
            return this;
        }

        /**
         * Sets the retry policy to the HTTP pipeline.
         *
         * @param retryPolicy the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryPolicy(RetryPolicy retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy, "'retryPolicy' cannot be null.");
            return this;
        }

        /**
         * Sets the default poll interval, used when service does not provide "Retry-After" header.
         *
         * @param defaultPollInterval the default poll interval.
         * @return the configurable object itself.
         */
        public Configurable withDefaultPollInterval(Duration defaultPollInterval) {
            this.defaultPollInterval = Objects.requireNonNull(defaultPollInterval, "'retryPolicy' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw logger.logExceptionAsError(new IllegalArgumentException("'httpPipeline' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of CosmosDB service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the CosmosDB service API instance.
         */
        public CosmosDBManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.cosmos.generated")
                .append("/")
                .append("1.0.0-beta.1");
            if (!Configuration.getGlobalConfiguration().get("AZURE_TELEMETRY_DISABLED", false)) {
                userAgentBuilder
                    .append(" (")
                    .append(Configuration.getGlobalConfiguration().get("java.version"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.name"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.version"))
                    .append("; auto-generated)");
            } else {
                userAgentBuilder.append(" (auto-generated)");
            }

            if (retryPolicy == null) {
                retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies.add(new UserAgentPolicy(userAgentBuilder.toString()));
            policies.add(new RequestIdPolicy());
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies
                .add(
                    new BearerTokenAuthenticationPolicy(
                        credential, profile.getEnvironment().getManagementEndpoint() + "/.default"));
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                    .httpClient(httpClient)
                    .policies(policies.toArray(new HttpPipelinePolicy[0]))
                    .build();
            return new CosmosDBManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of DatabaseAccounts. */
    public DatabaseAccounts databaseAccounts() {
        if (this.databaseAccounts == null) {
            this.databaseAccounts = new DatabaseAccountsImpl(clientObject.getDatabaseAccounts(), this);
        }
        return databaseAccounts;
    }

    /** @return Resource collection API of Operations. */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /** @return Resource collection API of Databases. */
    public Databases databases() {
        if (this.databases == null) {
            this.databases = new DatabasesImpl(clientObject.getDatabases(), this);
        }
        return databases;
    }

    /** @return Resource collection API of Collections. */
    public Collections collections() {
        if (this.collections == null) {
            this.collections = new CollectionsImpl(clientObject.getCollections(), this);
        }
        return collections;
    }

    /** @return Resource collection API of CollectionRegions. */
    public CollectionRegions collectionRegions() {
        if (this.collectionRegions == null) {
            this.collectionRegions = new CollectionRegionsImpl(clientObject.getCollectionRegions(), this);
        }
        return collectionRegions;
    }

    /** @return Resource collection API of DatabaseAccountRegions. */
    public DatabaseAccountRegions databaseAccountRegions() {
        if (this.databaseAccountRegions == null) {
            this.databaseAccountRegions =
                new DatabaseAccountRegionsImpl(clientObject.getDatabaseAccountRegions(), this);
        }
        return databaseAccountRegions;
    }

    /** @return Resource collection API of PercentileSourceTargets. */
    public PercentileSourceTargets percentileSourceTargets() {
        if (this.percentileSourceTargets == null) {
            this.percentileSourceTargets =
                new PercentileSourceTargetsImpl(clientObject.getPercentileSourceTargets(), this);
        }
        return percentileSourceTargets;
    }

    /** @return Resource collection API of PercentileTargets. */
    public PercentileTargets percentileTargets() {
        if (this.percentileTargets == null) {
            this.percentileTargets = new PercentileTargetsImpl(clientObject.getPercentileTargets(), this);
        }
        return percentileTargets;
    }

    /** @return Resource collection API of Percentiles. */
    public Percentiles percentiles() {
        if (this.percentiles == null) {
            this.percentiles = new PercentilesImpl(clientObject.getPercentiles(), this);
        }
        return percentiles;
    }

    /** @return Resource collection API of CollectionPartitionRegions. */
    public CollectionPartitionRegions collectionPartitionRegions() {
        if (this.collectionPartitionRegions == null) {
            this.collectionPartitionRegions =
                new CollectionPartitionRegionsImpl(clientObject.getCollectionPartitionRegions(), this);
        }
        return collectionPartitionRegions;
    }

    /** @return Resource collection API of CollectionPartitions. */
    public CollectionPartitions collectionPartitions() {
        if (this.collectionPartitions == null) {
            this.collectionPartitions = new CollectionPartitionsImpl(clientObject.getCollectionPartitions(), this);
        }
        return collectionPartitions;
    }

    /** @return Resource collection API of PartitionKeyRangeIds. */
    public PartitionKeyRangeIds partitionKeyRangeIds() {
        if (this.partitionKeyRangeIds == null) {
            this.partitionKeyRangeIds = new PartitionKeyRangeIdsImpl(clientObject.getPartitionKeyRangeIds(), this);
        }
        return partitionKeyRangeIds;
    }

    /** @return Resource collection API of PartitionKeyRangeIdRegions. */
    public PartitionKeyRangeIdRegions partitionKeyRangeIdRegions() {
        if (this.partitionKeyRangeIdRegions == null) {
            this.partitionKeyRangeIdRegions =
                new PartitionKeyRangeIdRegionsImpl(clientObject.getPartitionKeyRangeIdRegions(), this);
        }
        return partitionKeyRangeIdRegions;
    }

    /** @return Resource collection API of SqlResources. */
    public SqlResources sqlResources() {
        if (this.sqlResources == null) {
            this.sqlResources = new SqlResourcesImpl(clientObject.getSqlResources(), this);
        }
        return sqlResources;
    }

    /** @return Resource collection API of MongoDBResources. */
    public MongoDBResources mongoDBResources() {
        if (this.mongoDBResources == null) {
            this.mongoDBResources = new MongoDBResourcesImpl(clientObject.getMongoDBResources(), this);
        }
        return mongoDBResources;
    }

    /** @return Resource collection API of TableResources. */
    public TableResources tableResources() {
        if (this.tableResources == null) {
            this.tableResources = new TableResourcesImpl(clientObject.getTableResources(), this);
        }
        return tableResources;
    }

    /** @return Resource collection API of CassandraResources. */
    public CassandraResources cassandraResources() {
        if (this.cassandraResources == null) {
            this.cassandraResources = new CassandraResourcesImpl(clientObject.getCassandraResources(), this);
        }
        return cassandraResources;
    }

    /** @return Resource collection API of GremlinResources. */
    public GremlinResources gremlinResources() {
        if (this.gremlinResources == null) {
            this.gremlinResources = new GremlinResourcesImpl(clientObject.getGremlinResources(), this);
        }
        return gremlinResources;
    }

    /** @return Resource collection API of RestorableDatabaseAccounts. */
    public RestorableDatabaseAccounts restorableDatabaseAccounts() {
        if (this.restorableDatabaseAccounts == null) {
            this.restorableDatabaseAccounts =
                new RestorableDatabaseAccountsImpl(clientObject.getRestorableDatabaseAccounts(), this);
        }
        return restorableDatabaseAccounts;
    }

    /** @return Resource collection API of CassandraClusters. */
    public CassandraClusters cassandraClusters() {
        if (this.cassandraClusters == null) {
            this.cassandraClusters = new CassandraClustersImpl(clientObject.getCassandraClusters(), this);
        }
        return cassandraClusters;
    }

    /** @return Resource collection API of CassandraDataCenters. */
    public CassandraDataCenters cassandraDataCenters() {
        if (this.cassandraDataCenters == null) {
            this.cassandraDataCenters = new CassandraDataCentersImpl(clientObject.getCassandraDataCenters(), this);
        }
        return cassandraDataCenters;
    }

    /** @return Resource collection API of NotebookWorkspaces. */
    public NotebookWorkspaces notebookWorkspaces() {
        if (this.notebookWorkspaces == null) {
            this.notebookWorkspaces = new NotebookWorkspacesImpl(clientObject.getNotebookWorkspaces(), this);
        }
        return notebookWorkspaces;
    }

    /** @return Resource collection API of PrivateEndpointConnections. */
    public PrivateEndpointConnections privateEndpointConnections() {
        if (this.privateEndpointConnections == null) {
            this.privateEndpointConnections =
                new PrivateEndpointConnectionsImpl(clientObject.getPrivateEndpointConnections(), this);
        }
        return privateEndpointConnections;
    }

    /** @return Resource collection API of PrivateLinkResources. */
    public PrivateLinkResources privateLinkResources() {
        if (this.privateLinkResources == null) {
            this.privateLinkResources = new PrivateLinkResourcesImpl(clientObject.getPrivateLinkResources(), this);
        }
        return privateLinkResources;
    }

    /** @return Resource collection API of RestorableSqlDatabases. */
    public RestorableSqlDatabases restorableSqlDatabases() {
        if (this.restorableSqlDatabases == null) {
            this.restorableSqlDatabases =
                new RestorableSqlDatabasesImpl(clientObject.getRestorableSqlDatabases(), this);
        }
        return restorableSqlDatabases;
    }

    /** @return Resource collection API of RestorableSqlContainers. */
    public RestorableSqlContainers restorableSqlContainers() {
        if (this.restorableSqlContainers == null) {
            this.restorableSqlContainers =
                new RestorableSqlContainersImpl(clientObject.getRestorableSqlContainers(), this);
        }
        return restorableSqlContainers;
    }

    /** @return Resource collection API of RestorableSqlResources. */
    public RestorableSqlResources restorableSqlResources() {
        if (this.restorableSqlResources == null) {
            this.restorableSqlResources =
                new RestorableSqlResourcesImpl(clientObject.getRestorableSqlResources(), this);
        }
        return restorableSqlResources;
    }

    /** @return Resource collection API of RestorableMongodbDatabases. */
    public RestorableMongodbDatabases restorableMongodbDatabases() {
        if (this.restorableMongodbDatabases == null) {
            this.restorableMongodbDatabases =
                new RestorableMongodbDatabasesImpl(clientObject.getRestorableMongodbDatabases(), this);
        }
        return restorableMongodbDatabases;
    }

    /** @return Resource collection API of RestorableMongodbCollections. */
    public RestorableMongodbCollections restorableMongodbCollections() {
        if (this.restorableMongodbCollections == null) {
            this.restorableMongodbCollections =
                new RestorableMongodbCollectionsImpl(clientObject.getRestorableMongodbCollections(), this);
        }
        return restorableMongodbCollections;
    }

    /** @return Resource collection API of RestorableMongodbResources. */
    public RestorableMongodbResources restorableMongodbResources() {
        if (this.restorableMongodbResources == null) {
            this.restorableMongodbResources =
                new RestorableMongodbResourcesImpl(clientObject.getRestorableMongodbResources(), this);
        }
        return restorableMongodbResources;
    }

    /**
     * @return Wrapped service client CosmosDBManagementClient providing direct access to the underlying auto-generated
     *     API implementation, based on Azure REST API.
     */
    public CosmosDBManagementClient serviceClient() {
        return this.clientObject;
    }
}
