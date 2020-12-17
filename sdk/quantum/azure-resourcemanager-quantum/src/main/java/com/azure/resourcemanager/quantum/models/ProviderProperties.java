// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quantum.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Provider properties. */
@Fluent
public final class ProviderProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProviderProperties.class);

    /*
     * A description about this provider.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Provider type.
     */
    @JsonProperty(value = "providerType")
    private String providerType;

    /*
     * Company name.
     */
    @JsonProperty(value = "company")
    private String company;

    /*
     * Provider's default endpoint.
     */
    @JsonProperty(value = "defaultEndpoint")
    private String defaultEndpoint;

    /*
     * Azure Active Directory info.
     */
    @JsonProperty(value = "aad")
    private ProviderPropertiesAad aad;

    /*
     * Provider's Managed-Application info
     */
    @JsonProperty(value = "managedApplication")
    private ProviderPropertiesManagedApplication managedApplication;

    /*
     * The list of targets available from this provider.
     */
    @JsonProperty(value = "targets")
    private List<TargetDescription> targets;

    /*
     * The list of skus available from this provider.
     */
    @JsonProperty(value = "skus")
    private List<SkuDescription> skus;

    /*
     * The list of quota dimensions from the provider.
     */
    @JsonProperty(value = "quotaDimensions")
    private List<QuotaDimension> quotaDimensions;

    /*
     * The list of pricing dimensions from the provider.
     */
    @JsonProperty(value = "pricingDimensions")
    private List<PricingDimension> pricingDimensions;

    /**
     * Get the description property: A description about this provider.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: A description about this provider.
     *
     * @param description the description value to set.
     * @return the ProviderProperties object itself.
     */
    public ProviderProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the providerType property: Provider type.
     *
     * @return the providerType value.
     */
    public String providerType() {
        return this.providerType;
    }

    /**
     * Set the providerType property: Provider type.
     *
     * @param providerType the providerType value to set.
     * @return the ProviderProperties object itself.
     */
    public ProviderProperties withProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }

    /**
     * Get the company property: Company name.
     *
     * @return the company value.
     */
    public String company() {
        return this.company;
    }

    /**
     * Set the company property: Company name.
     *
     * @param company the company value to set.
     * @return the ProviderProperties object itself.
     */
    public ProviderProperties withCompany(String company) {
        this.company = company;
        return this;
    }

    /**
     * Get the defaultEndpoint property: Provider's default endpoint.
     *
     * @return the defaultEndpoint value.
     */
    public String defaultEndpoint() {
        return this.defaultEndpoint;
    }

    /**
     * Set the defaultEndpoint property: Provider's default endpoint.
     *
     * @param defaultEndpoint the defaultEndpoint value to set.
     * @return the ProviderProperties object itself.
     */
    public ProviderProperties withDefaultEndpoint(String defaultEndpoint) {
        this.defaultEndpoint = defaultEndpoint;
        return this;
    }

    /**
     * Get the aad property: Azure Active Directory info.
     *
     * @return the aad value.
     */
    public ProviderPropertiesAad aad() {
        return this.aad;
    }

    /**
     * Set the aad property: Azure Active Directory info.
     *
     * @param aad the aad value to set.
     * @return the ProviderProperties object itself.
     */
    public ProviderProperties withAad(ProviderPropertiesAad aad) {
        this.aad = aad;
        return this;
    }

    /**
     * Get the managedApplication property: Provider's Managed-Application info.
     *
     * @return the managedApplication value.
     */
    public ProviderPropertiesManagedApplication managedApplication() {
        return this.managedApplication;
    }

    /**
     * Set the managedApplication property: Provider's Managed-Application info.
     *
     * @param managedApplication the managedApplication value to set.
     * @return the ProviderProperties object itself.
     */
    public ProviderProperties withManagedApplication(ProviderPropertiesManagedApplication managedApplication) {
        this.managedApplication = managedApplication;
        return this;
    }

    /**
     * Get the targets property: The list of targets available from this provider.
     *
     * @return the targets value.
     */
    public List<TargetDescription> targets() {
        return this.targets;
    }

    /**
     * Set the targets property: The list of targets available from this provider.
     *
     * @param targets the targets value to set.
     * @return the ProviderProperties object itself.
     */
    public ProviderProperties withTargets(List<TargetDescription> targets) {
        this.targets = targets;
        return this;
    }

    /**
     * Get the skus property: The list of skus available from this provider.
     *
     * @return the skus value.
     */
    public List<SkuDescription> skus() {
        return this.skus;
    }

    /**
     * Set the skus property: The list of skus available from this provider.
     *
     * @param skus the skus value to set.
     * @return the ProviderProperties object itself.
     */
    public ProviderProperties withSkus(List<SkuDescription> skus) {
        this.skus = skus;
        return this;
    }

    /**
     * Get the quotaDimensions property: The list of quota dimensions from the provider.
     *
     * @return the quotaDimensions value.
     */
    public List<QuotaDimension> quotaDimensions() {
        return this.quotaDimensions;
    }

    /**
     * Set the quotaDimensions property: The list of quota dimensions from the provider.
     *
     * @param quotaDimensions the quotaDimensions value to set.
     * @return the ProviderProperties object itself.
     */
    public ProviderProperties withQuotaDimensions(List<QuotaDimension> quotaDimensions) {
        this.quotaDimensions = quotaDimensions;
        return this;
    }

    /**
     * Get the pricingDimensions property: The list of pricing dimensions from the provider.
     *
     * @return the pricingDimensions value.
     */
    public List<PricingDimension> pricingDimensions() {
        return this.pricingDimensions;
    }

    /**
     * Set the pricingDimensions property: The list of pricing dimensions from the provider.
     *
     * @param pricingDimensions the pricingDimensions value to set.
     * @return the ProviderProperties object itself.
     */
    public ProviderProperties withPricingDimensions(List<PricingDimension> pricingDimensions) {
        this.pricingDimensions = pricingDimensions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (aad() != null) {
            aad().validate();
        }
        if (managedApplication() != null) {
            managedApplication().validate();
        }
        if (targets() != null) {
            targets().forEach(e -> e.validate());
        }
        if (skus() != null) {
            skus().forEach(e -> e.validate());
        }
        if (quotaDimensions() != null) {
            quotaDimensions().forEach(e -> e.validate());
        }
        if (pricingDimensions() != null) {
            pricingDimensions().forEach(e -> e.validate());
        }
    }
}
