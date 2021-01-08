// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Label category definition. */
@Fluent
public final class LabelCategory {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LabelCategory.class);

    /*
     * Display name of the label category.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Indicates whether it is allowed to select multiple classes in this
     * category.
     */
    @JsonProperty(value = "allowMultiSelect")
    private Boolean allowMultiSelect;

    /*
     * Dictionary of label classes in this category.
     */
    @JsonProperty(value = "classes")
    private Map<String, LabelClass> classes;

    /**
     * Get the displayName property: Display name of the label category.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name of the label category.
     *
     * @param displayName the displayName value to set.
     * @return the LabelCategory object itself.
     */
    public LabelCategory withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the allowMultiSelect property: Indicates whether it is allowed to select multiple classes in this category.
     *
     * @return the allowMultiSelect value.
     */
    public Boolean allowMultiSelect() {
        return this.allowMultiSelect;
    }

    /**
     * Set the allowMultiSelect property: Indicates whether it is allowed to select multiple classes in this category.
     *
     * @param allowMultiSelect the allowMultiSelect value to set.
     * @return the LabelCategory object itself.
     */
    public LabelCategory withAllowMultiSelect(Boolean allowMultiSelect) {
        this.allowMultiSelect = allowMultiSelect;
        return this;
    }

    /**
     * Get the classes property: Dictionary of label classes in this category.
     *
     * @return the classes value.
     */
    public Map<String, LabelClass> classes() {
        return this.classes;
    }

    /**
     * Set the classes property: Dictionary of label classes in this category.
     *
     * @param classes the classes value to set.
     * @return the LabelCategory object itself.
     */
    public LabelCategory withClasses(Map<String, LabelClass> classes) {
        this.classes = classes;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (classes() != null) {
            classes()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}
