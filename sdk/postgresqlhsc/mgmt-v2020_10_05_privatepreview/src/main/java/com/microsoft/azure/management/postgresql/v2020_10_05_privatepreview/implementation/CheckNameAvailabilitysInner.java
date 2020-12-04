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
import com.microsoft.azure.management.postgresql.v2020_10_05_privatepreview.NameAvailabilityRequest;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
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

/**
 * An instance of this class provides access to all the operations defined
 * in CheckNameAvailabilitys.
 */
public class CheckNameAvailabilitysInner {
    /** The Retrofit service to perform REST calls. */
    private CheckNameAvailabilitysService service;
    /** The service client containing this operation class. */
    private HyperscaleCitusManagementClientImpl client;

    /**
     * Initializes an instance of CheckNameAvailabilitysInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public CheckNameAvailabilitysInner(Retrofit retrofit, HyperscaleCitusManagementClientImpl client) {
        this.service = retrofit.create(CheckNameAvailabilitysService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for CheckNameAvailabilitys to be
     * used by Retrofit to perform actually REST calls.
     */
    interface CheckNameAvailabilitysService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.postgresql.v2020_10_05_privatepreview.CheckNameAvailabilitys execute" })
        @POST("subscriptions/{subscriptionId}/providers/Microsoft.DBForPostgreSql/checkNameAvailability")
        Observable<Response<ResponseBody>> execute(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Body NameAvailabilityRequest nameAvailabilityRequest, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Check the availability of name for resource.
     *
     * @param nameAvailabilityRequest The required parameters for checking if resource name is available.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NameAvailabilityInner object if successful.
     */
    public NameAvailabilityInner execute(NameAvailabilityRequest nameAvailabilityRequest) {
        return executeWithServiceResponseAsync(nameAvailabilityRequest).toBlocking().single().body();
    }

    /**
     * Check the availability of name for resource.
     *
     * @param nameAvailabilityRequest The required parameters for checking if resource name is available.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NameAvailabilityInner> executeAsync(NameAvailabilityRequest nameAvailabilityRequest, final ServiceCallback<NameAvailabilityInner> serviceCallback) {
        return ServiceFuture.fromResponse(executeWithServiceResponseAsync(nameAvailabilityRequest), serviceCallback);
    }

    /**
     * Check the availability of name for resource.
     *
     * @param nameAvailabilityRequest The required parameters for checking if resource name is available.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NameAvailabilityInner object
     */
    public Observable<NameAvailabilityInner> executeAsync(NameAvailabilityRequest nameAvailabilityRequest) {
        return executeWithServiceResponseAsync(nameAvailabilityRequest).map(new Func1<ServiceResponse<NameAvailabilityInner>, NameAvailabilityInner>() {
            @Override
            public NameAvailabilityInner call(ServiceResponse<NameAvailabilityInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Check the availability of name for resource.
     *
     * @param nameAvailabilityRequest The required parameters for checking if resource name is available.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NameAvailabilityInner object
     */
    public Observable<ServiceResponse<NameAvailabilityInner>> executeWithServiceResponseAsync(NameAvailabilityRequest nameAvailabilityRequest) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (nameAvailabilityRequest == null) {
            throw new IllegalArgumentException("Parameter nameAvailabilityRequest is required and cannot be null.");
        }
        Validator.validate(nameAvailabilityRequest);
        return service.execute(this.client.subscriptionId(), this.client.apiVersion(), nameAvailabilityRequest, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NameAvailabilityInner>>>() {
                @Override
                public Observable<ServiceResponse<NameAvailabilityInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NameAvailabilityInner> clientResponse = executeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<NameAvailabilityInner> executeDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<NameAvailabilityInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<NameAvailabilityInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
