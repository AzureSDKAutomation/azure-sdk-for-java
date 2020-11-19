/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_10_01.implementation;

import com.microsoft.azure.arm.collection.InnerSupportsListing;
import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.loganalytics.v2020_10_01.WorkspaceErrorResponseException;
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
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in DeletedWorkspaces.
 */
public class DeletedWorkspacesInner implements InnerSupportsListing<WorkspaceInner> {
    /** The Retrofit service to perform REST calls. */
    private DeletedWorkspacesService service;
    /** The service client containing this operation class. */
    private OperationalInsightsManagementClientImpl client;

    /**
     * Initializes an instance of DeletedWorkspacesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public DeletedWorkspacesInner(Retrofit retrofit, OperationalInsightsManagementClientImpl client) {
        this.service = retrofit.create(DeletedWorkspacesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for DeletedWorkspaces to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DeletedWorkspacesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.loganalytics.v2020_10_01.DeletedWorkspaces list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.OperationalInsights/deletedWorkspaces")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.loganalytics.v2020_10_01.DeletedWorkspaces listByResourceGroup" })
        @GET("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/deletedWorkspaces")
        Observable<Response<ResponseBody>> listByResourceGroup(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets recently deleted workspaces in a subscription, available for recovery.
     *
     * @return the PagedList<WorkspaceInner> object if successful.
     */
    public PagedList<WorkspaceInner> list() {
        PageImpl1<WorkspaceInner> page = new PageImpl1<>();
        page.setItems(listWithServiceResponseAsync().toBlocking().single().body());
        page.setNextPageLink(null);
        return new PagedList<WorkspaceInner>(page) {
            @Override
            public Page<WorkspaceInner> nextPage(String nextPageLink) {
                return null;
            }
        };
    }

    /**
     * Gets recently deleted workspaces in a subscription, available for recovery.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<WorkspaceInner>> listAsync(final ServiceCallback<List<WorkspaceInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Gets recently deleted workspaces in a subscription, available for recovery.
     *
     * @return the observable to the List&lt;WorkspaceInner&gt; object
     */
    public Observable<Page<WorkspaceInner>> listAsync() {
        return listWithServiceResponseAsync().map(new Func1<ServiceResponse<List<WorkspaceInner>>, Page<WorkspaceInner>>() {
            @Override
            public Page<WorkspaceInner> call(ServiceResponse<List<WorkspaceInner>> response) {
                PageImpl1<WorkspaceInner> page = new PageImpl1<>();
                page.setItems(response.body());
                return page;
            }
        });
    }

    /**
     * Gets recently deleted workspaces in a subscription, available for recovery.
     *
     * @return the observable to the List&lt;WorkspaceInner&gt; object
     */
    public Observable<ServiceResponse<List<WorkspaceInner>>> listWithServiceResponseAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<WorkspaceInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<WorkspaceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<WorkspaceInner>> result = listDelegate(response);
                        List<WorkspaceInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<WorkspaceInner>> clientResponse = new ServiceResponse<List<WorkspaceInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<WorkspaceInner>> listDelegate(Response<ResponseBody> response) throws WorkspaceErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<WorkspaceInner>, WorkspaceErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<WorkspaceInner>>() { }.getType())
                .registerError(WorkspaceErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets recently deleted workspaces in a resource group, available for recovery.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @return the PagedList<WorkspaceInner> object if successful.
     */
    public PagedList<WorkspaceInner> listByResourceGroup(String resourceGroupName) {
        PageImpl1<WorkspaceInner> page = new PageImpl1<>();
        page.setItems(listByResourceGroupWithServiceResponseAsync(resourceGroupName).toBlocking().single().body());
        page.setNextPageLink(null);
        return new PagedList<WorkspaceInner>(page) {
            @Override
            public Page<WorkspaceInner> nextPage(String nextPageLink) {
                return null;
            }
        };
    }

    /**
     * Gets recently deleted workspaces in a resource group, available for recovery.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<WorkspaceInner>> listByResourceGroupAsync(String resourceGroupName, final ServiceCallback<List<WorkspaceInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listByResourceGroupWithServiceResponseAsync(resourceGroupName), serviceCallback);
    }

    /**
     * Gets recently deleted workspaces in a resource group, available for recovery.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @return the observable to the List&lt;WorkspaceInner&gt; object
     */
    public Observable<Page<WorkspaceInner>> listByResourceGroupAsync(String resourceGroupName) {
        return listByResourceGroupWithServiceResponseAsync(resourceGroupName).map(new Func1<ServiceResponse<List<WorkspaceInner>>, Page<WorkspaceInner>>() {
            @Override
            public Page<WorkspaceInner> call(ServiceResponse<List<WorkspaceInner>> response) {
                PageImpl1<WorkspaceInner> page = new PageImpl1<>();
                page.setItems(response.body());
                return page;
            }
        });
    }

    /**
     * Gets recently deleted workspaces in a resource group, available for recovery.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @return the observable to the List&lt;WorkspaceInner&gt; object
     */
    public Observable<ServiceResponse<List<WorkspaceInner>>> listByResourceGroupWithServiceResponseAsync(String resourceGroupName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByResourceGroup(resourceGroupName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<WorkspaceInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<WorkspaceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<WorkspaceInner>> result = listByResourceGroupDelegate(response);
                        List<WorkspaceInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<WorkspaceInner>> clientResponse = new ServiceResponse<List<WorkspaceInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<WorkspaceInner>> listByResourceGroupDelegate(Response<ResponseBody> response) throws WorkspaceErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<WorkspaceInner>, WorkspaceErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<WorkspaceInner>>() { }.getType())
                .registerError(WorkspaceErrorResponseException.class)
                .build(response);
    }

}
