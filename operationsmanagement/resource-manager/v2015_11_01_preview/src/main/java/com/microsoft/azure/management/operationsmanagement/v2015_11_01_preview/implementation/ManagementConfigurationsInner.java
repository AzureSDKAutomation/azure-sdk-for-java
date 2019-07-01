/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.operationsmanagement.v2015_11_01_preview.implementation;

import com.microsoft.azure.arm.collection.InnerSupportsGet;
import com.microsoft.azure.arm.collection.InnerSupportsDelete;
import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.operationsmanagement.v2015_11_01_preview.CodeMessageErrorException;
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
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ManagementConfigurations.
 */
public class ManagementConfigurationsInner implements InnerSupportsGet<ManagementConfigurationInner>, InnerSupportsDelete<Void> {
    /** The Retrofit service to perform REST calls. */
    private ManagementConfigurationsService service;
    /** The service client containing this operation class. */
    private OperationsManagementClientImpl client;

    /**
     * Initializes an instance of ManagementConfigurationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ManagementConfigurationsInner(Retrofit retrofit, OperationsManagementClientImpl client) {
        this.service = retrofit.create(ManagementConfigurationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ManagementConfigurations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ManagementConfigurationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.operationsmanagement.v2015_11_01_preview.ManagementConfigurations list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.OperationsManagement/ManagementConfigurations")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.operationsmanagement.v2015_11_01_preview.ManagementConfigurations createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.OperationsManagement/ManagementConfigurations/{managementConfigurationName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("managementConfigurationName") String managementConfigurationName, @Query("api-version") String apiVersion, @Body ManagementConfigurationInner parameters, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.operationsmanagement.v2015_11_01_preview.ManagementConfigurations delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.OperationsManagement/ManagementConfigurations/{managementConfigurationName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("managementConfigurationName") String managementConfigurationName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.operationsmanagement.v2015_11_01_preview.ManagementConfigurations getByResourceGroup" })
        @GET("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.OperationsManagement/ManagementConfigurations/{managementConfigurationName}")
        Observable<Response<ResponseBody>> getByResourceGroup(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("managementConfigurationName") String managementConfigurationName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Retrieves the ManagementConfigurations list for the subscription.
     * Retrieves the ManagementConfigurations list.
     *
     * @return the PagedList<ManagementConfigurationInner> object if successful.
     */
    public PagedList<ManagementConfigurationInner> list() {
        PageImpl<ManagementConfigurationInner> page = new PageImpl<>();
        page.setItems(listWithServiceResponseAsync().toBlocking().single().body());
        page.setNextPageLink(null);
        return new PagedList<ManagementConfigurationInner>(page) {
            @Override
            public Page<ManagementConfigurationInner> nextPage(String nextPageLink) {
                return null;
            }
        };
    }

    /**
     * Retrieves the ManagementConfigurations list for the subscription.
     * Retrieves the ManagementConfigurations list.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ManagementConfigurationInner>> listAsync(final ServiceCallback<List<ManagementConfigurationInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Retrieves the ManagementConfigurations list for the subscription.
     * Retrieves the ManagementConfigurations list.
     *
     * @return the observable to the List&lt;ManagementConfigurationInner&gt; object
     */
    public Observable<Page<ManagementConfigurationInner>> listAsync() {
        return listWithServiceResponseAsync().map(new Func1<ServiceResponse<List<ManagementConfigurationInner>>, Page<ManagementConfigurationInner>>() {
            @Override
            public Page<ManagementConfigurationInner> call(ServiceResponse<List<ManagementConfigurationInner>> response) {
                PageImpl<ManagementConfigurationInner> page = new PageImpl<>();
                page.setItems(response.body());
                return page;
            }
        });
    }

    /**
     * Retrieves the ManagementConfigurations list for the subscription.
     * Retrieves the ManagementConfigurations list.
     *
     * @return the observable to the List&lt;ManagementConfigurationInner&gt; object
     */
    public Observable<ServiceResponse<List<ManagementConfigurationInner>>> listWithServiceResponseAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<ManagementConfigurationInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<ManagementConfigurationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ManagementConfigurationInner>> result = listDelegate(response);
                        List<ManagementConfigurationInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<ManagementConfigurationInner>> clientResponse = new ServiceResponse<List<ManagementConfigurationInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ManagementConfigurationInner>> listDelegate(Response<ResponseBody> response) throws CodeMessageErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ManagementConfigurationInner>, CodeMessageErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ManagementConfigurationInner>>() { }.getType())
                .registerError(CodeMessageErrorException.class)
                .build(response);
    }

    /**
     * Create/Update ManagementConfiguration.
     * Creates or updates the ManagementConfiguration.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param managementConfigurationName User Management Configuration Name.
     * @param parameters The parameters required to create OMS Solution.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CodeMessageErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ManagementConfigurationInner object if successful.
     */
    public ManagementConfigurationInner createOrUpdate(String resourceGroupName, String managementConfigurationName, ManagementConfigurationInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, managementConfigurationName, parameters).toBlocking().single().body();
    }

    /**
     * Create/Update ManagementConfiguration.
     * Creates or updates the ManagementConfiguration.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param managementConfigurationName User Management Configuration Name.
     * @param parameters The parameters required to create OMS Solution.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ManagementConfigurationInner> createOrUpdateAsync(String resourceGroupName, String managementConfigurationName, ManagementConfigurationInner parameters, final ServiceCallback<ManagementConfigurationInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, managementConfigurationName, parameters), serviceCallback);
    }

    /**
     * Create/Update ManagementConfiguration.
     * Creates or updates the ManagementConfiguration.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param managementConfigurationName User Management Configuration Name.
     * @param parameters The parameters required to create OMS Solution.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ManagementConfigurationInner object
     */
    public Observable<ManagementConfigurationInner> createOrUpdateAsync(String resourceGroupName, String managementConfigurationName, ManagementConfigurationInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, managementConfigurationName, parameters).map(new Func1<ServiceResponse<ManagementConfigurationInner>, ManagementConfigurationInner>() {
            @Override
            public ManagementConfigurationInner call(ServiceResponse<ManagementConfigurationInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Create/Update ManagementConfiguration.
     * Creates or updates the ManagementConfiguration.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param managementConfigurationName User Management Configuration Name.
     * @param parameters The parameters required to create OMS Solution.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ManagementConfigurationInner object
     */
    public Observable<ServiceResponse<ManagementConfigurationInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String managementConfigurationName, ManagementConfigurationInner parameters) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (managementConfigurationName == null) {
            throw new IllegalArgumentException("Parameter managementConfigurationName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, managementConfigurationName, this.client.apiVersion(), parameters, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ManagementConfigurationInner>>>() {
                @Override
                public Observable<ServiceResponse<ManagementConfigurationInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ManagementConfigurationInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ManagementConfigurationInner> createOrUpdateDelegate(Response<ResponseBody> response) throws CodeMessageErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ManagementConfigurationInner, CodeMessageErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ManagementConfigurationInner>() { }.getType())
                .registerError(CodeMessageErrorException.class)
                .build(response);
    }

    /**
     * Deletes the ManagementConfiguration.
     * Deletes the ManagementConfiguration in the subscription.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param managementConfigurationName User Management Configuration Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CodeMessageErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String managementConfigurationName) {
        deleteWithServiceResponseAsync(resourceGroupName, managementConfigurationName).toBlocking().single().body();
    }

    /**
     * Deletes the ManagementConfiguration.
     * Deletes the ManagementConfiguration in the subscription.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param managementConfigurationName User Management Configuration Name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String managementConfigurationName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, managementConfigurationName), serviceCallback);
    }

    /**
     * Deletes the ManagementConfiguration.
     * Deletes the ManagementConfiguration in the subscription.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param managementConfigurationName User Management Configuration Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String managementConfigurationName) {
        return deleteWithServiceResponseAsync(resourceGroupName, managementConfigurationName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes the ManagementConfiguration.
     * Deletes the ManagementConfiguration in the subscription.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param managementConfigurationName User Management Configuration Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String managementConfigurationName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (managementConfigurationName == null) {
            throw new IllegalArgumentException("Parameter managementConfigurationName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(this.client.subscriptionId(), resourceGroupName, managementConfigurationName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws CodeMessageErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CodeMessageErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(CodeMessageErrorException.class)
                .build(response);
    }

    /**
     * Retrieve ManagementConfiguration.
     * Retrieves the user ManagementConfiguration.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param managementConfigurationName User Management Configuration Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CodeMessageErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ManagementConfigurationInner object if successful.
     */
    public ManagementConfigurationInner getByResourceGroup(String resourceGroupName, String managementConfigurationName) {
        return getByResourceGroupWithServiceResponseAsync(resourceGroupName, managementConfigurationName).toBlocking().single().body();
    }

    /**
     * Retrieve ManagementConfiguration.
     * Retrieves the user ManagementConfiguration.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param managementConfigurationName User Management Configuration Name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ManagementConfigurationInner> getByResourceGroupAsync(String resourceGroupName, String managementConfigurationName, final ServiceCallback<ManagementConfigurationInner> serviceCallback) {
        return ServiceFuture.fromResponse(getByResourceGroupWithServiceResponseAsync(resourceGroupName, managementConfigurationName), serviceCallback);
    }

    /**
     * Retrieve ManagementConfiguration.
     * Retrieves the user ManagementConfiguration.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param managementConfigurationName User Management Configuration Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ManagementConfigurationInner object
     */
    public Observable<ManagementConfigurationInner> getByResourceGroupAsync(String resourceGroupName, String managementConfigurationName) {
        return getByResourceGroupWithServiceResponseAsync(resourceGroupName, managementConfigurationName).map(new Func1<ServiceResponse<ManagementConfigurationInner>, ManagementConfigurationInner>() {
            @Override
            public ManagementConfigurationInner call(ServiceResponse<ManagementConfigurationInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Retrieve ManagementConfiguration.
     * Retrieves the user ManagementConfiguration.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param managementConfigurationName User Management Configuration Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ManagementConfigurationInner object
     */
    public Observable<ServiceResponse<ManagementConfigurationInner>> getByResourceGroupWithServiceResponseAsync(String resourceGroupName, String managementConfigurationName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (managementConfigurationName == null) {
            throw new IllegalArgumentException("Parameter managementConfigurationName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getByResourceGroup(this.client.subscriptionId(), resourceGroupName, managementConfigurationName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ManagementConfigurationInner>>>() {
                @Override
                public Observable<ServiceResponse<ManagementConfigurationInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ManagementConfigurationInner> clientResponse = getByResourceGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ManagementConfigurationInner> getByResourceGroupDelegate(Response<ResponseBody> response) throws CodeMessageErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ManagementConfigurationInner, CodeMessageErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ManagementConfigurationInner>() { }.getType())
                .registerError(CodeMessageErrorException.class)
                .build(response);
    }

}
