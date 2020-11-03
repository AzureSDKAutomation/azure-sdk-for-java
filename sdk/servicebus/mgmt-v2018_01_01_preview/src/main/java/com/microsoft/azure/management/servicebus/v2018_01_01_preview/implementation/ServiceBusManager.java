/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2018_01_01_preview.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.servicebus.v2018_01_01_preview.Namespaces;
import com.microsoft.azure.management.servicebus.v2018_01_01_preview.PrivateEndpointConnections;
import com.microsoft.azure.management.servicebus.v2018_01_01_preview.PrivateLinkResources;
import com.microsoft.azure.management.servicebus.v2018_01_01_preview.Operations;
import com.microsoft.azure.management.servicebus.v2018_01_01_preview.DisasterRecoveryConfigs;
import com.microsoft.azure.management.servicebus.v2018_01_01_preview.Queues;
import com.microsoft.azure.management.servicebus.v2018_01_01_preview.Topics;
import com.microsoft.azure.management.servicebus.v2018_01_01_preview.EventHubs;
import com.microsoft.azure.management.servicebus.v2018_01_01_preview.MigrationConfigs;
import com.microsoft.azure.management.servicebus.v2018_01_01_preview.PremiumMessagingRegions;
import com.microsoft.azure.management.servicebus.v2018_01_01_preview.Regions;
import com.microsoft.azure.management.servicebus.v2018_01_01_preview.Subscriptions;
import com.microsoft.azure.management.servicebus.v2018_01_01_preview.Rules;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure ServiceBus resource management.
 */
public final class ServiceBusManager extends ManagerCore<ServiceBusManager, ServiceBusManagementClientImpl> {
    private Namespaces namespaces;
    private PrivateEndpointConnections privateEndpointConnections;
    private PrivateLinkResources privateLinkResources;
    private Operations operations;
    private DisasterRecoveryConfigs disasterRecoveryConfigs;
    private Queues queues;
    private Topics topics;
    private EventHubs eventHubs;
    private MigrationConfigs migrationConfigs;
    private PremiumMessagingRegions premiumMessagingRegions;
    private Regions regions;
    private Subscriptions subscriptions;
    private Rules rules;
    /**
    * Get a Configurable instance that can be used to create ServiceBusManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new ServiceBusManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of ServiceBusManager that exposes ServiceBus resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the ServiceBusManager
    */
    public static ServiceBusManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new ServiceBusManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of ServiceBusManager that exposes ServiceBus resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the ServiceBusManager
    */
    public static ServiceBusManager authenticate(RestClient restClient, String subscriptionId) {
        return new ServiceBusManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of ServiceBusManager that exposes ServiceBus management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing ServiceBus management API entry points that work across subscriptions
        */
        ServiceBusManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage Namespaces.
     */
    public Namespaces namespaces() {
        if (this.namespaces == null) {
            this.namespaces = new NamespacesImpl(this);
        }
        return this.namespaces;
    }

    /**
     * @return Entry point to manage PrivateEndpointConnections.
     */
    public PrivateEndpointConnections privateEndpointConnections() {
        if (this.privateEndpointConnections == null) {
            this.privateEndpointConnections = new PrivateEndpointConnectionsImpl(this);
        }
        return this.privateEndpointConnections;
    }

    /**
     * @return Entry point to manage PrivateLinkResources.
     */
    public PrivateLinkResources privateLinkResources() {
        if (this.privateLinkResources == null) {
            this.privateLinkResources = new PrivateLinkResourcesImpl(this);
        }
        return this.privateLinkResources;
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
     * @return Entry point to manage DisasterRecoveryConfigs.
     */
    public DisasterRecoveryConfigs disasterRecoveryConfigs() {
        if (this.disasterRecoveryConfigs == null) {
            this.disasterRecoveryConfigs = new DisasterRecoveryConfigsImpl(this);
        }
        return this.disasterRecoveryConfigs;
    }

    /**
     * @return Entry point to manage Queues.
     */
    public Queues queues() {
        if (this.queues == null) {
            this.queues = new QueuesImpl(this);
        }
        return this.queues;
    }

    /**
     * @return Entry point to manage Topics.
     */
    public Topics topics() {
        if (this.topics == null) {
            this.topics = new TopicsImpl(this);
        }
        return this.topics;
    }

    /**
     * @return Entry point to manage EventHubs.
     */
    public EventHubs eventHubs() {
        if (this.eventHubs == null) {
            this.eventHubs = new EventHubsImpl(this);
        }
        return this.eventHubs;
    }

    /**
     * @return Entry point to manage MigrationConfigs.
     */
    public MigrationConfigs migrationConfigs() {
        if (this.migrationConfigs == null) {
            this.migrationConfigs = new MigrationConfigsImpl(this);
        }
        return this.migrationConfigs;
    }

    /**
     * @return Entry point to manage PremiumMessagingRegions.
     */
    public PremiumMessagingRegions premiumMessagingRegions() {
        if (this.premiumMessagingRegions == null) {
            this.premiumMessagingRegions = new PremiumMessagingRegionsImpl(this);
        }
        return this.premiumMessagingRegions;
    }

    /**
     * @return Entry point to manage Regions.
     */
    public Regions regions() {
        if (this.regions == null) {
            this.regions = new RegionsImpl(this);
        }
        return this.regions;
    }

    /**
     * @return Entry point to manage Subscriptions.
     */
    public Subscriptions subscriptions() {
        if (this.subscriptions == null) {
            this.subscriptions = new SubscriptionsImpl(this);
        }
        return this.subscriptions;
    }

    /**
     * @return Entry point to manage Rules.
     */
    public Rules rules() {
        if (this.rules == null) {
            this.rules = new RulesImpl(this);
        }
        return this.rules;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public ServiceBusManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return ServiceBusManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private ServiceBusManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new ServiceBusManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
