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
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
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
 * in Advisors.
 */
public class AdvisorsInner {
    /** The Retrofit service to perform REST calls. */
    private AdvisorsService service;
    /** The service client containing this operation class. */
    private MariaDBManagementClientImpl client;

    /**
     * Initializes an instance of AdvisorsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public AdvisorsInner(Retrofit retrofit, MariaDBManagementClientImpl client) {
        this.service = retrofit.create(AdvisorsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Advisors to be
     * used by Retrofit to perform actually REST calls.
     */
    interface AdvisorsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.mariadb.v2018_06_01.Advisors get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBforMariaDB/servers/{serverName}/advisors/{advisorName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("advisorName") String advisorName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.mariadb.v2018_06_01.Advisors listByServer" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBforMariaDB/servers/{serverName}/advisors")
        Observable<Response<ResponseBody>> listByServer(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.mariadb.v2018_06_01.Advisors listByServerNext" })
        @GET
        Observable<Response<ResponseBody>> listByServerNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get a recommendation action advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AdvisorInner object if successful.
     */
    public AdvisorInner get(String resourceGroupName, String serverName, String advisorName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName, advisorName).toBlocking().single().body();
    }

    /**
     * Get a recommendation action advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AdvisorInner> getAsync(String resourceGroupName, String serverName, String advisorName, final ServiceCallback<AdvisorInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, serverName, advisorName), serviceCallback);
    }

    /**
     * Get a recommendation action advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdvisorInner object
     */
    public Observable<AdvisorInner> getAsync(String resourceGroupName, String serverName, String advisorName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName, advisorName).map(new Func1<ServiceResponse<AdvisorInner>, AdvisorInner>() {
            @Override
            public AdvisorInner call(ServiceResponse<AdvisorInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get a recommendation action advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdvisorInner object
     */
    public Observable<ServiceResponse<AdvisorInner>> getWithServiceResponseAsync(String resourceGroupName, String serverName, String advisorName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (advisorName == null) {
            throw new IllegalArgumentException("Parameter advisorName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), resourceGroupName, serverName, advisorName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AdvisorInner>>>() {
                @Override
                public Observable<ServiceResponse<AdvisorInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AdvisorInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AdvisorInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<AdvisorInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<AdvisorInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * List recommendation action advisors.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;AdvisorInner&gt; object if successful.
     */
    public PagedList<AdvisorInner> listByServer(final String resourceGroupName, final String serverName) {
        ServiceResponse<Page<AdvisorInner>> response = listByServerSinglePageAsync(resourceGroupName, serverName).toBlocking().single();
        return new PagedList<AdvisorInner>(response.body()) {
            @Override
            public Page<AdvisorInner> nextPage(String nextPageLink) {
                return listByServerNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * List recommendation action advisors.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<AdvisorInner>> listByServerAsync(final String resourceGroupName, final String serverName, final ListOperationCallback<AdvisorInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByServerSinglePageAsync(resourceGroupName, serverName),
            new Func1<String, Observable<ServiceResponse<Page<AdvisorInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AdvisorInner>>> call(String nextPageLink) {
                    return listByServerNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * List recommendation action advisors.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;AdvisorInner&gt; object
     */
    public Observable<Page<AdvisorInner>> listByServerAsync(final String resourceGroupName, final String serverName) {
        return listByServerWithServiceResponseAsync(resourceGroupName, serverName)
            .map(new Func1<ServiceResponse<Page<AdvisorInner>>, Page<AdvisorInner>>() {
                @Override
                public Page<AdvisorInner> call(ServiceResponse<Page<AdvisorInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * List recommendation action advisors.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;AdvisorInner&gt; object
     */
    public Observable<ServiceResponse<Page<AdvisorInner>>> listByServerWithServiceResponseAsync(final String resourceGroupName, final String serverName) {
        return listByServerSinglePageAsync(resourceGroupName, serverName)
            .concatMap(new Func1<ServiceResponse<Page<AdvisorInner>>, Observable<ServiceResponse<Page<AdvisorInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AdvisorInner>>> call(ServiceResponse<Page<AdvisorInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByServerNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * List recommendation action advisors.
     *
    ServiceResponse<PageImpl1<AdvisorInner>> * @param resourceGroupName The name of the resource group. The name is case insensitive.
    ServiceResponse<PageImpl1<AdvisorInner>> * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;AdvisorInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<AdvisorInner>>> listByServerSinglePageAsync(final String resourceGroupName, final String serverName) {
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
        return service.listByServer(this.client.subscriptionId(), resourceGroupName, serverName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<AdvisorInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AdvisorInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<AdvisorInner>> result = listByServerDelegate(response);
                        return Observable.just(new ServiceResponse<Page<AdvisorInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<AdvisorInner>> listByServerDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<AdvisorInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<AdvisorInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * List recommendation action advisors.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;AdvisorInner&gt; object if successful.
     */
    public PagedList<AdvisorInner> listByServerNext(final String nextPageLink) {
        ServiceResponse<Page<AdvisorInner>> response = listByServerNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<AdvisorInner>(response.body()) {
            @Override
            public Page<AdvisorInner> nextPage(String nextPageLink) {
                return listByServerNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * List recommendation action advisors.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<AdvisorInner>> listByServerNextAsync(final String nextPageLink, final ServiceFuture<List<AdvisorInner>> serviceFuture, final ListOperationCallback<AdvisorInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByServerNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<AdvisorInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AdvisorInner>>> call(String nextPageLink) {
                    return listByServerNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * List recommendation action advisors.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;AdvisorInner&gt; object
     */
    public Observable<Page<AdvisorInner>> listByServerNextAsync(final String nextPageLink) {
        return listByServerNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<AdvisorInner>>, Page<AdvisorInner>>() {
                @Override
                public Page<AdvisorInner> call(ServiceResponse<Page<AdvisorInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * List recommendation action advisors.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;AdvisorInner&gt; object
     */
    public Observable<ServiceResponse<Page<AdvisorInner>>> listByServerNextWithServiceResponseAsync(final String nextPageLink) {
        return listByServerNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<AdvisorInner>>, Observable<ServiceResponse<Page<AdvisorInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AdvisorInner>>> call(ServiceResponse<Page<AdvisorInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByServerNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * List recommendation action advisors.
     *
    ServiceResponse<PageImpl1<AdvisorInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;AdvisorInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<AdvisorInner>>> listByServerNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByServerNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<AdvisorInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<AdvisorInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<AdvisorInner>> result = listByServerNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<AdvisorInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<AdvisorInner>> listByServerNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<AdvisorInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<AdvisorInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
