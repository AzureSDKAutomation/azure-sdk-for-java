/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_04_01_preview.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the SynapseManagementClientImpl class.
 */
public class SynapseManagementClientImpl extends AzureServiceClient {
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
    public SynapseManagementClientImpl withSubscriptionId(String subscriptionId) {
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
    public SynapseManagementClientImpl withAcceptLanguage(String acceptLanguage) {
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
    public SynapseManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
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
    public SynapseManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The WorkspacesInner object to access its operations.
     */
    private WorkspacesInner workspaces;

    /**
     * Gets the WorkspacesInner object to access its operations.
     * @return the WorkspacesInner object.
     */
    public WorkspacesInner workspaces() {
        return this.workspaces;
    }

    /**
     * The WorkspaceAadAdminsInner object to access its operations.
     */
    private WorkspaceAadAdminsInner workspaceAadAdmins;

    /**
     * Gets the WorkspaceAadAdminsInner object to access its operations.
     * @return the WorkspaceAadAdminsInner object.
     */
    public WorkspaceAadAdminsInner workspaceAadAdmins() {
        return this.workspaceAadAdmins;
    }

    /**
     * The WorkspaceSqlAadAdminsInner object to access its operations.
     */
    private WorkspaceSqlAadAdminsInner workspaceSqlAadAdmins;

    /**
     * Gets the WorkspaceSqlAadAdminsInner object to access its operations.
     * @return the WorkspaceSqlAadAdminsInner object.
     */
    public WorkspaceSqlAadAdminsInner workspaceSqlAadAdmins() {
        return this.workspaceSqlAadAdmins;
    }

    /**
     * The WorkspaceManagedIdentitySqlControlSettingsInner object to access its operations.
     */
    private WorkspaceManagedIdentitySqlControlSettingsInner workspaceManagedIdentitySqlControlSettings;

    /**
     * Gets the WorkspaceManagedIdentitySqlControlSettingsInner object to access its operations.
     * @return the WorkspaceManagedIdentitySqlControlSettingsInner object.
     */
    public WorkspaceManagedIdentitySqlControlSettingsInner workspaceManagedIdentitySqlControlSettings() {
        return this.workspaceManagedIdentitySqlControlSettings;
    }

    /**
     * The RestorableDroppedSqlPoolsInner object to access its operations.
     */
    private RestorableDroppedSqlPoolsInner restorableDroppedSqlPools;

    /**
     * Gets the RestorableDroppedSqlPoolsInner object to access its operations.
     * @return the RestorableDroppedSqlPoolsInner object.
     */
    public RestorableDroppedSqlPoolsInner restorableDroppedSqlPools() {
        return this.restorableDroppedSqlPools;
    }

    /**
     * Initializes an instance of SynapseManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public SynapseManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of SynapseManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public SynapseManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of SynapseManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public SynapseManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2020-04-01-preview";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.workspaces = new WorkspacesInner(restClient().retrofit(), this);
        this.workspaceAadAdmins = new WorkspaceAadAdminsInner(restClient().retrofit(), this);
        this.workspaceSqlAadAdmins = new WorkspaceSqlAadAdminsInner(restClient().retrofit(), this);
        this.workspaceManagedIdentitySqlControlSettings = new WorkspaceManagedIdentitySqlControlSettingsInner(restClient().retrofit(), this);
        this.restorableDroppedSqlPools = new RestorableDroppedSqlPoolsInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "SynapseManagementClient", "2020-04-01-preview");
    }
}
