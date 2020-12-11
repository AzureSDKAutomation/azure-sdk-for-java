// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for ConsumptionManagementClient class. */
public interface ConsumptionManagementClient {
    /**
     * Gets Azure Subscription ID.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the MarketplacesClient object to access its operations.
     *
     * @return the MarketplacesClient object.
     */
    MarketplacesClient getMarketplaces();

    /**
     * Gets the BudgetsClient object to access its operations.
     *
     * @return the BudgetsClient object.
     */
    BudgetsClient getBudgets();

    /**
     * Gets the TagsClient object to access its operations.
     *
     * @return the TagsClient object.
     */
    TagsClient getTags();

    /**
     * Gets the ChargesClient object to access its operations.
     *
     * @return the ChargesClient object.
     */
    ChargesClient getCharges();

    /**
     * Gets the BalancesClient object to access its operations.
     *
     * @return the BalancesClient object.
     */
    BalancesClient getBalances();

    /**
     * Gets the ReservationsSummariesClient object to access its operations.
     *
     * @return the ReservationsSummariesClient object.
     */
    ReservationsSummariesClient getReservationsSummaries();

    /**
     * Gets the ReservationsDetailsClient object to access its operations.
     *
     * @return the ReservationsDetailsClient object.
     */
    ReservationsDetailsClient getReservationsDetails();

    /**
     * Gets the ReservationRecommendationsClient object to access its operations.
     *
     * @return the ReservationRecommendationsClient object.
     */
    ReservationRecommendationsClient getReservationRecommendations();

    /**
     * Gets the ReservationRecommendationDetailsClient object to access its operations.
     *
     * @return the ReservationRecommendationDetailsClient object.
     */
    ReservationRecommendationDetailsClient getReservationRecommendationDetails();

    /**
     * Gets the ReservationTransactionsClient object to access its operations.
     *
     * @return the ReservationTransactionsClient object.
     */
    ReservationTransactionsClient getReservationTransactions();

    /**
     * Gets the PriceSheetsClient object to access its operations.
     *
     * @return the PriceSheetsClient object.
     */
    PriceSheetsClient getPriceSheets();

    /**
     * Gets the ForecastsClient object to access its operations.
     *
     * @return the ForecastsClient object.
     */
    ForecastsClient getForecasts();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the AggregatedCostsClient object to access its operations.
     *
     * @return the AggregatedCostsClient object.
     */
    AggregatedCostsClient getAggregatedCosts();

    /**
     * Gets the EventsOperationsClient object to access its operations.
     *
     * @return the EventsOperationsClient object.
     */
    EventsOperationsClient getEventsOperations();

    /**
     * Gets the LotsOperationsClient object to access its operations.
     *
     * @return the LotsOperationsClient object.
     */
    LotsOperationsClient getLotsOperations();

    /**
     * Gets the CreditsClient object to access its operations.
     *
     * @return the CreditsClient object.
     */
    CreditsClient getCredits();

    /**
     * Gets the UsageDetailsClient object to access its operations.
     *
     * @return the UsageDetailsClient object.
     */
    UsageDetailsClient getUsageDetails();
}
