// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer;

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
import com.azure.resourcemanager.videoanalyzer.fluent.VideoAnalyzerManagementClient;
import com.azure.resourcemanager.videoanalyzer.implementation.AccessPoliciesImpl;
import com.azure.resourcemanager.videoanalyzer.implementation.EdgeModulesImpl;
import com.azure.resourcemanager.videoanalyzer.implementation.LocationsImpl;
import com.azure.resourcemanager.videoanalyzer.implementation.OperationsImpl;
import com.azure.resourcemanager.videoanalyzer.implementation.VideoAnalyzerManagementClientBuilder;
import com.azure.resourcemanager.videoanalyzer.implementation.VideoAnalyzersImpl;
import com.azure.resourcemanager.videoanalyzer.implementation.VideosImpl;
import com.azure.resourcemanager.videoanalyzer.models.AccessPolicies;
import com.azure.resourcemanager.videoanalyzer.models.EdgeModules;
import com.azure.resourcemanager.videoanalyzer.models.Locations;
import com.azure.resourcemanager.videoanalyzer.models.Operations;
import com.azure.resourcemanager.videoanalyzer.models.VideoAnalyzers;
import com.azure.resourcemanager.videoanalyzer.models.Videos;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Entry point to VideoAnalyzerManager. Azure Video Analyzer provides a platform for you to build intelligent video
 * applications that span the edge and the cloud.
 */
public final class VideoAnalyzerManager {
    private Operations operations;

    private VideoAnalyzers videoAnalyzers;

    private Locations locations;

    private EdgeModules edgeModules;

    private Videos videos;

    private AccessPolicies accessPolicies;

    private final VideoAnalyzerManagementClient clientObject;

    private VideoAnalyzerManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new VideoAnalyzerManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of VideoAnalyzer service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the VideoAnalyzer service API instance.
     */
    public static VideoAnalyzerManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create VideoAnalyzerManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new VideoAnalyzerManager.Configurable();
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
         * Creates an instance of VideoAnalyzer service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the VideoAnalyzer service API instance.
         */
        public VideoAnalyzerManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.videoanalyzer")
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
            return new VideoAnalyzerManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of Operations. */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /** @return Resource collection API of VideoAnalyzers. */
    public VideoAnalyzers videoAnalyzers() {
        if (this.videoAnalyzers == null) {
            this.videoAnalyzers = new VideoAnalyzersImpl(clientObject.getVideoAnalyzers(), this);
        }
        return videoAnalyzers;
    }

    /** @return Resource collection API of Locations. */
    public Locations locations() {
        if (this.locations == null) {
            this.locations = new LocationsImpl(clientObject.getLocations(), this);
        }
        return locations;
    }

    /** @return Resource collection API of EdgeModules. */
    public EdgeModules edgeModules() {
        if (this.edgeModules == null) {
            this.edgeModules = new EdgeModulesImpl(clientObject.getEdgeModules(), this);
        }
        return edgeModules;
    }

    /** @return Resource collection API of Videos. */
    public Videos videos() {
        if (this.videos == null) {
            this.videos = new VideosImpl(clientObject.getVideos(), this);
        }
        return videos;
    }

    /** @return Resource collection API of AccessPolicies. */
    public AccessPolicies accessPolicies() {
        if (this.accessPolicies == null) {
            this.accessPolicies = new AccessPoliciesImpl(clientObject.getAccessPolicies(), this);
        }
        return accessPolicies;
    }

    /**
     * @return Wrapped service client VideoAnalyzerManagementClient providing direct access to the underlying
     *     auto-generated API implementation, based on Azure REST API.
     */
    public VideoAnalyzerManagementClient serviceClient() {
        return this.clientObject;
    }
}
