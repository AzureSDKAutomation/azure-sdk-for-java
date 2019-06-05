/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01.implementation;

import java.util.List;
import com.microsoft.azure.management.apimanagement.v2019_01_01.EmailTemplateParametersContractProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Email Template details.
 */
@JsonFlatten
public class EmailTemplateContractInner extends ProxyResource {
    /**
     * Subject of the Template.
     */
    @JsonProperty(value = "properties.subject", required = true)
    private String subject;

    /**
     * Email Template Body. This should be a valid XDocument.
     */
    @JsonProperty(value = "properties.body", required = true)
    private String body;

    /**
     * Title of the Template.
     */
    @JsonProperty(value = "properties.title")
    private String title;

    /**
     * Description of the Email Template.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Whether the template is the default template provided by Api Management
     * or has been edited.
     */
    @JsonProperty(value = "properties.isDefault", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isDefault;

    /**
     * Email Template Parameter values.
     */
    @JsonProperty(value = "properties.parameters")
    private List<EmailTemplateParametersContractProperties> parameters;

    /**
     * Get subject of the Template.
     *
     * @return the subject value
     */
    public String subject() {
        return this.subject;
    }

    /**
     * Set subject of the Template.
     *
     * @param subject the subject value to set
     * @return the EmailTemplateContractInner object itself.
     */
    public EmailTemplateContractInner withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Get email Template Body. This should be a valid XDocument.
     *
     * @return the body value
     */
    public String body() {
        return this.body;
    }

    /**
     * Set email Template Body. This should be a valid XDocument.
     *
     * @param body the body value to set
     * @return the EmailTemplateContractInner object itself.
     */
    public EmailTemplateContractInner withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * Get title of the Template.
     *
     * @return the title value
     */
    public String title() {
        return this.title;
    }

    /**
     * Set title of the Template.
     *
     * @param title the title value to set
     * @return the EmailTemplateContractInner object itself.
     */
    public EmailTemplateContractInner withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get description of the Email Template.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description of the Email Template.
     *
     * @param description the description value to set
     * @return the EmailTemplateContractInner object itself.
     */
    public EmailTemplateContractInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get whether the template is the default template provided by Api Management or has been edited.
     *
     * @return the isDefault value
     */
    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * Get email Template Parameter values.
     *
     * @return the parameters value
     */
    public List<EmailTemplateParametersContractProperties> parameters() {
        return this.parameters;
    }

    /**
     * Set email Template Parameter values.
     *
     * @param parameters the parameters value to set
     * @return the EmailTemplateContractInner object itself.
     */
    public EmailTemplateContractInner withParameters(List<EmailTemplateParametersContractProperties> parameters) {
        this.parameters = parameters;
        return this;
    }

}
