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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** baseItem. */
@Fluent
public class MicrosoftGraphBaseItemInner extends MicrosoftGraphEntity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphBaseItemInner.class);

    /*
     * identitySet
     */
    @JsonProperty(value = "createdBy")
    private MicrosoftGraphIdentitySet createdBy;

    /*
     * Date and time of item creation. Read-only.
     */
    @JsonProperty(value = "createdDateTime")
    private OffsetDateTime createdDateTime;

    /*
     * Provides a user-visible description of the item. Optional.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * ETag for the item. Read-only.
     */
    @JsonProperty(value = "eTag")
    private String etag;

    /*
     * identitySet
     */
    @JsonProperty(value = "lastModifiedBy")
    private MicrosoftGraphIdentitySet lastModifiedBy;

    /*
     * Date and time the item was last modified. Read-only.
     */
    @JsonProperty(value = "lastModifiedDateTime")
    private OffsetDateTime lastModifiedDateTime;

    /*
     * The name of the item. Read-write.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * itemReference
     */
    @JsonProperty(value = "parentReference")
    private MicrosoftGraphItemReference parentReference;

    /*
     * URL that displays the resource in the browser. Read-only.
     */
    @JsonProperty(value = "webUrl")
    private String webUrl;

    /*
     * Represents an Azure Active Directory user object.
     */
    @JsonProperty(value = "createdByUser")
    private MicrosoftGraphUserInner createdByUser;

    /*
     * Represents an Azure Active Directory user object.
     */
    @JsonProperty(value = "lastModifiedByUser")
    private MicrosoftGraphUserInner lastModifiedByUser;

    /*
     * baseItem
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the createdBy property: identitySet.
     *
     * @return the createdBy value.
     */
    public MicrosoftGraphIdentitySet createdBy() {
        return this.createdBy;
    }

    /**
     * Set the createdBy property: identitySet.
     *
     * @param createdBy the createdBy value to set.
     * @return the MicrosoftGraphBaseItemInner object itself.
     */
    public MicrosoftGraphBaseItemInner withCreatedBy(MicrosoftGraphIdentitySet createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Get the createdDateTime property: Date and time of item creation. Read-only.
     *
     * @return the createdDateTime value.
     */
    public OffsetDateTime createdDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the createdDateTime property: Date and time of item creation. Read-only.
     *
     * @param createdDateTime the createdDateTime value to set.
     * @return the MicrosoftGraphBaseItemInner object itself.
     */
    public MicrosoftGraphBaseItemInner withCreatedDateTime(OffsetDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get the description property: Provides a user-visible description of the item. Optional.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Provides a user-visible description of the item. Optional.
     *
     * @param description the description value to set.
     * @return the MicrosoftGraphBaseItemInner object itself.
     */
    public MicrosoftGraphBaseItemInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the etag property: ETag for the item. Read-only.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: ETag for the item. Read-only.
     *
     * @param etag the etag value to set.
     * @return the MicrosoftGraphBaseItemInner object itself.
     */
    public MicrosoftGraphBaseItemInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the lastModifiedBy property: identitySet.
     *
     * @return the lastModifiedBy value.
     */
    public MicrosoftGraphIdentitySet lastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * Set the lastModifiedBy property: identitySet.
     *
     * @param lastModifiedBy the lastModifiedBy value to set.
     * @return the MicrosoftGraphBaseItemInner object itself.
     */
    public MicrosoftGraphBaseItemInner withLastModifiedBy(MicrosoftGraphIdentitySet lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     * Get the lastModifiedDateTime property: Date and time the item was last modified. Read-only.
     *
     * @return the lastModifiedDateTime value.
     */
    public OffsetDateTime lastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }

    /**
     * Set the lastModifiedDateTime property: Date and time the item was last modified. Read-only.
     *
     * @param lastModifiedDateTime the lastModifiedDateTime value to set.
     * @return the MicrosoftGraphBaseItemInner object itself.
     */
    public MicrosoftGraphBaseItemInner withLastModifiedDateTime(OffsetDateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
        return this;
    }

    /**
     * Get the name property: The name of the item. Read-write.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the item. Read-write.
     *
     * @param name the name value to set.
     * @return the MicrosoftGraphBaseItemInner object itself.
     */
    public MicrosoftGraphBaseItemInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the parentReference property: itemReference.
     *
     * @return the parentReference value.
     */
    public MicrosoftGraphItemReference parentReference() {
        return this.parentReference;
    }

    /**
     * Set the parentReference property: itemReference.
     *
     * @param parentReference the parentReference value to set.
     * @return the MicrosoftGraphBaseItemInner object itself.
     */
    public MicrosoftGraphBaseItemInner withParentReference(MicrosoftGraphItemReference parentReference) {
        this.parentReference = parentReference;
        return this;
    }

    /**
     * Get the webUrl property: URL that displays the resource in the browser. Read-only.
     *
     * @return the webUrl value.
     */
    public String webUrl() {
        return this.webUrl;
    }

    /**
     * Set the webUrl property: URL that displays the resource in the browser. Read-only.
     *
     * @param webUrl the webUrl value to set.
     * @return the MicrosoftGraphBaseItemInner object itself.
     */
    public MicrosoftGraphBaseItemInner withWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    /**
     * Get the createdByUser property: Represents an Azure Active Directory user object.
     *
     * @return the createdByUser value.
     */
    public MicrosoftGraphUserInner createdByUser() {
        return this.createdByUser;
    }

    /**
     * Set the createdByUser property: Represents an Azure Active Directory user object.
     *
     * @param createdByUser the createdByUser value to set.
     * @return the MicrosoftGraphBaseItemInner object itself.
     */
    public MicrosoftGraphBaseItemInner withCreatedByUser(MicrosoftGraphUserInner createdByUser) {
        this.createdByUser = createdByUser;
        return this;
    }

    /**
     * Get the lastModifiedByUser property: Represents an Azure Active Directory user object.
     *
     * @return the lastModifiedByUser value.
     */
    public MicrosoftGraphUserInner lastModifiedByUser() {
        return this.lastModifiedByUser;
    }

    /**
     * Set the lastModifiedByUser property: Represents an Azure Active Directory user object.
     *
     * @param lastModifiedByUser the lastModifiedByUser value to set.
     * @return the MicrosoftGraphBaseItemInner object itself.
     */
    public MicrosoftGraphBaseItemInner withLastModifiedByUser(MicrosoftGraphUserInner lastModifiedByUser) {
        this.lastModifiedByUser = lastModifiedByUser;
        return this;
    }

    /**
     * Get the additionalProperties property: baseItem.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: baseItem.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphBaseItemInner object itself.
     */
    public MicrosoftGraphBaseItemInner withAdditionalProperties(Map<String, Object> additionalProperties) {
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

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphBaseItemInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (createdBy() != null) {
            createdBy().validate();
        }
        if (lastModifiedBy() != null) {
            lastModifiedBy().validate();
        }
        if (parentReference() != null) {
            parentReference().validate();
        }
        if (createdByUser() != null) {
            createdByUser().validate();
        }
        if (lastModifiedByUser() != null) {
            lastModifiedByUser().validate();
        }
    }
}