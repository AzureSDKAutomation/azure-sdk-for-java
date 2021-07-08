// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.softwareplan.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for SoftwarePlanRP class. */
public interface SoftwarePlanRP {
    /**
     * Gets The ID of the target subscription.
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
     * Gets the SoftwarePlansClient object to access its operations.
     *
     * @return the SoftwarePlansClient object.
     */
    SoftwarePlansClient getSoftwarePlans();

    /**
     * Gets the HybridUseBenefitsClient object to access its operations.
     *
     * @return the HybridUseBenefitsClient object.
     */
    HybridUseBenefitsClient getHybridUseBenefits();

    /**
     * Gets the HybridUseBenefitRevisionsClient object to access its operations.
     *
     * @return the HybridUseBenefitRevisionsClient object.
     */
    HybridUseBenefitRevisionsClient getHybridUseBenefitRevisions();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();
}
