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
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Roles.
 */
public class RolesInner {
    /** The Retrofit service to perform REST calls. */
    private RolesService service;
    /** The service client containing this operation class. */
    private HyperscaleCitusManagementClientImpl client;

    /**
     * Initializes an instance of RolesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public RolesInner(Retrofit retrofit, HyperscaleCitusManagementClientImpl client) {
        this.service = retrofit.create(RolesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Roles to be
     * used by Retrofit to perform actually REST calls.
     */
    interface RolesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.postgresql.v2020_10_05_privatepreview.Roles create" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBForPostgreSql/serverGroupsv2/{serverGroupName}/roles/{roleName}")
        Observable<Response<ResponseBody>> create(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverGroupName") String serverGroupName, @Path("roleName") String roleName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body RoleInner parameters, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.postgresql.v2020_10_05_privatepreview.Roles beginCreate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBForPostgreSql/serverGroupsv2/{serverGroupName}/roles/{roleName}")
        Observable<Response<ResponseBody>> beginCreate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverGroupName") String serverGroupName, @Path("roleName") String roleName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body RoleInner parameters, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.postgresql.v2020_10_05_privatepreview.Roles delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBForPostgreSql/serverGroupsv2/{serverGroupName}/roles/{roleName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverGroupName") String serverGroupName, @Path("roleName") String roleName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.postgresql.v2020_10_05_privatepreview.Roles beginDelete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBForPostgreSql/serverGroupsv2/{serverGroupName}/roles/{roleName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> beginDelete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverGroupName") String serverGroupName, @Path("roleName") String roleName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.postgresql.v2020_10_05_privatepreview.Roles listByServerGroup" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBForPostgreSql/serverGroupsv2/{serverGroupName}/roles")
        Observable<Response<ResponseBody>> listByServerGroup(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverGroupName") String serverGroupName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Creates a new role or updates an existing role.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @param roleName The name of the server group role name.
     * @param password The password of the server group role.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RoleInner object if successful.
     */
    public RoleInner create(String resourceGroupName, String serverGroupName, String roleName, String password) {
        return createWithServiceResponseAsync(resourceGroupName, serverGroupName, roleName, password).toBlocking().last().body();
    }

    /**
     * Creates a new role or updates an existing role.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @param roleName The name of the server group role name.
     * @param password The password of the server group role.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RoleInner> createAsync(String resourceGroupName, String serverGroupName, String roleName, String password, final ServiceCallback<RoleInner> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(resourceGroupName, serverGroupName, roleName, password), serviceCallback);
    }

    /**
     * Creates a new role or updates an existing role.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @param roleName The name of the server group role name.
     * @param password The password of the server group role.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<RoleInner> createAsync(String resourceGroupName, String serverGroupName, String roleName, String password) {
        return createWithServiceResponseAsync(resourceGroupName, serverGroupName, roleName, password).map(new Func1<ServiceResponse<RoleInner>, RoleInner>() {
            @Override
            public RoleInner call(ServiceResponse<RoleInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates a new role or updates an existing role.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @param roleName The name of the server group role name.
     * @param password The password of the server group role.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<RoleInner>> createWithServiceResponseAsync(String resourceGroupName, String serverGroupName, String roleName, String password) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverGroupName == null) {
            throw new IllegalArgumentException("Parameter serverGroupName is required and cannot be null.");
        }
        if (roleName == null) {
            throw new IllegalArgumentException("Parameter roleName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (password == null) {
            throw new IllegalArgumentException("Parameter password is required and cannot be null.");
        }
        RoleInner parameters = new RoleInner();
        parameters.withPassword(password);
        Observable<Response<ResponseBody>> observable = service.create(this.client.subscriptionId(), resourceGroupName, serverGroupName, roleName, this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent());
        return client.getAzureClient().getPutOrPatchResultAsync(observable, new TypeToken<RoleInner>() { }.getType());
    }

    /**
     * Creates a new role or updates an existing role.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @param roleName The name of the server group role name.
     * @param password The password of the server group role.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RoleInner object if successful.
     */
    public RoleInner beginCreate(String resourceGroupName, String serverGroupName, String roleName, String password) {
        return beginCreateWithServiceResponseAsync(resourceGroupName, serverGroupName, roleName, password).toBlocking().single().body();
    }

    /**
     * Creates a new role or updates an existing role.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @param roleName The name of the server group role name.
     * @param password The password of the server group role.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RoleInner> beginCreateAsync(String resourceGroupName, String serverGroupName, String roleName, String password, final ServiceCallback<RoleInner> serviceCallback) {
        return ServiceFuture.fromResponse(beginCreateWithServiceResponseAsync(resourceGroupName, serverGroupName, roleName, password), serviceCallback);
    }

    /**
     * Creates a new role or updates an existing role.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @param roleName The name of the server group role name.
     * @param password The password of the server group role.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RoleInner object
     */
    public Observable<RoleInner> beginCreateAsync(String resourceGroupName, String serverGroupName, String roleName, String password) {
        return beginCreateWithServiceResponseAsync(resourceGroupName, serverGroupName, roleName, password).map(new Func1<ServiceResponse<RoleInner>, RoleInner>() {
            @Override
            public RoleInner call(ServiceResponse<RoleInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates a new role or updates an existing role.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @param roleName The name of the server group role name.
     * @param password The password of the server group role.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RoleInner object
     */
    public Observable<ServiceResponse<RoleInner>> beginCreateWithServiceResponseAsync(String resourceGroupName, String serverGroupName, String roleName, String password) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverGroupName == null) {
            throw new IllegalArgumentException("Parameter serverGroupName is required and cannot be null.");
        }
        if (roleName == null) {
            throw new IllegalArgumentException("Parameter roleName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (password == null) {
            throw new IllegalArgumentException("Parameter password is required and cannot be null.");
        }
        RoleInner parameters = new RoleInner();
        parameters.withPassword(password);
        return service.beginCreate(this.client.subscriptionId(), resourceGroupName, serverGroupName, roleName, this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RoleInner>>>() {
                @Override
                public Observable<ServiceResponse<RoleInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RoleInner> clientResponse = beginCreateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RoleInner> beginCreateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RoleInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RoleInner>() { }.getType())
                .register(201, new TypeToken<RoleInner>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Deletes a server group role.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @param roleName The name of the server group role name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String serverGroupName, String roleName) {
        deleteWithServiceResponseAsync(resourceGroupName, serverGroupName, roleName).toBlocking().last().body();
    }

    /**
     * Deletes a server group role.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @param roleName The name of the server group role name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String serverGroupName, String roleName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, serverGroupName, roleName), serviceCallback);
    }

    /**
     * Deletes a server group role.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @param roleName The name of the server group role name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String serverGroupName, String roleName) {
        return deleteWithServiceResponseAsync(resourceGroupName, serverGroupName, roleName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes a server group role.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @param roleName The name of the server group role name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String serverGroupName, String roleName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverGroupName == null) {
            throw new IllegalArgumentException("Parameter serverGroupName is required and cannot be null.");
        }
        if (roleName == null) {
            throw new IllegalArgumentException("Parameter roleName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Observable<Response<ResponseBody>> observable = service.delete(this.client.subscriptionId(), resourceGroupName, serverGroupName, roleName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultAsync(observable, new TypeToken<Void>() { }.getType());
    }

    /**
     * Deletes a server group role.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @param roleName The name of the server group role name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void beginDelete(String resourceGroupName, String serverGroupName, String roleName) {
        beginDeleteWithServiceResponseAsync(resourceGroupName, serverGroupName, roleName).toBlocking().single().body();
    }

    /**
     * Deletes a server group role.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @param roleName The name of the server group role name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> beginDeleteAsync(String resourceGroupName, String serverGroupName, String roleName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(beginDeleteWithServiceResponseAsync(resourceGroupName, serverGroupName, roleName), serviceCallback);
    }

    /**
     * Deletes a server group role.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @param roleName The name of the server group role name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> beginDeleteAsync(String resourceGroupName, String serverGroupName, String roleName) {
        return beginDeleteWithServiceResponseAsync(resourceGroupName, serverGroupName, roleName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes a server group role.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @param roleName The name of the server group role name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> beginDeleteWithServiceResponseAsync(String resourceGroupName, String serverGroupName, String roleName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverGroupName == null) {
            throw new IllegalArgumentException("Parameter serverGroupName is required and cannot be null.");
        }
        if (roleName == null) {
            throw new IllegalArgumentException("Parameter roleName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.beginDelete(this.client.subscriptionId(), resourceGroupName, serverGroupName, roleName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = beginDeleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> beginDeleteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * List all the roles in a given server group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;RoleInner&gt; object if successful.
     */
    public List<RoleInner> listByServerGroup(String resourceGroupName, String serverGroupName) {
        return listByServerGroupWithServiceResponseAsync(resourceGroupName, serverGroupName).toBlocking().single().body();
    }

    /**
     * List all the roles in a given server group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<RoleInner>> listByServerGroupAsync(String resourceGroupName, String serverGroupName, final ServiceCallback<List<RoleInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listByServerGroupWithServiceResponseAsync(resourceGroupName, serverGroupName), serviceCallback);
    }

    /**
     * List all the roles in a given server group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;RoleInner&gt; object
     */
    public Observable<List<RoleInner>> listByServerGroupAsync(String resourceGroupName, String serverGroupName) {
        return listByServerGroupWithServiceResponseAsync(resourceGroupName, serverGroupName).map(new Func1<ServiceResponse<List<RoleInner>>, List<RoleInner>>() {
            @Override
            public List<RoleInner> call(ServiceResponse<List<RoleInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * List all the roles in a given server group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverGroupName The name of the server group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;RoleInner&gt; object
     */
    public Observable<ServiceResponse<List<RoleInner>>> listByServerGroupWithServiceResponseAsync(String resourceGroupName, String serverGroupName) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<RoleInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<RoleInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<RoleInner>> result = listByServerGroupDelegate(response);
                        List<RoleInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<RoleInner>> clientResponse = new ServiceResponse<List<RoleInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<RoleInner>> listByServerGroupDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<RoleInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<RoleInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
