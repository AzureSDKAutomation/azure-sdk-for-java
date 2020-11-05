/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2020_10_19_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.desktopvirtualization.v2020_10_19_preview.MSIXImageURI;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
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
 * in MsixImages.
 */
public class MsixImagesInner {
    /** The Retrofit service to perform REST calls. */
    private MsixImagesService service;
    /** The service client containing this operation class. */
    private DesktopVirtualizationAPIClientImpl client;

    /**
     * Initializes an instance of MsixImagesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public MsixImagesInner(Retrofit retrofit, DesktopVirtualizationAPIClientImpl client) {
        this.service = retrofit.create(MsixImagesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for MsixImages to be
     * used by Retrofit to perform actually REST calls.
     */
    interface MsixImagesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.desktopvirtualization.v2020_10_19_preview.MsixImages expand" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DesktopVirtualization/hostPools/{hostPoolName}/expandMsixImage")
        Observable<Response<ResponseBody>> expand(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("hostPoolName") String hostPoolName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body MSIXImageURI msixImageURI, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.desktopvirtualization.v2020_10_19_preview.MsixImages expandNext" })
        @GET
        Observable<Response<ResponseBody>> expandNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Expands and Lists MSIX packages in an Image, given the Image Path.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ExpandMsixImageInner&gt; object if successful.
     */
    public PagedList<ExpandMsixImageInner> expand(final String resourceGroupName, final String hostPoolName) {
        ServiceResponse<Page<ExpandMsixImageInner>> response = expandSinglePageAsync(resourceGroupName, hostPoolName).toBlocking().single();
        return new PagedList<ExpandMsixImageInner>(response.body()) {
            @Override
            public Page<ExpandMsixImageInner> nextPage(String nextPageLink) {
                return expandNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Expands and Lists MSIX packages in an Image, given the Image Path.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ExpandMsixImageInner>> expandAsync(final String resourceGroupName, final String hostPoolName, final ListOperationCallback<ExpandMsixImageInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            expandSinglePageAsync(resourceGroupName, hostPoolName),
            new Func1<String, Observable<ServiceResponse<Page<ExpandMsixImageInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExpandMsixImageInner>>> call(String nextPageLink) {
                    return expandNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Expands and Lists MSIX packages in an Image, given the Image Path.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ExpandMsixImageInner&gt; object
     */
    public Observable<Page<ExpandMsixImageInner>> expandAsync(final String resourceGroupName, final String hostPoolName) {
        return expandWithServiceResponseAsync(resourceGroupName, hostPoolName)
            .map(new Func1<ServiceResponse<Page<ExpandMsixImageInner>>, Page<ExpandMsixImageInner>>() {
                @Override
                public Page<ExpandMsixImageInner> call(ServiceResponse<Page<ExpandMsixImageInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Expands and Lists MSIX packages in an Image, given the Image Path.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ExpandMsixImageInner&gt; object
     */
    public Observable<ServiceResponse<Page<ExpandMsixImageInner>>> expandWithServiceResponseAsync(final String resourceGroupName, final String hostPoolName) {
        return expandSinglePageAsync(resourceGroupName, hostPoolName)
            .concatMap(new Func1<ServiceResponse<Page<ExpandMsixImageInner>>, Observable<ServiceResponse<Page<ExpandMsixImageInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExpandMsixImageInner>>> call(ServiceResponse<Page<ExpandMsixImageInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(expandNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Expands and Lists MSIX packages in an Image, given the Image Path.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ExpandMsixImageInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ExpandMsixImageInner>>> expandSinglePageAsync(final String resourceGroupName, final String hostPoolName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (hostPoolName == null) {
            throw new IllegalArgumentException("Parameter hostPoolName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String uri = null;
        MSIXImageURI msixImageURI = new MSIXImageURI();
        msixImageURI.withUri(null);
        return service.expand(this.client.subscriptionId(), resourceGroupName, hostPoolName, this.client.apiVersion(), this.client.acceptLanguage(), msixImageURI, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ExpandMsixImageInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExpandMsixImageInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ExpandMsixImageInner>> result = expandDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ExpandMsixImageInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Expands and Lists MSIX packages in an Image, given the Image Path.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group
     * @param uri URI to Image
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ExpandMsixImageInner&gt; object if successful.
     */
    public PagedList<ExpandMsixImageInner> expand(final String resourceGroupName, final String hostPoolName, final String uri) {
        ServiceResponse<Page<ExpandMsixImageInner>> response = expandSinglePageAsync(resourceGroupName, hostPoolName, uri).toBlocking().single();
        return new PagedList<ExpandMsixImageInner>(response.body()) {
            @Override
            public Page<ExpandMsixImageInner> nextPage(String nextPageLink) {
                return expandNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Expands and Lists MSIX packages in an Image, given the Image Path.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group
     * @param uri URI to Image
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ExpandMsixImageInner>> expandAsync(final String resourceGroupName, final String hostPoolName, final String uri, final ListOperationCallback<ExpandMsixImageInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            expandSinglePageAsync(resourceGroupName, hostPoolName, uri),
            new Func1<String, Observable<ServiceResponse<Page<ExpandMsixImageInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExpandMsixImageInner>>> call(String nextPageLink) {
                    return expandNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Expands and Lists MSIX packages in an Image, given the Image Path.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group
     * @param uri URI to Image
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ExpandMsixImageInner&gt; object
     */
    public Observable<Page<ExpandMsixImageInner>> expandAsync(final String resourceGroupName, final String hostPoolName, final String uri) {
        return expandWithServiceResponseAsync(resourceGroupName, hostPoolName, uri)
            .map(new Func1<ServiceResponse<Page<ExpandMsixImageInner>>, Page<ExpandMsixImageInner>>() {
                @Override
                public Page<ExpandMsixImageInner> call(ServiceResponse<Page<ExpandMsixImageInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Expands and Lists MSIX packages in an Image, given the Image Path.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group
     * @param uri URI to Image
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ExpandMsixImageInner&gt; object
     */
    public Observable<ServiceResponse<Page<ExpandMsixImageInner>>> expandWithServiceResponseAsync(final String resourceGroupName, final String hostPoolName, final String uri) {
        return expandSinglePageAsync(resourceGroupName, hostPoolName, uri)
            .concatMap(new Func1<ServiceResponse<Page<ExpandMsixImageInner>>, Observable<ServiceResponse<Page<ExpandMsixImageInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExpandMsixImageInner>>> call(ServiceResponse<Page<ExpandMsixImageInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(expandNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Expands and Lists MSIX packages in an Image, given the Image Path.
     *
    ServiceResponse<PageImpl<ExpandMsixImageInner>> * @param resourceGroupName The name of the resource group. The name is case insensitive.
    ServiceResponse<PageImpl<ExpandMsixImageInner>> * @param hostPoolName The name of the host pool within the specified resource group
    ServiceResponse<PageImpl<ExpandMsixImageInner>> * @param uri URI to Image
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ExpandMsixImageInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ExpandMsixImageInner>>> expandSinglePageAsync(final String resourceGroupName, final String hostPoolName, final String uri) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (hostPoolName == null) {
            throw new IllegalArgumentException("Parameter hostPoolName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        MSIXImageURI msixImageURI = new MSIXImageURI();
        msixImageURI.withUri(uri);
        return service.expand(this.client.subscriptionId(), resourceGroupName, hostPoolName, this.client.apiVersion(), this.client.acceptLanguage(), msixImageURI, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ExpandMsixImageInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExpandMsixImageInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ExpandMsixImageInner>> result = expandDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ExpandMsixImageInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ExpandMsixImageInner>> expandDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ExpandMsixImageInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ExpandMsixImageInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Expands and Lists MSIX packages in an Image, given the Image Path.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ExpandMsixImageInner&gt; object if successful.
     */
    public PagedList<ExpandMsixImageInner> expandNext(final String nextPageLink) {
        ServiceResponse<Page<ExpandMsixImageInner>> response = expandNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<ExpandMsixImageInner>(response.body()) {
            @Override
            public Page<ExpandMsixImageInner> nextPage(String nextPageLink) {
                return expandNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Expands and Lists MSIX packages in an Image, given the Image Path.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ExpandMsixImageInner>> expandNextAsync(final String nextPageLink, final ServiceFuture<List<ExpandMsixImageInner>> serviceFuture, final ListOperationCallback<ExpandMsixImageInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            expandNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<ExpandMsixImageInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExpandMsixImageInner>>> call(String nextPageLink) {
                    return expandNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Expands and Lists MSIX packages in an Image, given the Image Path.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ExpandMsixImageInner&gt; object
     */
    public Observable<Page<ExpandMsixImageInner>> expandNextAsync(final String nextPageLink) {
        return expandNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<ExpandMsixImageInner>>, Page<ExpandMsixImageInner>>() {
                @Override
                public Page<ExpandMsixImageInner> call(ServiceResponse<Page<ExpandMsixImageInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Expands and Lists MSIX packages in an Image, given the Image Path.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ExpandMsixImageInner&gt; object
     */
    public Observable<ServiceResponse<Page<ExpandMsixImageInner>>> expandNextWithServiceResponseAsync(final String nextPageLink) {
        return expandNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<ExpandMsixImageInner>>, Observable<ServiceResponse<Page<ExpandMsixImageInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExpandMsixImageInner>>> call(ServiceResponse<Page<ExpandMsixImageInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(expandNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Expands and Lists MSIX packages in an Image, given the Image Path.
     *
    ServiceResponse<PageImpl<ExpandMsixImageInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ExpandMsixImageInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ExpandMsixImageInner>>> expandNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.expandNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ExpandMsixImageInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ExpandMsixImageInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ExpandMsixImageInner>> result = expandNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ExpandMsixImageInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ExpandMsixImageInner>> expandNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ExpandMsixImageInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ExpandMsixImageInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
