/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.10.0-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * DefaultApi.h
 *
 * 
 */

#ifndef DefaultApi_H_
#define DefaultApi_H_


#include <memory>
#include <utility>
#include <exception>
#include <functional>

#include <corvusoft/restbed/session.hpp>
#include <corvusoft/restbed/resource.hpp>
#include <corvusoft/restbed/request.hpp>
#include <corvusoft/restbed/service.hpp>
#include <corvusoft/restbed/settings.hpp>

#include "_foo_get_default_response.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

///
/// Exception to flag problems in the handlers
///
class  DefaultApiException: public std::exception
{
public:
    DefaultApiException(int status_code, std::string what);

    int getStatus() const;
    const char* what() const noexcept override;

private:
    int m_status;
    std::string m_what;
};

namespace DefaultApiResources {
/// <summary>
/// 
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  FooResource: public restbed::Resource
{
public:
    FooResource(const std::string& context = "/v2");
    virtual ~FooResource() = default;

    FooResource(
        const FooResource& other) = default; // copy constructor
    FooResource(FooResource&& other) noexcept = default; // move constructor

    FooResource& operator=(const FooResource& other) = default; // copy assignment
    FooResource& operator=(FooResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, _foo_get_default_response>(
        )> handler_GET_func =
            []() -> std::pair<int, _foo_get_default_response>
                { throw DefaultApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, _foo_get_default_response> handler_GET(
        );


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleDefaultApiException(const DefaultApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);

    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, std::multimap<std::string, std::string>& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_GET_internal(const std::shared_ptr<restbed::Session> session);
};

} /* namespace DefaultApiResources */

using DefaultApiFooResource [[deprecated]] = DefaultApiResources::FooResource;

//
// The restbed service to actually implement the REST server
//
class  DefaultApi
{
public:
    explicit DefaultApi(std::shared_ptr<restbed::Service> const& restbedService);
    virtual ~DefaultApi();

    std::shared_ptr<DefaultApiResources::FooResource> getFooResource();

    void setResource(std::shared_ptr<DefaultApiResources::FooResource> resource);
    [[deprecated("use setResource()")]]
    virtual void setDefaultApiFooResource(std::shared_ptr<DefaultApiResources::FooResource> spDefaultApiFooResource);

    virtual void publishDefaultResources();

    virtual std::shared_ptr<restbed::Service> service();

protected:
    std::shared_ptr<DefaultApiResources::FooResource> m_spFooResource;

private:
    std::shared_ptr<restbed::Service> m_service;
};


}
}
}
}

#endif /* DefaultApi_H_ */

