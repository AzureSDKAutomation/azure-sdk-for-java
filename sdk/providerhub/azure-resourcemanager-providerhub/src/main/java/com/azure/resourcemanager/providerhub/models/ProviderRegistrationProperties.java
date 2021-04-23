// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import java.util.Map;

/** The ProviderRegistrationProperties model. */
@Immutable
public final class ProviderRegistrationProperties extends ProviderRegistrationPropertiesAutoGenerated {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProviderRegistrationProperties.class);

    /** {@inheritDoc} */
    @Override
    public ProviderRegistrationProperties withProviderHubMetadata(
        ProviderRegistrationPropertiesProviderHubMetadata providerHubMetadata) {
        super.withProviderHubMetadata(providerHubMetadata);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProviderRegistrationProperties withProvisioningState(ProvisioningState provisioningState) {
        super.withProvisioningState(provisioningState);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProviderRegistrationProperties withSubscriptionLifecycleNotificationSpecifications(
        ProviderRegistrationPropertiesSubscriptionLifecycleNotificationSpecifications
            subscriptionLifecycleNotificationSpecifications) {
        super.withSubscriptionLifecycleNotificationSpecifications(subscriptionLifecycleNotificationSpecifications);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProviderRegistrationProperties withProviderAuthentication(
        ResourceProviderManifestPropertiesProviderAuthentication providerAuthentication) {
        super.withProviderAuthentication(providerAuthentication);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProviderRegistrationProperties withProviderAuthorizations(
        List<ResourceProviderAuthorization> providerAuthorizations) {
        super.withProviderAuthorizations(providerAuthorizations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProviderRegistrationProperties withNamespace(String namespace) {
        super.withNamespace(namespace);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProviderRegistrationProperties withProviderVersion(String providerVersion) {
        super.withProviderVersion(providerVersion);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProviderRegistrationProperties withProviderType(ResourceProviderType providerType) {
        super.withProviderType(providerType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProviderRegistrationProperties withRequiredFeatures(List<String> requiredFeatures) {
        super.withRequiredFeatures(requiredFeatures);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProviderRegistrationProperties withFeaturesRule(
        ResourceProviderManifestPropertiesFeaturesRule featuresRule) {
        super.withFeaturesRule(featuresRule);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProviderRegistrationProperties withRequestHeaderOptions(
        ResourceProviderManifestPropertiesRequestHeaderOptions requestHeaderOptions) {
        super.withRequestHeaderOptions(requestHeaderOptions);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProviderRegistrationProperties withManagement(ResourceProviderManifestPropertiesManagement management) {
        super.withManagement(management);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProviderRegistrationProperties withCapabilities(List<ResourceProviderCapabilities> capabilities) {
        super.withCapabilities(capabilities);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProviderRegistrationProperties withMetadata(Map<String, String> metadata) {
        super.withMetadata(metadata);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProviderRegistrationProperties withTemplateDeploymentOptions(
        ResourceProviderManifestPropertiesTemplateDeploymentOptions templateDeploymentOptions) {
        super.withTemplateDeploymentOptions(templateDeploymentOptions);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
