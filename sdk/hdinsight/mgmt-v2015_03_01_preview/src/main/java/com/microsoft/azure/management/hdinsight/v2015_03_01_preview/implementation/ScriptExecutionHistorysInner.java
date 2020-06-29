/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2015_03_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.hdinsight.v2015_03_01_preview.ErrorResponseException;
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
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ScriptExecutionHistorys.
 */
public class ScriptExecutionHistorysInner {
    /** The Retrofit service to perform REST calls. */
    private ScriptExecutionHistorysService service;
    /** The service client containing this operation class. */
    private HDInsightManagementClientImpl client;

    /**
     * Initializes an instance of ScriptExecutionHistorysInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ScriptExecutionHistorysInner(Retrofit retrofit, HDInsightManagementClientImpl client) {
        this.service = retrofit.create(ScriptExecutionHistorysService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ScriptExecutionHistorys to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ScriptExecutionHistorysService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.hdinsight.v2015_03_01_preview.ScriptExecutionHistorys list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.HDInsight/clusters/{clusterName}/scriptExecutionHistory")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("clusterName") String clusterName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.hdinsight.v2015_03_01_preview.ScriptExecutionHistorys promote" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.HDInsight/clusters/{clusterName}/scriptExecutionHistory/{scriptExecutionId}/promote")
        Observable<Response<ResponseBody>> promote(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("clusterName") String clusterName, @Path("scriptExecutionId") String scriptExecutionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.hdinsight.v2015_03_01_preview.ScriptExecutionHistorys listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists all scripts' execution history for the specified cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;RuntimeScriptActionDetailInner&gt; object if successful.
     */
    public PagedList<RuntimeScriptActionDetailInner> list(final String resourceGroupName, final String clusterName) {
        ServiceResponse<Page<RuntimeScriptActionDetailInner>> response = listSinglePageAsync(resourceGroupName, clusterName).toBlocking().single();
        return new PagedList<RuntimeScriptActionDetailInner>(response.body()) {
            @Override
            public Page<RuntimeScriptActionDetailInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists all scripts' execution history for the specified cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<RuntimeScriptActionDetailInner>> listAsync(final String resourceGroupName, final String clusterName, final ListOperationCallback<RuntimeScriptActionDetailInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(resourceGroupName, clusterName),
            new Func1<String, Observable<ServiceResponse<Page<RuntimeScriptActionDetailInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RuntimeScriptActionDetailInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all scripts' execution history for the specified cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RuntimeScriptActionDetailInner&gt; object
     */
    public Observable<Page<RuntimeScriptActionDetailInner>> listAsync(final String resourceGroupName, final String clusterName) {
        return listWithServiceResponseAsync(resourceGroupName, clusterName)
            .map(new Func1<ServiceResponse<Page<RuntimeScriptActionDetailInner>>, Page<RuntimeScriptActionDetailInner>>() {
                @Override
                public Page<RuntimeScriptActionDetailInner> call(ServiceResponse<Page<RuntimeScriptActionDetailInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists all scripts' execution history for the specified cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RuntimeScriptActionDetailInner&gt; object
     */
    public Observable<ServiceResponse<Page<RuntimeScriptActionDetailInner>>> listWithServiceResponseAsync(final String resourceGroupName, final String clusterName) {
        return listSinglePageAsync(resourceGroupName, clusterName)
            .concatMap(new Func1<ServiceResponse<Page<RuntimeScriptActionDetailInner>>, Observable<ServiceResponse<Page<RuntimeScriptActionDetailInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RuntimeScriptActionDetailInner>>> call(ServiceResponse<Page<RuntimeScriptActionDetailInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all scripts' execution history for the specified cluster.
     *
    ServiceResponse<PageImpl<RuntimeScriptActionDetailInner>> * @param resourceGroupName The name of the resource group.
    ServiceResponse<PageImpl<RuntimeScriptActionDetailInner>> * @param clusterName The name of the cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;RuntimeScriptActionDetailInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<RuntimeScriptActionDetailInner>>> listSinglePageAsync(final String resourceGroupName, final String clusterName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (clusterName == null) {
            throw new IllegalArgumentException("Parameter clusterName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), resourceGroupName, clusterName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<RuntimeScriptActionDetailInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RuntimeScriptActionDetailInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<RuntimeScriptActionDetailInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<RuntimeScriptActionDetailInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<RuntimeScriptActionDetailInner>> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<RuntimeScriptActionDetailInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<RuntimeScriptActionDetailInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Promotes the specified ad-hoc script execution to a persisted script.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param scriptExecutionId The script execution Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void promote(String resourceGroupName, String clusterName, String scriptExecutionId) {
        promoteWithServiceResponseAsync(resourceGroupName, clusterName, scriptExecutionId).toBlocking().single().body();
    }

    /**
     * Promotes the specified ad-hoc script execution to a persisted script.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param scriptExecutionId The script execution Id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> promoteAsync(String resourceGroupName, String clusterName, String scriptExecutionId, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(promoteWithServiceResponseAsync(resourceGroupName, clusterName, scriptExecutionId), serviceCallback);
    }

    /**
     * Promotes the specified ad-hoc script execution to a persisted script.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param scriptExecutionId The script execution Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> promoteAsync(String resourceGroupName, String clusterName, String scriptExecutionId) {
        return promoteWithServiceResponseAsync(resourceGroupName, clusterName, scriptExecutionId).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Promotes the specified ad-hoc script execution to a persisted script.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster.
     * @param scriptExecutionId The script execution Id
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> promoteWithServiceResponseAsync(String resourceGroupName, String clusterName, String scriptExecutionId) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (clusterName == null) {
            throw new IllegalArgumentException("Parameter clusterName is required and cannot be null.");
        }
        if (scriptExecutionId == null) {
            throw new IllegalArgumentException("Parameter scriptExecutionId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.promote(this.client.subscriptionId(), resourceGroupName, clusterName, scriptExecutionId, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = promoteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> promoteDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Lists all scripts' execution history for the specified cluster.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;RuntimeScriptActionDetailInner&gt; object if successful.
     */
    public PagedList<RuntimeScriptActionDetailInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<RuntimeScriptActionDetailInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<RuntimeScriptActionDetailInner>(response.body()) {
            @Override
            public Page<RuntimeScriptActionDetailInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists all scripts' execution history for the specified cluster.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<RuntimeScriptActionDetailInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<RuntimeScriptActionDetailInner>> serviceFuture, final ListOperationCallback<RuntimeScriptActionDetailInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<RuntimeScriptActionDetailInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RuntimeScriptActionDetailInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all scripts' execution history for the specified cluster.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RuntimeScriptActionDetailInner&gt; object
     */
    public Observable<Page<RuntimeScriptActionDetailInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<RuntimeScriptActionDetailInner>>, Page<RuntimeScriptActionDetailInner>>() {
                @Override
                public Page<RuntimeScriptActionDetailInner> call(ServiceResponse<Page<RuntimeScriptActionDetailInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists all scripts' execution history for the specified cluster.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RuntimeScriptActionDetailInner&gt; object
     */
    public Observable<ServiceResponse<Page<RuntimeScriptActionDetailInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<RuntimeScriptActionDetailInner>>, Observable<ServiceResponse<Page<RuntimeScriptActionDetailInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RuntimeScriptActionDetailInner>>> call(ServiceResponse<Page<RuntimeScriptActionDetailInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all scripts' execution history for the specified cluster.
     *
    ServiceResponse<PageImpl<RuntimeScriptActionDetailInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;RuntimeScriptActionDetailInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<RuntimeScriptActionDetailInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<RuntimeScriptActionDetailInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RuntimeScriptActionDetailInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<RuntimeScriptActionDetailInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<RuntimeScriptActionDetailInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<RuntimeScriptActionDetailInner>> listNextDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<RuntimeScriptActionDetailInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<RuntimeScriptActionDetailInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
