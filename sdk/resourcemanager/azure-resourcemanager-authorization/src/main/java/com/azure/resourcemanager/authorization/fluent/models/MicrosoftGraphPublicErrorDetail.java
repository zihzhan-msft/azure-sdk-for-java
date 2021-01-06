// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** publicErrorDetail. */
@Fluent
public final class MicrosoftGraphPublicErrorDetail {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphPublicErrorDetail.class);

    /*
     * The code property.
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * The message property.
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * The target property.
     */
    @JsonProperty(value = "target")
    private String target;

    /*
     * publicErrorDetail
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the code property: The code property.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: The code property.
     *
     * @param code the code value to set.
     * @return the MicrosoftGraphPublicErrorDetail object itself.
     */
    public MicrosoftGraphPublicErrorDetail withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: The message property.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: The message property.
     *
     * @param message the message value to set.
     * @return the MicrosoftGraphPublicErrorDetail object itself.
     */
    public MicrosoftGraphPublicErrorDetail withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the target property: The target property.
     *
     * @return the target value.
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target property: The target property.
     *
     * @param target the target value to set.
     * @return the MicrosoftGraphPublicErrorDetail object itself.
     */
    public MicrosoftGraphPublicErrorDetail withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the additionalProperties property: publicErrorDetail.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: publicErrorDetail.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphPublicErrorDetail object itself.
     */
    public MicrosoftGraphPublicErrorDetail withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}