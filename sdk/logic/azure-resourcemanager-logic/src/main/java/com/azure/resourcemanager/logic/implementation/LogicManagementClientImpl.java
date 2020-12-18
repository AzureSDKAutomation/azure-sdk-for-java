// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.implementation;

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
import com.azure.resourcemanager.logic.fluent.IntegrationAccountAgreementsClient;
import com.azure.resourcemanager.logic.fluent.IntegrationAccountAssembliesClient;
import com.azure.resourcemanager.logic.fluent.IntegrationAccountBatchConfigurationsClient;
import com.azure.resourcemanager.logic.fluent.IntegrationAccountCertificatesClient;
import com.azure.resourcemanager.logic.fluent.IntegrationAccountMapsClient;
import com.azure.resourcemanager.logic.fluent.IntegrationAccountPartnersClient;
import com.azure.resourcemanager.logic.fluent.IntegrationAccountSchemasClient;
import com.azure.resourcemanager.logic.fluent.IntegrationAccountSessionsClient;
import com.azure.resourcemanager.logic.fluent.IntegrationAccountsClient;
import com.azure.resourcemanager.logic.fluent.IntegrationServiceEnvironmentManagedApiOperationsClient;
import com.azure.resourcemanager.logic.fluent.IntegrationServiceEnvironmentManagedApisClient;
import com.azure.resourcemanager.logic.fluent.IntegrationServiceEnvironmentNetworkHealthsClient;
import com.azure.resourcemanager.logic.fluent.IntegrationServiceEnvironmentSkusClient;
import com.azure.resourcemanager.logic.fluent.IntegrationServiceEnvironmentsClient;
import com.azure.resourcemanager.logic.fluent.LogicManagementClient;
import com.azure.resourcemanager.logic.fluent.OperationsClient;
import com.azure.resourcemanager.logic.fluent.WorkflowRunActionRepetitionsClient;
import com.azure.resourcemanager.logic.fluent.WorkflowRunActionRepetitionsRequestHistoriesClient;
import com.azure.resourcemanager.logic.fluent.WorkflowRunActionRequestHistoriesClient;
import com.azure.resourcemanager.logic.fluent.WorkflowRunActionScopeRepetitionsClient;
import com.azure.resourcemanager.logic.fluent.WorkflowRunActionsClient;
import com.azure.resourcemanager.logic.fluent.WorkflowRunOperationsClient;
import com.azure.resourcemanager.logic.fluent.WorkflowRunsClient;
import com.azure.resourcemanager.logic.fluent.WorkflowTriggerHistoriesClient;
import com.azure.resourcemanager.logic.fluent.WorkflowTriggersClient;
import com.azure.resourcemanager.logic.fluent.WorkflowVersionTriggersClient;
import com.azure.resourcemanager.logic.fluent.WorkflowVersionsClient;
import com.azure.resourcemanager.logic.fluent.WorkflowsClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the LogicManagementClientImpl type. */
@ServiceClient(builder = LogicManagementClientBuilder.class)
public final class LogicManagementClientImpl implements LogicManagementClient {
    private final ClientLogger logger = new ClientLogger(LogicManagementClientImpl.class);

    /** The subscription id. */
    private final String subscriptionId;

    /**
     * Gets The subscription id.
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

    /** The WorkflowsClient object to access its operations. */
    private final WorkflowsClient workflows;

    /**
     * Gets the WorkflowsClient object to access its operations.
     *
     * @return the WorkflowsClient object.
     */
    public WorkflowsClient getWorkflows() {
        return this.workflows;
    }

    /** The WorkflowVersionsClient object to access its operations. */
    private final WorkflowVersionsClient workflowVersions;

    /**
     * Gets the WorkflowVersionsClient object to access its operations.
     *
     * @return the WorkflowVersionsClient object.
     */
    public WorkflowVersionsClient getWorkflowVersions() {
        return this.workflowVersions;
    }

    /** The WorkflowTriggersClient object to access its operations. */
    private final WorkflowTriggersClient workflowTriggers;

    /**
     * Gets the WorkflowTriggersClient object to access its operations.
     *
     * @return the WorkflowTriggersClient object.
     */
    public WorkflowTriggersClient getWorkflowTriggers() {
        return this.workflowTriggers;
    }

    /** The WorkflowVersionTriggersClient object to access its operations. */
    private final WorkflowVersionTriggersClient workflowVersionTriggers;

    /**
     * Gets the WorkflowVersionTriggersClient object to access its operations.
     *
     * @return the WorkflowVersionTriggersClient object.
     */
    public WorkflowVersionTriggersClient getWorkflowVersionTriggers() {
        return this.workflowVersionTriggers;
    }

    /** The WorkflowTriggerHistoriesClient object to access its operations. */
    private final WorkflowTriggerHistoriesClient workflowTriggerHistories;

    /**
     * Gets the WorkflowTriggerHistoriesClient object to access its operations.
     *
     * @return the WorkflowTriggerHistoriesClient object.
     */
    public WorkflowTriggerHistoriesClient getWorkflowTriggerHistories() {
        return this.workflowTriggerHistories;
    }

    /** The WorkflowRunsClient object to access its operations. */
    private final WorkflowRunsClient workflowRuns;

    /**
     * Gets the WorkflowRunsClient object to access its operations.
     *
     * @return the WorkflowRunsClient object.
     */
    public WorkflowRunsClient getWorkflowRuns() {
        return this.workflowRuns;
    }

    /** The WorkflowRunActionsClient object to access its operations. */
    private final WorkflowRunActionsClient workflowRunActions;

    /**
     * Gets the WorkflowRunActionsClient object to access its operations.
     *
     * @return the WorkflowRunActionsClient object.
     */
    public WorkflowRunActionsClient getWorkflowRunActions() {
        return this.workflowRunActions;
    }

    /** The WorkflowRunActionRepetitionsClient object to access its operations. */
    private final WorkflowRunActionRepetitionsClient workflowRunActionRepetitions;

    /**
     * Gets the WorkflowRunActionRepetitionsClient object to access its operations.
     *
     * @return the WorkflowRunActionRepetitionsClient object.
     */
    public WorkflowRunActionRepetitionsClient getWorkflowRunActionRepetitions() {
        return this.workflowRunActionRepetitions;
    }

    /** The WorkflowRunActionRepetitionsRequestHistoriesClient object to access its operations. */
    private final WorkflowRunActionRepetitionsRequestHistoriesClient workflowRunActionRepetitionsRequestHistories;

    /**
     * Gets the WorkflowRunActionRepetitionsRequestHistoriesClient object to access its operations.
     *
     * @return the WorkflowRunActionRepetitionsRequestHistoriesClient object.
     */
    public WorkflowRunActionRepetitionsRequestHistoriesClient getWorkflowRunActionRepetitionsRequestHistories() {
        return this.workflowRunActionRepetitionsRequestHistories;
    }

    /** The WorkflowRunActionRequestHistoriesClient object to access its operations. */
    private final WorkflowRunActionRequestHistoriesClient workflowRunActionRequestHistories;

    /**
     * Gets the WorkflowRunActionRequestHistoriesClient object to access its operations.
     *
     * @return the WorkflowRunActionRequestHistoriesClient object.
     */
    public WorkflowRunActionRequestHistoriesClient getWorkflowRunActionRequestHistories() {
        return this.workflowRunActionRequestHistories;
    }

    /** The WorkflowRunActionScopeRepetitionsClient object to access its operations. */
    private final WorkflowRunActionScopeRepetitionsClient workflowRunActionScopeRepetitions;

    /**
     * Gets the WorkflowRunActionScopeRepetitionsClient object to access its operations.
     *
     * @return the WorkflowRunActionScopeRepetitionsClient object.
     */
    public WorkflowRunActionScopeRepetitionsClient getWorkflowRunActionScopeRepetitions() {
        return this.workflowRunActionScopeRepetitions;
    }

    /** The WorkflowRunOperationsClient object to access its operations. */
    private final WorkflowRunOperationsClient workflowRunOperations;

    /**
     * Gets the WorkflowRunOperationsClient object to access its operations.
     *
     * @return the WorkflowRunOperationsClient object.
     */
    public WorkflowRunOperationsClient getWorkflowRunOperations() {
        return this.workflowRunOperations;
    }

    /** The IntegrationAccountsClient object to access its operations. */
    private final IntegrationAccountsClient integrationAccounts;

    /**
     * Gets the IntegrationAccountsClient object to access its operations.
     *
     * @return the IntegrationAccountsClient object.
     */
    public IntegrationAccountsClient getIntegrationAccounts() {
        return this.integrationAccounts;
    }

    /** The IntegrationAccountAssembliesClient object to access its operations. */
    private final IntegrationAccountAssembliesClient integrationAccountAssemblies;

    /**
     * Gets the IntegrationAccountAssembliesClient object to access its operations.
     *
     * @return the IntegrationAccountAssembliesClient object.
     */
    public IntegrationAccountAssembliesClient getIntegrationAccountAssemblies() {
        return this.integrationAccountAssemblies;
    }

    /** The IntegrationAccountBatchConfigurationsClient object to access its operations. */
    private final IntegrationAccountBatchConfigurationsClient integrationAccountBatchConfigurations;

    /**
     * Gets the IntegrationAccountBatchConfigurationsClient object to access its operations.
     *
     * @return the IntegrationAccountBatchConfigurationsClient object.
     */
    public IntegrationAccountBatchConfigurationsClient getIntegrationAccountBatchConfigurations() {
        return this.integrationAccountBatchConfigurations;
    }

    /** The IntegrationAccountSchemasClient object to access its operations. */
    private final IntegrationAccountSchemasClient integrationAccountSchemas;

    /**
     * Gets the IntegrationAccountSchemasClient object to access its operations.
     *
     * @return the IntegrationAccountSchemasClient object.
     */
    public IntegrationAccountSchemasClient getIntegrationAccountSchemas() {
        return this.integrationAccountSchemas;
    }

    /** The IntegrationAccountMapsClient object to access its operations. */
    private final IntegrationAccountMapsClient integrationAccountMaps;

    /**
     * Gets the IntegrationAccountMapsClient object to access its operations.
     *
     * @return the IntegrationAccountMapsClient object.
     */
    public IntegrationAccountMapsClient getIntegrationAccountMaps() {
        return this.integrationAccountMaps;
    }

    /** The IntegrationAccountPartnersClient object to access its operations. */
    private final IntegrationAccountPartnersClient integrationAccountPartners;

    /**
     * Gets the IntegrationAccountPartnersClient object to access its operations.
     *
     * @return the IntegrationAccountPartnersClient object.
     */
    public IntegrationAccountPartnersClient getIntegrationAccountPartners() {
        return this.integrationAccountPartners;
    }

    /** The IntegrationAccountAgreementsClient object to access its operations. */
    private final IntegrationAccountAgreementsClient integrationAccountAgreements;

    /**
     * Gets the IntegrationAccountAgreementsClient object to access its operations.
     *
     * @return the IntegrationAccountAgreementsClient object.
     */
    public IntegrationAccountAgreementsClient getIntegrationAccountAgreements() {
        return this.integrationAccountAgreements;
    }

    /** The IntegrationAccountCertificatesClient object to access its operations. */
    private final IntegrationAccountCertificatesClient integrationAccountCertificates;

    /**
     * Gets the IntegrationAccountCertificatesClient object to access its operations.
     *
     * @return the IntegrationAccountCertificatesClient object.
     */
    public IntegrationAccountCertificatesClient getIntegrationAccountCertificates() {
        return this.integrationAccountCertificates;
    }

    /** The IntegrationAccountSessionsClient object to access its operations. */
    private final IntegrationAccountSessionsClient integrationAccountSessions;

    /**
     * Gets the IntegrationAccountSessionsClient object to access its operations.
     *
     * @return the IntegrationAccountSessionsClient object.
     */
    public IntegrationAccountSessionsClient getIntegrationAccountSessions() {
        return this.integrationAccountSessions;
    }

    /** The IntegrationServiceEnvironmentsClient object to access its operations. */
    private final IntegrationServiceEnvironmentsClient integrationServiceEnvironments;

    /**
     * Gets the IntegrationServiceEnvironmentsClient object to access its operations.
     *
     * @return the IntegrationServiceEnvironmentsClient object.
     */
    public IntegrationServiceEnvironmentsClient getIntegrationServiceEnvironments() {
        return this.integrationServiceEnvironments;
    }

    /** The IntegrationServiceEnvironmentSkusClient object to access its operations. */
    private final IntegrationServiceEnvironmentSkusClient integrationServiceEnvironmentSkus;

    /**
     * Gets the IntegrationServiceEnvironmentSkusClient object to access its operations.
     *
     * @return the IntegrationServiceEnvironmentSkusClient object.
     */
    public IntegrationServiceEnvironmentSkusClient getIntegrationServiceEnvironmentSkus() {
        return this.integrationServiceEnvironmentSkus;
    }

    /** The IntegrationServiceEnvironmentNetworkHealthsClient object to access its operations. */
    private final IntegrationServiceEnvironmentNetworkHealthsClient integrationServiceEnvironmentNetworkHealths;

    /**
     * Gets the IntegrationServiceEnvironmentNetworkHealthsClient object to access its operations.
     *
     * @return the IntegrationServiceEnvironmentNetworkHealthsClient object.
     */
    public IntegrationServiceEnvironmentNetworkHealthsClient getIntegrationServiceEnvironmentNetworkHealths() {
        return this.integrationServiceEnvironmentNetworkHealths;
    }

    /** The IntegrationServiceEnvironmentManagedApisClient object to access its operations. */
    private final IntegrationServiceEnvironmentManagedApisClient integrationServiceEnvironmentManagedApis;

    /**
     * Gets the IntegrationServiceEnvironmentManagedApisClient object to access its operations.
     *
     * @return the IntegrationServiceEnvironmentManagedApisClient object.
     */
    public IntegrationServiceEnvironmentManagedApisClient getIntegrationServiceEnvironmentManagedApis() {
        return this.integrationServiceEnvironmentManagedApis;
    }

    /** The IntegrationServiceEnvironmentManagedApiOperationsClient object to access its operations. */
    private final IntegrationServiceEnvironmentManagedApiOperationsClient
        integrationServiceEnvironmentManagedApiOperations;

    /**
     * Gets the IntegrationServiceEnvironmentManagedApiOperationsClient object to access its operations.
     *
     * @return the IntegrationServiceEnvironmentManagedApiOperationsClient object.
     */
    public IntegrationServiceEnvironmentManagedApiOperationsClient
        getIntegrationServiceEnvironmentManagedApiOperations() {
        return this.integrationServiceEnvironmentManagedApiOperations;
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

    /**
     * Initializes an instance of LogicManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The subscription id.
     * @param endpoint server parameter.
     */
    LogicManagementClientImpl(
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
        this.apiVersion = "2019-05-01";
        this.workflows = new WorkflowsClientImpl(this);
        this.workflowVersions = new WorkflowVersionsClientImpl(this);
        this.workflowTriggers = new WorkflowTriggersClientImpl(this);
        this.workflowVersionTriggers = new WorkflowVersionTriggersClientImpl(this);
        this.workflowTriggerHistories = new WorkflowTriggerHistoriesClientImpl(this);
        this.workflowRuns = new WorkflowRunsClientImpl(this);
        this.workflowRunActions = new WorkflowRunActionsClientImpl(this);
        this.workflowRunActionRepetitions = new WorkflowRunActionRepetitionsClientImpl(this);
        this.workflowRunActionRepetitionsRequestHistories =
            new WorkflowRunActionRepetitionsRequestHistoriesClientImpl(this);
        this.workflowRunActionRequestHistories = new WorkflowRunActionRequestHistoriesClientImpl(this);
        this.workflowRunActionScopeRepetitions = new WorkflowRunActionScopeRepetitionsClientImpl(this);
        this.workflowRunOperations = new WorkflowRunOperationsClientImpl(this);
        this.integrationAccounts = new IntegrationAccountsClientImpl(this);
        this.integrationAccountAssemblies = new IntegrationAccountAssembliesClientImpl(this);
        this.integrationAccountBatchConfigurations = new IntegrationAccountBatchConfigurationsClientImpl(this);
        this.integrationAccountSchemas = new IntegrationAccountSchemasClientImpl(this);
        this.integrationAccountMaps = new IntegrationAccountMapsClientImpl(this);
        this.integrationAccountPartners = new IntegrationAccountPartnersClientImpl(this);
        this.integrationAccountAgreements = new IntegrationAccountAgreementsClientImpl(this);
        this.integrationAccountCertificates = new IntegrationAccountCertificatesClientImpl(this);
        this.integrationAccountSessions = new IntegrationAccountSessionsClientImpl(this);
        this.integrationServiceEnvironments = new IntegrationServiceEnvironmentsClientImpl(this);
        this.integrationServiceEnvironmentSkus = new IntegrationServiceEnvironmentSkusClientImpl(this);
        this.integrationServiceEnvironmentNetworkHealths =
            new IntegrationServiceEnvironmentNetworkHealthsClientImpl(this);
        this.integrationServiceEnvironmentManagedApis = new IntegrationServiceEnvironmentManagedApisClientImpl(this);
        this.integrationServiceEnvironmentManagedApiOperations =
            new IntegrationServiceEnvironmentManagedApiOperationsClientImpl(this);
        this.operations = new OperationsClientImpl(this);
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
                    } catch (IOException ioe) {
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
            this.responseBody = responseBody.getBytes(StandardCharsets.UTF_8);
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
