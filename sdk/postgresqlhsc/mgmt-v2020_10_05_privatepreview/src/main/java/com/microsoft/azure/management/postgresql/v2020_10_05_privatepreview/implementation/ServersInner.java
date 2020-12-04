/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.postgresql.v2020_10_05_privatepreview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
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
 * in Servers.
 */
public class ServersInner {
    /** The Retrofit service to perform REST calls. */
    private ServersService service;
    /** The service client containing this operation class. */
    private HyperscaleCitusManagementClientImpl client;

    /**
     * Initializes an instance of ServersInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ServersInner(Retrofit retrofit, HyperscaleCitusManagementClientImpl client) {
        this.service = retrofit.create(ServersService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Servers to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ServersService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.postgresql.v2020_10_05_privatepreview.Servers listByServerGroup" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBForPostgreSql/serverGroupsv2/{serverGroupName}/servers")
        Observable<Response<ResponseBody>> listByServerGroup(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverGroupName") String serverGroupName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.postgresql.v2020_10_05_privatepreview.Servers get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBForPostgreSql/serverGroupsv2/{serverGroupName}/servers/{serverName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverGroupName") String serverGroupName, @Path("serverName") String serverName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists servers of a server group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;ServerGroupServerInner&gt; object if successful.
     */
    public List<ServerGroupServerInner> listByServerGroup(String resourceGroupName, String serverGroupName) {
        return listByServerGroupWithServiceResponseAsync(resourceGroupName, serverGroupName).toBlocking().single().body();
    }

    /**
     * Lists servers of a server group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ServerGroupServerInner>> listByServerGroupAsync(String resourceGroupName, String serverGroupName, final ServiceCallback<List<ServerGroupServerInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listByServerGroupWithServiceResponseAsync(resourceGroupName, serverGroupName), serviceCallback);
    }

    /**
     * Lists servers of a server group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ServerGroupServerInner&gt; object
     */
    public Observable<List<ServerGroupServerInner>> listByServerGroupAsync(String resourceGroupName, String serverGroupName) {
        return listByServerGroupWithServiceResponseAsync(resourceGroupName, serverGroupName).map(new Func1<ServiceResponse<List<ServerGroupServerInner>>, List<ServerGroupServerInner>>() {
            @Override
            public List<ServerGroupServerInner> call(ServiceResponse<List<ServerGroupServerInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists servers of a server group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ServerGroupServerInner&gt; object
     */
    public Observable<ServiceResponse<List<ServerGroupServerInner>>> listByServerGroupWithServiceResponseAsync(String resourceGroupName, String serverGroupName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverGroupName == null) {
            throw new IllegalArgumentException("Parameter serverGroupName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByServerGroup(this.client.subscriptionId(), resourceGroupName, serverGroupName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<ServerGroupServerInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<ServerGroupServerInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<ServerGroupServerInner>> result = listByServerGroupDelegate(response);
                        List<ServerGroupServerInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<ServerGroupServerInner>> clientResponse = new ServiceResponse<List<ServerGroupServerInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<ServerGroupServerInner>> listByServerGroupDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<ServerGroupServerInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<ServerGroupServerInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets information about a server in server group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerGroupServerInner object if successful.
     */
    public ServerGroupServerInner get(String resourceGroupName, String serverGroupName, String serverName) {
        return getWithServiceResponseAsync(resourceGroupName, serverGroupName, serverName).toBlocking().single().body();
    }

    /**
     * Gets information about a server in server group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @param serverName The name of the server.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServerGroupServerInner> getAsync(String resourceGroupName, String serverGroupName, String serverName, final ServiceCallback<ServerGroupServerInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, serverGroupName, serverName), serviceCallback);
    }

    /**
     * Gets information about a server in server group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerGroupServerInner object
     */
    public Observable<ServerGroupServerInner> getAsync(String resourceGroupName, String serverGroupName, String serverName) {
        return getWithServiceResponseAsync(resourceGroupName, serverGroupName, serverName).map(new Func1<ServiceResponse<ServerGroupServerInner>, ServerGroupServerInner>() {
            @Override
            public ServerGroupServerInner call(ServiceResponse<ServerGroupServerInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets information about a server in server group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerGroupServerInner object
     */
    public Observable<ServiceResponse<ServerGroupServerInner>> getWithServiceResponseAsync(String resourceGroupName, String serverGroupName, String serverName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverGroupName == null) {
            throw new IllegalArgumentException("Parameter serverGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), resourceGroupName, serverGroupName, serverName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServerGroupServerInner>>>() {
                @Override
                public Observable<ServiceResponse<ServerGroupServerInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServerGroupServerInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ServerGroupServerInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ServerGroupServerInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ServerGroupServerInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
