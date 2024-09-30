<?php
/**
 * EnumWithNameAndDescription
 *
 * PHP version 7.4
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://openapi-generator.tech
 * Generator version: 7.9.0-SNAPSHOT
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;
use \OpenAPI\Client\ObjectSerializer;

/**
 * EnumWithNameAndDescription Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class EnumWithNameAndDescription
{
    /**
     * Possible values of this enum
     */
    /**
     * The word one
     */
    public const ONE = 1;

    /**
     * The digit two
     */
    public const NUMBER_2 = 2;

    /**
     * The digit three prefixed by a space
     */
    public const _3 = 3;

    public const NUMBER_4 = 4;

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::ONE,
            self::NUMBER_2,
            self::_3,
            self::NUMBER_4
        ];
    }
}


