/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2020_10_01.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.azure.LongRunningFinalState;
import com.microsoft.azure.LongRunningOperationOptions;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the ResourceManagementClientImpl class.
 */
public class ResourceManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The ID of the target subscription. */
    private String subscriptionId;

    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The ID of the target subscription.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public ResourceManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** The API version to use for this operation. */
    private String apiVersion;

    /**
     * Gets The API version to use for this operation.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
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
    public ResourceManagementClientImpl withAcceptLanguage(String acceptLanguage) {
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
    public ResourceManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
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
    public ResourceManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
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
     * The DeploymentsInner object to access its operations.
     */
    private DeploymentsInner deployments;

    /**
     * Gets the DeploymentsInner object to access its operations.
     * @return the DeploymentsInner object.
     */
    public DeploymentsInner deployments() {
        return this.deployments;
    }

    /**
     * The ProvidersInner object to access its operations.
     */
    private ProvidersInner providers;

    /**
     * Gets the ProvidersInner object to access its operations.
     * @return the ProvidersInner object.
     */
    public ProvidersInner providers() {
        return this.providers;
    }

    /**
     * The ProviderResourceTypesInner object to access its operations.
     */
    private ProviderResourceTypesInner providerResourceTypes;

    /**
     * Gets the ProviderResourceTypesInner object to access its operations.
     * @return the ProviderResourceTypesInner object.
     */
    public ProviderResourceTypesInner providerResourceTypes() {
        return this.providerResourceTypes;
    }

    /**
     * The ResourcesInner object to access its operations.
     */
    private ResourcesInner resources;

    /**
     * Gets the ResourcesInner object to access its operations.
     * @return the ResourcesInner object.
     */
    public ResourcesInner resources() {
        return this.resources;
    }

    /**
     * The ResourceGroupsInner object to access its operations.
     */
    private ResourceGroupsInner resourceGroups;

    /**
     * Gets the ResourceGroupsInner object to access its operations.
     * @return the ResourceGroupsInner object.
     */
    public ResourceGroupsInner resourceGroups() {
        return this.resourceGroups;
    }

    /**
     * The TagOperationsInner object to access its operations.
     */
    private TagOperationsInner tagOperations;

    /**
     * Gets the TagOperationsInner object to access its operations.
     * @return the TagOperationsInner object.
     */
    public TagOperationsInner tagOperations() {
        return this.tagOperations;
    }

    /**
     * The DeploymentOperationsInner object to access its operations.
     */
    private DeploymentOperationsInner deploymentOperations;

    /**
     * Gets the DeploymentOperationsInner object to access its operations.
     * @return the DeploymentOperationsInner object.
     */
    public DeploymentOperationsInner deploymentOperations() {
        return this.deploymentOperations;
    }

    /**
     * Initializes an instance of ResourceManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public ResourceManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of ResourceManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public ResourceManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of ResourceManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public ResourceManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2020-10-01";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.deployments = new DeploymentsInner(restClient().retrofit(), this);
        this.providers = new ProvidersInner(restClient().retrofit(), this);
        this.providerResourceTypes = new ProviderResourceTypesInner(restClient().retrofit(), this);
        this.resources = new ResourcesInner(restClient().retrofit(), this);
        this.resourceGroups = new ResourceGroupsInner(restClient().retrofit(), this);
        this.tagOperations = new TagOperationsInner(restClient().retrofit(), this);
        this.deploymentOperations = new DeploymentOperationsInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "ResourceManagementClient", "2020-10-01");
    }
}
