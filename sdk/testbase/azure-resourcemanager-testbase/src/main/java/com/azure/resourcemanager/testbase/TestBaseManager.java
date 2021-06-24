// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.testbase;

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
import com.azure.resourcemanager.testbase.fluent.TestBase;
import com.azure.resourcemanager.testbase.implementation.AnalysisResultsImpl;
import com.azure.resourcemanager.testbase.implementation.AvailableOSImpl;
import com.azure.resourcemanager.testbase.implementation.CustomerEventsImpl;
import com.azure.resourcemanager.testbase.implementation.EmailEventsImpl;
import com.azure.resourcemanager.testbase.implementation.FavoriteProcessesImpl;
import com.azure.resourcemanager.testbase.implementation.FlightingRingsImpl;
import com.azure.resourcemanager.testbase.implementation.OSUpdatesImpl;
import com.azure.resourcemanager.testbase.implementation.OperationsImpl;
import com.azure.resourcemanager.testbase.implementation.PackagesImpl;
import com.azure.resourcemanager.testbase.implementation.SkusImpl;
import com.azure.resourcemanager.testbase.implementation.TestBaseAccountsImpl;
import com.azure.resourcemanager.testbase.implementation.TestBaseBuilder;
import com.azure.resourcemanager.testbase.implementation.TestResultsImpl;
import com.azure.resourcemanager.testbase.implementation.TestSummariesImpl;
import com.azure.resourcemanager.testbase.implementation.TestTypesImpl;
import com.azure.resourcemanager.testbase.implementation.UsagesImpl;
import com.azure.resourcemanager.testbase.models.AnalysisResults;
import com.azure.resourcemanager.testbase.models.AvailableOS;
import com.azure.resourcemanager.testbase.models.CustomerEvents;
import com.azure.resourcemanager.testbase.models.EmailEvents;
import com.azure.resourcemanager.testbase.models.FavoriteProcesses;
import com.azure.resourcemanager.testbase.models.FlightingRings;
import com.azure.resourcemanager.testbase.models.OSUpdates;
import com.azure.resourcemanager.testbase.models.Operations;
import com.azure.resourcemanager.testbase.models.Packages;
import com.azure.resourcemanager.testbase.models.Skus;
import com.azure.resourcemanager.testbase.models.TestBaseAccounts;
import com.azure.resourcemanager.testbase.models.TestResults;
import com.azure.resourcemanager.testbase.models.TestSummaries;
import com.azure.resourcemanager.testbase.models.TestTypes;
import com.azure.resourcemanager.testbase.models.Usages;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Entry point to TestBaseManager. Test Base. */
public final class TestBaseManager {
    private Skus skus;

    private TestBaseAccounts testBaseAccounts;

    private Usages usages;

    private AvailableOS availableOS;

    private FlightingRings flightingRings;

    private TestTypes testTypes;

    private Packages packages;

    private TestSummaries testSummaries;

    private TestResults testResults;

    private OSUpdates oSUpdates;

    private FavoriteProcesses favoriteProcesses;

    private AnalysisResults analysisResults;

    private EmailEvents emailEvents;

    private CustomerEvents customerEvents;

    private Operations operations;

    private final TestBase clientObject;

    private TestBaseManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new TestBaseBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of TestBase service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the TestBase service API instance.
     */
    public static TestBaseManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create TestBaseManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new TestBaseManager.Configurable();
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
         * Creates an instance of TestBase service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the TestBase service API instance.
         */
        public TestBaseManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.testbase")
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
            return new TestBaseManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of Skus. */
    public Skus skus() {
        if (this.skus == null) {
            this.skus = new SkusImpl(clientObject.getSkus(), this);
        }
        return skus;
    }

    /** @return Resource collection API of TestBaseAccounts. */
    public TestBaseAccounts testBaseAccounts() {
        if (this.testBaseAccounts == null) {
            this.testBaseAccounts = new TestBaseAccountsImpl(clientObject.getTestBaseAccounts(), this);
        }
        return testBaseAccounts;
    }

    /** @return Resource collection API of Usages. */
    public Usages usages() {
        if (this.usages == null) {
            this.usages = new UsagesImpl(clientObject.getUsages(), this);
        }
        return usages;
    }

    /** @return Resource collection API of AvailableOS. */
    public AvailableOS availableOS() {
        if (this.availableOS == null) {
            this.availableOS = new AvailableOSImpl(clientObject.getAvailableOS(), this);
        }
        return availableOS;
    }

    /** @return Resource collection API of FlightingRings. */
    public FlightingRings flightingRings() {
        if (this.flightingRings == null) {
            this.flightingRings = new FlightingRingsImpl(clientObject.getFlightingRings(), this);
        }
        return flightingRings;
    }

    /** @return Resource collection API of TestTypes. */
    public TestTypes testTypes() {
        if (this.testTypes == null) {
            this.testTypes = new TestTypesImpl(clientObject.getTestTypes(), this);
        }
        return testTypes;
    }

    /** @return Resource collection API of Packages. */
    public Packages packages() {
        if (this.packages == null) {
            this.packages = new PackagesImpl(clientObject.getPackages(), this);
        }
        return packages;
    }

    /** @return Resource collection API of TestSummaries. */
    public TestSummaries testSummaries() {
        if (this.testSummaries == null) {
            this.testSummaries = new TestSummariesImpl(clientObject.getTestSummaries(), this);
        }
        return testSummaries;
    }

    /** @return Resource collection API of TestResults. */
    public TestResults testResults() {
        if (this.testResults == null) {
            this.testResults = new TestResultsImpl(clientObject.getTestResults(), this);
        }
        return testResults;
    }

    /** @return Resource collection API of OSUpdates. */
    public OSUpdates oSUpdates() {
        if (this.oSUpdates == null) {
            this.oSUpdates = new OSUpdatesImpl(clientObject.getOSUpdates(), this);
        }
        return oSUpdates;
    }

    /** @return Resource collection API of FavoriteProcesses. */
    public FavoriteProcesses favoriteProcesses() {
        if (this.favoriteProcesses == null) {
            this.favoriteProcesses = new FavoriteProcessesImpl(clientObject.getFavoriteProcesses(), this);
        }
        return favoriteProcesses;
    }

    /** @return Resource collection API of AnalysisResults. */
    public AnalysisResults analysisResults() {
        if (this.analysisResults == null) {
            this.analysisResults = new AnalysisResultsImpl(clientObject.getAnalysisResults(), this);
        }
        return analysisResults;
    }

    /** @return Resource collection API of EmailEvents. */
    public EmailEvents emailEvents() {
        if (this.emailEvents == null) {
            this.emailEvents = new EmailEventsImpl(clientObject.getEmailEvents(), this);
        }
        return emailEvents;
    }

    /** @return Resource collection API of CustomerEvents. */
    public CustomerEvents customerEvents() {
        if (this.customerEvents == null) {
            this.customerEvents = new CustomerEventsImpl(clientObject.getCustomerEvents(), this);
        }
        return customerEvents;
    }

    /** @return Resource collection API of Operations. */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /**
     * @return Wrapped service client TestBase providing direct access to the underlying auto-generated API
     *     implementation, based on Azure REST API.
     */
    public TestBase serviceClient() {
        return this.clientObject;
    }
}
