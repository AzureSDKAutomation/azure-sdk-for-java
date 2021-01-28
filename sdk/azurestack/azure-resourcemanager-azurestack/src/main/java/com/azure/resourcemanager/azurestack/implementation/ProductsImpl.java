// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurestack.AzureStackManager;
import com.azure.resourcemanager.azurestack.fluent.ProductsClient;
import com.azure.resourcemanager.azurestack.fluent.models.ExtendedProductInner;
import com.azure.resourcemanager.azurestack.fluent.models.ProductInner;
import com.azure.resourcemanager.azurestack.fluent.models.ProductListInner;
import com.azure.resourcemanager.azurestack.fluent.models.ProductLogInner;
import com.azure.resourcemanager.azurestack.models.DeviceConfiguration;
import com.azure.resourcemanager.azurestack.models.ExtendedProduct;
import com.azure.resourcemanager.azurestack.models.MarketplaceProductLogUpdate;
import com.azure.resourcemanager.azurestack.models.Product;
import com.azure.resourcemanager.azurestack.models.ProductList;
import com.azure.resourcemanager.azurestack.models.ProductLog;
import com.azure.resourcemanager.azurestack.models.Products;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ProductsImpl implements Products {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProductsImpl.class);

    private final ProductsClient innerClient;

    private final AzureStackManager serviceManager;

    public ProductsImpl(ProductsClient innerClient, AzureStackManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Product> list(String resourceGroup, String registrationName) {
        PagedIterable<ProductInner> inner = this.serviceClient().list(resourceGroup, registrationName);
        return inner.mapPage(inner1 -> new ProductImpl(inner1, this.manager()));
    }

    public PagedIterable<Product> list(String resourceGroup, String registrationName, Context context) {
        PagedIterable<ProductInner> inner = this.serviceClient().list(resourceGroup, registrationName, context);
        return inner.mapPage(inner1 -> new ProductImpl(inner1, this.manager()));
    }

    public Product get(String resourceGroup, String registrationName, String productName) {
        ProductInner inner = this.serviceClient().get(resourceGroup, registrationName, productName);
        if (inner != null) {
            return new ProductImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Product> getWithResponse(
        String resourceGroup, String registrationName, String productName, Context context) {
        Response<ProductInner> inner =
            this.serviceClient().getWithResponse(resourceGroup, registrationName, productName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ProductImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ExtendedProduct listDetails(String resourceGroup, String registrationName, String productName) {
        ExtendedProductInner inner = this.serviceClient().listDetails(resourceGroup, registrationName, productName);
        if (inner != null) {
            return new ExtendedProductImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ExtendedProduct> listDetailsWithResponse(
        String resourceGroup, String registrationName, String productName, Context context) {
        Response<ExtendedProductInner> inner =
            this.serviceClient().listDetailsWithResponse(resourceGroup, registrationName, productName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ExtendedProductImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ProductList getProducts(String resourceGroup, String registrationName, String productName) {
        ProductListInner inner = this.serviceClient().getProducts(resourceGroup, registrationName, productName);
        if (inner != null) {
            return new ProductListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ProductList> getProductsWithResponse(
        String resourceGroup,
        String registrationName,
        String productName,
        DeviceConfiguration deviceConfiguration,
        Context context) {
        Response<ProductListInner> inner =
            this
                .serviceClient()
                .getProductsWithResponse(resourceGroup, registrationName, productName, deviceConfiguration, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ProductListImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Product getProduct(String resourceGroup, String registrationName, String productName) {
        ProductInner inner = this.serviceClient().getProduct(resourceGroup, registrationName, productName);
        if (inner != null) {
            return new ProductImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Product> getProductWithResponse(
        String resourceGroup,
        String registrationName,
        String productName,
        DeviceConfiguration deviceConfiguration,
        Context context) {
        Response<ProductInner> inner =
            this
                .serviceClient()
                .getProductWithResponse(resourceGroup, registrationName, productName, deviceConfiguration, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ProductImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ProductLog uploadLog(String resourceGroup, String registrationName, String productName) {
        ProductLogInner inner = this.serviceClient().uploadLog(resourceGroup, registrationName, productName);
        if (inner != null) {
            return new ProductLogImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ProductLog> uploadLogWithResponse(
        String resourceGroup,
        String registrationName,
        String productName,
        MarketplaceProductLogUpdate marketplaceProductLogUpdate,
        Context context) {
        Response<ProductLogInner> inner =
            this
                .serviceClient()
                .uploadLogWithResponse(
                    resourceGroup, registrationName, productName, marketplaceProductLogUpdate, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ProductLogImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ProductsClient serviceClient() {
        return this.innerClient;
    }

    private AzureStackManager manager() {
        return this.serviceManager;
    }
}
