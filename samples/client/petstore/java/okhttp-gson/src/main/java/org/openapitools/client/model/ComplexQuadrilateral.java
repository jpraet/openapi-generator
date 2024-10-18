/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * ComplexQuadrilateral
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0-SNAPSHOT")
public class ComplexQuadrilateral {
  public static final String SERIALIZED_NAME_SHAPE_TYPE = "shapeType";
  @SerializedName(SERIALIZED_NAME_SHAPE_TYPE)
  @javax.annotation.Nonnull
  private String shapeType;

  public static final String SERIALIZED_NAME_QUADRILATERAL_TYPE = "quadrilateralType";
  @SerializedName(SERIALIZED_NAME_QUADRILATERAL_TYPE)
  @javax.annotation.Nonnull
  private String quadrilateralType;

  public ComplexQuadrilateral() {
  }

  public ComplexQuadrilateral shapeType(@javax.annotation.Nonnull String shapeType) {
    this.shapeType = shapeType;
    return this;
  }

  /**
   * Get shapeType
   * @return shapeType
   */
  @javax.annotation.Nonnull
  public String getShapeType() {
    return shapeType;
  }

  public void setShapeType(@javax.annotation.Nonnull String shapeType) {
    this.shapeType = shapeType;
  }


  public ComplexQuadrilateral quadrilateralType(@javax.annotation.Nonnull String quadrilateralType) {
    this.quadrilateralType = quadrilateralType;
    return this;
  }

  /**
   * Get quadrilateralType
   * @return quadrilateralType
   */
  @javax.annotation.Nonnull
  public String getQuadrilateralType() {
    return quadrilateralType;
  }

  public void setQuadrilateralType(@javax.annotation.Nonnull String quadrilateralType) {
    this.quadrilateralType = quadrilateralType;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the ComplexQuadrilateral instance itself
   */
  public ComplexQuadrilateral putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComplexQuadrilateral complexQuadrilateral = (ComplexQuadrilateral) o;
    return Objects.equals(this.shapeType, complexQuadrilateral.shapeType) &&
        Objects.equals(this.quadrilateralType, complexQuadrilateral.quadrilateralType)&&
        Objects.equals(this.additionalProperties, complexQuadrilateral.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shapeType, quadrilateralType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComplexQuadrilateral {\n");
    sb.append("    shapeType: ").append(toIndentedString(shapeType)).append("\n");
    sb.append("    quadrilateralType: ").append(toIndentedString(quadrilateralType)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("shapeType");
    openapiFields.add("quadrilateralType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("shapeType");
    openapiRequiredFields.add("quadrilateralType");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ComplexQuadrilateral
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ComplexQuadrilateral.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ComplexQuadrilateral is not found in the empty JSON string", ComplexQuadrilateral.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ComplexQuadrilateral.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("shapeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shapeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shapeType").toString()));
      }
      if (!jsonObj.get("quadrilateralType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quadrilateralType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quadrilateralType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ComplexQuadrilateral.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ComplexQuadrilateral' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ComplexQuadrilateral> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ComplexQuadrilateral.class));

       return (TypeAdapter<T>) new TypeAdapter<ComplexQuadrilateral>() {
           @Override
           public void write(JsonWriter out, ComplexQuadrilateral value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public ComplexQuadrilateral read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ComplexQuadrilateral instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ComplexQuadrilateral given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ComplexQuadrilateral
   * @throws IOException if the JSON string is invalid with respect to ComplexQuadrilateral
   */
  public static ComplexQuadrilateral fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ComplexQuadrilateral.class);
  }

  /**
   * Convert an instance of ComplexQuadrilateral to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

