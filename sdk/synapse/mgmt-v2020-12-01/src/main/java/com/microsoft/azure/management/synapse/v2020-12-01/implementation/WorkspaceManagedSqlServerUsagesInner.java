/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020-12-01.implementation;

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
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in WorkspaceManagedSqlServerUsages.
 */
public class WorkspaceManagedSqlServerUsagesInner {
    /** The Retrofit service to perform REST calls. */
    private WorkspaceManagedSqlServerUsagesService service;
    /** The service client containing this operation class. */
    private SynapseManagementClientImpl client;

    /**
     * Initializes an instance of WorkspaceManagedSqlServerUsagesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public WorkspaceManagedSqlServerUsagesInner(Retrofit retrofit, SynapseManagementClientImpl client) {
        this.service = retrofit.create(WorkspaceManagedSqlServerUsagesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for WorkspaceManagedSqlServerUsages to be
     * used by Retrofit to perform actually REST calls.
     */
    interface WorkspaceManagedSqlServerUsagesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2020-12-01.WorkspaceManagedSqlServerUsages list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/sqlUsages")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2020-12-01.WorkspaceManagedSqlServerUsages listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get list of usages metric for the server.
     * Get list of server usages metric for workspace managed sql server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ServerUsageInner&gt; object if successful.
     */
    public PagedList<ServerUsageInner> list(final String resourceGroupName, final String workspaceName) {
        ServiceResponse<Page<ServerUsageInner>> response = listSinglePageAsync(resourceGroupName, workspaceName).toBlocking().single();
        return new PagedList<ServerUsageInner>(response.body()) {
            @Override
            public Page<ServerUsageInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Get list of usages metric for the server.
     * Get list of server usages metric for workspace managed sql server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ServerUsageInner>> listAsync(final String resourceGroupName, final String workspaceName, final ListOperationCallback<ServerUsageInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(resourceGroupName, workspaceName),
            new Func1<String, Observable<ServiceResponse<Page<ServerUsageInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ServerUsageInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Get list of usages metric for the server.
     * Get list of server usages metric for workspace managed sql server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ServerUsageInner&gt; object
     */
    public Observable<Page<ServerUsageInner>> listAsync(final String resourceGroupName, final String workspaceName) {
        return listWithServiceResponseAsync(resourceGroupName, workspaceName)
            .map(new Func1<ServiceResponse<Page<ServerUsageInner>>, Page<ServerUsageInner>>() {
                @Override
                public Page<ServerUsageInner> call(ServiceResponse<Page<ServerUsageInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Get list of usages metric for the server.
     * Get list of server usages metric for workspace managed sql server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ServerUsageInner&gt; object
     */
    public Observable<ServiceResponse<Page<ServerUsageInner>>> listWithServiceResponseAsync(final String resourceGroupName, final String workspaceName) {
        return listSinglePageAsync(resourceGroupName, workspaceName)
            .concatMap(new Func1<ServiceResponse<Page<ServerUsageInner>>, Observable<ServiceResponse<Page<ServerUsageInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ServerUsageInner>>> call(ServiceResponse<Page<ServerUsageInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Get list of usages metric for the server.
     * Get list of server usages metric for workspace managed sql server.
     *
    ServiceResponse<PageImpl<ServerUsageInner>> * @param resourceGroupName The name of the resource group. The name is case insensitive.
    ServiceResponse<PageImpl<ServerUsageInner>> * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ServerUsageInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ServerUsageInner>>> listSinglePageAsync(final String resourceGroupName, final String workspaceName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), resourceGroupName, workspaceName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ServerUsageInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ServerUsageInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ServerUsageInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ServerUsageInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ServerUsageInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ServerUsageInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ServerUsageInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get list of usages metric for the server.
     * Get list of server usages metric for workspace managed sql server.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ServerUsageInner&gt; object if successful.
     */
    public PagedList<ServerUsageInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<ServerUsageInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<ServerUsageInner>(response.body()) {
            @Override
            public Page<ServerUsageInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Get list of usages metric for the server.
     * Get list of server usages metric for workspace managed sql server.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ServerUsageInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<ServerUsageInner>> serviceFuture, final ListOperationCallback<ServerUsageInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<ServerUsageInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ServerUsageInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Get list of usages metric for the server.
     * Get list of server usages metric for workspace managed sql server.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ServerUsageInner&gt; object
     */
    public Observable<Page<ServerUsageInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<ServerUsageInner>>, Page<ServerUsageInner>>() {
                @Override
                public Page<ServerUsageInner> call(ServiceResponse<Page<ServerUsageInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Get list of usages metric for the server.
     * Get list of server usages metric for workspace managed sql server.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ServerUsageInner&gt; object
     */
    public Observable<ServiceResponse<Page<ServerUsageInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<ServerUsageInner>>, Observable<ServiceResponse<Page<ServerUsageInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ServerUsageInner>>> call(ServiceResponse<Page<ServerUsageInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Get list of usages metric for the server.
     * Get list of server usages metric for workspace managed sql server.
     *
    ServiceResponse<PageImpl<ServerUsageInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ServerUsageInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ServerUsageInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ServerUsageInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ServerUsageInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ServerUsageInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ServerUsageInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ServerUsageInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ServerUsageInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ServerUsageInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
