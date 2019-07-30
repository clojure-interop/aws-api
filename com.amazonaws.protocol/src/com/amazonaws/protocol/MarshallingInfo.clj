(ns com.amazonaws.protocol.MarshallingInfo
  "Metadata about the marshalling requirements of a given member. Includes things like where to put the
  data (payload, query, etc), the location name it's bound to (JSON field name, query param name, etc)
  and additional directives about how to transform it (i.e. is it binary data, should it be auto generated, etc)."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.protocol MarshallingInfo]))

(defn *builder
  "marshalling-type - `com.amazonaws.protocol.MarshallingType`

  returns: Builder instance to construct a MarshallingInfo. - `<T> com.amazonaws.protocol.MarshallingInfo$Builder<T>`"
  ([^com.amazonaws.protocol.MarshallingType marshalling-type]
    (MarshallingInfo/builder marshalling-type)))

(defn marshalling-type
  "returns: MarshallingType for this member. - `com.amazonaws.protocol.MarshallingType<T>`"
  (^com.amazonaws.protocol.MarshallingType [^MarshallingInfo this]
    (-> this (.marshallingType))))

(defn marshall-location-name
  "returns: Marshall location name. This may represent different things depending on where the data is meant to be marshalled
   to. For data bound to the payload, this may be the JSON field name, for data bound to the query params this will be the
   parameter name, for data bound to the path this will be the value of the path placeholder to replace in the request URI.
   Note that it may be null for explicit payload members. - `java.lang.String`"
  (^java.lang.String [^MarshallingInfo this]
    (-> this (.marshallLocationName))))

(defn marshall-location
  "returns: Where the data should be marshalled to. - `com.amazonaws.protocol.MarshallLocation`"
  (^com.amazonaws.protocol.MarshallLocation [^MarshallingInfo this]
    (-> this (.marshallLocation))))

(defn explicit-payload-member?
  "returns: True if the member is explicitly bound to the payload. Applicable only for RESTFUL services. - `boolean`"
  (^Boolean [^MarshallingInfo this]
    (-> this (.isExplicitPayloadMember))))

(defn binary?
  "returns: True if the payload member is binary data (i.e. a ByteBuffer or InputStream and
   should be sent as the request content. This is not true when binary data is bound to a member of the JSON payload since it
   will be base64 encoded as a string. - `boolean`"
  (^Boolean [^MarshallingInfo this]
    (-> this (.isBinary))))

(defn default-value-supplier
  "returns: Optional supplier of default value if the value to marshall is null. - `com.amazonaws.protocol.DefaultValueSupplier<T>`"
  (^com.amazonaws.protocol.DefaultValueSupplier [^MarshallingInfo this]
    (-> this (.defaultValueSupplier))))

(defn timestamp-format
  "returns: Optional timestampFormat if the value type is date - `com.amazonaws.util.TimestampFormat`"
  (^com.amazonaws.util.TimestampFormat [^MarshallingInfo this]
    (-> this (.timestampFormat))))

