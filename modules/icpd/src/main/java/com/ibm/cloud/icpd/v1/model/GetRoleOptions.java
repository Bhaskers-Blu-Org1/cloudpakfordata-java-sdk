/*
 * (C) Copyright IBM Corp. 2019.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.icpd.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getRole options.
 */
public class GetRoleOptions extends GenericModel {

  private String roleName;
  private String accept;

  /**
   * Builder.
   */
  public static class Builder {
    private String roleName;
    private String accept;

    private Builder(GetRoleOptions getRoleOptions) {
      this.roleName = getRoleOptions.roleName;
      this.accept = getRoleOptions.accept;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param roleName the roleName
     */
    public Builder(String roleName) {
      this.roleName = roleName;
    }

    /**
     * Builds a GetRoleOptions.
     *
     * @return the getRoleOptions
     */
    public GetRoleOptions build() {
      return new GetRoleOptions(this);
    }

    /**
     * Set the roleName.
     *
     * @param roleName the roleName
     * @return the GetRoleOptions builder
     */
    public Builder roleName(String roleName) {
      this.roleName = roleName;
      return this;
    }

    /**
     * Set the accept.
     *
     * @param accept the accept
     * @return the GetRoleOptions builder
     */
    public Builder accept(String accept) {
      this.accept = accept;
      return this;
    }
  }

  private GetRoleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.roleName,
      "roleName cannot be empty");
    roleName = builder.roleName;
    accept = builder.accept;
  }

  /**
   * New builder.
   *
   * @return a GetRoleOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the roleName.
   *
   * existing role.
   *
   * @return the roleName
   */
  public String roleName() {
    return roleName;
  }

  /**
   * Gets the accept.
   *
   * The type of the response:  or *_/_*.
   *
   * @return the accept
   */
  public String accept() {
    return accept;
  }
}

