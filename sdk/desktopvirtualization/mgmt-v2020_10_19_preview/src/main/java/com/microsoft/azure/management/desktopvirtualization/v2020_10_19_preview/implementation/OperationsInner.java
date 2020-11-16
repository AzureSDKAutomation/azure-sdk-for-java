/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2020_10_19_preview.implementation;

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
 * in Operations.
 */
public class OperationsInner {
    /** The Retrofit service to perform REST calls. */
    private OperationsService service;
    /** The service client containing this operation class. */
    private DesktopVirtualizationAPIClientImpl client;

    /**
     * Initializes an instance of OperationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public OperationsInner(Retrofit retrofit, DesktopVirtualizationAPIClientImpl client) {
        this.service = retrofit.create(OperationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Operations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface OperationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.desktopvirtualization.v2020_10_19_preview.Operations list" })
        @GET("providers/Microsoft.DesktopVirtualization/operations")
        Observable<Response<ResponseBody>> list(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * List all of the available operations the Desktop Virtualization resource provider supports.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceProviderOperationListInner object if successful.
     */
    public ResourceProviderOperationListInner list() {
        return listWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * List all of the available operations the Desktop Virtualization resource provider supports.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ResourceProviderOperationListInner> listAsync(final ServiceCallback<ResourceProviderOperationListInner> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * List all of the available operations the Desktop Virtualization resource provider supports.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceProviderOperationListInner object
     */
    public Observable<ResourceProviderOperationListInner> listAsync() {
        return listWithServiceResponseAsync().map(new Func1<ServiceResponse<ResourceProviderOperationListInner>, ResourceProviderOperationListInner>() {
            @Override
            public ResourceProviderOperationListInner call(ServiceResponse<ResourceProviderOperationListInner> response) {
                return response.body();
            }
        });
    }

    /**
     * List all of the available operations the Desktop Virtualization resource provider supports.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceProviderOperationListInner object
     */
    public Observable<ServiceResponse<ResourceProviderOperationListInner>> listWithServiceResponseAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ResourceProviderOperationListInner>>>() {
                @Override
                public Observable<ServiceResponse<ResourceProviderOperationListInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ResourceProviderOperationListInner> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ResourceProviderOperationListInner> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ResourceProviderOperationListInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ResourceProviderOperationListInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
