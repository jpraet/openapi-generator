# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""Category
A category for a pet

    Category(;
        id=nothing,
        name=nothing,
    )

    - id::Int64
    - name::String
"""
Base.@kwdef mutable struct Category <: OpenAPI.APIModel
    id::Union{Nothing, Int64} = nothing
    name::Union{Nothing, String} = nothing

    function Category(id, name, )
        OpenAPI.validate_property(Category, Symbol("id"), id)
        OpenAPI.validate_property(Category, Symbol("name"), name)
        return new(id, name, )
    end
end # type Category

const _property_types_Category = Dict{Symbol,String}(Symbol("id")=>"Int64", Symbol("name")=>"String", )
OpenAPI.property_type(::Type{ Category }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_Category[name]))}

function check_required(o::Category)
    true
end

function OpenAPI.validate_property(::Type{ Category }, name::Symbol, val)

    if name === Symbol("id")
        OpenAPI.validate_param(name, "Category", :format, val, "int64")
    end

    if name === Symbol("name")
        OpenAPI.validate_param(name, "Category", :pattern, val, r"^[a-zA-Z0-9]+[a-zA-Z0-9\.\-_]*[a-zA-Z0-9]+$")
    end
end
