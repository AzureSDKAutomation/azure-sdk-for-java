// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.BearerTokenAuthenticationPolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicebus.generated.fluent.ServiceBusManagementClient;
import com.azure.resourcemanager.servicebus.generated.implementation.DisasterRecoveryConfigsImpl;
import com.azure.resourcemanager.servicebus.generated.implementation.EventHubsImpl;
import com.azure.resourcemanager.servicebus.generated.implementation.MigrationConfigsImpl;
import com.azure.resourcemanager.servicebus.generated.implementation.NamespacesImpl;
import com.azure.resourcemanager.servicebus.generated.implementation.OperationsImpl;
import com.azure.resourcemanager.servicebus.generated.implementation.PremiumMessagingRegionsImpl;
import com.azure.resourcemanager.servicebus.generated.implementation.PrivateEndpointConnectionsImpl;
import com.azure.resourcemanager.servicebus.generated.implementation.PrivateLinkResourcesImpl;
import com.azure.resourcemanager.servicebus.generated.implementation.QueuesImpl;
import com.azure.resourcemanager.servicebus.generated.implementation.RegionsImpl;
import com.azure.resourcemanager.servicebus.generated.implementation.RulesImpl;
import com.azure.resourcemanager.servicebus.generated.implementation.ServiceBusManagementClientBuilder;
import com.azure.resourcemanager.servicebus.generated.implementation.SubscriptionsImpl;
import com.azure.resourcemanager.servicebus.generated.implementation.TopicsImpl;
import com.azure.resourcemanager.servicebus.generated.models.DisasterRecoveryConfigs;
import com.azure.resourcemanager.servicebus.generated.models.EventHubs;
import com.azure.resourcemanager.servicebus.generated.models.MigrationConfigs;
import com.azure.resourcemanager.servicebus.generated.models.Namespaces;
import com.azure.resourcemanager.servicebus.generated.models.Operations;
import com.azure.resourcemanager.servicebus.generated.models.PremiumMessagingRegions;
import com.azure.resourcemanager.servicebus.generated.models.PrivateEndpointConnections;
import com.azure.resourcemanager.servicebus.generated.models.PrivateLinkResources;
import com.azure.resourcemanager.servicebus.generated.models.Queues;
import com.azure.resourcemanager.servicebus.generated.models.Regions;
import com.azure.resourcemanager.servicebus.generated.models.Rules;
import com.azure.resourcemanager.servicebus.generated.models.Subscriptions;
import com.azure.resourcemanager.servicebus.generated.models.Topics;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Entry point to ServiceBusManager. Azure Service Bus client for managing Namespace, IPFilter Rules,
 * VirtualNetworkRules and Zone Redundant.
 */
public final class ServiceBusManager {
    private Namespaces namespaces;

    private PrivateEndpointConnections privateEndpointConnections;

    private PrivateLinkResources privateLinkResources;

    private DisasterRecoveryConfigs disasterRecoveryConfigs;

    private Queues queues;

    private Topics topics;

    private EventHubs eventHubs;

    private MigrationConfigs migrationConfigs;

    private PremiumMessagingRegions premiumMessagingRegions;

    private Regions regions;

    private Subscriptions subscriptions;

    private Rules rules;

    private Operations operations;

    private final ServiceBusManagementClient clientObject;

    private ServiceBusManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new ServiceBusManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of ServiceBus service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the ServiceBus service API instance.
     */
    public static ServiceBusManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create ServiceBusManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new ServiceBusManager.Configurable();
    }

    /** The Configurable allowing configurations to be set. */
    public static final class Configurable {
        private final ClientLogger logger = new ClientLogger(Configurable.class);

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private RetryPolicy retryPolicy;
        private Duration defaultPollInterval;

        private Configurable() {
        }

        /**
         * Sets the http client.
         *
         * @param httpClient the HTTP client.
         * @return the configurable object itself.
         */
        public Configurable withHttpClient(HttpClient httpClient) {
            this.httpClient = Objects.requireNonNull(httpClient, "'httpClient' cannot be null.");
            return this;
        }

        /**
         * Sets the logging options to the HTTP pipeline.
         *
         * @param httpLogOptions the HTTP log options.
         * @return the configurable object itself.
         */
        public Configurable withLogOptions(HttpLogOptions httpLogOptions) {
            this.httpLogOptions = Objects.requireNonNull(httpLogOptions, "'httpLogOptions' cannot be null.");
            return this;
        }

        /**
         * Adds the pipeline policy to the HTTP pipeline.
         *
         * @param policy the HTTP pipeline policy.
         * @return the configurable object itself.
         */
        public Configurable withPolicy(HttpPipelinePolicy policy) {
            this.policies.add(Objects.requireNonNull(policy, "'policy' cannot be null."));
            return this;
        }

        /**
         * Sets the retry policy to the HTTP pipeline.
         *
         * @param retryPolicy the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryPolicy(RetryPolicy retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy, "'retryPolicy' cannot be null.");
            return this;
        }

        /**
         * Sets the default poll interval, used when service does not provide "Retry-After" header.
         *
         * @param defaultPollInterval the default poll interval.
         * @return the configurable object itself.
         */
        public Configurable withDefaultPollInterval(Duration defaultPollInterval) {
            this.defaultPollInterval = Objects.requireNonNull(defaultPollInterval, "'retryPolicy' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw logger.logExceptionAsError(new IllegalArgumentException("'httpPipeline' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of ServiceBus service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the ServiceBus service API instance.
         */
        public ServiceBusManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.servicebus.generated")
                .append("/")
                .append("1.0.0-beta.1");
            if (!Configuration.getGlobalConfiguration().get("AZURE_TELEMETRY_DISABLED", false)) {
                userAgentBuilder
                    .append(" (")
                    .append(Configuration.getGlobalConfiguration().get("java.version"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.name"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.version"))
                    .append("; auto-generated)");
            } else {
                userAgentBuilder.append(" (auto-generated)");
            }

            if (retryPolicy == null) {
                retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies.add(new UserAgentPolicy(userAgentBuilder.toString()));
            policies.add(new RequestIdPolicy());
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies
                .add(
                    new BearerTokenAuthenticationPolicy(
                        credential, profile.getEnvironment().getManagementEndpoint() + "/.default"));
            policies.addAll(this.policies);
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                    .httpClient(httpClient)
                    .policies(policies.toArray(new HttpPipelinePolicy[0]))
                    .build();
            return new ServiceBusManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of Namespaces. */
    public Namespaces namespaces() {
        if (this.namespaces == null) {
            this.namespaces = new NamespacesImpl(clientObject.getNamespaces(), this);
        }
        return namespaces;
    }

    /** @return Resource collection API of PrivateEndpointConnections. */
    public PrivateEndpointConnections privateEndpointConnections() {
        if (this.privateEndpointConnections == null) {
            this.privateEndpointConnections =
                new PrivateEndpointConnectionsImpl(clientObject.getPrivateEndpointConnections(), this);
        }
        return privateEndpointConnections;
    }

    /** @return Resource collection API of PrivateLinkResources. */
    public PrivateLinkResources privateLinkResources() {
        if (this.privateLinkResources == null) {
            this.privateLinkResources = new PrivateLinkResourcesImpl(clientObject.getPrivateLinkResources(), this);
        }
        return privateLinkResources;
    }

    /** @return Resource collection API of DisasterRecoveryConfigs. */
    public DisasterRecoveryConfigs disasterRecoveryConfigs() {
        if (this.disasterRecoveryConfigs == null) {
            this.disasterRecoveryConfigs =
                new DisasterRecoveryConfigsImpl(clientObject.getDisasterRecoveryConfigs(), this);
        }
        return disasterRecoveryConfigs;
    }

    /** @return Resource collection API of Queues. */
    public Queues queues() {
        if (this.queues == null) {
            this.queues = new QueuesImpl(clientObject.getQueues(), this);
        }
        return queues;
    }

    /** @return Resource collection API of Topics. */
    public Topics topics() {
        if (this.topics == null) {
            this.topics = new TopicsImpl(clientObject.getTopics(), this);
        }
        return topics;
    }

    /** @return Resource collection API of EventHubs. */
    public EventHubs eventHubs() {
        if (this.eventHubs == null) {
            this.eventHubs = new EventHubsImpl(clientObject.getEventHubs(), this);
        }
        return eventHubs;
    }

    /** @return Resource collection API of MigrationConfigs. */
    public MigrationConfigs migrationConfigs() {
        if (this.migrationConfigs == null) {
            this.migrationConfigs = new MigrationConfigsImpl(clientObject.getMigrationConfigs(), this);
        }
        return migrationConfigs;
    }

    /** @return Resource collection API of PremiumMessagingRegions. */
    public PremiumMessagingRegions premiumMessagingRegions() {
        if (this.premiumMessagingRegions == null) {
            this.premiumMessagingRegions =
                new PremiumMessagingRegionsImpl(clientObject.getPremiumMessagingRegions(), this);
        }
        return premiumMessagingRegions;
    }

    /** @return Resource collection API of Regions. */
    public Regions regions() {
        if (this.regions == null) {
            this.regions = new RegionsImpl(clientObject.getRegions(), this);
        }
        return regions;
    }

    /** @return Resource collection API of Subscriptions. */
    public Subscriptions subscriptions() {
        if (this.subscriptions == null) {
            this.subscriptions = new SubscriptionsImpl(clientObject.getSubscriptions(), this);
        }
        return subscriptions;
    }

    /** @return Resource collection API of Rules. */
    public Rules rules() {
        if (this.rules == null) {
            this.rules = new RulesImpl(clientObject.getRules(), this);
        }
        return rules;
    }

    /** @return Resource collection API of Operations. */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /**
     * @return Wrapped service client ServiceBusManagementClient providing direct access to the underlying
     *     auto-generated API implementation, based on Azure REST API.
     */
    public ServiceBusManagementClient serviceClient() {
        return this.clientObject;
    }
}
