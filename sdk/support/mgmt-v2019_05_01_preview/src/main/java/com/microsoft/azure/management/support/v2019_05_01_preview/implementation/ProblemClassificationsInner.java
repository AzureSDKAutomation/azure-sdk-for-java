/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.support.v2019_05_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.support.v2019_05_01_preview.ExceptionResponseException;
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
 * in ProblemClassifications.
 */
public class ProblemClassificationsInner {
    /** The Retrofit service to perform REST calls. */
    private ProblemClassificationsService service;
    /** The service client containing this operation class. */
    private MicrosoftSupportImpl client;

    /**
     * Initializes an instance of ProblemClassificationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ProblemClassificationsInner(Retrofit retrofit, MicrosoftSupportImpl client) {
        this.service = retrofit.create(ProblemClassificationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ProblemClassifications to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ProblemClassificationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.support.v2019_05_01_preview.ProblemClassifications list" })
        @GET("providers/Microsoft.Support/services/{serviceName}/problemClassifications")
        Observable<Response<ResponseBody>> list(@Path("serviceName") String serviceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.support.v2019_05_01_preview.ProblemClassifications get" })
        @GET("providers/Microsoft.Support/services/{serviceName}/problemClassifications/{problemClassificationName}")
        Observable<Response<ResponseBody>> get(@Path("serviceName") String serviceName, @Path("problemClassificationName") String problemClassificationName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists all the problem classifications (categories) available for a specific Azure service.&lt;br/&gt;&lt;br/&gt; Always use the service and problem classifications obtained programmatically. This practice ensures that you always have the most recent set of service and problem classification Ids.
     *
     * @param serviceName Name of Azure service for which the problem classifications need to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ExceptionResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;ProblemClassificationInner&gt; object if successful.
     */
    public List<ProblemClassificationInner> list(String serviceName) {
        return listWithServiceResponseAsync(serviceName).toBlocking().single().body();
    }

    /**
     * Lists all the problem classifications (categories) available for a specific Azure service.&lt;br/&gt;&lt;br/&gt; Always use the service and problem classifications obtained programmatically. This practice ensures that you always have the most recent set of service and problem classification Ids.
     *
     * @param serviceName Name of Azure service for which the problem classifications need to be retrieved.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ProblemClassificationInner>> listAsync(String serviceName, final ServiceCallback<List<ProblemClassificationInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(serviceName), serviceCallback);
    }

    /**
     * Lists all the problem classifications (categories) available for a specific Azure service.&lt;br/&gt;&lt;br/&gt; Always use the service and problem classifications obtained programmatically. This practice ensures that you always have the most recent set of service and problem classification Ids.
     *
     * @param serviceName Name of Azure service for which the problem classifications need to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ProblemClassificationInner&gt; object
     */
    public Observable<List<ProblemClassificationInner>> listAsync(String serviceName) {
        return listWithServiceResponseAsync(serviceName).map(new Func1<ServiceResponse<List<ProblemClassificationInner>>, List<ProblemClassificationInner>>() {
            @Override
            public List<ProblemClassificationInner> call(ServiceResponse<List<ProblemClassificationInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists all the problem classifications (categories) available for a specific Azure service.&lt;br/&gt;&lt;br/&gt; Always use the service and problem classifications obtained programmatically. This practice ensures that you always have the most recent set of service and problem classification Ids.
     *
     * @param serviceName Name of Azure service for which the problem classifications need to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ProblemClassificationInner&gt; object
     */
    public Observable<ServiceResponse<List<ProblemClassificationInner>>> listWithServiceResponseAsync(String serviceName) {
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(serviceName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<ProblemClassificationInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<ProblemClassificationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ProblemClassificationInner>> result = listDelegate(response);
                        List<ProblemClassificationInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<ProblemClassificationInner>> clientResponse = new ServiceResponse<List<ProblemClassificationInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ProblemClassificationInner>> listDelegate(Response<ResponseBody> response) throws ExceptionResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ProblemClassificationInner>, ExceptionResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ProblemClassificationInner>>() { }.getType())
                .registerError(ExceptionResponseException.class)
                .build(response);
    }

    /**
     * Gets the details of a specific problem classification for a specific Azure service.
     *
     * @param serviceName Name of Azure service available for support.
     * @param problemClassificationName Name of problem classification.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ExceptionResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ProblemClassificationInner object if successful.
     */
    public ProblemClassificationInner get(String serviceName, String problemClassificationName) {
        return getWithServiceResponseAsync(serviceName, problemClassificationName).toBlocking().single().body();
    }

    /**
     * Gets the details of a specific problem classification for a specific Azure service.
     *
     * @param serviceName Name of Azure service available for support.
     * @param problemClassificationName Name of problem classification.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ProblemClassificationInner> getAsync(String serviceName, String problemClassificationName, final ServiceCallback<ProblemClassificationInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(serviceName, problemClassificationName), serviceCallback);
    }

    /**
     * Gets the details of a specific problem classification for a specific Azure service.
     *
     * @param serviceName Name of Azure service available for support.
     * @param problemClassificationName Name of problem classification.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ProblemClassificationInner object
     */
    public Observable<ProblemClassificationInner> getAsync(String serviceName, String problemClassificationName) {
        return getWithServiceResponseAsync(serviceName, problemClassificationName).map(new Func1<ServiceResponse<ProblemClassificationInner>, ProblemClassificationInner>() {
            @Override
            public ProblemClassificationInner call(ServiceResponse<ProblemClassificationInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the details of a specific problem classification for a specific Azure service.
     *
     * @param serviceName Name of Azure service available for support.
     * @param problemClassificationName Name of problem classification.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ProblemClassificationInner object
     */
    public Observable<ServiceResponse<ProblemClassificationInner>> getWithServiceResponseAsync(String serviceName, String problemClassificationName) {
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (problemClassificationName == null) {
            throw new IllegalArgumentException("Parameter problemClassificationName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(serviceName, problemClassificationName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ProblemClassificationInner>>>() {
                @Override
                public Observable<ServiceResponse<ProblemClassificationInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ProblemClassificationInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ProblemClassificationInner> getDelegate(Response<ResponseBody> response) throws ExceptionResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ProblemClassificationInner, ExceptionResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ProblemClassificationInner>() { }.getType())
                .registerError(ExceptionResponseException.class)
                .build(response);
    }

}
