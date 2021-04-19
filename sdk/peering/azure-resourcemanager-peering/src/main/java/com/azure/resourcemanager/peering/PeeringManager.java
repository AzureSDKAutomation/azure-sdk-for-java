// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering;

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
import com.azure.resourcemanager.peering.fluent.PeeringManagementClient;
import com.azure.resourcemanager.peering.implementation.LegacyPeeringsImpl;
import com.azure.resourcemanager.peering.implementation.OperationsImpl;
import com.azure.resourcemanager.peering.implementation.PeerAsnsImpl;
import com.azure.resourcemanager.peering.implementation.PeeringLocationsImpl;
import com.azure.resourcemanager.peering.implementation.PeeringManagementClientBuilder;
import com.azure.resourcemanager.peering.implementation.PeeringServiceLocationsImpl;
import com.azure.resourcemanager.peering.implementation.PeeringServicePrefixesImpl;
import com.azure.resourcemanager.peering.implementation.PeeringServiceProvidersImpl;
import com.azure.resourcemanager.peering.implementation.PeeringServicesImpl;
import com.azure.resourcemanager.peering.implementation.PeeringsImpl;
import com.azure.resourcemanager.peering.implementation.PrefixesImpl;
import com.azure.resourcemanager.peering.implementation.ResourceProvidersImpl;
import com.azure.resourcemanager.peering.models.LegacyPeerings;
import com.azure.resourcemanager.peering.models.Operations;
import com.azure.resourcemanager.peering.models.PeerAsns;
import com.azure.resourcemanager.peering.models.PeeringLocations;
import com.azure.resourcemanager.peering.models.PeeringServiceLocations;
import com.azure.resourcemanager.peering.models.PeeringServicePrefixes;
import com.azure.resourcemanager.peering.models.PeeringServiceProviders;
import com.azure.resourcemanager.peering.models.PeeringServices;
import com.azure.resourcemanager.peering.models.Peerings;
import com.azure.resourcemanager.peering.models.Prefixes;
import com.azure.resourcemanager.peering.models.ResourceProviders;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Entry point to PeeringManager. Peering Client. */
public final class PeeringManager {
    private ResourceProviders resourceProviders;

    private LegacyPeerings legacyPeerings;

    private Operations operations;

    private PeerAsns peerAsns;

    private PeeringLocations peeringLocations;

    private Peerings peerings;

    private PeeringServiceLocations peeringServiceLocations;

    private PeeringServicePrefixes peeringServicePrefixes;

    private Prefixes prefixes;

    private PeeringServiceProviders peeringServiceProviders;

    private PeeringServices peeringServices;

    private final PeeringManagementClient clientObject;

    private PeeringManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new PeeringManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of Peering service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the Peering service API instance.
     */
    public static PeeringManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create PeeringManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new PeeringManager.Configurable();
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
         * Creates an instance of Peering service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the Peering service API instance.
         */
        public PeeringManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.peering")
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
            return new PeeringManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of ResourceProviders. */
    public ResourceProviders resourceProviders() {
        if (this.resourceProviders == null) {
            this.resourceProviders = new ResourceProvidersImpl(clientObject.getResourceProviders(), this);
        }
        return resourceProviders;
    }

    /** @return Resource collection API of LegacyPeerings. */
    public LegacyPeerings legacyPeerings() {
        if (this.legacyPeerings == null) {
            this.legacyPeerings = new LegacyPeeringsImpl(clientObject.getLegacyPeerings(), this);
        }
        return legacyPeerings;
    }

    /** @return Resource collection API of Operations. */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /** @return Resource collection API of PeerAsns. */
    public PeerAsns peerAsns() {
        if (this.peerAsns == null) {
            this.peerAsns = new PeerAsnsImpl(clientObject.getPeerAsns(), this);
        }
        return peerAsns;
    }

    /** @return Resource collection API of PeeringLocations. */
    public PeeringLocations peeringLocations() {
        if (this.peeringLocations == null) {
            this.peeringLocations = new PeeringLocationsImpl(clientObject.getPeeringLocations(), this);
        }
        return peeringLocations;
    }

    /** @return Resource collection API of Peerings. */
    public Peerings peerings() {
        if (this.peerings == null) {
            this.peerings = new PeeringsImpl(clientObject.getPeerings(), this);
        }
        return peerings;
    }

    /** @return Resource collection API of PeeringServiceLocations. */
    public PeeringServiceLocations peeringServiceLocations() {
        if (this.peeringServiceLocations == null) {
            this.peeringServiceLocations =
                new PeeringServiceLocationsImpl(clientObject.getPeeringServiceLocations(), this);
        }
        return peeringServiceLocations;
    }

    /** @return Resource collection API of PeeringServicePrefixes. */
    public PeeringServicePrefixes peeringServicePrefixes() {
        if (this.peeringServicePrefixes == null) {
            this.peeringServicePrefixes =
                new PeeringServicePrefixesImpl(clientObject.getPeeringServicePrefixes(), this);
        }
        return peeringServicePrefixes;
    }

    /** @return Resource collection API of Prefixes. */
    public Prefixes prefixes() {
        if (this.prefixes == null) {
            this.prefixes = new PrefixesImpl(clientObject.getPrefixes(), this);
        }
        return prefixes;
    }

    /** @return Resource collection API of PeeringServiceProviders. */
    public PeeringServiceProviders peeringServiceProviders() {
        if (this.peeringServiceProviders == null) {
            this.peeringServiceProviders =
                new PeeringServiceProvidersImpl(clientObject.getPeeringServiceProviders(), this);
        }
        return peeringServiceProviders;
    }

    /** @return Resource collection API of PeeringServices. */
    public PeeringServices peeringServices() {
        if (this.peeringServices == null) {
            this.peeringServices = new PeeringServicesImpl(clientObject.getPeeringServices(), this);
        }
        return peeringServices;
    }

    /**
     * @return Wrapped service client PeeringManagementClient providing direct access to the underlying auto-generated
     *     API implementation, based on Azure REST API.
     */
    public PeeringManagementClient serviceClient() {
        return this.clientObject;
    }
}
