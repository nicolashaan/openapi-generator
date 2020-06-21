# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule OpenapiPetstore.Model.OuterComposite do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"my_number",
    :"my_string",
    :"my_boolean"
  ]

  @type t :: %__MODULE__{
    :"my_number" => float() | nil,
    :"my_string" => String.t | nil,
    :"my_boolean" => boolean() | nil
  }
end

defimpl Poison.Decoder, for: OpenapiPetstore.Model.OuterComposite do
  def decode(value, _options) do
    value
  end
end
