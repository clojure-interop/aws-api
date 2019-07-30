(ns com.amazonaws.protocol.MarshallingInfo$Builder
  "Builder for a MarshallingInfo."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.protocol MarshallingInfo$Builder]))

(defn marshall-location-name
  "marshall-location-name - `java.lang.String`

  returns: `com.amazonaws.protocol.MarshallingInfo$Builder<T>`"
  (^com.amazonaws.protocol.MarshallingInfo$Builder [^MarshallingInfo$Builder this ^java.lang.String marshall-location-name]
    (-> this (.marshallLocationName marshall-location-name))))

(defn marshall-location
  "marshall-location - `com.amazonaws.protocol.MarshallLocation`

  returns: `com.amazonaws.protocol.MarshallingInfo$Builder<T>`"
  (^com.amazonaws.protocol.MarshallingInfo$Builder [^MarshallingInfo$Builder this ^com.amazonaws.protocol.MarshallLocation marshall-location]
    (-> this (.marshallLocation marshall-location))))

(defn is-explicit-payload-member
  "is-explicit-payload-member - `boolean`

  returns: `com.amazonaws.protocol.MarshallingInfo$Builder<T>`"
  (^com.amazonaws.protocol.MarshallingInfo$Builder [^MarshallingInfo$Builder this ^Boolean is-explicit-payload-member]
    (-> this (.isExplicitPayloadMember is-explicit-payload-member))))

(defn is-binary
  "is-binary - `boolean`

  returns: `com.amazonaws.protocol.MarshallingInfo$Builder<T>`"
  (^com.amazonaws.protocol.MarshallingInfo$Builder [^MarshallingInfo$Builder this ^Boolean is-binary]
    (-> this (.isBinary is-binary))))

(defn default-value-supplier
  "default-value-supplier - `com.amazonaws.protocol.DefaultValueSupplier`

  returns: `com.amazonaws.protocol.MarshallingInfo$Builder<T>`"
  (^com.amazonaws.protocol.MarshallingInfo$Builder [^MarshallingInfo$Builder this ^com.amazonaws.protocol.DefaultValueSupplier default-value-supplier]
    (-> this (.defaultValueSupplier default-value-supplier))))

(defn timestamp-format
  "timestamp-format - `java.lang.String`

  returns: `com.amazonaws.protocol.MarshallingInfo$Builder<T>`"
  (^com.amazonaws.protocol.MarshallingInfo$Builder [^MarshallingInfo$Builder this ^java.lang.String timestamp-format]
    (-> this (.timestampFormat timestamp-format))))

(defn build
  "returns: An immutable MarshallingInfo object. - `com.amazonaws.protocol.MarshallingInfo<T>`"
  (^com.amazonaws.protocol.MarshallingInfo [^MarshallingInfo$Builder this]
    (-> this (.build))))

