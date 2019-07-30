(ns com.amazonaws.util.Base64
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util Base64]))

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Base64 c : Base64.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.amazonaws.util.Base64[]`"
  ([]
    (Base64/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.amazonaws.util.Base64`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.amazonaws.util.Base64 [^java.lang.String name]
    (Base64/valueOf name)))

(defn *encode-as-string
  "Returns a base 64 encoded string of the given bytes.

  bytes - `byte`

  returns: `java.lang.String`"
  (^java.lang.String [^Byte bytes]
    (Base64/encodeAsString bytes)))

(defn *encode
  "Returns a 64 encoded byte array of the given bytes.

  bytes - `byte[]`

  returns: `byte[]`"
  ([bytes]
    (Base64/encode bytes)))

(defn *decode
  "Decodes the given base 64 encoded string,
   skipping carriage returns, line feeds and spaces as needed.

  b-64 - `java.lang.String`

  returns: `byte[]`"
  ([^java.lang.String b-64]
    (Base64/decode b-64)))

