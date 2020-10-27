/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2018_01_01_preview.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the ServiceBusManagementClientImpl class.
 */
public class ServiceBusManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** Subscription credentials that uniquely identify a Microsoft Azure subscription. The subscription ID forms part of the URI for every service call. */
    private String subscriptionId;

    /**
     * Gets Subscription credentials that uniquely identify a Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets Subscription credentials that uniquely identify a Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public ServiceBusManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** The preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets The preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets The preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public ServiceBusManagementClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** The retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public ServiceBusManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public ServiceBusManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The NamespacesInner object to access its operations.
     */
    private NamespacesInner namespaces;

    /**
     * Gets the NamespacesInner object to access its operations.
     * @return the NamespacesInner object.
     */
    public NamespacesInner namespaces() {
        return this.namespaces;
    }

    /**
     * The PrivateEndpointConnectionsInner object to access its operations.
     */
    private PrivateEndpointConnectionsInner privateEndpointConnections;

    /**
     * Gets the PrivateEndpointConnectionsInner object to access its operations.
     * @return the PrivateEndpointConnectionsInner object.
     */
    public PrivateEndpointConnectionsInner privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * The PrivateLinkResourcesInner object to access its operations.
     */
    private PrivateLinkResourcesInner privateLinkResources;

    /**
     * Gets the PrivateLinkResourcesInner object to access its operations.
     * @return the PrivateLinkResourcesInner object.
     */
    public PrivateLinkResourcesInner privateLinkResources() {
        return this.privateLinkResources;
    }

    /**
     * The OperationsInner object to access its operations.
     */
    private OperationsInner operations;

    /**
     * Gets the OperationsInner object to access its operations.
     * @return the OperationsInner object.
     */
    public OperationsInner operations() {
        return this.operations;
    }

    /**
     * The QueuesInner object to access its operations.
     */
    private QueuesInner queues;

    /**
     * Gets the QueuesInner object to access its operations.
     * @return the QueuesInner object.
     */
    public QueuesInner queues() {
        return this.queues;
    }

    /**
     * The TopicsInner object to access its operations.
     */
    private TopicsInner topics;

    /**
     * Gets the TopicsInner object to access its operations.
     * @return the TopicsInner object.
     */
    public TopicsInner topics() {
        return this.topics;
    }

    /**
     * The DisasterRecoveryConfigsInner object to access its operations.
     */
    private DisasterRecoveryConfigsInner disasterRecoveryConfigs;

    /**
     * Gets the DisasterRecoveryConfigsInner object to access its operations.
     * @return the DisasterRecoveryConfigsInner object.
     */
    public DisasterRecoveryConfigsInner disasterRecoveryConfigs() {
        return this.disasterRecoveryConfigs;
    }

    /**
     * The EventHubsInner object to access its operations.
     */
    private EventHubsInner eventHubs;

    /**
     * Gets the EventHubsInner object to access its operations.
     * @return the EventHubsInner object.
     */
    public EventHubsInner eventHubs() {
        return this.eventHubs;
    }

    /**
     * The MigrationConfigsInner object to access its operations.
     */
    private MigrationConfigsInner migrationConfigs;

    /**
     * Gets the MigrationConfigsInner object to access its operations.
     * @return the MigrationConfigsInner object.
     */
    public MigrationConfigsInner migrationConfigs() {
        return this.migrationConfigs;
    }

    /**
     * The PremiumMessagingRegionsInner object to access its operations.
     */
    private PremiumMessagingRegionsInner premiumMessagingRegions;

    /**
     * Gets the PremiumMessagingRegionsInner object to access its operations.
     * @return the PremiumMessagingRegionsInner object.
     */
    public PremiumMessagingRegionsInner premiumMessagingRegions() {
        return this.premiumMessagingRegions;
    }

    /**
     * The RegionsInner object to access its operations.
     */
    private RegionsInner regions;

    /**
     * Gets the RegionsInner object to access its operations.
     * @return the RegionsInner object.
     */
    public RegionsInner regions() {
        return this.regions;
    }

    /**
     * The SubscriptionsInner object to access its operations.
     */
    private SubscriptionsInner subscriptions;

    /**
     * Gets the SubscriptionsInner object to access its operations.
     * @return the SubscriptionsInner object.
     */
    public SubscriptionsInner subscriptions() {
        return this.subscriptions;
    }

    /**
     * The RulesInner object to access its operations.
     */
    private RulesInner rules;

    /**
     * Gets the RulesInner object to access its operations.
     * @return the RulesInner object.
     */
    public RulesInner rules() {
        return this.rules;
    }

    /**
     * Initializes an instance of ServiceBusManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public ServiceBusManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of ServiceBusManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public ServiceBusManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of ServiceBusManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public ServiceBusManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.namespaces = new NamespacesInner(restClient().retrofit(), this);
        this.privateEndpointConnections = new PrivateEndpointConnectionsInner(restClient().retrofit(), this);
        this.privateLinkResources = new PrivateLinkResourcesInner(restClient().retrofit(), this);
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.queues = new QueuesInner(restClient().retrofit(), this);
        this.topics = new TopicsInner(restClient().retrofit(), this);
        this.disasterRecoveryConfigs = new DisasterRecoveryConfigsInner(restClient().retrofit(), this);
        this.eventHubs = new EventHubsInner(restClient().retrofit(), this);
        this.migrationConfigs = new MigrationConfigsInner(restClient().retrofit(), this);
        this.premiumMessagingRegions = new PremiumMessagingRegionsInner(restClient().retrofit(), this);
        this.regions = new RegionsInner(restClient().retrofit(), this);
        this.subscriptions = new SubscriptionsInner(restClient().retrofit(), this);
        this.rules = new RulesInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "ServiceBusManagementClient", "2018-01-01-preiew");
    }
}
