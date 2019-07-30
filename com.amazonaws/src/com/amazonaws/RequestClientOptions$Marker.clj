(ns com.amazonaws.RequestClientOptions$Marker
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws RequestClientOptions$Marker]))

(def USER_AGENT
  "Enum Constant.

  Used to specify the http user_agent value.
   This marker is intended only for internal use by the AWS SDK.

  type: com.amazonaws.RequestClientOptions$Marker"
  RequestClientOptions$Marker/USER_AGENT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (RequestClientOptions.Marker c : RequestClientOptions.Marker.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.amazonaws.RequestClientOptions$Marker[]`"
  ([]
    (RequestClientOptions$Marker/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.amazonaws.RequestClientOptions$Marker`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.amazonaws.RequestClientOptions$Marker [^java.lang.String name]
    (RequestClientOptions$Marker/valueOf name)))

