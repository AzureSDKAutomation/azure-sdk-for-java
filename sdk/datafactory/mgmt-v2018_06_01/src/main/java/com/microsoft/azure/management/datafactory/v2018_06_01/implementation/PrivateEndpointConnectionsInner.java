/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.datafactory.v2018_06_01.PrivateLinkConnectionApprovalRequest;
import com.microsoft.azure.management.datafactory.v2018_06_01.PrivateLinkConnectionApprovalRequestResource;
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
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in PrivateEndpointConnections.
 */
public class PrivateEndpointConnectionsInner {
    /** The Retrofit service to perform REST calls. */
    private PrivateEndpointConnectionsService service;
    /** The service client containing this operation class. */
    private DataFactoryManagementClientImpl client;

    /**
     * Initializes an instance of PrivateEndpointConnectionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PrivateEndpointConnectionsInner(Retrofit retrofit, DataFactoryManagementClientImpl client) {
        this.service = retrofit.create(PrivateEndpointConnectionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for PrivateEndpointConnections to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PrivateEndpointConnectionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.datafactory.v2018_06_01.PrivateEndpointConnections approvesOrRejects" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataFactory/factories/{factoryName}/privateEndpointConnections/{privateEndpointConnectionName}")
        Observable<Response<ResponseBody>> approvesOrRejects(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("factoryName") String factoryName, @Path("privateEndpointConnectionName") String privateEndpointConnectionName, @Query("api-version") String apiVersion, @Header("If-Match") String ifMatch, @Header("accept-language") String acceptLanguage, @Body PrivateLinkConnectionApprovalRequestResource privateEndpointWrapper, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.datafactory.v2018_06_01.PrivateEndpointConnections get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataFactory/factories/{factoryName}/privateEndpointConnections/{privateEndpointConnectionName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("factoryName") String factoryName, @Path("privateEndpointConnectionName") String privateEndpointConnectionName, @Query("api-version") String apiVersion, @Header("If-None-Match") String ifNoneMatch, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.datafactory.v2018_06_01.PrivateEndpointConnections delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataFactory/factories/{factoryName}/privateEndpointConnections/{privateEndpointConnectionName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("factoryName") String factoryName, @Path("privateEndpointConnectionName") String privateEndpointConnectionName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Approves or rejects a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PrivateEndpointConnectionResourceInner object if successful.
     */
    public PrivateEndpointConnectionResourceInner approvesOrRejects(String resourceGroupName, String factoryName, String privateEndpointConnectionName) {
        return approvesOrRejectsWithServiceResponseAsync(resourceGroupName, factoryName, privateEndpointConnectionName).toBlocking().single().body();
    }

    /**
     * Approves or rejects a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PrivateEndpointConnectionResourceInner> approvesOrRejectsAsync(String resourceGroupName, String factoryName, String privateEndpointConnectionName, final ServiceCallback<PrivateEndpointConnectionResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(approvesOrRejectsWithServiceResponseAsync(resourceGroupName, factoryName, privateEndpointConnectionName), serviceCallback);
    }

    /**
     * Approves or rejects a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateEndpointConnectionResourceInner object
     */
    public Observable<PrivateEndpointConnectionResourceInner> approvesOrRejectsAsync(String resourceGroupName, String factoryName, String privateEndpointConnectionName) {
        return approvesOrRejectsWithServiceResponseAsync(resourceGroupName, factoryName, privateEndpointConnectionName).map(new Func1<ServiceResponse<PrivateEndpointConnectionResourceInner>, PrivateEndpointConnectionResourceInner>() {
            @Override
            public PrivateEndpointConnectionResourceInner call(ServiceResponse<PrivateEndpointConnectionResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Approves or rejects a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateEndpointConnectionResourceInner object
     */
    public Observable<ServiceResponse<PrivateEndpointConnectionResourceInner>> approvesOrRejectsWithServiceResponseAsync(String resourceGroupName, String factoryName, String privateEndpointConnectionName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (factoryName == null) {
            throw new IllegalArgumentException("Parameter factoryName is required and cannot be null.");
        }
        if (privateEndpointConnectionName == null) {
            throw new IllegalArgumentException("Parameter privateEndpointConnectionName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String ifMatch = null;
        final PrivateLinkConnectionApprovalRequest properties = null;
        PrivateLinkConnectionApprovalRequestResource privateEndpointWrapper = new PrivateLinkConnectionApprovalRequestResource();
        privateEndpointWrapper.withProperties(null);
        return service.approvesOrRejects(this.client.subscriptionId(), resourceGroupName, factoryName, privateEndpointConnectionName, this.client.apiVersion(), ifMatch, this.client.acceptLanguage(), privateEndpointWrapper, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PrivateEndpointConnectionResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<PrivateEndpointConnectionResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PrivateEndpointConnectionResourceInner> clientResponse = approvesOrRejectsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Approves or rejects a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @param ifMatch ETag of the private endpoint connection entity.  Should only be specified for update, for which it should match existing entity or can be * for unconditional update.
     * @param properties Core resource properties
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PrivateEndpointConnectionResourceInner object if successful.
     */
    public PrivateEndpointConnectionResourceInner approvesOrRejects(String resourceGroupName, String factoryName, String privateEndpointConnectionName, String ifMatch, PrivateLinkConnectionApprovalRequest properties) {
        return approvesOrRejectsWithServiceResponseAsync(resourceGroupName, factoryName, privateEndpointConnectionName, ifMatch, properties).toBlocking().single().body();
    }

    /**
     * Approves or rejects a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @param ifMatch ETag of the private endpoint connection entity.  Should only be specified for update, for which it should match existing entity or can be * for unconditional update.
     * @param properties Core resource properties
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PrivateEndpointConnectionResourceInner> approvesOrRejectsAsync(String resourceGroupName, String factoryName, String privateEndpointConnectionName, String ifMatch, PrivateLinkConnectionApprovalRequest properties, final ServiceCallback<PrivateEndpointConnectionResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(approvesOrRejectsWithServiceResponseAsync(resourceGroupName, factoryName, privateEndpointConnectionName, ifMatch, properties), serviceCallback);
    }

    /**
     * Approves or rejects a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @param ifMatch ETag of the private endpoint connection entity.  Should only be specified for update, for which it should match existing entity or can be * for unconditional update.
     * @param properties Core resource properties
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateEndpointConnectionResourceInner object
     */
    public Observable<PrivateEndpointConnectionResourceInner> approvesOrRejectsAsync(String resourceGroupName, String factoryName, String privateEndpointConnectionName, String ifMatch, PrivateLinkConnectionApprovalRequest properties) {
        return approvesOrRejectsWithServiceResponseAsync(resourceGroupName, factoryName, privateEndpointConnectionName, ifMatch, properties).map(new Func1<ServiceResponse<PrivateEndpointConnectionResourceInner>, PrivateEndpointConnectionResourceInner>() {
            @Override
            public PrivateEndpointConnectionResourceInner call(ServiceResponse<PrivateEndpointConnectionResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Approves or rejects a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @param ifMatch ETag of the private endpoint connection entity.  Should only be specified for update, for which it should match existing entity or can be * for unconditional update.
     * @param properties Core resource properties
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateEndpointConnectionResourceInner object
     */
    public Observable<ServiceResponse<PrivateEndpointConnectionResourceInner>> approvesOrRejectsWithServiceResponseAsync(String resourceGroupName, String factoryName, String privateEndpointConnectionName, String ifMatch, PrivateLinkConnectionApprovalRequest properties) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (factoryName == null) {
            throw new IllegalArgumentException("Parameter factoryName is required and cannot be null.");
        }
        if (privateEndpointConnectionName == null) {
            throw new IllegalArgumentException("Parameter privateEndpointConnectionName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(properties);
        PrivateLinkConnectionApprovalRequestResource privateEndpointWrapper = new PrivateLinkConnectionApprovalRequestResource();
        privateEndpointWrapper.withProperties(properties);
        return service.approvesOrRejects(this.client.subscriptionId(), resourceGroupName, factoryName, privateEndpointConnectionName, this.client.apiVersion(), ifMatch, this.client.acceptLanguage(), privateEndpointWrapper, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PrivateEndpointConnectionResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<PrivateEndpointConnectionResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PrivateEndpointConnectionResourceInner> clientResponse = approvesOrRejectsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PrivateEndpointConnectionResourceInner> approvesOrRejectsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PrivateEndpointConnectionResourceInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PrivateEndpointConnectionResourceInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PrivateEndpointConnectionResourceInner object if successful.
     */
    public PrivateEndpointConnectionResourceInner get(String resourceGroupName, String factoryName, String privateEndpointConnectionName) {
        return getWithServiceResponseAsync(resourceGroupName, factoryName, privateEndpointConnectionName).toBlocking().single().body();
    }

    /**
     * Gets a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PrivateEndpointConnectionResourceInner> getAsync(String resourceGroupName, String factoryName, String privateEndpointConnectionName, final ServiceCallback<PrivateEndpointConnectionResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, factoryName, privateEndpointConnectionName), serviceCallback);
    }

    /**
     * Gets a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateEndpointConnectionResourceInner object
     */
    public Observable<PrivateEndpointConnectionResourceInner> getAsync(String resourceGroupName, String factoryName, String privateEndpointConnectionName) {
        return getWithServiceResponseAsync(resourceGroupName, factoryName, privateEndpointConnectionName).map(new Func1<ServiceResponse<PrivateEndpointConnectionResourceInner>, PrivateEndpointConnectionResourceInner>() {
            @Override
            public PrivateEndpointConnectionResourceInner call(ServiceResponse<PrivateEndpointConnectionResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateEndpointConnectionResourceInner object
     */
    public Observable<ServiceResponse<PrivateEndpointConnectionResourceInner>> getWithServiceResponseAsync(String resourceGroupName, String factoryName, String privateEndpointConnectionName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (factoryName == null) {
            throw new IllegalArgumentException("Parameter factoryName is required and cannot be null.");
        }
        if (privateEndpointConnectionName == null) {
            throw new IllegalArgumentException("Parameter privateEndpointConnectionName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String ifNoneMatch = null;
        return service.get(this.client.subscriptionId(), resourceGroupName, factoryName, privateEndpointConnectionName, this.client.apiVersion(), ifNoneMatch, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PrivateEndpointConnectionResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<PrivateEndpointConnectionResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PrivateEndpointConnectionResourceInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @param ifNoneMatch ETag of the private endpoint connection entity. Should only be specified for get. If the ETag matches the existing entity tag, or if * was provided, then no content will be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PrivateEndpointConnectionResourceInner object if successful.
     */
    public PrivateEndpointConnectionResourceInner get(String resourceGroupName, String factoryName, String privateEndpointConnectionName, String ifNoneMatch) {
        return getWithServiceResponseAsync(resourceGroupName, factoryName, privateEndpointConnectionName, ifNoneMatch).toBlocking().single().body();
    }

    /**
     * Gets a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @param ifNoneMatch ETag of the private endpoint connection entity. Should only be specified for get. If the ETag matches the existing entity tag, or if * was provided, then no content will be returned.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PrivateEndpointConnectionResourceInner> getAsync(String resourceGroupName, String factoryName, String privateEndpointConnectionName, String ifNoneMatch, final ServiceCallback<PrivateEndpointConnectionResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, factoryName, privateEndpointConnectionName, ifNoneMatch), serviceCallback);
    }

    /**
     * Gets a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @param ifNoneMatch ETag of the private endpoint connection entity. Should only be specified for get. If the ETag matches the existing entity tag, or if * was provided, then no content will be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateEndpointConnectionResourceInner object
     */
    public Observable<PrivateEndpointConnectionResourceInner> getAsync(String resourceGroupName, String factoryName, String privateEndpointConnectionName, String ifNoneMatch) {
        return getWithServiceResponseAsync(resourceGroupName, factoryName, privateEndpointConnectionName, ifNoneMatch).map(new Func1<ServiceResponse<PrivateEndpointConnectionResourceInner>, PrivateEndpointConnectionResourceInner>() {
            @Override
            public PrivateEndpointConnectionResourceInner call(ServiceResponse<PrivateEndpointConnectionResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @param ifNoneMatch ETag of the private endpoint connection entity. Should only be specified for get. If the ETag matches the existing entity tag, or if * was provided, then no content will be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateEndpointConnectionResourceInner object
     */
    public Observable<ServiceResponse<PrivateEndpointConnectionResourceInner>> getWithServiceResponseAsync(String resourceGroupName, String factoryName, String privateEndpointConnectionName, String ifNoneMatch) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (factoryName == null) {
            throw new IllegalArgumentException("Parameter factoryName is required and cannot be null.");
        }
        if (privateEndpointConnectionName == null) {
            throw new IllegalArgumentException("Parameter privateEndpointConnectionName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), resourceGroupName, factoryName, privateEndpointConnectionName, this.client.apiVersion(), ifNoneMatch, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PrivateEndpointConnectionResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<PrivateEndpointConnectionResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PrivateEndpointConnectionResourceInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PrivateEndpointConnectionResourceInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PrivateEndpointConnectionResourceInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PrivateEndpointConnectionResourceInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Deletes a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String factoryName, String privateEndpointConnectionName) {
        deleteWithServiceResponseAsync(resourceGroupName, factoryName, privateEndpointConnectionName).toBlocking().single().body();
    }

    /**
     * Deletes a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String factoryName, String privateEndpointConnectionName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, factoryName, privateEndpointConnectionName), serviceCallback);
    }

    /**
     * Deletes a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String factoryName, String privateEndpointConnectionName) {
        return deleteWithServiceResponseAsync(resourceGroupName, factoryName, privateEndpointConnectionName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String factoryName, String privateEndpointConnectionName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (factoryName == null) {
            throw new IllegalArgumentException("Parameter factoryName is required and cannot be null.");
        }
        if (privateEndpointConnectionName == null) {
            throw new IllegalArgumentException("Parameter privateEndpointConnectionName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(this.client.subscriptionId(), resourceGroupName, factoryName, privateEndpointConnectionName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
