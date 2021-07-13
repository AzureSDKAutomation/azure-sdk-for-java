// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.http.policy.ArmChallengeAuthenticationPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mediaservices.fluent.AzureMediaServices;
import com.azure.resourcemanager.mediaservices.implementation.AccountFiltersImpl;
import com.azure.resourcemanager.mediaservices.implementation.AssetFiltersImpl;
import com.azure.resourcemanager.mediaservices.implementation.AssetsImpl;
import com.azure.resourcemanager.mediaservices.implementation.AzureMediaServicesBuilder;
import com.azure.resourcemanager.mediaservices.implementation.ContentKeyPoliciesImpl;
import com.azure.resourcemanager.mediaservices.implementation.JobsImpl;
import com.azure.resourcemanager.mediaservices.implementation.LiveEventsImpl;
import com.azure.resourcemanager.mediaservices.implementation.LiveOutputsImpl;
import com.azure.resourcemanager.mediaservices.implementation.LocationsImpl;
import com.azure.resourcemanager.mediaservices.implementation.MediaservicesImpl;
import com.azure.resourcemanager.mediaservices.implementation.OperationsImpl;
import com.azure.resourcemanager.mediaservices.implementation.PrivateEndpointConnectionsImpl;
import com.azure.resourcemanager.mediaservices.implementation.PrivateLinkResourcesImpl;
import com.azure.resourcemanager.mediaservices.implementation.StreamingEndpointsImpl;
import com.azure.resourcemanager.mediaservices.implementation.StreamingLocatorsImpl;
import com.azure.resourcemanager.mediaservices.implementation.StreamingPoliciesImpl;
import com.azure.resourcemanager.mediaservices.implementation.TransformsImpl;
import com.azure.resourcemanager.mediaservices.models.AccountFilters;
import com.azure.resourcemanager.mediaservices.models.AssetFilters;
import com.azure.resourcemanager.mediaservices.models.Assets;
import com.azure.resourcemanager.mediaservices.models.ContentKeyPolicies;
import com.azure.resourcemanager.mediaservices.models.Jobs;
import com.azure.resourcemanager.mediaservices.models.LiveEvents;
import com.azure.resourcemanager.mediaservices.models.LiveOutputs;
import com.azure.resourcemanager.mediaservices.models.Locations;
import com.azure.resourcemanager.mediaservices.models.Mediaservices;
import com.azure.resourcemanager.mediaservices.models.Operations;
import com.azure.resourcemanager.mediaservices.models.PrivateEndpointConnections;
import com.azure.resourcemanager.mediaservices.models.PrivateLinkResources;
import com.azure.resourcemanager.mediaservices.models.StreamingEndpoints;
import com.azure.resourcemanager.mediaservices.models.StreamingLocators;
import com.azure.resourcemanager.mediaservices.models.StreamingPolicies;
import com.azure.resourcemanager.mediaservices.models.Transforms;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Entry point to MediaServicesManager. This Swagger was generated by the API Framework. */
public final class MediaServicesManager {
    private Operations operations;

    private Mediaservices mediaservices;

    private PrivateLinkResources privateLinkResources;

    private PrivateEndpointConnections privateEndpointConnections;

    private Locations locations;

    private AccountFilters accountFilters;

    private Assets assets;

    private AssetFilters assetFilters;

    private ContentKeyPolicies contentKeyPolicies;

    private Transforms transforms;

    private Jobs jobs;

    private StreamingPolicies streamingPolicies;

    private StreamingLocators streamingLocators;

    private LiveEvents liveEvents;

    private LiveOutputs liveOutputs;

    private StreamingEndpoints streamingEndpoints;

    private final AzureMediaServices clientObject;

    private MediaServicesManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new AzureMediaServicesBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of MediaServices service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the MediaServices service API instance.
     */
    public static MediaServicesManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create MediaServicesManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new MediaServicesManager.Configurable();
    }

    /** The Configurable allowing configurations to be set. */
    public static final class Configurable {
        private final ClientLogger logger = new ClientLogger(Configurable.class);

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private final List<String> scopes = new ArrayList<>();
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
         * Adds the scope to permission sets.
         *
         * @param scope the scope.
         * @return the configurable object itself.
         */
        public Configurable withScope(String scope) {
            this.scopes.add(Objects.requireNonNull(scope, "'scope' cannot be null."));
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
         * Creates an instance of MediaServices service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the MediaServices service API instance.
         */
        public MediaServicesManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.mediaservices")
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

            if (scopes.isEmpty()) {
                scopes.add(profile.getEnvironment().getManagementEndpoint() + "/.default");
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
            policies.add(new ArmChallengeAuthenticationPolicy(credential, scopes.toArray(new String[0])));
            policies.addAll(this.policies);
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                    .httpClient(httpClient)
                    .policies(policies.toArray(new HttpPipelinePolicy[0]))
                    .build();
            return new MediaServicesManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of Operations. */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /** @return Resource collection API of Mediaservices. */
    public Mediaservices mediaservices() {
        if (this.mediaservices == null) {
            this.mediaservices = new MediaservicesImpl(clientObject.getMediaservices(), this);
        }
        return mediaservices;
    }

    /** @return Resource collection API of PrivateLinkResources. */
    public PrivateLinkResources privateLinkResources() {
        if (this.privateLinkResources == null) {
            this.privateLinkResources = new PrivateLinkResourcesImpl(clientObject.getPrivateLinkResources(), this);
        }
        return privateLinkResources;
    }

    /** @return Resource collection API of PrivateEndpointConnections. */
    public PrivateEndpointConnections privateEndpointConnections() {
        if (this.privateEndpointConnections == null) {
            this.privateEndpointConnections =
                new PrivateEndpointConnectionsImpl(clientObject.getPrivateEndpointConnections(), this);
        }
        return privateEndpointConnections;
    }

    /** @return Resource collection API of Locations. */
    public Locations locations() {
        if (this.locations == null) {
            this.locations = new LocationsImpl(clientObject.getLocations(), this);
        }
        return locations;
    }

    /** @return Resource collection API of AccountFilters. */
    public AccountFilters accountFilters() {
        if (this.accountFilters == null) {
            this.accountFilters = new AccountFiltersImpl(clientObject.getAccountFilters(), this);
        }
        return accountFilters;
    }

    /** @return Resource collection API of Assets. */
    public Assets assets() {
        if (this.assets == null) {
            this.assets = new AssetsImpl(clientObject.getAssets(), this);
        }
        return assets;
    }

    /** @return Resource collection API of AssetFilters. */
    public AssetFilters assetFilters() {
        if (this.assetFilters == null) {
            this.assetFilters = new AssetFiltersImpl(clientObject.getAssetFilters(), this);
        }
        return assetFilters;
    }

    /** @return Resource collection API of ContentKeyPolicies. */
    public ContentKeyPolicies contentKeyPolicies() {
        if (this.contentKeyPolicies == null) {
            this.contentKeyPolicies = new ContentKeyPoliciesImpl(clientObject.getContentKeyPolicies(), this);
        }
        return contentKeyPolicies;
    }

    /** @return Resource collection API of Transforms. */
    public Transforms transforms() {
        if (this.transforms == null) {
            this.transforms = new TransformsImpl(clientObject.getTransforms(), this);
        }
        return transforms;
    }

    /** @return Resource collection API of Jobs. */
    public Jobs jobs() {
        if (this.jobs == null) {
            this.jobs = new JobsImpl(clientObject.getJobs(), this);
        }
        return jobs;
    }

    /** @return Resource collection API of StreamingPolicies. */
    public StreamingPolicies streamingPolicies() {
        if (this.streamingPolicies == null) {
            this.streamingPolicies = new StreamingPoliciesImpl(clientObject.getStreamingPolicies(), this);
        }
        return streamingPolicies;
    }

    /** @return Resource collection API of StreamingLocators. */
    public StreamingLocators streamingLocators() {
        if (this.streamingLocators == null) {
            this.streamingLocators = new StreamingLocatorsImpl(clientObject.getStreamingLocators(), this);
        }
        return streamingLocators;
    }

    /** @return Resource collection API of LiveEvents. */
    public LiveEvents liveEvents() {
        if (this.liveEvents == null) {
            this.liveEvents = new LiveEventsImpl(clientObject.getLiveEvents(), this);
        }
        return liveEvents;
    }

    /** @return Resource collection API of LiveOutputs. */
    public LiveOutputs liveOutputs() {
        if (this.liveOutputs == null) {
            this.liveOutputs = new LiveOutputsImpl(clientObject.getLiveOutputs(), this);
        }
        return liveOutputs;
    }

    /** @return Resource collection API of StreamingEndpoints. */
    public StreamingEndpoints streamingEndpoints() {
        if (this.streamingEndpoints == null) {
            this.streamingEndpoints = new StreamingEndpointsImpl(clientObject.getStreamingEndpoints(), this);
        }
        return streamingEndpoints;
    }

    /**
     * @return Wrapped service client AzureMediaServices providing direct access to the underlying auto-generated API
     *     implementation, based on Azure REST API.
     */
    public AzureMediaServices serviceClient() {
        return this.clientObject;
    }
}
