// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.management.polling.PollerFactory;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.cosmos.generated.fluent.CassandraResourcesClient;
import com.azure.resourcemanager.cosmos.generated.fluent.CollectionPartitionRegionsClient;
import com.azure.resourcemanager.cosmos.generated.fluent.CollectionPartitionsClient;
import com.azure.resourcemanager.cosmos.generated.fluent.CollectionRegionsClient;
import com.azure.resourcemanager.cosmos.generated.fluent.CollectionsClient;
import com.azure.resourcemanager.cosmos.generated.fluent.CosmosDBManagementClient;
import com.azure.resourcemanager.cosmos.generated.fluent.DatabaseAccountRegionsClient;
import com.azure.resourcemanager.cosmos.generated.fluent.DatabaseAccountsClient;
import com.azure.resourcemanager.cosmos.generated.fluent.DatabasesClient;
import com.azure.resourcemanager.cosmos.generated.fluent.GremlinResourcesClient;
import com.azure.resourcemanager.cosmos.generated.fluent.MongoDBResourcesClient;
import com.azure.resourcemanager.cosmos.generated.fluent.NotebookWorkspacesClient;
import com.azure.resourcemanager.cosmos.generated.fluent.OperationsClient;
import com.azure.resourcemanager.cosmos.generated.fluent.PartitionKeyRangeIdRegionsClient;
import com.azure.resourcemanager.cosmos.generated.fluent.PartitionKeyRangeIdsClient;
import com.azure.resourcemanager.cosmos.generated.fluent.PercentileSourceTargetsClient;
import com.azure.resourcemanager.cosmos.generated.fluent.PercentileTargetsClient;
import com.azure.resourcemanager.cosmos.generated.fluent.PercentilesClient;
import com.azure.resourcemanager.cosmos.generated.fluent.PrivateEndpointConnectionsClient;
import com.azure.resourcemanager.cosmos.generated.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.cosmos.generated.fluent.SqlResourcesClient;
import com.azure.resourcemanager.cosmos.generated.fluent.TableResourcesClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the CosmosDBManagementClientImpl type. */
@ServiceClient(builder = CosmosDBManagementClientBuilder.class)
public final class CosmosDBManagementClientImpl implements CosmosDBManagementClient {
    private final ClientLogger logger = new ClientLogger(CosmosDBManagementClientImpl.class);

    /** The ID of the target subscription. */
    private final String subscriptionId;

    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /** server parameter. */
    private final String endpoint;

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The default poll interval for long-running operation. */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /** The DatabaseAccountsClient object to access its operations. */
    private final DatabaseAccountsClient databaseAccounts;

    /**
     * Gets the DatabaseAccountsClient object to access its operations.
     *
     * @return the DatabaseAccountsClient object.
     */
    public DatabaseAccountsClient getDatabaseAccounts() {
        return this.databaseAccounts;
    }

    /** The OperationsClient object to access its operations. */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /** The DatabasesClient object to access its operations. */
    private final DatabasesClient databases;

    /**
     * Gets the DatabasesClient object to access its operations.
     *
     * @return the DatabasesClient object.
     */
    public DatabasesClient getDatabases() {
        return this.databases;
    }

    /** The CollectionsClient object to access its operations. */
    private final CollectionsClient collections;

    /**
     * Gets the CollectionsClient object to access its operations.
     *
     * @return the CollectionsClient object.
     */
    public CollectionsClient getCollections() {
        return this.collections;
    }

    /** The CollectionRegionsClient object to access its operations. */
    private final CollectionRegionsClient collectionRegions;

    /**
     * Gets the CollectionRegionsClient object to access its operations.
     *
     * @return the CollectionRegionsClient object.
     */
    public CollectionRegionsClient getCollectionRegions() {
        return this.collectionRegions;
    }

    /** The DatabaseAccountRegionsClient object to access its operations. */
    private final DatabaseAccountRegionsClient databaseAccountRegions;

    /**
     * Gets the DatabaseAccountRegionsClient object to access its operations.
     *
     * @return the DatabaseAccountRegionsClient object.
     */
    public DatabaseAccountRegionsClient getDatabaseAccountRegions() {
        return this.databaseAccountRegions;
    }

    /** The PercentileSourceTargetsClient object to access its operations. */
    private final PercentileSourceTargetsClient percentileSourceTargets;

    /**
     * Gets the PercentileSourceTargetsClient object to access its operations.
     *
     * @return the PercentileSourceTargetsClient object.
     */
    public PercentileSourceTargetsClient getPercentileSourceTargets() {
        return this.percentileSourceTargets;
    }

    /** The PercentileTargetsClient object to access its operations. */
    private final PercentileTargetsClient percentileTargets;

    /**
     * Gets the PercentileTargetsClient object to access its operations.
     *
     * @return the PercentileTargetsClient object.
     */
    public PercentileTargetsClient getPercentileTargets() {
        return this.percentileTargets;
    }

    /** The PercentilesClient object to access its operations. */
    private final PercentilesClient percentiles;

    /**
     * Gets the PercentilesClient object to access its operations.
     *
     * @return the PercentilesClient object.
     */
    public PercentilesClient getPercentiles() {
        return this.percentiles;
    }

    /** The CollectionPartitionRegionsClient object to access its operations. */
    private final CollectionPartitionRegionsClient collectionPartitionRegions;

    /**
     * Gets the CollectionPartitionRegionsClient object to access its operations.
     *
     * @return the CollectionPartitionRegionsClient object.
     */
    public CollectionPartitionRegionsClient getCollectionPartitionRegions() {
        return this.collectionPartitionRegions;
    }

    /** The CollectionPartitionsClient object to access its operations. */
    private final CollectionPartitionsClient collectionPartitions;

    /**
     * Gets the CollectionPartitionsClient object to access its operations.
     *
     * @return the CollectionPartitionsClient object.
     */
    public CollectionPartitionsClient getCollectionPartitions() {
        return this.collectionPartitions;
    }

    /** The PartitionKeyRangeIdsClient object to access its operations. */
    private final PartitionKeyRangeIdsClient partitionKeyRangeIds;

    /**
     * Gets the PartitionKeyRangeIdsClient object to access its operations.
     *
     * @return the PartitionKeyRangeIdsClient object.
     */
    public PartitionKeyRangeIdsClient getPartitionKeyRangeIds() {
        return this.partitionKeyRangeIds;
    }

    /** The PartitionKeyRangeIdRegionsClient object to access its operations. */
    private final PartitionKeyRangeIdRegionsClient partitionKeyRangeIdRegions;

    /**
     * Gets the PartitionKeyRangeIdRegionsClient object to access its operations.
     *
     * @return the PartitionKeyRangeIdRegionsClient object.
     */
    public PartitionKeyRangeIdRegionsClient getPartitionKeyRangeIdRegions() {
        return this.partitionKeyRangeIdRegions;
    }

    /** The SqlResourcesClient object to access its operations. */
    private final SqlResourcesClient sqlResources;

    /**
     * Gets the SqlResourcesClient object to access its operations.
     *
     * @return the SqlResourcesClient object.
     */
    public SqlResourcesClient getSqlResources() {
        return this.sqlResources;
    }

    /** The MongoDBResourcesClient object to access its operations. */
    private final MongoDBResourcesClient mongoDBResources;

    /**
     * Gets the MongoDBResourcesClient object to access its operations.
     *
     * @return the MongoDBResourcesClient object.
     */
    public MongoDBResourcesClient getMongoDBResources() {
        return this.mongoDBResources;
    }

    /** The TableResourcesClient object to access its operations. */
    private final TableResourcesClient tableResources;

    /**
     * Gets the TableResourcesClient object to access its operations.
     *
     * @return the TableResourcesClient object.
     */
    public TableResourcesClient getTableResources() {
        return this.tableResources;
    }

    /** The CassandraResourcesClient object to access its operations. */
    private final CassandraResourcesClient cassandraResources;

    /**
     * Gets the CassandraResourcesClient object to access its operations.
     *
     * @return the CassandraResourcesClient object.
     */
    public CassandraResourcesClient getCassandraResources() {
        return this.cassandraResources;
    }

    /** The GremlinResourcesClient object to access its operations. */
    private final GremlinResourcesClient gremlinResources;

    /**
     * Gets the GremlinResourcesClient object to access its operations.
     *
     * @return the GremlinResourcesClient object.
     */
    public GremlinResourcesClient getGremlinResources() {
        return this.gremlinResources;
    }

    /** The NotebookWorkspacesClient object to access its operations. */
    private final NotebookWorkspacesClient notebookWorkspaces;

    /**
     * Gets the NotebookWorkspacesClient object to access its operations.
     *
     * @return the NotebookWorkspacesClient object.
     */
    public NotebookWorkspacesClient getNotebookWorkspaces() {
        return this.notebookWorkspaces;
    }

    /** The PrivateLinkResourcesClient object to access its operations. */
    private final PrivateLinkResourcesClient privateLinkResources;

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     *
     * @return the PrivateLinkResourcesClient object.
     */
    public PrivateLinkResourcesClient getPrivateLinkResources() {
        return this.privateLinkResources;
    }

    /** The PrivateEndpointConnectionsClient object to access its operations. */
    private final PrivateEndpointConnectionsClient privateEndpointConnections;

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     *
     * @return the PrivateEndpointConnectionsClient object.
     */
    public PrivateEndpointConnectionsClient getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Initializes an instance of CosmosDBManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The ID of the target subscription.
     * @param endpoint server parameter.
     */
    CosmosDBManagementClientImpl(
        HttpPipeline httpPipeline,
        SerializerAdapter serializerAdapter,
        Duration defaultPollInterval,
        AzureEnvironment environment,
        String subscriptionId,
        String endpoint) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.apiVersion = "2021-01-15";
        this.databaseAccounts = new DatabaseAccountsClientImpl(this);
        this.operations = new OperationsClientImpl(this);
        this.databases = new DatabasesClientImpl(this);
        this.collections = new CollectionsClientImpl(this);
        this.collectionRegions = new CollectionRegionsClientImpl(this);
        this.databaseAccountRegions = new DatabaseAccountRegionsClientImpl(this);
        this.percentileSourceTargets = new PercentileSourceTargetsClientImpl(this);
        this.percentileTargets = new PercentileTargetsClientImpl(this);
        this.percentiles = new PercentilesClientImpl(this);
        this.collectionPartitionRegions = new CollectionPartitionRegionsClientImpl(this);
        this.collectionPartitions = new CollectionPartitionsClientImpl(this);
        this.partitionKeyRangeIds = new PartitionKeyRangeIdsClientImpl(this);
        this.partitionKeyRangeIdRegions = new PartitionKeyRangeIdRegionsClientImpl(this);
        this.sqlResources = new SqlResourcesClientImpl(this);
        this.mongoDBResources = new MongoDBResourcesClientImpl(this);
        this.tableResources = new TableResourcesClientImpl(this);
        this.cassandraResources = new CassandraResourcesClientImpl(this);
        this.gremlinResources = new GremlinResourcesClientImpl(this);
        this.notebookWorkspaces = new NotebookWorkspacesClientImpl(this);
        this.privateLinkResources = new PrivateLinkResourcesClientImpl(this);
        this.privateEndpointConnections = new PrivateEndpointConnectionsClientImpl(this);
    }

    /**
     * Gets default client context.
     *
     * @return the default client context.
     */
    public Context getContext() {
        return Context.NONE;
    }

    /**
     * Merges default client context with provided context.
     *
     * @param context the context to be merged with default client context.
     * @return the merged context.
     */
    public Context mergeContext(Context context) {
        for (Map.Entry<Object, Object> entry : this.getContext().getValues().entrySet()) {
            context = context.addData(entry.getKey(), entry.getValue());
        }
        return context;
    }

    /**
     * Gets long running operation result.
     *
     * @param activationResponse the response of activation operation.
     * @param httpPipeline the http pipeline.
     * @param pollResultType type of poll result.
     * @param finalResultType type of final result.
     * @param context the context shared by all requests.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return poller flux for poll result and final result.
     */
    public <T, U> PollerFlux<PollResult<T>, U> getLroResult(
        Mono<Response<Flux<ByteBuffer>>> activationResponse,
        HttpPipeline httpPipeline,
        Type pollResultType,
        Type finalResultType,
        Context context) {
        return PollerFactory
            .create(
                serializerAdapter,
                httpPipeline,
                pollResultType,
                finalResultType,
                defaultPollInterval,
                activationResponse,
                context);
    }

    /**
     * Gets the final result, or an error, based on last async poll response.
     *
     * @param response the last async poll response.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return the final result, or an error.
     */
    public <T, U> Mono<U> getLroFinalResultOrError(AsyncPollResponse<PollResult<T>, U> response) {
        if (response.getStatus() != LongRunningOperationStatus.SUCCESSFULLY_COMPLETED) {
            String errorMessage;
            ManagementError managementError = null;
            HttpResponse errorResponse = null;
            PollResult.Error lroError = response.getValue().getError();
            if (lroError != null) {
                errorResponse =
                    new HttpResponseImpl(
                        lroError.getResponseStatusCode(), lroError.getResponseHeaders(), lroError.getResponseBody());

                errorMessage = response.getValue().getError().getMessage();
                String errorBody = response.getValue().getError().getResponseBody();
                if (errorBody != null) {
                    // try to deserialize error body to ManagementError
                    try {
                        managementError =
                            this
                                .getSerializerAdapter()
                                .deserialize(errorBody, ManagementError.class, SerializerEncoding.JSON);
                        if (managementError.getCode() == null || managementError.getMessage() == null) {
                            managementError = null;
                        }
                    } catch (IOException | RuntimeException ioe) {
                        logger.logThrowableAsWarning(ioe);
                    }
                }
            } else {
                // fallback to default error message
                errorMessage = "Long running operation failed.";
            }
            if (managementError == null) {
                // fallback to default ManagementError
                managementError = new ManagementError(response.getStatus().toString(), errorMessage);
            }
            return Mono.error(new ManagementException(errorMessage, errorResponse, managementError));
        } else {
            return response.getFinalResult();
        }
    }

    private static final class HttpResponseImpl extends HttpResponse {
        private final int statusCode;

        private final byte[] responseBody;

        private final HttpHeaders httpHeaders;

        HttpResponseImpl(int statusCode, HttpHeaders httpHeaders, String responseBody) {
            super(null);
            this.statusCode = statusCode;
            this.httpHeaders = httpHeaders;
            this.responseBody = responseBody == null ? null : responseBody.getBytes(StandardCharsets.UTF_8);
        }

        public int getStatusCode() {
            return statusCode;
        }

        public String getHeaderValue(String s) {
            return httpHeaders.getValue(s);
        }

        public HttpHeaders getHeaders() {
            return httpHeaders;
        }

        public Flux<ByteBuffer> getBody() {
            return Flux.just(ByteBuffer.wrap(responseBody));
        }

        public Mono<byte[]> getBodyAsByteArray() {
            return Mono.just(responseBody);
        }

        public Mono<String> getBodyAsString() {
            return Mono.just(new String(responseBody, StandardCharsets.UTF_8));
        }

        public Mono<String> getBodyAsString(Charset charset) {
            return Mono.just(new String(responseBody, charset));
        }
    }
}
