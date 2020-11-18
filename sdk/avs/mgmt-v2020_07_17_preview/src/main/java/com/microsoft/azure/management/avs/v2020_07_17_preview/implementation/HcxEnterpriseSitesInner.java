/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2020_07_17_preview.implementation;

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
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in HcxEnterpriseSites.
 */
public class HcxEnterpriseSitesInner {
    /** The Retrofit service to perform REST calls. */
    private HcxEnterpriseSitesService service;
    /** The service client containing this operation class. */
    private AvsClientImpl client;

    /**
     * Initializes an instance of HcxEnterpriseSitesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public HcxEnterpriseSitesInner(Retrofit retrofit, AvsClientImpl client) {
        this.service = retrofit.create(HcxEnterpriseSitesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for HcxEnterpriseSites to be
     * used by Retrofit to perform actually REST calls.
     */
    interface HcxEnterpriseSitesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.avs.v2020_07_17_preview.HcxEnterpriseSites list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.AVS/privateClouds/{privateCloudName}/hcxEnterpriseSites")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("privateCloudName") String privateCloudName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.avs.v2020_07_17_preview.HcxEnterpriseSites get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.AVS/privateClouds/{privateCloudName}/hcxEnterpriseSites/{hcxEnterpriseSiteName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("privateCloudName") String privateCloudName, @Path("hcxEnterpriseSiteName") String hcxEnterpriseSiteName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.avs.v2020_07_17_preview.HcxEnterpriseSites createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.AVS/privateClouds/{privateCloudName}/hcxEnterpriseSites/{hcxEnterpriseSiteName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("privateCloudName") String privateCloudName, @Path("hcxEnterpriseSiteName") String hcxEnterpriseSiteName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body HcxEnterpriseSiteInner hcxEnterpriseSite, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.avs.v2020_07_17_preview.HcxEnterpriseSites delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.AVS/privateClouds/{privateCloudName}/hcxEnterpriseSites/{hcxEnterpriseSiteName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("privateCloudName") String privateCloudName, @Path("hcxEnterpriseSiteName") String hcxEnterpriseSiteName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.avs.v2020_07_17_preview.HcxEnterpriseSites listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * List HCX Enterprise Sites in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;HcxEnterpriseSiteInner&gt; object if successful.
     */
    public PagedList<HcxEnterpriseSiteInner> list(final String resourceGroupName, final String privateCloudName) {
        ServiceResponse<Page<HcxEnterpriseSiteInner>> response = listSinglePageAsync(resourceGroupName, privateCloudName).toBlocking().single();
        return new PagedList<HcxEnterpriseSiteInner>(response.body()) {
            @Override
            public Page<HcxEnterpriseSiteInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * List HCX Enterprise Sites in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<HcxEnterpriseSiteInner>> listAsync(final String resourceGroupName, final String privateCloudName, final ListOperationCallback<HcxEnterpriseSiteInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(resourceGroupName, privateCloudName),
            new Func1<String, Observable<ServiceResponse<Page<HcxEnterpriseSiteInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<HcxEnterpriseSiteInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * List HCX Enterprise Sites in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;HcxEnterpriseSiteInner&gt; object
     */
    public Observable<Page<HcxEnterpriseSiteInner>> listAsync(final String resourceGroupName, final String privateCloudName) {
        return listWithServiceResponseAsync(resourceGroupName, privateCloudName)
            .map(new Func1<ServiceResponse<Page<HcxEnterpriseSiteInner>>, Page<HcxEnterpriseSiteInner>>() {
                @Override
                public Page<HcxEnterpriseSiteInner> call(ServiceResponse<Page<HcxEnterpriseSiteInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * List HCX Enterprise Sites in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;HcxEnterpriseSiteInner&gt; object
     */
    public Observable<ServiceResponse<Page<HcxEnterpriseSiteInner>>> listWithServiceResponseAsync(final String resourceGroupName, final String privateCloudName) {
        return listSinglePageAsync(resourceGroupName, privateCloudName)
            .concatMap(new Func1<ServiceResponse<Page<HcxEnterpriseSiteInner>>, Observable<ServiceResponse<Page<HcxEnterpriseSiteInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<HcxEnterpriseSiteInner>>> call(ServiceResponse<Page<HcxEnterpriseSiteInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * List HCX Enterprise Sites in a private cloud.
     *
    ServiceResponse<PageImpl<HcxEnterpriseSiteInner>> * @param resourceGroupName The name of the resource group. The name is case insensitive.
    ServiceResponse<PageImpl<HcxEnterpriseSiteInner>> * @param privateCloudName Name of the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;HcxEnterpriseSiteInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<HcxEnterpriseSiteInner>>> listSinglePageAsync(final String resourceGroupName, final String privateCloudName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (privateCloudName == null) {
            throw new IllegalArgumentException("Parameter privateCloudName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), resourceGroupName, privateCloudName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<HcxEnterpriseSiteInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<HcxEnterpriseSiteInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<HcxEnterpriseSiteInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<HcxEnterpriseSiteInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<HcxEnterpriseSiteInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<HcxEnterpriseSiteInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<HcxEnterpriseSiteInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Get an HCX Enterprise Site by name in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud
     * @param hcxEnterpriseSiteName Name of the HCX Enterprise Site in the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the HcxEnterpriseSiteInner object if successful.
     */
    public HcxEnterpriseSiteInner get(String resourceGroupName, String privateCloudName, String hcxEnterpriseSiteName) {
        return getWithServiceResponseAsync(resourceGroupName, privateCloudName, hcxEnterpriseSiteName).toBlocking().single().body();
    }

    /**
     * Get an HCX Enterprise Site by name in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud
     * @param hcxEnterpriseSiteName Name of the HCX Enterprise Site in the private cloud
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<HcxEnterpriseSiteInner> getAsync(String resourceGroupName, String privateCloudName, String hcxEnterpriseSiteName, final ServiceCallback<HcxEnterpriseSiteInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, privateCloudName, hcxEnterpriseSiteName), serviceCallback);
    }

    /**
     * Get an HCX Enterprise Site by name in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud
     * @param hcxEnterpriseSiteName Name of the HCX Enterprise Site in the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the HcxEnterpriseSiteInner object
     */
    public Observable<HcxEnterpriseSiteInner> getAsync(String resourceGroupName, String privateCloudName, String hcxEnterpriseSiteName) {
        return getWithServiceResponseAsync(resourceGroupName, privateCloudName, hcxEnterpriseSiteName).map(new Func1<ServiceResponse<HcxEnterpriseSiteInner>, HcxEnterpriseSiteInner>() {
            @Override
            public HcxEnterpriseSiteInner call(ServiceResponse<HcxEnterpriseSiteInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get an HCX Enterprise Site by name in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud
     * @param hcxEnterpriseSiteName Name of the HCX Enterprise Site in the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the HcxEnterpriseSiteInner object
     */
    public Observable<ServiceResponse<HcxEnterpriseSiteInner>> getWithServiceResponseAsync(String resourceGroupName, String privateCloudName, String hcxEnterpriseSiteName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (privateCloudName == null) {
            throw new IllegalArgumentException("Parameter privateCloudName is required and cannot be null.");
        }
        if (hcxEnterpriseSiteName == null) {
            throw new IllegalArgumentException("Parameter hcxEnterpriseSiteName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), resourceGroupName, privateCloudName, hcxEnterpriseSiteName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<HcxEnterpriseSiteInner>>>() {
                @Override
                public Observable<ServiceResponse<HcxEnterpriseSiteInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<HcxEnterpriseSiteInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<HcxEnterpriseSiteInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<HcxEnterpriseSiteInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<HcxEnterpriseSiteInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Create or update an HCX Enterprise Site in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName The name of the private cloud.
     * @param hcxEnterpriseSiteName Name of the HCX Enterprise Site in the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the HcxEnterpriseSiteInner object if successful.
     */
    public HcxEnterpriseSiteInner createOrUpdate(String resourceGroupName, String privateCloudName, String hcxEnterpriseSiteName) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, privateCloudName, hcxEnterpriseSiteName).toBlocking().single().body();
    }

    /**
     * Create or update an HCX Enterprise Site in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName The name of the private cloud.
     * @param hcxEnterpriseSiteName Name of the HCX Enterprise Site in the private cloud
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<HcxEnterpriseSiteInner> createOrUpdateAsync(String resourceGroupName, String privateCloudName, String hcxEnterpriseSiteName, final ServiceCallback<HcxEnterpriseSiteInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, privateCloudName, hcxEnterpriseSiteName), serviceCallback);
    }

    /**
     * Create or update an HCX Enterprise Site in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName The name of the private cloud.
     * @param hcxEnterpriseSiteName Name of the HCX Enterprise Site in the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the HcxEnterpriseSiteInner object
     */
    public Observable<HcxEnterpriseSiteInner> createOrUpdateAsync(String resourceGroupName, String privateCloudName, String hcxEnterpriseSiteName) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, privateCloudName, hcxEnterpriseSiteName).map(new Func1<ServiceResponse<HcxEnterpriseSiteInner>, HcxEnterpriseSiteInner>() {
            @Override
            public HcxEnterpriseSiteInner call(ServiceResponse<HcxEnterpriseSiteInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Create or update an HCX Enterprise Site in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName The name of the private cloud.
     * @param hcxEnterpriseSiteName Name of the HCX Enterprise Site in the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the HcxEnterpriseSiteInner object
     */
    public Observable<ServiceResponse<HcxEnterpriseSiteInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String privateCloudName, String hcxEnterpriseSiteName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (privateCloudName == null) {
            throw new IllegalArgumentException("Parameter privateCloudName is required and cannot be null.");
        }
        if (hcxEnterpriseSiteName == null) {
            throw new IllegalArgumentException("Parameter hcxEnterpriseSiteName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, privateCloudName, hcxEnterpriseSiteName, this.client.apiVersion(), this.client.acceptLanguage(), hcxEnterpriseSite, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<HcxEnterpriseSiteInner>>>() {
                @Override
                public Observable<ServiceResponse<HcxEnterpriseSiteInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<HcxEnterpriseSiteInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<HcxEnterpriseSiteInner> createOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<HcxEnterpriseSiteInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<HcxEnterpriseSiteInner>() { }.getType())
                .register(201, new TypeToken<HcxEnterpriseSiteInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Delete an HCX Enterprise Site in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud
     * @param hcxEnterpriseSiteName Name of the HCX Enterprise Site in the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String privateCloudName, String hcxEnterpriseSiteName) {
        deleteWithServiceResponseAsync(resourceGroupName, privateCloudName, hcxEnterpriseSiteName).toBlocking().single().body();
    }

    /**
     * Delete an HCX Enterprise Site in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud
     * @param hcxEnterpriseSiteName Name of the HCX Enterprise Site in the private cloud
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String privateCloudName, String hcxEnterpriseSiteName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, privateCloudName, hcxEnterpriseSiteName), serviceCallback);
    }

    /**
     * Delete an HCX Enterprise Site in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud
     * @param hcxEnterpriseSiteName Name of the HCX Enterprise Site in the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String privateCloudName, String hcxEnterpriseSiteName) {
        return deleteWithServiceResponseAsync(resourceGroupName, privateCloudName, hcxEnterpriseSiteName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete an HCX Enterprise Site in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud
     * @param hcxEnterpriseSiteName Name of the HCX Enterprise Site in the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String privateCloudName, String hcxEnterpriseSiteName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (privateCloudName == null) {
            throw new IllegalArgumentException("Parameter privateCloudName is required and cannot be null.");
        }
        if (hcxEnterpriseSiteName == null) {
            throw new IllegalArgumentException("Parameter hcxEnterpriseSiteName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(this.client.subscriptionId(), resourceGroupName, privateCloudName, hcxEnterpriseSiteName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
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

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * List HCX Enterprise Sites in a private cloud.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;HcxEnterpriseSiteInner&gt; object if successful.
     */
    public PagedList<HcxEnterpriseSiteInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<HcxEnterpriseSiteInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<HcxEnterpriseSiteInner>(response.body()) {
            @Override
            public Page<HcxEnterpriseSiteInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * List HCX Enterprise Sites in a private cloud.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<HcxEnterpriseSiteInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<HcxEnterpriseSiteInner>> serviceFuture, final ListOperationCallback<HcxEnterpriseSiteInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<HcxEnterpriseSiteInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<HcxEnterpriseSiteInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * List HCX Enterprise Sites in a private cloud.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;HcxEnterpriseSiteInner&gt; object
     */
    public Observable<Page<HcxEnterpriseSiteInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<HcxEnterpriseSiteInner>>, Page<HcxEnterpriseSiteInner>>() {
                @Override
                public Page<HcxEnterpriseSiteInner> call(ServiceResponse<Page<HcxEnterpriseSiteInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * List HCX Enterprise Sites in a private cloud.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;HcxEnterpriseSiteInner&gt; object
     */
    public Observable<ServiceResponse<Page<HcxEnterpriseSiteInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<HcxEnterpriseSiteInner>>, Observable<ServiceResponse<Page<HcxEnterpriseSiteInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<HcxEnterpriseSiteInner>>> call(ServiceResponse<Page<HcxEnterpriseSiteInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * List HCX Enterprise Sites in a private cloud.
     *
    ServiceResponse<PageImpl<HcxEnterpriseSiteInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;HcxEnterpriseSiteInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<HcxEnterpriseSiteInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<HcxEnterpriseSiteInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<HcxEnterpriseSiteInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<HcxEnterpriseSiteInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<HcxEnterpriseSiteInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<HcxEnterpriseSiteInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<HcxEnterpriseSiteInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<HcxEnterpriseSiteInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
