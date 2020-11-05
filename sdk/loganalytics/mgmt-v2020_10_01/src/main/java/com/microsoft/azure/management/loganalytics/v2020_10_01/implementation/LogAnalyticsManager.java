/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_10_01.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.loganalytics.v2020_10_01.Clusters;
import com.microsoft.azure.management.loganalytics.v2020_10_01.Operations;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure LogAnalytics resource management.
 */
public final class LogAnalyticsManager extends ManagerCore<LogAnalyticsManager, OperationalInsightsManagementClientImpl> {
    private Clusters clusters;
    private Operations operations;
    /**
    * Get a Configurable instance that can be used to create LogAnalyticsManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new LogAnalyticsManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of LogAnalyticsManager that exposes LogAnalytics resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the LogAnalyticsManager
    */
    public static LogAnalyticsManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new LogAnalyticsManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of LogAnalyticsManager that exposes LogAnalytics resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the LogAnalyticsManager
    */
    public static LogAnalyticsManager authenticate(RestClient restClient, String subscriptionId) {
        return new LogAnalyticsManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of LogAnalyticsManager that exposes LogAnalytics management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing LogAnalytics management API entry points that work across subscriptions
        */
        LogAnalyticsManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage Clusters.
     */
    public Clusters clusters() {
        if (this.clusters == null) {
            this.clusters = new ClustersImpl(this);
        }
        return this.clusters;
    }

    /**
     * @return Entry point to manage Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(this);
        }
        return this.operations;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public LogAnalyticsManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return LogAnalyticsManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private LogAnalyticsManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new OperationalInsightsManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
