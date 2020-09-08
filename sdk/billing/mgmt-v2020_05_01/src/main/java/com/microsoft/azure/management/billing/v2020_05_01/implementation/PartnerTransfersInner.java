/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2020_05_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.billing.v2020_05_01.ErrorResponseException;
import com.microsoft.azure.management.billing.v2020_05_01.InitiateTransferRequest;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in PartnerTransfers.
 */
public class PartnerTransfersInner {
    /** The Retrofit service to perform REST calls. */
    private PartnerTransfersService service;
    /** The service client containing this operation class. */
    private BillingManagementClientImpl client;

    /**
     * Initializes an instance of PartnerTransfersInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PartnerTransfersInner(Retrofit retrofit, BillingManagementClientImpl client) {
        this.service = retrofit.create(PartnerTransfersService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for PartnerTransfers to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PartnerTransfersService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2020_05_01.PartnerTransfers initiate" })
        @POST("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/customers/{customerName}/initiateTransfer")
        Observable<Response<ResponseBody>> initiate(@Path("billingAccountName") String billingAccountName, @Path("customerName") String customerName, @Body InitiateTransferRequest parameters, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2020_05_01.PartnerTransfers get" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/customers/{customerName}/transfers/{transferName}")
        Observable<Response<ResponseBody>> get(@Path("billingAccountName") String billingAccountName, @Path("customerName") String customerName, @Path("transferName") String transferName, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2020_05_01.PartnerTransfers cancel" })
        @HTTP(path = "providers/Microsoft.Billing/billingAccounts/{billingAccountName}/customers/{customerName}/transfers/{transferName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> cancel(@Path("billingAccountName") String billingAccountName, @Path("customerName") String customerName, @Path("transferName") String transferName, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2020_05_01.PartnerTransfers list" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/customers/{customerName}/transfers")
        Observable<Response<ResponseBody>> list(@Path("billingAccountName") String billingAccountName, @Path("customerName") String customerName, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2020_05_01.PartnerTransfers listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Sends a request to a user in a customer's billing account to transfer billing ownership of their subscriptions. The operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @param parameters Request parameters that are provided to the initiate transfer operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PartnerTransferDetailsInner object if successful.
     */
    public PartnerTransferDetailsInner initiate(String billingAccountName, String customerName, InitiateTransferRequest parameters) {
        return initiateWithServiceResponseAsync(billingAccountName, customerName, parameters).toBlocking().single().body();
    }

    /**
     * Sends a request to a user in a customer's billing account to transfer billing ownership of their subscriptions. The operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @param parameters Request parameters that are provided to the initiate transfer operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PartnerTransferDetailsInner> initiateAsync(String billingAccountName, String customerName, InitiateTransferRequest parameters, final ServiceCallback<PartnerTransferDetailsInner> serviceCallback) {
        return ServiceFuture.fromResponse(initiateWithServiceResponseAsync(billingAccountName, customerName, parameters), serviceCallback);
    }

    /**
     * Sends a request to a user in a customer's billing account to transfer billing ownership of their subscriptions. The operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @param parameters Request parameters that are provided to the initiate transfer operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PartnerTransferDetailsInner object
     */
    public Observable<PartnerTransferDetailsInner> initiateAsync(String billingAccountName, String customerName, InitiateTransferRequest parameters) {
        return initiateWithServiceResponseAsync(billingAccountName, customerName, parameters).map(new Func1<ServiceResponse<PartnerTransferDetailsInner>, PartnerTransferDetailsInner>() {
            @Override
            public PartnerTransferDetailsInner call(ServiceResponse<PartnerTransferDetailsInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Sends a request to a user in a customer's billing account to transfer billing ownership of their subscriptions. The operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @param parameters Request parameters that are provided to the initiate transfer operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PartnerTransferDetailsInner object
     */
    public Observable<ServiceResponse<PartnerTransferDetailsInner>> initiateWithServiceResponseAsync(String billingAccountName, String customerName, InitiateTransferRequest parameters) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (customerName == null) {
            throw new IllegalArgumentException("Parameter customerName is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.initiate(billingAccountName, customerName, parameters, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PartnerTransferDetailsInner>>>() {
                @Override
                public Observable<ServiceResponse<PartnerTransferDetailsInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PartnerTransferDetailsInner> clientResponse = initiateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PartnerTransferDetailsInner> initiateDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PartnerTransferDetailsInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PartnerTransferDetailsInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets a transfer request by ID. The operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @param transferName The ID that uniquely identifies a transfer request.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PartnerTransferDetailsInner object if successful.
     */
    public PartnerTransferDetailsInner get(String billingAccountName, String customerName, String transferName) {
        return getWithServiceResponseAsync(billingAccountName, customerName, transferName).toBlocking().single().body();
    }

    /**
     * Gets a transfer request by ID. The operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @param transferName The ID that uniquely identifies a transfer request.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PartnerTransferDetailsInner> getAsync(String billingAccountName, String customerName, String transferName, final ServiceCallback<PartnerTransferDetailsInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(billingAccountName, customerName, transferName), serviceCallback);
    }

    /**
     * Gets a transfer request by ID. The operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @param transferName The ID that uniquely identifies a transfer request.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PartnerTransferDetailsInner object
     */
    public Observable<PartnerTransferDetailsInner> getAsync(String billingAccountName, String customerName, String transferName) {
        return getWithServiceResponseAsync(billingAccountName, customerName, transferName).map(new Func1<ServiceResponse<PartnerTransferDetailsInner>, PartnerTransferDetailsInner>() {
            @Override
            public PartnerTransferDetailsInner call(ServiceResponse<PartnerTransferDetailsInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a transfer request by ID. The operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @param transferName The ID that uniquely identifies a transfer request.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PartnerTransferDetailsInner object
     */
    public Observable<ServiceResponse<PartnerTransferDetailsInner>> getWithServiceResponseAsync(String billingAccountName, String customerName, String transferName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (customerName == null) {
            throw new IllegalArgumentException("Parameter customerName is required and cannot be null.");
        }
        if (transferName == null) {
            throw new IllegalArgumentException("Parameter transferName is required and cannot be null.");
        }
        return service.get(billingAccountName, customerName, transferName, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PartnerTransferDetailsInner>>>() {
                @Override
                public Observable<ServiceResponse<PartnerTransferDetailsInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PartnerTransferDetailsInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PartnerTransferDetailsInner> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PartnerTransferDetailsInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PartnerTransferDetailsInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Cancels a transfer request. The operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @param transferName The ID that uniquely identifies a transfer request.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PartnerTransferDetailsInner object if successful.
     */
    public PartnerTransferDetailsInner cancel(String billingAccountName, String customerName, String transferName) {
        return cancelWithServiceResponseAsync(billingAccountName, customerName, transferName).toBlocking().single().body();
    }

    /**
     * Cancels a transfer request. The operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @param transferName The ID that uniquely identifies a transfer request.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PartnerTransferDetailsInner> cancelAsync(String billingAccountName, String customerName, String transferName, final ServiceCallback<PartnerTransferDetailsInner> serviceCallback) {
        return ServiceFuture.fromResponse(cancelWithServiceResponseAsync(billingAccountName, customerName, transferName), serviceCallback);
    }

    /**
     * Cancels a transfer request. The operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @param transferName The ID that uniquely identifies a transfer request.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PartnerTransferDetailsInner object
     */
    public Observable<PartnerTransferDetailsInner> cancelAsync(String billingAccountName, String customerName, String transferName) {
        return cancelWithServiceResponseAsync(billingAccountName, customerName, transferName).map(new Func1<ServiceResponse<PartnerTransferDetailsInner>, PartnerTransferDetailsInner>() {
            @Override
            public PartnerTransferDetailsInner call(ServiceResponse<PartnerTransferDetailsInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Cancels a transfer request. The operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @param transferName The ID that uniquely identifies a transfer request.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PartnerTransferDetailsInner object
     */
    public Observable<ServiceResponse<PartnerTransferDetailsInner>> cancelWithServiceResponseAsync(String billingAccountName, String customerName, String transferName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (customerName == null) {
            throw new IllegalArgumentException("Parameter customerName is required and cannot be null.");
        }
        if (transferName == null) {
            throw new IllegalArgumentException("Parameter transferName is required and cannot be null.");
        }
        return service.cancel(billingAccountName, customerName, transferName, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PartnerTransferDetailsInner>>>() {
                @Override
                public Observable<ServiceResponse<PartnerTransferDetailsInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PartnerTransferDetailsInner> clientResponse = cancelDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PartnerTransferDetailsInner> cancelDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PartnerTransferDetailsInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PartnerTransferDetailsInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Lists the transfer requests sent to a customer. The operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;PartnerTransferDetailsInner&gt; object if successful.
     */
    public PagedList<PartnerTransferDetailsInner> list(final String billingAccountName, final String customerName) {
        ServiceResponse<Page<PartnerTransferDetailsInner>> response = listSinglePageAsync(billingAccountName, customerName).toBlocking().single();
        return new PagedList<PartnerTransferDetailsInner>(response.body()) {
            @Override
            public Page<PartnerTransferDetailsInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists the transfer requests sent to a customer. The operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<PartnerTransferDetailsInner>> listAsync(final String billingAccountName, final String customerName, final ListOperationCallback<PartnerTransferDetailsInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(billingAccountName, customerName),
            new Func1<String, Observable<ServiceResponse<Page<PartnerTransferDetailsInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PartnerTransferDetailsInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists the transfer requests sent to a customer. The operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;PartnerTransferDetailsInner&gt; object
     */
    public Observable<Page<PartnerTransferDetailsInner>> listAsync(final String billingAccountName, final String customerName) {
        return listWithServiceResponseAsync(billingAccountName, customerName)
            .map(new Func1<ServiceResponse<Page<PartnerTransferDetailsInner>>, Page<PartnerTransferDetailsInner>>() {
                @Override
                public Page<PartnerTransferDetailsInner> call(ServiceResponse<Page<PartnerTransferDetailsInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists the transfer requests sent to a customer. The operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;PartnerTransferDetailsInner&gt; object
     */
    public Observable<ServiceResponse<Page<PartnerTransferDetailsInner>>> listWithServiceResponseAsync(final String billingAccountName, final String customerName) {
        return listSinglePageAsync(billingAccountName, customerName)
            .concatMap(new Func1<ServiceResponse<Page<PartnerTransferDetailsInner>>, Observable<ServiceResponse<Page<PartnerTransferDetailsInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PartnerTransferDetailsInner>>> call(ServiceResponse<Page<PartnerTransferDetailsInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists the transfer requests sent to a customer. The operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
    ServiceResponse<PageImpl<PartnerTransferDetailsInner>> * @param billingAccountName The ID that uniquely identifies a billing account.
    ServiceResponse<PageImpl<PartnerTransferDetailsInner>> * @param customerName The ID that uniquely identifies a customer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;PartnerTransferDetailsInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<PartnerTransferDetailsInner>>> listSinglePageAsync(final String billingAccountName, final String customerName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (customerName == null) {
            throw new IllegalArgumentException("Parameter customerName is required and cannot be null.");
        }
        return service.list(billingAccountName, customerName, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<PartnerTransferDetailsInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PartnerTransferDetailsInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<PartnerTransferDetailsInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<PartnerTransferDetailsInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<PartnerTransferDetailsInner>> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<PartnerTransferDetailsInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<PartnerTransferDetailsInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Lists the transfer requests sent to a customer. The operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;PartnerTransferDetailsInner&gt; object if successful.
     */
    public PagedList<PartnerTransferDetailsInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<PartnerTransferDetailsInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<PartnerTransferDetailsInner>(response.body()) {
            @Override
            public Page<PartnerTransferDetailsInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists the transfer requests sent to a customer. The operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<PartnerTransferDetailsInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<PartnerTransferDetailsInner>> serviceFuture, final ListOperationCallback<PartnerTransferDetailsInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<PartnerTransferDetailsInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PartnerTransferDetailsInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists the transfer requests sent to a customer. The operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;PartnerTransferDetailsInner&gt; object
     */
    public Observable<Page<PartnerTransferDetailsInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<PartnerTransferDetailsInner>>, Page<PartnerTransferDetailsInner>>() {
                @Override
                public Page<PartnerTransferDetailsInner> call(ServiceResponse<Page<PartnerTransferDetailsInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists the transfer requests sent to a customer. The operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;PartnerTransferDetailsInner&gt; object
     */
    public Observable<ServiceResponse<Page<PartnerTransferDetailsInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<PartnerTransferDetailsInner>>, Observable<ServiceResponse<Page<PartnerTransferDetailsInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PartnerTransferDetailsInner>>> call(ServiceResponse<Page<PartnerTransferDetailsInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists the transfer requests sent to a customer. The operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
    ServiceResponse<PageImpl<PartnerTransferDetailsInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;PartnerTransferDetailsInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<PartnerTransferDetailsInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<PartnerTransferDetailsInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PartnerTransferDetailsInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<PartnerTransferDetailsInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<PartnerTransferDetailsInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<PartnerTransferDetailsInner>> listNextDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<PartnerTransferDetailsInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<PartnerTransferDetailsInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
