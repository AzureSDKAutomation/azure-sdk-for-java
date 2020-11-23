/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mariadb.v2020_01_01.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * Initializes a new instance of the MariaDBManagementClientImpl class.
 */
public class MariaDBManagementClientImpl extends AzureServiceClient {
    /** The Retrofit service to perform REST calls. */
    private MariaDBManagementClientService service;
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
    public MariaDBManagementClientImpl withSubscriptionId(String subscriptionId) {
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
    public MariaDBManagementClientImpl withAcceptLanguage(String acceptLanguage) {
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
    public MariaDBManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
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
    public MariaDBManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The ServersInner object to access its operations.
     */
    private ServersInner servers;

    /**
     * Gets the ServersInner object to access its operations.
     * @return the ServersInner object.
     */
    public ServersInner servers() {
        return this.servers;
    }

    /**
     * The ReplicasInner object to access its operations.
     */
    private ReplicasInner replicas;

    /**
     * Gets the ReplicasInner object to access its operations.
     * @return the ReplicasInner object.
     */
    public ReplicasInner replicas() {
        return this.replicas;
    }

    /**
     * The FirewallRulesInner object to access its operations.
     */
    private FirewallRulesInner firewallRules;

    /**
     * Gets the FirewallRulesInner object to access its operations.
     * @return the FirewallRulesInner object.
     */
    public FirewallRulesInner firewallRules() {
        return this.firewallRules;
    }

    /**
     * The VirtualNetworkRulesInner object to access its operations.
     */
    private VirtualNetworkRulesInner virtualNetworkRules;

    /**
     * Gets the VirtualNetworkRulesInner object to access its operations.
     * @return the VirtualNetworkRulesInner object.
     */
    public VirtualNetworkRulesInner virtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    /**
     * The DatabasesInner object to access its operations.
     */
    private DatabasesInner databases;

    /**
     * Gets the DatabasesInner object to access its operations.
     * @return the DatabasesInner object.
     */
    public DatabasesInner databases() {
        return this.databases;
    }

    /**
     * The ConfigurationsInner object to access its operations.
     */
    private ConfigurationsInner configurations;

    /**
     * Gets the ConfigurationsInner object to access its operations.
     * @return the ConfigurationsInner object.
     */
    public ConfigurationsInner configurations() {
        return this.configurations;
    }

    /**
     * The LogFilesInner object to access its operations.
     */
    private LogFilesInner logFiles;

    /**
     * Gets the LogFilesInner object to access its operations.
     * @return the LogFilesInner object.
     */
    public LogFilesInner logFiles() {
        return this.logFiles;
    }

    /**
     * The LocationBasedPerformanceTiersInner object to access its operations.
     */
    private LocationBasedPerformanceTiersInner locationBasedPerformanceTiers;

    /**
     * Gets the LocationBasedPerformanceTiersInner object to access its operations.
     * @return the LocationBasedPerformanceTiersInner object.
     */
    public LocationBasedPerformanceTiersInner locationBasedPerformanceTiers() {
        return this.locationBasedPerformanceTiers;
    }

    /**
     * The CheckNameAvailabilitysInner object to access its operations.
     */
    private CheckNameAvailabilitysInner checkNameAvailabilitys;

    /**
     * Gets the CheckNameAvailabilitysInner object to access its operations.
     * @return the CheckNameAvailabilitysInner object.
     */
    public CheckNameAvailabilitysInner checkNameAvailabilitys() {
        return this.checkNameAvailabilitys;
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
     * The QueryTextsInner object to access its operations.
     */
    private QueryTextsInner queryTexts;

    /**
     * Gets the QueryTextsInner object to access its operations.
     * @return the QueryTextsInner object.
     */
    public QueryTextsInner queryTexts() {
        return this.queryTexts;
    }

    /**
     * The TopQueryStatisticsInner object to access its operations.
     */
    private TopQueryStatisticsInner topQueryStatistics;

    /**
     * Gets the TopQueryStatisticsInner object to access its operations.
     * @return the TopQueryStatisticsInner object.
     */
    public TopQueryStatisticsInner topQueryStatistics() {
        return this.topQueryStatistics;
    }

    /**
     * The WaitStatisticsInner object to access its operations.
     */
    private WaitStatisticsInner waitStatistics;

    /**
     * Gets the WaitStatisticsInner object to access its operations.
     * @return the WaitStatisticsInner object.
     */
    public WaitStatisticsInner waitStatistics() {
        return this.waitStatistics;
    }

    /**
     * The AdvisorsInner object to access its operations.
     */
    private AdvisorsInner advisors;

    /**
     * Gets the AdvisorsInner object to access its operations.
     * @return the AdvisorsInner object.
     */
    public AdvisorsInner advisors() {
        return this.advisors;
    }

    /**
     * The RecommendedActionsInner object to access its operations.
     */
    private RecommendedActionsInner recommendedActions;

    /**
     * Gets the RecommendedActionsInner object to access its operations.
     * @return the RecommendedActionsInner object.
     */
    public RecommendedActionsInner recommendedActions() {
        return this.recommendedActions;
    }

    /**
     * The LocationBasedRecommendedActionSessionsOperationStatusInner object to access its operations.
     */
    private LocationBasedRecommendedActionSessionsOperationStatusInner locationBasedRecommendedActionSessionsOperationStatus;

    /**
     * Gets the LocationBasedRecommendedActionSessionsOperationStatusInner object to access its operations.
     * @return the LocationBasedRecommendedActionSessionsOperationStatusInner object.
     */
    public LocationBasedRecommendedActionSessionsOperationStatusInner locationBasedRecommendedActionSessionsOperationStatus() {
        return this.locationBasedRecommendedActionSessionsOperationStatus;
    }

    /**
     * The LocationBasedRecommendedActionSessionsResultsInner object to access its operations.
     */
    private LocationBasedRecommendedActionSessionsResultsInner locationBasedRecommendedActionSessionsResults;

    /**
     * Gets the LocationBasedRecommendedActionSessionsResultsInner object to access its operations.
     * @return the LocationBasedRecommendedActionSessionsResultsInner object.
     */
    public LocationBasedRecommendedActionSessionsResultsInner locationBasedRecommendedActionSessionsResults() {
        return this.locationBasedRecommendedActionSessionsResults;
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
     * The ServerSecurityAlertPoliciesInner object to access its operations.
     */
    private ServerSecurityAlertPoliciesInner serverSecurityAlertPolicies;

    /**
     * Gets the ServerSecurityAlertPoliciesInner object to access its operations.
     * @return the ServerSecurityAlertPoliciesInner object.
     */
    public ServerSecurityAlertPoliciesInner serverSecurityAlertPolicies() {
        return this.serverSecurityAlertPolicies;
    }

    /**
     * Initializes an instance of MariaDBManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public MariaDBManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of MariaDBManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public MariaDBManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of MariaDBManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public MariaDBManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.servers = new ServersInner(restClient().retrofit(), this);
        this.replicas = new ReplicasInner(restClient().retrofit(), this);
        this.firewallRules = new FirewallRulesInner(restClient().retrofit(), this);
        this.virtualNetworkRules = new VirtualNetworkRulesInner(restClient().retrofit(), this);
        this.databases = new DatabasesInner(restClient().retrofit(), this);
        this.configurations = new ConfigurationsInner(restClient().retrofit(), this);
        this.logFiles = new LogFilesInner(restClient().retrofit(), this);
        this.locationBasedPerformanceTiers = new LocationBasedPerformanceTiersInner(restClient().retrofit(), this);
        this.checkNameAvailabilitys = new CheckNameAvailabilitysInner(restClient().retrofit(), this);
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.queryTexts = new QueryTextsInner(restClient().retrofit(), this);
        this.topQueryStatistics = new TopQueryStatisticsInner(restClient().retrofit(), this);
        this.waitStatistics = new WaitStatisticsInner(restClient().retrofit(), this);
        this.advisors = new AdvisorsInner(restClient().retrofit(), this);
        this.recommendedActions = new RecommendedActionsInner(restClient().retrofit(), this);
        this.locationBasedRecommendedActionSessionsOperationStatus = new LocationBasedRecommendedActionSessionsOperationStatusInner(restClient().retrofit(), this);
        this.locationBasedRecommendedActionSessionsResults = new LocationBasedRecommendedActionSessionsResultsInner(restClient().retrofit(), this);
        this.privateEndpointConnections = new PrivateEndpointConnectionsInner(restClient().retrofit(), this);
        this.privateLinkResources = new PrivateLinkResourcesInner(restClient().retrofit(), this);
        this.serverSecurityAlertPolicies = new ServerSecurityAlertPoliciesInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
        initializeService();
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "MariaDBManagementClient", "2020-01-01");
    }

    private void initializeService() {
        service = restClient().retrofit().create(MariaDBManagementClientService.class);
    }

    /**
     * The interface defining all the services for MariaDBManagementClient to be
     * used by Retrofit to perform actually REST calls.
     */
    interface MariaDBManagementClientService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.mariadb.v2020_01_01.MariaDBManagementClient createRecommendedActionSession" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBforMariaDB/servers/{serverName}/advisors/{advisorName}/createRecommendedActionSession")
        Observable<Response<ResponseBody>> createRecommendedActionSession(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("advisorName") String advisorName, @Query("api-version") String apiVersion, @Query("databaseName") String databaseName, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.mariadb.v2020_01_01.MariaDBManagementClient beginCreateRecommendedActionSession" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBforMariaDB/servers/{serverName}/advisors/{advisorName}/createRecommendedActionSession")
        Observable<Response<ResponseBody>> beginCreateRecommendedActionSession(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("advisorName") String advisorName, @Query("api-version") String apiVersion, @Query("databaseName") String databaseName, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Create recommendation action session for the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void createRecommendedActionSession(String resourceGroupName, String serverName, String advisorName, String databaseName) {
        createRecommendedActionSessionWithServiceResponseAsync(resourceGroupName, serverName, advisorName, databaseName).toBlocking().last().body();
    }

    /**
     * Create recommendation action session for the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @param databaseName The name of the database.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> createRecommendedActionSessionAsync(String resourceGroupName, String serverName, String advisorName, String databaseName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(createRecommendedActionSessionWithServiceResponseAsync(resourceGroupName, serverName, advisorName, databaseName), serviceCallback);
    }

    /**
     * Create recommendation action session for the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<Void> createRecommendedActionSessionAsync(String resourceGroupName, String serverName, String advisorName, String databaseName) {
        return createRecommendedActionSessionWithServiceResponseAsync(resourceGroupName, serverName, advisorName, databaseName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Create recommendation action session for the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<Void>> createRecommendedActionSessionWithServiceResponseAsync(String resourceGroupName, String serverName, String advisorName, String databaseName) {
        if (this.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (advisorName == null) {
            throw new IllegalArgumentException("Parameter advisorName is required and cannot be null.");
        }
        if (databaseName == null) {
            throw new IllegalArgumentException("Parameter databaseName is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        Observable<Response<ResponseBody>> observable = service.createRecommendedActionSession(this.subscriptionId(), resourceGroupName, serverName, advisorName, apiVersion, databaseName, this.acceptLanguage(), this.userAgent());
        return getAzureClient().getPostOrDeleteResultAsync(observable, new TypeToken<Void>() { }.getType());
    }

    /**
     * Create recommendation action session for the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void beginCreateRecommendedActionSession(String resourceGroupName, String serverName, String advisorName, String databaseName) {
        beginCreateRecommendedActionSessionWithServiceResponseAsync(resourceGroupName, serverName, advisorName, databaseName).toBlocking().single().body();
    }

    /**
     * Create recommendation action session for the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @param databaseName The name of the database.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> beginCreateRecommendedActionSessionAsync(String resourceGroupName, String serverName, String advisorName, String databaseName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(beginCreateRecommendedActionSessionWithServiceResponseAsync(resourceGroupName, serverName, advisorName, databaseName), serviceCallback);
    }

    /**
     * Create recommendation action session for the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> beginCreateRecommendedActionSessionAsync(String resourceGroupName, String serverName, String advisorName, String databaseName) {
        return beginCreateRecommendedActionSessionWithServiceResponseAsync(resourceGroupName, serverName, advisorName, databaseName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Create recommendation action session for the advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> beginCreateRecommendedActionSessionWithServiceResponseAsync(String resourceGroupName, String serverName, String advisorName, String databaseName) {
        if (this.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (advisorName == null) {
            throw new IllegalArgumentException("Parameter advisorName is required and cannot be null.");
        }
        if (databaseName == null) {
            throw new IllegalArgumentException("Parameter databaseName is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.beginCreateRecommendedActionSession(this.subscriptionId(), resourceGroupName, serverName, advisorName, apiVersion, databaseName, this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = beginCreateRecommendedActionSessionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> beginCreateRecommendedActionSessionDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
