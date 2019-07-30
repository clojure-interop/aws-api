(ns com.amazonaws.Protocol
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws Protocol]))

(def HTTP
  "Enum Constant.

  HTTP Protocol - Using the HTTP protocol is less secure than HTTPS, but
   can slightly reduce the system resources used when communicating with
   AWS.

  type: com.amazonaws.Protocol"
  Protocol/HTTP)

(def HTTPS
  "Enum Constant.

  HTTPS Protocol - Using the HTTPS protocol is more secure than using the
   HTTP protocol, but may use slightly more system resources. AWS recommends
   using HTTPS for maximize security.

  type: com.amazonaws.Protocol"
  Protocol/HTTPS)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Protocol c : Protocol.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.amazonaws.Protocol[]`"
  ([]
    (Protocol/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.amazonaws.Protocol`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.amazonaws.Protocol [^java.lang.String name]
    (Protocol/valueOf name)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Protocol this]
    (-> this (.toString))))

