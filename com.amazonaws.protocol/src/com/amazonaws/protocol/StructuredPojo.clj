(ns com.amazonaws.protocol.StructuredPojo
  "Interface implemented by model classes so that they may marshaller themselves."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.protocol StructuredPojo]))

(defn marshall
  "Marshalls this structured data using the given ProtocolMarshaller.

  protocol-marshaller - Implementation of ProtocolMarshaller used to marshall this object's data. - `com.amazonaws.protocol.ProtocolMarshaller`"
  ([^StructuredPojo this ^com.amazonaws.protocol.ProtocolMarshaller protocol-marshaller]
    (-> this (.marshall protocol-marshaller))))

