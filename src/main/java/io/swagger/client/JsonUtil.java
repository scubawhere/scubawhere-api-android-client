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

package io.swagger.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import io.swagger.client.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Accommodation".equalsIgnoreCase(className)) {
      return new TypeToken<List<Accommodation>>(){}.getType();
    }
    
    if ("Addon".equalsIgnoreCase(className)) {
      return new TypeToken<List<Addon>>(){}.getType();
    }
    
    if ("Agent".equalsIgnoreCase(className)) {
      return new TypeToken<List<Agent>>(){}.getType();
    }
    
    if ("BasePrice".equalsIgnoreCase(className)) {
      return new TypeToken<List<BasePrice>>(){}.getType();
    }
    
    if ("Boat".equalsIgnoreCase(className)) {
      return new TypeToken<List<Boat>>(){}.getType();
    }
    
    if ("Boatroom".equalsIgnoreCase(className)) {
      return new TypeToken<List<Boatroom>>(){}.getType();
    }
    
    if ("Booking".equalsIgnoreCase(className)) {
      return new TypeToken<List<Booking>>(){}.getType();
    }
    
    if ("Company".equalsIgnoreCase(className)) {
      return new TypeToken<List<Company>>(){}.getType();
    }
    
    if ("Country".equalsIgnoreCase(className)) {
      return new TypeToken<List<Country>>(){}.getType();
    }
    
    if ("Course".equalsIgnoreCase(className)) {
      return new TypeToken<List<Course>>(){}.getType();
    }
    
    if ("Currency".equalsIgnoreCase(className)) {
      return new TypeToken<List<Currency>>(){}.getType();
    }
    
    if ("Customer".equalsIgnoreCase(className)) {
      return new TypeToken<List<Customer>>(){}.getType();
    }
    
    if ("DateRange".equalsIgnoreCase(className)) {
      return new TypeToken<List<DateRange>>(){}.getType();
    }
    
    if ("ErrorModel".equalsIgnoreCase(className)) {
      return new TypeToken<List<ErrorModel>>(){}.getType();
    }
    
    if ("InlineResponse200".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse200>>(){}.getType();
    }
    
    if ("InlineResponse2001".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2001>>(){}.getType();
    }
    
    if ("InlineResponse20010".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20010>>(){}.getType();
    }
    
    if ("InlineResponse20011".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20011>>(){}.getType();
    }
    
    if ("InlineResponse20012".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20012>>(){}.getType();
    }
    
    if ("InlineResponse20013".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20013>>(){}.getType();
    }
    
    if ("InlineResponse20014".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20014>>(){}.getType();
    }
    
    if ("InlineResponse20015".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20015>>(){}.getType();
    }
    
    if ("InlineResponse20016".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20016>>(){}.getType();
    }
    
    if ("InlineResponse20017".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20017>>(){}.getType();
    }
    
    if ("InlineResponse20018".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20018>>(){}.getType();
    }
    
    if ("InlineResponse20019".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20019>>(){}.getType();
    }
    
    if ("InlineResponse2002".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2002>>(){}.getType();
    }
    
    if ("InlineResponse20020".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20020>>(){}.getType();
    }
    
    if ("InlineResponse20021".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20021>>(){}.getType();
    }
    
    if ("InlineResponse20022".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20022>>(){}.getType();
    }
    
    if ("InlineResponse20023".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20023>>(){}.getType();
    }
    
    if ("InlineResponse20024".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20024>>(){}.getType();
    }
    
    if ("InlineResponse20025".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20025>>(){}.getType();
    }
    
    if ("InlineResponse20026".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20026>>(){}.getType();
    }
    
    if ("InlineResponse20027".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20027>>(){}.getType();
    }
    
    if ("InlineResponse20028".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20028>>(){}.getType();
    }
    
    if ("InlineResponse20029".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20029>>(){}.getType();
    }
    
    if ("InlineResponse2003".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2003>>(){}.getType();
    }
    
    if ("InlineResponse20030".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20030>>(){}.getType();
    }
    
    if ("InlineResponse20031".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20031>>(){}.getType();
    }
    
    if ("InlineResponse20032".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20032>>(){}.getType();
    }
    
    if ("InlineResponse20033".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20033>>(){}.getType();
    }
    
    if ("InlineResponse20034".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20034>>(){}.getType();
    }
    
    if ("InlineResponse20035".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20035>>(){}.getType();
    }
    
    if ("InlineResponse20036".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20036>>(){}.getType();
    }
    
    if ("InlineResponse20037".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20037>>(){}.getType();
    }
    
    if ("InlineResponse20038".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20038>>(){}.getType();
    }
    
    if ("InlineResponse20039".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20039>>(){}.getType();
    }
    
    if ("InlineResponse2004".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2004>>(){}.getType();
    }
    
    if ("InlineResponse20040".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20040>>(){}.getType();
    }
    
    if ("InlineResponse20041".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20041>>(){}.getType();
    }
    
    if ("InlineResponse20042".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20042>>(){}.getType();
    }
    
    if ("InlineResponse20042Utilisation".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20042Utilisation>>(){}.getType();
    }
    
    if ("InlineResponse20042UtilisationTotals".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20042UtilisationTotals>>(){}.getType();
    }
    
    if ("InlineResponse20043".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20043>>(){}.getType();
    }
    
    if ("InlineResponse20044".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20044>>(){}.getType();
    }
    
    if ("InlineResponse20045".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20045>>(){}.getType();
    }
    
    if ("InlineResponse20046".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20046>>(){}.getType();
    }
    
    if ("InlineResponse20047".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse20047>>(){}.getType();
    }
    
    if ("InlineResponse2005".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2005>>(){}.getType();
    }
    
    if ("InlineResponse2006".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2006>>(){}.getType();
    }
    
    if ("InlineResponse2007".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2007>>(){}.getType();
    }
    
    if ("InlineResponse2008".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2008>>(){}.getType();
    }
    
    if ("InlineResponse2009".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2009>>(){}.getType();
    }
    
    if ("InlineResponse201".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse201>>(){}.getType();
    }
    
    if ("InlineResponse2011".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2011>>(){}.getType();
    }
    
    if ("InlineResponse2012".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2012>>(){}.getType();
    }
    
    if ("InlineResponse2013".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2013>>(){}.getType();
    }
    
    if ("InlineResponse2014".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2014>>(){}.getType();
    }
    
    if ("InlineResponse2015".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse2015>>(){}.getType();
    }
    
    if ("Location".equalsIgnoreCase(className)) {
      return new TypeToken<List<Location>>(){}.getType();
    }
    
    if ("ModelPackage".equalsIgnoreCase(className)) {
      return new TypeToken<List<ModelPackage>>(){}.getType();
    }
    
    if ("Payment".equalsIgnoreCase(className)) {
      return new TypeToken<List<Payment>>(){}.getType();
    }
    
    if ("PaymentGateway".equalsIgnoreCase(className)) {
      return new TypeToken<List<PaymentGateway>>(){}.getType();
    }
    
    if ("Pickup".equalsIgnoreCase(className)) {
      return new TypeToken<List<Pickup>>(){}.getType();
    }
    
    if ("Refund".equalsIgnoreCase(className)) {
      return new TypeToken<List<Refund>>(){}.getType();
    }
    
    if ("ReportEntry".equalsIgnoreCase(className)) {
      return new TypeToken<List<ReportEntry>>(){}.getType();
    }
    
    if ("ReportEntryTotal".equalsIgnoreCase(className)) {
      return new TypeToken<List<ReportEntryTotal>>(){}.getType();
    }
    
    if ("Schedule".equalsIgnoreCase(className)) {
      return new TypeToken<List<Schedule>>(){}.getType();
    }
    
    if ("Session".equalsIgnoreCase(className)) {
      return new TypeToken<List<Session>>(){}.getType();
    }
    
    if ("Tag".equalsIgnoreCase(className)) {
      return new TypeToken<List<Tag>>(){}.getType();
    }
    
    if ("Ticket".equalsIgnoreCase(className)) {
      return new TypeToken<List<Ticket>>(){}.getType();
    }
    
    if ("Timetable".equalsIgnoreCase(className)) {
      return new TypeToken<List<Timetable>>(){}.getType();
    }
    
    if ("Training".equalsIgnoreCase(className)) {
      return new TypeToken<List<Training>>(){}.getType();
    }
    
    if ("TrainingSession".equalsIgnoreCase(className)) {
      return new TypeToken<List<TrainingSession>>(){}.getType();
    }
    
    if ("TrainingSessionManifest".equalsIgnoreCase(className)) {
      return new TypeToken<List<TrainingSessionManifest>>(){}.getType();
    }
    
    if ("TrainingSessionManifestCapacity".equalsIgnoreCase(className)) {
      return new TypeToken<List<TrainingSessionManifestCapacity>>(){}.getType();
    }
    
    if ("Trip".equalsIgnoreCase(className)) {
      return new TypeToken<List<Trip>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Accommodation".equalsIgnoreCase(className)) {
      return new TypeToken<Accommodation>(){}.getType();
    }
    
    if ("Addon".equalsIgnoreCase(className)) {
      return new TypeToken<Addon>(){}.getType();
    }
    
    if ("Agent".equalsIgnoreCase(className)) {
      return new TypeToken<Agent>(){}.getType();
    }
    
    if ("BasePrice".equalsIgnoreCase(className)) {
      return new TypeToken<BasePrice>(){}.getType();
    }
    
    if ("Boat".equalsIgnoreCase(className)) {
      return new TypeToken<Boat>(){}.getType();
    }
    
    if ("Boatroom".equalsIgnoreCase(className)) {
      return new TypeToken<Boatroom>(){}.getType();
    }
    
    if ("Booking".equalsIgnoreCase(className)) {
      return new TypeToken<Booking>(){}.getType();
    }
    
    if ("Company".equalsIgnoreCase(className)) {
      return new TypeToken<Company>(){}.getType();
    }
    
    if ("Country".equalsIgnoreCase(className)) {
      return new TypeToken<Country>(){}.getType();
    }
    
    if ("Course".equalsIgnoreCase(className)) {
      return new TypeToken<Course>(){}.getType();
    }
    
    if ("Currency".equalsIgnoreCase(className)) {
      return new TypeToken<Currency>(){}.getType();
    }
    
    if ("Customer".equalsIgnoreCase(className)) {
      return new TypeToken<Customer>(){}.getType();
    }
    
    if ("DateRange".equalsIgnoreCase(className)) {
      return new TypeToken<DateRange>(){}.getType();
    }
    
    if ("ErrorModel".equalsIgnoreCase(className)) {
      return new TypeToken<ErrorModel>(){}.getType();
    }
    
    if ("InlineResponse200".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse200>(){}.getType();
    }
    
    if ("InlineResponse2001".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2001>(){}.getType();
    }
    
    if ("InlineResponse20010".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20010>(){}.getType();
    }
    
    if ("InlineResponse20011".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20011>(){}.getType();
    }
    
    if ("InlineResponse20012".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20012>(){}.getType();
    }
    
    if ("InlineResponse20013".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20013>(){}.getType();
    }
    
    if ("InlineResponse20014".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20014>(){}.getType();
    }
    
    if ("InlineResponse20015".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20015>(){}.getType();
    }
    
    if ("InlineResponse20016".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20016>(){}.getType();
    }
    
    if ("InlineResponse20017".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20017>(){}.getType();
    }
    
    if ("InlineResponse20018".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20018>(){}.getType();
    }
    
    if ("InlineResponse20019".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20019>(){}.getType();
    }
    
    if ("InlineResponse2002".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2002>(){}.getType();
    }
    
    if ("InlineResponse20020".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20020>(){}.getType();
    }
    
    if ("InlineResponse20021".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20021>(){}.getType();
    }
    
    if ("InlineResponse20022".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20022>(){}.getType();
    }
    
    if ("InlineResponse20023".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20023>(){}.getType();
    }
    
    if ("InlineResponse20024".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20024>(){}.getType();
    }
    
    if ("InlineResponse20025".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20025>(){}.getType();
    }
    
    if ("InlineResponse20026".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20026>(){}.getType();
    }
    
    if ("InlineResponse20027".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20027>(){}.getType();
    }
    
    if ("InlineResponse20028".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20028>(){}.getType();
    }
    
    if ("InlineResponse20029".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20029>(){}.getType();
    }
    
    if ("InlineResponse2003".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2003>(){}.getType();
    }
    
    if ("InlineResponse20030".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20030>(){}.getType();
    }
    
    if ("InlineResponse20031".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20031>(){}.getType();
    }
    
    if ("InlineResponse20032".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20032>(){}.getType();
    }
    
    if ("InlineResponse20033".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20033>(){}.getType();
    }
    
    if ("InlineResponse20034".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20034>(){}.getType();
    }
    
    if ("InlineResponse20035".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20035>(){}.getType();
    }
    
    if ("InlineResponse20036".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20036>(){}.getType();
    }
    
    if ("InlineResponse20037".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20037>(){}.getType();
    }
    
    if ("InlineResponse20038".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20038>(){}.getType();
    }
    
    if ("InlineResponse20039".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20039>(){}.getType();
    }
    
    if ("InlineResponse2004".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2004>(){}.getType();
    }
    
    if ("InlineResponse20040".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20040>(){}.getType();
    }
    
    if ("InlineResponse20041".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20041>(){}.getType();
    }
    
    if ("InlineResponse20042".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20042>(){}.getType();
    }
    
    if ("InlineResponse20042Utilisation".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20042Utilisation>(){}.getType();
    }
    
    if ("InlineResponse20042UtilisationTotals".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20042UtilisationTotals>(){}.getType();
    }
    
    if ("InlineResponse20043".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20043>(){}.getType();
    }
    
    if ("InlineResponse20044".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20044>(){}.getType();
    }
    
    if ("InlineResponse20045".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20045>(){}.getType();
    }
    
    if ("InlineResponse20046".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20046>(){}.getType();
    }
    
    if ("InlineResponse20047".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse20047>(){}.getType();
    }
    
    if ("InlineResponse2005".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2005>(){}.getType();
    }
    
    if ("InlineResponse2006".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2006>(){}.getType();
    }
    
    if ("InlineResponse2007".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2007>(){}.getType();
    }
    
    if ("InlineResponse2008".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2008>(){}.getType();
    }
    
    if ("InlineResponse2009".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2009>(){}.getType();
    }
    
    if ("InlineResponse201".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse201>(){}.getType();
    }
    
    if ("InlineResponse2011".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2011>(){}.getType();
    }
    
    if ("InlineResponse2012".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2012>(){}.getType();
    }
    
    if ("InlineResponse2013".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2013>(){}.getType();
    }
    
    if ("InlineResponse2014".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2014>(){}.getType();
    }
    
    if ("InlineResponse2015".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse2015>(){}.getType();
    }
    
    if ("Location".equalsIgnoreCase(className)) {
      return new TypeToken<Location>(){}.getType();
    }
    
    if ("ModelPackage".equalsIgnoreCase(className)) {
      return new TypeToken<ModelPackage>(){}.getType();
    }
    
    if ("Payment".equalsIgnoreCase(className)) {
      return new TypeToken<Payment>(){}.getType();
    }
    
    if ("PaymentGateway".equalsIgnoreCase(className)) {
      return new TypeToken<PaymentGateway>(){}.getType();
    }
    
    if ("Pickup".equalsIgnoreCase(className)) {
      return new TypeToken<Pickup>(){}.getType();
    }
    
    if ("Refund".equalsIgnoreCase(className)) {
      return new TypeToken<Refund>(){}.getType();
    }
    
    if ("ReportEntry".equalsIgnoreCase(className)) {
      return new TypeToken<ReportEntry>(){}.getType();
    }
    
    if ("ReportEntryTotal".equalsIgnoreCase(className)) {
      return new TypeToken<ReportEntryTotal>(){}.getType();
    }
    
    if ("Schedule".equalsIgnoreCase(className)) {
      return new TypeToken<Schedule>(){}.getType();
    }
    
    if ("Session".equalsIgnoreCase(className)) {
      return new TypeToken<Session>(){}.getType();
    }
    
    if ("Tag".equalsIgnoreCase(className)) {
      return new TypeToken<Tag>(){}.getType();
    }
    
    if ("Ticket".equalsIgnoreCase(className)) {
      return new TypeToken<Ticket>(){}.getType();
    }
    
    if ("Timetable".equalsIgnoreCase(className)) {
      return new TypeToken<Timetable>(){}.getType();
    }
    
    if ("Training".equalsIgnoreCase(className)) {
      return new TypeToken<Training>(){}.getType();
    }
    
    if ("TrainingSession".equalsIgnoreCase(className)) {
      return new TypeToken<TrainingSession>(){}.getType();
    }
    
    if ("TrainingSessionManifest".equalsIgnoreCase(className)) {
      return new TypeToken<TrainingSessionManifest>(){}.getType();
    }
    
    if ("TrainingSessionManifestCapacity".equalsIgnoreCase(className)) {
      return new TypeToken<TrainingSessionManifestCapacity>(){}.getType();
    }
    
    if ("Trip".equalsIgnoreCase(className)) {
      return new TypeToken<Trip>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
