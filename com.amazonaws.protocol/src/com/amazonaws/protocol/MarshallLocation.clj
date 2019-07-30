(ns com.amazonaws.protocol.MarshallLocation
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.protocol MarshallLocation]))

(def PAYLOAD
  "Enum Constant.

  Payload of the request (format depends on the protocol/content-type)

  type: com.amazonaws.protocol.MarshallLocation"
  MarshallLocation/PAYLOAD)

(def QUERY_PARAM
  "Enum Constant.

  Add as a query parameter.

  type: com.amazonaws.protocol.MarshallLocation"
  MarshallLocation/QUERY_PARAM)

(def HEADER
  "Enum Constant.

  HTTP header.

  type: com.amazonaws.protocol.MarshallLocation"
  MarshallLocation/HEADER)

(def PATH
  "Enum Constant.

  Replace the placeholder in the request URI (non-greedy).

  type: com.amazonaws.protocol.MarshallLocation"
  MarshallLocation/PATH)

(def GREEDY_PATH
  "Enum Constant.

  Replace the placeholder in the request URI (greedy). This location is really the same as PATH,
   the only difference is whether it's URL encoded or not. Members bound to the PATH will be URL
   encoded before replacing, members bound to GREEDY_PATH will not be URL encoded.

  type: com.amazonaws.protocol.MarshallLocation"
  MarshallLocation/GREEDY_PATH)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (MarshallLocation c : MarshallLocation.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.amazonaws.protocol.MarshallLocation[]`"
  ([]
    (MarshallLocation/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.amazonaws.protocol.MarshallLocation`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.amazonaws.protocol.MarshallLocation [^java.lang.String name]
    (MarshallLocation/valueOf name)))

