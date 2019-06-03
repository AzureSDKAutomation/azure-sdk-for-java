/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2018_01_01.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.monitor.v2018_01_01.MetricDefinitions;
import com.microsoft.azure.management.monitor.v2018_01_01.Metrics;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Monitor resource management.
 */
public final class MonitorManager extends ManagerCore<MonitorManager, MonitorManagementClientImpl> {
    private MetricDefinitions metricDefinitions;
    private Metrics metrics;
    /**
    * Get a Configurable instance that can be used to create MonitorManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new MonitorManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of MonitorManager that exposes Monitor resource management API entry points.
    *
    * @param credentials the credentials to use
    * @return the MonitorManager
    */
    public static MonitorManager authenticate(AzureTokenCredentials credentials) {
        return new MonitorManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build());
    }
    /**
    * Creates an instance of MonitorManager that exposes Monitor resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @return the MonitorManager
    */
    public static MonitorManager authenticate(RestClient restClient) {
        return new MonitorManager(restClient);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of MonitorManager that exposes Monitor management API entry points.
        *
        * @param credentials the credentials to use
        * @return the interface exposing Monitor management API entry points that work across subscriptions
        */
        MonitorManager authenticate(AzureTokenCredentials credentials);
    }

    /**
     * @return Entry point to manage MetricDefinitions.
     */
    public MetricDefinitions metricDefinitions() {
        if (this.metricDefinitions == null) {
            this.metricDefinitions = new MetricDefinitionsImpl(this);
        }
        return this.metricDefinitions;
    }

    /**
     * @return Entry point to manage Metrics.
     */
    public Metrics metrics() {
        if (this.metrics == null) {
            this.metrics = new MetricsImpl(this);
        }
        return this.metrics;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public MonitorManager authenticate(AzureTokenCredentials credentials) {
           return MonitorManager.authenticate(buildRestClient(credentials));
        }
     }
    private MonitorManager(RestClient restClient) {
        super(
            restClient,
            null,
            new MonitorManagementClientImpl(restClient));
    }
}
