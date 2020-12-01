/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mariadb.v2018_06_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.mariadb.v2018_06_01.WaitStatisticsInput;
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
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in WaitStatistics.
 */
public class WaitStatisticsInner {
    /** The Retrofit service to perform REST calls. */
    private WaitStatisticsService service;
    /** The service client containing this operation class. */
    private MariaDBManagementClientImpl client;

    /**
     * Initializes an instance of WaitStatisticsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public WaitStatisticsInner(Retrofit retrofit, MariaDBManagementClientImpl client) {
        this.service = retrofit.create(WaitStatisticsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for WaitStatistics to be
     * used by Retrofit to perform actually REST calls.
     */
    interface WaitStatisticsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.mariadb.v2018_06_01.WaitStatistics get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBforMariaDB/servers/{serverName}/waitStatistics/{waitStatisticsId}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("waitStatisticsId") String waitStatisticsId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.mariadb.v2018_06_01.WaitStatistics listByServer" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBforMariaDB/servers/{serverName}/waitStatistics")
        Observable<Response<ResponseBody>> listByServer(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Query("api-version") String apiVersion, @Body WaitStatisticsInput parameters, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.mariadb.v2018_06_01.WaitStatistics listByServerNext" })
        @GET
        Observable<Response<ResponseBody>> listByServerNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Retrieve wait statistics for specified identifier.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param waitStatisticsId The Wait Statistic identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the WaitStatisticInner object if successful.
     */
    public WaitStatisticInner get(String resourceGroupName, String serverName, String waitStatisticsId) {
        return getWithServiceResponseAsync(resourceGroupName, serverName, waitStatisticsId).toBlocking().single().body();
    }

    /**
     * Retrieve wait statistics for specified identifier.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param waitStatisticsId The Wait Statistic identifier.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<WaitStatisticInner> getAsync(String resourceGroupName, String serverName, String waitStatisticsId, final ServiceCallback<WaitStatisticInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, serverName, waitStatisticsId), serviceCallback);
    }

    /**
     * Retrieve wait statistics for specified identifier.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param waitStatisticsId The Wait Statistic identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WaitStatisticInner object
     */
    public Observable<WaitStatisticInner> getAsync(String resourceGroupName, String serverName, String waitStatisticsId) {
        return getWithServiceResponseAsync(resourceGroupName, serverName, waitStatisticsId).map(new Func1<ServiceResponse<WaitStatisticInner>, WaitStatisticInner>() {
            @Override
            public WaitStatisticInner call(ServiceResponse<WaitStatisticInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Retrieve wait statistics for specified identifier.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param waitStatisticsId The Wait Statistic identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WaitStatisticInner object
     */
    public Observable<ServiceResponse<WaitStatisticInner>> getWithServiceResponseAsync(String resourceGroupName, String serverName, String waitStatisticsId) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (waitStatisticsId == null) {
            throw new IllegalArgumentException("Parameter waitStatisticsId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), resourceGroupName, serverName, waitStatisticsId, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<WaitStatisticInner>>>() {
                @Override
                public Observable<ServiceResponse<WaitStatisticInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<WaitStatisticInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<WaitStatisticInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<WaitStatisticInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<WaitStatisticInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Retrieve wait statistics for specified aggregation window.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters The required parameters for retrieving wait statistics.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;WaitStatisticInner&gt; object if successful.
     */
    public PagedList<WaitStatisticInner> listByServer(final String resourceGroupName, final String serverName, final WaitStatisticsInput parameters) {
        ServiceResponse<Page<WaitStatisticInner>> response = listByServerSinglePageAsync(resourceGroupName, serverName, parameters).toBlocking().single();
        return new PagedList<WaitStatisticInner>(response.body()) {
            @Override
            public Page<WaitStatisticInner> nextPage(String nextPageLink) {
                return listByServerNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Retrieve wait statistics for specified aggregation window.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters The required parameters for retrieving wait statistics.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<WaitStatisticInner>> listByServerAsync(final String resourceGroupName, final String serverName, final WaitStatisticsInput parameters, final ListOperationCallback<WaitStatisticInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByServerSinglePageAsync(resourceGroupName, serverName, parameters),
            new Func1<String, Observable<ServiceResponse<Page<WaitStatisticInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WaitStatisticInner>>> call(String nextPageLink) {
                    return listByServerNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Retrieve wait statistics for specified aggregation window.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters The required parameters for retrieving wait statistics.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;WaitStatisticInner&gt; object
     */
    public Observable<Page<WaitStatisticInner>> listByServerAsync(final String resourceGroupName, final String serverName, final WaitStatisticsInput parameters) {
        return listByServerWithServiceResponseAsync(resourceGroupName, serverName, parameters)
            .map(new Func1<ServiceResponse<Page<WaitStatisticInner>>, Page<WaitStatisticInner>>() {
                @Override
                public Page<WaitStatisticInner> call(ServiceResponse<Page<WaitStatisticInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Retrieve wait statistics for specified aggregation window.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters The required parameters for retrieving wait statistics.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;WaitStatisticInner&gt; object
     */
    public Observable<ServiceResponse<Page<WaitStatisticInner>>> listByServerWithServiceResponseAsync(final String resourceGroupName, final String serverName, final WaitStatisticsInput parameters) {
        return listByServerSinglePageAsync(resourceGroupName, serverName, parameters)
            .concatMap(new Func1<ServiceResponse<Page<WaitStatisticInner>>, Observable<ServiceResponse<Page<WaitStatisticInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WaitStatisticInner>>> call(ServiceResponse<Page<WaitStatisticInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByServerNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Retrieve wait statistics for specified aggregation window.
     *
    ServiceResponse<PageImpl1<WaitStatisticInner>> * @param resourceGroupName The name of the resource group. The name is case insensitive.
    ServiceResponse<PageImpl1<WaitStatisticInner>> * @param serverName The name of the server.
    ServiceResponse<PageImpl1<WaitStatisticInner>> * @param parameters The required parameters for retrieving wait statistics.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;WaitStatisticInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<WaitStatisticInner>>> listByServerSinglePageAsync(final String resourceGroupName, final String serverName, final WaitStatisticsInput parameters) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.listByServer(this.client.subscriptionId(), resourceGroupName, serverName, this.client.apiVersion(), parameters, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<WaitStatisticInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WaitStatisticInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<WaitStatisticInner>> result = listByServerDelegate(response);
                        return Observable.just(new ServiceResponse<Page<WaitStatisticInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<WaitStatisticInner>> listByServerDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<WaitStatisticInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<WaitStatisticInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Retrieve wait statistics for specified aggregation window.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;WaitStatisticInner&gt; object if successful.
     */
    public PagedList<WaitStatisticInner> listByServerNext(final String nextPageLink) {
        ServiceResponse<Page<WaitStatisticInner>> response = listByServerNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<WaitStatisticInner>(response.body()) {
            @Override
            public Page<WaitStatisticInner> nextPage(String nextPageLink) {
                return listByServerNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Retrieve wait statistics for specified aggregation window.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<WaitStatisticInner>> listByServerNextAsync(final String nextPageLink, final ServiceFuture<List<WaitStatisticInner>> serviceFuture, final ListOperationCallback<WaitStatisticInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByServerNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<WaitStatisticInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WaitStatisticInner>>> call(String nextPageLink) {
                    return listByServerNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Retrieve wait statistics for specified aggregation window.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;WaitStatisticInner&gt; object
     */
    public Observable<Page<WaitStatisticInner>> listByServerNextAsync(final String nextPageLink) {
        return listByServerNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<WaitStatisticInner>>, Page<WaitStatisticInner>>() {
                @Override
                public Page<WaitStatisticInner> call(ServiceResponse<Page<WaitStatisticInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Retrieve wait statistics for specified aggregation window.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;WaitStatisticInner&gt; object
     */
    public Observable<ServiceResponse<Page<WaitStatisticInner>>> listByServerNextWithServiceResponseAsync(final String nextPageLink) {
        return listByServerNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<WaitStatisticInner>>, Observable<ServiceResponse<Page<WaitStatisticInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WaitStatisticInner>>> call(ServiceResponse<Page<WaitStatisticInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByServerNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Retrieve wait statistics for specified aggregation window.
     *
    ServiceResponse<PageImpl1<WaitStatisticInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;WaitStatisticInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<WaitStatisticInner>>> listByServerNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByServerNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<WaitStatisticInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WaitStatisticInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<WaitStatisticInner>> result = listByServerNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<WaitStatisticInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<WaitStatisticInner>> listByServerNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<WaitStatisticInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<WaitStatisticInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
