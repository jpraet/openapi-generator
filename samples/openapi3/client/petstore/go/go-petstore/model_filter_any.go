/*
OpenAPI Petstore

This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

API version: 1.0.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package petstore

import (
	"encoding/json"
	"fmt"
)

// checks if the FilterAny type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &FilterAny{}

// FilterAny struct for FilterAny
type FilterAny struct {
	FilterTypeRange *FilterTypeRange
	FilterTypeRegex *FilterTypeRegex
}

// Unmarshal JSON data into any of the pointers in the struct
func (dst *FilterAny) UnmarshalJSON(data []byte) error {
	var err error
	// use discriminator value to speed up the lookup
	var jsonDict map[string]interface{}
	err = json.Unmarshal(data, &jsonDict)
	if err != nil {
		return fmt.Errorf("failed to unmarshal JSON into map for the discriminator lookup")
	}

	// check if the discriminator value is 'range'
	if jsonDict["type"] == "range" {
		// try to unmarshal JSON data into FilterTypeRange
		err = json.Unmarshal(data, &dst.FilterTypeRange);
		if err == nil {
			jsonFilterTypeRange, _ := json.Marshal(dst.FilterTypeRange)
			if string(jsonFilterTypeRange) == "{}" { // empty struct
				dst.FilterTypeRange = nil
			} else {
				return nil // data stored in dst.FilterTypeRange, return on the first match
			}
		} else {
			dst.FilterTypeRange = nil
		}
	}

	// check if the discriminator value is 'set'
	if jsonDict["type"] == "set" {
		// try to unmarshal JSON data into FilterTypeRegex
		err = json.Unmarshal(data, &dst.FilterTypeRegex);
		if err == nil {
			jsonFilterTypeRegex, _ := json.Marshal(dst.FilterTypeRegex)
			if string(jsonFilterTypeRegex) == "{}" { // empty struct
				dst.FilterTypeRegex = nil
			} else {
				return nil // data stored in dst.FilterTypeRegex, return on the first match
			}
		} else {
			dst.FilterTypeRegex = nil
		}
	}

	// check if the discriminator value is 'FilterTypeRange'
	if jsonDict["type"] == "FilterTypeRange" {
		// try to unmarshal JSON data into FilterTypeRange
		err = json.Unmarshal(data, &dst.FilterTypeRange);
		if err == nil {
			jsonFilterTypeRange, _ := json.Marshal(dst.FilterTypeRange)
			if string(jsonFilterTypeRange) == "{}" { // empty struct
				dst.FilterTypeRange = nil
			} else {
				return nil // data stored in dst.FilterTypeRange, return on the first match
			}
		} else {
			dst.FilterTypeRange = nil
		}
	}

	// check if the discriminator value is 'FilterTypeRegex'
	if jsonDict["type"] == "FilterTypeRegex" {
		// try to unmarshal JSON data into FilterTypeRegex
		err = json.Unmarshal(data, &dst.FilterTypeRegex);
		if err == nil {
			jsonFilterTypeRegex, _ := json.Marshal(dst.FilterTypeRegex)
			if string(jsonFilterTypeRegex) == "{}" { // empty struct
				dst.FilterTypeRegex = nil
			} else {
				return nil // data stored in dst.FilterTypeRegex, return on the first match
			}
		} else {
			dst.FilterTypeRegex = nil
		}
	}

	// try to unmarshal JSON data into FilterTypeRange
	err = json.Unmarshal(data, &dst.FilterTypeRange);
	if err == nil {
		jsonFilterTypeRange, _ := json.Marshal(dst.FilterTypeRange)
		if string(jsonFilterTypeRange) == "{}" { // empty struct
			dst.FilterTypeRange = nil
		} else {
			return nil // data stored in dst.FilterTypeRange, return on the first match
		}
	} else {
		dst.FilterTypeRange = nil
	}

	// try to unmarshal JSON data into FilterTypeRegex
	err = json.Unmarshal(data, &dst.FilterTypeRegex);
	if err == nil {
		jsonFilterTypeRegex, _ := json.Marshal(dst.FilterTypeRegex)
		if string(jsonFilterTypeRegex) == "{}" { // empty struct
			dst.FilterTypeRegex = nil
		} else {
			return nil // data stored in dst.FilterTypeRegex, return on the first match
		}
	} else {
		dst.FilterTypeRegex = nil
	}

	return fmt.Errorf("data failed to match schemas in anyOf(FilterAny)")
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src FilterAny) MarshalJSON() ([]byte, error) {
	if src.FilterTypeRange != nil {
		return json.Marshal(&src.FilterTypeRange)
	}

	if src.FilterTypeRegex != nil {
		return json.Marshal(&src.FilterTypeRegex)
	}

	return nil, nil // no data in anyOf schemas
}

func (src FilterAny) ToMap() (map[string]interface{}, error) {
	if src.FilterTypeRange != nil {
		return src.FilterTypeRange.ToMap()
	}

	if src.FilterTypeRegex != nil {
		return src.FilterTypeRegex.ToMap()
	}

    return nil, nil // no data in anyOf schemas
}

type NullableFilterAny struct {
	value *FilterAny
	isSet bool
}

func (v NullableFilterAny) Get() *FilterAny {
	return v.value
}

func (v *NullableFilterAny) Set(val *FilterAny) {
	v.value = val
	v.isSet = true
}

func (v NullableFilterAny) IsSet() bool {
	return v.isSet
}

func (v *NullableFilterAny) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableFilterAny(val *FilterAny) *NullableFilterAny {
	return &NullableFilterAny{value: val, isSet: true}
}

func (v NullableFilterAny) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableFilterAny) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


