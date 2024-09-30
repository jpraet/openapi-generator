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

extension Bool: JSONEncodable {
    func encodeToJSON() -> Any { self }
}

extension Float: JSONEncodable {
    func encodeToJSON() -> Any { self }
}

extension Int: JSONEncodable {
    func encodeToJSON() -> Any { self }
}

extension Int32: JSONEncodable {
    func encodeToJSON() -> Any { self }
}

extension Int64: JSONEncodable {
    func encodeToJSON() -> Any { self }
}

extension Double: JSONEncodable {
    func encodeToJSON() -> Any { self }
}

extension Decimal: JSONEncodable {
    func encodeToJSON() -> Any { self }
}

extension String: JSONEncodable {
    func encodeToJSON() -> Any { self }
}

extension URL: JSONEncodable {
    func encodeToJSON() -> Any { self }
}

extension UUID: JSONEncodable {
    func encodeToJSON() -> Any { self }
}

extension RawRepresentable where RawValue: JSONEncodable {
    func encodeToJSON() -> Any { return self.rawValue }
}

private func encodeIfPossible<T>(_ object: T) -> Any {
    if let encodableObject = object as? JSONEncodable {
        return encodableObject.encodeToJSON()
    } else {
        return object
    }
}

extension Array: JSONEncodable {
    func encodeToJSON() -> Any {
        return self.map(encodeIfPossible)
    }
}

extension Set: JSONEncodable {
    func encodeToJSON() -> Any {
        return Array(self).encodeToJSON()
    }
}

extension Dictionary: JSONEncodable {
    func encodeToJSON() -> Any {
        var dictionary = [AnyHashable: Any]()
        for (key, value) in self {
            dictionary[key] = encodeIfPossible(value)
        }
        return dictionary
    }
}

extension Data: JSONEncodable {
    func encodeToJSON() -> Any {
        return self.base64EncodedString(options: Data.Base64EncodingOptions())
    }
}

extension Date: JSONEncodable {
    func encodeToJSON() -> Any {
        return CodableHelper.shared.dateFormatter.string(from: self)
    }
}

extension JSONEncodable where Self: Encodable {
    func encodeToJSON() -> Any {
        guard let data = try? CodableHelper.shared.jsonEncoder.encode(self) else {
            fatalError("Could not encode to json: \(self)")
        }
        return data.encodeToJSON()
    }
}

extension HTTPURLResponse {
    var isStatusCodeSuccessful: Bool {
        return PetstoreClientAPI.shared.successfulStatusCodeRange.contains(statusCode)
    }
}
