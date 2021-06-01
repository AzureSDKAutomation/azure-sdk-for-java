// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ResourceType model. */
@Fluent
public final class ResourceType {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceType.class);

    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The routingType property.
     */
    @JsonProperty(value = "routingType")
    private RoutingType routingType;

    /*
     * The resourceValidation property.
     */
    @JsonProperty(value = "resourceValidation")
    private ResourceValidation resourceValidation;

    /*
     * The allowedUnauthorizedActions property.
     */
    @JsonProperty(value = "allowedUnauthorizedActions")
    private List<String> allowedUnauthorizedActions;

    /*
     * The authorizationActionMappings property.
     */
    @JsonProperty(value = "authorizationActionMappings")
    private List<AuthorizationActionMapping> authorizationActionMappings;

    /*
     * The linkedAccessChecks property.
     */
    @JsonProperty(value = "linkedAccessChecks")
    private List<LinkedAccessCheck> linkedAccessChecks;

    /*
     * The defaultApiVersion property.
     */
    @JsonProperty(value = "defaultApiVersion")
    private String defaultApiVersion;

    /*
     * The loggingRules property.
     */
    @JsonProperty(value = "loggingRules")
    private List<LoggingRule> loggingRules;

    /*
     * The throttlingRules property.
     */
    @JsonProperty(value = "throttlingRules")
    private List<ThrottlingRule> throttlingRules;

    /*
     * The endpoints property.
     */
    @JsonProperty(value = "endpoints")
    private List<ResourceProviderEndpoint> endpoints;

    /*
     * The marketplaceType property.
     */
    @JsonProperty(value = "marketplaceType")
    private ResourceTypeMarketplaceType marketplaceType;

    /*
     * The identityManagement property.
     */
    @JsonProperty(value = "identityManagement")
    private ResourceTypeIdentityManagement identityManagement;

    /*
     * Any object
     */
    @JsonProperty(value = "metadata")
    private Object metadata;

    /*
     * The requiredFeatures property.
     */
    @JsonProperty(value = "requiredFeatures")
    private List<String> requiredFeatures;

    /*
     * The featuresRule property.
     */
    @JsonProperty(value = "featuresRule")
    private ResourceTypeFeaturesRule featuresRule;

    /*
     * The subscriptionStateRules property.
     */
    @JsonProperty(value = "subscriptionStateRules")
    private List<SubscriptionStateRule> subscriptionStateRules;

    /*
     * The serviceTreeInfos property.
     */
    @JsonProperty(value = "serviceTreeInfos")
    private List<ServiceTreeInfo> serviceTreeInfos;

    /*
     * The requestHeaderOptions property.
     */
    @JsonProperty(value = "requestHeaderOptions")
    private ResourceTypeRequestHeaderOptions requestHeaderOptions;

    /*
     * The skuLink property.
     */
    @JsonProperty(value = "skuLink")
    private String skuLink;

    /*
     * The disallowedActionVerbs property.
     */
    @JsonProperty(value = "disallowedActionVerbs")
    private List<String> disallowedActionVerbs;

    /*
     * The templateDeploymentPolicy property.
     */
    @JsonProperty(value = "templateDeploymentPolicy")
    private ResourceTypeTemplateDeploymentPolicy templateDeploymentPolicy;

    /*
     * The extendedLocations property.
     */
    @JsonProperty(value = "extendedLocations")
    private List<ExtendedLocationOptions> extendedLocations;

    /*
     * The linkedOperationRules property.
     */
    @JsonProperty(value = "linkedOperationRules")
    private List<LinkedOperationRule> linkedOperationRules;

    /*
     * The resourceDeletionPolicy property.
     */
    @JsonProperty(value = "resourceDeletionPolicy")
    private ManifestResourceDeletionPolicy resourceDeletionPolicy;

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     *
     * @param name the name value to set.
     * @return the ResourceType object itself.
     */
    public ResourceType withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the routingType property: The routingType property.
     *
     * @return the routingType value.
     */
    public RoutingType routingType() {
        return this.routingType;
    }

    /**
     * Set the routingType property: The routingType property.
     *
     * @param routingType the routingType value to set.
     * @return the ResourceType object itself.
     */
    public ResourceType withRoutingType(RoutingType routingType) {
        this.routingType = routingType;
        return this;
    }

    /**
     * Get the resourceValidation property: The resourceValidation property.
     *
     * @return the resourceValidation value.
     */
    public ResourceValidation resourceValidation() {
        return this.resourceValidation;
    }

    /**
     * Set the resourceValidation property: The resourceValidation property.
     *
     * @param resourceValidation the resourceValidation value to set.
     * @return the ResourceType object itself.
     */
    public ResourceType withResourceValidation(ResourceValidation resourceValidation) {
        this.resourceValidation = resourceValidation;
        return this;
    }

    /**
     * Get the allowedUnauthorizedActions property: The allowedUnauthorizedActions property.
     *
     * @return the allowedUnauthorizedActions value.
     */
    public List<String> allowedUnauthorizedActions() {
        return this.allowedUnauthorizedActions;
    }

    /**
     * Set the allowedUnauthorizedActions property: The allowedUnauthorizedActions property.
     *
     * @param allowedUnauthorizedActions the allowedUnauthorizedActions value to set.
     * @return the ResourceType object itself.
     */
    public ResourceType withAllowedUnauthorizedActions(List<String> allowedUnauthorizedActions) {
        this.allowedUnauthorizedActions = allowedUnauthorizedActions;
        return this;
    }

    /**
     * Get the authorizationActionMappings property: The authorizationActionMappings property.
     *
     * @return the authorizationActionMappings value.
     */
    public List<AuthorizationActionMapping> authorizationActionMappings() {
        return this.authorizationActionMappings;
    }

    /**
     * Set the authorizationActionMappings property: The authorizationActionMappings property.
     *
     * @param authorizationActionMappings the authorizationActionMappings value to set.
     * @return the ResourceType object itself.
     */
    public ResourceType withAuthorizationActionMappings(List<AuthorizationActionMapping> authorizationActionMappings) {
        this.authorizationActionMappings = authorizationActionMappings;
        return this;
    }

    /**
     * Get the linkedAccessChecks property: The linkedAccessChecks property.
     *
     * @return the linkedAccessChecks value.
     */
    public List<LinkedAccessCheck> linkedAccessChecks() {
        return this.linkedAccessChecks;
    }

    /**
     * Set the linkedAccessChecks property: The linkedAccessChecks property.
     *
     * @param linkedAccessChecks the linkedAccessChecks value to set.
     * @return the ResourceType object itself.
     */
    public ResourceType withLinkedAccessChecks(List<LinkedAccessCheck> linkedAccessChecks) {
        this.linkedAccessChecks = linkedAccessChecks;
        return this;
    }

    /**
     * Get the defaultApiVersion property: The defaultApiVersion property.
     *
     * @return the defaultApiVersion value.
     */
    public String defaultApiVersion() {
        return this.defaultApiVersion;
    }

    /**
     * Set the defaultApiVersion property: The defaultApiVersion property.
     *
     * @param defaultApiVersion the defaultApiVersion value to set.
     * @return the ResourceType object itself.
     */
    public ResourceType withDefaultApiVersion(String defaultApiVersion) {
        this.defaultApiVersion = defaultApiVersion;
        return this;
    }

    /**
     * Get the loggingRules property: The loggingRules property.
     *
     * @return the loggingRules value.
     */
    public List<LoggingRule> loggingRules() {
        return this.loggingRules;
    }

    /**
     * Set the loggingRules property: The loggingRules property.
     *
     * @param loggingRules the loggingRules value to set.
     * @return the ResourceType object itself.
     */
    public ResourceType withLoggingRules(List<LoggingRule> loggingRules) {
        this.loggingRules = loggingRules;
        return this;
    }

    /**
     * Get the throttlingRules property: The throttlingRules property.
     *
     * @return the throttlingRules value.
     */
    public List<ThrottlingRule> throttlingRules() {
        return this.throttlingRules;
    }

    /**
     * Set the throttlingRules property: The throttlingRules property.
     *
     * @param throttlingRules the throttlingRules value to set.
     * @return the ResourceType object itself.
     */
    public ResourceType withThrottlingRules(List<ThrottlingRule> throttlingRules) {
        this.throttlingRules = throttlingRules;
        return this;
    }

    /**
     * Get the endpoints property: The endpoints property.
     *
     * @return the endpoints value.
     */
    public List<ResourceProviderEndpoint> endpoints() {
        return this.endpoints;
    }

    /**
     * Set the endpoints property: The endpoints property.
     *
     * @param endpoints the endpoints value to set.
     * @return the ResourceType object itself.
     */
    public ResourceType withEndpoints(List<ResourceProviderEndpoint> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    /**
     * Get the marketplaceType property: The marketplaceType property.
     *
     * @return the marketplaceType value.
     */
    public ResourceTypeMarketplaceType marketplaceType() {
        return this.marketplaceType;
    }

    /**
     * Set the marketplaceType property: The marketplaceType property.
     *
     * @param marketplaceType the marketplaceType value to set.
     * @return the ResourceType object itself.
     */
    public ResourceType withMarketplaceType(ResourceTypeMarketplaceType marketplaceType) {
        this.marketplaceType = marketplaceType;
        return this;
    }

    /**
     * Get the identityManagement property: The identityManagement property.
     *
     * @return the identityManagement value.
     */
    public ResourceTypeIdentityManagement identityManagement() {
        return this.identityManagement;
    }

    /**
     * Set the identityManagement property: The identityManagement property.
     *
     * @param identityManagement the identityManagement value to set.
     * @return the ResourceType object itself.
     */
    public ResourceType withIdentityManagement(ResourceTypeIdentityManagement identityManagement) {
        this.identityManagement = identityManagement;
        return this;
    }

    /**
     * Get the metadata property: Any object.
     *
     * @return the metadata value.
     */
    public Object metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: Any object.
     *
     * @param metadata the metadata value to set.
     * @return the ResourceType object itself.
     */
    public ResourceType withMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the requiredFeatures property: The requiredFeatures property.
     *
     * @return the requiredFeatures value.
     */
    public List<String> requiredFeatures() {
        return this.requiredFeatures;
    }

    /**
     * Set the requiredFeatures property: The requiredFeatures property.
     *
     * @param requiredFeatures the requiredFeatures value to set.
     * @return the ResourceType object itself.
     */
    public ResourceType withRequiredFeatures(List<String> requiredFeatures) {
        this.requiredFeatures = requiredFeatures;
        return this;
    }

    /**
     * Get the featuresRule property: The featuresRule property.
     *
     * @return the featuresRule value.
     */
    public ResourceTypeFeaturesRule featuresRule() {
        return this.featuresRule;
    }

    /**
     * Set the featuresRule property: The featuresRule property.
     *
     * @param featuresRule the featuresRule value to set.
     * @return the ResourceType object itself.
     */
    public ResourceType withFeaturesRule(ResourceTypeFeaturesRule featuresRule) {
        this.featuresRule = featuresRule;
        return this;
    }

    /**
     * Get the subscriptionStateRules property: The subscriptionStateRules property.
     *
     * @return the subscriptionStateRules value.
     */
    public List<SubscriptionStateRule> subscriptionStateRules() {
        return this.subscriptionStateRules;
    }

    /**
     * Set the subscriptionStateRules property: The subscriptionStateRules property.
     *
     * @param subscriptionStateRules the subscriptionStateRules value to set.
     * @return the ResourceType object itself.
     */
    public ResourceType withSubscriptionStateRules(List<SubscriptionStateRule> subscriptionStateRules) {
        this.subscriptionStateRules = subscriptionStateRules;
        return this;
    }

    /**
     * Get the serviceTreeInfos property: The serviceTreeInfos property.
     *
     * @return the serviceTreeInfos value.
     */
    public List<ServiceTreeInfo> serviceTreeInfos() {
        return this.serviceTreeInfos;
    }

    /**
     * Set the serviceTreeInfos property: The serviceTreeInfos property.
     *
     * @param serviceTreeInfos the serviceTreeInfos value to set.
     * @return the ResourceType object itself.
     */
    public ResourceType withServiceTreeInfos(List<ServiceTreeInfo> serviceTreeInfos) {
        this.serviceTreeInfos = serviceTreeInfos;
        return this;
    }

    /**
     * Get the requestHeaderOptions property: The requestHeaderOptions property.
     *
     * @return the requestHeaderOptions value.
     */
    public ResourceTypeRequestHeaderOptions requestHeaderOptions() {
        return this.requestHeaderOptions;
    }

    /**
     * Set the requestHeaderOptions property: The requestHeaderOptions property.
     *
     * @param requestHeaderOptions the requestHeaderOptions value to set.
     * @return the ResourceType object itself.
     */
    public ResourceType withRequestHeaderOptions(ResourceTypeRequestHeaderOptions requestHeaderOptions) {
        this.requestHeaderOptions = requestHeaderOptions;
        return this;
    }

    /**
     * Get the skuLink property: The skuLink property.
     *
     * @return the skuLink value.
     */
    public String skuLink() {
        return this.skuLink;
    }

    /**
     * Set the skuLink property: The skuLink property.
     *
     * @param skuLink the skuLink value to set.
     * @return the ResourceType object itself.
     */
    public ResourceType withSkuLink(String skuLink) {
        this.skuLink = skuLink;
        return this;
    }

    /**
     * Get the disallowedActionVerbs property: The disallowedActionVerbs property.
     *
     * @return the disallowedActionVerbs value.
     */
    public List<String> disallowedActionVerbs() {
        return this.disallowedActionVerbs;
    }

    /**
     * Set the disallowedActionVerbs property: The disallowedActionVerbs property.
     *
     * @param disallowedActionVerbs the disallowedActionVerbs value to set.
     * @return the ResourceType object itself.
     */
    public ResourceType withDisallowedActionVerbs(List<String> disallowedActionVerbs) {
        this.disallowedActionVerbs = disallowedActionVerbs;
        return this;
    }

    /**
     * Get the templateDeploymentPolicy property: The templateDeploymentPolicy property.
     *
     * @return the templateDeploymentPolicy value.
     */
    public ResourceTypeTemplateDeploymentPolicy templateDeploymentPolicy() {
        return this.templateDeploymentPolicy;
    }

    /**
     * Set the templateDeploymentPolicy property: The templateDeploymentPolicy property.
     *
     * @param templateDeploymentPolicy the templateDeploymentPolicy value to set.
     * @return the ResourceType object itself.
     */
    public ResourceType withTemplateDeploymentPolicy(ResourceTypeTemplateDeploymentPolicy templateDeploymentPolicy) {
        this.templateDeploymentPolicy = templateDeploymentPolicy;
        return this;
    }

    /**
     * Get the extendedLocations property: The extendedLocations property.
     *
     * @return the extendedLocations value.
     */
    public List<ExtendedLocationOptions> extendedLocations() {
        return this.extendedLocations;
    }

    /**
     * Set the extendedLocations property: The extendedLocations property.
     *
     * @param extendedLocations the extendedLocations value to set.
     * @return the ResourceType object itself.
     */
    public ResourceType withExtendedLocations(List<ExtendedLocationOptions> extendedLocations) {
        this.extendedLocations = extendedLocations;
        return this;
    }

    /**
     * Get the linkedOperationRules property: The linkedOperationRules property.
     *
     * @return the linkedOperationRules value.
     */
    public List<LinkedOperationRule> linkedOperationRules() {
        return this.linkedOperationRules;
    }

    /**
     * Set the linkedOperationRules property: The linkedOperationRules property.
     *
     * @param linkedOperationRules the linkedOperationRules value to set.
     * @return the ResourceType object itself.
     */
    public ResourceType withLinkedOperationRules(List<LinkedOperationRule> linkedOperationRules) {
        this.linkedOperationRules = linkedOperationRules;
        return this;
    }

    /**
     * Get the resourceDeletionPolicy property: The resourceDeletionPolicy property.
     *
     * @return the resourceDeletionPolicy value.
     */
    public ManifestResourceDeletionPolicy resourceDeletionPolicy() {
        return this.resourceDeletionPolicy;
    }

    /**
     * Set the resourceDeletionPolicy property: The resourceDeletionPolicy property.
     *
     * @param resourceDeletionPolicy the resourceDeletionPolicy value to set.
     * @return the ResourceType object itself.
     */
    public ResourceType withResourceDeletionPolicy(ManifestResourceDeletionPolicy resourceDeletionPolicy) {
        this.resourceDeletionPolicy = resourceDeletionPolicy;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (authorizationActionMappings() != null) {
            authorizationActionMappings().forEach(e -> e.validate());
        }
        if (linkedAccessChecks() != null) {
            linkedAccessChecks().forEach(e -> e.validate());
        }
        if (loggingRules() != null) {
            loggingRules().forEach(e -> e.validate());
        }
        if (throttlingRules() != null) {
            throttlingRules().forEach(e -> e.validate());
        }
        if (endpoints() != null) {
            endpoints().forEach(e -> e.validate());
        }
        if (identityManagement() != null) {
            identityManagement().validate();
        }
        if (featuresRule() != null) {
            featuresRule().validate();
        }
        if (subscriptionStateRules() != null) {
            subscriptionStateRules().forEach(e -> e.validate());
        }
        if (serviceTreeInfos() != null) {
            serviceTreeInfos().forEach(e -> e.validate());
        }
        if (requestHeaderOptions() != null) {
            requestHeaderOptions().validate();
        }
        if (templateDeploymentPolicy() != null) {
            templateDeploymentPolicy().validate();
        }
        if (extendedLocations() != null) {
            extendedLocations().forEach(e -> e.validate());
        }
        if (linkedOperationRules() != null) {
            linkedOperationRules().forEach(e -> e.validate());
        }
    }
}
