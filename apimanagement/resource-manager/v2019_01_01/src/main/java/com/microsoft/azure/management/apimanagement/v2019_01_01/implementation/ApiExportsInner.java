/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.apimanagement.v2019_01_01.ErrorResponseException;
import com.microsoft.azure.management.apimanagement.v2019_01_01.ExportFormat;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
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
 * in ApiExports.
 */
public class ApiExportsInner {
    /** The Retrofit service to perform REST calls. */
    private ApiExportsService service;
    /** The service client containing this operation class. */
    private ApiManagementClientImpl client;

    /**
     * Initializes an instance of ApiExportsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ApiExportsInner(Retrofit retrofit, ApiManagementClientImpl client) {
        this.service = retrofit.create(ApiExportsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ApiExports to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ApiExportsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.apimanagement.v2019_01_01.ApiExports get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement/service/{serviceName}/apis/{apiId}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("serviceName") String serviceName, @Path("apiId") String apiId, @Path("subscriptionId") String subscriptionId, @Query("format") ExportFormat format, @Query("export") String export, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the details of the API specified by its identifier in the format specified to the Storage Blob with SAS Key valid for 5 minutes.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * @param format Format in which to export the Api Details to the Storage Blob with Sas Key valid for 5 minutes. Possible values include: 'Swagger', 'Wsdl', 'Wadl', 'Openapi'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ApiExportResultInner object if successful.
     */
    public ApiExportResultInner get(String resourceGroupName, String serviceName, String apiId, ExportFormat format) {
        return getWithServiceResponseAsync(resourceGroupName, serviceName, apiId, format).toBlocking().single().body();
    }

    /**
     * Gets the details of the API specified by its identifier in the format specified to the Storage Blob with SAS Key valid for 5 minutes.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * @param format Format in which to export the Api Details to the Storage Blob with Sas Key valid for 5 minutes. Possible values include: 'Swagger', 'Wsdl', 'Wadl', 'Openapi'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ApiExportResultInner> getAsync(String resourceGroupName, String serviceName, String apiId, ExportFormat format, final ServiceCallback<ApiExportResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, serviceName, apiId, format), serviceCallback);
    }

    /**
     * Gets the details of the API specified by its identifier in the format specified to the Storage Blob with SAS Key valid for 5 minutes.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * @param format Format in which to export the Api Details to the Storage Blob with Sas Key valid for 5 minutes. Possible values include: 'Swagger', 'Wsdl', 'Wadl', 'Openapi'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApiExportResultInner object
     */
    public Observable<ApiExportResultInner> getAsync(String resourceGroupName, String serviceName, String apiId, ExportFormat format) {
        return getWithServiceResponseAsync(resourceGroupName, serviceName, apiId, format).map(new Func1<ServiceResponse<ApiExportResultInner>, ApiExportResultInner>() {
            @Override
            public ApiExportResultInner call(ServiceResponse<ApiExportResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the details of the API specified by its identifier in the format specified to the Storage Blob with SAS Key valid for 5 minutes.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * @param format Format in which to export the Api Details to the Storage Blob with Sas Key valid for 5 minutes. Possible values include: 'Swagger', 'Wsdl', 'Wadl', 'Openapi'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApiExportResultInner object
     */
    public Observable<ServiceResponse<ApiExportResultInner>> getWithServiceResponseAsync(String resourceGroupName, String serviceName, String apiId, ExportFormat format) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (apiId == null) {
            throw new IllegalArgumentException("Parameter apiId is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (format == null) {
            throw new IllegalArgumentException("Parameter format is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String export = "true";
        return service.get(resourceGroupName, serviceName, apiId, this.client.subscriptionId(), format, export, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ApiExportResultInner>>>() {
                @Override
                public Observable<ServiceResponse<ApiExportResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ApiExportResultInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ApiExportResultInner> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ApiExportResultInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ApiExportResultInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
