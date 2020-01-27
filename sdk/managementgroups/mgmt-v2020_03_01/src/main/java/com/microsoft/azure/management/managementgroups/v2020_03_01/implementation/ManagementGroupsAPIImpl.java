/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managementgroups.v2020_03_01.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.azure.management.managementgroups.v2020_03_01.CheckNameAvailabilityRequest;
import com.microsoft.azure.management.managementgroups.v2020_03_01.ErrorResponseException;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * Initializes a new instance of the ManagementGroupsAPIImpl class.
 */
public class ManagementGroupsAPIImpl extends AzureServiceClient {
    /** The Retrofit service to perform REST calls. */
    private ManagementGroupsAPIService service;
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** Version of the API to be used with the client request. The current version is 2018-01-01-preview. */
    private String apiVersion;

    /**
     * Gets Version of the API to be used with the client request. The current version is 2018-01-01-preview.
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
    public ManagementGroupsAPIImpl withAcceptLanguage(String acceptLanguage) {
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
    public ManagementGroupsAPIImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
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
    public ManagementGroupsAPIImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The ManagementGroupsInner object to access its operations.
     */
    private ManagementGroupsInner managementGroups;

    /**
     * Gets the ManagementGroupsInner object to access its operations.
     * @return the ManagementGroupsInner object.
     */
    public ManagementGroupsInner managementGroups() {
        return this.managementGroups;
    }

    /**
     * The ManagementGroupSubscriptionsInner object to access its operations.
     */
    private ManagementGroupSubscriptionsInner managementGroupSubscriptions;

    /**
     * Gets the ManagementGroupSubscriptionsInner object to access its operations.
     * @return the ManagementGroupSubscriptionsInner object.
     */
    public ManagementGroupSubscriptionsInner managementGroupSubscriptions() {
        return this.managementGroupSubscriptions;
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
     * The EntitiesInner object to access its operations.
     */
    private EntitiesInner entities;

    /**
     * Gets the EntitiesInner object to access its operations.
     * @return the EntitiesInner object.
     */
    public EntitiesInner entities() {
        return this.entities;
    }

    /**
     * Initializes an instance of ManagementGroupsAPI client.
     *
     * @param credentials the management credentials for Azure
     */
    public ManagementGroupsAPIImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of ManagementGroupsAPI client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public ManagementGroupsAPIImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of ManagementGroupsAPI client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public ManagementGroupsAPIImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2020-03-01";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.managementGroups = new ManagementGroupsInner(restClient().retrofit(), this);
        this.managementGroupSubscriptions = new ManagementGroupSubscriptionsInner(restClient().retrofit(), this);
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.entities = new EntitiesInner(restClient().retrofit(), this);
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
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "ManagementGroupsAPI", "2020-03-01");
    }

    private void initializeService() {
        service = restClient().retrofit().create(ManagementGroupsAPIService.class);
    }

    /**
     * The interface defining all the services for ManagementGroupsAPI to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ManagementGroupsAPIService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.managementgroups.v2020_03_01.ManagementGroupsAPI checkNameAvailability" })
        @POST("providers/Microsoft.Management/checkNameAvailability")
        Observable<Response<ResponseBody>> checkNameAvailability(@Query("api-version") String apiVersion, @Body CheckNameAvailabilityRequest checkNameAvailabilityRequest, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.managementgroups.v2020_03_01.ManagementGroupsAPI startTenantBackfill" })
        @POST("providers/Microsoft.Management/startTenantBackfill")
        Observable<Response<ResponseBody>> startTenantBackfill(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.managementgroups.v2020_03_01.ManagementGroupsAPI tenantBackfillStatus" })
        @POST("providers/Microsoft.Management/tenantBackfillStatus")
        Observable<Response<ResponseBody>> tenantBackfillStatus(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Checks if the specified management group name is valid and unique.
     *
     * @param checkNameAvailabilityRequest Management group name availability check parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the CheckNameAvailabilityResultInner object if successful.
     */
    public CheckNameAvailabilityResultInner checkNameAvailability(CheckNameAvailabilityRequest checkNameAvailabilityRequest) {
        return checkNameAvailabilityWithServiceResponseAsync(checkNameAvailabilityRequest).toBlocking().single().body();
    }

    /**
     * Checks if the specified management group name is valid and unique.
     *
     * @param checkNameAvailabilityRequest Management group name availability check parameters.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<CheckNameAvailabilityResultInner> checkNameAvailabilityAsync(CheckNameAvailabilityRequest checkNameAvailabilityRequest, final ServiceCallback<CheckNameAvailabilityResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(checkNameAvailabilityWithServiceResponseAsync(checkNameAvailabilityRequest), serviceCallback);
    }

    /**
     * Checks if the specified management group name is valid and unique.
     *
     * @param checkNameAvailabilityRequest Management group name availability check parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CheckNameAvailabilityResultInner object
     */
    public Observable<CheckNameAvailabilityResultInner> checkNameAvailabilityAsync(CheckNameAvailabilityRequest checkNameAvailabilityRequest) {
        return checkNameAvailabilityWithServiceResponseAsync(checkNameAvailabilityRequest).map(new Func1<ServiceResponse<CheckNameAvailabilityResultInner>, CheckNameAvailabilityResultInner>() {
            @Override
            public CheckNameAvailabilityResultInner call(ServiceResponse<CheckNameAvailabilityResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Checks if the specified management group name is valid and unique.
     *
     * @param checkNameAvailabilityRequest Management group name availability check parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CheckNameAvailabilityResultInner object
     */
    public Observable<ServiceResponse<CheckNameAvailabilityResultInner>> checkNameAvailabilityWithServiceResponseAsync(CheckNameAvailabilityRequest checkNameAvailabilityRequest) {
        if (this.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.apiVersion() is required and cannot be null.");
        }
        if (checkNameAvailabilityRequest == null) {
            throw new IllegalArgumentException("Parameter checkNameAvailabilityRequest is required and cannot be null.");
        }
        Validator.validate(checkNameAvailabilityRequest);
        return service.checkNameAvailability(this.apiVersion(), checkNameAvailabilityRequest, this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<CheckNameAvailabilityResultInner>>>() {
                @Override
                public Observable<ServiceResponse<CheckNameAvailabilityResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<CheckNameAvailabilityResultInner> clientResponse = checkNameAvailabilityDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<CheckNameAvailabilityResultInner> checkNameAvailabilityDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<CheckNameAvailabilityResultInner, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<CheckNameAvailabilityResultInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Starts backfilling subscriptions for the Tenant.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TenantBackfillStatusResultInner object if successful.
     */
    public TenantBackfillStatusResultInner startTenantBackfill() {
        return startTenantBackfillWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Starts backfilling subscriptions for the Tenant.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TenantBackfillStatusResultInner> startTenantBackfillAsync(final ServiceCallback<TenantBackfillStatusResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(startTenantBackfillWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Starts backfilling subscriptions for the Tenant.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TenantBackfillStatusResultInner object
     */
    public Observable<TenantBackfillStatusResultInner> startTenantBackfillAsync() {
        return startTenantBackfillWithServiceResponseAsync().map(new Func1<ServiceResponse<TenantBackfillStatusResultInner>, TenantBackfillStatusResultInner>() {
            @Override
            public TenantBackfillStatusResultInner call(ServiceResponse<TenantBackfillStatusResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Starts backfilling subscriptions for the Tenant.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TenantBackfillStatusResultInner object
     */
    public Observable<ServiceResponse<TenantBackfillStatusResultInner>> startTenantBackfillWithServiceResponseAsync() {
        if (this.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.apiVersion() is required and cannot be null.");
        }
        return service.startTenantBackfill(this.apiVersion(), this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TenantBackfillStatusResultInner>>>() {
                @Override
                public Observable<ServiceResponse<TenantBackfillStatusResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TenantBackfillStatusResultInner> clientResponse = startTenantBackfillDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<TenantBackfillStatusResultInner> startTenantBackfillDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<TenantBackfillStatusResultInner, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<TenantBackfillStatusResultInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets tenant backfill status.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TenantBackfillStatusResultInner object if successful.
     */
    public TenantBackfillStatusResultInner tenantBackfillStatus() {
        return tenantBackfillStatusWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Gets tenant backfill status.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TenantBackfillStatusResultInner> tenantBackfillStatusAsync(final ServiceCallback<TenantBackfillStatusResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(tenantBackfillStatusWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Gets tenant backfill status.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TenantBackfillStatusResultInner object
     */
    public Observable<TenantBackfillStatusResultInner> tenantBackfillStatusAsync() {
        return tenantBackfillStatusWithServiceResponseAsync().map(new Func1<ServiceResponse<TenantBackfillStatusResultInner>, TenantBackfillStatusResultInner>() {
            @Override
            public TenantBackfillStatusResultInner call(ServiceResponse<TenantBackfillStatusResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets tenant backfill status.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TenantBackfillStatusResultInner object
     */
    public Observable<ServiceResponse<TenantBackfillStatusResultInner>> tenantBackfillStatusWithServiceResponseAsync() {
        if (this.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.apiVersion() is required and cannot be null.");
        }
        return service.tenantBackfillStatus(this.apiVersion(), this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TenantBackfillStatusResultInner>>>() {
                @Override
                public Observable<ServiceResponse<TenantBackfillStatusResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TenantBackfillStatusResultInner> clientResponse = tenantBackfillStatusDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<TenantBackfillStatusResultInner> tenantBackfillStatusDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<TenantBackfillStatusResultInner, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<TenantBackfillStatusResultInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
