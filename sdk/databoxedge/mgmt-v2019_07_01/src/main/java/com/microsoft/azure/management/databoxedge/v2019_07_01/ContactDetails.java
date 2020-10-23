/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_07_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains all the contact details of the customer.
 */
public class ContactDetails {
    /**
     * The contact person name.
     */
    @JsonProperty(value = "contactPerson", required = true)
    private String contactPerson;

    /**
     * The name of the company.
     */
    @JsonProperty(value = "companyName", required = true)
    private String companyName;

    /**
     * The phone number.
     */
    @JsonProperty(value = "phone", required = true)
    private String phone;

    /**
     * The email list.
     */
    @JsonProperty(value = "emailList", required = true)
    private List<String> emailList;

    /**
     * Get the contact person name.
     *
     * @return the contactPerson value
     */
    public String contactPerson() {
        return this.contactPerson;
    }

    /**
     * Set the contact person name.
     *
     * @param contactPerson the contactPerson value to set
     * @return the ContactDetails object itself.
     */
    public ContactDetails withContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
        return this;
    }

    /**
     * Get the name of the company.
     *
     * @return the companyName value
     */
    public String companyName() {
        return this.companyName;
    }

    /**
     * Set the name of the company.
     *
     * @param companyName the companyName value to set
     * @return the ContactDetails object itself.
     */
    public ContactDetails withCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     * Get the phone number.
     *
     * @return the phone value
     */
    public String phone() {
        return this.phone;
    }

    /**
     * Set the phone number.
     *
     * @param phone the phone value to set
     * @return the ContactDetails object itself.
     */
    public ContactDetails withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Get the email list.
     *
     * @return the emailList value
     */
    public List<String> emailList() {
        return this.emailList;
    }

    /**
     * Set the email list.
     *
     * @param emailList the emailList value to set
     * @return the ContactDetails object itself.
     */
    public ContactDetails withEmailList(List<String> emailList) {
        this.emailList = emailList;
        return this;
    }

}
