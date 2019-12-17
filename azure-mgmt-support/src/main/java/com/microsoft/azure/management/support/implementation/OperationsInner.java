/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.support.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.support.ExceptionResponseException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
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
    private MicrosoftSupportImpl client;

    /**
     * Initializes an instance of OperationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public OperationsInner(Retrofit retrofit, MicrosoftSupportImpl client) {
        this.service = retrofit.create(OperationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Operations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface OperationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.support.Operations list" })
        @GET("providers/Microsoft.Support/operations")
        Observable<Response<ResponseBody>> list(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists all the available operations.
     * This lists all the available Microsoft Support REST API operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ExceptionResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;OperationInner&gt; object if successful.
     */
    public List<OperationInner> list() {
        return listWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Lists all the available operations.
     * This lists all the available Microsoft Support REST API operations.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<OperationInner>> listAsync(final ServiceCallback<List<OperationInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Lists all the available operations.
     * This lists all the available Microsoft Support REST API operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;OperationInner&gt; object
     */
    public Observable<List<OperationInner>> listAsync() {
        return listWithServiceResponseAsync().map(new Func1<ServiceResponse<List<OperationInner>>, List<OperationInner>>() {
            @Override
            public List<OperationInner> call(ServiceResponse<List<OperationInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists all the available operations.
     * This lists all the available Microsoft Support REST API operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;OperationInner&gt; object
     */
    public Observable<ServiceResponse<List<OperationInner>>> listWithServiceResponseAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<OperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<OperationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<OperationInner>> result = listDelegate(response);
                        List<OperationInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<OperationInner>> clientResponse = new ServiceResponse<List<OperationInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<OperationInner>> listDelegate(Response<ResponseBody> response) throws ExceptionResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<OperationInner>, ExceptionResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<OperationInner>>() { }.getType())
                .registerError(ExceptionResponseException.class)
                .build(response);
    }

}
