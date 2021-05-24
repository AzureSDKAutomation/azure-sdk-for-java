// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.implementation;

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
import com.azure.resourcemanager.recoveryservices.fluent.OperationsClient;
import com.azure.resourcemanager.recoveryservices.fluent.PrivateLinkResourcesOperationsClient;
import com.azure.resourcemanager.recoveryservices.fluent.RecoveryServicesClient;
import com.azure.resourcemanager.recoveryservices.fluent.RecoveryServicesManagementClient;
import com.azure.resourcemanager.recoveryservices.fluent.RegisteredIdentitiesClient;
import com.azure.resourcemanager.recoveryservices.fluent.ReplicationUsagesClient;
import com.azure.resourcemanager.recoveryservices.fluent.ResourceProvidersClient;
import com.azure.resourcemanager.recoveryservices.fluent.UsagesClient;
import com.azure.resourcemanager.recoveryservices.fluent.VaultCertificatesClient;
import com.azure.resourcemanager.recoveryservices.fluent.VaultExtendedInfoesClient;
import com.azure.resourcemanager.recoveryservices.fluent.VaultsClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the RecoveryServicesManagementClientImpl type. */
@ServiceClient(builder = RecoveryServicesManagementClientBuilder.class)
public final class RecoveryServicesManagementClientImpl implements RecoveryServicesManagementClient {
    private final ClientLogger logger = new ClientLogger(RecoveryServicesManagementClientImpl.class);

    /** The subscription Id. */
    private final String subscriptionId;

    /**
     * Gets The subscription Id.
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

    /** The VaultCertificatesClient object to access its operations. */
    private final VaultCertificatesClient vaultCertificates;

    /**
     * Gets the VaultCertificatesClient object to access its operations.
     *
     * @return the VaultCertificatesClient object.
     */
    public VaultCertificatesClient getVaultCertificates() {
        return this.vaultCertificates;
    }

    /** The RegisteredIdentitiesClient object to access its operations. */
    private final RegisteredIdentitiesClient registeredIdentities;

    /**
     * Gets the RegisteredIdentitiesClient object to access its operations.
     *
     * @return the RegisteredIdentitiesClient object.
     */
    public RegisteredIdentitiesClient getRegisteredIdentities() {
        return this.registeredIdentities;
    }

    /** The ReplicationUsagesClient object to access its operations. */
    private final ReplicationUsagesClient replicationUsages;

    /**
     * Gets the ReplicationUsagesClient object to access its operations.
     *
     * @return the ReplicationUsagesClient object.
     */
    public ReplicationUsagesClient getReplicationUsages() {
        return this.replicationUsages;
    }

    /** The PrivateLinkResourcesOperationsClient object to access its operations. */
    private final PrivateLinkResourcesOperationsClient privateLinkResourcesOperations;

    /**
     * Gets the PrivateLinkResourcesOperationsClient object to access its operations.
     *
     * @return the PrivateLinkResourcesOperationsClient object.
     */
    public PrivateLinkResourcesOperationsClient getPrivateLinkResourcesOperations() {
        return this.privateLinkResourcesOperations;
    }

    /** The RecoveryServicesClient object to access its operations. */
    private final RecoveryServicesClient recoveryServices;

    /**
     * Gets the RecoveryServicesClient object to access its operations.
     *
     * @return the RecoveryServicesClient object.
     */
    public RecoveryServicesClient getRecoveryServices() {
        return this.recoveryServices;
    }

    /** The VaultsClient object to access its operations. */
    private final VaultsClient vaults;

    /**
     * Gets the VaultsClient object to access its operations.
     *
     * @return the VaultsClient object.
     */
    public VaultsClient getVaults() {
        return this.vaults;
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

    /** The VaultExtendedInfoesClient object to access its operations. */
    private final VaultExtendedInfoesClient vaultExtendedInfoes;

    /**
     * Gets the VaultExtendedInfoesClient object to access its operations.
     *
     * @return the VaultExtendedInfoesClient object.
     */
    public VaultExtendedInfoesClient getVaultExtendedInfoes() {
        return this.vaultExtendedInfoes;
    }

    /** The ResourceProvidersClient object to access its operations. */
    private final ResourceProvidersClient resourceProviders;

    /**
     * Gets the ResourceProvidersClient object to access its operations.
     *
     * @return the ResourceProvidersClient object.
     */
    public ResourceProvidersClient getResourceProviders() {
        return this.resourceProviders;
    }

    /** The UsagesClient object to access its operations. */
    private final UsagesClient usages;

    /**
     * Gets the UsagesClient object to access its operations.
     *
     * @return the UsagesClient object.
     */
    public UsagesClient getUsages() {
        return this.usages;
    }

    /**
     * Initializes an instance of RecoveryServicesManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The subscription Id.
     * @param endpoint server parameter.
     */
    RecoveryServicesManagementClientImpl(
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
        this.apiVersion = "2021-03-01";
        this.vaultCertificates = new VaultCertificatesClientImpl(this);
        this.registeredIdentities = new RegisteredIdentitiesClientImpl(this);
        this.replicationUsages = new ReplicationUsagesClientImpl(this);
        this.privateLinkResourcesOperations = new PrivateLinkResourcesOperationsClientImpl(this);
        this.recoveryServices = new RecoveryServicesClientImpl(this);
        this.vaults = new VaultsClientImpl(this);
        this.operations = new OperationsClientImpl(this);
        this.vaultExtendedInfoes = new VaultExtendedInfoesClientImpl(this);
        this.resourceProviders = new ResourceProvidersClientImpl(this);
        this.usages = new UsagesClientImpl(this);
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
