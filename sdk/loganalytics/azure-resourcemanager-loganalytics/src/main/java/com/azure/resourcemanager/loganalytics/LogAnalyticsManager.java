// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics;

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
import com.azure.resourcemanager.loganalytics.fluent.OperationalInsightsManagementClient;
import com.azure.resourcemanager.loganalytics.implementation.AvailableServiceTiersImpl;
import com.azure.resourcemanager.loganalytics.implementation.ClustersImpl;
import com.azure.resourcemanager.loganalytics.implementation.DataExportsImpl;
import com.azure.resourcemanager.loganalytics.implementation.DataSourcesImpl;
import com.azure.resourcemanager.loganalytics.implementation.DeletedWorkspacesImpl;
import com.azure.resourcemanager.loganalytics.implementation.GatewaysImpl;
import com.azure.resourcemanager.loganalytics.implementation.IntelligencePacksImpl;
import com.azure.resourcemanager.loganalytics.implementation.LinkedServicesImpl;
import com.azure.resourcemanager.loganalytics.implementation.LinkedStorageAccountsImpl;
import com.azure.resourcemanager.loganalytics.implementation.ManagementGroupsImpl;
import com.azure.resourcemanager.loganalytics.implementation.OperationStatusesImpl;
import com.azure.resourcemanager.loganalytics.implementation.OperationalInsightsManagementClientBuilder;
import com.azure.resourcemanager.loganalytics.implementation.OperationsImpl;
import com.azure.resourcemanager.loganalytics.implementation.SavedSearchesImpl;
import com.azure.resourcemanager.loganalytics.implementation.SchemasImpl;
import com.azure.resourcemanager.loganalytics.implementation.SharedKeysOperationsImpl;
import com.azure.resourcemanager.loganalytics.implementation.StorageInsightConfigsImpl;
import com.azure.resourcemanager.loganalytics.implementation.TablesImpl;
import com.azure.resourcemanager.loganalytics.implementation.UsagesImpl;
import com.azure.resourcemanager.loganalytics.implementation.WorkspacePurgesImpl;
import com.azure.resourcemanager.loganalytics.implementation.WorkspacesImpl;
import com.azure.resourcemanager.loganalytics.models.AvailableServiceTiers;
import com.azure.resourcemanager.loganalytics.models.Clusters;
import com.azure.resourcemanager.loganalytics.models.DataExports;
import com.azure.resourcemanager.loganalytics.models.DataSources;
import com.azure.resourcemanager.loganalytics.models.DeletedWorkspaces;
import com.azure.resourcemanager.loganalytics.models.Gateways;
import com.azure.resourcemanager.loganalytics.models.IntelligencePacks;
import com.azure.resourcemanager.loganalytics.models.LinkedServices;
import com.azure.resourcemanager.loganalytics.models.LinkedStorageAccounts;
import com.azure.resourcemanager.loganalytics.models.ManagementGroups;
import com.azure.resourcemanager.loganalytics.models.OperationStatuses;
import com.azure.resourcemanager.loganalytics.models.Operations;
import com.azure.resourcemanager.loganalytics.models.SavedSearches;
import com.azure.resourcemanager.loganalytics.models.Schemas;
import com.azure.resourcemanager.loganalytics.models.SharedKeysOperations;
import com.azure.resourcemanager.loganalytics.models.StorageInsightConfigs;
import com.azure.resourcemanager.loganalytics.models.Tables;
import com.azure.resourcemanager.loganalytics.models.Usages;
import com.azure.resourcemanager.loganalytics.models.WorkspacePurges;
import com.azure.resourcemanager.loganalytics.models.Workspaces;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Entry point to LogAnalyticsManager. Operational Insights Client. */
public final class LogAnalyticsManager {
    private DataExports dataExports;

    private DataSources dataSources;

    private IntelligencePacks intelligencePacks;

    private LinkedServices linkedServices;

    private LinkedStorageAccounts linkedStorageAccounts;

    private ManagementGroups managementGroups;

    private Operations operations;

    private OperationStatuses operationStatuses;

    private SharedKeysOperations sharedKeysOperations;

    private Usages usages;

    private Workspaces workspaces;

    private DeletedWorkspaces deletedWorkspaces;

    private Clusters clusters;

    private StorageInsightConfigs storageInsightConfigs;

    private SavedSearches savedSearches;

    private AvailableServiceTiers availableServiceTiers;

    private Gateways gateways;

    private Schemas schemas;

    private WorkspacePurges workspacePurges;

    private Tables tables;

    private final OperationalInsightsManagementClient clientObject;

    private LogAnalyticsManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new OperationalInsightsManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of LogAnalytics service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the LogAnalytics service API instance.
     */
    public static LogAnalyticsManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create LogAnalyticsManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new LogAnalyticsManager.Configurable();
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
         * Creates an instance of LogAnalytics service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the LogAnalytics service API instance.
         */
        public LogAnalyticsManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.loganalytics")
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
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                    .httpClient(httpClient)
                    .policies(policies.toArray(new HttpPipelinePolicy[0]))
                    .build();
            return new LogAnalyticsManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of DataExports. */
    public DataExports dataExports() {
        if (this.dataExports == null) {
            this.dataExports = new DataExportsImpl(clientObject.getDataExports(), this);
        }
        return dataExports;
    }

    /** @return Resource collection API of DataSources. */
    public DataSources dataSources() {
        if (this.dataSources == null) {
            this.dataSources = new DataSourcesImpl(clientObject.getDataSources(), this);
        }
        return dataSources;
    }

    /** @return Resource collection API of IntelligencePacks. */
    public IntelligencePacks intelligencePacks() {
        if (this.intelligencePacks == null) {
            this.intelligencePacks = new IntelligencePacksImpl(clientObject.getIntelligencePacks(), this);
        }
        return intelligencePacks;
    }

    /** @return Resource collection API of LinkedServices. */
    public LinkedServices linkedServices() {
        if (this.linkedServices == null) {
            this.linkedServices = new LinkedServicesImpl(clientObject.getLinkedServices(), this);
        }
        return linkedServices;
    }

    /** @return Resource collection API of LinkedStorageAccounts. */
    public LinkedStorageAccounts linkedStorageAccounts() {
        if (this.linkedStorageAccounts == null) {
            this.linkedStorageAccounts = new LinkedStorageAccountsImpl(clientObject.getLinkedStorageAccounts(), this);
        }
        return linkedStorageAccounts;
    }

    /** @return Resource collection API of ManagementGroups. */
    public ManagementGroups managementGroups() {
        if (this.managementGroups == null) {
            this.managementGroups = new ManagementGroupsImpl(clientObject.getManagementGroups(), this);
        }
        return managementGroups;
    }

    /** @return Resource collection API of Operations. */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /** @return Resource collection API of OperationStatuses. */
    public OperationStatuses operationStatuses() {
        if (this.operationStatuses == null) {
            this.operationStatuses = new OperationStatusesImpl(clientObject.getOperationStatuses(), this);
        }
        return operationStatuses;
    }

    /** @return Resource collection API of SharedKeysOperations. */
    public SharedKeysOperations sharedKeysOperations() {
        if (this.sharedKeysOperations == null) {
            this.sharedKeysOperations = new SharedKeysOperationsImpl(clientObject.getSharedKeysOperations(), this);
        }
        return sharedKeysOperations;
    }

    /** @return Resource collection API of Usages. */
    public Usages usages() {
        if (this.usages == null) {
            this.usages = new UsagesImpl(clientObject.getUsages(), this);
        }
        return usages;
    }

    /** @return Resource collection API of Workspaces. */
    public Workspaces workspaces() {
        if (this.workspaces == null) {
            this.workspaces = new WorkspacesImpl(clientObject.getWorkspaces(), this);
        }
        return workspaces;
    }

    /** @return Resource collection API of DeletedWorkspaces. */
    public DeletedWorkspaces deletedWorkspaces() {
        if (this.deletedWorkspaces == null) {
            this.deletedWorkspaces = new DeletedWorkspacesImpl(clientObject.getDeletedWorkspaces(), this);
        }
        return deletedWorkspaces;
    }

    /** @return Resource collection API of Clusters. */
    public Clusters clusters() {
        if (this.clusters == null) {
            this.clusters = new ClustersImpl(clientObject.getClusters(), this);
        }
        return clusters;
    }

    /** @return Resource collection API of StorageInsightConfigs. */
    public StorageInsightConfigs storageInsightConfigs() {
        if (this.storageInsightConfigs == null) {
            this.storageInsightConfigs = new StorageInsightConfigsImpl(clientObject.getStorageInsightConfigs(), this);
        }
        return storageInsightConfigs;
    }

    /** @return Resource collection API of SavedSearches. */
    public SavedSearches savedSearches() {
        if (this.savedSearches == null) {
            this.savedSearches = new SavedSearchesImpl(clientObject.getSavedSearches(), this);
        }
        return savedSearches;
    }

    /** @return Resource collection API of AvailableServiceTiers. */
    public AvailableServiceTiers availableServiceTiers() {
        if (this.availableServiceTiers == null) {
            this.availableServiceTiers = new AvailableServiceTiersImpl(clientObject.getAvailableServiceTiers(), this);
        }
        return availableServiceTiers;
    }

    /** @return Resource collection API of Gateways. */
    public Gateways gateways() {
        if (this.gateways == null) {
            this.gateways = new GatewaysImpl(clientObject.getGateways(), this);
        }
        return gateways;
    }

    /** @return Resource collection API of Schemas. */
    public Schemas schemas() {
        if (this.schemas == null) {
            this.schemas = new SchemasImpl(clientObject.getSchemas(), this);
        }
        return schemas;
    }

    /** @return Resource collection API of WorkspacePurges. */
    public WorkspacePurges workspacePurges() {
        if (this.workspacePurges == null) {
            this.workspacePurges = new WorkspacePurgesImpl(clientObject.getWorkspacePurges(), this);
        }
        return workspacePurges;
    }

    /** @return Resource collection API of Tables. */
    public Tables tables() {
        if (this.tables == null) {
            this.tables = new TablesImpl(clientObject.getTables(), this);
        }
        return tables;
    }

    /**
     * @return Wrapped service client OperationalInsightsManagementClient providing direct access to the underlying
     *     auto-generated API implementation, based on Azure REST API.
     */
    public OperationalInsightsManagementClient serviceClient() {
        return this.clientObject;
    }
}
