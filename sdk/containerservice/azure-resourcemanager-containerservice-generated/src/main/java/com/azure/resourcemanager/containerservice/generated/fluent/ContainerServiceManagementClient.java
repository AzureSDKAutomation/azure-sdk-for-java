// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for ContainerServiceManagementClient class. */
public interface ContainerServiceManagementClient {
    /**
     * Gets Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms
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
     * Gets the ManagedClustersClient object to access its operations.
     *
     * @return the ManagedClustersClient object.
     */
    ManagedClustersClient getManagedClusters();

    /**
     * Gets the AgentPoolsClient object to access its operations.
     *
     * @return the AgentPoolsClient object.
     */
    AgentPoolsClient getAgentPools();

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     *
     * @return the PrivateEndpointConnectionsClient object.
     */
    PrivateEndpointConnectionsClient getPrivateEndpointConnections();

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     *
     * @return the PrivateLinkResourcesClient object.
     */
    PrivateLinkResourcesClient getPrivateLinkResources();

    /**
     * Gets the ResolvePrivateLinkServiceIdsClient object to access its operations.
     *
     * @return the ResolvePrivateLinkServiceIdsClient object.
     */
    ResolvePrivateLinkServiceIdsClient getResolvePrivateLinkServiceIds();
}
