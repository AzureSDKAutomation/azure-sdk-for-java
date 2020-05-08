/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.storage.v2019_06_01.CorsRules;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in QueueServices.
 */
public class QueueServicesInner {
    /** The Retrofit service to perform REST calls. */
    private QueueServicesService service;
    /** The service client containing this operation class. */
    private StorageManagementClientImpl client;

    /**
     * Initializes an instance of QueueServicesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public QueueServicesInner(Retrofit retrofit, StorageManagementClientImpl client) {
        this.service = retrofit.create(QueueServicesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for QueueServices to be
     * used by Retrofit to perform actually REST calls.
     */
    interface QueueServicesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.storage.v2019_06_01.QueueServices setServiceProperties" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}/queueServices/{queueServiceName}")
        Observable<Response<ResponseBody>> setServiceProperties(@Path("resourceGroupName") String resourceGroupName, @Path("accountName") String accountName, @Path("subscriptionId") String subscriptionId, @Path("queueServiceName") String queueServiceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body QueueServicePropertiesInner parameters, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.storage.v2019_06_01.QueueServices getServiceProperties" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}/queueServices/{queueServiceName}")
        Observable<Response<ResponseBody>> getServiceProperties(@Path("resourceGroupName") String resourceGroupName, @Path("accountName") String accountName, @Path("subscriptionId") String subscriptionId, @Path("queueServiceName") String queueServiceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Sets the properties of a storage account’s Queue service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the QueueServicePropertiesInner object if successful.
     */
    public QueueServicePropertiesInner setServiceProperties(String resourceGroupName, String accountName) {
        return setServicePropertiesWithServiceResponseAsync(resourceGroupName, accountName).toBlocking().single().body();
    }

    /**
     * Sets the properties of a storage account’s Queue service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<QueueServicePropertiesInner> setServicePropertiesAsync(String resourceGroupName, String accountName, final ServiceCallback<QueueServicePropertiesInner> serviceCallback) {
        return ServiceFuture.fromResponse(setServicePropertiesWithServiceResponseAsync(resourceGroupName, accountName), serviceCallback);
    }

    /**
     * Sets the properties of a storage account’s Queue service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the QueueServicePropertiesInner object
     */
    public Observable<QueueServicePropertiesInner> setServicePropertiesAsync(String resourceGroupName, String accountName) {
        return setServicePropertiesWithServiceResponseAsync(resourceGroupName, accountName).map(new Func1<ServiceResponse<QueueServicePropertiesInner>, QueueServicePropertiesInner>() {
            @Override
            public QueueServicePropertiesInner call(ServiceResponse<QueueServicePropertiesInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Sets the properties of a storage account’s Queue service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the QueueServicePropertiesInner object
     */
    public Observable<ServiceResponse<QueueServicePropertiesInner>> setServicePropertiesWithServiceResponseAsync(String resourceGroupName, String accountName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (accountName == null) {
            throw new IllegalArgumentException("Parameter accountName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String queueServiceName = "default";
        final CorsRules cors = null;
        QueueServicePropertiesInner parameters = new QueueServicePropertiesInner();
        parameters.withCors(null);
        return service.setServiceProperties(resourceGroupName, accountName, this.client.subscriptionId(), queueServiceName, this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<QueueServicePropertiesInner>>>() {
                @Override
                public Observable<ServiceResponse<QueueServicePropertiesInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<QueueServicePropertiesInner> clientResponse = setServicePropertiesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Sets the properties of a storage account’s Queue service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param cors Specifies CORS rules for the Queue service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the Queue service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the QueueServicePropertiesInner object if successful.
     */
    public QueueServicePropertiesInner setServiceProperties(String resourceGroupName, String accountName, CorsRules cors) {
        return setServicePropertiesWithServiceResponseAsync(resourceGroupName, accountName, cors).toBlocking().single().body();
    }

    /**
     * Sets the properties of a storage account’s Queue service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param cors Specifies CORS rules for the Queue service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the Queue service.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<QueueServicePropertiesInner> setServicePropertiesAsync(String resourceGroupName, String accountName, CorsRules cors, final ServiceCallback<QueueServicePropertiesInner> serviceCallback) {
        return ServiceFuture.fromResponse(setServicePropertiesWithServiceResponseAsync(resourceGroupName, accountName, cors), serviceCallback);
    }

    /**
     * Sets the properties of a storage account’s Queue service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param cors Specifies CORS rules for the Queue service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the Queue service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the QueueServicePropertiesInner object
     */
    public Observable<QueueServicePropertiesInner> setServicePropertiesAsync(String resourceGroupName, String accountName, CorsRules cors) {
        return setServicePropertiesWithServiceResponseAsync(resourceGroupName, accountName, cors).map(new Func1<ServiceResponse<QueueServicePropertiesInner>, QueueServicePropertiesInner>() {
            @Override
            public QueueServicePropertiesInner call(ServiceResponse<QueueServicePropertiesInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Sets the properties of a storage account’s Queue service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param cors Specifies CORS rules for the Queue service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the Queue service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the QueueServicePropertiesInner object
     */
    public Observable<ServiceResponse<QueueServicePropertiesInner>> setServicePropertiesWithServiceResponseAsync(String resourceGroupName, String accountName, CorsRules cors) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (accountName == null) {
            throw new IllegalArgumentException("Parameter accountName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(cors);
        final String queueServiceName = "default";
        QueueServicePropertiesInner parameters = new QueueServicePropertiesInner();
        parameters.withCors(cors);
        return service.setServiceProperties(resourceGroupName, accountName, this.client.subscriptionId(), queueServiceName, this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<QueueServicePropertiesInner>>>() {
                @Override
                public Observable<ServiceResponse<QueueServicePropertiesInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<QueueServicePropertiesInner> clientResponse = setServicePropertiesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<QueueServicePropertiesInner> setServicePropertiesDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<QueueServicePropertiesInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<QueueServicePropertiesInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the properties of a storage account’s Queue service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the QueueServicePropertiesInner object if successful.
     */
    public QueueServicePropertiesInner getServiceProperties(String resourceGroupName, String accountName) {
        return getServicePropertiesWithServiceResponseAsync(resourceGroupName, accountName).toBlocking().single().body();
    }

    /**
     * Gets the properties of a storage account’s Queue service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<QueueServicePropertiesInner> getServicePropertiesAsync(String resourceGroupName, String accountName, final ServiceCallback<QueueServicePropertiesInner> serviceCallback) {
        return ServiceFuture.fromResponse(getServicePropertiesWithServiceResponseAsync(resourceGroupName, accountName), serviceCallback);
    }

    /**
     * Gets the properties of a storage account’s Queue service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the QueueServicePropertiesInner object
     */
    public Observable<QueueServicePropertiesInner> getServicePropertiesAsync(String resourceGroupName, String accountName) {
        return getServicePropertiesWithServiceResponseAsync(resourceGroupName, accountName).map(new Func1<ServiceResponse<QueueServicePropertiesInner>, QueueServicePropertiesInner>() {
            @Override
            public QueueServicePropertiesInner call(ServiceResponse<QueueServicePropertiesInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the properties of a storage account’s Queue service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the QueueServicePropertiesInner object
     */
    public Observable<ServiceResponse<QueueServicePropertiesInner>> getServicePropertiesWithServiceResponseAsync(String resourceGroupName, String accountName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (accountName == null) {
            throw new IllegalArgumentException("Parameter accountName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String queueServiceName = "default";
        return service.getServiceProperties(resourceGroupName, accountName, this.client.subscriptionId(), queueServiceName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<QueueServicePropertiesInner>>>() {
                @Override
                public Observable<ServiceResponse<QueueServicePropertiesInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<QueueServicePropertiesInner> clientResponse = getServicePropertiesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<QueueServicePropertiesInner> getServicePropertiesDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<QueueServicePropertiesInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<QueueServicePropertiesInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
