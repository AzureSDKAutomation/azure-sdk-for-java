/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.implementation;

import retrofit2.Retrofit;
import com.microsoft.azure.management.avs.HcxEnterpriseSites;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.avs.models.HcxEnterpriseSite;
import com.microsoft.azure.management.avs.models.PageImpl;
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
public class HcxEnterpriseSitesImpl implements HcxEnterpriseSites {
    /** The Retrofit service to perform REST calls. */
    private HcxEnterpriseSitesService service;
    /** The service client containing this operation class. */
    private AvsClientImpl client;

    /**
     * Initializes an instance of HcxEnterpriseSitesImpl.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public HcxEnterpriseSitesImpl(Retrofit retrofit, AvsClientImpl client) {
        this.service = retrofit.create(HcxEnterpriseSitesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for HcxEnterpriseSites to be
     * used by Retrofit to perform actually REST calls.
     */
    interface HcxEnterpriseSitesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.avs.HcxEnterpriseSites list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.AVS/privateClouds/{privateCloudName}/hcxEnterpriseSites")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("privateCloudName") String privateCloudName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.avs.HcxEnterpriseSites get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.AVS/privateClouds/{privateCloudName}/hcxEnterpriseSites/{hcxEnterpriseSiteName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("privateCloudName") String privateCloudName, @Path("hcxEnterpriseSiteName") String hcxEnterpriseSiteName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.avs.HcxEnterpriseSites createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.AVS/privateClouds/{privateCloudName}/hcxEnterpriseSites/{hcxEnterpriseSiteName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("privateCloudName") String privateCloudName, @Path("hcxEnterpriseSiteName") String hcxEnterpriseSiteName, @Body Object hcxEnterpriseSite, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.avs.HcxEnterpriseSites delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.AVS/privateClouds/{privateCloudName}/hcxEnterpriseSites/{hcxEnterpriseSiteName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("privateCloudName") String privateCloudName, @Path("hcxEnterpriseSiteName") String hcxEnterpriseSiteName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.avs.HcxEnterpriseSites listNext" })
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
     * @return the PagedList&lt;HcxEnterpriseSite&gt; object if successful.
     */
    public PagedList<HcxEnterpriseSite> list(final String resourceGroupName, final String privateCloudName) {
        ServiceResponse<Page<HcxEnterpriseSite>> response = listSinglePageAsync(resourceGroupName, privateCloudName).toBlocking().single();
        return new PagedList<HcxEnterpriseSite>(response.body()) {
            @Override
            public Page<HcxEnterpriseSite> nextPage(String nextPageLink) {
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
    public ServiceFuture<List<HcxEnterpriseSite>> listAsync(final String resourceGroupName, final String privateCloudName, final ListOperationCallback<HcxEnterpriseSite> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(resourceGroupName, privateCloudName),
            new Func1<String, Observable<ServiceResponse<Page<HcxEnterpriseSite>>>>() {
                @Override
                public Observable<ServiceResponse<Page<HcxEnterpriseSite>>> call(String nextPageLink) {
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
     * @return the observable to the PagedList&lt;HcxEnterpriseSite&gt; object
     */
    public Observable<Page<HcxEnterpriseSite>> listAsync(final String resourceGroupName, final String privateCloudName) {
        return listWithServiceResponseAsync(resourceGroupName, privateCloudName)
            .map(new Func1<ServiceResponse<Page<HcxEnterpriseSite>>, Page<HcxEnterpriseSite>>() {
                @Override
                public Page<HcxEnterpriseSite> call(ServiceResponse<Page<HcxEnterpriseSite>> response) {
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
     * @return the observable to the PagedList&lt;HcxEnterpriseSite&gt; object
     */
    public Observable<ServiceResponse<Page<HcxEnterpriseSite>>> listWithServiceResponseAsync(final String resourceGroupName, final String privateCloudName) {
        return listSinglePageAsync(resourceGroupName, privateCloudName)
            .concatMap(new Func1<ServiceResponse<Page<HcxEnterpriseSite>>, Observable<ServiceResponse<Page<HcxEnterpriseSite>>>>() {
                @Override
                public Observable<ServiceResponse<Page<HcxEnterpriseSite>>> call(ServiceResponse<Page<HcxEnterpriseSite>> page) {
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
    ServiceResponse<PageImpl<HcxEnterpriseSite>> * @param resourceGroupName The name of the resource group. The name is case insensitive.
    ServiceResponse<PageImpl<HcxEnterpriseSite>> * @param privateCloudName Name of the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;HcxEnterpriseSite&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<HcxEnterpriseSite>>> listSinglePageAsync(final String resourceGroupName, final String privateCloudName) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<HcxEnterpriseSite>>>>() {
                @Override
                public Observable<ServiceResponse<Page<HcxEnterpriseSite>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<HcxEnterpriseSite>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<HcxEnterpriseSite>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<HcxEnterpriseSite>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<HcxEnterpriseSite>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<HcxEnterpriseSite>>() { }.getType())
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
     * @return the HcxEnterpriseSite object if successful.
     */
    public HcxEnterpriseSite get(String resourceGroupName, String privateCloudName, String hcxEnterpriseSiteName) {
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
    public ServiceFuture<HcxEnterpriseSite> getAsync(String resourceGroupName, String privateCloudName, String hcxEnterpriseSiteName, final ServiceCallback<HcxEnterpriseSite> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, privateCloudName, hcxEnterpriseSiteName), serviceCallback);
    }

    /**
     * Get an HCX Enterprise Site by name in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud
     * @param hcxEnterpriseSiteName Name of the HCX Enterprise Site in the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the HcxEnterpriseSite object
     */
    public Observable<HcxEnterpriseSite> getAsync(String resourceGroupName, String privateCloudName, String hcxEnterpriseSiteName) {
        return getWithServiceResponseAsync(resourceGroupName, privateCloudName, hcxEnterpriseSiteName).map(new Func1<ServiceResponse<HcxEnterpriseSite>, HcxEnterpriseSite>() {
            @Override
            public HcxEnterpriseSite call(ServiceResponse<HcxEnterpriseSite> response) {
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
     * @return the observable to the HcxEnterpriseSite object
     */
    public Observable<ServiceResponse<HcxEnterpriseSite>> getWithServiceResponseAsync(String resourceGroupName, String privateCloudName, String hcxEnterpriseSiteName) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<HcxEnterpriseSite>>>() {
                @Override
                public Observable<ServiceResponse<HcxEnterpriseSite>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<HcxEnterpriseSite> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<HcxEnterpriseSite> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<HcxEnterpriseSite, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<HcxEnterpriseSite>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Create or update an HCX Enterprise Site in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName The name of the private cloud.
     * @param hcxEnterpriseSiteName Name of the HCX Enterprise Site in the private cloud
     * @param hcxEnterpriseSite The HCX Enterprise Site
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the HcxEnterpriseSite object if successful.
     */
    public HcxEnterpriseSite createOrUpdate(String resourceGroupName, String privateCloudName, String hcxEnterpriseSiteName, Object hcxEnterpriseSite) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, privateCloudName, hcxEnterpriseSiteName, hcxEnterpriseSite).toBlocking().single().body();
    }

    /**
     * Create or update an HCX Enterprise Site in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName The name of the private cloud.
     * @param hcxEnterpriseSiteName Name of the HCX Enterprise Site in the private cloud
     * @param hcxEnterpriseSite The HCX Enterprise Site
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<HcxEnterpriseSite> createOrUpdateAsync(String resourceGroupName, String privateCloudName, String hcxEnterpriseSiteName, Object hcxEnterpriseSite, final ServiceCallback<HcxEnterpriseSite> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, privateCloudName, hcxEnterpriseSiteName, hcxEnterpriseSite), serviceCallback);
    }

    /**
     * Create or update an HCX Enterprise Site in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName The name of the private cloud.
     * @param hcxEnterpriseSiteName Name of the HCX Enterprise Site in the private cloud
     * @param hcxEnterpriseSite The HCX Enterprise Site
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the HcxEnterpriseSite object
     */
    public Observable<HcxEnterpriseSite> createOrUpdateAsync(String resourceGroupName, String privateCloudName, String hcxEnterpriseSiteName, Object hcxEnterpriseSite) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, privateCloudName, hcxEnterpriseSiteName, hcxEnterpriseSite).map(new Func1<ServiceResponse<HcxEnterpriseSite>, HcxEnterpriseSite>() {
            @Override
            public HcxEnterpriseSite call(ServiceResponse<HcxEnterpriseSite> response) {
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
     * @param hcxEnterpriseSite The HCX Enterprise Site
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the HcxEnterpriseSite object
     */
    public Observable<ServiceResponse<HcxEnterpriseSite>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String privateCloudName, String hcxEnterpriseSiteName, Object hcxEnterpriseSite) {
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
        if (hcxEnterpriseSite == null) {
            throw new IllegalArgumentException("Parameter hcxEnterpriseSite is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, privateCloudName, hcxEnterpriseSiteName, hcxEnterpriseSite, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<HcxEnterpriseSite>>>() {
                @Override
                public Observable<ServiceResponse<HcxEnterpriseSite>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<HcxEnterpriseSite> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<HcxEnterpriseSite> createOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<HcxEnterpriseSite, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<HcxEnterpriseSite>() { }.getType())
                .register(201, new TypeToken<HcxEnterpriseSite>() { }.getType())
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
     * @return the PagedList&lt;HcxEnterpriseSite&gt; object if successful.
     */
    public PagedList<HcxEnterpriseSite> listNext(final String nextPageLink) {
        ServiceResponse<Page<HcxEnterpriseSite>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<HcxEnterpriseSite>(response.body()) {
            @Override
            public Page<HcxEnterpriseSite> nextPage(String nextPageLink) {
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
    public ServiceFuture<List<HcxEnterpriseSite>> listNextAsync(final String nextPageLink, final ServiceFuture<List<HcxEnterpriseSite>> serviceFuture, final ListOperationCallback<HcxEnterpriseSite> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<HcxEnterpriseSite>>>>() {
                @Override
                public Observable<ServiceResponse<Page<HcxEnterpriseSite>>> call(String nextPageLink) {
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
     * @return the observable to the PagedList&lt;HcxEnterpriseSite&gt; object
     */
    public Observable<Page<HcxEnterpriseSite>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<HcxEnterpriseSite>>, Page<HcxEnterpriseSite>>() {
                @Override
                public Page<HcxEnterpriseSite> call(ServiceResponse<Page<HcxEnterpriseSite>> response) {
                    return response.body();
                }
            });
    }

    /**
     * List HCX Enterprise Sites in a private cloud.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;HcxEnterpriseSite&gt; object
     */
    public Observable<ServiceResponse<Page<HcxEnterpriseSite>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<HcxEnterpriseSite>>, Observable<ServiceResponse<Page<HcxEnterpriseSite>>>>() {
                @Override
                public Observable<ServiceResponse<Page<HcxEnterpriseSite>>> call(ServiceResponse<Page<HcxEnterpriseSite>> page) {
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
    ServiceResponse<PageImpl<HcxEnterpriseSite>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;HcxEnterpriseSite&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<HcxEnterpriseSite>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<HcxEnterpriseSite>>>>() {
                @Override
                public Observable<ServiceResponse<Page<HcxEnterpriseSite>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<HcxEnterpriseSite>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<HcxEnterpriseSite>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<HcxEnterpriseSite>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<HcxEnterpriseSite>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<HcxEnterpriseSite>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
