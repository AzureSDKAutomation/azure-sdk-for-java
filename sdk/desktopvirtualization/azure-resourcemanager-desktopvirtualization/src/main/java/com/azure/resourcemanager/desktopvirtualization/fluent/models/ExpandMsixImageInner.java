// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.desktopvirtualization.models.MsixPackageApplications;
import com.azure.resourcemanager.desktopvirtualization.models.MsixPackageDependencies;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Represents the definition of contents retrieved after expanding the MSIX Image. */
@JsonFlatten
@Fluent
public class ExpandMsixImageInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExpandMsixImageInner.class);

    /*
     * Alias of MSIX Package.
     */
    @JsonProperty(value = "properties.packageAlias")
    private String packageAlias;

    /*
     * VHD/CIM image path on Network Share.
     */
    @JsonProperty(value = "properties.imagePath")
    private String imagePath;

    /*
     * Package Name from appxmanifest.xml.
     */
    @JsonProperty(value = "properties.packageName")
    private String packageName;

    /*
     * Package Family Name from appxmanifest.xml. Contains Package Name and
     * Publisher name.
     */
    @JsonProperty(value = "properties.packageFamilyName")
    private String packageFamilyName;

    /*
     * Package Full Name from appxmanifest.xml.
     */
    @JsonProperty(value = "properties.packageFullName")
    private String packageFullName;

    /*
     * User friendly Name to be displayed in the portal.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /*
     * Relative Path to the package inside the image.
     */
    @JsonProperty(value = "properties.packageRelativePath")
    private String packageRelativePath;

    /*
     * Specifies how to register Package in feed.
     */
    @JsonProperty(value = "properties.isRegularRegistration")
    private Boolean isRegularRegistration;

    /*
     * Make this version of the package the active one across the hostpool.
     */
    @JsonProperty(value = "properties.isActive")
    private Boolean isActive;

    /*
     * List of package dependencies.
     */
    @JsonProperty(value = "properties.packageDependencies")
    private List<MsixPackageDependencies> packageDependencies;

    /*
     * Package Version found in the appxmanifest.xml.
     */
    @JsonProperty(value = "properties.version")
    private String version;

    /*
     * Date Package was last updated, found in the appxmanifest.xml.
     */
    @JsonProperty(value = "properties.lastUpdated")
    private OffsetDateTime lastUpdated;

    /*
     * List of package applications.
     */
    @JsonProperty(value = "properties.packageApplications")
    private List<MsixPackageApplications> packageApplications;

    /**
     * Get the packageAlias property: Alias of MSIX Package.
     *
     * @return the packageAlias value.
     */
    public String packageAlias() {
        return this.packageAlias;
    }

    /**
     * Set the packageAlias property: Alias of MSIX Package.
     *
     * @param packageAlias the packageAlias value to set.
     * @return the ExpandMsixImageInner object itself.
     */
    public ExpandMsixImageInner withPackageAlias(String packageAlias) {
        this.packageAlias = packageAlias;
        return this;
    }

    /**
     * Get the imagePath property: VHD/CIM image path on Network Share.
     *
     * @return the imagePath value.
     */
    public String imagePath() {
        return this.imagePath;
    }

    /**
     * Set the imagePath property: VHD/CIM image path on Network Share.
     *
     * @param imagePath the imagePath value to set.
     * @return the ExpandMsixImageInner object itself.
     */
    public ExpandMsixImageInner withImagePath(String imagePath) {
        this.imagePath = imagePath;
        return this;
    }

    /**
     * Get the packageName property: Package Name from appxmanifest.xml.
     *
     * @return the packageName value.
     */
    public String packageName() {
        return this.packageName;
    }

    /**
     * Set the packageName property: Package Name from appxmanifest.xml.
     *
     * @param packageName the packageName value to set.
     * @return the ExpandMsixImageInner object itself.
     */
    public ExpandMsixImageInner withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * Get the packageFamilyName property: Package Family Name from appxmanifest.xml. Contains Package Name and
     * Publisher name.
     *
     * @return the packageFamilyName value.
     */
    public String packageFamilyName() {
        return this.packageFamilyName;
    }

    /**
     * Set the packageFamilyName property: Package Family Name from appxmanifest.xml. Contains Package Name and
     * Publisher name.
     *
     * @param packageFamilyName the packageFamilyName value to set.
     * @return the ExpandMsixImageInner object itself.
     */
    public ExpandMsixImageInner withPackageFamilyName(String packageFamilyName) {
        this.packageFamilyName = packageFamilyName;
        return this;
    }

    /**
     * Get the packageFullName property: Package Full Name from appxmanifest.xml.
     *
     * @return the packageFullName value.
     */
    public String packageFullName() {
        return this.packageFullName;
    }

    /**
     * Set the packageFullName property: Package Full Name from appxmanifest.xml.
     *
     * @param packageFullName the packageFullName value to set.
     * @return the ExpandMsixImageInner object itself.
     */
    public ExpandMsixImageInner withPackageFullName(String packageFullName) {
        this.packageFullName = packageFullName;
        return this;
    }

    /**
     * Get the displayName property: User friendly Name to be displayed in the portal.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: User friendly Name to be displayed in the portal.
     *
     * @param displayName the displayName value to set.
     * @return the ExpandMsixImageInner object itself.
     */
    public ExpandMsixImageInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the packageRelativePath property: Relative Path to the package inside the image.
     *
     * @return the packageRelativePath value.
     */
    public String packageRelativePath() {
        return this.packageRelativePath;
    }

    /**
     * Set the packageRelativePath property: Relative Path to the package inside the image.
     *
     * @param packageRelativePath the packageRelativePath value to set.
     * @return the ExpandMsixImageInner object itself.
     */
    public ExpandMsixImageInner withPackageRelativePath(String packageRelativePath) {
        this.packageRelativePath = packageRelativePath;
        return this;
    }

    /**
     * Get the isRegularRegistration property: Specifies how to register Package in feed.
     *
     * @return the isRegularRegistration value.
     */
    public Boolean isRegularRegistration() {
        return this.isRegularRegistration;
    }

    /**
     * Set the isRegularRegistration property: Specifies how to register Package in feed.
     *
     * @param isRegularRegistration the isRegularRegistration value to set.
     * @return the ExpandMsixImageInner object itself.
     */
    public ExpandMsixImageInner withIsRegularRegistration(Boolean isRegularRegistration) {
        this.isRegularRegistration = isRegularRegistration;
        return this;
    }

    /**
     * Get the isActive property: Make this version of the package the active one across the hostpool.
     *
     * @return the isActive value.
     */
    public Boolean isActive() {
        return this.isActive;
    }

    /**
     * Set the isActive property: Make this version of the package the active one across the hostpool.
     *
     * @param isActive the isActive value to set.
     * @return the ExpandMsixImageInner object itself.
     */
    public ExpandMsixImageInner withIsActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
     * Get the packageDependencies property: List of package dependencies.
     *
     * @return the packageDependencies value.
     */
    public List<MsixPackageDependencies> packageDependencies() {
        return this.packageDependencies;
    }

    /**
     * Set the packageDependencies property: List of package dependencies.
     *
     * @param packageDependencies the packageDependencies value to set.
     * @return the ExpandMsixImageInner object itself.
     */
    public ExpandMsixImageInner withPackageDependencies(List<MsixPackageDependencies> packageDependencies) {
        this.packageDependencies = packageDependencies;
        return this;
    }

    /**
     * Get the version property: Package Version found in the appxmanifest.xml.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Package Version found in the appxmanifest.xml.
     *
     * @param version the version value to set.
     * @return the ExpandMsixImageInner object itself.
     */
    public ExpandMsixImageInner withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the lastUpdated property: Date Package was last updated, found in the appxmanifest.xml.
     *
     * @return the lastUpdated value.
     */
    public OffsetDateTime lastUpdated() {
        return this.lastUpdated;
    }

    /**
     * Set the lastUpdated property: Date Package was last updated, found in the appxmanifest.xml.
     *
     * @param lastUpdated the lastUpdated value to set.
     * @return the ExpandMsixImageInner object itself.
     */
    public ExpandMsixImageInner withLastUpdated(OffsetDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    /**
     * Get the packageApplications property: List of package applications.
     *
     * @return the packageApplications value.
     */
    public List<MsixPackageApplications> packageApplications() {
        return this.packageApplications;
    }

    /**
     * Set the packageApplications property: List of package applications.
     *
     * @param packageApplications the packageApplications value to set.
     * @return the ExpandMsixImageInner object itself.
     */
    public ExpandMsixImageInner withPackageApplications(List<MsixPackageApplications> packageApplications) {
        this.packageApplications = packageApplications;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (packageDependencies() != null) {
            packageDependencies().forEach(e -> e.validate());
        }
        if (packageApplications() != null) {
            packageApplications().forEach(e -> e.validate());
        }
    }
}
