// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicebus.generated.ServiceBusManager;
import com.azure.resourcemanager.servicebus.generated.fluent.DisasterRecoveryConfigsClient;
import com.azure.resourcemanager.servicebus.generated.fluent.models.AccessKeysInner;
import com.azure.resourcemanager.servicebus.generated.fluent.models.ArmDisasterRecoveryInner;
import com.azure.resourcemanager.servicebus.generated.fluent.models.CheckNameAvailabilityResultInner;
import com.azure.resourcemanager.servicebus.generated.fluent.models.SBAuthorizationRuleInner;
import com.azure.resourcemanager.servicebus.generated.models.AccessKeys;
import com.azure.resourcemanager.servicebus.generated.models.ArmDisasterRecovery;
import com.azure.resourcemanager.servicebus.generated.models.CheckNameAvailability;
import com.azure.resourcemanager.servicebus.generated.models.CheckNameAvailabilityResult;
import com.azure.resourcemanager.servicebus.generated.models.DisasterRecoveryConfigs;
import com.azure.resourcemanager.servicebus.generated.models.FailoverProperties;
import com.azure.resourcemanager.servicebus.generated.models.SBAuthorizationRule;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DisasterRecoveryConfigsImpl implements DisasterRecoveryConfigs {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DisasterRecoveryConfigsImpl.class);

    private final DisasterRecoveryConfigsClient innerClient;

    private final ServiceBusManager serviceManager;

    public DisasterRecoveryConfigsImpl(DisasterRecoveryConfigsClient innerClient, ServiceBusManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public CheckNameAvailabilityResult checkNameAvailability(
        String resourceGroupName, String namespaceName, CheckNameAvailability parameters) {
        CheckNameAvailabilityResultInner inner =
            this.serviceClient().checkNameAvailability(resourceGroupName, namespaceName, parameters);
        if (inner != null) {
            return new CheckNameAvailabilityResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CheckNameAvailabilityResult> checkNameAvailabilityWithResponse(
        String resourceGroupName, String namespaceName, CheckNameAvailability parameters, Context context) {
        Response<CheckNameAvailabilityResultInner> inner =
            this
                .serviceClient()
                .checkNameAvailabilityWithResponse(resourceGroupName, namespaceName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CheckNameAvailabilityResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<ArmDisasterRecovery> list(String resourceGroupName, String namespaceName) {
        PagedIterable<ArmDisasterRecoveryInner> inner = this.serviceClient().list(resourceGroupName, namespaceName);
        return Utils.mapPage(inner, inner1 -> new ArmDisasterRecoveryImpl(inner1, this.manager()));
    }

    public PagedIterable<ArmDisasterRecovery> list(String resourceGroupName, String namespaceName, Context context) {
        PagedIterable<ArmDisasterRecoveryInner> inner =
            this.serviceClient().list(resourceGroupName, namespaceName, context);
        return Utils.mapPage(inner, inner1 -> new ArmDisasterRecoveryImpl(inner1, this.manager()));
    }

    public void delete(String resourceGroupName, String namespaceName, String alias) {
        this.serviceClient().delete(resourceGroupName, namespaceName, alias);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String namespaceName, String alias, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, namespaceName, alias, context);
    }

    public ArmDisasterRecovery get(String resourceGroupName, String namespaceName, String alias) {
        ArmDisasterRecoveryInner inner = this.serviceClient().get(resourceGroupName, namespaceName, alias);
        if (inner != null) {
            return new ArmDisasterRecoveryImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ArmDisasterRecovery> getWithResponse(
        String resourceGroupName, String namespaceName, String alias, Context context) {
        Response<ArmDisasterRecoveryInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, namespaceName, alias, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ArmDisasterRecoveryImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void breakPairing(String resourceGroupName, String namespaceName, String alias) {
        this.serviceClient().breakPairing(resourceGroupName, namespaceName, alias);
    }

    public Response<Void> breakPairingWithResponse(
        String resourceGroupName, String namespaceName, String alias, Context context) {
        return this.serviceClient().breakPairingWithResponse(resourceGroupName, namespaceName, alias, context);
    }

    public void failOver(String resourceGroupName, String namespaceName, String alias) {
        this.serviceClient().failOver(resourceGroupName, namespaceName, alias);
    }

    public Response<Void> failOverWithResponse(
        String resourceGroupName, String namespaceName, String alias, FailoverProperties parameters, Context context) {
        return this.serviceClient().failOverWithResponse(resourceGroupName, namespaceName, alias, parameters, context);
    }

    public PagedIterable<SBAuthorizationRule> listAuthorizationRules(
        String resourceGroupName, String namespaceName, String alias) {
        PagedIterable<SBAuthorizationRuleInner> inner =
            this.serviceClient().listAuthorizationRules(resourceGroupName, namespaceName, alias);
        return Utils.mapPage(inner, inner1 -> new SBAuthorizationRuleImpl(inner1, this.manager()));
    }

    public PagedIterable<SBAuthorizationRule> listAuthorizationRules(
        String resourceGroupName, String namespaceName, String alias, Context context) {
        PagedIterable<SBAuthorizationRuleInner> inner =
            this.serviceClient().listAuthorizationRules(resourceGroupName, namespaceName, alias, context);
        return Utils.mapPage(inner, inner1 -> new SBAuthorizationRuleImpl(inner1, this.manager()));
    }

    public SBAuthorizationRule getAuthorizationRule(
        String resourceGroupName, String namespaceName, String alias, String authorizationRuleName) {
        SBAuthorizationRuleInner inner =
            this.serviceClient().getAuthorizationRule(resourceGroupName, namespaceName, alias, authorizationRuleName);
        if (inner != null) {
            return new SBAuthorizationRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SBAuthorizationRule> getAuthorizationRuleWithResponse(
        String resourceGroupName, String namespaceName, String alias, String authorizationRuleName, Context context) {
        Response<SBAuthorizationRuleInner> inner =
            this
                .serviceClient()
                .getAuthorizationRuleWithResponse(
                    resourceGroupName, namespaceName, alias, authorizationRuleName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SBAuthorizationRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AccessKeys listKeys(
        String resourceGroupName, String namespaceName, String alias, String authorizationRuleName) {
        AccessKeysInner inner =
            this.serviceClient().listKeys(resourceGroupName, namespaceName, alias, authorizationRuleName);
        if (inner != null) {
            return new AccessKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AccessKeys> listKeysWithResponse(
        String resourceGroupName, String namespaceName, String alias, String authorizationRuleName, Context context) {
        Response<AccessKeysInner> inner =
            this
                .serviceClient()
                .listKeysWithResponse(resourceGroupName, namespaceName, alias, authorizationRuleName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AccessKeysImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ArmDisasterRecovery getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String alias = Utils.getValueFromIdByName(id, "disasterRecoveryConfigs");
        if (alias == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'disasterRecoveryConfigs'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, namespaceName, alias, Context.NONE).getValue();
    }

    public Response<ArmDisasterRecovery> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String alias = Utils.getValueFromIdByName(id, "disasterRecoveryConfigs");
        if (alias == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'disasterRecoveryConfigs'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, namespaceName, alias, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String alias = Utils.getValueFromIdByName(id, "disasterRecoveryConfigs");
        if (alias == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'disasterRecoveryConfigs'.",
                                id)));
        }
        this.deleteWithResponse(resourceGroupName, namespaceName, alias, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String alias = Utils.getValueFromIdByName(id, "disasterRecoveryConfigs");
        if (alias == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'disasterRecoveryConfigs'.",
                                id)));
        }
        return this.deleteWithResponse(resourceGroupName, namespaceName, alias, context);
    }

    private DisasterRecoveryConfigsClient serviceClient() {
        return this.innerClient;
    }

    private ServiceBusManager manager() {
        return this.serviceManager;
    }

    public ArmDisasterRecoveryImpl define(String name) {
        return new ArmDisasterRecoveryImpl(name, this.manager());
    }
}
