/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.postgresql.v2017_12_01_preview.implementation;

import com.microsoft.azure.arm.collection.InnerSupportsDelete;
import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
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
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ServerAdministrators.
 */
public class ServerAdministratorsInner implements InnerSupportsDelete<Void> {
    /** The Retrofit service to perform REST calls. */
    private ServerAdministratorsService service;
    /** The service client containing this operation class. */
    private PostgreSQLManagementClientImpl client;

    /**
     * Initializes an instance of ServerAdministratorsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ServerAdministratorsInner(Retrofit retrofit, PostgreSQLManagementClientImpl client) {
        this.service = retrofit.create(ServerAdministratorsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ServerAdministrators to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ServerAdministratorsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.postgresql.v2017_12_01_preview.ServerAdministrators get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBforPostgreSQL/servers/{serverName}/Administrators/activeDirectory")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.postgresql.v2017_12_01_preview.ServerAdministrators createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBforPostgreSQL/servers/{serverName}/Administrators/activeDirectory")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Query("api-version") String apiVersion, @Body ServerAdministratorResourceInner properties, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.postgresql.v2017_12_01_preview.ServerAdministrators beginCreateOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBforPostgreSQL/servers/{serverName}/Administrators/activeDirectory")
        Observable<Response<ResponseBody>> beginCreateOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Query("api-version") String apiVersion, @Body ServerAdministratorResourceInner properties, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.postgresql.v2017_12_01_preview.ServerAdministrators delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBforPostgreSQL/servers/{serverName}/Administrators/activeDirectory", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.postgresql.v2017_12_01_preview.ServerAdministrators beginDelete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBforPostgreSQL/servers/{serverName}/Administrators/activeDirectory", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> beginDelete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.postgresql.v2017_12_01_preview.ServerAdministrators list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBforPostgreSQL/servers/{serverName}/administrators")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets information about a AAD server administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerAdministratorResourceInner object if successful.
     */
    public ServerAdministratorResourceInner get(String resourceGroupName, String serverName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName).toBlocking().single().body();
    }

    /**
     * Gets information about a AAD server administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServerAdministratorResourceInner> getAsync(String resourceGroupName, String serverName, final ServiceCallback<ServerAdministratorResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, serverName), serviceCallback);
    }

    /**
     * Gets information about a AAD server administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerAdministratorResourceInner object
     */
    public Observable<ServerAdministratorResourceInner> getAsync(String resourceGroupName, String serverName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName).map(new Func1<ServiceResponse<ServerAdministratorResourceInner>, ServerAdministratorResourceInner>() {
            @Override
            public ServerAdministratorResourceInner call(ServiceResponse<ServerAdministratorResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets information about a AAD server administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerAdministratorResourceInner object
     */
    public Observable<ServiceResponse<ServerAdministratorResourceInner>> getWithServiceResponseAsync(String resourceGroupName, String serverName) {
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
        return service.get(this.client.subscriptionId(), resourceGroupName, serverName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServerAdministratorResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<ServerAdministratorResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServerAdministratorResourceInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ServerAdministratorResourceInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ServerAdministratorResourceInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ServerAdministratorResourceInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Creates or update active directory administrator on an existing server. The update action will overwrite the existing administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param properties The required parameters for creating or updating an AAD server administrator.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerAdministratorResourceInner object if successful.
     */
    public ServerAdministratorResourceInner createOrUpdate(String resourceGroupName, String serverName, ServerAdministratorResourceInner properties) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, properties).toBlocking().last().body();
    }

    /**
     * Creates or update active directory administrator on an existing server. The update action will overwrite the existing administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param properties The required parameters for creating or updating an AAD server administrator.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServerAdministratorResourceInner> createOrUpdateAsync(String resourceGroupName, String serverName, ServerAdministratorResourceInner properties, final ServiceCallback<ServerAdministratorResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, properties), serviceCallback);
    }

    /**
     * Creates or update active directory administrator on an existing server. The update action will overwrite the existing administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param properties The required parameters for creating or updating an AAD server administrator.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServerAdministratorResourceInner> createOrUpdateAsync(String resourceGroupName, String serverName, ServerAdministratorResourceInner properties) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, properties).map(new Func1<ServiceResponse<ServerAdministratorResourceInner>, ServerAdministratorResourceInner>() {
            @Override
            public ServerAdministratorResourceInner call(ServiceResponse<ServerAdministratorResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or update active directory administrator on an existing server. The update action will overwrite the existing administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param properties The required parameters for creating or updating an AAD server administrator.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<ServerAdministratorResourceInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String serverName, ServerAdministratorResourceInner properties) {
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
        if (properties == null) {
            throw new IllegalArgumentException("Parameter properties is required and cannot be null.");
        }
        Validator.validate(properties);
        Observable<Response<ResponseBody>> observable = service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, serverName, this.client.apiVersion(), properties, this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPutOrPatchResultAsync(observable, new TypeToken<ServerAdministratorResourceInner>() { }.getType());
    }

    /**
     * Creates or update active directory administrator on an existing server. The update action will overwrite the existing administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param properties The required parameters for creating or updating an AAD server administrator.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServerAdministratorResourceInner object if successful.
     */
    public ServerAdministratorResourceInner beginCreateOrUpdate(String resourceGroupName, String serverName, ServerAdministratorResourceInner properties) {
        return beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, properties).toBlocking().single().body();
    }

    /**
     * Creates or update active directory administrator on an existing server. The update action will overwrite the existing administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param properties The required parameters for creating or updating an AAD server administrator.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServerAdministratorResourceInner> beginCreateOrUpdateAsync(String resourceGroupName, String serverName, ServerAdministratorResourceInner properties, final ServiceCallback<ServerAdministratorResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, properties), serviceCallback);
    }

    /**
     * Creates or update active directory administrator on an existing server. The update action will overwrite the existing administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param properties The required parameters for creating or updating an AAD server administrator.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerAdministratorResourceInner object
     */
    public Observable<ServerAdministratorResourceInner> beginCreateOrUpdateAsync(String resourceGroupName, String serverName, ServerAdministratorResourceInner properties) {
        return beginCreateOrUpdateWithServiceResponseAsync(resourceGroupName, serverName, properties).map(new Func1<ServiceResponse<ServerAdministratorResourceInner>, ServerAdministratorResourceInner>() {
            @Override
            public ServerAdministratorResourceInner call(ServiceResponse<ServerAdministratorResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or update active directory administrator on an existing server. The update action will overwrite the existing administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param properties The required parameters for creating or updating an AAD server administrator.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServerAdministratorResourceInner object
     */
    public Observable<ServiceResponse<ServerAdministratorResourceInner>> beginCreateOrUpdateWithServiceResponseAsync(String resourceGroupName, String serverName, ServerAdministratorResourceInner properties) {
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
        if (properties == null) {
            throw new IllegalArgumentException("Parameter properties is required and cannot be null.");
        }
        Validator.validate(properties);
        return service.beginCreateOrUpdate(this.client.subscriptionId(), resourceGroupName, serverName, this.client.apiVersion(), properties, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServerAdministratorResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<ServerAdministratorResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServerAdministratorResourceInner> clientResponse = beginCreateOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ServerAdministratorResourceInner> beginCreateOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ServerAdministratorResourceInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ServerAdministratorResourceInner>() { }.getType())
                .register(202, new TypeToken<ServerAdministratorResourceInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Deletes AAD Administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String serverName) {
        deleteWithServiceResponseAsync(resourceGroupName, serverName).toBlocking().last().body();
    }

    /**
     * Deletes AAD Administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String serverName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, serverName), serviceCallback);
    }

    /**
     * Deletes AAD Administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String serverName) {
        return deleteWithServiceResponseAsync(resourceGroupName, serverName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes AAD Administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String serverName) {
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
        Observable<Response<ResponseBody>> observable = service.delete(this.client.subscriptionId(), resourceGroupName, serverName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultAsync(observable, new TypeToken<Void>() { }.getType());
    }

    /**
     * Deletes AAD Administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void beginDelete(String resourceGroupName, String serverName) {
        beginDeleteWithServiceResponseAsync(resourceGroupName, serverName).toBlocking().single().body();
    }

    /**
     * Deletes AAD Administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> beginDeleteAsync(String resourceGroupName, String serverName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(beginDeleteWithServiceResponseAsync(resourceGroupName, serverName), serviceCallback);
    }

    /**
     * Deletes AAD Administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> beginDeleteAsync(String resourceGroupName, String serverName) {
        return beginDeleteWithServiceResponseAsync(resourceGroupName, serverName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes AAD Administrator.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> beginDeleteWithServiceResponseAsync(String resourceGroupName, String serverName) {
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
        return service.beginDelete(this.client.subscriptionId(), resourceGroupName, serverName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
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
     * Returns a list of server Administrators.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;ServerAdministratorResourceInner&gt; object if successful.
     */
    public List<ServerAdministratorResourceInner> list(String resourceGroupName, String serverName) {
        return listWithServiceResponseAsync(resourceGroupName, serverName).toBlocking().single().body();
    }

    /**
     * Returns a list of server Administrators.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ServerAdministratorResourceInner>> listAsync(String resourceGroupName, String serverName, final ServiceCallback<List<ServerAdministratorResourceInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(resourceGroupName, serverName), serviceCallback);
    }

    /**
     * Returns a list of server Administrators.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ServerAdministratorResourceInner&gt; object
     */
    public Observable<List<ServerAdministratorResourceInner>> listAsync(String resourceGroupName, String serverName) {
        return listWithServiceResponseAsync(resourceGroupName, serverName).map(new Func1<ServiceResponse<List<ServerAdministratorResourceInner>>, List<ServerAdministratorResourceInner>>() {
            @Override
            public List<ServerAdministratorResourceInner> call(ServiceResponse<List<ServerAdministratorResourceInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Returns a list of server Administrators.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ServerAdministratorResourceInner&gt; object
     */
    public Observable<ServiceResponse<List<ServerAdministratorResourceInner>>> listWithServiceResponseAsync(String resourceGroupName, String serverName) {
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
        return service.list(this.client.subscriptionId(), resourceGroupName, serverName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<ServerAdministratorResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<ServerAdministratorResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ServerAdministratorResourceInner>> result = listDelegate(response);
                        List<ServerAdministratorResourceInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<ServerAdministratorResourceInner>> clientResponse = new ServiceResponse<List<ServerAdministratorResourceInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ServerAdministratorResourceInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ServerAdministratorResourceInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ServerAdministratorResourceInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
