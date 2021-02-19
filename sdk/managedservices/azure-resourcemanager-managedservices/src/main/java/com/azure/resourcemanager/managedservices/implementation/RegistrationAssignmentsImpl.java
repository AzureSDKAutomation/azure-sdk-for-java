// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedservices.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managedservices.ManagedServicesManager;
import com.azure.resourcemanager.managedservices.fluent.RegistrationAssignmentsClient;
import com.azure.resourcemanager.managedservices.fluent.models.RegistrationAssignmentInner;
import com.azure.resourcemanager.managedservices.models.RegistrationAssignment;
import com.azure.resourcemanager.managedservices.models.RegistrationAssignments;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class RegistrationAssignmentsImpl implements RegistrationAssignments {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RegistrationAssignmentsImpl.class);

    private final RegistrationAssignmentsClient innerClient;

    private final ManagedServicesManager serviceManager;

    public RegistrationAssignmentsImpl(
        RegistrationAssignmentsClient innerClient, ManagedServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public RegistrationAssignment get(String scope, String registrationAssignmentId) {
        RegistrationAssignmentInner inner = this.serviceClient().get(scope, registrationAssignmentId);
        if (inner != null) {
            return new RegistrationAssignmentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RegistrationAssignment> getWithResponse(
        String scope, String registrationAssignmentId, Boolean expandRegistrationDefinition, Context context) {
        Response<RegistrationAssignmentInner> inner =
            this
                .serviceClient()
                .getWithResponse(scope, registrationAssignmentId, expandRegistrationDefinition, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RegistrationAssignmentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String scope, String registrationAssignmentId) {
        this.serviceClient().delete(scope, registrationAssignmentId);
    }

    public void delete(String scope, String registrationAssignmentId, Context context) {
        this.serviceClient().delete(scope, registrationAssignmentId, context);
    }

    public PagedIterable<RegistrationAssignment> list(String scope) {
        PagedIterable<RegistrationAssignmentInner> inner = this.serviceClient().list(scope);
        return Utils.mapPage(inner, inner1 -> new RegistrationAssignmentImpl(inner1, this.manager()));
    }

    public PagedIterable<RegistrationAssignment> list(
        String scope, Boolean expandRegistrationDefinition, Context context) {
        PagedIterable<RegistrationAssignmentInner> inner =
            this.serviceClient().list(scope, expandRegistrationDefinition, context);
        return Utils.mapPage(inner, inner1 -> new RegistrationAssignmentImpl(inner1, this.manager()));
    }

    public RegistrationAssignment getById(String id) {
        String scope =
            Utils
                .getValueFromIdByParameterName(
                    id,
                    "/{scope}/providers/Microsoft.ManagedServices/registrationAssignments/{registrationAssignmentId}",
                    "scope");
        if (scope == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String registrationAssignmentId =
            Utils
                .getValueFromIdByParameterName(
                    id,
                    "/{scope}/providers/Microsoft.ManagedServices/registrationAssignments/{registrationAssignmentId}",
                    "registrationAssignmentId");
        if (registrationAssignmentId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'registrationAssignments'.",
                                id)));
        }
        Boolean localExpandRegistrationDefinition = null;
        return this
            .getWithResponse(scope, registrationAssignmentId, localExpandRegistrationDefinition, Context.NONE)
            .getValue();
    }

    public Response<RegistrationAssignment> getByIdWithResponse(
        String id, Boolean expandRegistrationDefinition, Context context) {
        String scope =
            Utils
                .getValueFromIdByParameterName(
                    id,
                    "/{scope}/providers/Microsoft.ManagedServices/registrationAssignments/{registrationAssignmentId}",
                    "scope");
        if (scope == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String registrationAssignmentId =
            Utils
                .getValueFromIdByParameterName(
                    id,
                    "/{scope}/providers/Microsoft.ManagedServices/registrationAssignments/{registrationAssignmentId}",
                    "registrationAssignmentId");
        if (registrationAssignmentId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'registrationAssignments'.",
                                id)));
        }
        return this.getWithResponse(scope, registrationAssignmentId, expandRegistrationDefinition, context);
    }

    public void deleteById(String id) {
        String scope =
            Utils
                .getValueFromIdByParameterName(
                    id,
                    "/{scope}/providers/Microsoft.ManagedServices/registrationAssignments/{registrationAssignmentId}",
                    "scope");
        if (scope == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String registrationAssignmentId =
            Utils
                .getValueFromIdByParameterName(
                    id,
                    "/{scope}/providers/Microsoft.ManagedServices/registrationAssignments/{registrationAssignmentId}",
                    "registrationAssignmentId");
        if (registrationAssignmentId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'registrationAssignments'.",
                                id)));
        }
        this.delete(scope, registrationAssignmentId, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String scope =
            Utils
                .getValueFromIdByParameterName(
                    id,
                    "/{scope}/providers/Microsoft.ManagedServices/registrationAssignments/{registrationAssignmentId}",
                    "scope");
        if (scope == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String registrationAssignmentId =
            Utils
                .getValueFromIdByParameterName(
                    id,
                    "/{scope}/providers/Microsoft.ManagedServices/registrationAssignments/{registrationAssignmentId}",
                    "registrationAssignmentId");
        if (registrationAssignmentId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'registrationAssignments'.",
                                id)));
        }
        this.delete(scope, registrationAssignmentId, context);
    }

    private RegistrationAssignmentsClient serviceClient() {
        return this.innerClient;
    }

    private ManagedServicesManager manager() {
        return this.serviceManager;
    }

    public RegistrationAssignmentImpl define(String name) {
        return new RegistrationAssignmentImpl(name, this.manager());
    }
}
