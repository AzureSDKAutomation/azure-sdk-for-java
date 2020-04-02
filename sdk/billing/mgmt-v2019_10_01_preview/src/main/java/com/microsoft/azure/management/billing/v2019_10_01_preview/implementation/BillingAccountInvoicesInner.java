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
 * in BillingAccountInvoices.
 */
public class BillingAccountInvoicesInner {
    /** The Retrofit service to perform REST calls. */
    private BillingAccountInvoicesService service;
    /** The service client containing this operation class. */
    private BillingManagementClientImpl client;

    /**
     * Initializes an instance of BillingAccountInvoicesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BillingAccountInvoicesInner(Retrofit retrofit, BillingManagementClientImpl client) {
        this.service = retrofit.create(BillingAccountInvoicesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for BillingAccountInvoices to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BillingAccountInvoicesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2019_10_01_preview.BillingAccountInvoices get" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/invoices/{invoiceName}")
        Observable<Response<ResponseBody>> get(@Path("billingAccountName") String billingAccountName, @Path("invoiceName") String invoiceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets an invoice by ID. The operation is supported for Enterprise Agreement enrollment billing accounts.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InvoiceInner object if successful.
     */
    public InvoiceInner get(String billingAccountName, String invoiceName) {
        return getWithServiceResponseAsync(billingAccountName, invoiceName).toBlocking().single().body();
    }

    /**
     * Gets an invoice by ID. The operation is supported for Enterprise Agreement enrollment billing accounts.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<InvoiceInner> getAsync(String billingAccountName, String invoiceName, final ServiceCallback<InvoiceInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(billingAccountName, invoiceName), serviceCallback);
    }

    /**
     * Gets an invoice by ID. The operation is supported for Enterprise Agreement enrollment billing accounts.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InvoiceInner object
     */
    public Observable<InvoiceInner> getAsync(String billingAccountName, String invoiceName) {
        return getWithServiceResponseAsync(billingAccountName, invoiceName).map(new Func1<ServiceResponse<InvoiceInner>, InvoiceInner>() {
            @Override
            public InvoiceInner call(ServiceResponse<InvoiceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets an invoice by ID. The operation is supported for Enterprise Agreement enrollment billing accounts.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InvoiceInner object
     */
    public Observable<ServiceResponse<InvoiceInner>> getWithServiceResponseAsync(String billingAccountName, String invoiceName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (invoiceName == null) {
            throw new IllegalArgumentException("Parameter invoiceName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(billingAccountName, invoiceName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<InvoiceInner>>>() {
                @Override
                public Observable<ServiceResponse<InvoiceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<InvoiceInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<InvoiceInner> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<InvoiceInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<InvoiceInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
