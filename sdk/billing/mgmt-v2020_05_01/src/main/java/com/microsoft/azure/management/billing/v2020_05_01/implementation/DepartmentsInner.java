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
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.billing.v2020_05_01.ErrorResponseException;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
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
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Departments.
 */
public class DepartmentsInner {
    /** The Retrofit service to perform REST calls. */
    private DepartmentsService service;
    /** The service client containing this operation class. */
    private BillingManagementClientImpl client;

    /**
     * Initializes an instance of DepartmentsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public DepartmentsInner(Retrofit retrofit, BillingManagementClientImpl client) {
        this.service = retrofit.create(DepartmentsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Departments to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DepartmentsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2020_05_01.Departments listByBillingAccountName" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/departments")
        Observable<Response<ResponseBody>> listByBillingAccountName(@Path("billingAccountName") String billingAccountName, @Query("api-version") String apiVersion, @Query("$expand") String expand, @Query("$filter") String filter, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2020_05_01.Departments get" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/departments/{departmentName}")
        Observable<Response<ResponseBody>> get(@Path("billingAccountName") String billingAccountName, @Path("departmentName") String departmentName, @Query("api-version") String apiVersion, @Query("$expand") String expand, @Query("$filter") String filter, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2020_05_01.Departments listByBillingAccountNameNext" })
        @GET
        Observable<Response<ResponseBody>> listByBillingAccountNameNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists the departments that a user has access to. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;DepartmentInner&gt; object if successful.
     */
    public PagedList<DepartmentInner> listByBillingAccountName(final String billingAccountName) {
        ServiceResponse<Page<DepartmentInner>> response = listByBillingAccountNameSinglePageAsync(billingAccountName).toBlocking().single();
        return new PagedList<DepartmentInner>(response.body()) {
            @Override
            public Page<DepartmentInner> nextPage(String nextPageLink) {
                return listByBillingAccountNameNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists the departments that a user has access to. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<DepartmentInner>> listByBillingAccountNameAsync(final String billingAccountName, final ListOperationCallback<DepartmentInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByBillingAccountNameSinglePageAsync(billingAccountName),
            new Func1<String, Observable<ServiceResponse<Page<DepartmentInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DepartmentInner>>> call(String nextPageLink) {
                    return listByBillingAccountNameNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists the departments that a user has access to. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;DepartmentInner&gt; object
     */
    public Observable<Page<DepartmentInner>> listByBillingAccountNameAsync(final String billingAccountName) {
        return listByBillingAccountNameWithServiceResponseAsync(billingAccountName)
            .map(new Func1<ServiceResponse<Page<DepartmentInner>>, Page<DepartmentInner>>() {
                @Override
                public Page<DepartmentInner> call(ServiceResponse<Page<DepartmentInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists the departments that a user has access to. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;DepartmentInner&gt; object
     */
    public Observable<ServiceResponse<Page<DepartmentInner>>> listByBillingAccountNameWithServiceResponseAsync(final String billingAccountName) {
        return listByBillingAccountNameSinglePageAsync(billingAccountName)
            .concatMap(new Func1<ServiceResponse<Page<DepartmentInner>>, Observable<ServiceResponse<Page<DepartmentInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DepartmentInner>>> call(ServiceResponse<Page<DepartmentInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByBillingAccountNameNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists the departments that a user has access to. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;DepartmentInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<DepartmentInner>>> listByBillingAccountNameSinglePageAsync(final String billingAccountName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String expand = null;
        final String filter = null;
        return service.listByBillingAccountName(billingAccountName, this.client.apiVersion(), expand, filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<DepartmentInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DepartmentInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<DepartmentInner>> result = listByBillingAccountNameDelegate(response);
                        return Observable.just(new ServiceResponse<Page<DepartmentInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Lists the departments that a user has access to. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param expand May be used to expand the enrollment accounts.
     * @param filter May be used to filter by department name. The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value are separated by a colon (:).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;DepartmentInner&gt; object if successful.
     */
    public PagedList<DepartmentInner> listByBillingAccountName(final String billingAccountName, final String expand, final String filter) {
        ServiceResponse<Page<DepartmentInner>> response = listByBillingAccountNameSinglePageAsync(billingAccountName, expand, filter).toBlocking().single();
        return new PagedList<DepartmentInner>(response.body()) {
            @Override
            public Page<DepartmentInner> nextPage(String nextPageLink) {
                return listByBillingAccountNameNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists the departments that a user has access to. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param expand May be used to expand the enrollment accounts.
     * @param filter May be used to filter by department name. The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value are separated by a colon (:).
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<DepartmentInner>> listByBillingAccountNameAsync(final String billingAccountName, final String expand, final String filter, final ListOperationCallback<DepartmentInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByBillingAccountNameSinglePageAsync(billingAccountName, expand, filter),
            new Func1<String, Observable<ServiceResponse<Page<DepartmentInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DepartmentInner>>> call(String nextPageLink) {
                    return listByBillingAccountNameNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists the departments that a user has access to. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param expand May be used to expand the enrollment accounts.
     * @param filter May be used to filter by department name. The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value are separated by a colon (:).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;DepartmentInner&gt; object
     */
    public Observable<Page<DepartmentInner>> listByBillingAccountNameAsync(final String billingAccountName, final String expand, final String filter) {
        return listByBillingAccountNameWithServiceResponseAsync(billingAccountName, expand, filter)
            .map(new Func1<ServiceResponse<Page<DepartmentInner>>, Page<DepartmentInner>>() {
                @Override
                public Page<DepartmentInner> call(ServiceResponse<Page<DepartmentInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists the departments that a user has access to. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param expand May be used to expand the enrollment accounts.
     * @param filter May be used to filter by department name. The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value are separated by a colon (:).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;DepartmentInner&gt; object
     */
    public Observable<ServiceResponse<Page<DepartmentInner>>> listByBillingAccountNameWithServiceResponseAsync(final String billingAccountName, final String expand, final String filter) {
        return listByBillingAccountNameSinglePageAsync(billingAccountName, expand, filter)
            .concatMap(new Func1<ServiceResponse<Page<DepartmentInner>>, Observable<ServiceResponse<Page<DepartmentInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DepartmentInner>>> call(ServiceResponse<Page<DepartmentInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByBillingAccountNameNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists the departments that a user has access to. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
    ServiceResponse<PageImpl<DepartmentInner>> * @param billingAccountName The ID that uniquely identifies a billing account.
    ServiceResponse<PageImpl<DepartmentInner>> * @param expand May be used to expand the enrollment accounts.
    ServiceResponse<PageImpl<DepartmentInner>> * @param filter May be used to filter by department name. The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value are separated by a colon (:).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;DepartmentInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<DepartmentInner>>> listByBillingAccountNameSinglePageAsync(final String billingAccountName, final String expand, final String filter) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByBillingAccountName(billingAccountName, this.client.apiVersion(), expand, filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<DepartmentInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DepartmentInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<DepartmentInner>> result = listByBillingAccountNameDelegate(response);
                        return Observable.just(new ServiceResponse<Page<DepartmentInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<DepartmentInner>> listByBillingAccountNameDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<DepartmentInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<DepartmentInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets a department by ID. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param departmentName The ID that uniquely identifies a department.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DepartmentInner object if successful.
     */
    public DepartmentInner get(String billingAccountName, String departmentName) {
        return getWithServiceResponseAsync(billingAccountName, departmentName).toBlocking().single().body();
    }

    /**
     * Gets a department by ID. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param departmentName The ID that uniquely identifies a department.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DepartmentInner> getAsync(String billingAccountName, String departmentName, final ServiceCallback<DepartmentInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(billingAccountName, departmentName), serviceCallback);
    }

    /**
     * Gets a department by ID. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param departmentName The ID that uniquely identifies a department.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DepartmentInner object
     */
    public Observable<DepartmentInner> getAsync(String billingAccountName, String departmentName) {
        return getWithServiceResponseAsync(billingAccountName, departmentName).map(new Func1<ServiceResponse<DepartmentInner>, DepartmentInner>() {
            @Override
            public DepartmentInner call(ServiceResponse<DepartmentInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a department by ID. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param departmentName The ID that uniquely identifies a department.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DepartmentInner object
     */
    public Observable<ServiceResponse<DepartmentInner>> getWithServiceResponseAsync(String billingAccountName, String departmentName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (departmentName == null) {
            throw new IllegalArgumentException("Parameter departmentName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String expand = null;
        final String filter = null;
        return service.get(billingAccountName, departmentName, this.client.apiVersion(), expand, filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DepartmentInner>>>() {
                @Override
                public Observable<ServiceResponse<DepartmentInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DepartmentInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets a department by ID. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param departmentName The ID that uniquely identifies a department.
     * @param expand May be used to expand the enrollment accounts.
     * @param filter May be used to filter by department name. The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value are separated by a colon (:).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DepartmentInner object if successful.
     */
    public DepartmentInner get(String billingAccountName, String departmentName, String expand, String filter) {
        return getWithServiceResponseAsync(billingAccountName, departmentName, expand, filter).toBlocking().single().body();
    }

    /**
     * Gets a department by ID. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param departmentName The ID that uniquely identifies a department.
     * @param expand May be used to expand the enrollment accounts.
     * @param filter May be used to filter by department name. The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value are separated by a colon (:).
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DepartmentInner> getAsync(String billingAccountName, String departmentName, String expand, String filter, final ServiceCallback<DepartmentInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(billingAccountName, departmentName, expand, filter), serviceCallback);
    }

    /**
     * Gets a department by ID. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param departmentName The ID that uniquely identifies a department.
     * @param expand May be used to expand the enrollment accounts.
     * @param filter May be used to filter by department name. The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value are separated by a colon (:).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DepartmentInner object
     */
    public Observable<DepartmentInner> getAsync(String billingAccountName, String departmentName, String expand, String filter) {
        return getWithServiceResponseAsync(billingAccountName, departmentName, expand, filter).map(new Func1<ServiceResponse<DepartmentInner>, DepartmentInner>() {
            @Override
            public DepartmentInner call(ServiceResponse<DepartmentInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a department by ID. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param departmentName The ID that uniquely identifies a department.
     * @param expand May be used to expand the enrollment accounts.
     * @param filter May be used to filter by department name. The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value are separated by a colon (:).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DepartmentInner object
     */
    public Observable<ServiceResponse<DepartmentInner>> getWithServiceResponseAsync(String billingAccountName, String departmentName, String expand, String filter) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (departmentName == null) {
            throw new IllegalArgumentException("Parameter departmentName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(billingAccountName, departmentName, this.client.apiVersion(), expand, filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DepartmentInner>>>() {
                @Override
                public Observable<ServiceResponse<DepartmentInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DepartmentInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DepartmentInner> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<DepartmentInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DepartmentInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Lists the departments that a user has access to. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;DepartmentInner&gt; object if successful.
     */
    public PagedList<DepartmentInner> listByBillingAccountNameNext(final String nextPageLink) {
        ServiceResponse<Page<DepartmentInner>> response = listByBillingAccountNameNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<DepartmentInner>(response.body()) {
            @Override
            public Page<DepartmentInner> nextPage(String nextPageLink) {
                return listByBillingAccountNameNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists the departments that a user has access to. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<DepartmentInner>> listByBillingAccountNameNextAsync(final String nextPageLink, final ServiceFuture<List<DepartmentInner>> serviceFuture, final ListOperationCallback<DepartmentInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByBillingAccountNameNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<DepartmentInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DepartmentInner>>> call(String nextPageLink) {
                    return listByBillingAccountNameNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists the departments that a user has access to. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;DepartmentInner&gt; object
     */
    public Observable<Page<DepartmentInner>> listByBillingAccountNameNextAsync(final String nextPageLink) {
        return listByBillingAccountNameNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<DepartmentInner>>, Page<DepartmentInner>>() {
                @Override
                public Page<DepartmentInner> call(ServiceResponse<Page<DepartmentInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists the departments that a user has access to. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;DepartmentInner&gt; object
     */
    public Observable<ServiceResponse<Page<DepartmentInner>>> listByBillingAccountNameNextWithServiceResponseAsync(final String nextPageLink) {
        return listByBillingAccountNameNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<DepartmentInner>>, Observable<ServiceResponse<Page<DepartmentInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DepartmentInner>>> call(ServiceResponse<Page<DepartmentInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByBillingAccountNameNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists the departments that a user has access to. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
    ServiceResponse<PageImpl<DepartmentInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;DepartmentInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<DepartmentInner>>> listByBillingAccountNameNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByBillingAccountNameNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<DepartmentInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DepartmentInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<DepartmentInner>> result = listByBillingAccountNameNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<DepartmentInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<DepartmentInner>> listByBillingAccountNameNextDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<DepartmentInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<DepartmentInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
