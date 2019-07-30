(ns com.amazonaws.protocol.Protocol
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.protocol Protocol]))

(def AWS_JSON
  "Enum Constant.

  RPC protocol that sends all data in the payload as JSON and sends the X-Amz-Target header to indicate the
   operation to invoke.

  type: com.amazonaws.protocol.Protocol"
  Protocol/AWS_JSON)

(def REST_JSON
  "Enum Constant.

  Protocol that supports RESTful bindings. Members can be bound to the headers, query params, path, or payload. Supports
   binary and streaming data. Operation is identified by HTTP verb and resource path combination.

  type: com.amazonaws.protocol.Protocol"
  Protocol/REST_JSON)

(def API_GATEWAY
  "Enum Constant.

  A variation of REST_JSON for externally generated, API Gateway clients.

  type: com.amazonaws.protocol.Protocol"
  Protocol/API_GATEWAY)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Protocol c : Protocol.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.amazonaws.protocol.Protocol[]`"
  ([]
    (Protocol/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.amazonaws.protocol.Protocol`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.amazonaws.protocol.Protocol [^java.lang.String name]
    (Protocol/valueOf name)))

