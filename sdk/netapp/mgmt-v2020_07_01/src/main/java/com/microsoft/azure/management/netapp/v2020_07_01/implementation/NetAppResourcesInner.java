/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_07_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.netapp.v2020_07_01.CheckNameResourceTypes;
import com.microsoft.azure.management.netapp.v2020_07_01.CheckQuotaNameResourceTypes;
import com.microsoft.azure.management.netapp.v2020_07_01.QuotaAvailabilityRequest;
import com.microsoft.azure.management.netapp.v2020_07_01.ResourceNameAvailabilityRequest;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in NetAppResources.
 */
public class NetAppResourcesInner {
    /** The Retrofit service to perform REST calls. */
    private NetAppResourcesService service;
    /** The service client containing this operation class. */
    private AzureNetAppFilesManagementClientImpl client;

    /**
     * Initializes an instance of NetAppResourcesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public NetAppResourcesInner(Retrofit retrofit, AzureNetAppFilesManagementClientImpl client) {
        this.service = retrofit.create(NetAppResourcesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for NetAppResources to be
     * used by Retrofit to perform actually REST calls.
     */
    interface NetAppResourcesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.netapp.v2020_07_01.NetAppResources checkNameAvailability" })
        @POST("subscriptions/{subscriptionId}/providers/Microsoft.NetApp/locations/{location}/checkNameAvailability")
        Observable<Response<ResponseBody>> checkNameAvailability(@Path("subscriptionId") String subscriptionId, @Path("location") String location, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body ResourceNameAvailabilityRequest body, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.netapp.v2020_07_01.NetAppResources checkFilePathAvailability" })
        @POST("subscriptions/{subscriptionId}/providers/Microsoft.NetApp/locations/{location}/checkFilePathAvailability")
        Observable<Response<ResponseBody>> checkFilePathAvailability(@Path("subscriptionId") String subscriptionId, @Path("location") String location, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body ResourceNameAvailabilityRequest body, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.netapp.v2020_07_01.NetAppResources checkQuotaAvailability" })
        @POST("subscriptions/{subscriptionId}/providers/Microsoft.NetApp/locations/{location}/checkQuotaAvailability")
        Observable<Response<ResponseBody>> checkQuotaAvailability(@Path("subscriptionId") String subscriptionId, @Path("location") String location, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body QuotaAvailabilityRequest body, @Header("User-Agent") String userAgent);

    }

    /**
     * Check resource name availability.
     * Check if a resource name is available.
     *
     * @param location The location
     * @param name Resource name to verify.
     * @param type Resource type used for verification. Possible values include: 'Microsoft.NetApp/netAppAccounts', 'Microsoft.NetApp/netAppAccounts/capacityPools', 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes', 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes/snapshots'
     * @param resourceGroup Resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the CheckAvailabilityResponseInner object if successful.
     */
    public CheckAvailabilityResponseInner checkNameAvailability(String location, String name, CheckNameResourceTypes type, String resourceGroup) {
        return checkNameAvailabilityWithServiceResponseAsync(location, name, type, resourceGroup).toBlocking().single().body();
    }

    /**
     * Check resource name availability.
     * Check if a resource name is available.
     *
     * @param location The location
     * @param name Resource name to verify.
     * @param type Resource type used for verification. Possible values include: 'Microsoft.NetApp/netAppAccounts', 'Microsoft.NetApp/netAppAccounts/capacityPools', 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes', 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes/snapshots'
     * @param resourceGroup Resource group name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<CheckAvailabilityResponseInner> checkNameAvailabilityAsync(String location, String name, CheckNameResourceTypes type, String resourceGroup, final ServiceCallback<CheckAvailabilityResponseInner> serviceCallback) {
        return ServiceFuture.fromResponse(checkNameAvailabilityWithServiceResponseAsync(location, name, type, resourceGroup), serviceCallback);
    }

    /**
     * Check resource name availability.
     * Check if a resource name is available.
     *
     * @param location The location
     * @param name Resource name to verify.
     * @param type Resource type used for verification. Possible values include: 'Microsoft.NetApp/netAppAccounts', 'Microsoft.NetApp/netAppAccounts/capacityPools', 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes', 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes/snapshots'
     * @param resourceGroup Resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CheckAvailabilityResponseInner object
     */
    public Observable<CheckAvailabilityResponseInner> checkNameAvailabilityAsync(String location, String name, CheckNameResourceTypes type, String resourceGroup) {
        return checkNameAvailabilityWithServiceResponseAsync(location, name, type, resourceGroup).map(new Func1<ServiceResponse<CheckAvailabilityResponseInner>, CheckAvailabilityResponseInner>() {
            @Override
            public CheckAvailabilityResponseInner call(ServiceResponse<CheckAvailabilityResponseInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Check resource name availability.
     * Check if a resource name is available.
     *
     * @param location The location
     * @param name Resource name to verify.
     * @param type Resource type used for verification. Possible values include: 'Microsoft.NetApp/netAppAccounts', 'Microsoft.NetApp/netAppAccounts/capacityPools', 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes', 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes/snapshots'
     * @param resourceGroup Resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CheckAvailabilityResponseInner object
     */
    public Observable<ServiceResponse<CheckAvailabilityResponseInner>> checkNameAvailabilityWithServiceResponseAsync(String location, String name, CheckNameResourceTypes type, String resourceGroup) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (type == null) {
            throw new IllegalArgumentException("Parameter type is required and cannot be null.");
        }
        if (resourceGroup == null) {
            throw new IllegalArgumentException("Parameter resourceGroup is required and cannot be null.");
        }
        ResourceNameAvailabilityRequest body = new ResourceNameAvailabilityRequest();
        body.withName(name);
        body.withType(type);
        body.withResourceGroup(resourceGroup);
        return service.checkNameAvailability(this.client.subscriptionId(), location, this.client.apiVersion(), this.client.acceptLanguage(), body, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<CheckAvailabilityResponseInner>>>() {
                @Override
                public Observable<ServiceResponse<CheckAvailabilityResponseInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<CheckAvailabilityResponseInner> clientResponse = checkNameAvailabilityDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<CheckAvailabilityResponseInner> checkNameAvailabilityDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<CheckAvailabilityResponseInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<CheckAvailabilityResponseInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Check file path availability.
     * Check if a file path is available.
     *
     * @param location The location
     * @param name Resource name to verify.
     * @param type Resource type used for verification. Possible values include: 'Microsoft.NetApp/netAppAccounts', 'Microsoft.NetApp/netAppAccounts/capacityPools', 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes', 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes/snapshots'
     * @param resourceGroup Resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the CheckAvailabilityResponseInner object if successful.
     */
    public CheckAvailabilityResponseInner checkFilePathAvailability(String location, String name, CheckNameResourceTypes type, String resourceGroup) {
        return checkFilePathAvailabilityWithServiceResponseAsync(location, name, type, resourceGroup).toBlocking().single().body();
    }

    /**
     * Check file path availability.
     * Check if a file path is available.
     *
     * @param location The location
     * @param name Resource name to verify.
     * @param type Resource type used for verification. Possible values include: 'Microsoft.NetApp/netAppAccounts', 'Microsoft.NetApp/netAppAccounts/capacityPools', 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes', 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes/snapshots'
     * @param resourceGroup Resource group name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<CheckAvailabilityResponseInner> checkFilePathAvailabilityAsync(String location, String name, CheckNameResourceTypes type, String resourceGroup, final ServiceCallback<CheckAvailabilityResponseInner> serviceCallback) {
        return ServiceFuture.fromResponse(checkFilePathAvailabilityWithServiceResponseAsync(location, name, type, resourceGroup), serviceCallback);
    }

    /**
     * Check file path availability.
     * Check if a file path is available.
     *
     * @param location The location
     * @param name Resource name to verify.
     * @param type Resource type used for verification. Possible values include: 'Microsoft.NetApp/netAppAccounts', 'Microsoft.NetApp/netAppAccounts/capacityPools', 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes', 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes/snapshots'
     * @param resourceGroup Resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CheckAvailabilityResponseInner object
     */
    public Observable<CheckAvailabilityResponseInner> checkFilePathAvailabilityAsync(String location, String name, CheckNameResourceTypes type, String resourceGroup) {
        return checkFilePathAvailabilityWithServiceResponseAsync(location, name, type, resourceGroup).map(new Func1<ServiceResponse<CheckAvailabilityResponseInner>, CheckAvailabilityResponseInner>() {
            @Override
            public CheckAvailabilityResponseInner call(ServiceResponse<CheckAvailabilityResponseInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Check file path availability.
     * Check if a file path is available.
     *
     * @param location The location
     * @param name Resource name to verify.
     * @param type Resource type used for verification. Possible values include: 'Microsoft.NetApp/netAppAccounts', 'Microsoft.NetApp/netAppAccounts/capacityPools', 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes', 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes/snapshots'
     * @param resourceGroup Resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CheckAvailabilityResponseInner object
     */
    public Observable<ServiceResponse<CheckAvailabilityResponseInner>> checkFilePathAvailabilityWithServiceResponseAsync(String location, String name, CheckNameResourceTypes type, String resourceGroup) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (type == null) {
            throw new IllegalArgumentException("Parameter type is required and cannot be null.");
        }
        if (resourceGroup == null) {
            throw new IllegalArgumentException("Parameter resourceGroup is required and cannot be null.");
        }
        ResourceNameAvailabilityRequest body = new ResourceNameAvailabilityRequest();
        body.withName(name);
        body.withType(type);
        body.withResourceGroup(resourceGroup);
        return service.checkFilePathAvailability(this.client.subscriptionId(), location, this.client.apiVersion(), this.client.acceptLanguage(), body, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<CheckAvailabilityResponseInner>>>() {
                @Override
                public Observable<ServiceResponse<CheckAvailabilityResponseInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<CheckAvailabilityResponseInner> clientResponse = checkFilePathAvailabilityDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<CheckAvailabilityResponseInner> checkFilePathAvailabilityDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<CheckAvailabilityResponseInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<CheckAvailabilityResponseInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Check quota availability.
     * Check if a quota is available.
     *
     * @param location The location
     * @param name Name of the resource to verify.
     * @param type Resource type used for verification. Possible values include: 'Microsoft.NetApp/netAppAccounts', 'Microsoft.NetApp/netAppAccounts/capacityPools', 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes', 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes/snapshots'
     * @param resourceGroup Resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the CheckAvailabilityResponseInner object if successful.
     */
    public CheckAvailabilityResponseInner checkQuotaAvailability(String location, String name, CheckQuotaNameResourceTypes type, String resourceGroup) {
        return checkQuotaAvailabilityWithServiceResponseAsync(location, name, type, resourceGroup).toBlocking().single().body();
    }

    /**
     * Check quota availability.
     * Check if a quota is available.
     *
     * @param location The location
     * @param name Name of the resource to verify.
     * @param type Resource type used for verification. Possible values include: 'Microsoft.NetApp/netAppAccounts', 'Microsoft.NetApp/netAppAccounts/capacityPools', 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes', 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes/snapshots'
     * @param resourceGroup Resource group name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<CheckAvailabilityResponseInner> checkQuotaAvailabilityAsync(String location, String name, CheckQuotaNameResourceTypes type, String resourceGroup, final ServiceCallback<CheckAvailabilityResponseInner> serviceCallback) {
        return ServiceFuture.fromResponse(checkQuotaAvailabilityWithServiceResponseAsync(location, name, type, resourceGroup), serviceCallback);
    }

    /**
     * Check quota availability.
     * Check if a quota is available.
     *
     * @param location The location
     * @param name Name of the resource to verify.
     * @param type Resource type used for verification. Possible values include: 'Microsoft.NetApp/netAppAccounts', 'Microsoft.NetApp/netAppAccounts/capacityPools', 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes', 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes/snapshots'
     * @param resourceGroup Resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CheckAvailabilityResponseInner object
     */
    public Observable<CheckAvailabilityResponseInner> checkQuotaAvailabilityAsync(String location, String name, CheckQuotaNameResourceTypes type, String resourceGroup) {
        return checkQuotaAvailabilityWithServiceResponseAsync(location, name, type, resourceGroup).map(new Func1<ServiceResponse<CheckAvailabilityResponseInner>, CheckAvailabilityResponseInner>() {
            @Override
            public CheckAvailabilityResponseInner call(ServiceResponse<CheckAvailabilityResponseInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Check quota availability.
     * Check if a quota is available.
     *
     * @param location The location
     * @param name Name of the resource to verify.
     * @param type Resource type used for verification. Possible values include: 'Microsoft.NetApp/netAppAccounts', 'Microsoft.NetApp/netAppAccounts/capacityPools', 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes', 'Microsoft.NetApp/netAppAccounts/capacityPools/volumes/snapshots'
     * @param resourceGroup Resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CheckAvailabilityResponseInner object
     */
    public Observable<ServiceResponse<CheckAvailabilityResponseInner>> checkQuotaAvailabilityWithServiceResponseAsync(String location, String name, CheckQuotaNameResourceTypes type, String resourceGroup) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (type == null) {
            throw new IllegalArgumentException("Parameter type is required and cannot be null.");
        }
        if (resourceGroup == null) {
            throw new IllegalArgumentException("Parameter resourceGroup is required and cannot be null.");
        }
        QuotaAvailabilityRequest body = new QuotaAvailabilityRequest();
        body.withName(name);
        body.withType(type);
        body.withResourceGroup(resourceGroup);
        return service.checkQuotaAvailability(this.client.subscriptionId(), location, this.client.apiVersion(), this.client.acceptLanguage(), body, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<CheckAvailabilityResponseInner>>>() {
                @Override
                public Observable<ServiceResponse<CheckAvailabilityResponseInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<CheckAvailabilityResponseInner> clientResponse = checkQuotaAvailabilityDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<CheckAvailabilityResponseInner> checkQuotaAvailabilityDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<CheckAvailabilityResponseInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<CheckAvailabilityResponseInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
