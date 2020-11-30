/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datadog.v2020_02_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.datadog.v2020_02_01_preview.MonitoringTagRulesProperties;
import com.microsoft.azure.management.datadog.v2020_02_01_preview.ResourceProviderDefaultErrorResponseException;
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
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in TagRules.
 */
public class TagRulesInner {
    /** The Retrofit service to perform REST calls. */
    private TagRulesService service;
    /** The service client containing this operation class. */
    private MicrosoftDatadogClientImpl client;

    /**
     * Initializes an instance of TagRulesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public TagRulesInner(Retrofit retrofit, MicrosoftDatadogClientImpl client) {
        this.service = retrofit.create(TagRulesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for TagRules to be
     * used by Retrofit to perform actually REST calls.
     */
    interface TagRulesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.datadog.v2020_02_01_preview.TagRules list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Datadog/monitors/{monitorName}/tagRules")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("monitorName") String monitorName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.datadog.v2020_02_01_preview.TagRules createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Datadog/monitors/{monitorName}/tagRules/{ruleSetName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("monitorName") String monitorName, @Path("ruleSetName") String ruleSetName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body MonitoringTagRulesInner body, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.datadog.v2020_02_01_preview.TagRules get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Datadog/monitors/{monitorName}/tagRules/{ruleSetName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("monitorName") String monitorName, @Path("ruleSetName") String ruleSetName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.datadog.v2020_02_01_preview.TagRules listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * List the tag rules for a given monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param monitorName Monitor resource name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ResourceProviderDefaultErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;MonitoringTagRulesInner&gt; object if successful.
     */
    public PagedList<MonitoringTagRulesInner> list(final String resourceGroupName, final String monitorName) {
        ServiceResponse<Page<MonitoringTagRulesInner>> response = listSinglePageAsync(resourceGroupName, monitorName).toBlocking().single();
        return new PagedList<MonitoringTagRulesInner>(response.body()) {
            @Override
            public Page<MonitoringTagRulesInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * List the tag rules for a given monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param monitorName Monitor resource name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<MonitoringTagRulesInner>> listAsync(final String resourceGroupName, final String monitorName, final ListOperationCallback<MonitoringTagRulesInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(resourceGroupName, monitorName),
            new Func1<String, Observable<ServiceResponse<Page<MonitoringTagRulesInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<MonitoringTagRulesInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * List the tag rules for a given monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param monitorName Monitor resource name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;MonitoringTagRulesInner&gt; object
     */
    public Observable<Page<MonitoringTagRulesInner>> listAsync(final String resourceGroupName, final String monitorName) {
        return listWithServiceResponseAsync(resourceGroupName, monitorName)
            .map(new Func1<ServiceResponse<Page<MonitoringTagRulesInner>>, Page<MonitoringTagRulesInner>>() {
                @Override
                public Page<MonitoringTagRulesInner> call(ServiceResponse<Page<MonitoringTagRulesInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * List the tag rules for a given monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param monitorName Monitor resource name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;MonitoringTagRulesInner&gt; object
     */
    public Observable<ServiceResponse<Page<MonitoringTagRulesInner>>> listWithServiceResponseAsync(final String resourceGroupName, final String monitorName) {
        return listSinglePageAsync(resourceGroupName, monitorName)
            .concatMap(new Func1<ServiceResponse<Page<MonitoringTagRulesInner>>, Observable<ServiceResponse<Page<MonitoringTagRulesInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<MonitoringTagRulesInner>>> call(ServiceResponse<Page<MonitoringTagRulesInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * List the tag rules for a given monitor resource.
     *
    ServiceResponse<PageImpl<MonitoringTagRulesInner>> * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
    ServiceResponse<PageImpl<MonitoringTagRulesInner>> * @param monitorName Monitor resource name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;MonitoringTagRulesInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<MonitoringTagRulesInner>>> listSinglePageAsync(final String resourceGroupName, final String monitorName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (monitorName == null) {
            throw new IllegalArgumentException("Parameter monitorName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), resourceGroupName, monitorName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<MonitoringTagRulesInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<MonitoringTagRulesInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<MonitoringTagRulesInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<MonitoringTagRulesInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<MonitoringTagRulesInner>> listDelegate(Response<ResponseBody> response) throws ResourceProviderDefaultErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<MonitoringTagRulesInner>, ResourceProviderDefaultErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<MonitoringTagRulesInner>>() { }.getType())
                .registerError(ResourceProviderDefaultErrorResponseException.class)
                .build(response);
    }

    /**
     * Create or update a tag rule set for a given monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param monitorName Monitor resource name
     * @param ruleSetName Rule set name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ResourceProviderDefaultErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MonitoringTagRulesInner object if successful.
     */
    public MonitoringTagRulesInner createOrUpdate(String resourceGroupName, String monitorName, String ruleSetName) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, monitorName, ruleSetName).toBlocking().single().body();
    }

    /**
     * Create or update a tag rule set for a given monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param monitorName Monitor resource name
     * @param ruleSetName Rule set name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<MonitoringTagRulesInner> createOrUpdateAsync(String resourceGroupName, String monitorName, String ruleSetName, final ServiceCallback<MonitoringTagRulesInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, monitorName, ruleSetName), serviceCallback);
    }

    /**
     * Create or update a tag rule set for a given monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param monitorName Monitor resource name
     * @param ruleSetName Rule set name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MonitoringTagRulesInner object
     */
    public Observable<MonitoringTagRulesInner> createOrUpdateAsync(String resourceGroupName, String monitorName, String ruleSetName) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, monitorName, ruleSetName).map(new Func1<ServiceResponse<MonitoringTagRulesInner>, MonitoringTagRulesInner>() {
            @Override
            public MonitoringTagRulesInner call(ServiceResponse<MonitoringTagRulesInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Create or update a tag rule set for a given monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param monitorName Monitor resource name
     * @param ruleSetName Rule set name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MonitoringTagRulesInner object
     */
    public Observable<ServiceResponse<MonitoringTagRulesInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String monitorName, String ruleSetName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (monitorName == null) {
            throw new IllegalArgumentException("Parameter monitorName is required and cannot be null.");
        }
        if (ruleSetName == null) {
            throw new IllegalArgumentException("Parameter ruleSetName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final MonitoringTagRulesProperties properties = null;
        MonitoringTagRulesInner body = new MonitoringTagRulesInner();
        body.withProperties(null);
        return service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, monitorName, ruleSetName, this.client.apiVersion(), this.client.acceptLanguage(), body, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<MonitoringTagRulesInner>>>() {
                @Override
                public Observable<ServiceResponse<MonitoringTagRulesInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<MonitoringTagRulesInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Create or update a tag rule set for a given monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param monitorName Monitor resource name
     * @param ruleSetName Rule set name
     * @param properties the MonitoringTagRulesProperties value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ResourceProviderDefaultErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MonitoringTagRulesInner object if successful.
     */
    public MonitoringTagRulesInner createOrUpdate(String resourceGroupName, String monitorName, String ruleSetName, MonitoringTagRulesProperties properties) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, monitorName, ruleSetName, properties).toBlocking().single().body();
    }

    /**
     * Create or update a tag rule set for a given monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param monitorName Monitor resource name
     * @param ruleSetName Rule set name
     * @param properties the MonitoringTagRulesProperties value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<MonitoringTagRulesInner> createOrUpdateAsync(String resourceGroupName, String monitorName, String ruleSetName, MonitoringTagRulesProperties properties, final ServiceCallback<MonitoringTagRulesInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, monitorName, ruleSetName, properties), serviceCallback);
    }

    /**
     * Create or update a tag rule set for a given monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param monitorName Monitor resource name
     * @param ruleSetName Rule set name
     * @param properties the MonitoringTagRulesProperties value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MonitoringTagRulesInner object
     */
    public Observable<MonitoringTagRulesInner> createOrUpdateAsync(String resourceGroupName, String monitorName, String ruleSetName, MonitoringTagRulesProperties properties) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, monitorName, ruleSetName, properties).map(new Func1<ServiceResponse<MonitoringTagRulesInner>, MonitoringTagRulesInner>() {
            @Override
            public MonitoringTagRulesInner call(ServiceResponse<MonitoringTagRulesInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Create or update a tag rule set for a given monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param monitorName Monitor resource name
     * @param ruleSetName Rule set name
     * @param properties the MonitoringTagRulesProperties value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MonitoringTagRulesInner object
     */
    public Observable<ServiceResponse<MonitoringTagRulesInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String monitorName, String ruleSetName, MonitoringTagRulesProperties properties) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (monitorName == null) {
            throw new IllegalArgumentException("Parameter monitorName is required and cannot be null.");
        }
        if (ruleSetName == null) {
            throw new IllegalArgumentException("Parameter ruleSetName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(properties);
        MonitoringTagRulesInner body = null;
        if (properties != null) {
            body = new MonitoringTagRulesInner();
            body.withProperties(properties);
        }
        return service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, monitorName, ruleSetName, this.client.apiVersion(), this.client.acceptLanguage(), body, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<MonitoringTagRulesInner>>>() {
                @Override
                public Observable<ServiceResponse<MonitoringTagRulesInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<MonitoringTagRulesInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<MonitoringTagRulesInner> createOrUpdateDelegate(Response<ResponseBody> response) throws ResourceProviderDefaultErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<MonitoringTagRulesInner, ResourceProviderDefaultErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<MonitoringTagRulesInner>() { }.getType())
                .registerError(ResourceProviderDefaultErrorResponseException.class)
                .build(response);
    }

    /**
     * Get a tag rule set for a given monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param monitorName Monitor resource name
     * @param ruleSetName Rule set name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ResourceProviderDefaultErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the MonitoringTagRulesInner object if successful.
     */
    public MonitoringTagRulesInner get(String resourceGroupName, String monitorName, String ruleSetName) {
        return getWithServiceResponseAsync(resourceGroupName, monitorName, ruleSetName).toBlocking().single().body();
    }

    /**
     * Get a tag rule set for a given monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param monitorName Monitor resource name
     * @param ruleSetName Rule set name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<MonitoringTagRulesInner> getAsync(String resourceGroupName, String monitorName, String ruleSetName, final ServiceCallback<MonitoringTagRulesInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, monitorName, ruleSetName), serviceCallback);
    }

    /**
     * Get a tag rule set for a given monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param monitorName Monitor resource name
     * @param ruleSetName Rule set name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MonitoringTagRulesInner object
     */
    public Observable<MonitoringTagRulesInner> getAsync(String resourceGroupName, String monitorName, String ruleSetName) {
        return getWithServiceResponseAsync(resourceGroupName, monitorName, ruleSetName).map(new Func1<ServiceResponse<MonitoringTagRulesInner>, MonitoringTagRulesInner>() {
            @Override
            public MonitoringTagRulesInner call(ServiceResponse<MonitoringTagRulesInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get a tag rule set for a given monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param monitorName Monitor resource name
     * @param ruleSetName Rule set name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the MonitoringTagRulesInner object
     */
    public Observable<ServiceResponse<MonitoringTagRulesInner>> getWithServiceResponseAsync(String resourceGroupName, String monitorName, String ruleSetName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (monitorName == null) {
            throw new IllegalArgumentException("Parameter monitorName is required and cannot be null.");
        }
        if (ruleSetName == null) {
            throw new IllegalArgumentException("Parameter ruleSetName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), resourceGroupName, monitorName, ruleSetName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<MonitoringTagRulesInner>>>() {
                @Override
                public Observable<ServiceResponse<MonitoringTagRulesInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<MonitoringTagRulesInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<MonitoringTagRulesInner> getDelegate(Response<ResponseBody> response) throws ResourceProviderDefaultErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<MonitoringTagRulesInner, ResourceProviderDefaultErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<MonitoringTagRulesInner>() { }.getType())
                .registerError(ResourceProviderDefaultErrorResponseException.class)
                .build(response);
    }

    /**
     * List the tag rules for a given monitor resource.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ResourceProviderDefaultErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;MonitoringTagRulesInner&gt; object if successful.
     */
    public PagedList<MonitoringTagRulesInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<MonitoringTagRulesInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<MonitoringTagRulesInner>(response.body()) {
            @Override
            public Page<MonitoringTagRulesInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * List the tag rules for a given monitor resource.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<MonitoringTagRulesInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<MonitoringTagRulesInner>> serviceFuture, final ListOperationCallback<MonitoringTagRulesInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<MonitoringTagRulesInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<MonitoringTagRulesInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * List the tag rules for a given monitor resource.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;MonitoringTagRulesInner&gt; object
     */
    public Observable<Page<MonitoringTagRulesInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<MonitoringTagRulesInner>>, Page<MonitoringTagRulesInner>>() {
                @Override
                public Page<MonitoringTagRulesInner> call(ServiceResponse<Page<MonitoringTagRulesInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * List the tag rules for a given monitor resource.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;MonitoringTagRulesInner&gt; object
     */
    public Observable<ServiceResponse<Page<MonitoringTagRulesInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<MonitoringTagRulesInner>>, Observable<ServiceResponse<Page<MonitoringTagRulesInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<MonitoringTagRulesInner>>> call(ServiceResponse<Page<MonitoringTagRulesInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * List the tag rules for a given monitor resource.
     *
    ServiceResponse<PageImpl<MonitoringTagRulesInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;MonitoringTagRulesInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<MonitoringTagRulesInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<MonitoringTagRulesInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<MonitoringTagRulesInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<MonitoringTagRulesInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<MonitoringTagRulesInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<MonitoringTagRulesInner>> listNextDelegate(Response<ResponseBody> response) throws ResourceProviderDefaultErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<MonitoringTagRulesInner>, ResourceProviderDefaultErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<MonitoringTagRulesInner>>() { }.getType())
                .registerError(ResourceProviderDefaultErrorResponseException.class)
                .build(response);
    }

}
