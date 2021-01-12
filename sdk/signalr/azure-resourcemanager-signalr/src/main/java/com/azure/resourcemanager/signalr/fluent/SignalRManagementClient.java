// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for SignalRManagementClient class. */
public interface SignalRManagementClient {
    /**
     * Gets Gets subscription Id which uniquely identify the Microsoft Azure subscription. The subscription ID forms
     * part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the SignalRsClient object to access its operations.
     *
     * @return the SignalRsClient object.
     */
    SignalRsClient getSignalRs();

    /**
     * Gets the UsagesClient object to access its operations.
     *
     * @return the UsagesClient object.
     */
    UsagesClient getUsages();

    /**
     * Gets the SignalRPrivateEndpointConnectionsClient object to access its operations.
     *
     * @return the SignalRPrivateEndpointConnectionsClient object.
     */
    SignalRPrivateEndpointConnectionsClient getSignalRPrivateEndpointConnections();

    /**
     * Gets the SignalRPrivateLinkResourcesClient object to access its operations.
     *
     * @return the SignalRPrivateLinkResourcesClient object.
     */
    SignalRPrivateLinkResourcesClient getSignalRPrivateLinkResources();
}