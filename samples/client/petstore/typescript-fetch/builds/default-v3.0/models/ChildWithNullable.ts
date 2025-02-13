/* tslint:disable */
/* eslint-disable */
/**
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

import { mapValues } from '../runtime';
import type { ParentWithNullable } from './ParentWithNullable';
import {
    ParentWithNullableFromJSON,
    ParentWithNullableFromJSONTyped,
    ParentWithNullableToJSON,
    ParentWithNullableToJSONTyped,
} from './ParentWithNullable';

/**
 * 
 * @export
 * @interface ChildWithNullable
 */
export interface ChildWithNullable extends ParentWithNullable {
    /**
     * 
     * @type {string}
     * @memberof ChildWithNullable
     */
    otherProperty?: string;
}



/**
 * Check if a given object implements the ChildWithNullable interface.
 */
export function instanceOfChildWithNullable(value: object): value is ChildWithNullable {
    return true;
}

export function ChildWithNullableFromJSON(json: any): ChildWithNullable {
    return ChildWithNullableFromJSONTyped(json, false);
}

export function ChildWithNullableFromJSONTyped(json: any, ignoreDiscriminator: boolean): ChildWithNullable {
    if (json == null) {
        return json;
    }
    return {
        ...ParentWithNullableFromJSONTyped(json, true),
        'otherProperty': json['otherProperty'] == null ? undefined : json['otherProperty'],
    };
}

export function ChildWithNullableToJSON(json: any): ChildWithNullable {
    return ChildWithNullableToJSONTyped(json, false);
}

export function ChildWithNullableToJSONTyped(value?: ChildWithNullable | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        ...ParentWithNullableToJSONTyped(value, true),
        'otherProperty': value['otherProperty'],
    };
}

