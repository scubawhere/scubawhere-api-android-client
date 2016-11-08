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

import java.util.*;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class InlineResponse20042Utilisation  {
  
  @SerializedName("date")
  private Date date = null;
  @SerializedName("name")
  private Date name = null;
  @SerializedName("relations")
  private List<Integer> relations = null;
  @SerializedName("assigned")
  private Integer assigned = null;
  @SerializedName("unassigned")
  private Integer unassigned = null;
  @SerializedName("capacity")
  private Integer capacity = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getName() {
    return name;
  }
  public void setName(Date name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Integer> getRelations() {
    return relations;
  }
  public void setRelations(List<Integer> relations) {
    this.relations = relations;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getAssigned() {
    return assigned;
  }
  public void setAssigned(Integer assigned) {
    this.assigned = assigned;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getUnassigned() {
    return unassigned;
  }
  public void setUnassigned(Integer unassigned) {
    this.unassigned = unassigned;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getCapacity() {
    return capacity;
  }
  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20042Utilisation inlineResponse20042Utilisation = (InlineResponse20042Utilisation) o;
    return (date == null ? inlineResponse20042Utilisation.date == null : date.equals(inlineResponse20042Utilisation.date)) &&
        (name == null ? inlineResponse20042Utilisation.name == null : name.equals(inlineResponse20042Utilisation.name)) &&
        (relations == null ? inlineResponse20042Utilisation.relations == null : relations.equals(inlineResponse20042Utilisation.relations)) &&
        (assigned == null ? inlineResponse20042Utilisation.assigned == null : assigned.equals(inlineResponse20042Utilisation.assigned)) &&
        (unassigned == null ? inlineResponse20042Utilisation.unassigned == null : unassigned.equals(inlineResponse20042Utilisation.unassigned)) &&
        (capacity == null ? inlineResponse20042Utilisation.capacity == null : capacity.equals(inlineResponse20042Utilisation.capacity));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (date == null ? 0: date.hashCode());
    result = 31 * result + (name == null ? 0: name.hashCode());
    result = 31 * result + (relations == null ? 0: relations.hashCode());
    result = 31 * result + (assigned == null ? 0: assigned.hashCode());
    result = 31 * result + (unassigned == null ? 0: unassigned.hashCode());
    result = 31 * result + (capacity == null ? 0: capacity.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20042Utilisation {\n");
    
    sb.append("  date: ").append(date).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  relations: ").append(relations).append("\n");
    sb.append("  assigned: ").append(assigned).append("\n");
    sb.append("  unassigned: ").append(unassigned).append("\n");
    sb.append("  capacity: ").append(capacity).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}