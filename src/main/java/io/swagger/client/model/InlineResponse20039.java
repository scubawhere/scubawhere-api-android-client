/**
 * Scubawhere API Documentation
 * This is the documentation for scubawhere's RMS API. This API is only to be used by authorized parties with valid auth tokens.  [Learn about scubawhere](http://www.scubawhere.com) to become an authorized consumer of our API 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: bryan@scubawhere.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.swagger.client.model;

import io.swagger.client.model.Payment;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class InlineResponse20039  {
  
  @SerializedName("refunds")
  private List<Payment> refunds = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Payment> getRefunds() {
    return refunds;
  }
  public void setRefunds(List<Payment> refunds) {
    this.refunds = refunds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20039 inlineResponse20039 = (InlineResponse20039) o;
    return (refunds == null ? inlineResponse20039.refunds == null : refunds.equals(inlineResponse20039.refunds));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (refunds == null ? 0: refunds.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20039 {\n");
    
    sb.append("  refunds: ").append(refunds).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
