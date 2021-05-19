// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.implementation;

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
import com.azure.resourcemanager.desktopvirtualization.fluent.ApplicationGroupsClient;
import com.azure.resourcemanager.desktopvirtualization.fluent.ApplicationsClient;
import com.azure.resourcemanager.desktopvirtualization.fluent.DesktopVirtualizationApiClient;
import com.azure.resourcemanager.desktopvirtualization.fluent.DesktopsClient;
import com.azure.resourcemanager.desktopvirtualization.fluent.HostPoolsClient;
import com.azure.resourcemanager.desktopvirtualization.fluent.MsixImagesClient;
import com.azure.resourcemanager.desktopvirtualization.fluent.MsixPackagesClient;
import com.azure.resourcemanager.desktopvirtualization.fluent.OperationsClient;
import com.azure.resourcemanager.desktopvirtualization.fluent.PrivateEndpointConnectionsClient;
import com.azure.resourcemanager.desktopvirtualization.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.desktopvirtualization.fluent.ScalingPlansClient;
import com.azure.resourcemanager.desktopvirtualization.fluent.SessionHostsClient;
import com.azure.resourcemanager.desktopvirtualization.fluent.StartMenuItemsClient;
import com.azure.resourcemanager.desktopvirtualization.fluent.UserSessionsClient;
import com.azure.resourcemanager.desktopvirtualization.fluent.WorkspacesClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the DesktopVirtualizationApiClientImpl type. */
@ServiceClient(builder = DesktopVirtualizationApiClientBuilder.class)
public final class DesktopVirtualizationApiClientImpl implements DesktopVirtualizationApiClient {
    private final ClientLogger logger = new ClientLogger(DesktopVirtualizationApiClientImpl.class);

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

    /** The WorkspacesClient object to access its operations. */
    private final WorkspacesClient workspaces;

    /**
     * Gets the WorkspacesClient object to access its operations.
     *
     * @return the WorkspacesClient object.
     */
    public WorkspacesClient getWorkspaces() {
        return this.workspaces;
    }

    /** The ScalingPlansClient object to access its operations. */
    private final ScalingPlansClient scalingPlans;

    /**
     * Gets the ScalingPlansClient object to access its operations.
     *
     * @return the ScalingPlansClient object.
     */
    public ScalingPlansClient getScalingPlans() {
        return this.scalingPlans;
    }

    /** The ApplicationGroupsClient object to access its operations. */
    private final ApplicationGroupsClient applicationGroups;

    /**
     * Gets the ApplicationGroupsClient object to access its operations.
     *
     * @return the ApplicationGroupsClient object.
     */
    public ApplicationGroupsClient getApplicationGroups() {
        return this.applicationGroups;
    }

    /** The StartMenuItemsClient object to access its operations. */
    private final StartMenuItemsClient startMenuItems;

    /**
     * Gets the StartMenuItemsClient object to access its operations.
     *
     * @return the StartMenuItemsClient object.
     */
    public StartMenuItemsClient getStartMenuItems() {
        return this.startMenuItems;
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

    /** The DesktopsClient object to access its operations. */
    private final DesktopsClient desktops;

    /**
     * Gets the DesktopsClient object to access its operations.
     *
     * @return the DesktopsClient object.
     */
    public DesktopsClient getDesktops() {
        return this.desktops;
    }

    /** The HostPoolsClient object to access its operations. */
    private final HostPoolsClient hostPools;

    /**
     * Gets the HostPoolsClient object to access its operations.
     *
     * @return the HostPoolsClient object.
     */
    public HostPoolsClient getHostPools() {
        return this.hostPools;
    }

    /** The UserSessionsClient object to access its operations. */
    private final UserSessionsClient userSessions;

    /**
     * Gets the UserSessionsClient object to access its operations.
     *
     * @return the UserSessionsClient object.
     */
    public UserSessionsClient getUserSessions() {
        return this.userSessions;
    }

    /** The SessionHostsClient object to access its operations. */
    private final SessionHostsClient sessionHosts;

    /**
     * Gets the SessionHostsClient object to access its operations.
     *
     * @return the SessionHostsClient object.
     */
    public SessionHostsClient getSessionHosts() {
        return this.sessionHosts;
    }

    /** The MsixPackagesClient object to access its operations. */
    private final MsixPackagesClient msixPackages;

    /**
     * Gets the MsixPackagesClient object to access its operations.
     *
     * @return the MsixPackagesClient object.
     */
    public MsixPackagesClient getMsixPackages() {
        return this.msixPackages;
    }

    /** The MsixImagesClient object to access its operations. */
    private final MsixImagesClient msixImages;

    /**
     * Gets the MsixImagesClient object to access its operations.
     *
     * @return the MsixImagesClient object.
     */
    public MsixImagesClient getMsixImages() {
        return this.msixImages;
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

    /**
     * Initializes an instance of DesktopVirtualizationApiClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The ID of the target subscription.
     * @param endpoint server parameter.
     */
    DesktopVirtualizationApiClientImpl(
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
        this.apiVersion = "2021-04-01-preview";
        this.operations = new OperationsClientImpl(this);
        this.workspaces = new WorkspacesClientImpl(this);
        this.scalingPlans = new ScalingPlansClientImpl(this);
        this.applicationGroups = new ApplicationGroupsClientImpl(this);
        this.startMenuItems = new StartMenuItemsClientImpl(this);
        this.applications = new ApplicationsClientImpl(this);
        this.desktops = new DesktopsClientImpl(this);
        this.hostPools = new HostPoolsClientImpl(this);
        this.userSessions = new UserSessionsClientImpl(this);
        this.sessionHosts = new SessionHostsClientImpl(this);
        this.msixPackages = new MsixPackagesClientImpl(this);
        this.msixImages = new MsixImagesClientImpl(this);
        this.privateEndpointConnections = new PrivateEndpointConnectionsClientImpl(this);
        this.privateLinkResources = new PrivateLinkResourcesClientImpl(this);
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
