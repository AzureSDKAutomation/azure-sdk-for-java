// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.msi.generated.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for ManagedServiceIdentityClient class. */
public interface ManagedServiceIdentityClient {
    /**
     * Gets The Id of the Subscription to which the identity belongs.
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
     * Gets the SystemAssignedIdentitiesClient object to access its operations.
     *
     * @return the SystemAssignedIdentitiesClient object.
     */
    SystemAssignedIdentitiesClient getSystemAssignedIdentities();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the UserAssignedIdentitiesClient object to access its operations.
     *
     * @return the UserAssignedIdentitiesClient object.
     */
    UserAssignedIdentitiesClient getUserAssignedIdentities();
}
