// Extensions.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(FoundationNetworking)
import FoundationNetworking
#endif
#if canImport(AnyCodable)
import AnyCodable
#endif
import Vapor

extension String: @retroactive CodingKey {

    public var stringValue: String {
        return self
    }

    public init?(stringValue: String) {
        self.init(stringLiteral: stringValue)
    }

    public var intValue: Int? {
        return nil
    }

    public init?(intValue: Int) {
        return nil
    }

}

extension KeyedEncodingContainerProtocol {

    public mutating func encodeArray<T>(_ values: [T], forKey key: Self.Key) throws where T: Encodable {
        var arrayContainer = nestedUnkeyedContainer(forKey: key)
        try arrayContainer.encode(contentsOf: values)
    }

    public mutating func encodeArrayIfPresent<T>(_ values: [T]?, forKey key: Self.Key) throws where T: Encodable {
        if let values = values {
            try encodeArray(values, forKey: key)
        }
    }

    public mutating func encodeMap<T>(_ pairs: [Self.Key: T]) throws where T: Encodable {
        for (key, value) in pairs {
            try encode(value, forKey: key)
        }
    }

    public mutating func encodeMapIfPresent<T>(_ pairs: [Self.Key: T]?) throws where T: Encodable {
        if let pairs = pairs {
            try encodeMap(pairs)
        }
    }

    public mutating func encode(_ value: Decimal, forKey key: Self.Key) throws {
        let decimalNumber = NSDecimalNumber(decimal: value)
        let numberFormatter = NumberFormatter()
        numberFormatter.numberStyle = .decimal
        numberFormatter.locale = Locale(identifier: "en_US")
        let formattedString = numberFormatter.string(from: decimalNumber) ?? "\(value)"
        try encode(formattedString, forKey: key)
    }

    public mutating func encodeIfPresent(_ value: Decimal?, forKey key: Self.Key) throws {
        if let value = value {
            try encode(value, forKey: key)
        }
    }
}

extension KeyedDecodingContainerProtocol {

    public func decodeArray<T>(_ type: T.Type, forKey key: Self.Key) throws -> [T] where T: Decodable {
        var tmpArray = [T]()

        var nestedContainer = try nestedUnkeyedContainer(forKey: key)
        while !nestedContainer.isAtEnd {
            let arrayValue = try nestedContainer.decode(T.self)
            tmpArray.append(arrayValue)
        }

        return tmpArray
    }

    public func decodeArrayIfPresent<T>(_ type: T.Type, forKey key: Self.Key) throws -> [T]? where T: Decodable {
        var tmpArray: [T]?

        if contains(key) {
            tmpArray = try decodeArray(T.self, forKey: key)
        }

        return tmpArray
    }

    public func decodeMap<T>(_ type: T.Type, excludedKeys: Set<Self.Key>) throws -> [Self.Key: T] where T: Decodable {
        var map: [Self.Key: T] = [:]

        for key in allKeys {
            if !excludedKeys.contains(key) {
                let value = try decode(T.self, forKey: key)
                map[key] = value
            }
        }

        return map
    }

    public func decode(_ type: Decimal.Type, forKey key: Self.Key) throws -> Decimal {
        let stringValue = try decode(String.self, forKey: key)
        guard let decimalValue = Decimal(string: stringValue) else {
            let context = DecodingError.Context(codingPath: [key], debugDescription: "The key \(key) couldn't be converted to a Decimal value")
            throw DecodingError.typeMismatch(type, context)
        }

        return decimalValue
    }

    public func decodeIfPresent(_ type: Decimal.Type, forKey key: Self.Key) throws -> Decimal? {
        guard let stringValue = try decodeIfPresent(String.self, forKey: key) else {
            return nil
        }
        guard let decimalValue = Decimal(string: stringValue) else {
            let context = DecodingError.Context(codingPath: [key], debugDescription: "The key \(key) couldn't be converted to a Decimal value")
            throw DecodingError.typeMismatch(type, context)
        }

        return decimalValue
    }

}

extension UUID: Content { }

extension URL: Content { }

extension Bool: Content { }

extension Set: ResponseEncodable where Element: Content {
    public func encodeResponse(for request: Vapor.Request) -> EventLoopFuture<Vapor.Response> {
        let response = Vapor.Response()
        do {
            try response.content.encode(Array(self))
        } catch {
            return request.eventLoop.makeFailedFuture(error)
        }
        return request.eventLoop.makeSucceededFuture(response)
    }
}

extension Set: RequestDecodable where Element: Content {
    public static func decodeRequest(_ request: Vapor.Request) -> EventLoopFuture<Self> {
        do {
            let content = try request.content.decode([Element].self)
            return request.eventLoop.makeSucceededFuture(Set(content))
        } catch {
            return request.eventLoop.makeFailedFuture(error)
        }
    }
}

extension Set: Content where Element: Content { }

extension AnyCodable: Content {}
