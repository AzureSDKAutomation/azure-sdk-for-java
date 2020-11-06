/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2019_09_01.implementation;

import retrofit2.Retrofit;
import com.microsoft.azure.management.keyvault.v20190901.PrivateLinkResources;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.keyvault.v20190901.models.PrivateLinkResourceListResult;
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
 * in PrivateLinkResources.
 */
public class PrivateLinkResourcesImpl implements PrivateLinkResources {
    /** The Retrofit service to perform REST calls. */
    private PrivateLinkResourcesService service;
    /** The service client containing this operation class. */
    private KeyVaultManagementClientImpl client;

    /**
     * Initializes an instance of PrivateLinkResourcesImpl.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PrivateLinkResourcesImpl(Retrofit retrofit, KeyVaultManagementClientImpl client) {
        this.service = retrofit.create(PrivateLinkResourcesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for PrivateLinkResources to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PrivateLinkResourcesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.keyvault.v20190901.PrivateLinkResources listByVault" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.KeyVault/vaults/{vaultName}/privateLinkResources")
        Observable<Response<ResponseBody>> listByVault(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("vaultName") String vaultName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the private link resources supported for the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PrivateLinkResourceListResult object if successful.
     */
    public PrivateLinkResourceListResult listByVault(String resourceGroupName, String vaultName) {
        return listByVaultWithServiceResponseAsync(resourceGroupName, vaultName).toBlocking().single().body();
    }

    /**
     * Gets the private link resources supported for the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PrivateLinkResourceListResult> listByVaultAsync(String resourceGroupName, String vaultName, final ServiceCallback<PrivateLinkResourceListResult> serviceCallback) {
        return ServiceFuture.fromResponse(listByVaultWithServiceResponseAsync(resourceGroupName, vaultName), serviceCallback);
    }

    /**
     * Gets the private link resources supported for the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateLinkResourceListResult object
     */
    public Observable<PrivateLinkResourceListResult> listByVaultAsync(String resourceGroupName, String vaultName) {
        return listByVaultWithServiceResponseAsync(resourceGroupName, vaultName).map(new Func1<ServiceResponse<PrivateLinkResourceListResult>, PrivateLinkResourceListResult>() {
            @Override
            public PrivateLinkResourceListResult call(ServiceResponse<PrivateLinkResourceListResult> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the private link resources supported for the key vault.
     *
     * @param resourceGroupName Name of the resource group that contains the key vault.
     * @param vaultName The name of the key vault.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateLinkResourceListResult object
     */
    public Observable<ServiceResponse<PrivateLinkResourceListResult>> listByVaultWithServiceResponseAsync(String resourceGroupName, String vaultName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByVault(this.client.subscriptionId(), resourceGroupName, vaultName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PrivateLinkResourceListResult>>>() {
                @Override
                public Observable<ServiceResponse<PrivateLinkResourceListResult>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PrivateLinkResourceListResult> clientResponse = listByVaultDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PrivateLinkResourceListResult> listByVaultDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PrivateLinkResourceListResult, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PrivateLinkResourceListResult>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
