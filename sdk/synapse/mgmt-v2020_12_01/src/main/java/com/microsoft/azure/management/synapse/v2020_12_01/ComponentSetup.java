/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The custom setup of installing 3rd party components.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = ComponentSetup.class)
@JsonTypeName("ComponentSetup")
@JsonFlatten
public class ComponentSetup extends CustomSetupBase {
    /**
     * The name of the 3rd party component.
     */
    @JsonProperty(value = "typeProperties.componentName", required = true)
    private String componentName;

    /**
     * The license key to activate the component.
     */
    @JsonProperty(value = "typeProperties.licenseKey")
    private SecretBase licenseKey;

    /**
     * Get the name of the 3rd party component.
     *
     * @return the componentName value
     */
    public String componentName() {
        return this.componentName;
    }

    /**
     * Set the name of the 3rd party component.
     *
     * @param componentName the componentName value to set
     * @return the ComponentSetup object itself.
     */
    public ComponentSetup withComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }

    /**
     * Get the license key to activate the component.
     *
     * @return the licenseKey value
     */
    public SecretBase licenseKey() {
        return this.licenseKey;
    }

    /**
     * Set the license key to activate the component.
     *
     * @param licenseKey the licenseKey value to set
     * @return the ComponentSetup object itself.
     */
    public ComponentSetup withLicenseKey(SecretBase licenseKey) {
        this.licenseKey = licenseKey;
        return this;
    }

}