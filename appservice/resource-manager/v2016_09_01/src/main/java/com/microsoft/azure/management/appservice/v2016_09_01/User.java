/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * User credentials used for publishing activity.
 */
@JsonFlatten
public class User extends ProxyOnlyResource {
    /**
     * Username.
     */
    @JsonProperty(value = "properties.name")
    private String userName;

    /**
     * Username used for publishing.
     */
    @JsonProperty(value = "properties.publishingUserName", required = true)
    private String publishingUserName;

    /**
     * Password used for publishing.
     */
    @JsonProperty(value = "properties.publishingPassword")
    private String publishingPassword;

    /**
     * Password hash used for publishing.
     */
    @JsonProperty(value = "properties.publishingPasswordHash")
    private String publishingPasswordHash;

    /**
     * Password hash salt used for publishing.
     */
    @JsonProperty(value = "properties.publishingPasswordHashSalt")
    private String publishingPasswordHashSalt;

    /**
     * Get username.
     *
     * @return the userName value
     */
    public String userName() {
        return this.userName;
    }

    /**
     * Set username.
     *
     * @param userName the userName value to set
     * @return the User object itself.
     */
    public User withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get username used for publishing.
     *
     * @return the publishingUserName value
     */
    public String publishingUserName() {
        return this.publishingUserName;
    }

    /**
     * Set username used for publishing.
     *
     * @param publishingUserName the publishingUserName value to set
     * @return the User object itself.
     */
    public User withPublishingUserName(String publishingUserName) {
        this.publishingUserName = publishingUserName;
        return this;
    }

    /**
     * Get password used for publishing.
     *
     * @return the publishingPassword value
     */
    public String publishingPassword() {
        return this.publishingPassword;
    }

    /**
     * Set password used for publishing.
     *
     * @param publishingPassword the publishingPassword value to set
     * @return the User object itself.
     */
    public User withPublishingPassword(String publishingPassword) {
        this.publishingPassword = publishingPassword;
        return this;
    }

    /**
     * Get password hash used for publishing.
     *
     * @return the publishingPasswordHash value
     */
    public String publishingPasswordHash() {
        return this.publishingPasswordHash;
    }

    /**
     * Set password hash used for publishing.
     *
     * @param publishingPasswordHash the publishingPasswordHash value to set
     * @return the User object itself.
     */
    public User withPublishingPasswordHash(String publishingPasswordHash) {
        this.publishingPasswordHash = publishingPasswordHash;
        return this;
    }

    /**
     * Get password hash salt used for publishing.
     *
     * @return the publishingPasswordHashSalt value
     */
    public String publishingPasswordHashSalt() {
        return this.publishingPasswordHashSalt;
    }

    /**
     * Set password hash salt used for publishing.
     *
     * @param publishingPasswordHashSalt the publishingPasswordHashSalt value to set
     * @return the User object itself.
     */
    public User withPublishingPasswordHashSalt(String publishingPasswordHashSalt) {
        this.publishingPasswordHashSalt = publishingPasswordHashSalt;
        return this;
    }

}
