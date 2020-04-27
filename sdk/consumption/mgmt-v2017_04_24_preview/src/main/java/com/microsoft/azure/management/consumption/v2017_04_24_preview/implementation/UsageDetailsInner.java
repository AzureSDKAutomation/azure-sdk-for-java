/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2017_04_24_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.consumption.v2017_04_24_preview.ErrorResponseException;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in UsageDetails.
 */
public class UsageDetailsInner {
    /** The Retrofit service to perform REST calls. */
    private UsageDetailsService service;
    /** The service client containing this operation class. */
    private ConsumptionManagementClientImpl client;

    /**
     * Initializes an instance of UsageDetailsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public UsageDetailsInner(Retrofit retrofit, ConsumptionManagementClientImpl client) {
        this.service = retrofit.create(UsageDetailsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for UsageDetails to be
     * used by Retrofit to perform actually REST calls.
     */
    interface UsageDetailsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.consumption.v2017_04_24_preview.UsageDetails list" })
        @GET("{scope}/providers/Microsoft.Consumption/usageDetails")
        Observable<Response<ResponseBody>> list(@Path(value = "scope", encoded = true) String scope, @Query("$expand") String expand, @Query("$filter") String filter, @Query("$skiptoken") String skiptoken, @Query("$top") Integer top, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.consumption.v2017_04_24_preview.UsageDetails listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists the usage details for a scope in reverse chronological order by billing period. Usage details are available via this API only for January 1, 2017 or later.
     *
     * @param scope The scope of the usage details. The scope can be '/subscriptions/{subscriptionId}' for a subscription, or '/subscriptions/{subscriptionId}/providers/Microsoft.Billing/invoices/{invoiceName}' for an invoice or '/subscriptions/{subscriptionId}/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}' for a billing period.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;UsageDetailInner&gt; object if successful.
     */
    public PagedList<UsageDetailInner> list(final String scope) {
        ServiceResponse<Page<UsageDetailInner>> response = listSinglePageAsync(scope).toBlocking().single();
        return new PagedList<UsageDetailInner>(response.body()) {
            @Override
            public Page<UsageDetailInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists the usage details for a scope in reverse chronological order by billing period. Usage details are available via this API only for January 1, 2017 or later.
     *
     * @param scope The scope of the usage details. The scope can be '/subscriptions/{subscriptionId}' for a subscription, or '/subscriptions/{subscriptionId}/providers/Microsoft.Billing/invoices/{invoiceName}' for an invoice or '/subscriptions/{subscriptionId}/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}' for a billing period.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<UsageDetailInner>> listAsync(final String scope, final ListOperationCallback<UsageDetailInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(scope),
            new Func1<String, Observable<ServiceResponse<Page<UsageDetailInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<UsageDetailInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists the usage details for a scope in reverse chronological order by billing period. Usage details are available via this API only for January 1, 2017 or later.
     *
     * @param scope The scope of the usage details. The scope can be '/subscriptions/{subscriptionId}' for a subscription, or '/subscriptions/{subscriptionId}/providers/Microsoft.Billing/invoices/{invoiceName}' for an invoice or '/subscriptions/{subscriptionId}/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}' for a billing period.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;UsageDetailInner&gt; object
     */
    public Observable<Page<UsageDetailInner>> listAsync(final String scope) {
        return listWithServiceResponseAsync(scope)
            .map(new Func1<ServiceResponse<Page<UsageDetailInner>>, Page<UsageDetailInner>>() {
                @Override
                public Page<UsageDetailInner> call(ServiceResponse<Page<UsageDetailInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists the usage details for a scope in reverse chronological order by billing period. Usage details are available via this API only for January 1, 2017 or later.
     *
     * @param scope The scope of the usage details. The scope can be '/subscriptions/{subscriptionId}' for a subscription, or '/subscriptions/{subscriptionId}/providers/Microsoft.Billing/invoices/{invoiceName}' for an invoice or '/subscriptions/{subscriptionId}/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}' for a billing period.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;UsageDetailInner&gt; object
     */
    public Observable<ServiceResponse<Page<UsageDetailInner>>> listWithServiceResponseAsync(final String scope) {
        return listSinglePageAsync(scope)
            .concatMap(new Func1<ServiceResponse<Page<UsageDetailInner>>, Observable<ServiceResponse<Page<UsageDetailInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<UsageDetailInner>>> call(ServiceResponse<Page<UsageDetailInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists the usage details for a scope in reverse chronological order by billing period. Usage details are available via this API only for January 1, 2017 or later.
     *
     * @param scope The scope of the usage details. The scope can be '/subscriptions/{subscriptionId}' for a subscription, or '/subscriptions/{subscriptionId}/providers/Microsoft.Billing/invoices/{invoiceName}' for an invoice or '/subscriptions/{subscriptionId}/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}' for a billing period.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;UsageDetailInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<UsageDetailInner>>> listSinglePageAsync(final String scope) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String expand = null;
        final String filter = null;
        final String skiptoken = null;
        final Integer top = null;
        return service.list(scope, expand, filter, skiptoken, top, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<UsageDetailInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<UsageDetailInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<UsageDetailInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<UsageDetailInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Lists the usage details for a scope in reverse chronological order by billing period. Usage details are available via this API only for January 1, 2017 or later.
     *
     * @param scope The scope of the usage details. The scope can be '/subscriptions/{subscriptionId}' for a subscription, or '/subscriptions/{subscriptionId}/providers/Microsoft.Billing/invoices/{invoiceName}' for an invoice or '/subscriptions/{subscriptionId}/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}' for a billing period.
     * @param expand May be used to expand the additionalProperties or meterDetails property within a list of usage details. By default, these fields are not included when listing usage details.
     * @param filter May be used to filter usageDetails by usageEnd (Utc time). The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the most recent N usageDetails.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;UsageDetailInner&gt; object if successful.
     */
    public PagedList<UsageDetailInner> list(final String scope, final String expand, final String filter, final String skiptoken, final Integer top) {
        ServiceResponse<Page<UsageDetailInner>> response = listSinglePageAsync(scope, expand, filter, skiptoken, top).toBlocking().single();
        return new PagedList<UsageDetailInner>(response.body()) {
            @Override
            public Page<UsageDetailInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists the usage details for a scope in reverse chronological order by billing period. Usage details are available via this API only for January 1, 2017 or later.
     *
     * @param scope The scope of the usage details. The scope can be '/subscriptions/{subscriptionId}' for a subscription, or '/subscriptions/{subscriptionId}/providers/Microsoft.Billing/invoices/{invoiceName}' for an invoice or '/subscriptions/{subscriptionId}/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}' for a billing period.
     * @param expand May be used to expand the additionalProperties or meterDetails property within a list of usage details. By default, these fields are not included when listing usage details.
     * @param filter May be used to filter usageDetails by usageEnd (Utc time). The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the most recent N usageDetails.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<UsageDetailInner>> listAsync(final String scope, final String expand, final String filter, final String skiptoken, final Integer top, final ListOperationCallback<UsageDetailInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(scope, expand, filter, skiptoken, top),
            new Func1<String, Observable<ServiceResponse<Page<UsageDetailInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<UsageDetailInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists the usage details for a scope in reverse chronological order by billing period. Usage details are available via this API only for January 1, 2017 or later.
     *
     * @param scope The scope of the usage details. The scope can be '/subscriptions/{subscriptionId}' for a subscription, or '/subscriptions/{subscriptionId}/providers/Microsoft.Billing/invoices/{invoiceName}' for an invoice or '/subscriptions/{subscriptionId}/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}' for a billing period.
     * @param expand May be used to expand the additionalProperties or meterDetails property within a list of usage details. By default, these fields are not included when listing usage details.
     * @param filter May be used to filter usageDetails by usageEnd (Utc time). The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the most recent N usageDetails.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;UsageDetailInner&gt; object
     */
    public Observable<Page<UsageDetailInner>> listAsync(final String scope, final String expand, final String filter, final String skiptoken, final Integer top) {
        return listWithServiceResponseAsync(scope, expand, filter, skiptoken, top)
            .map(new Func1<ServiceResponse<Page<UsageDetailInner>>, Page<UsageDetailInner>>() {
                @Override
                public Page<UsageDetailInner> call(ServiceResponse<Page<UsageDetailInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists the usage details for a scope in reverse chronological order by billing period. Usage details are available via this API only for January 1, 2017 or later.
     *
     * @param scope The scope of the usage details. The scope can be '/subscriptions/{subscriptionId}' for a subscription, or '/subscriptions/{subscriptionId}/providers/Microsoft.Billing/invoices/{invoiceName}' for an invoice or '/subscriptions/{subscriptionId}/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}' for a billing period.
     * @param expand May be used to expand the additionalProperties or meterDetails property within a list of usage details. By default, these fields are not included when listing usage details.
     * @param filter May be used to filter usageDetails by usageEnd (Utc time). The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'.
     * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that specifies a starting point to use for subsequent calls.
     * @param top May be used to limit the number of results to the most recent N usageDetails.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;UsageDetailInner&gt; object
     */
    public Observable<ServiceResponse<Page<UsageDetailInner>>> listWithServiceResponseAsync(final String scope, final String expand, final String filter, final String skiptoken, final Integer top) {
        return listSinglePageAsync(scope, expand, filter, skiptoken, top)
            .concatMap(new Func1<ServiceResponse<Page<UsageDetailInner>>, Observable<ServiceResponse<Page<UsageDetailInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<UsageDetailInner>>> call(ServiceResponse<Page<UsageDetailInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists the usage details for a scope in reverse chronological order by billing period. Usage details are available via this API only for January 1, 2017 or later.
     *
    ServiceResponse<PageImpl<UsageDetailInner>> * @param scope The scope of the usage details. The scope can be '/subscriptions/{subscriptionId}' for a subscription, or '/subscriptions/{subscriptionId}/providers/Microsoft.Billing/invoices/{invoiceName}' for an invoice or '/subscriptions/{subscriptionId}/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}' for a billing period.
    ServiceResponse<PageImpl<UsageDetailInner>> * @param expand May be used to expand the additionalProperties or meterDetails property within a list of usage details. By default, these fields are not included when listing usage details.
    ServiceResponse<PageImpl<UsageDetailInner>> * @param filter May be used to filter usageDetails by usageEnd (Utc time). The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'.
    ServiceResponse<PageImpl<UsageDetailInner>> * @param skiptoken Skiptoken is only used if a previous operation returned a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skiptoken parameter that specifies a starting point to use for subsequent calls.
    ServiceResponse<PageImpl<UsageDetailInner>> * @param top May be used to limit the number of results to the most recent N usageDetails.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;UsageDetailInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<UsageDetailInner>>> listSinglePageAsync(final String scope, final String expand, final String filter, final String skiptoken, final Integer top) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(scope, expand, filter, skiptoken, top, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<UsageDetailInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<UsageDetailInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<UsageDetailInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<UsageDetailInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<UsageDetailInner>> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<UsageDetailInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<UsageDetailInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Lists the usage details for a scope in reverse chronological order by billing period. Usage details are available via this API only for January 1, 2017 or later.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;UsageDetailInner&gt; object if successful.
     */
    public PagedList<UsageDetailInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<UsageDetailInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<UsageDetailInner>(response.body()) {
            @Override
            public Page<UsageDetailInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists the usage details for a scope in reverse chronological order by billing period. Usage details are available via this API only for January 1, 2017 or later.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<UsageDetailInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<UsageDetailInner>> serviceFuture, final ListOperationCallback<UsageDetailInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<UsageDetailInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<UsageDetailInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists the usage details for a scope in reverse chronological order by billing period. Usage details are available via this API only for January 1, 2017 or later.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;UsageDetailInner&gt; object
     */
    public Observable<Page<UsageDetailInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<UsageDetailInner>>, Page<UsageDetailInner>>() {
                @Override
                public Page<UsageDetailInner> call(ServiceResponse<Page<UsageDetailInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists the usage details for a scope in reverse chronological order by billing period. Usage details are available via this API only for January 1, 2017 or later.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;UsageDetailInner&gt; object
     */
    public Observable<ServiceResponse<Page<UsageDetailInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<UsageDetailInner>>, Observable<ServiceResponse<Page<UsageDetailInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<UsageDetailInner>>> call(ServiceResponse<Page<UsageDetailInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists the usage details for a scope in reverse chronological order by billing period. Usage details are available via this API only for January 1, 2017 or later.
     *
    ServiceResponse<PageImpl<UsageDetailInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;UsageDetailInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<UsageDetailInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<UsageDetailInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<UsageDetailInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<UsageDetailInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<UsageDetailInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<UsageDetailInner>> listNextDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<UsageDetailInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<UsageDetailInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
