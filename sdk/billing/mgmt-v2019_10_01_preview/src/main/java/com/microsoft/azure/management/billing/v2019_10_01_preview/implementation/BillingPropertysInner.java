/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.billing.v2019_10_01_preview.ErrorResponseException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in BillingPropertys.
 */
public class BillingPropertysInner {
    /** The Retrofit service to perform REST calls. */
    private BillingPropertysService service;
    /** The service client containing this operation class. */
    private BillingManagementClientImpl client;

    /**
     * Initializes an instance of BillingPropertysInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BillingPropertysInner(Retrofit retrofit, BillingManagementClientImpl client) {
        this.service = retrofit.create(BillingPropertysService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for BillingPropertys to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BillingPropertysService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2019_10_01_preview.BillingPropertys get" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Billing/billingProperty/default")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get the billing properties for a subscription. This operation is not supported for billing accounts with agreement type Enterprise Agreement.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BillingPropertyInner object if successful.
     */
    public BillingPropertyInner get() {
        return getWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get the billing properties for a subscription. This operation is not supported for billing accounts with agreement type Enterprise Agreement.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BillingPropertyInner> getAsync(final ServiceCallback<BillingPropertyInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get the billing properties for a subscription. This operation is not supported for billing accounts with agreement type Enterprise Agreement.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingPropertyInner object
     */
    public Observable<BillingPropertyInner> getAsync() {
        return getWithServiceResponseAsync().map(new Func1<ServiceResponse<BillingPropertyInner>, BillingPropertyInner>() {
            @Override
            public BillingPropertyInner call(ServiceResponse<BillingPropertyInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the billing properties for a subscription. This operation is not supported for billing accounts with agreement type Enterprise Agreement.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingPropertyInner object
     */
    public Observable<ServiceResponse<BillingPropertyInner>> getWithServiceResponseAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BillingPropertyInner>>>() {
                @Override
                public Observable<ServiceResponse<BillingPropertyInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BillingPropertyInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BillingPropertyInner> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BillingPropertyInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BillingPropertyInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
