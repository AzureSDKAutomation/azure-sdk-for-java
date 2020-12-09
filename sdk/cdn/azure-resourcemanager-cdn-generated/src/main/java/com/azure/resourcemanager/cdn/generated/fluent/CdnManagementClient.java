// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for CdnManagementClient class. */
public interface CdnManagementClient {
    /**
     * Gets Azure Subscription ID.
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
     * Gets the ProfilesClient object to access its operations.
     *
     * @return the ProfilesClient object.
     */
    ProfilesClient getProfiles();

    /**
     * Gets the EndpointsClient object to access its operations.
     *
     * @return the EndpointsClient object.
     */
    EndpointsClient getEndpoints();

    /**
     * Gets the OriginsClient object to access its operations.
     *
     * @return the OriginsClient object.
     */
    OriginsClient getOrigins();

    /**
     * Gets the OriginGroupsClient object to access its operations.
     *
     * @return the OriginGroupsClient object.
     */
    OriginGroupsClient getOriginGroups();

    /**
     * Gets the CustomDomainsClient object to access its operations.
     *
     * @return the CustomDomainsClient object.
     */
    CustomDomainsClient getCustomDomains();

    /**
     * Gets the ResourceProvidersClient object to access its operations.
     *
     * @return the ResourceProvidersClient object.
     */
    ResourceProvidersClient getResourceProviders();

    /**
     * Gets the ResourceUsagesClient object to access its operations.
     *
     * @return the ResourceUsagesClient object.
     */
    ResourceUsagesClient getResourceUsages();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the EdgeNodesClient object to access its operations.
     *
     * @return the EdgeNodesClient object.
     */
    EdgeNodesClient getEdgeNodes();

    /**
     * Gets the PoliciesClient object to access its operations.
     *
     * @return the PoliciesClient object.
     */
    PoliciesClient getPolicies();

    /**
     * Gets the ManagedRuleSetsClient object to access its operations.
     *
     * @return the ManagedRuleSetsClient object.
     */
    ManagedRuleSetsClient getManagedRuleSets();
}
