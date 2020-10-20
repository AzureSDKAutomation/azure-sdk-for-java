/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
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
 * in ProtectionPolicyOperationStatuses.
 */
public class ProtectionPolicyOperationStatusesInner {
    /** The Retrofit service to perform REST calls. */
    private ProtectionPolicyOperationStatusesService service;
    /** The service client containing this operation class. */
    private RecoveryServicesBackupClientImpl client;

    /**
     * Initializes an instance of ProtectionPolicyOperationStatusesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ProtectionPolicyOperationStatusesInner(Retrofit retrofit, RecoveryServicesBackupClientImpl client) {
        this.service = retrofit.create(ProtectionPolicyOperationStatusesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ProtectionPolicyOperationStatuses to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ProtectionPolicyOperationStatusesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.ProtectionPolicyOperationStatuses get" })
        @GET("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/backupPolicies/{policyName}/operations/{operationId}")
        Observable<Response<ResponseBody>> get(@Path("vaultName") String vaultName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Path("policyName") String policyName, @Path("operationId") String operationId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Provides the status of the asynchronous operations like backup, restore. The status can be in progress, completed
     or failed. You can refer to the Operation Status enum for all the possible states of an operation. Some operations
     create jobs. This method returns the list of jobs associated with operation.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy name whose operation's status needs to be fetched.
     * @param operationId Operation ID which represents an operation whose status needs to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationStatusInner object if successful.
     */
    public OperationStatusInner get(String vaultName, String resourceGroupName, String policyName, String operationId) {
        return getWithServiceResponseAsync(vaultName, resourceGroupName, policyName, operationId).toBlocking().single().body();
    }

    /**
     * Provides the status of the asynchronous operations like backup, restore. The status can be in progress, completed
     or failed. You can refer to the Operation Status enum for all the possible states of an operation. Some operations
     create jobs. This method returns the list of jobs associated with operation.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy name whose operation's status needs to be fetched.
     * @param operationId Operation ID which represents an operation whose status needs to be fetched.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<OperationStatusInner> getAsync(String vaultName, String resourceGroupName, String policyName, String operationId, final ServiceCallback<OperationStatusInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(vaultName, resourceGroupName, policyName, operationId), serviceCallback);
    }

    /**
     * Provides the status of the asynchronous operations like backup, restore. The status can be in progress, completed
     or failed. You can refer to the Operation Status enum for all the possible states of an operation. Some operations
     create jobs. This method returns the list of jobs associated with operation.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy name whose operation's status needs to be fetched.
     * @param operationId Operation ID which represents an operation whose status needs to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatusInner object
     */
    public Observable<OperationStatusInner> getAsync(String vaultName, String resourceGroupName, String policyName, String operationId) {
        return getWithServiceResponseAsync(vaultName, resourceGroupName, policyName, operationId).map(new Func1<ServiceResponse<OperationStatusInner>, OperationStatusInner>() {
            @Override
            public OperationStatusInner call(ServiceResponse<OperationStatusInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Provides the status of the asynchronous operations like backup, restore. The status can be in progress, completed
     or failed. You can refer to the Operation Status enum for all the possible states of an operation. Some operations
     create jobs. This method returns the list of jobs associated with operation.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy name whose operation's status needs to be fetched.
     * @param operationId Operation ID which represents an operation whose status needs to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatusInner object
     */
    public Observable<ServiceResponse<OperationStatusInner>> getWithServiceResponseAsync(String vaultName, String resourceGroupName, String policyName, String operationId) {
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (policyName == null) {
            throw new IllegalArgumentException("Parameter policyName is required and cannot be null.");
        }
        if (operationId == null) {
            throw new IllegalArgumentException("Parameter operationId is required and cannot be null.");
        }
        final String apiVersion = "2016-12-01";
        return service.get(vaultName, resourceGroupName, this.client.subscriptionId(), policyName, operationId, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<OperationStatusInner>>>() {
                @Override
                public Observable<ServiceResponse<OperationStatusInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<OperationStatusInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<OperationStatusInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<OperationStatusInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<OperationStatusInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
