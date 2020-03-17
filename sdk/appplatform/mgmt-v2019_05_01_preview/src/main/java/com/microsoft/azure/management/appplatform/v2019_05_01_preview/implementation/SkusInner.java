/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2019_05_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Skus.
 */
public class SkusInner {
    /** The Retrofit service to perform REST calls. */
    private SkusService service;
    /** The service client containing this operation class. */
    private AppPlatformManagementClientImpl client;

    /**
     * Initializes an instance of SkusInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SkusInner(Retrofit retrofit, AppPlatformManagementClientImpl client) {
        this.service = retrofit.create(SkusService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Skus to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SkusService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.appplatform.v2019_05_01_preview.Skus listServiceSku" })
        @GET("skus/Spring")
        Observable<Response<ResponseBody>> listServiceSku(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.appplatform.v2019_05_01_preview.Skus listDeploymentSku" })
        @GET("skus/Spring/apps/deployments")
        Observable<Response<ResponseBody>> listDeploymentSku(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceTypeSkuCollectionInner object if successful.
     */
    public ResourceTypeSkuCollectionInner listServiceSku() {
        return listServiceSkuWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceTypeSkuCollectionInner> listServiceSkuAsync(final ServiceCallback<ResourceTypeSkuCollectionInner> serviceCallback) {
        return ServiceFuture.fromResponse(listServiceSkuWithServiceResponseAsync(), serviceCallback);
    }

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceTypeSkuCollectionInner object
     */
    public Observable<ResourceTypeSkuCollectionInner> listServiceSkuAsync() {
        return listServiceSkuWithServiceResponseAsync().map(new Func1<ServiceResponse<ResourceTypeSkuCollectionInner>, ResourceTypeSkuCollectionInner>() {
            @Override
            public ResourceTypeSkuCollectionInner call(ServiceResponse<ResourceTypeSkuCollectionInner> response) {
                return response.body();
            }
        });
    }

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceTypeSkuCollectionInner object
     */
    public Observable<ServiceResponse<ResourceTypeSkuCollectionInner>> listServiceSkuWithServiceResponseAsync() {
        return service.listServiceSku(this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceTypeSkuCollectionInner>>>() {
                @Override
                public Observable<ServiceResponse<ResourceTypeSkuCollectionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceTypeSkuCollectionInner> clientResponse = listServiceSkuDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceTypeSkuCollectionInner> listServiceSkuDelegate(Response<ResponseBody> response) throws CloudException, IOException {
        return this.client.restClient().responseBuilderFactory().<ResourceTypeSkuCollectionInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ResourceTypeSkuCollectionInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceTypeSkuCollectionInner object if successful.
     */
    public ResourceTypeSkuCollectionInner listDeploymentSku() {
        return listDeploymentSkuWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceTypeSkuCollectionInner> listDeploymentSkuAsync(final ServiceCallback<ResourceTypeSkuCollectionInner> serviceCallback) {
        return ServiceFuture.fromResponse(listDeploymentSkuWithServiceResponseAsync(), serviceCallback);
    }

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceTypeSkuCollectionInner object
     */
    public Observable<ResourceTypeSkuCollectionInner> listDeploymentSkuAsync() {
        return listDeploymentSkuWithServiceResponseAsync().map(new Func1<ServiceResponse<ResourceTypeSkuCollectionInner>, ResourceTypeSkuCollectionInner>() {
            @Override
            public ResourceTypeSkuCollectionInner call(ServiceResponse<ResourceTypeSkuCollectionInner> response) {
                return response.body();
            }
        });
    }

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceTypeSkuCollectionInner object
     */
    public Observable<ServiceResponse<ResourceTypeSkuCollectionInner>> listDeploymentSkuWithServiceResponseAsync() {
        return service.listDeploymentSku(this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceTypeSkuCollectionInner>>>() {
                @Override
                public Observable<ServiceResponse<ResourceTypeSkuCollectionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceTypeSkuCollectionInner> clientResponse = listDeploymentSkuDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceTypeSkuCollectionInner> listDeploymentSkuDelegate(Response<ResponseBody> response) throws CloudException, IOException {
        return this.client.restClient().responseBuilderFactory().<ResourceTypeSkuCollectionInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ResourceTypeSkuCollectionInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
