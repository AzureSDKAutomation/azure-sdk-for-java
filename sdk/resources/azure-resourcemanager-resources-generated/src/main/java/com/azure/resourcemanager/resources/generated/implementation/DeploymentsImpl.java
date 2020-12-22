// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.resources.generated.ResourceManager;
import com.azure.resourcemanager.resources.generated.fluent.DeploymentsClient;
import com.azure.resourcemanager.resources.generated.fluent.models.DeploymentExportResultInner;
import com.azure.resourcemanager.resources.generated.fluent.models.DeploymentExtendedInner;
import com.azure.resourcemanager.resources.generated.fluent.models.DeploymentValidateResultInner;
import com.azure.resourcemanager.resources.generated.fluent.models.TemplateHashResultInner;
import com.azure.resourcemanager.resources.generated.fluent.models.WhatIfOperationResultInner;
import com.azure.resourcemanager.resources.generated.models.Deployment;
import com.azure.resourcemanager.resources.generated.models.DeploymentExportResult;
import com.azure.resourcemanager.resources.generated.models.DeploymentExtended;
import com.azure.resourcemanager.resources.generated.models.DeploymentValidateResult;
import com.azure.resourcemanager.resources.generated.models.DeploymentWhatIf;
import com.azure.resourcemanager.resources.generated.models.Deployments;
import com.azure.resourcemanager.resources.generated.models.ScopedDeployment;
import com.azure.resourcemanager.resources.generated.models.ScopedDeploymentWhatIf;
import com.azure.resourcemanager.resources.generated.models.TemplateHashResult;
import com.azure.resourcemanager.resources.generated.models.WhatIfOperationResult;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DeploymentsImpl implements Deployments {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeploymentsImpl.class);

    private final DeploymentsClient innerClient;

    private final ResourceManager serviceManager;

    public DeploymentsImpl(DeploymentsClient innerClient, ResourceManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteAtScope(String scope, String deploymentName) {
        this.serviceClient().deleteAtScope(scope, deploymentName);
    }

    public void deleteAtScope(String scope, String deploymentName, Context context) {
        this.serviceClient().deleteAtScope(scope, deploymentName, context);
    }

    public boolean checkExistenceAtScope(String scope, String deploymentName) {
        return this.serviceClient().checkExistenceAtScope(scope, deploymentName);
    }

    public Response<Boolean> checkExistenceAtScopeWithResponse(String scope, String deploymentName, Context context) {
        return this.serviceClient().checkExistenceAtScopeWithResponse(scope, deploymentName, context);
    }

    public DeploymentExtended createOrUpdateAtScope(String scope, String deploymentName, Deployment parameters) {
        DeploymentExtendedInner inner = this.serviceClient().createOrUpdateAtScope(scope, deploymentName, parameters);
        if (inner != null) {
            return new DeploymentExtendedImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DeploymentExtended createOrUpdateAtScope(
        String scope, String deploymentName, Deployment parameters, Context context) {
        DeploymentExtendedInner inner =
            this.serviceClient().createOrUpdateAtScope(scope, deploymentName, parameters, context);
        if (inner != null) {
            return new DeploymentExtendedImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DeploymentExtended getAtScope(String scope, String deploymentName) {
        DeploymentExtendedInner inner = this.serviceClient().getAtScope(scope, deploymentName);
        if (inner != null) {
            return new DeploymentExtendedImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DeploymentExtended> getAtScopeWithResponse(String scope, String deploymentName, Context context) {
        Response<DeploymentExtendedInner> inner =
            this.serviceClient().getAtScopeWithResponse(scope, deploymentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DeploymentExtendedImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void cancelAtScope(String scope, String deploymentName) {
        this.serviceClient().cancelAtScope(scope, deploymentName);
    }

    public Response<Void> cancelAtScopeWithResponse(String scope, String deploymentName, Context context) {
        return this.serviceClient().cancelAtScopeWithResponse(scope, deploymentName, context);
    }

    public DeploymentValidateResult validateAtScope(String scope, String deploymentName, Deployment parameters) {
        DeploymentValidateResultInner inner = this.serviceClient().validateAtScope(scope, deploymentName, parameters);
        if (inner != null) {
            return new DeploymentValidateResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DeploymentValidateResult validateAtScope(
        String scope, String deploymentName, Deployment parameters, Context context) {
        DeploymentValidateResultInner inner =
            this.serviceClient().validateAtScope(scope, deploymentName, parameters, context);
        if (inner != null) {
            return new DeploymentValidateResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DeploymentExportResult exportTemplateAtScope(String scope, String deploymentName) {
        DeploymentExportResultInner inner = this.serviceClient().exportTemplateAtScope(scope, deploymentName);
        if (inner != null) {
            return new DeploymentExportResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DeploymentExportResult> exportTemplateAtScopeWithResponse(
        String scope, String deploymentName, Context context) {
        Response<DeploymentExportResultInner> inner =
            this.serviceClient().exportTemplateAtScopeWithResponse(scope, deploymentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DeploymentExportResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<DeploymentExtended> listAtScope(String scope) {
        PagedIterable<DeploymentExtendedInner> inner = this.serviceClient().listAtScope(scope);
        return inner.mapPage(inner1 -> new DeploymentExtendedImpl(inner1, this.manager()));
    }

    public PagedIterable<DeploymentExtended> listAtScope(String scope, String filter, Integer top, Context context) {
        PagedIterable<DeploymentExtendedInner> inner = this.serviceClient().listAtScope(scope, filter, top, context);
        return inner.mapPage(inner1 -> new DeploymentExtendedImpl(inner1, this.manager()));
    }

    public void deleteAtTenantScope(String deploymentName) {
        this.serviceClient().deleteAtTenantScope(deploymentName);
    }

    public void deleteAtTenantScope(String deploymentName, Context context) {
        this.serviceClient().deleteAtTenantScope(deploymentName, context);
    }

    public boolean checkExistenceAtTenantScope(String deploymentName) {
        return this.serviceClient().checkExistenceAtTenantScope(deploymentName);
    }

    public Response<Boolean> checkExistenceAtTenantScopeWithResponse(String deploymentName, Context context) {
        return this.serviceClient().checkExistenceAtTenantScopeWithResponse(deploymentName, context);
    }

    public DeploymentExtended createOrUpdateAtTenantScope(String deploymentName, ScopedDeployment parameters) {
        DeploymentExtendedInner inner = this.serviceClient().createOrUpdateAtTenantScope(deploymentName, parameters);
        if (inner != null) {
            return new DeploymentExtendedImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DeploymentExtended createOrUpdateAtTenantScope(
        String deploymentName, ScopedDeployment parameters, Context context) {
        DeploymentExtendedInner inner =
            this.serviceClient().createOrUpdateAtTenantScope(deploymentName, parameters, context);
        if (inner != null) {
            return new DeploymentExtendedImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DeploymentExtended getAtTenantScope(String deploymentName) {
        DeploymentExtendedInner inner = this.serviceClient().getAtTenantScope(deploymentName);
        if (inner != null) {
            return new DeploymentExtendedImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DeploymentExtended> getAtTenantScopeWithResponse(String deploymentName, Context context) {
        Response<DeploymentExtendedInner> inner =
            this.serviceClient().getAtTenantScopeWithResponse(deploymentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DeploymentExtendedImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void cancelAtTenantScope(String deploymentName) {
        this.serviceClient().cancelAtTenantScope(deploymentName);
    }

    public Response<Void> cancelAtTenantScopeWithResponse(String deploymentName, Context context) {
        return this.serviceClient().cancelAtTenantScopeWithResponse(deploymentName, context);
    }

    public DeploymentValidateResult validateAtTenantScope(String deploymentName, ScopedDeployment parameters) {
        DeploymentValidateResultInner inner = this.serviceClient().validateAtTenantScope(deploymentName, parameters);
        if (inner != null) {
            return new DeploymentValidateResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DeploymentValidateResult validateAtTenantScope(
        String deploymentName, ScopedDeployment parameters, Context context) {
        DeploymentValidateResultInner inner =
            this.serviceClient().validateAtTenantScope(deploymentName, parameters, context);
        if (inner != null) {
            return new DeploymentValidateResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public WhatIfOperationResult whatIfAtTenantScope(String deploymentName, ScopedDeploymentWhatIf parameters) {
        WhatIfOperationResultInner inner = this.serviceClient().whatIfAtTenantScope(deploymentName, parameters);
        if (inner != null) {
            return new WhatIfOperationResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public WhatIfOperationResult whatIfAtTenantScope(
        String deploymentName, ScopedDeploymentWhatIf parameters, Context context) {
        WhatIfOperationResultInner inner =
            this.serviceClient().whatIfAtTenantScope(deploymentName, parameters, context);
        if (inner != null) {
            return new WhatIfOperationResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DeploymentExportResult exportTemplateAtTenantScope(String deploymentName) {
        DeploymentExportResultInner inner = this.serviceClient().exportTemplateAtTenantScope(deploymentName);
        if (inner != null) {
            return new DeploymentExportResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DeploymentExportResult> exportTemplateAtTenantScopeWithResponse(
        String deploymentName, Context context) {
        Response<DeploymentExportResultInner> inner =
            this.serviceClient().exportTemplateAtTenantScopeWithResponse(deploymentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DeploymentExportResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<DeploymentExtended> listAtTenantScope() {
        PagedIterable<DeploymentExtendedInner> inner = this.serviceClient().listAtTenantScope();
        return inner.mapPage(inner1 -> new DeploymentExtendedImpl(inner1, this.manager()));
    }

    public PagedIterable<DeploymentExtended> listAtTenantScope(String filter, Integer top, Context context) {
        PagedIterable<DeploymentExtendedInner> inner = this.serviceClient().listAtTenantScope(filter, top, context);
        return inner.mapPage(inner1 -> new DeploymentExtendedImpl(inner1, this.manager()));
    }

    public void deleteAtManagementGroupScope(String groupId, String deploymentName) {
        this.serviceClient().deleteAtManagementGroupScope(groupId, deploymentName);
    }

    public void deleteAtManagementGroupScope(String groupId, String deploymentName, Context context) {
        this.serviceClient().deleteAtManagementGroupScope(groupId, deploymentName, context);
    }

    public boolean checkExistenceAtManagementGroupScope(String groupId, String deploymentName) {
        return this.serviceClient().checkExistenceAtManagementGroupScope(groupId, deploymentName);
    }

    public Response<Boolean> checkExistenceAtManagementGroupScopeWithResponse(
        String groupId, String deploymentName, Context context) {
        return this.serviceClient().checkExistenceAtManagementGroupScopeWithResponse(groupId, deploymentName, context);
    }

    public DeploymentExtended createOrUpdateAtManagementGroupScope(
        String groupId, String deploymentName, ScopedDeployment parameters) {
        DeploymentExtendedInner inner =
            this.serviceClient().createOrUpdateAtManagementGroupScope(groupId, deploymentName, parameters);
        if (inner != null) {
            return new DeploymentExtendedImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DeploymentExtended createOrUpdateAtManagementGroupScope(
        String groupId, String deploymentName, ScopedDeployment parameters, Context context) {
        DeploymentExtendedInner inner =
            this.serviceClient().createOrUpdateAtManagementGroupScope(groupId, deploymentName, parameters, context);
        if (inner != null) {
            return new DeploymentExtendedImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DeploymentExtended getAtManagementGroupScope(String groupId, String deploymentName) {
        DeploymentExtendedInner inner = this.serviceClient().getAtManagementGroupScope(groupId, deploymentName);
        if (inner != null) {
            return new DeploymentExtendedImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DeploymentExtended> getAtManagementGroupScopeWithResponse(
        String groupId, String deploymentName, Context context) {
        Response<DeploymentExtendedInner> inner =
            this.serviceClient().getAtManagementGroupScopeWithResponse(groupId, deploymentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DeploymentExtendedImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void cancelAtManagementGroupScope(String groupId, String deploymentName) {
        this.serviceClient().cancelAtManagementGroupScope(groupId, deploymentName);
    }

    public Response<Void> cancelAtManagementGroupScopeWithResponse(
        String groupId, String deploymentName, Context context) {
        return this.serviceClient().cancelAtManagementGroupScopeWithResponse(groupId, deploymentName, context);
    }

    public DeploymentValidateResult validateAtManagementGroupScope(
        String groupId, String deploymentName, ScopedDeployment parameters) {
        DeploymentValidateResultInner inner =
            this.serviceClient().validateAtManagementGroupScope(groupId, deploymentName, parameters);
        if (inner != null) {
            return new DeploymentValidateResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DeploymentValidateResult validateAtManagementGroupScope(
        String groupId, String deploymentName, ScopedDeployment parameters, Context context) {
        DeploymentValidateResultInner inner =
            this.serviceClient().validateAtManagementGroupScope(groupId, deploymentName, parameters, context);
        if (inner != null) {
            return new DeploymentValidateResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public WhatIfOperationResult whatIfAtManagementGroupScope(
        String groupId, String deploymentName, ScopedDeploymentWhatIf parameters) {
        WhatIfOperationResultInner inner =
            this.serviceClient().whatIfAtManagementGroupScope(groupId, deploymentName, parameters);
        if (inner != null) {
            return new WhatIfOperationResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public WhatIfOperationResult whatIfAtManagementGroupScope(
        String groupId, String deploymentName, ScopedDeploymentWhatIf parameters, Context context) {
        WhatIfOperationResultInner inner =
            this.serviceClient().whatIfAtManagementGroupScope(groupId, deploymentName, parameters, context);
        if (inner != null) {
            return new WhatIfOperationResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DeploymentExportResult exportTemplateAtManagementGroupScope(String groupId, String deploymentName) {
        DeploymentExportResultInner inner =
            this.serviceClient().exportTemplateAtManagementGroupScope(groupId, deploymentName);
        if (inner != null) {
            return new DeploymentExportResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DeploymentExportResult> exportTemplateAtManagementGroupScopeWithResponse(
        String groupId, String deploymentName, Context context) {
        Response<DeploymentExportResultInner> inner =
            this.serviceClient().exportTemplateAtManagementGroupScopeWithResponse(groupId, deploymentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DeploymentExportResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<DeploymentExtended> listAtManagementGroupScope(String groupId) {
        PagedIterable<DeploymentExtendedInner> inner = this.serviceClient().listAtManagementGroupScope(groupId);
        return inner.mapPage(inner1 -> new DeploymentExtendedImpl(inner1, this.manager()));
    }

    public PagedIterable<DeploymentExtended> listAtManagementGroupScope(
        String groupId, String filter, Integer top, Context context) {
        PagedIterable<DeploymentExtendedInner> inner =
            this.serviceClient().listAtManagementGroupScope(groupId, filter, top, context);
        return inner.mapPage(inner1 -> new DeploymentExtendedImpl(inner1, this.manager()));
    }

    public void deleteAtSubscriptionScope(String deploymentName) {
        this.serviceClient().deleteAtSubscriptionScope(deploymentName);
    }

    public void deleteAtSubscriptionScope(String deploymentName, Context context) {
        this.serviceClient().deleteAtSubscriptionScope(deploymentName, context);
    }

    public boolean checkExistenceAtSubscriptionScope(String deploymentName) {
        return this.serviceClient().checkExistenceAtSubscriptionScope(deploymentName);
    }

    public Response<Boolean> checkExistenceAtSubscriptionScopeWithResponse(String deploymentName, Context context) {
        return this.serviceClient().checkExistenceAtSubscriptionScopeWithResponse(deploymentName, context);
    }

    public DeploymentExtended createOrUpdateAtSubscriptionScope(String deploymentName, Deployment parameters) {
        DeploymentExtendedInner inner =
            this.serviceClient().createOrUpdateAtSubscriptionScope(deploymentName, parameters);
        if (inner != null) {
            return new DeploymentExtendedImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DeploymentExtended createOrUpdateAtSubscriptionScope(
        String deploymentName, Deployment parameters, Context context) {
        DeploymentExtendedInner inner =
            this.serviceClient().createOrUpdateAtSubscriptionScope(deploymentName, parameters, context);
        if (inner != null) {
            return new DeploymentExtendedImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DeploymentExtended getAtSubscriptionScope(String deploymentName) {
        DeploymentExtendedInner inner = this.serviceClient().getAtSubscriptionScope(deploymentName);
        if (inner != null) {
            return new DeploymentExtendedImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DeploymentExtended> getAtSubscriptionScopeWithResponse(String deploymentName, Context context) {
        Response<DeploymentExtendedInner> inner =
            this.serviceClient().getAtSubscriptionScopeWithResponse(deploymentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DeploymentExtendedImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void cancelAtSubscriptionScope(String deploymentName) {
        this.serviceClient().cancelAtSubscriptionScope(deploymentName);
    }

    public Response<Void> cancelAtSubscriptionScopeWithResponse(String deploymentName, Context context) {
        return this.serviceClient().cancelAtSubscriptionScopeWithResponse(deploymentName, context);
    }

    public DeploymentValidateResult validateAtSubscriptionScope(String deploymentName, Deployment parameters) {
        DeploymentValidateResultInner inner =
            this.serviceClient().validateAtSubscriptionScope(deploymentName, parameters);
        if (inner != null) {
            return new DeploymentValidateResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DeploymentValidateResult validateAtSubscriptionScope(
        String deploymentName, Deployment parameters, Context context) {
        DeploymentValidateResultInner inner =
            this.serviceClient().validateAtSubscriptionScope(deploymentName, parameters, context);
        if (inner != null) {
            return new DeploymentValidateResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public WhatIfOperationResult whatIfAtSubscriptionScope(String deploymentName, DeploymentWhatIf parameters) {
        WhatIfOperationResultInner inner = this.serviceClient().whatIfAtSubscriptionScope(deploymentName, parameters);
        if (inner != null) {
            return new WhatIfOperationResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public WhatIfOperationResult whatIfAtSubscriptionScope(
        String deploymentName, DeploymentWhatIf parameters, Context context) {
        WhatIfOperationResultInner inner =
            this.serviceClient().whatIfAtSubscriptionScope(deploymentName, parameters, context);
        if (inner != null) {
            return new WhatIfOperationResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DeploymentExportResult exportTemplateAtSubscriptionScope(String deploymentName) {
        DeploymentExportResultInner inner = this.serviceClient().exportTemplateAtSubscriptionScope(deploymentName);
        if (inner != null) {
            return new DeploymentExportResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DeploymentExportResult> exportTemplateAtSubscriptionScopeWithResponse(
        String deploymentName, Context context) {
        Response<DeploymentExportResultInner> inner =
            this.serviceClient().exportTemplateAtSubscriptionScopeWithResponse(deploymentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DeploymentExportResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<DeploymentExtended> list() {
        PagedIterable<DeploymentExtendedInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new DeploymentExtendedImpl(inner1, this.manager()));
    }

    public PagedIterable<DeploymentExtended> list(String filter, Integer top, Context context) {
        PagedIterable<DeploymentExtendedInner> inner = this.serviceClient().list(filter, top, context);
        return inner.mapPage(inner1 -> new DeploymentExtendedImpl(inner1, this.manager()));
    }

    public void deleteByResourceGroup(String resourceGroupName, String deploymentName) {
        this.serviceClient().delete(resourceGroupName, deploymentName);
    }

    public void delete(String resourceGroupName, String deploymentName, Context context) {
        this.serviceClient().delete(resourceGroupName, deploymentName, context);
    }

    public boolean checkExistence(String resourceGroupName, String deploymentName) {
        return this.serviceClient().checkExistence(resourceGroupName, deploymentName);
    }

    public Response<Boolean> checkExistenceWithResponse(
        String resourceGroupName, String deploymentName, Context context) {
        return this.serviceClient().checkExistenceWithResponse(resourceGroupName, deploymentName, context);
    }

    public DeploymentExtended getByResourceGroup(String resourceGroupName, String deploymentName) {
        DeploymentExtendedInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, deploymentName);
        if (inner != null) {
            return new DeploymentExtendedImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DeploymentExtended> getByResourceGroupWithResponse(
        String resourceGroupName, String deploymentName, Context context) {
        Response<DeploymentExtendedInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, deploymentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DeploymentExtendedImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void cancel(String resourceGroupName, String deploymentName) {
        this.serviceClient().cancel(resourceGroupName, deploymentName);
    }

    public Response<Void> cancelWithResponse(String resourceGroupName, String deploymentName, Context context) {
        return this.serviceClient().cancelWithResponse(resourceGroupName, deploymentName, context);
    }

    public DeploymentValidateResult validate(String resourceGroupName, String deploymentName, Deployment parameters) {
        DeploymentValidateResultInner inner =
            this.serviceClient().validate(resourceGroupName, deploymentName, parameters);
        if (inner != null) {
            return new DeploymentValidateResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DeploymentValidateResult validate(
        String resourceGroupName, String deploymentName, Deployment parameters, Context context) {
        DeploymentValidateResultInner inner =
            this.serviceClient().validate(resourceGroupName, deploymentName, parameters, context);
        if (inner != null) {
            return new DeploymentValidateResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public WhatIfOperationResult whatIf(String resourceGroupName, String deploymentName, DeploymentWhatIf parameters) {
        WhatIfOperationResultInner inner = this.serviceClient().whatIf(resourceGroupName, deploymentName, parameters);
        if (inner != null) {
            return new WhatIfOperationResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public WhatIfOperationResult whatIf(
        String resourceGroupName, String deploymentName, DeploymentWhatIf parameters, Context context) {
        WhatIfOperationResultInner inner =
            this.serviceClient().whatIf(resourceGroupName, deploymentName, parameters, context);
        if (inner != null) {
            return new WhatIfOperationResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DeploymentExportResult exportTemplate(String resourceGroupName, String deploymentName) {
        DeploymentExportResultInner inner = this.serviceClient().exportTemplate(resourceGroupName, deploymentName);
        if (inner != null) {
            return new DeploymentExportResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DeploymentExportResult> exportTemplateWithResponse(
        String resourceGroupName, String deploymentName, Context context) {
        Response<DeploymentExportResultInner> inner =
            this.serviceClient().exportTemplateWithResponse(resourceGroupName, deploymentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DeploymentExportResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<DeploymentExtended> listByResourceGroup(String resourceGroupName) {
        PagedIterable<DeploymentExtendedInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new DeploymentExtendedImpl(inner1, this.manager()));
    }

    public PagedIterable<DeploymentExtended> listByResourceGroup(
        String resourceGroupName, String filter, Integer top, Context context) {
        PagedIterable<DeploymentExtendedInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, filter, top, context);
        return inner.mapPage(inner1 -> new DeploymentExtendedImpl(inner1, this.manager()));
    }

    public TemplateHashResult calculateTemplateHash(Object template) {
        TemplateHashResultInner inner = this.serviceClient().calculateTemplateHash(template);
        if (inner != null) {
            return new TemplateHashResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<TemplateHashResult> calculateTemplateHashWithResponse(Object template, Context context) {
        Response<TemplateHashResultInner> inner =
            this.serviceClient().calculateTemplateHashWithResponse(template, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new TemplateHashResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DeploymentExtended getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String deploymentName = Utils.getValueFromIdByName(id, "deployments");
        if (deploymentName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'deployments'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, deploymentName, Context.NONE).getValue();
    }

    public Response<DeploymentExtended> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String deploymentName = Utils.getValueFromIdByName(id, "deployments");
        if (deploymentName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'deployments'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, deploymentName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String deploymentName = Utils.getValueFromIdByName(id, "deployments");
        if (deploymentName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'deployments'.", id)));
        }
        this.delete(resourceGroupName, deploymentName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String deploymentName = Utils.getValueFromIdByName(id, "deployments");
        if (deploymentName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'deployments'.", id)));
        }
        this.delete(resourceGroupName, deploymentName, context);
    }

    private DeploymentsClient serviceClient() {
        return this.innerClient;
    }

    private ResourceManager manager() {
        return this.serviceManager;
    }

    public DeploymentExtendedImpl define(String name) {
        return new DeploymentExtendedImpl(name, this.manager());
    }
}
