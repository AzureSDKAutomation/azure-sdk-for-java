/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2020_11-02-preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.desktopvirtualization.v2020_11-02-preview.DesktopPatch;
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
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Desktops.
 */
public class DesktopsInner {
    /** The Retrofit service to perform REST calls. */
    private DesktopsService service;
    /** The service client containing this operation class. */
    private DesktopVirtualizationAPIClientImpl client;

    /**
     * Initializes an instance of DesktopsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public DesktopsInner(Retrofit retrofit, DesktopVirtualizationAPIClientImpl client) {
        this.service = retrofit.create(DesktopsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Desktops to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DesktopsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.desktopvirtualization.v2020_11-02-preview.Desktops get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DesktopVirtualization/applicationGroups/{applicationGroupName}/desktops/{desktopName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("applicationGroupName") String applicationGroupName, @Path("desktopName") String desktopName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.desktopvirtualization.v2020_11-02-preview.Desktops update" })
        @PATCH("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DesktopVirtualization/applicationGroups/{applicationGroupName}/desktops/{desktopName}")
        Observable<Response<ResponseBody>> update(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("applicationGroupName") String applicationGroupName, @Path("desktopName") String desktopName, @Query("api-version") String apiVersion, @Body DesktopPatch desktop, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.desktopvirtualization.v2020_11-02-preview.Desktops list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DesktopVirtualization/applicationGroups/{applicationGroupName}/desktops")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("applicationGroupName") String applicationGroupName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get a desktop.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group
     * @param desktopName The name of the desktop within the specified desktop group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DesktopInner object if successful.
     */
    public DesktopInner get(String resourceGroupName, String applicationGroupName, String desktopName) {
        return getWithServiceResponseAsync(resourceGroupName, applicationGroupName, desktopName).toBlocking().single().body();
    }

    /**
     * Get a desktop.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group
     * @param desktopName The name of the desktop within the specified desktop group
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DesktopInner> getAsync(String resourceGroupName, String applicationGroupName, String desktopName, final ServiceCallback<DesktopInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, applicationGroupName, desktopName), serviceCallback);
    }

    /**
     * Get a desktop.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group
     * @param desktopName The name of the desktop within the specified desktop group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DesktopInner object
     */
    public Observable<DesktopInner> getAsync(String resourceGroupName, String applicationGroupName, String desktopName) {
        return getWithServiceResponseAsync(resourceGroupName, applicationGroupName, desktopName).map(new Func1<ServiceResponse<DesktopInner>, DesktopInner>() {
            @Override
            public DesktopInner call(ServiceResponse<DesktopInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get a desktop.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group
     * @param desktopName The name of the desktop within the specified desktop group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DesktopInner object
     */
    public Observable<ServiceResponse<DesktopInner>> getWithServiceResponseAsync(String resourceGroupName, String applicationGroupName, String desktopName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (applicationGroupName == null) {
            throw new IllegalArgumentException("Parameter applicationGroupName is required and cannot be null.");
        }
        if (desktopName == null) {
            throw new IllegalArgumentException("Parameter desktopName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), resourceGroupName, applicationGroupName, desktopName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DesktopInner>>>() {
                @Override
                public Observable<ServiceResponse<DesktopInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DesktopInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DesktopInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<DesktopInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DesktopInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Update a desktop.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group
     * @param desktopName The name of the desktop within the specified desktop group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DesktopInner object if successful.
     */
    public DesktopInner update(String resourceGroupName, String applicationGroupName, String desktopName) {
        return updateWithServiceResponseAsync(resourceGroupName, applicationGroupName, desktopName).toBlocking().single().body();
    }

    /**
     * Update a desktop.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group
     * @param desktopName The name of the desktop within the specified desktop group
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DesktopInner> updateAsync(String resourceGroupName, String applicationGroupName, String desktopName, final ServiceCallback<DesktopInner> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(resourceGroupName, applicationGroupName, desktopName), serviceCallback);
    }

    /**
     * Update a desktop.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group
     * @param desktopName The name of the desktop within the specified desktop group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DesktopInner object
     */
    public Observable<DesktopInner> updateAsync(String resourceGroupName, String applicationGroupName, String desktopName) {
        return updateWithServiceResponseAsync(resourceGroupName, applicationGroupName, desktopName).map(new Func1<ServiceResponse<DesktopInner>, DesktopInner>() {
            @Override
            public DesktopInner call(ServiceResponse<DesktopInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Update a desktop.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group
     * @param desktopName The name of the desktop within the specified desktop group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DesktopInner object
     */
    public Observable<ServiceResponse<DesktopInner>> updateWithServiceResponseAsync(String resourceGroupName, String applicationGroupName, String desktopName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (applicationGroupName == null) {
            throw new IllegalArgumentException("Parameter applicationGroupName is required and cannot be null.");
        }
        if (desktopName == null) {
            throw new IllegalArgumentException("Parameter desktopName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final DesktopPatch desktop = null;
        return service.update(this.client.subscriptionId(), resourceGroupName, applicationGroupName, desktopName, this.client.apiVersion(), desktop, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DesktopInner>>>() {
                @Override
                public Observable<ServiceResponse<DesktopInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DesktopInner> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Update a desktop.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group
     * @param desktopName The name of the desktop within the specified desktop group
     * @param desktop Object containing Desktop definitions.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DesktopInner object if successful.
     */
    public DesktopInner update(String resourceGroupName, String applicationGroupName, String desktopName, DesktopPatch desktop) {
        return updateWithServiceResponseAsync(resourceGroupName, applicationGroupName, desktopName, desktop).toBlocking().single().body();
    }

    /**
     * Update a desktop.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group
     * @param desktopName The name of the desktop within the specified desktop group
     * @param desktop Object containing Desktop definitions.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DesktopInner> updateAsync(String resourceGroupName, String applicationGroupName, String desktopName, DesktopPatch desktop, final ServiceCallback<DesktopInner> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(resourceGroupName, applicationGroupName, desktopName, desktop), serviceCallback);
    }

    /**
     * Update a desktop.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group
     * @param desktopName The name of the desktop within the specified desktop group
     * @param desktop Object containing Desktop definitions.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DesktopInner object
     */
    public Observable<DesktopInner> updateAsync(String resourceGroupName, String applicationGroupName, String desktopName, DesktopPatch desktop) {
        return updateWithServiceResponseAsync(resourceGroupName, applicationGroupName, desktopName, desktop).map(new Func1<ServiceResponse<DesktopInner>, DesktopInner>() {
            @Override
            public DesktopInner call(ServiceResponse<DesktopInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Update a desktop.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group
     * @param desktopName The name of the desktop within the specified desktop group
     * @param desktop Object containing Desktop definitions.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DesktopInner object
     */
    public Observable<ServiceResponse<DesktopInner>> updateWithServiceResponseAsync(String resourceGroupName, String applicationGroupName, String desktopName, DesktopPatch desktop) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (applicationGroupName == null) {
            throw new IllegalArgumentException("Parameter applicationGroupName is required and cannot be null.");
        }
        if (desktopName == null) {
            throw new IllegalArgumentException("Parameter desktopName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(desktop);
        return service.update(this.client.subscriptionId(), resourceGroupName, applicationGroupName, desktopName, this.client.apiVersion(), desktop, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DesktopInner>>>() {
                @Override
                public Observable<ServiceResponse<DesktopInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DesktopInner> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DesktopInner> updateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<DesktopInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DesktopInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * List desktops.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DesktopListInner object if successful.
     */
    public DesktopListInner list(String resourceGroupName, String applicationGroupName) {
        return listWithServiceResponseAsync(resourceGroupName, applicationGroupName).toBlocking().single().body();
    }

    /**
     * List desktops.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DesktopListInner> listAsync(String resourceGroupName, String applicationGroupName, final ServiceCallback<DesktopListInner> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(resourceGroupName, applicationGroupName), serviceCallback);
    }

    /**
     * List desktops.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DesktopListInner object
     */
    public Observable<DesktopListInner> listAsync(String resourceGroupName, String applicationGroupName) {
        return listWithServiceResponseAsync(resourceGroupName, applicationGroupName).map(new Func1<ServiceResponse<DesktopListInner>, DesktopListInner>() {
            @Override
            public DesktopListInner call(ServiceResponse<DesktopListInner> response) {
                return response.body();
            }
        });
    }

    /**
     * List desktops.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DesktopListInner object
     */
    public Observable<ServiceResponse<DesktopListInner>> listWithServiceResponseAsync(String resourceGroupName, String applicationGroupName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (applicationGroupName == null) {
            throw new IllegalArgumentException("Parameter applicationGroupName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), resourceGroupName, applicationGroupName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DesktopListInner>>>() {
                @Override
                public Observable<ServiceResponse<DesktopListInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DesktopListInner> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DesktopListInner> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<DesktopListInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DesktopListInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
