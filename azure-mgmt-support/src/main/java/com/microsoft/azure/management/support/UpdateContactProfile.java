/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.support;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contact information associated with the support ticket.
 */
public class UpdateContactProfile {
    /**
     * First name.
     */
    @JsonProperty(value = "firstName")
    private String firstName;

    /**
     * Last name.
     */
    @JsonProperty(value = "lastName")
    private String lastName;

    /**
     * Preferred contact method. Possible values include: 'email', 'phone'.
     */
    @JsonProperty(value = "preferredContactMethod")
    private PreferredContactMethod preferredContactMethod;

    /**
     * Primary email address.
     */
    @JsonProperty(value = "primaryEmailAddress")
    private String primaryEmailAddress;

    /**
     * Email addresses listed will be copied on any correspondence about the
     * support ticket.
     */
    @JsonProperty(value = "additionalEmailAddresses")
    private List<String> additionalEmailAddresses;

    /**
     * Phone number. This is required if preferred contact method is phone.
     */
    @JsonProperty(value = "phoneNumber")
    private String phoneNumber;

    /**
     * Time zone of the user. This is the name of the time zone from &lt;a
     * target='_blank'
     * href='https://support.microsoft.com/en-us/help/973627/microsoft-time-zone-index-values'&gt;Microsoft
     * Time Zone Index Values&lt;/a&gt;.
     */
    @JsonProperty(value = "preferredTimeZone")
    private String preferredTimeZone;

    /**
     * Country of the user. This is the ISO 3166-1 alpha-3 code.
     */
    @JsonProperty(value = "country")
    private String country;

    /**
     * Preferred language of support from Azure. Support languages vary based
     * on the severity you choose for your support ticket. Learn more at &lt;a
     * target='_blank'
     * href='https://azure.microsoft.com/support/plans/response/'&gt;Azure
     * Severity and responsiveness&lt;/a&gt;. Use the standard language-country
     * code. Valid values are 'en-us' for English, 'zh-hans' for Chinese,
     * 'es-es' for Spanish, 'fr-fr' for French, 'ja-jp' for Japanese, 'ko-kr'
     * for Korean, 'ru-ru' for Russian, 'pt-br' for Portuguese, 'it-it' for
     * Italian, 'zh-tw' for Chinese and 'de-de' for German.
     */
    @JsonProperty(value = "preferredSupportLanguage")
    private String preferredSupportLanguage;

    /**
     * Get first name.
     *
     * @return the firstName value
     */
    public String firstName() {
        return this.firstName;
    }

    /**
     * Set first name.
     *
     * @param firstName the firstName value to set
     * @return the UpdateContactProfile object itself.
     */
    public UpdateContactProfile withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Get last name.
     *
     * @return the lastName value
     */
    public String lastName() {
        return this.lastName;
    }

    /**
     * Set last name.
     *
     * @param lastName the lastName value to set
     * @return the UpdateContactProfile object itself.
     */
    public UpdateContactProfile withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Get preferred contact method. Possible values include: 'email', 'phone'.
     *
     * @return the preferredContactMethod value
     */
    public PreferredContactMethod preferredContactMethod() {
        return this.preferredContactMethod;
    }

    /**
     * Set preferred contact method. Possible values include: 'email', 'phone'.
     *
     * @param preferredContactMethod the preferredContactMethod value to set
     * @return the UpdateContactProfile object itself.
     */
    public UpdateContactProfile withPreferredContactMethod(PreferredContactMethod preferredContactMethod) {
        this.preferredContactMethod = preferredContactMethod;
        return this;
    }

    /**
     * Get primary email address.
     *
     * @return the primaryEmailAddress value
     */
    public String primaryEmailAddress() {
        return this.primaryEmailAddress;
    }

    /**
     * Set primary email address.
     *
     * @param primaryEmailAddress the primaryEmailAddress value to set
     * @return the UpdateContactProfile object itself.
     */
    public UpdateContactProfile withPrimaryEmailAddress(String primaryEmailAddress) {
        this.primaryEmailAddress = primaryEmailAddress;
        return this;
    }

    /**
     * Get email addresses listed will be copied on any correspondence about the support ticket.
     *
     * @return the additionalEmailAddresses value
     */
    public List<String> additionalEmailAddresses() {
        return this.additionalEmailAddresses;
    }

    /**
     * Set email addresses listed will be copied on any correspondence about the support ticket.
     *
     * @param additionalEmailAddresses the additionalEmailAddresses value to set
     * @return the UpdateContactProfile object itself.
     */
    public UpdateContactProfile withAdditionalEmailAddresses(List<String> additionalEmailAddresses) {
        this.additionalEmailAddresses = additionalEmailAddresses;
        return this;
    }

    /**
     * Get phone number. This is required if preferred contact method is phone.
     *
     * @return the phoneNumber value
     */
    public String phoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Set phone number. This is required if preferred contact method is phone.
     *
     * @param phoneNumber the phoneNumber value to set
     * @return the UpdateContactProfile object itself.
     */
    public UpdateContactProfile withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Get time zone of the user. This is the name of the time zone from &lt;a  target='_blank' href='https://support.microsoft.com/en-us/help/973627/microsoft-time-zone-index-values'&gt;Microsoft Time Zone Index Values&lt;/a&gt;.
     *
     * @return the preferredTimeZone value
     */
    public String preferredTimeZone() {
        return this.preferredTimeZone;
    }

    /**
     * Set time zone of the user. This is the name of the time zone from &lt;a  target='_blank' href='https://support.microsoft.com/en-us/help/973627/microsoft-time-zone-index-values'&gt;Microsoft Time Zone Index Values&lt;/a&gt;.
     *
     * @param preferredTimeZone the preferredTimeZone value to set
     * @return the UpdateContactProfile object itself.
     */
    public UpdateContactProfile withPreferredTimeZone(String preferredTimeZone) {
        this.preferredTimeZone = preferredTimeZone;
        return this;
    }

    /**
     * Get country of the user. This is the ISO 3166-1 alpha-3 code.
     *
     * @return the country value
     */
    public String country() {
        return this.country;
    }

    /**
     * Set country of the user. This is the ISO 3166-1 alpha-3 code.
     *
     * @param country the country value to set
     * @return the UpdateContactProfile object itself.
     */
    public UpdateContactProfile withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Get preferred language of support from Azure. Support languages vary based on the severity you choose for your support ticket. Learn more at &lt;a  target='_blank' href='https://azure.microsoft.com/support/plans/response/'&gt;Azure Severity and responsiveness&lt;/a&gt;. Use the standard language-country code. Valid values are 'en-us' for English, 'zh-hans' for Chinese, 'es-es' for Spanish, 'fr-fr' for French, 'ja-jp' for Japanese, 'ko-kr' for Korean, 'ru-ru' for Russian, 'pt-br' for Portuguese, 'it-it' for Italian, 'zh-tw' for Chinese and 'de-de' for German.
     *
     * @return the preferredSupportLanguage value
     */
    public String preferredSupportLanguage() {
        return this.preferredSupportLanguage;
    }

    /**
     * Set preferred language of support from Azure. Support languages vary based on the severity you choose for your support ticket. Learn more at &lt;a  target='_blank' href='https://azure.microsoft.com/support/plans/response/'&gt;Azure Severity and responsiveness&lt;/a&gt;. Use the standard language-country code. Valid values are 'en-us' for English, 'zh-hans' for Chinese, 'es-es' for Spanish, 'fr-fr' for French, 'ja-jp' for Japanese, 'ko-kr' for Korean, 'ru-ru' for Russian, 'pt-br' for Portuguese, 'it-it' for Italian, 'zh-tw' for Chinese and 'de-de' for German.
     *
     * @param preferredSupportLanguage the preferredSupportLanguage value to set
     * @return the UpdateContactProfile object itself.
     */
    public UpdateContactProfile withPreferredSupportLanguage(String preferredSupportLanguage) {
        this.preferredSupportLanguage = preferredSupportLanguage;
        return this;
    }

}
