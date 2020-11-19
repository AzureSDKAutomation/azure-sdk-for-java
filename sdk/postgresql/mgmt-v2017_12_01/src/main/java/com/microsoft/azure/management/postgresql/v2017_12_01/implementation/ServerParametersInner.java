/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.postgresql.v2017_12_01.implementation;

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
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.LongRunningFinalState;
import com.microsoft.azure.LongRunningOperationOptions;

/**
 * An instance of this class provides access to all the operations defined
 * in ServerParameters.
 */
public class ServerParametersInner {
    /** The Retrofit service to perform REST calls. */
    private ServerParametersService service;
    /** The service client containing this operation class. */
    private PostgreSQLManagementClientImpl client;

    /**
     * Initializes an instance of ServerParametersInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ServerParametersInner(Retrofit retrofit, PostgreSQLManagementClientImpl client) {
        this.service = retrofit.create(ServerParametersService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ServerParameters to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ServerParametersService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.postgresql.v2017_12_01.ServerParameters listUpdateConfigurations" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBForPostgreSQL/servers/{serverName}/updateConfigurations")
        Observable<Response<ResponseBody>> listUpdateConfigurations(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body ConfigurationListResultInner value, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.postgresql.v2017_12_01.ServerParameters beginListUpdateConfigurations" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBForPostgreSQL/servers/{serverName}/updateConfigurations")
        Observable<Response<ResponseBody>> beginListUpdateConfigurations(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body ConfigurationListResultInner value, @Header("User-Agent") String userAgent);

    }

    /**
     * Update a list of configurations in a given server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ConfigurationListResultInner object if successful.
     */
    public ConfigurationListResultInner listUpdateConfigurations(String resourceGroupName, String serverName) {
        return listUpdateConfigurationsWithServiceResponseAsync(resourceGroupName, serverName).toBlocking().last().body();
    }

    /**
     * Update a list of configurations in a given server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ConfigurationListResultInner> listUpdateConfigurationsAsync(String resourceGroupName, String serverName, final ServiceCallback<ConfigurationListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listUpdateConfigurationsWithServiceResponseAsync(resourceGroupName, serverName), serviceCallback);
    }

    /**
     * Update a list of configurations in a given server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ConfigurationListResultInner> listUpdateConfigurationsAsync(String resourceGroupName, String serverName) {
        return listUpdateConfigurationsWithServiceResponseAsync(resourceGroupName, serverName).map(new Func1<ServiceResponse<ConfigurationListResultInner>, ConfigurationListResultInner>() {
            @Override
            public ConfigurationListResultInner call(ServiceResponse<ConfigurationListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Update a list of configurations in a given server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<ConfigurationListResultInner>> listUpdateConfigurationsWithServiceResponseAsync(String resourceGroupName, String serverName) {
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
        final String valueConverted = null;
        ConfigurationListResultInner value1 = new ConfigurationListResultInner();
        value1.withValue(null);
        Observable<Response<ResponseBody>> observable = service.listUpdateConfigurations(this.client.subscriptionId(), resourceGroupName, serverName, this.client.apiVersion(), this.client.acceptLanguage(), value1, this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultAsync(observable, new LongRunningOperationOptions().withFinalStateVia(LongRunningFinalState.AZURE_ASYNC_OPERATION), new TypeToken<ConfigurationListResultInner>() { }.getType());
    }
    /**
     * Update a list of configurations in a given server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param value The list of server configurations.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ConfigurationListResultInner object if successful.
     */
    public ConfigurationListResultInner listUpdateConfigurations(String resourceGroupName, String serverName, List<ConfigurationInner> value) {
        return listUpdateConfigurationsWithServiceResponseAsync(resourceGroupName, serverName, value).toBlocking().last().body();
    }

    /**
     * Update a list of configurations in a given server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param value The list of server configurations.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ConfigurationListResultInner> listUpdateConfigurationsAsync(String resourceGroupName, String serverName, List<ConfigurationInner> value, final ServiceCallback<ConfigurationListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listUpdateConfigurationsWithServiceResponseAsync(resourceGroupName, serverName, value), serviceCallback);
    }

    /**
     * Update a list of configurations in a given server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param value The list of server configurations.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ConfigurationListResultInner> listUpdateConfigurationsAsync(String resourceGroupName, String serverName, List<ConfigurationInner> value) {
        return listUpdateConfigurationsWithServiceResponseAsync(resourceGroupName, serverName, value).map(new Func1<ServiceResponse<ConfigurationListResultInner>, ConfigurationListResultInner>() {
            @Override
            public ConfigurationListResultInner call(ServiceResponse<ConfigurationListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Update a list of configurations in a given server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param value The list of server configurations.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<ConfigurationListResultInner>> listUpdateConfigurationsWithServiceResponseAsync(String resourceGroupName, String serverName, List<ConfigurationInner> value) {
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
        Validator.validate(value);
        ConfigurationListResultInner value1 = new ConfigurationListResultInner();
        value1.withValue(value);
        Observable<Response<ResponseBody>> observable = service.listUpdateConfigurations(this.client.subscriptionId(), resourceGroupName, serverName, this.client.apiVersion(), this.client.acceptLanguage(), value1, this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultAsync(observable, new LongRunningOperationOptions().withFinalStateVia(LongRunningFinalState.AZURE_ASYNC_OPERATION), new TypeToken<ConfigurationListResultInner>() { }.getType());
    }

    /**
     * Update a list of configurations in a given server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ConfigurationListResultInner object if successful.
     */
    public ConfigurationListResultInner beginListUpdateConfigurations(String resourceGroupName, String serverName) {
        return beginListUpdateConfigurationsWithServiceResponseAsync(resourceGroupName, serverName).toBlocking().single().body();
    }

    /**
     * Update a list of configurations in a given server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ConfigurationListResultInner> beginListUpdateConfigurationsAsync(String resourceGroupName, String serverName, final ServiceCallback<ConfigurationListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(beginListUpdateConfigurationsWithServiceResponseAsync(resourceGroupName, serverName), serviceCallback);
    }

    /**
     * Update a list of configurations in a given server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ConfigurationListResultInner object
     */
    public Observable<ConfigurationListResultInner> beginListUpdateConfigurationsAsync(String resourceGroupName, String serverName) {
        return beginListUpdateConfigurationsWithServiceResponseAsync(resourceGroupName, serverName).map(new Func1<ServiceResponse<ConfigurationListResultInner>, ConfigurationListResultInner>() {
            @Override
            public ConfigurationListResultInner call(ServiceResponse<ConfigurationListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Update a list of configurations in a given server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ConfigurationListResultInner object
     */
    public Observable<ServiceResponse<ConfigurationListResultInner>> beginListUpdateConfigurationsWithServiceResponseAsync(String resourceGroupName, String serverName) {
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
        final List<ConfigurationInner> value = null;
        ConfigurationListResultInner value1 = new ConfigurationListResultInner();
        value1.withValue(null);
        return service.beginListUpdateConfigurations(this.client.subscriptionId(), resourceGroupName, serverName, this.client.apiVersion(), this.client.acceptLanguage(), value1, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ConfigurationListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<ConfigurationListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ConfigurationListResultInner> clientResponse = beginListUpdateConfigurationsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Update a list of configurations in a given server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param value The list of server configurations.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ConfigurationListResultInner object if successful.
     */
    public ConfigurationListResultInner beginListUpdateConfigurations(String resourceGroupName, String serverName, List<ConfigurationInner> value) {
        return beginListUpdateConfigurationsWithServiceResponseAsync(resourceGroupName, serverName, value).toBlocking().single().body();
    }

    /**
     * Update a list of configurations in a given server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param value The list of server configurations.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ConfigurationListResultInner> beginListUpdateConfigurationsAsync(String resourceGroupName, String serverName, List<ConfigurationInner> value, final ServiceCallback<ConfigurationListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(beginListUpdateConfigurationsWithServiceResponseAsync(resourceGroupName, serverName, value), serviceCallback);
    }

    /**
     * Update a list of configurations in a given server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param value The list of server configurations.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ConfigurationListResultInner object
     */
    public Observable<ConfigurationListResultInner> beginListUpdateConfigurationsAsync(String resourceGroupName, String serverName, List<ConfigurationInner> value) {
        return beginListUpdateConfigurationsWithServiceResponseAsync(resourceGroupName, serverName, value).map(new Func1<ServiceResponse<ConfigurationListResultInner>, ConfigurationListResultInner>() {
            @Override
            public ConfigurationListResultInner call(ServiceResponse<ConfigurationListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Update a list of configurations in a given server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param value The list of server configurations.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ConfigurationListResultInner object
     */
    public Observable<ServiceResponse<ConfigurationListResultInner>> beginListUpdateConfigurationsWithServiceResponseAsync(String resourceGroupName, String serverName, List<ConfigurationInner> value) {
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
        Validator.validate(value);
        ConfigurationListResultInner value1 = new ConfigurationListResultInner();
        value1.withValue(value);
        return service.beginListUpdateConfigurations(this.client.subscriptionId(), resourceGroupName, serverName, this.client.apiVersion(), this.client.acceptLanguage(), value1, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ConfigurationListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<ConfigurationListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ConfigurationListResultInner> clientResponse = beginListUpdateConfigurationsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ConfigurationListResultInner> beginListUpdateConfigurationsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ConfigurationListResultInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ConfigurationListResultInner>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
