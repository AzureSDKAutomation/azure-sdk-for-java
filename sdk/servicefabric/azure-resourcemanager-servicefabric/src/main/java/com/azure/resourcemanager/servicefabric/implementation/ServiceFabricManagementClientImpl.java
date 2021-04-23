// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.implementation;

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
import com.azure.resourcemanager.servicefabric.fluent.ApplicationTypeVersionsClient;
import com.azure.resourcemanager.servicefabric.fluent.ApplicationTypesClient;
import com.azure.resourcemanager.servicefabric.fluent.ApplicationsClient;
import com.azure.resourcemanager.servicefabric.fluent.ClusterVersionsClient;
import com.azure.resourcemanager.servicefabric.fluent.ClustersClient;
import com.azure.resourcemanager.servicefabric.fluent.ManagedClusterVersionsClient;
import com.azure.resourcemanager.servicefabric.fluent.ManagedClustersClient;
import com.azure.resourcemanager.servicefabric.fluent.NodeTypesClient;
import com.azure.resourcemanager.servicefabric.fluent.OperationsClient;
import com.azure.resourcemanager.servicefabric.fluent.ServiceFabricManagementClient;
import com.azure.resourcemanager.servicefabric.fluent.ServicesClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the ServiceFabricManagementClientImpl type. */
@ServiceClient(builder = ServiceFabricManagementClientBuilder.class)
public final class ServiceFabricManagementClientImpl implements ServiceFabricManagementClient {
    private final ClientLogger logger = new ClientLogger(ServiceFabricManagementClientImpl.class);

    /** The customer subscription identifier. */
    private final String subscriptionId;

    /**
     * Gets The customer subscription identifier.
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

    /** The ClustersClient object to access its operations. */
    private final ClustersClient clusters;

    /**
     * Gets the ClustersClient object to access its operations.
     *
     * @return the ClustersClient object.
     */
    public ClustersClient getClusters() {
        return this.clusters;
    }

    /** The ClusterVersionsClient object to access its operations. */
    private final ClusterVersionsClient clusterVersions;

    /**
     * Gets the ClusterVersionsClient object to access its operations.
     *
     * @return the ClusterVersionsClient object.
     */
    public ClusterVersionsClient getClusterVersions() {
        return this.clusterVersions;
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

    /** The ApplicationTypesClient object to access its operations. */
    private final ApplicationTypesClient applicationTypes;

    /**
     * Gets the ApplicationTypesClient object to access its operations.
     *
     * @return the ApplicationTypesClient object.
     */
    public ApplicationTypesClient getApplicationTypes() {
        return this.applicationTypes;
    }

    /** The ApplicationTypeVersionsClient object to access its operations. */
    private final ApplicationTypeVersionsClient applicationTypeVersions;

    /**
     * Gets the ApplicationTypeVersionsClient object to access its operations.
     *
     * @return the ApplicationTypeVersionsClient object.
     */
    public ApplicationTypeVersionsClient getApplicationTypeVersions() {
        return this.applicationTypeVersions;
    }

    /** The ApplicationsClient object to access its operations. */
    private final ApplicationsClient applications;

    /**
     * Gets the ApplicationsClient object to access its operations.
     *
     * @return the ApplicationsClient object.
     */
    public ApplicationsClient getApplications() {
        return this.applications;
    }

    /** The ServicesClient object to access its operations. */
    private final ServicesClient services;

    /**
     * Gets the ServicesClient object to access its operations.
     *
     * @return the ServicesClient object.
     */
    public ServicesClient getServices() {
        return this.services;
    }

    /** The ManagedClustersClient object to access its operations. */
    private final ManagedClustersClient managedClusters;

    /**
     * Gets the ManagedClustersClient object to access its operations.
     *
     * @return the ManagedClustersClient object.
     */
    public ManagedClustersClient getManagedClusters() {
        return this.managedClusters;
    }

    /** The ManagedClusterVersionsClient object to access its operations. */
    private final ManagedClusterVersionsClient managedClusterVersions;

    /**
     * Gets the ManagedClusterVersionsClient object to access its operations.
     *
     * @return the ManagedClusterVersionsClient object.
     */
    public ManagedClusterVersionsClient getManagedClusterVersions() {
        return this.managedClusterVersions;
    }

    /** The NodeTypesClient object to access its operations. */
    private final NodeTypesClient nodeTypes;

    /**
     * Gets the NodeTypesClient object to access its operations.
     *
     * @return the NodeTypesClient object.
     */
    public NodeTypesClient getNodeTypes() {
        return this.nodeTypes;
    }

    /**
     * Initializes an instance of ServiceFabricManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The customer subscription identifier.
     * @param endpoint server parameter.
     */
    ServiceFabricManagementClientImpl(
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
        this.clusters = new ClustersClientImpl(this);
        this.clusterVersions = new ClusterVersionsClientImpl(this);
        this.operations = new OperationsClientImpl(this);
        this.applicationTypes = new ApplicationTypesClientImpl(this);
        this.applicationTypeVersions = new ApplicationTypeVersionsClientImpl(this);
        this.applications = new ApplicationsClientImpl(this);
        this.services = new ServicesClientImpl(this);
        this.managedClusters = new ManagedClustersClientImpl(this);
        this.managedClusterVersions = new ManagedClusterVersionsClientImpl(this);
        this.nodeTypes = new NodeTypesClientImpl(this);
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
