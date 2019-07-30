(ns com.amazonaws.protocol.ProtocolMarshaller
  "Interface used by generated marshallers to marshall a Java POJO."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.protocol ProtocolMarshaller]))

(defn marshall
  "Marshalls the value into the appropriate location based on the MarshallingInfo metadata.

  val - Value to marshall. May be null if the location allows it (for example, members bound to the path must never be null or empty). - `T`
  marshalling-info - Metadata about how and where to marshall the data. Must not be null. - `com.amazonaws.protocol.MarshallingInfo`

  returns: `<T> void`

  throws: com.amazonaws.SdkClientException - If invalid parameters or combination of parameters are provided (I.E. null value provided for member bound to the path)."
  ([^ProtocolMarshaller this val ^com.amazonaws.protocol.MarshallingInfo marshalling-info]
    (-> this (.marshall val marshalling-info))))

