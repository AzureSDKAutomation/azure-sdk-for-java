// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The UserArtifactManage model. */
@Fluent
public final class UserArtifactManage {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UserArtifactManage.class);

    /*
     * Required. The path and arguments to install the gallery application.
     * This is limited to 4096 characters.
     */
    @JsonProperty(value = "install", required = true)
    private String install;

    /*
     * Required. The path and arguments to remove the gallery application. This
     * is limited to 4096 characters.
     */
    @JsonProperty(value = "remove", required = true)
    private String remove;

    /*
     * Optional. The path and arguments to update the gallery application. If
     * not present, then update operation will invoke remove command on the
     * previous version and install command on the current version of the
     * gallery application. This is limited to 4096 characters.
     */
    @JsonProperty(value = "update")
    private String update;

    /**
     * Get the install property: Required. The path and arguments to install the gallery application. This is limited to
     * 4096 characters.
     *
     * @return the install value.
     */
    public String install() {
        return this.install;
    }

    /**
     * Set the install property: Required. The path and arguments to install the gallery application. This is limited to
     * 4096 characters.
     *
     * @param install the install value to set.
     * @return the UserArtifactManage object itself.
     */
    public UserArtifactManage withInstall(String install) {
        this.install = install;
        return this;
    }

    /**
     * Get the remove property: Required. The path and arguments to remove the gallery application. This is limited to
     * 4096 characters.
     *
     * @return the remove value.
     */
    public String remove() {
        return this.remove;
    }

    /**
     * Set the remove property: Required. The path and arguments to remove the gallery application. This is limited to
     * 4096 characters.
     *
     * @param remove the remove value to set.
     * @return the UserArtifactManage object itself.
     */
    public UserArtifactManage withRemove(String remove) {
        this.remove = remove;
        return this;
    }

    /**
     * Get the update property: Optional. The path and arguments to update the gallery application. If not present, then
     * update operation will invoke remove command on the previous version and install command on the current version of
     * the gallery application. This is limited to 4096 characters.
     *
     * @return the update value.
     */
    public String update() {
        return this.update;
    }

    /**
     * Set the update property: Optional. The path and arguments to update the gallery application. If not present, then
     * update operation will invoke remove command on the previous version and install command on the current version of
     * the gallery application. This is limited to 4096 characters.
     *
     * @param update the update value to set.
     * @return the UserArtifactManage object itself.
     */
    public UserArtifactManage withUpdate(String update) {
        this.update = update;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (install() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property install in model UserArtifactManage"));
        }
        if (remove() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property remove in model UserArtifactManage"));
        }
    }
}
