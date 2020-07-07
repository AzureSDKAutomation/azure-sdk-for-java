/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2020_05_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.billing.v2020_05_01.ErrorResponseException;
import com.microsoft.azure.management.billing.v2020_05_01.ViewCharges;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Policies.
 */
public class PoliciesInner {
    /** The Retrofit service to perform REST calls. */
    private PoliciesService service;
    /** The service client containing this operation class. */
    private BillingManagementClientImpl client;

    /**
     * Initializes an instance of PoliciesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PoliciesInner(Retrofit retrofit, BillingManagementClientImpl client) {
        this.service = retrofit.create(PoliciesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Policies to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PoliciesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2020_05_01.Policies getByBillingProfile" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/billingProfiles/{billingProfileName}/policies/default")
        Observable<Response<ResponseBody>> getByBillingProfile(@Path("billingAccountName") String billingAccountName, @Path("billingProfileName") String billingProfileName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2020_05_01.Policies update" })
        @PUT("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/billingProfiles/{billingProfileName}/policies/default")
        Observable<Response<ResponseBody>> update(@Path("billingAccountName") String billingAccountName, @Path("billingProfileName") String billingProfileName, @Query("api-version") String apiVersion, @Body PolicyInner parameters, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2020_05_01.Policies getByCustomer" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/customers/{customerName}/policies/default")
        Observable<Response<ResponseBody>> getByCustomer(@Path("billingAccountName") String billingAccountName, @Path("customerName") String customerName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2020_05_01.Policies updateCustomer" })
        @PUT("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/customers/{customerName}/policies/default")
        Observable<Response<ResponseBody>> updateCustomer(@Path("billingAccountName") String billingAccountName, @Path("customerName") String customerName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body CustomerPolicyInner parameters, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists the policies for a billing profile. This operation is supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PolicyInner object if successful.
     */
    public PolicyInner getByBillingProfile(String billingAccountName, String billingProfileName) {
        return getByBillingProfileWithServiceResponseAsync(billingAccountName, billingProfileName).toBlocking().single().body();
    }

    /**
     * Lists the policies for a billing profile. This operation is supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PolicyInner> getByBillingProfileAsync(String billingAccountName, String billingProfileName, final ServiceCallback<PolicyInner> serviceCallback) {
        return ServiceFuture.fromResponse(getByBillingProfileWithServiceResponseAsync(billingAccountName, billingProfileName), serviceCallback);
    }

    /**
     * Lists the policies for a billing profile. This operation is supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PolicyInner object
     */
    public Observable<PolicyInner> getByBillingProfileAsync(String billingAccountName, String billingProfileName) {
        return getByBillingProfileWithServiceResponseAsync(billingAccountName, billingProfileName).map(new Func1<ServiceResponse<PolicyInner>, PolicyInner>() {
            @Override
            public PolicyInner call(ServiceResponse<PolicyInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists the policies for a billing profile. This operation is supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PolicyInner object
     */
    public Observable<ServiceResponse<PolicyInner>> getByBillingProfileWithServiceResponseAsync(String billingAccountName, String billingProfileName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (billingProfileName == null) {
            throw new IllegalArgumentException("Parameter billingProfileName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getByBillingProfile(billingAccountName, billingProfileName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PolicyInner>>>() {
                @Override
                public Observable<ServiceResponse<PolicyInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PolicyInner> clientResponse = getByBillingProfileDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PolicyInner> getByBillingProfileDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PolicyInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PolicyInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Updates the policies for a billing profile. This operation is supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param parameters Request parameters that are provided to the update policies operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PolicyInner object if successful.
     */
    public PolicyInner update(String billingAccountName, String billingProfileName, PolicyInner parameters) {
        return updateWithServiceResponseAsync(billingAccountName, billingProfileName, parameters).toBlocking().single().body();
    }

    /**
     * Updates the policies for a billing profile. This operation is supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param parameters Request parameters that are provided to the update policies operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PolicyInner> updateAsync(String billingAccountName, String billingProfileName, PolicyInner parameters, final ServiceCallback<PolicyInner> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(billingAccountName, billingProfileName, parameters), serviceCallback);
    }

    /**
     * Updates the policies for a billing profile. This operation is supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param parameters Request parameters that are provided to the update policies operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PolicyInner object
     */
    public Observable<PolicyInner> updateAsync(String billingAccountName, String billingProfileName, PolicyInner parameters) {
        return updateWithServiceResponseAsync(billingAccountName, billingProfileName, parameters).map(new Func1<ServiceResponse<PolicyInner>, PolicyInner>() {
            @Override
            public PolicyInner call(ServiceResponse<PolicyInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Updates the policies for a billing profile. This operation is supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param parameters Request parameters that are provided to the update policies operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PolicyInner object
     */
    public Observable<ServiceResponse<PolicyInner>> updateWithServiceResponseAsync(String billingAccountName, String billingProfileName, PolicyInner parameters) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (billingProfileName == null) {
            throw new IllegalArgumentException("Parameter billingProfileName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.update(billingAccountName, billingProfileName, this.client.apiVersion(), parameters, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PolicyInner>>>() {
                @Override
                public Observable<ServiceResponse<PolicyInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PolicyInner> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PolicyInner> updateDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PolicyInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PolicyInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Lists the policies for a customer. This operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the CustomerPolicyInner object if successful.
     */
    public CustomerPolicyInner getByCustomer(String billingAccountName, String customerName) {
        return getByCustomerWithServiceResponseAsync(billingAccountName, customerName).toBlocking().single().body();
    }

    /**
     * Lists the policies for a customer. This operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<CustomerPolicyInner> getByCustomerAsync(String billingAccountName, String customerName, final ServiceCallback<CustomerPolicyInner> serviceCallback) {
        return ServiceFuture.fromResponse(getByCustomerWithServiceResponseAsync(billingAccountName, customerName), serviceCallback);
    }

    /**
     * Lists the policies for a customer. This operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CustomerPolicyInner object
     */
    public Observable<CustomerPolicyInner> getByCustomerAsync(String billingAccountName, String customerName) {
        return getByCustomerWithServiceResponseAsync(billingAccountName, customerName).map(new Func1<ServiceResponse<CustomerPolicyInner>, CustomerPolicyInner>() {
            @Override
            public CustomerPolicyInner call(ServiceResponse<CustomerPolicyInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists the policies for a customer. This operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CustomerPolicyInner object
     */
    public Observable<ServiceResponse<CustomerPolicyInner>> getByCustomerWithServiceResponseAsync(String billingAccountName, String customerName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (customerName == null) {
            throw new IllegalArgumentException("Parameter customerName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getByCustomer(billingAccountName, customerName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<CustomerPolicyInner>>>() {
                @Override
                public Observable<ServiceResponse<CustomerPolicyInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<CustomerPolicyInner> clientResponse = getByCustomerDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<CustomerPolicyInner> getByCustomerDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<CustomerPolicyInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<CustomerPolicyInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Updates the policies for a customer. This operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the CustomerPolicyInner object if successful.
     */
    public CustomerPolicyInner updateCustomer(String billingAccountName, String customerName) {
        return updateCustomerWithServiceResponseAsync(billingAccountName, customerName).toBlocking().single().body();
    }

    /**
     * Updates the policies for a customer. This operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<CustomerPolicyInner> updateCustomerAsync(String billingAccountName, String customerName, final ServiceCallback<CustomerPolicyInner> serviceCallback) {
        return ServiceFuture.fromResponse(updateCustomerWithServiceResponseAsync(billingAccountName, customerName), serviceCallback);
    }

    /**
     * Updates the policies for a customer. This operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CustomerPolicyInner object
     */
    public Observable<CustomerPolicyInner> updateCustomerAsync(String billingAccountName, String customerName) {
        return updateCustomerWithServiceResponseAsync(billingAccountName, customerName).map(new Func1<ServiceResponse<CustomerPolicyInner>, CustomerPolicyInner>() {
            @Override
            public CustomerPolicyInner call(ServiceResponse<CustomerPolicyInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Updates the policies for a customer. This operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CustomerPolicyInner object
     */
    public Observable<ServiceResponse<CustomerPolicyInner>> updateCustomerWithServiceResponseAsync(String billingAccountName, String customerName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (customerName == null) {
            throw new IllegalArgumentException("Parameter customerName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final ViewCharges viewCharges = null;
        CustomerPolicyInner parameters = new CustomerPolicyInner();
        parameters.withViewCharges(null);
        return service.updateCustomer(billingAccountName, customerName, this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<CustomerPolicyInner>>>() {
                @Override
                public Observable<ServiceResponse<CustomerPolicyInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<CustomerPolicyInner> clientResponse = updateCustomerDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Updates the policies for a customer. This operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @param viewCharges The policy that controls whether the users in customer's organization can view charges at pay-as-you-go prices. Possible values include: 'Allowed', 'NotAllowed'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the CustomerPolicyInner object if successful.
     */
    public CustomerPolicyInner updateCustomer(String billingAccountName, String customerName, ViewCharges viewCharges) {
        return updateCustomerWithServiceResponseAsync(billingAccountName, customerName, viewCharges).toBlocking().single().body();
    }

    /**
     * Updates the policies for a customer. This operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @param viewCharges The policy that controls whether the users in customer's organization can view charges at pay-as-you-go prices. Possible values include: 'Allowed', 'NotAllowed'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<CustomerPolicyInner> updateCustomerAsync(String billingAccountName, String customerName, ViewCharges viewCharges, final ServiceCallback<CustomerPolicyInner> serviceCallback) {
        return ServiceFuture.fromResponse(updateCustomerWithServiceResponseAsync(billingAccountName, customerName, viewCharges), serviceCallback);
    }

    /**
     * Updates the policies for a customer. This operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @param viewCharges The policy that controls whether the users in customer's organization can view charges at pay-as-you-go prices. Possible values include: 'Allowed', 'NotAllowed'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CustomerPolicyInner object
     */
    public Observable<CustomerPolicyInner> updateCustomerAsync(String billingAccountName, String customerName, ViewCharges viewCharges) {
        return updateCustomerWithServiceResponseAsync(billingAccountName, customerName, viewCharges).map(new Func1<ServiceResponse<CustomerPolicyInner>, CustomerPolicyInner>() {
            @Override
            public CustomerPolicyInner call(ServiceResponse<CustomerPolicyInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Updates the policies for a customer. This operation is supported only for billing accounts with agreement type Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @param viewCharges The policy that controls whether the users in customer's organization can view charges at pay-as-you-go prices. Possible values include: 'Allowed', 'NotAllowed'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CustomerPolicyInner object
     */
    public Observable<ServiceResponse<CustomerPolicyInner>> updateCustomerWithServiceResponseAsync(String billingAccountName, String customerName, ViewCharges viewCharges) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (customerName == null) {
            throw new IllegalArgumentException("Parameter customerName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        CustomerPolicyInner parameters = new CustomerPolicyInner();
        parameters.withViewCharges(viewCharges);
        return service.updateCustomer(billingAccountName, customerName, this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<CustomerPolicyInner>>>() {
                @Override
                public Observable<ServiceResponse<CustomerPolicyInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<CustomerPolicyInner> clientResponse = updateCustomerDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<CustomerPolicyInner> updateCustomerDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<CustomerPolicyInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<CustomerPolicyInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
