// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Article of event. */
@Fluent
public final class EventPropertiesArticle {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EventPropertiesArticle.class);

    /*
     * Article content of event.
     */
    @JsonProperty(value = "articleContent")
    private String articleContent;

    /**
     * Get the articleContent property: Article content of event.
     *
     * @return the articleContent value.
     */
    public String articleContent() {
        return this.articleContent;
    }

    /**
     * Set the articleContent property: Article content of event.
     *
     * @param articleContent the articleContent value to set.
     * @return the EventPropertiesArticle object itself.
     */
    public EventPropertiesArticle withArticleContent(String articleContent) {
        this.articleContent = articleContent;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
