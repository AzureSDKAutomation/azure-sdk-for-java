/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.workloadmonitor.v2018_08_31_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
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
import retrofit2.http.Query;
import retrofit2.http.Url;
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
    private WorkloadMonitorAPIImpl client;

    /**
     * Initializes an instance of OperationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public OperationsInner(Retrofit retrofit, WorkloadMonitorAPIImpl client) {
        this.service = retrofit.create(OperationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Operations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface OperationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.workloadmonitor.v2018_08_31_preview.Operations list" })
        @GET("providers/Microsoft.WorkloadMonitor/operations")
        Observable<Response<ResponseBody>> list(@Query("api-version") String apiVersion, @Query("$skiptoken") String skiptoken, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.workloadmonitor.v2018_08_31_preview.Operations listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the details of all operations possible on the resource provider.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;OperationInner&gt; object if successful.
     */
    public PagedList<OperationInner> list() {
        ServiceResponse<Page<OperationInner>> response = listSinglePageAsync().toBlocking().single();
        return new PagedList<OperationInner>(response.body()) {
            @Override
            public Page<OperationInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets the details of all operations possible on the resource provider.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<OperationInner>> listAsync(final ListOperationCallback<OperationInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(),
            new Func1<String, Observable<ServiceResponse<Page<OperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets the details of all operations possible on the resource provider.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OperationInner&gt; object
     */
    public Observable<Page<OperationInner>> listAsync() {
        return listWithServiceResponseAsync()
            .map(new Func1<ServiceResponse<Page<OperationInner>>, Page<OperationInner>>() {
                @Override
                public Page<OperationInner> call(ServiceResponse<Page<OperationInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets the details of all operations possible on the resource provider.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OperationInner&gt; object
     */
    public Observable<ServiceResponse<Page<OperationInner>>> listWithServiceResponseAsync() {
        return listSinglePageAsync()
            .concatMap(new Func1<ServiceResponse<Page<OperationInner>>, Observable<ServiceResponse<Page<OperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationInner>>> call(ServiceResponse<Page<OperationInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets the details of all operations possible on the resource provider.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;OperationInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<OperationInner>>> listSinglePageAsync() {
        final String skiptoken = null;
        return service.list(this.client.apiVersion(), skiptoken, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<OperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<OperationInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<OperationInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets the details of all operations possible on the resource provider.
     *
     * @param skiptoken The page-continuation token to use with a paged version of this API.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;OperationInner&gt; object if successful.
     */
    public PagedList<OperationInner> list(final String skiptoken) {
        ServiceResponse<Page<OperationInner>> response = listSinglePageAsync(skiptoken).toBlocking().single();
        return new PagedList<OperationInner>(response.body()) {
            @Override
            public Page<OperationInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets the details of all operations possible on the resource provider.
     *
     * @param skiptoken The page-continuation token to use with a paged version of this API.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<OperationInner>> listAsync(final String skiptoken, final ListOperationCallback<OperationInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(skiptoken),
            new Func1<String, Observable<ServiceResponse<Page<OperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets the details of all operations possible on the resource provider.
     *
     * @param skiptoken The page-continuation token to use with a paged version of this API.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OperationInner&gt; object
     */
    public Observable<Page<OperationInner>> listAsync(final String skiptoken) {
        return listWithServiceResponseAsync(skiptoken)
            .map(new Func1<ServiceResponse<Page<OperationInner>>, Page<OperationInner>>() {
                @Override
                public Page<OperationInner> call(ServiceResponse<Page<OperationInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets the details of all operations possible on the resource provider.
     *
     * @param skiptoken The page-continuation token to use with a paged version of this API.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OperationInner&gt; object
     */
    public Observable<ServiceResponse<Page<OperationInner>>> listWithServiceResponseAsync(final String skiptoken) {
        return listSinglePageAsync(skiptoken)
            .concatMap(new Func1<ServiceResponse<Page<OperationInner>>, Observable<ServiceResponse<Page<OperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationInner>>> call(ServiceResponse<Page<OperationInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets the details of all operations possible on the resource provider.
     *
    ServiceResponse<PageImpl<OperationInner>> * @param skiptoken The page-continuation token to use with a paged version of this API.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;OperationInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<OperationInner>>> listSinglePageAsync(final String skiptoken) {
        return service.list(this.client.apiVersion(), skiptoken, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<OperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<OperationInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<OperationInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<OperationInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<OperationInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<OperationInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the details of all operations possible on the resource provider.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;OperationInner&gt; object if successful.
     */
    public PagedList<OperationInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<OperationInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<OperationInner>(response.body()) {
            @Override
            public Page<OperationInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets the details of all operations possible on the resource provider.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<OperationInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<OperationInner>> serviceFuture, final ListOperationCallback<OperationInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<OperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets the details of all operations possible on the resource provider.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OperationInner&gt; object
     */
    public Observable<Page<OperationInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<OperationInner>>, Page<OperationInner>>() {
                @Override
                public Page<OperationInner> call(ServiceResponse<Page<OperationInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets the details of all operations possible on the resource provider.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OperationInner&gt; object
     */
    public Observable<ServiceResponse<Page<OperationInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<OperationInner>>, Observable<ServiceResponse<Page<OperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationInner>>> call(ServiceResponse<Page<OperationInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets the details of all operations possible on the resource provider.
     *
    ServiceResponse<PageImpl<OperationInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;OperationInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<OperationInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<OperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<OperationInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<OperationInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<OperationInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<OperationInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<OperationInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
