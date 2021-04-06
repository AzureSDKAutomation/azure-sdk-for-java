// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption;

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
import com.azure.resourcemanager.consumption.fluent.ConsumptionManagementClient;
import com.azure.resourcemanager.consumption.implementation.AggregatedCostsImpl;
import com.azure.resourcemanager.consumption.implementation.BalancesImpl;
import com.azure.resourcemanager.consumption.implementation.BudgetsImpl;
import com.azure.resourcemanager.consumption.implementation.ChargesImpl;
import com.azure.resourcemanager.consumption.implementation.ConsumptionManagementClientBuilder;
import com.azure.resourcemanager.consumption.implementation.CreditsImpl;
import com.azure.resourcemanager.consumption.implementation.EventsOperationsImpl;
import com.azure.resourcemanager.consumption.implementation.ForecastsImpl;
import com.azure.resourcemanager.consumption.implementation.LotsOperationsImpl;
import com.azure.resourcemanager.consumption.implementation.MarketplacesImpl;
import com.azure.resourcemanager.consumption.implementation.OperationsImpl;
import com.azure.resourcemanager.consumption.implementation.PriceSheetsImpl;
import com.azure.resourcemanager.consumption.implementation.ReservationRecommendationDetailsImpl;
import com.azure.resourcemanager.consumption.implementation.ReservationRecommendationsImpl;
import com.azure.resourcemanager.consumption.implementation.ReservationTransactionsImpl;
import com.azure.resourcemanager.consumption.implementation.ReservationsDetailsImpl;
import com.azure.resourcemanager.consumption.implementation.ReservationsSummariesImpl;
import com.azure.resourcemanager.consumption.implementation.TagsImpl;
import com.azure.resourcemanager.consumption.implementation.UsageDetailsImpl;
import com.azure.resourcemanager.consumption.models.AggregatedCosts;
import com.azure.resourcemanager.consumption.models.Balances;
import com.azure.resourcemanager.consumption.models.Budgets;
import com.azure.resourcemanager.consumption.models.Charges;
import com.azure.resourcemanager.consumption.models.Credits;
import com.azure.resourcemanager.consumption.models.EventsOperations;
import com.azure.resourcemanager.consumption.models.Forecasts;
import com.azure.resourcemanager.consumption.models.LotsOperations;
import com.azure.resourcemanager.consumption.models.Marketplaces;
import com.azure.resourcemanager.consumption.models.Operations;
import com.azure.resourcemanager.consumption.models.PriceSheets;
import com.azure.resourcemanager.consumption.models.ReservationRecommendationDetails;
import com.azure.resourcemanager.consumption.models.ReservationRecommendations;
import com.azure.resourcemanager.consumption.models.ReservationTransactions;
import com.azure.resourcemanager.consumption.models.ReservationsDetails;
import com.azure.resourcemanager.consumption.models.ReservationsSummaries;
import com.azure.resourcemanager.consumption.models.Tags;
import com.azure.resourcemanager.consumption.models.UsageDetails;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Entry point to ConsumptionManager. Consumption management client provides access to consumption resources for Azure
 * Enterprise Subscriptions.
 */
public final class ConsumptionManager {
    private UsageDetails usageDetails;

    private Marketplaces marketplaces;

    private Budgets budgets;

    private Tags tags;

    private Charges charges;

    private Balances balances;

    private ReservationsSummaries reservationsSummaries;

    private ReservationsDetails reservationsDetails;

    private ReservationRecommendations reservationRecommendations;

    private ReservationRecommendationDetails reservationRecommendationDetails;

    private ReservationTransactions reservationTransactions;

    private PriceSheets priceSheets;

    private Forecasts forecasts;

    private Operations operations;

    private AggregatedCosts aggregatedCosts;

    private EventsOperations eventsOperations;

    private LotsOperations lotsOperations;

    private Credits credits;

    private final ConsumptionManagementClient clientObject;

    private ConsumptionManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new ConsumptionManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of Consumption service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the Consumption service API instance.
     */
    public static ConsumptionManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create ConsumptionManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new ConsumptionManager.Configurable();
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
         * Creates an instance of Consumption service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the Consumption service API instance.
         */
        public ConsumptionManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.consumption")
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
            return new ConsumptionManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of UsageDetails. */
    public UsageDetails usageDetails() {
        if (this.usageDetails == null) {
            this.usageDetails = new UsageDetailsImpl(clientObject.getUsageDetails(), this);
        }
        return usageDetails;
    }

    /** @return Resource collection API of Marketplaces. */
    public Marketplaces marketplaces() {
        if (this.marketplaces == null) {
            this.marketplaces = new MarketplacesImpl(clientObject.getMarketplaces(), this);
        }
        return marketplaces;
    }

    /** @return Resource collection API of Budgets. */
    public Budgets budgets() {
        if (this.budgets == null) {
            this.budgets = new BudgetsImpl(clientObject.getBudgets(), this);
        }
        return budgets;
    }

    /** @return Resource collection API of Tags. */
    public Tags tags() {
        if (this.tags == null) {
            this.tags = new TagsImpl(clientObject.getTags(), this);
        }
        return tags;
    }

    /** @return Resource collection API of Charges. */
    public Charges charges() {
        if (this.charges == null) {
            this.charges = new ChargesImpl(clientObject.getCharges(), this);
        }
        return charges;
    }

    /** @return Resource collection API of Balances. */
    public Balances balances() {
        if (this.balances == null) {
            this.balances = new BalancesImpl(clientObject.getBalances(), this);
        }
        return balances;
    }

    /** @return Resource collection API of ReservationsSummaries. */
    public ReservationsSummaries reservationsSummaries() {
        if (this.reservationsSummaries == null) {
            this.reservationsSummaries = new ReservationsSummariesImpl(clientObject.getReservationsSummaries(), this);
        }
        return reservationsSummaries;
    }

    /** @return Resource collection API of ReservationsDetails. */
    public ReservationsDetails reservationsDetails() {
        if (this.reservationsDetails == null) {
            this.reservationsDetails = new ReservationsDetailsImpl(clientObject.getReservationsDetails(), this);
        }
        return reservationsDetails;
    }

    /** @return Resource collection API of ReservationRecommendations. */
    public ReservationRecommendations reservationRecommendations() {
        if (this.reservationRecommendations == null) {
            this.reservationRecommendations =
                new ReservationRecommendationsImpl(clientObject.getReservationRecommendations(), this);
        }
        return reservationRecommendations;
    }

    /** @return Resource collection API of ReservationRecommendationDetails. */
    public ReservationRecommendationDetails reservationRecommendationDetails() {
        if (this.reservationRecommendationDetails == null) {
            this.reservationRecommendationDetails =
                new ReservationRecommendationDetailsImpl(clientObject.getReservationRecommendationDetails(), this);
        }
        return reservationRecommendationDetails;
    }

    /** @return Resource collection API of ReservationTransactions. */
    public ReservationTransactions reservationTransactions() {
        if (this.reservationTransactions == null) {
            this.reservationTransactions =
                new ReservationTransactionsImpl(clientObject.getReservationTransactions(), this);
        }
        return reservationTransactions;
    }

    /** @return Resource collection API of PriceSheets. */
    public PriceSheets priceSheets() {
        if (this.priceSheets == null) {
            this.priceSheets = new PriceSheetsImpl(clientObject.getPriceSheets(), this);
        }
        return priceSheets;
    }

    /** @return Resource collection API of Forecasts. */
    public Forecasts forecasts() {
        if (this.forecasts == null) {
            this.forecasts = new ForecastsImpl(clientObject.getForecasts(), this);
        }
        return forecasts;
    }

    /** @return Resource collection API of Operations. */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /** @return Resource collection API of AggregatedCosts. */
    public AggregatedCosts aggregatedCosts() {
        if (this.aggregatedCosts == null) {
            this.aggregatedCosts = new AggregatedCostsImpl(clientObject.getAggregatedCosts(), this);
        }
        return aggregatedCosts;
    }

    /** @return Resource collection API of EventsOperations. */
    public EventsOperations eventsOperations() {
        if (this.eventsOperations == null) {
            this.eventsOperations = new EventsOperationsImpl(clientObject.getEventsOperations(), this);
        }
        return eventsOperations;
    }

    /** @return Resource collection API of LotsOperations. */
    public LotsOperations lotsOperations() {
        if (this.lotsOperations == null) {
            this.lotsOperations = new LotsOperationsImpl(clientObject.getLotsOperations(), this);
        }
        return lotsOperations;
    }

    /** @return Resource collection API of Credits. */
    public Credits credits() {
        if (this.credits == null) {
            this.credits = new CreditsImpl(clientObject.getCredits(), this);
        }
        return credits;
    }

    /**
     * @return Wrapped service client ConsumptionManagementClient providing direct access to the underlying
     *     auto-generated API implementation, based on Azure REST API.
     */
    public ConsumptionManagementClient serviceClient() {
        return this.clientObject;
    }
}
