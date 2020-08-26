/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2017_05_01.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains information about an application in a Batch account.
 */
public class ApplicationInner {
    /**
     * A string that uniquely identifies the application within the account.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The display name for the application.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * The list of packages under this application.
     */
    @JsonProperty(value = "packages")
    private List<ApplicationPackageInner> packages;

    /**
     * A value indicating whether packages within the application may be
     * overwritten using the same version string.
     */
    @JsonProperty(value = "allowUpdates")
    private Boolean allowUpdates;

    /**
     * The package to use if a client requests the application but does not
     * specify a version.
     */
    @JsonProperty(value = "defaultVersion")
    private String defaultVersion;

    /**
     * Get a string that uniquely identifies the application within the account.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set a string that uniquely identifies the application within the account.
     *
     * @param id the id value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the display name for the application.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the display name for the application.
     *
     * @param displayName the displayName value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the list of packages under this application.
     *
     * @return the packages value
     */
    public List<ApplicationPackageInner> packages() {
        return this.packages;
    }

    /**
     * Set the list of packages under this application.
     *
     * @param packages the packages value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withPackages(List<ApplicationPackageInner> packages) {
        this.packages = packages;
        return this;
    }

    /**
     * Get a value indicating whether packages within the application may be overwritten using the same version string.
     *
     * @return the allowUpdates value
     */
    public Boolean allowUpdates() {
        return this.allowUpdates;
    }

    /**
     * Set a value indicating whether packages within the application may be overwritten using the same version string.
     *
     * @param allowUpdates the allowUpdates value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withAllowUpdates(Boolean allowUpdates) {
        this.allowUpdates = allowUpdates;
        return this;
    }

    /**
     * Get the package to use if a client requests the application but does not specify a version.
     *
     * @return the defaultVersion value
     */
    public String defaultVersion() {
        return this.defaultVersion;
    }

    /**
     * Set the package to use if a client requests the application but does not specify a version.
     *
     * @param defaultVersion the defaultVersion value to set
     * @return the ApplicationInner object itself.
     */
    public ApplicationInner withDefaultVersion(String defaultVersion) {
        this.defaultVersion = defaultVersion;
        return this;
    }

}
