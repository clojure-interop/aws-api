(ns com.amazonaws.protocol.ProtocolRequestMarshaller
  "Interface used by generated marshallers to transform a Java POJO in a Request object which represents an HTTP request.

  Example Usage:


  ProtocolRequestMarshaller<FooRequest> = createProtocolMarshaller(...);
  protocolMarshaller.startMarshalling();
  protocolMarshaller.marshall(obj, marshallingInfo);
  Request<FooRequest> marshalledRequest = protocolMarshaller.finishMarshalling();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.protocol ProtocolRequestMarshaller]))

(defn start-marshalling
  "Hook to perform an initialization that needs to happen at the start of marshalling. Must be called before
   any call to ProtocolMarshaller.marshall(Object, MarshallingInfo)."
  ([^ProtocolRequestMarshaller this]
    (-> this (.startMarshalling))))

(defn finish-marshalling
  "Finializes the marshalling and produces a Request object that can be sent for execution. Must be the last
   method called in the marshaller.

  returns: Marshalled Request object. - `com.amazonaws.Request<OrigRequest>`"
  (^com.amazonaws.Request [^ProtocolRequestMarshaller this]
    (-> this (.finishMarshalling))))

