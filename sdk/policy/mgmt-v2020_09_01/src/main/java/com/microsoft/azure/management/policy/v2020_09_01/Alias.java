/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policy.v2020_09_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The alias type.
 */
public class Alias {
    /**
     * The alias name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The paths for an alias.
     */
    @JsonProperty(value = "paths")
    private List<AliasPath> paths;

    /**
     * The type of the alias. Possible values include: 'NotSpecified',
     * 'PlainText', 'Mask'.
     */
    @JsonProperty(value = "type")
    private AliasType type;

    /**
     * The default path for an alias.
     */
    @JsonProperty(value = "defaultPath")
    private String defaultPath;

    /**
     * The default pattern for an alias.
     */
    @JsonProperty(value = "defaultPattern")
    private AliasPattern defaultPattern;

    /**
     * The default alias path metadata. Applies to the default path and to any
     * alias path that doesn't have metadata.
     */
    @JsonProperty(value = "defaultMetadata", access = JsonProperty.Access.WRITE_ONLY)
    private AliasPathMetadata defaultMetadata;

    /**
     * Get the alias name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the alias name.
     *
     * @param name the name value to set
     * @return the Alias object itself.
     */
    public Alias withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the paths for an alias.
     *
     * @return the paths value
     */
    public List<AliasPath> paths() {
        return this.paths;
    }

    /**
     * Set the paths for an alias.
     *
     * @param paths the paths value to set
     * @return the Alias object itself.
     */
    public Alias withPaths(List<AliasPath> paths) {
        this.paths = paths;
        return this;
    }

    /**
     * Get the type of the alias. Possible values include: 'NotSpecified', 'PlainText', 'Mask'.
     *
     * @return the type value
     */
    public AliasType type() {
        return this.type;
    }

    /**
     * Set the type of the alias. Possible values include: 'NotSpecified', 'PlainText', 'Mask'.
     *
     * @param type the type value to set
     * @return the Alias object itself.
     */
    public Alias withType(AliasType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the default path for an alias.
     *
     * @return the defaultPath value
     */
    public String defaultPath() {
        return this.defaultPath;
    }

    /**
     * Set the default path for an alias.
     *
     * @param defaultPath the defaultPath value to set
     * @return the Alias object itself.
     */
    public Alias withDefaultPath(String defaultPath) {
        this.defaultPath = defaultPath;
        return this;
    }

    /**
     * Get the default pattern for an alias.
     *
     * @return the defaultPattern value
     */
    public AliasPattern defaultPattern() {
        return this.defaultPattern;
    }

    /**
     * Set the default pattern for an alias.
     *
     * @param defaultPattern the defaultPattern value to set
     * @return the Alias object itself.
     */
    public Alias withDefaultPattern(AliasPattern defaultPattern) {
        this.defaultPattern = defaultPattern;
        return this;
    }

    /**
     * Get the default alias path metadata. Applies to the default path and to any alias path that doesn't have metadata.
     *
     * @return the defaultMetadata value
     */
    public AliasPathMetadata defaultMetadata() {
        return this.defaultMetadata;
    }

}
