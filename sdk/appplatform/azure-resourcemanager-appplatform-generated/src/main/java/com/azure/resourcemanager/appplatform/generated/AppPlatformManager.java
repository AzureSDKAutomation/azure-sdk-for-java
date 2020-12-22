// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

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
import com.azure.resourcemanager.appplatform.generated.fluent.AppPlatformManagementClient;
import com.azure.resourcemanager.appplatform.generated.implementation.AppPlatformManagementClientBuilder;
import com.azure.resourcemanager.appplatform.generated.implementation.AppsImpl;
import com.azure.resourcemanager.appplatform.generated.implementation.BindingsImpl;
import com.azure.resourcemanager.appplatform.generated.implementation.CertificatesImpl;
import com.azure.resourcemanager.appplatform.generated.implementation.ConfigServersImpl;
import com.azure.resourcemanager.appplatform.generated.implementation.CustomDomainsImpl;
import com.azure.resourcemanager.appplatform.generated.implementation.DeploymentsImpl;
import com.azure.resourcemanager.appplatform.generated.implementation.MonitoringSettingsImpl;
import com.azure.resourcemanager.appplatform.generated.implementation.OperationsImpl;
import com.azure.resourcemanager.appplatform.generated.implementation.RuntimeVersionsImpl;
import com.azure.resourcemanager.appplatform.generated.implementation.ServicesImpl;
import com.azure.resourcemanager.appplatform.generated.implementation.SkusImpl;
import com.azure.resourcemanager.appplatform.generated.models.Apps;
import com.azure.resourcemanager.appplatform.generated.models.Bindings;
import com.azure.resourcemanager.appplatform.generated.models.Certificates;
import com.azure.resourcemanager.appplatform.generated.models.ConfigServers;
import com.azure.resourcemanager.appplatform.generated.models.CustomDomains;
import com.azure.resourcemanager.appplatform.generated.models.Deployments;
import com.azure.resourcemanager.appplatform.generated.models.MonitoringSettings;
import com.azure.resourcemanager.appplatform.generated.models.Operations;
import com.azure.resourcemanager.appplatform.generated.models.RuntimeVersions;
import com.azure.resourcemanager.appplatform.generated.models.Services;
import com.azure.resourcemanager.appplatform.generated.models.Skus;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Entry point to AppPlatformManager. REST API for Azure Spring Cloud. */
public final class AppPlatformManager {
    private Services services;

    private ConfigServers configServers;

    private MonitoringSettings monitoringSettings;

    private Apps apps;

    private Bindings bindings;

    private Certificates certificates;

    private CustomDomains customDomains;

    private Deployments deployments;

    private Operations operations;

    private RuntimeVersions runtimeVersions;

    private Skus skus;

    private final AppPlatformManagementClient clientObject;

    private AppPlatformManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new AppPlatformManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of AppPlatform service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the AppPlatform service API instance.
     */
    public static AppPlatformManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create AppPlatformManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new AppPlatformManager.Configurable();
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
         * Creates an instance of AppPlatform service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the AppPlatform service API instance.
         */
        public AppPlatformManager authenticate(TokenCredential credential, AzureProfile profile) {
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
                        "com.azure.resourcemanager.appplatform.generated",
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
            return new AppPlatformManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of Services. */
    public Services services() {
        if (this.services == null) {
            this.services = new ServicesImpl(clientObject.getServices(), this);
        }
        return services;
    }

    /** @return Resource collection API of ConfigServers. */
    public ConfigServers configServers() {
        if (this.configServers == null) {
            this.configServers = new ConfigServersImpl(clientObject.getConfigServers(), this);
        }
        return configServers;
    }

    /** @return Resource collection API of MonitoringSettings. */
    public MonitoringSettings monitoringSettings() {
        if (this.monitoringSettings == null) {
            this.monitoringSettings = new MonitoringSettingsImpl(clientObject.getMonitoringSettings(), this);
        }
        return monitoringSettings;
    }

    /** @return Resource collection API of Apps. */
    public Apps apps() {
        if (this.apps == null) {
            this.apps = new AppsImpl(clientObject.getApps(), this);
        }
        return apps;
    }

    /** @return Resource collection API of Bindings. */
    public Bindings bindings() {
        if (this.bindings == null) {
            this.bindings = new BindingsImpl(clientObject.getBindings(), this);
        }
        return bindings;
    }

    /** @return Resource collection API of Certificates. */
    public Certificates certificates() {
        if (this.certificates == null) {
            this.certificates = new CertificatesImpl(clientObject.getCertificates(), this);
        }
        return certificates;
    }

    /** @return Resource collection API of CustomDomains. */
    public CustomDomains customDomains() {
        if (this.customDomains == null) {
            this.customDomains = new CustomDomainsImpl(clientObject.getCustomDomains(), this);
        }
        return customDomains;
    }

    /** @return Resource collection API of Deployments. */
    public Deployments deployments() {
        if (this.deployments == null) {
            this.deployments = new DeploymentsImpl(clientObject.getDeployments(), this);
        }
        return deployments;
    }

    /** @return Resource collection API of Operations. */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /** @return Resource collection API of RuntimeVersions. */
    public RuntimeVersions runtimeVersions() {
        if (this.runtimeVersions == null) {
            this.runtimeVersions = new RuntimeVersionsImpl(clientObject.getRuntimeVersions(), this);
        }
        return runtimeVersions;
    }

    /** @return Resource collection API of Skus. */
    public Skus skus() {
        if (this.skus == null) {
            this.skus = new SkusImpl(clientObject.getSkus(), this);
        }
        return skus;
    }

    /**
     * @return Wrapped service client AppPlatformManagementClient providing direct access to the underlying
     *     auto-generated API implementation, based on Azure REST API.
     */
    public AppPlatformManagementClient serviceClient() {
        return this.clientObject;
    }
}
