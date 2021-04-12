// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The collection of validation rule properties. */
@Fluent
public final class WebTestPropertiesValidationRules {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WebTestPropertiesValidationRules.class);

    /*
     * The collection of content validation properties
     */
    @JsonProperty(value = "ContentValidation")
    private WebTestPropertiesValidationRulesContentValidation contentValidation;

    /*
     * Checks to see if the SSL cert is still valid.
     */
    @JsonProperty(value = "SSLCheck")
    private Boolean sslCheck;

    /*
     * A number of days to check still remain before the the existing SSL cert
     * expires.  Value must be positive and the SSLCheck must be set to true.
     */
    @JsonProperty(value = "SSLCertRemainingLifetimeCheck")
    private Integer sslCertRemainingLifetimeCheck;

    /*
     * Validate that the WebTest returns the http status code provided.
     */
    @JsonProperty(value = "ExpectedHttpStatusCode")
    private Integer expectedHttpStatusCode;

    /*
     * When set, validation will ignore the status code.
     */
    @JsonProperty(value = "IgnoreHttpsStatusCode")
    private Boolean ignoreHttpsStatusCode;

    /**
     * Get the contentValidation property: The collection of content validation properties.
     *
     * @return the contentValidation value.
     */
    public WebTestPropertiesValidationRulesContentValidation contentValidation() {
        return this.contentValidation;
    }

    /**
     * Set the contentValidation property: The collection of content validation properties.
     *
     * @param contentValidation the contentValidation value to set.
     * @return the WebTestPropertiesValidationRules object itself.
     */
    public WebTestPropertiesValidationRules withContentValidation(
        WebTestPropertiesValidationRulesContentValidation contentValidation) {
        this.contentValidation = contentValidation;
        return this;
    }

    /**
     * Get the sslCheck property: Checks to see if the SSL cert is still valid.
     *
     * @return the sslCheck value.
     */
    public Boolean sslCheck() {
        return this.sslCheck;
    }

    /**
     * Set the sslCheck property: Checks to see if the SSL cert is still valid.
     *
     * @param sslCheck the sslCheck value to set.
     * @return the WebTestPropertiesValidationRules object itself.
     */
    public WebTestPropertiesValidationRules withSslCheck(Boolean sslCheck) {
        this.sslCheck = sslCheck;
        return this;
    }

    /**
     * Get the sslCertRemainingLifetimeCheck property: A number of days to check still remain before the the existing
     * SSL cert expires. Value must be positive and the SSLCheck must be set to true.
     *
     * @return the sslCertRemainingLifetimeCheck value.
     */
    public Integer sslCertRemainingLifetimeCheck() {
        return this.sslCertRemainingLifetimeCheck;
    }

    /**
     * Set the sslCertRemainingLifetimeCheck property: A number of days to check still remain before the the existing
     * SSL cert expires. Value must be positive and the SSLCheck must be set to true.
     *
     * @param sslCertRemainingLifetimeCheck the sslCertRemainingLifetimeCheck value to set.
     * @return the WebTestPropertiesValidationRules object itself.
     */
    public WebTestPropertiesValidationRules withSslCertRemainingLifetimeCheck(Integer sslCertRemainingLifetimeCheck) {
        this.sslCertRemainingLifetimeCheck = sslCertRemainingLifetimeCheck;
        return this;
    }

    /**
     * Get the expectedHttpStatusCode property: Validate that the WebTest returns the http status code provided.
     *
     * @return the expectedHttpStatusCode value.
     */
    public Integer expectedHttpStatusCode() {
        return this.expectedHttpStatusCode;
    }

    /**
     * Set the expectedHttpStatusCode property: Validate that the WebTest returns the http status code provided.
     *
     * @param expectedHttpStatusCode the expectedHttpStatusCode value to set.
     * @return the WebTestPropertiesValidationRules object itself.
     */
    public WebTestPropertiesValidationRules withExpectedHttpStatusCode(Integer expectedHttpStatusCode) {
        this.expectedHttpStatusCode = expectedHttpStatusCode;
        return this;
    }

    /**
     * Get the ignoreHttpsStatusCode property: When set, validation will ignore the status code.
     *
     * @return the ignoreHttpsStatusCode value.
     */
    public Boolean ignoreHttpsStatusCode() {
        return this.ignoreHttpsStatusCode;
    }

    /**
     * Set the ignoreHttpsStatusCode property: When set, validation will ignore the status code.
     *
     * @param ignoreHttpsStatusCode the ignoreHttpsStatusCode value to set.
     * @return the WebTestPropertiesValidationRules object itself.
     */
    public WebTestPropertiesValidationRules withIgnoreHttpsStatusCode(Boolean ignoreHttpsStatusCode) {
        this.ignoreHttpsStatusCode = ignoreHttpsStatusCode;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (contentValidation() != null) {
            contentValidation().validate();
        }
    }
}
