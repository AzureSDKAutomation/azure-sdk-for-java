// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customproviders.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.customproviders.CustomprovidersManager;
import com.azure.resourcemanager.customproviders.fluent.AssociationsClient;
import com.azure.resourcemanager.customproviders.fluent.models.AssociationInner;
import com.azure.resourcemanager.customproviders.models.Association;
import com.azure.resourcemanager.customproviders.models.Associations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class AssociationsImpl implements Associations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AssociationsImpl.class);

    private final AssociationsClient innerClient;

    private final CustomprovidersManager serviceManager;

    public AssociationsImpl(AssociationsClient innerClient, CustomprovidersManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String scope, String associationName) {
        this.serviceClient().delete(scope, associationName);
    }

    public void delete(String scope, String associationName, Context context) {
        this.serviceClient().delete(scope, associationName, context);
    }

    public Association get(String scope, String associationName) {
        AssociationInner inner = this.serviceClient().get(scope, associationName);
        if (inner != null) {
            return new AssociationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Association> getWithResponse(String scope, String associationName, Context context) {
        Response<AssociationInner> inner = this.serviceClient().getWithResponse(scope, associationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AssociationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<Association> listAll(String scope) {
        PagedIterable<AssociationInner> inner = this.serviceClient().listAll(scope);
        return Utils.mapPage(inner, inner1 -> new AssociationImpl(inner1, this.manager()));
    }

    public PagedIterable<Association> listAll(String scope, Context context) {
        PagedIterable<AssociationInner> inner = this.serviceClient().listAll(scope, context);
        return Utils.mapPage(inner, inner1 -> new AssociationImpl(inner1, this.manager()));
    }

    public Association getById(String id) {
        String scope =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{scope}/providers/Microsoft.CustomProviders/associations/{associationName}", "scope");
        if (scope == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String associationName =
            Utils
                .getValueFromIdByParameterName(
                    id,
                    "/{scope}/providers/Microsoft.CustomProviders/associations/{associationName}",
                    "associationName");
        if (associationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'associations'.", id)));
        }
        return this.getWithResponse(scope, associationName, Context.NONE).getValue();
    }

    public Response<Association> getByIdWithResponse(String id, Context context) {
        String scope =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{scope}/providers/Microsoft.CustomProviders/associations/{associationName}", "scope");
        if (scope == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String associationName =
            Utils
                .getValueFromIdByParameterName(
                    id,
                    "/{scope}/providers/Microsoft.CustomProviders/associations/{associationName}",
                    "associationName");
        if (associationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'associations'.", id)));
        }
        return this.getWithResponse(scope, associationName, context);
    }

    public void deleteById(String id) {
        String scope =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{scope}/providers/Microsoft.CustomProviders/associations/{associationName}", "scope");
        if (scope == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String associationName =
            Utils
                .getValueFromIdByParameterName(
                    id,
                    "/{scope}/providers/Microsoft.CustomProviders/associations/{associationName}",
                    "associationName");
        if (associationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'associations'.", id)));
        }
        this.delete(scope, associationName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String scope =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{scope}/providers/Microsoft.CustomProviders/associations/{associationName}", "scope");
        if (scope == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String associationName =
            Utils
                .getValueFromIdByParameterName(
                    id,
                    "/{scope}/providers/Microsoft.CustomProviders/associations/{associationName}",
                    "associationName");
        if (associationName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'associations'.", id)));
        }
        this.delete(scope, associationName, context);
    }

    private AssociationsClient serviceClient() {
        return this.innerClient;
    }

    private CustomprovidersManager manager() {
        return this.serviceManager;
    }

    public AssociationImpl define(String name) {
        return new AssociationImpl(name, this.manager());
    }
}
