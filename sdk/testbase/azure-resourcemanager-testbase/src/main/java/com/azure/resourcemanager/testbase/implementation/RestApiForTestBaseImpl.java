// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.testbase.implementation;

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
import com.azure.resourcemanager.testbase.fluent.AnalysisResultOperationsClient;
import com.azure.resourcemanager.testbase.fluent.AnalysisResultsClient;
import com.azure.resourcemanager.testbase.fluent.FavoriteProcessClient;
import com.azure.resourcemanager.testbase.fluent.FavoriteProcessesClient;
import com.azure.resourcemanager.testbase.fluent.OSUpdateOperationsClient;
import com.azure.resourcemanager.testbase.fluent.OSUpdatesClient;
import com.azure.resourcemanager.testbase.fluent.OperationsClient;
import com.azure.resourcemanager.testbase.fluent.PackageOperationsClient;
import com.azure.resourcemanager.testbase.fluent.PackagesClient;
import com.azure.resourcemanager.testbase.fluent.ResourceProvidersClient;
import com.azure.resourcemanager.testbase.fluent.RestApiForTestBase;
import com.azure.resourcemanager.testbase.fluent.SKUsClient;
import com.azure.resourcemanager.testbase.fluent.TestBaseAccountAvailableOSClient;
import com.azure.resourcemanager.testbase.fluent.TestBaseAccountAvailableOSsClient;
import com.azure.resourcemanager.testbase.fluent.TestBaseAccountFlightingRingOperationsClient;
import com.azure.resourcemanager.testbase.fluent.TestBaseAccountFlightingRingsClient;
import com.azure.resourcemanager.testbase.fluent.TestBaseAccountOperationsClient;
import com.azure.resourcemanager.testbase.fluent.TestBaseAccountTestTypeOperationsClient;
import com.azure.resourcemanager.testbase.fluent.TestBaseAccountTestTypesClient;
import com.azure.resourcemanager.testbase.fluent.TestBaseAccountUsagesClient;
import com.azure.resourcemanager.testbase.fluent.TestBaseAccountsClient;
import com.azure.resourcemanager.testbase.fluent.TestResultOperationsClient;
import com.azure.resourcemanager.testbase.fluent.TestResultsClient;
import com.azure.resourcemanager.testbase.fluent.TestSummariesClient;
import com.azure.resourcemanager.testbase.fluent.TestSummaryOperationsClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the RestApiForTestBaseImpl type. */
@ServiceClient(builder = RestApiForTestBaseBuilder.class)
public final class RestApiForTestBaseImpl implements RestApiForTestBase {
    private final ClientLogger logger = new ClientLogger(RestApiForTestBaseImpl.class);

    /** The Azure subscription ID. This is a GUID-formatted string. */
    private final String subscriptionId;

    /**
     * Gets The Azure subscription ID. This is a GUID-formatted string.
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

    /** The SKUsClient object to access its operations. */
    private final SKUsClient sKUs;

    /**
     * Gets the SKUsClient object to access its operations.
     *
     * @return the SKUsClient object.
     */
    public SKUsClient getSKUs() {
        return this.sKUs;
    }

    /** The TestBaseAccountsClient object to access its operations. */
    private final TestBaseAccountsClient testBaseAccounts;

    /**
     * Gets the TestBaseAccountsClient object to access its operations.
     *
     * @return the TestBaseAccountsClient object.
     */
    public TestBaseAccountsClient getTestBaseAccounts() {
        return this.testBaseAccounts;
    }

    /** The TestBaseAccountOperationsClient object to access its operations. */
    private final TestBaseAccountOperationsClient testBaseAccountOperations;

    /**
     * Gets the TestBaseAccountOperationsClient object to access its operations.
     *
     * @return the TestBaseAccountOperationsClient object.
     */
    public TestBaseAccountOperationsClient getTestBaseAccountOperations() {
        return this.testBaseAccountOperations;
    }

    /** The TestBaseAccountUsagesClient object to access its operations. */
    private final TestBaseAccountUsagesClient testBaseAccountUsages;

    /**
     * Gets the TestBaseAccountUsagesClient object to access its operations.
     *
     * @return the TestBaseAccountUsagesClient object.
     */
    public TestBaseAccountUsagesClient getTestBaseAccountUsages() {
        return this.testBaseAccountUsages;
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

    /** The TestBaseAccountAvailableOSsClient object to access its operations. */
    private final TestBaseAccountAvailableOSsClient testBaseAccountAvailableOSs;

    /**
     * Gets the TestBaseAccountAvailableOSsClient object to access its operations.
     *
     * @return the TestBaseAccountAvailableOSsClient object.
     */
    public TestBaseAccountAvailableOSsClient getTestBaseAccountAvailableOSs() {
        return this.testBaseAccountAvailableOSs;
    }

    /** The TestBaseAccountAvailableOSClient object to access its operations. */
    private final TestBaseAccountAvailableOSClient testBaseAccountAvailableOS;

    /**
     * Gets the TestBaseAccountAvailableOSClient object to access its operations.
     *
     * @return the TestBaseAccountAvailableOSClient object.
     */
    public TestBaseAccountAvailableOSClient getTestBaseAccountAvailableOS() {
        return this.testBaseAccountAvailableOS;
    }

    /** The TestBaseAccountFlightingRingsClient object to access its operations. */
    private final TestBaseAccountFlightingRingsClient testBaseAccountFlightingRings;

    /**
     * Gets the TestBaseAccountFlightingRingsClient object to access its operations.
     *
     * @return the TestBaseAccountFlightingRingsClient object.
     */
    public TestBaseAccountFlightingRingsClient getTestBaseAccountFlightingRings() {
        return this.testBaseAccountFlightingRings;
    }

    /** The TestBaseAccountFlightingRingOperationsClient object to access its operations. */
    private final TestBaseAccountFlightingRingOperationsClient testBaseAccountFlightingRingOperations;

    /**
     * Gets the TestBaseAccountFlightingRingOperationsClient object to access its operations.
     *
     * @return the TestBaseAccountFlightingRingOperationsClient object.
     */
    public TestBaseAccountFlightingRingOperationsClient getTestBaseAccountFlightingRingOperations() {
        return this.testBaseAccountFlightingRingOperations;
    }

    /** The TestBaseAccountTestTypesClient object to access its operations. */
    private final TestBaseAccountTestTypesClient testBaseAccountTestTypes;

    /**
     * Gets the TestBaseAccountTestTypesClient object to access its operations.
     *
     * @return the TestBaseAccountTestTypesClient object.
     */
    public TestBaseAccountTestTypesClient getTestBaseAccountTestTypes() {
        return this.testBaseAccountTestTypes;
    }

    /** The TestBaseAccountTestTypeOperationsClient object to access its operations. */
    private final TestBaseAccountTestTypeOperationsClient testBaseAccountTestTypeOperations;

    /**
     * Gets the TestBaseAccountTestTypeOperationsClient object to access its operations.
     *
     * @return the TestBaseAccountTestTypeOperationsClient object.
     */
    public TestBaseAccountTestTypeOperationsClient getTestBaseAccountTestTypeOperations() {
        return this.testBaseAccountTestTypeOperations;
    }

    /** The PackagesClient object to access its operations. */
    private final PackagesClient packages;

    /**
     * Gets the PackagesClient object to access its operations.
     *
     * @return the PackagesClient object.
     */
    public PackagesClient getPackages() {
        return this.packages;
    }

    /** The PackageOperationsClient object to access its operations. */
    private final PackageOperationsClient packageOperations;

    /**
     * Gets the PackageOperationsClient object to access its operations.
     *
     * @return the PackageOperationsClient object.
     */
    public PackageOperationsClient getPackageOperations() {
        return this.packageOperations;
    }

    /** The TestSummariesClient object to access its operations. */
    private final TestSummariesClient testSummaries;

    /**
     * Gets the TestSummariesClient object to access its operations.
     *
     * @return the TestSummariesClient object.
     */
    public TestSummariesClient getTestSummaries() {
        return this.testSummaries;
    }

    /** The TestSummaryOperationsClient object to access its operations. */
    private final TestSummaryOperationsClient testSummaryOperations;

    /**
     * Gets the TestSummaryOperationsClient object to access its operations.
     *
     * @return the TestSummaryOperationsClient object.
     */
    public TestSummaryOperationsClient getTestSummaryOperations() {
        return this.testSummaryOperations;
    }

    /** The TestResultsClient object to access its operations. */
    private final TestResultsClient testResults;

    /**
     * Gets the TestResultsClient object to access its operations.
     *
     * @return the TestResultsClient object.
     */
    public TestResultsClient getTestResults() {
        return this.testResults;
    }

    /** The TestResultOperationsClient object to access its operations. */
    private final TestResultOperationsClient testResultOperations;

    /**
     * Gets the TestResultOperationsClient object to access its operations.
     *
     * @return the TestResultOperationsClient object.
     */
    public TestResultOperationsClient getTestResultOperations() {
        return this.testResultOperations;
    }

    /** The OSUpdatesClient object to access its operations. */
    private final OSUpdatesClient oSUpdates;

    /**
     * Gets the OSUpdatesClient object to access its operations.
     *
     * @return the OSUpdatesClient object.
     */
    public OSUpdatesClient getOSUpdates() {
        return this.oSUpdates;
    }

    /** The OSUpdateOperationsClient object to access its operations. */
    private final OSUpdateOperationsClient oSUpdateOperations;

    /**
     * Gets the OSUpdateOperationsClient object to access its operations.
     *
     * @return the OSUpdateOperationsClient object.
     */
    public OSUpdateOperationsClient getOSUpdateOperations() {
        return this.oSUpdateOperations;
    }

    /** The FavoriteProcessesClient object to access its operations. */
    private final FavoriteProcessesClient favoriteProcesses;

    /**
     * Gets the FavoriteProcessesClient object to access its operations.
     *
     * @return the FavoriteProcessesClient object.
     */
    public FavoriteProcessesClient getFavoriteProcesses() {
        return this.favoriteProcesses;
    }

    /** The FavoriteProcessClient object to access its operations. */
    private final FavoriteProcessClient favoriteProcess;

    /**
     * Gets the FavoriteProcessClient object to access its operations.
     *
     * @return the FavoriteProcessClient object.
     */
    public FavoriteProcessClient getFavoriteProcess() {
        return this.favoriteProcess;
    }

    /** The AnalysisResultsClient object to access its operations. */
    private final AnalysisResultsClient analysisResults;

    /**
     * Gets the AnalysisResultsClient object to access its operations.
     *
     * @return the AnalysisResultsClient object.
     */
    public AnalysisResultsClient getAnalysisResults() {
        return this.analysisResults;
    }

    /** The AnalysisResultOperationsClient object to access its operations. */
    private final AnalysisResultOperationsClient analysisResultOperations;

    /**
     * Gets the AnalysisResultOperationsClient object to access its operations.
     *
     * @return the AnalysisResultOperationsClient object.
     */
    public AnalysisResultOperationsClient getAnalysisResultOperations() {
        return this.analysisResultOperations;
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
     * Initializes an instance of RestApiForTestBase client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The Azure subscription ID. This is a GUID-formatted string.
     * @param endpoint server parameter.
     */
    RestApiForTestBaseImpl(
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
        this.apiVersion = "2020-12-16-preview";
        this.sKUs = new SKUsClientImpl(this);
        this.testBaseAccounts = new TestBaseAccountsClientImpl(this);
        this.testBaseAccountOperations = new TestBaseAccountOperationsClientImpl(this);
        this.testBaseAccountUsages = new TestBaseAccountUsagesClientImpl(this);
        this.resourceProviders = new ResourceProvidersClientImpl(this);
        this.testBaseAccountAvailableOSs = new TestBaseAccountAvailableOSsClientImpl(this);
        this.testBaseAccountAvailableOS = new TestBaseAccountAvailableOSClientImpl(this);
        this.testBaseAccountFlightingRings = new TestBaseAccountFlightingRingsClientImpl(this);
        this.testBaseAccountFlightingRingOperations = new TestBaseAccountFlightingRingOperationsClientImpl(this);
        this.testBaseAccountTestTypes = new TestBaseAccountTestTypesClientImpl(this);
        this.testBaseAccountTestTypeOperations = new TestBaseAccountTestTypeOperationsClientImpl(this);
        this.packages = new PackagesClientImpl(this);
        this.packageOperations = new PackageOperationsClientImpl(this);
        this.testSummaries = new TestSummariesClientImpl(this);
        this.testSummaryOperations = new TestSummaryOperationsClientImpl(this);
        this.testResults = new TestResultsClientImpl(this);
        this.testResultOperations = new TestResultOperationsClientImpl(this);
        this.oSUpdates = new OSUpdatesClientImpl(this);
        this.oSUpdateOperations = new OSUpdateOperationsClientImpl(this);
        this.favoriteProcesses = new FavoriteProcessesClientImpl(this);
        this.favoriteProcess = new FavoriteProcessClientImpl(this);
        this.analysisResults = new AnalysisResultsClientImpl(this);
        this.analysisResultOperations = new AnalysisResultOperationsClientImpl(this);
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
