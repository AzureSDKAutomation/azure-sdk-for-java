// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization;

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
import com.azure.resourcemanager.desktopvirtualization.fluent.DesktopVirtualizationApiClient;
import com.azure.resourcemanager.desktopvirtualization.implementation.ApplicationGroupsImpl;
import com.azure.resourcemanager.desktopvirtualization.implementation.ApplicationsImpl;
import com.azure.resourcemanager.desktopvirtualization.implementation.DesktopVirtualizationApiClientBuilder;
import com.azure.resourcemanager.desktopvirtualization.implementation.DesktopsImpl;
import com.azure.resourcemanager.desktopvirtualization.implementation.HostPoolsImpl;
import com.azure.resourcemanager.desktopvirtualization.implementation.MsixImagesImpl;
import com.azure.resourcemanager.desktopvirtualization.implementation.MsixPackagesImpl;
import com.azure.resourcemanager.desktopvirtualization.implementation.OperationsImpl;
import com.azure.resourcemanager.desktopvirtualization.implementation.ScalingPlansImpl;
import com.azure.resourcemanager.desktopvirtualization.implementation.SessionHostsImpl;
import com.azure.resourcemanager.desktopvirtualization.implementation.StartMenuItemsImpl;
import com.azure.resourcemanager.desktopvirtualization.implementation.UserSessionsImpl;
import com.azure.resourcemanager.desktopvirtualization.implementation.WorkspacesImpl;
import com.azure.resourcemanager.desktopvirtualization.models.ApplicationGroups;
import com.azure.resourcemanager.desktopvirtualization.models.Applications;
import com.azure.resourcemanager.desktopvirtualization.models.Desktops;
import com.azure.resourcemanager.desktopvirtualization.models.HostPools;
import com.azure.resourcemanager.desktopvirtualization.models.MsixImages;
import com.azure.resourcemanager.desktopvirtualization.models.MsixPackages;
import com.azure.resourcemanager.desktopvirtualization.models.Operations;
import com.azure.resourcemanager.desktopvirtualization.models.ScalingPlans;
import com.azure.resourcemanager.desktopvirtualization.models.SessionHosts;
import com.azure.resourcemanager.desktopvirtualization.models.StartMenuItems;
import com.azure.resourcemanager.desktopvirtualization.models.UserSessions;
import com.azure.resourcemanager.desktopvirtualization.models.Workspaces;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Entry point to DesktopVirtualizationManager. */
public final class DesktopVirtualizationManager {
    private Operations operations;

    private Workspaces workspaces;

    private ScalingPlans scalingPlans;

    private ApplicationGroups applicationGroups;

    private StartMenuItems startMenuItems;

    private Applications applications;

    private Desktops desktops;

    private HostPools hostPools;

    private UserSessions userSessions;

    private SessionHosts sessionHosts;

    private MsixPackages msixPackages;

    private MsixImages msixImages;

    private final DesktopVirtualizationApiClient clientObject;

    private DesktopVirtualizationManager(
        HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new DesktopVirtualizationApiClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of DesktopVirtualization service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the DesktopVirtualization service API instance.
     */
    public static DesktopVirtualizationManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create DesktopVirtualizationManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new DesktopVirtualizationManager.Configurable();
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
         * Creates an instance of DesktopVirtualization service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the DesktopVirtualization service API instance.
         */
        public DesktopVirtualizationManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            if (retryPolicy == null) {
                retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies
                .add(
                    new UserAgentPolicy(
                        null,
                        "com.azure.resourcemanager.desktopvirtualization",
                        "1.0.0-beta.1",
                        Configuration.getGlobalConfiguration()));
            policies.add(new RequestIdPolicy());
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies
                .add(
                    new BearerTokenAuthenticationPolicy(
                        credential, profile.getEnvironment().getManagementEndpoint() + "/.default"));
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                    .httpClient(httpClient)
                    .policies(policies.toArray(new HttpPipelinePolicy[0]))
                    .build();
            return new DesktopVirtualizationManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of Operations. */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /** @return Resource collection API of Workspaces. */
    public Workspaces workspaces() {
        if (this.workspaces == null) {
            this.workspaces = new WorkspacesImpl(clientObject.getWorkspaces(), this);
        }
        return workspaces;
    }

    /** @return Resource collection API of ScalingPlans. */
    public ScalingPlans scalingPlans() {
        if (this.scalingPlans == null) {
            this.scalingPlans = new ScalingPlansImpl(clientObject.getScalingPlans(), this);
        }
        return scalingPlans;
    }

    /** @return Resource collection API of ApplicationGroups. */
    public ApplicationGroups applicationGroups() {
        if (this.applicationGroups == null) {
            this.applicationGroups = new ApplicationGroupsImpl(clientObject.getApplicationGroups(), this);
        }
        return applicationGroups;
    }

    /** @return Resource collection API of StartMenuItems. */
    public StartMenuItems startMenuItems() {
        if (this.startMenuItems == null) {
            this.startMenuItems = new StartMenuItemsImpl(clientObject.getStartMenuItems(), this);
        }
        return startMenuItems;
    }

    /** @return Resource collection API of Applications. */
    public Applications applications() {
        if (this.applications == null) {
            this.applications = new ApplicationsImpl(clientObject.getApplications(), this);
        }
        return applications;
    }

    /** @return Resource collection API of Desktops. */
    public Desktops desktops() {
        if (this.desktops == null) {
            this.desktops = new DesktopsImpl(clientObject.getDesktops(), this);
        }
        return desktops;
    }

    /** @return Resource collection API of HostPools. */
    public HostPools hostPools() {
        if (this.hostPools == null) {
            this.hostPools = new HostPoolsImpl(clientObject.getHostPools(), this);
        }
        return hostPools;
    }

    /** @return Resource collection API of UserSessions. */
    public UserSessions userSessions() {
        if (this.userSessions == null) {
            this.userSessions = new UserSessionsImpl(clientObject.getUserSessions(), this);
        }
        return userSessions;
    }

    /** @return Resource collection API of SessionHosts. */
    public SessionHosts sessionHosts() {
        if (this.sessionHosts == null) {
            this.sessionHosts = new SessionHostsImpl(clientObject.getSessionHosts(), this);
        }
        return sessionHosts;
    }

    /** @return Resource collection API of MsixPackages. */
    public MsixPackages msixPackages() {
        if (this.msixPackages == null) {
            this.msixPackages = new MsixPackagesImpl(clientObject.getMsixPackages(), this);
        }
        return msixPackages;
    }

    /** @return Resource collection API of MsixImages. */
    public MsixImages msixImages() {
        if (this.msixImages == null) {
            this.msixImages = new MsixImagesImpl(clientObject.getMsixImages(), this);
        }
        return msixImages;
    }

    /**
     * @return Wrapped service client DesktopVirtualizationApiClient providing direct access to the underlying
     *     auto-generated API implementation, based on Azure REST API.
     */
    public DesktopVirtualizationApiClient serviceClient() {
        return this.clientObject;
    }
}
