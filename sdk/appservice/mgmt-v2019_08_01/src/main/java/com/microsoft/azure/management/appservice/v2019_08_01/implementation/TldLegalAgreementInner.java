/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Legal agreement for a top level domain.
 */
public class TldLegalAgreementInner {
    /**
     * Unique identifier for the agreement.
     */
    @JsonProperty(value = "agreementKey", required = true)
    private String agreementKey;

    /**
     * Agreement title.
     */
    @JsonProperty(value = "title", required = true)
    private String title;

    /**
     * Agreement details.
     */
    @JsonProperty(value = "content", required = true)
    private String content;

    /**
     * URL where a copy of the agreement details is hosted.
     */
    @JsonProperty(value = "url")
    private String url;

    /**
     * Get unique identifier for the agreement.
     *
     * @return the agreementKey value
     */
    public String agreementKey() {
        return this.agreementKey;
    }

    /**
     * Set unique identifier for the agreement.
     *
     * @param agreementKey the agreementKey value to set
     * @return the TldLegalAgreementInner object itself.
     */
    public TldLegalAgreementInner withAgreementKey(String agreementKey) {
        this.agreementKey = agreementKey;
        return this;
    }

    /**
     * Get agreement title.
     *
     * @return the title value
     */
    public String title() {
        return this.title;
    }

    /**
     * Set agreement title.
     *
     * @param title the title value to set
     * @return the TldLegalAgreementInner object itself.
     */
    public TldLegalAgreementInner withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get agreement details.
     *
     * @return the content value
     */
    public String content() {
        return this.content;
    }

    /**
     * Set agreement details.
     *
     * @param content the content value to set
     * @return the TldLegalAgreementInner object itself.
     */
    public TldLegalAgreementInner withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get uRL where a copy of the agreement details is hosted.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set uRL where a copy of the agreement details is hosted.
     *
     * @param url the url value to set
     * @return the TldLegalAgreementInner object itself.
     */
    public TldLegalAgreementInner withUrl(String url) {
        this.url = url;
        return this;
    }

}
